package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HTTPHeaderBuilder extends HTTPHeaderFluentImpl<HTTPHeaderBuilder> implements VisitableBuilder<HTTPHeader,HTTPHeaderBuilder>{

    HTTPHeaderFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HTTPHeaderBuilder(){
            this(true);
    }
    public HTTPHeaderBuilder(Boolean validationEnabled){
            this(new HTTPHeader(), validationEnabled);
    }
    public HTTPHeaderBuilder(HTTPHeaderFluent<?> fluent){
            this(fluent, true);
    }
    public HTTPHeaderBuilder(HTTPHeaderFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HTTPHeader(), validationEnabled);
    }
    public HTTPHeaderBuilder(HTTPHeaderFluent<?> fluent,HTTPHeader instance){
            this(fluent, instance, true);
    }
    public HTTPHeaderBuilder(HTTPHeaderFluent<?> fluent,HTTPHeader instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPHeaderBuilder(HTTPHeader instance){
            this(instance,true);
    }
    public HTTPHeaderBuilder(HTTPHeader instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPHeaderBuilder(Validator validator){
            this(new HTTPHeader(), true);
    }
    public HTTPHeaderBuilder(HTTPHeaderFluent<?> fluent,HTTPHeader instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withValue(instance.getValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HTTPHeaderBuilder(HTTPHeader instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withValue(instance.getValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HTTPHeader build(){
            HTTPHeader buildable = new HTTPHeader(fluent.getName(),fluent.getValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HTTPHeaderBuilder that = (HTTPHeaderBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
