package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomResourceDefinitionBuilder extends CustomResourceDefinitionFluentImpl<CustomResourceDefinitionBuilder> implements VisitableBuilder<CustomResourceDefinition,CustomResourceDefinitionBuilder>{

    CustomResourceDefinitionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomResourceDefinitionBuilder(){
            this(true);
    }
    public CustomResourceDefinitionBuilder(Boolean validationEnabled){
            this(new CustomResourceDefinition(), validationEnabled);
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinitionFluent<?> fluent){
            this(fluent, true);
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinitionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomResourceDefinition(), validationEnabled);
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinitionFluent<?> fluent,CustomResourceDefinition instance){
            this(fluent, instance, true);
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinitionFluent<?> fluent,CustomResourceDefinition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinition instance){
            this(instance,true);
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomResourceDefinitionBuilder(Validator validator){
            this(new CustomResourceDefinition(), true);
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinitionFluent<?> fluent,CustomResourceDefinition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomResourceDefinitionBuilder(CustomResourceDefinition instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomResourceDefinition build(){
            CustomResourceDefinition buildable = new CustomResourceDefinition(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionBuilder that = (CustomResourceDefinitionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
