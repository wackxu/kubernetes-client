package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceValidationBuilder extends CustomResourceValidationFluentImpl<CustomResourceValidationBuilder> implements VisitableBuilder<CustomResourceValidation,CustomResourceValidationBuilder>{

    CustomResourceValidationFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceValidationBuilder(){
            this(true);
    }
    public CustomResourceValidationBuilder(Boolean validationEnabled){
            this(new CustomResourceValidation(), validationEnabled);
    }
    public CustomResourceValidationBuilder(CustomResourceValidationFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceValidationBuilder(CustomResourceValidationFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceValidation(), validationEnabled);
    }
    public CustomResourceValidationBuilder(CustomResourceValidationFluent<?> fluent,CustomResourceValidation instance){
            this(fluent, instance, true);
    }
    public CustomResourceValidationBuilder(CustomResourceValidationFluent<?> fluent,CustomResourceValidation instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withOpenAPIV3Schema(instance.getOpenAPIV3Schema()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceValidationBuilder(CustomResourceValidation instance){
            this(instance,true);
    }
    public CustomResourceValidationBuilder(CustomResourceValidation instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceValidationBuilder(Validator validator){
            this(new CustomResourceValidation(), true);
    }
    public CustomResourceValidationBuilder(CustomResourceValidationFluent<?> fluent,CustomResourceValidation instance,Validator validator){
            this.fluent = fluent; 
            fluent.withOpenAPIV3Schema(instance.getOpenAPIV3Schema()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceValidationBuilder(CustomResourceValidation instance,Validator validator){
            this.fluent = this; 
            this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceValidation build(){
            CustomResourceValidation buildable = new CustomResourceValidation(fluent.getOpenAPIV3Schema());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceValidationBuilder that = (CustomResourceValidationBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
