package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HTTPIngressPathBuilder extends HTTPIngressPathFluentImpl<HTTPIngressPathBuilder> implements VisitableBuilder<HTTPIngressPath,HTTPIngressPathBuilder>{

    HTTPIngressPathFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HTTPIngressPathBuilder(){
            this(true);
    }
    public HTTPIngressPathBuilder(Boolean validationEnabled){
            this(new HTTPIngressPath(), validationEnabled);
    }
    public HTTPIngressPathBuilder(HTTPIngressPathFluent<?> fluent){
            this(fluent, true);
    }
    public HTTPIngressPathBuilder(HTTPIngressPathFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HTTPIngressPath(), validationEnabled);
    }
    public HTTPIngressPathBuilder(HTTPIngressPathFluent<?> fluent,HTTPIngressPath instance){
            this(fluent, instance, true);
    }
    public HTTPIngressPathBuilder(HTTPIngressPathFluent<?> fluent,HTTPIngressPath instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBackend(instance.getBackend()); 
            fluent.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPIngressPathBuilder(HTTPIngressPath instance){
            this(instance,true);
    }
    public HTTPIngressPathBuilder(HTTPIngressPath instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBackend(instance.getBackend()); 
            this.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public HTTPIngressPathBuilder(Validator validator){
            this(new HTTPIngressPath(), true);
    }
    public HTTPIngressPathBuilder(HTTPIngressPathFluent<?> fluent,HTTPIngressPath instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBackend(instance.getBackend()); 
            fluent.withPath(instance.getPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HTTPIngressPathBuilder(HTTPIngressPath instance,Validator validator){
            this.fluent = this; 
            this.withBackend(instance.getBackend()); 
            this.withPath(instance.getPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HTTPIngressPath build(){
            HTTPIngressPath buildable = new HTTPIngressPath(fluent.getBackend(),fluent.getPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HTTPIngressPathBuilder that = (HTTPIngressPathBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
