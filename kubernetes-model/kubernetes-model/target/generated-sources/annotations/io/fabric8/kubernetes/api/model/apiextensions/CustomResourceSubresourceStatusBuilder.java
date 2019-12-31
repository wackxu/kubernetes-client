package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceSubresourceStatusBuilder extends CustomResourceSubresourceStatusFluentImpl<CustomResourceSubresourceStatusBuilder> implements VisitableBuilder<CustomResourceSubresourceStatus,CustomResourceSubresourceStatusBuilder>{

    CustomResourceSubresourceStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceSubresourceStatusBuilder(){
            this(true);
    }
    public CustomResourceSubresourceStatusBuilder(Boolean validationEnabled){
            this(new CustomResourceSubresourceStatus(), validationEnabled);
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatusFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceSubresourceStatus(), validationEnabled);
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatusFluent<?> fluent,CustomResourceSubresourceStatus instance){
            this(fluent, instance, true);
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatusFluent<?> fluent,CustomResourceSubresourceStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatus instance){
            this(instance,true);
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceSubresourceStatusBuilder(Validator validator){
            this(new CustomResourceSubresourceStatus(), true);
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatusFluent<?> fluent,CustomResourceSubresourceStatus instance,Validator validator){
            this.fluent = fluent; 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceSubresourceStatusBuilder(CustomResourceSubresourceStatus instance,Validator validator){
            this.fluent = this; 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceSubresourceStatus build(){
            CustomResourceSubresourceStatus buildable = new CustomResourceSubresourceStatus();
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceSubresourceStatusBuilder that = (CustomResourceSubresourceStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
