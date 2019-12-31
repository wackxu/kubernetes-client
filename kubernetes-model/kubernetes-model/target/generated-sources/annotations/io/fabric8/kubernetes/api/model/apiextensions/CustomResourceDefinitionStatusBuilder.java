package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceDefinitionStatusBuilder extends CustomResourceDefinitionStatusFluentImpl<CustomResourceDefinitionStatusBuilder> implements VisitableBuilder<CustomResourceDefinitionStatus,CustomResourceDefinitionStatusBuilder>{

    CustomResourceDefinitionStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceDefinitionStatusBuilder(){
            this(true);
    }
    public CustomResourceDefinitionStatusBuilder(Boolean validationEnabled){
            this(new CustomResourceDefinitionStatus(), validationEnabled);
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatusFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceDefinitionStatus(), validationEnabled);
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatusFluent<?> fluent,CustomResourceDefinitionStatus instance){
            this(fluent, instance, true);
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatusFluent<?> fluent,CustomResourceDefinitionStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAcceptedNames(instance.getAcceptedNames()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withStoredVersions(instance.getStoredVersions()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatus instance){
            this(instance,true);
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAcceptedNames(instance.getAcceptedNames()); 
            this.withConditions(instance.getConditions()); 
            this.withStoredVersions(instance.getStoredVersions()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionStatusBuilder(Validator validator){
            this(new CustomResourceDefinitionStatus(), true);
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatusFluent<?> fluent,CustomResourceDefinitionStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAcceptedNames(instance.getAcceptedNames()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withStoredVersions(instance.getStoredVersions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceDefinitionStatusBuilder(CustomResourceDefinitionStatus instance,Validator validator){
            this.fluent = this; 
            this.withAcceptedNames(instance.getAcceptedNames()); 
            this.withConditions(instance.getConditions()); 
            this.withStoredVersions(instance.getStoredVersions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceDefinitionStatus build(){
            CustomResourceDefinitionStatus buildable = new CustomResourceDefinitionStatus(fluent.getAcceptedNames(),fluent.getConditions(),fluent.getStoredVersions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionStatusBuilder that = (CustomResourceDefinitionStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
