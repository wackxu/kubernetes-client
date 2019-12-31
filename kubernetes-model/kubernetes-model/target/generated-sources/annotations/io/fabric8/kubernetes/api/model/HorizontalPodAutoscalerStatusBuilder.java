package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HorizontalPodAutoscalerStatusBuilder extends HorizontalPodAutoscalerStatusFluentImpl<HorizontalPodAutoscalerStatusBuilder> implements VisitableBuilder<HorizontalPodAutoscalerStatus,HorizontalPodAutoscalerStatusBuilder>{

    HorizontalPodAutoscalerStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HorizontalPodAutoscalerStatusBuilder(){
            this(true);
    }
    public HorizontalPodAutoscalerStatusBuilder(Boolean validationEnabled){
            this(new HorizontalPodAutoscalerStatus(), validationEnabled);
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatusFluent<?> fluent){
            this(fluent, true);
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HorizontalPodAutoscalerStatus(), validationEnabled);
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatusFluent<?> fluent,HorizontalPodAutoscalerStatus instance){
            this(fluent, instance, true);
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatusFluent<?> fluent,HorizontalPodAutoscalerStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withCurrentMetrics(instance.getCurrentMetrics()); 
            fluent.withCurrentReplicas(instance.getCurrentReplicas()); 
            fluent.withDesiredReplicas(instance.getDesiredReplicas()); 
            fluent.withLastScaleTime(instance.getLastScaleTime()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatus instance){
            this(instance,true);
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withCurrentMetrics(instance.getCurrentMetrics()); 
            this.withCurrentReplicas(instance.getCurrentReplicas()); 
            this.withDesiredReplicas(instance.getDesiredReplicas()); 
            this.withLastScaleTime(instance.getLastScaleTime()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerStatusBuilder(Validator validator){
            this(new HorizontalPodAutoscalerStatus(), true);
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatusFluent<?> fluent,HorizontalPodAutoscalerStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withCurrentMetrics(instance.getCurrentMetrics()); 
            fluent.withCurrentReplicas(instance.getCurrentReplicas()); 
            fluent.withDesiredReplicas(instance.getDesiredReplicas()); 
            fluent.withLastScaleTime(instance.getLastScaleTime()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HorizontalPodAutoscalerStatusBuilder(HorizontalPodAutoscalerStatus instance,Validator validator){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withCurrentMetrics(instance.getCurrentMetrics()); 
            this.withCurrentReplicas(instance.getCurrentReplicas()); 
            this.withDesiredReplicas(instance.getDesiredReplicas()); 
            this.withLastScaleTime(instance.getLastScaleTime()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HorizontalPodAutoscalerStatus build(){
            HorizontalPodAutoscalerStatus buildable = new HorizontalPodAutoscalerStatus(fluent.getConditions(),fluent.getCurrentMetrics(),fluent.getCurrentReplicas(),fluent.getDesiredReplicas(),fluent.getLastScaleTime(),fluent.getObservedGeneration());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HorizontalPodAutoscalerStatusBuilder that = (HorizontalPodAutoscalerStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
