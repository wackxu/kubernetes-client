package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JSONSchemaPropsOrBoolBuilder extends JSONSchemaPropsOrBoolFluentImpl<JSONSchemaPropsOrBoolBuilder> implements VisitableBuilder<JSONSchemaPropsOrBool,JSONSchemaPropsOrBoolBuilder>{

    JSONSchemaPropsOrBoolFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JSONSchemaPropsOrBoolBuilder(){
            this(true);
    }
    public JSONSchemaPropsOrBoolBuilder(Boolean validationEnabled){
            this(new JSONSchemaPropsOrBool(), validationEnabled);
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBoolFluent<?> fluent){
            this(fluent, true);
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBoolFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JSONSchemaPropsOrBool(), validationEnabled);
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBoolFluent<?> fluent,JSONSchemaPropsOrBool instance){
            this(fluent, instance, true);
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBoolFluent<?> fluent,JSONSchemaPropsOrBool instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllows(instance.getAllows()); 
            fluent.withSchema(instance.getSchema()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBool instance){
            this(instance,true);
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBool instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllows(instance.getAllows()); 
            this.withSchema(instance.getSchema()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONSchemaPropsOrBoolBuilder(Validator validator){
            this(new JSONSchemaPropsOrBool(), true);
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBoolFluent<?> fluent,JSONSchemaPropsOrBool instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllows(instance.getAllows()); 
            fluent.withSchema(instance.getSchema()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JSONSchemaPropsOrBoolBuilder(JSONSchemaPropsOrBool instance,Validator validator){
            this.fluent = this; 
            this.withAllows(instance.getAllows()); 
            this.withSchema(instance.getSchema()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JSONSchemaPropsOrBool build(){
            JSONSchemaPropsOrBool buildable = new JSONSchemaPropsOrBool(fluent.isAllows(),fluent.getSchema());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONSchemaPropsOrBoolBuilder that = (JSONSchemaPropsOrBoolBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
