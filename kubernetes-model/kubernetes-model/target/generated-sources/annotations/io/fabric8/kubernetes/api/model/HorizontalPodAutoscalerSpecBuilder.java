package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HorizontalPodAutoscalerSpecBuilder extends HorizontalPodAutoscalerSpecFluentImpl<HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<HorizontalPodAutoscalerSpec,HorizontalPodAutoscalerSpecBuilder>{

    HorizontalPodAutoscalerSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HorizontalPodAutoscalerSpecBuilder(){
            this(true);
    }
    public HorizontalPodAutoscalerSpecBuilder(Boolean validationEnabled){
            this(new HorizontalPodAutoscalerSpec(), validationEnabled);
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpecFluent<?> fluent){
            this(fluent, true);
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HorizontalPodAutoscalerSpec(), validationEnabled);
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpecFluent<?> fluent,HorizontalPodAutoscalerSpec instance){
            this(fluent, instance, true);
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpecFluent<?> fluent,HorizontalPodAutoscalerSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMaxReplicas(instance.getMaxReplicas()); 
            fluent.withMetrics(instance.getMetrics()); 
            fluent.withMinReplicas(instance.getMinReplicas()); 
            fluent.withScaleTargetRef(instance.getScaleTargetRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpec instance){
            this(instance,true);
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMaxReplicas(instance.getMaxReplicas()); 
            this.withMetrics(instance.getMetrics()); 
            this.withMinReplicas(instance.getMinReplicas()); 
            this.withScaleTargetRef(instance.getScaleTargetRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerSpecBuilder(Validator validator){
            this(new HorizontalPodAutoscalerSpec(), true);
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpecFluent<?> fluent,HorizontalPodAutoscalerSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMaxReplicas(instance.getMaxReplicas()); 
            fluent.withMetrics(instance.getMetrics()); 
            fluent.withMinReplicas(instance.getMinReplicas()); 
            fluent.withScaleTargetRef(instance.getScaleTargetRef()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HorizontalPodAutoscalerSpecBuilder(HorizontalPodAutoscalerSpec instance,Validator validator){
            this.fluent = this; 
            this.withMaxReplicas(instance.getMaxReplicas()); 
            this.withMetrics(instance.getMetrics()); 
            this.withMinReplicas(instance.getMinReplicas()); 
            this.withScaleTargetRef(instance.getScaleTargetRef()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HorizontalPodAutoscalerSpec build(){
            HorizontalPodAutoscalerSpec buildable = new HorizontalPodAutoscalerSpec(fluent.getMaxReplicas(),fluent.getMetrics(),fluent.getMinReplicas(),fluent.getScaleTargetRef());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HorizontalPodAutoscalerSpecBuilder that = (HorizontalPodAutoscalerSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
