package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JSONSchemaPropsOrArrayBuilder extends JSONSchemaPropsOrArrayFluentImpl<JSONSchemaPropsOrArrayBuilder> implements VisitableBuilder<JSONSchemaPropsOrArray,JSONSchemaPropsOrArrayBuilder>{

    JSONSchemaPropsOrArrayFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JSONSchemaPropsOrArrayBuilder(){
            this(true);
    }
    public JSONSchemaPropsOrArrayBuilder(Boolean validationEnabled){
            this(new JSONSchemaPropsOrArray(), validationEnabled);
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArrayFluent<?> fluent){
            this(fluent, true);
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArrayFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JSONSchemaPropsOrArray(), validationEnabled);
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArrayFluent<?> fluent,JSONSchemaPropsOrArray instance){
            this(fluent, instance, true);
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArrayFluent<?> fluent,JSONSchemaPropsOrArray instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withJSONSchemas(instance.getJSONSchemas()); 
            fluent.withSchema(instance.getSchema()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArray instance){
            this(instance,true);
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArray instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withJSONSchemas(instance.getJSONSchemas()); 
            this.withSchema(instance.getSchema()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsOrArrayBuilder(Validator validator){
            this(new JSONSchemaPropsOrArray(), true);
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArrayFluent<?> fluent,JSONSchemaPropsOrArray instance,Validator validator){
            this.fluent = fluent; 
            fluent.withJSONSchemas(instance.getJSONSchemas()); 
            fluent.withSchema(instance.getSchema()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JSONSchemaPropsOrArrayBuilder(JSONSchemaPropsOrArray instance,Validator validator){
            this.fluent = this; 
            this.withJSONSchemas(instance.getJSONSchemas()); 
            this.withSchema(instance.getSchema()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JSONSchemaPropsOrArray build(){
            JSONSchemaPropsOrArray buildable = new JSONSchemaPropsOrArray(fluent.getJSONSchemas(),fluent.getSchema());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsOrArrayBuilder that = (JSONSchemaPropsOrArrayBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
