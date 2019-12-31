package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HorizontalPodAutoscalerBuilder extends HorizontalPodAutoscalerFluentImpl<HorizontalPodAutoscalerBuilder> implements VisitableBuilder<HorizontalPodAutoscaler,HorizontalPodAutoscalerBuilder>{

    HorizontalPodAutoscalerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HorizontalPodAutoscalerBuilder(){
            this(true);
    }
    public HorizontalPodAutoscalerBuilder(Boolean validationEnabled){
            this(new HorizontalPodAutoscaler(), validationEnabled);
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscalerFluent<?> fluent){
            this(fluent, true);
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscalerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HorizontalPodAutoscaler(), validationEnabled);
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscalerFluent<?> fluent,HorizontalPodAutoscaler instance){
            this(fluent, instance, true);
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscalerFluent<?> fluent,HorizontalPodAutoscaler instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscaler instance){
            this(instance,true);
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscaler instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerBuilder(Validator validator){
            this(new HorizontalPodAutoscaler(), true);
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscalerFluent<?> fluent,HorizontalPodAutoscaler instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HorizontalPodAutoscalerBuilder(HorizontalPodAutoscaler instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HorizontalPodAutoscaler build(){
            HorizontalPodAutoscaler buildable = new HorizontalPodAutoscaler(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HorizontalPodAutoscalerBuilder that = (HorizontalPodAutoscalerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
