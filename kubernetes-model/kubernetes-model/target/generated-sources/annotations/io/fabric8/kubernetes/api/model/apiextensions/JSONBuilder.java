package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JSONBuilder extends JSONFluentImpl<JSONBuilder> implements VisitableBuilder<JSON,JSONBuilder>{

    JSONFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JSONBuilder(){
            this(true);
    }
    public JSONBuilder(Boolean validationEnabled){
            this(new JSON(), validationEnabled);
    }
    public JSONBuilder(JSONFluent<?> fluent){
            this(fluent, true);
    }
    public JSONBuilder(JSONFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JSON(), validationEnabled);
    }
    public JSONBuilder(JSONFluent<?> fluent,JSON instance){
            this(fluent, instance, true);
    }
    public JSONBuilder(JSONFluent<?> fluent,JSON instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRaw(instance.getRaw()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONBuilder(JSON instance){
            this(instance,true);
    }
    public JSONBuilder(JSON instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRaw(instance.getRaw()); 
            this.validationEnabled = validationEnabled; 
    }
    public JSONBuilder(Validator validator){
            this(new JSON(), true);
    }
    public JSONBuilder(JSONFluent<?> fluent,JSON instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRaw(instance.getRaw()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JSONBuilder(JSON instance,Validator validator){
            this.fluent = this; 
            this.withRaw(instance.getRaw()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JSON build(){
            JSON buildable = new JSON(fluent.getRaw());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JSONBuilder that = (JSONBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
