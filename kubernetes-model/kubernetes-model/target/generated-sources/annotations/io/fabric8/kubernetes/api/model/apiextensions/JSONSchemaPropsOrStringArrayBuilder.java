package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JSONSchemaPropsOrStringArrayBuilder extends JSONSchemaPropsOrStringArrayFluentImpl<JSONSchemaPropsOrStringArrayBuilder> implements VisitableBuilder<JSONSchemaPropsOrStringArray,JSONSchemaPropsOrStringArrayBuilder>{

    JSONSchemaPropsOrStringArrayFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JSONSchemaPropsOrStringArrayBuilder(){
            this(true);
    }
    public JSONSchemaPropsOrStringArrayBuilder(Boolean validationEnabled){
            this(new JSONSchemaPropsOrStringArray(), validationEnabled);
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArrayFluent<?> fluent){
            this(fluent, true);
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArrayFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JSONSchemaPropsOrStringArray(), validationEnabled);
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArrayFluent<?> fluent,JSONSchemaPropsOrStringArray instance){
            this(fluent, instance, true);
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArrayFluent<?> fluent,JSONSchemaPropsOrStringArray instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withProperty(instance.getProperty()); 
            fluent.withSchema(instance.getSchema()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArray instance){
            this(instance,true);
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArray instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withProperty(instance.getProperty()); 
            this.withSchema(instance.getSchema()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsOrStringArrayBuilder(Validator validator){
            this(new JSONSchemaPropsOrStringArray(), true);
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArrayFluent<?> fluent,JSONSchemaPropsOrStringArray instance,Validator validator){
            this.fluent = fluent; 
            fluent.withProperty(instance.getProperty()); 
            fluent.withSchema(instance.getSchema()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JSONSchemaPropsOrStringArrayBuilder(JSONSchemaPropsOrStringArray instance,Validator validator){
            this.fluent = this; 
            this.withProperty(instance.getProperty()); 
            this.withSchema(instance.getSchema()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JSONSchemaPropsOrStringArray build(){
            JSONSchemaPropsOrStringArray buildable = new JSONSchemaPropsOrStringArray(fluent.getProperty(),fluent.getSchema());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsOrStringArrayBuilder that = (JSONSchemaPropsOrStringArrayBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
