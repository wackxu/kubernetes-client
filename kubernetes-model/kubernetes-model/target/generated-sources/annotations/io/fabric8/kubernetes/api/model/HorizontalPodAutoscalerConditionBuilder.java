package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HorizontalPodAutoscalerConditionBuilder extends HorizontalPodAutoscalerConditionFluentImpl<HorizontalPodAutoscalerConditionBuilder> implements VisitableBuilder<HorizontalPodAutoscalerCondition,HorizontalPodAutoscalerConditionBuilder>{

    HorizontalPodAutoscalerConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HorizontalPodAutoscalerConditionBuilder(){
            this(true);
    }
    public HorizontalPodAutoscalerConditionBuilder(Boolean validationEnabled){
            this(new HorizontalPodAutoscalerCondition(), validationEnabled);
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerConditionFluent<?> fluent){
            this(fluent, true);
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HorizontalPodAutoscalerCondition(), validationEnabled);
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerConditionFluent<?> fluent,HorizontalPodAutoscalerCondition instance){
            this(fluent, instance, true);
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerConditionFluent<?> fluent,HorizontalPodAutoscalerCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerCondition instance){
            this(instance,true);
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerConditionBuilder(Validator validator){
            this(new HorizontalPodAutoscalerCondition(), true);
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerConditionFluent<?> fluent,HorizontalPodAutoscalerCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HorizontalPodAutoscalerConditionBuilder(HorizontalPodAutoscalerCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HorizontalPodAutoscalerCondition build(){
            HorizontalPodAutoscalerCondition buildable = new HorizontalPodAutoscalerCondition(fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HorizontalPodAutoscalerConditionBuilder that = (HorizontalPodAutoscalerConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
