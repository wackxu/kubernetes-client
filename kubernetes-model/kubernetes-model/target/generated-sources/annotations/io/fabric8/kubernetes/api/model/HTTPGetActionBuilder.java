package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HTTPGetActionBuilder extends HTTPGetActionFluentImpl<HTTPGetActionBuilder> implements VisitableBuilder<HTTPGetAction,HTTPGetActionBuilder>{

    HTTPGetActionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HTTPGetActionBuilder(){
            this(true);
    }
    public HTTPGetActionBuilder(Boolean validationEnabled){
            this(new HTTPGetAction(), validationEnabled);
    }
    public HTTPGetActionBuilder(HTTPGetActionFluent<?> fluent){
            this(fluent, true);
    }
    public HTTPGetActionBuilder(HTTPGetActionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HTTPGetAction(), validationEnabled);
    }
    public HTTPGetActionBuilder(HTTPGetActionFluent<?> fluent,HTTPGetAction instance){
            this(fluent, instance, true);
    }
    public HTTPGetActionBuilder(HTTPGetActionFluent<?> fluent,HTTPGetAction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHost(instance.getHost()); 
            fluent.withHttpHeaders(instance.getHttpHeaders()); 
            fluent.withPath(instance.getPath()); 
            fluent.withPort(instance.getPort()); 
            fluent.withScheme(instance.getScheme()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPGetActionBuilder(HTTPGetAction instance){
            this(instance,true);
    }
    public HTTPGetActionBuilder(HTTPGetAction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHost(instance.getHost()); 
            this.withHttpHeaders(instance.getHttpHeaders()); 
            this.withPath(instance.getPath()); 
            this.withPort(instance.getPort()); 
            this.withScheme(instance.getScheme()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPGetActionBuilder(Validator validator){
            this(new HTTPGetAction(), true);
    }
    public HTTPGetActionBuilder(HTTPGetActionFluent<?> fluent,HTTPGetAction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHost(instance.getHost()); 
            fluent.withHttpHeaders(instance.getHttpHeaders()); 
            fluent.withPath(instance.getPath()); 
            fluent.withPort(instance.getPort()); 
            fluent.withScheme(instance.getScheme()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HTTPGetActionBuilder(HTTPGetAction instance,Validator validator){
            this.fluent = this; 
            this.withHost(instance.getHost()); 
            this.withHttpHeaders(instance.getHttpHeaders()); 
            this.withPath(instance.getPath()); 
            this.withPort(instance.getPort()); 
            this.withScheme(instance.getScheme()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HTTPGetAction build(){
            HTTPGetAction buildable = new HTTPGetAction(fluent.getHost(),fluent.getHttpHeaders(),fluent.getPath(),fluent.getPort(),fluent.getScheme());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HTTPGetActionBuilder that = (HTTPGetActionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
