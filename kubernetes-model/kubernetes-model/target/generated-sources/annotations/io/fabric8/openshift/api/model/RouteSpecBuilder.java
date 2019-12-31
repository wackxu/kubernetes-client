package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RouteSpecBuilder extends RouteSpecFluentImpl<RouteSpecBuilder> implements VisitableBuilder<RouteSpec,RouteSpecBuilder>{

    RouteSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RouteSpecBuilder(){
            this(true);
    }
    public RouteSpecBuilder(Boolean validationEnabled){
            this(new RouteSpec(), validationEnabled);
    }
    public RouteSpecBuilder(RouteSpecFluent<?> fluent){
            this(fluent, true);
    }
    public RouteSpecBuilder(RouteSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RouteSpec(), validationEnabled);
    }
    public RouteSpecBuilder(RouteSpecFluent<?> fluent,RouteSpec instance){
            this(fluent, instance, true);
    }
    public RouteSpecBuilder(RouteSpecFluent<?> fluent,RouteSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAlternateBackends(instance.getAlternateBackends()); 
            fluent.withHost(instance.getHost()); 
            fluent.withPath(instance.getPath()); 
            fluent.withPort(instance.getPort()); 
            fluent.withTls(instance.getTls()); 
            fluent.withTo(instance.getTo()); 
            fluent.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteSpecBuilder(RouteSpec instance){
            this(instance,true);
    }
    public RouteSpecBuilder(RouteSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAlternateBackends(instance.getAlternateBackends()); 
            this.withHost(instance.getHost()); 
            this.withPath(instance.getPath()); 
            this.withPort(instance.getPort()); 
            this.withTls(instance.getTls()); 
            this.withTo(instance.getTo()); 
            this.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteSpecBuilder(Validator validator){
            this(new RouteSpec(), true);
    }
    public RouteSpecBuilder(RouteSpecFluent<?> fluent,RouteSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAlternateBackends(instance.getAlternateBackends()); 
            fluent.withHost(instance.getHost()); 
            fluent.withPath(instance.getPath()); 
            fluent.withPort(instance.getPort()); 
            fluent.withTls(instance.getTls()); 
            fluent.withTo(instance.getTo()); 
            fluent.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RouteSpecBuilder(RouteSpec instance,Validator validator){
            this.fluent = this; 
            this.withAlternateBackends(instance.getAlternateBackends()); 
            this.withHost(instance.getHost()); 
            this.withPath(instance.getPath()); 
            this.withPort(instance.getPort()); 
            this.withTls(instance.getTls()); 
            this.withTo(instance.getTo()); 
            this.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RouteSpec build(){
            RouteSpec buildable = new RouteSpec(fluent.getAlternateBackends(),fluent.getHost(),fluent.getPath(),fluent.getPort(),fluent.getTls(),fluent.getTo(),fluent.getWildcardPolicy());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteSpecBuilder that = (RouteSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
