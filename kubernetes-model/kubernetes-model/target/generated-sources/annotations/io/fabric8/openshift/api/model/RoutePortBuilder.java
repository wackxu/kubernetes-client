package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RoutePortBuilder extends RoutePortFluentImpl<RoutePortBuilder> implements VisitableBuilder<RoutePort,RoutePortBuilder>{

    RoutePortFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RoutePortBuilder(){
            this(true);
    }
    public RoutePortBuilder(Boolean validationEnabled){
            this(new RoutePort(), validationEnabled);
    }
    public RoutePortBuilder(RoutePortFluent<?> fluent){
            this(fluent, true);
    }
    public RoutePortBuilder(RoutePortFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RoutePort(), validationEnabled);
    }
    public RoutePortBuilder(RoutePortFluent<?> fluent,RoutePort instance){
            this(fluent, instance, true);
    }
    public RoutePortBuilder(RoutePortFluent<?> fluent,RoutePort instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withTargetPort(instance.getTargetPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoutePortBuilder(RoutePort instance){
            this(instance,true);
    }
    public RoutePortBuilder(RoutePort instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withTargetPort(instance.getTargetPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoutePortBuilder(Validator validator){
            this(new RoutePort(), true);
    }
    public RoutePortBuilder(RoutePortFluent<?> fluent,RoutePort instance,Validator validator){
            this.fluent = fluent; 
            fluent.withTargetPort(instance.getTargetPort()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RoutePortBuilder(RoutePort instance,Validator validator){
            this.fluent = this; 
            this.withTargetPort(instance.getTargetPort()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RoutePort build(){
            RoutePort buildable = new RoutePort(fluent.getTargetPort());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RoutePortBuilder that = (RoutePortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
