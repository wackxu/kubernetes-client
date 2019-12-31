package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceColumnDefinitionBuilder extends CustomResourceColumnDefinitionFluentImpl<CustomResourceColumnDefinitionBuilder> implements VisitableBuilder<CustomResourceColumnDefinition,CustomResourceColumnDefinitionBuilder>{

    CustomResourceColumnDefinitionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceColumnDefinitionBuilder(){
            this(true);
    }
    public CustomResourceColumnDefinitionBuilder(Boolean validationEnabled){
            this(new CustomResourceColumnDefinition(), validationEnabled);
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinitionFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinitionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceColumnDefinition(), validationEnabled);
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinitionFluent<?> fluent,CustomResourceColumnDefinition instance){
            this(fluent, instance, true);
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinitionFluent<?> fluent,CustomResourceColumnDefinition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withJSONPath(instance.getJSONPath()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withFormat(instance.getFormat()); 
            fluent.withName(instance.getName()); 
            fluent.withPriority(instance.getPriority()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinition instance){
            this(instance,true);
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withJSONPath(instance.getJSONPath()); 
            this.withDescription(instance.getDescription()); 
            this.withFormat(instance.getFormat()); 
            this.withName(instance.getName()); 
            this.withPriority(instance.getPriority()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceColumnDefinitionBuilder(Validator validator){
            this(new CustomResourceColumnDefinition(), true);
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinitionFluent<?> fluent,CustomResourceColumnDefinition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withJSONPath(instance.getJSONPath()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withFormat(instance.getFormat()); 
            fluent.withName(instance.getName()); 
            fluent.withPriority(instance.getPriority()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceColumnDefinitionBuilder(CustomResourceColumnDefinition instance,Validator validator){
            this.fluent = this; 
            this.withJSONPath(instance.getJSONPath()); 
            this.withDescription(instance.getDescription()); 
            this.withFormat(instance.getFormat()); 
            this.withName(instance.getName()); 
            this.withPriority(instance.getPriority()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceColumnDefinition build(){
            CustomResourceColumnDefinition buildable = new CustomResourceColumnDefinition(fluent.getJSONPath(),fluent.getDescription(),fluent.getFormat(),fluent.getName(),fluent.getPriority(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceColumnDefinitionBuilder that = (CustomResourceColumnDefinitionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
