package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceSubresourcesBuilder extends CustomResourceSubresourcesFluentImpl<CustomResourceSubresourcesBuilder> implements VisitableBuilder<CustomResourceSubresources,CustomResourceSubresourcesBuilder>{

    CustomResourceSubresourcesFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceSubresourcesBuilder(){
            this(true);
    }
    public CustomResourceSubresourcesBuilder(Boolean validationEnabled){
            this(new CustomResourceSubresources(), validationEnabled);
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresourcesFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresourcesFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceSubresources(), validationEnabled);
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresourcesFluent<?> fluent,CustomResourceSubresources instance){
            this(fluent, instance, true);
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresourcesFluent<?> fluent,CustomResourceSubresources instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withScale(instance.getScale()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresources instance){
            this(instance,true);
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresources instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withScale(instance.getScale()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceSubresourcesBuilder(Validator validator){
            this(new CustomResourceSubresources(), true);
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresourcesFluent<?> fluent,CustomResourceSubresources instance,Validator validator){
            this.fluent = fluent; 
            fluent.withScale(instance.getScale()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceSubresourcesBuilder(CustomResourceSubresources instance,Validator validator){
            this.fluent = this; 
            this.withScale(instance.getScale()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceSubresources build(){
            CustomResourceSubresources buildable = new CustomResourceSubresources(fluent.getScale(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceSubresourcesBuilder that = (CustomResourceSubresourcesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
