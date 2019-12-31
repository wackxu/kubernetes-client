package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServicePortBuilder extends ServicePortFluentImpl<ServicePortBuilder> implements VisitableBuilder<ServicePort,ServicePortBuilder>{

    ServicePortFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServicePortBuilder(){
            this(true);
    }
    public ServicePortBuilder(Boolean validationEnabled){
            this(new ServicePort(), validationEnabled);
    }
    public ServicePortBuilder(ServicePortFluent<?> fluent){
            this(fluent, true);
    }
    public ServicePortBuilder(ServicePortFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServicePort(), validationEnabled);
    }
    public ServicePortBuilder(ServicePortFluent<?> fluent,ServicePort instance){
            this(fluent, instance, true);
    }
    public ServicePortBuilder(ServicePortFluent<?> fluent,ServicePort instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNodePort(instance.getNodePort()); 
            fluent.withPort(instance.getPort()); 
            fluent.withProtocol(instance.getProtocol()); 
            fluent.withTargetPort(instance.getTargetPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServicePortBuilder(ServicePort instance){
            this(instance,true);
    }
    public ServicePortBuilder(ServicePort instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNodePort(instance.getNodePort()); 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
            this.withTargetPort(instance.getTargetPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServicePortBuilder(Validator validator){
            this(new ServicePort(), true);
    }
    public ServicePortBuilder(ServicePortFluent<?> fluent,ServicePort instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNodePort(instance.getNodePort()); 
            fluent.withPort(instance.getPort()); 
            fluent.withProtocol(instance.getProtocol()); 
            fluent.withTargetPort(instance.getTargetPort()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServicePortBuilder(ServicePort instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNodePort(instance.getNodePort()); 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
            this.withTargetPort(instance.getTargetPort()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServicePort build(){
            ServicePort buildable = new ServicePort(fluent.getName(),fluent.getNodePort(),fluent.getPort(),fluent.getProtocol(),fluent.getTargetPort());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServicePortBuilder that = (ServicePortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
