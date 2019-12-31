package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodConditionBuilder extends PodConditionFluentImpl<PodConditionBuilder> implements VisitableBuilder<PodCondition,PodConditionBuilder>{

    PodConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodConditionBuilder(){
            this(true);
    }
    public PodConditionBuilder(Boolean validationEnabled){
            this(new PodCondition(), validationEnabled);
    }
    public PodConditionBuilder(PodConditionFluent<?> fluent){
            this(fluent, true);
    }
    public PodConditionBuilder(PodConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodCondition(), validationEnabled);
    }
    public PodConditionBuilder(PodConditionFluent<?> fluent,PodCondition instance){
            this(fluent, instance, true);
    }
    public PodConditionBuilder(PodConditionFluent<?> fluent,PodCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodConditionBuilder(PodCondition instance){
            this(instance,true);
    }
    public PodConditionBuilder(PodCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodConditionBuilder(Validator validator){
            this(new PodCondition(), true);
    }
    public PodConditionBuilder(PodConditionFluent<?> fluent,PodCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodConditionBuilder(PodCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodCondition build(){
            PodCondition buildable = new PodCondition(fluent.getLastProbeTime(),fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodConditionBuilder that = (PodConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
