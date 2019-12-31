package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RouteStatusBuilder extends RouteStatusFluentImpl<RouteStatusBuilder> implements VisitableBuilder<RouteStatus,RouteStatusBuilder>{

    RouteStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RouteStatusBuilder(){
            this(true);
    }
    public RouteStatusBuilder(Boolean validationEnabled){
            this(new RouteStatus(), validationEnabled);
    }
    public RouteStatusBuilder(RouteStatusFluent<?> fluent){
            this(fluent, true);
    }
    public RouteStatusBuilder(RouteStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RouteStatus(), validationEnabled);
    }
    public RouteStatusBuilder(RouteStatusFluent<?> fluent,RouteStatus instance){
            this(fluent, instance, true);
    }
    public RouteStatusBuilder(RouteStatusFluent<?> fluent,RouteStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withIngress(instance.getIngress()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteStatusBuilder(RouteStatus instance){
            this(instance,true);
    }
    public RouteStatusBuilder(RouteStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withIngress(instance.getIngress()); 
            this.validationEnabled = validationEnabled; 
    }
    public RouteStatusBuilder(Validator validator){
            this(new RouteStatus(), true);
    }
    public RouteStatusBuilder(RouteStatusFluent<?> fluent,RouteStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withIngress(instance.getIngress()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RouteStatusBuilder(RouteStatus instance,Validator validator){
            this.fluent = this; 
            this.withIngress(instance.getIngress()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RouteStatus build(){
            RouteStatus buildable = new RouteStatus(fluent.getIngress());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteStatusBuilder that = (RouteStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
