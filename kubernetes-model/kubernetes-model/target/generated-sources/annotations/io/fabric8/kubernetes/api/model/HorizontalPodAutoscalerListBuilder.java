package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HorizontalPodAutoscalerListBuilder extends HorizontalPodAutoscalerListFluentImpl<HorizontalPodAutoscalerListBuilder> implements VisitableBuilder<HorizontalPodAutoscalerList,HorizontalPodAutoscalerListBuilder>{

    HorizontalPodAutoscalerListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HorizontalPodAutoscalerListBuilder(){
            this(true);
    }
    public HorizontalPodAutoscalerListBuilder(Boolean validationEnabled){
            this(new HorizontalPodAutoscalerList(), validationEnabled);
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerListFluent<?> fluent){
            this(fluent, true);
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HorizontalPodAutoscalerList(), validationEnabled);
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerListFluent<?> fluent,HorizontalPodAutoscalerList instance){
            this(fluent, instance, true);
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerListFluent<?> fluent,HorizontalPodAutoscalerList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerList instance){
            this(instance,true);
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public HorizontalPodAutoscalerListBuilder(Validator validator){
            this(new HorizontalPodAutoscalerList(), true);
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerListFluent<?> fluent,HorizontalPodAutoscalerList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HorizontalPodAutoscalerListBuilder(HorizontalPodAutoscalerList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HorizontalPodAutoscalerList build(){
            HorizontalPodAutoscalerList buildable = new HorizontalPodAutoscalerList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HorizontalPodAutoscalerListBuilder that = (HorizontalPodAutoscalerListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
