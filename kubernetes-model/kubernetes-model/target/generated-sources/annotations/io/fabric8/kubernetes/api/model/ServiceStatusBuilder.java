package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceStatusBuilder extends ServiceStatusFluentImpl<ServiceStatusBuilder> implements VisitableBuilder<ServiceStatus,ServiceStatusBuilder>{

    ServiceStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceStatusBuilder(){
            this(true);
    }
    public ServiceStatusBuilder(Boolean validationEnabled){
            this(new ServiceStatus(), validationEnabled);
    }
    public ServiceStatusBuilder(ServiceStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceStatusBuilder(ServiceStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceStatus(), validationEnabled);
    }
    public ServiceStatusBuilder(ServiceStatusFluent<?> fluent,ServiceStatus instance){
            this(fluent, instance, true);
    }
    public ServiceStatusBuilder(ServiceStatusFluent<?> fluent,ServiceStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLoadBalancer(instance.getLoadBalancer()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceStatusBuilder(ServiceStatus instance){
            this(instance,true);
    }
    public ServiceStatusBuilder(ServiceStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLoadBalancer(instance.getLoadBalancer()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceStatusBuilder(Validator validator){
            this(new ServiceStatus(), true);
    }
    public ServiceStatusBuilder(ServiceStatusFluent<?> fluent,ServiceStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLoadBalancer(instance.getLoadBalancer()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceStatusBuilder(ServiceStatus instance,Validator validator){
            this.fluent = this; 
            this.withLoadBalancer(instance.getLoadBalancer()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceStatus build(){
            ServiceStatus buildable = new ServiceStatus(fluent.getLoadBalancer());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceStatusBuilder that = (ServiceStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
