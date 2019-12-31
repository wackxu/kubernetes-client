package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceSubresourceScaleBuilder extends CustomResourceSubresourceScaleFluentImpl<CustomResourceSubresourceScaleBuilder> implements VisitableBuilder<CustomResourceSubresourceScale,CustomResourceSubresourceScaleBuilder>{

    CustomResourceSubresourceScaleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceSubresourceScaleBuilder(){
            this(true);
    }
    public CustomResourceSubresourceScaleBuilder(Boolean validationEnabled){
            this(new CustomResourceSubresourceScale(), validationEnabled);
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScaleFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScaleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceSubresourceScale(), validationEnabled);
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScaleFluent<?> fluent,CustomResourceSubresourceScale instance){
            this(fluent, instance, true);
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScaleFluent<?> fluent,CustomResourceSubresourceScale instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLabelSelectorPath(instance.getLabelSelectorPath()); 
            fluent.withSpecReplicasPath(instance.getSpecReplicasPath()); 
            fluent.withStatusReplicasPath(instance.getStatusReplicasPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScale instance){
            this(instance,true);
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScale instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLabelSelectorPath(instance.getLabelSelectorPath()); 
            this.withSpecReplicasPath(instance.getSpecReplicasPath()); 
            this.withStatusReplicasPath(instance.getStatusReplicasPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceSubresourceScaleBuilder(Validator validator){
            this(new CustomResourceSubresourceScale(), true);
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScaleFluent<?> fluent,CustomResourceSubresourceScale instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLabelSelectorPath(instance.getLabelSelectorPath()); 
            fluent.withSpecReplicasPath(instance.getSpecReplicasPath()); 
            fluent.withStatusReplicasPath(instance.getStatusReplicasPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceSubresourceScaleBuilder(CustomResourceSubresourceScale instance,Validator validator){
            this.fluent = this; 
            this.withLabelSelectorPath(instance.getLabelSelectorPath()); 
            this.withSpecReplicasPath(instance.getSpecReplicasPath()); 
            this.withStatusReplicasPath(instance.getStatusReplicasPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceSubresourceScale build(){
            CustomResourceSubresourceScale buildable = new CustomResourceSubresourceScale(fluent.getLabelSelectorPath(),fluent.getSpecReplicasPath(),fluent.getStatusReplicasPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceSubresourceScaleBuilder that = (CustomResourceSubresourceScaleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
