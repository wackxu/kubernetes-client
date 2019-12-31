package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RouteIngressBuilder extends RouteIngressFluentImpl<RouteIngressBuilder> implements VisitableBuilder<RouteIngress,RouteIngressBuilder>{

    RouteIngressFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RouteIngressBuilder(){
            this(true);
    }
    public RouteIngressBuilder(Boolean validationEnabled){
            this(new RouteIngress(), validationEnabled);
    }
    public RouteIngressBuilder(RouteIngressFluent<?> fluent){
            this(fluent, true);
    }
    public RouteIngressBuilder(RouteIngressFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RouteIngress(), validationEnabled);
    }
    public RouteIngressBuilder(RouteIngressFluent<?> fluent,RouteIngress instance){
            this(fluent, instance, true);
    }
    public RouteIngressBuilder(RouteIngressFluent<?> fluent,RouteIngress instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withHost(instance.getHost()); 
            fluent.withRouterCanonicalHostname(instance.getRouterCanonicalHostname()); 
            fluent.withRouterName(instance.getRouterName()); 
            fluent.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteIngressBuilder(RouteIngress instance){
            this(instance,true);
    }
    public RouteIngressBuilder(RouteIngress instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withHost(instance.getHost()); 
            this.withRouterCanonicalHostname(instance.getRouterCanonicalHostname()); 
            this.withRouterName(instance.getRouterName()); 
            this.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteIngressBuilder(Validator validator){
            this(new RouteIngress(), true);
    }
    public RouteIngressBuilder(RouteIngressFluent<?> fluent,RouteIngress instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConditions(instance.getConditions()); 
            fluent.withHost(instance.getHost()); 
            fluent.withRouterCanonicalHostname(instance.getRouterCanonicalHostname()); 
            fluent.withRouterName(instance.getRouterName()); 
            fluent.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RouteIngressBuilder(RouteIngress instance,Validator validator){
            this.fluent = this; 
            this.withConditions(instance.getConditions()); 
            this.withHost(instance.getHost()); 
            this.withRouterCanonicalHostname(instance.getRouterCanonicalHostname()); 
            this.withRouterName(instance.getRouterName()); 
            this.withWildcardPolicy(instance.getWildcardPolicy()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RouteIngress build(){
            RouteIngress buildable = new RouteIngress(fluent.getConditions(),fluent.getHost(),fluent.getRouterCanonicalHostname(),fluent.getRouterName(),fluent.getWildcardPolicy());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteIngressBuilder that = (RouteIngressBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
