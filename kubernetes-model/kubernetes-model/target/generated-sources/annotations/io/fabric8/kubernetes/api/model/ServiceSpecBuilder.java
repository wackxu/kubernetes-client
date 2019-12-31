package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceSpecBuilder extends ServiceSpecFluentImpl<ServiceSpecBuilder> implements VisitableBuilder<ServiceSpec,ServiceSpecBuilder>{

    ServiceSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceSpecBuilder(){
            this(true);
    }
    public ServiceSpecBuilder(Boolean validationEnabled){
            this(new ServiceSpec(), validationEnabled);
    }
    public ServiceSpecBuilder(ServiceSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceSpecBuilder(ServiceSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceSpec(), validationEnabled);
    }
    public ServiceSpecBuilder(ServiceSpecFluent<?> fluent,ServiceSpec instance){
            this(fluent, instance, true);
    }
    public ServiceSpecBuilder(ServiceSpecFluent<?> fluent,ServiceSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withClusterIP(instance.getClusterIP()); 
            fluent.withExternalIPs(instance.getExternalIPs()); 
            fluent.withExternalName(instance.getExternalName()); 
            fluent.withExternalTrafficPolicy(instance.getExternalTrafficPolicy()); 
            fluent.withHealthCheckNodePort(instance.getHealthCheckNodePort()); 
            fluent.withLoadBalancerIP(instance.getLoadBalancerIP()); 
            fluent.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges()); 
            fluent.withPorts(instance.getPorts()); 
            fluent.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withSessionAffinity(instance.getSessionAffinity()); 
            fluent.withSessionAffinityConfig(instance.getSessionAffinityConfig()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceSpecBuilder(ServiceSpec instance){
            this(instance,true);
    }
    public ServiceSpecBuilder(ServiceSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withClusterIP(instance.getClusterIP()); 
            this.withExternalIPs(instance.getExternalIPs()); 
            this.withExternalName(instance.getExternalName()); 
            this.withExternalTrafficPolicy(instance.getExternalTrafficPolicy()); 
            this.withHealthCheckNodePort(instance.getHealthCheckNodePort()); 
            this.withLoadBalancerIP(instance.getLoadBalancerIP()); 
            this.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges()); 
            this.withPorts(instance.getPorts()); 
            this.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses()); 
            this.withSelector(instance.getSelector()); 
            this.withSessionAffinity(instance.getSessionAffinity()); 
            this.withSessionAffinityConfig(instance.getSessionAffinityConfig()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceSpecBuilder(Validator validator){
            this(new ServiceSpec(), true);
    }
    public ServiceSpecBuilder(ServiceSpecFluent<?> fluent,ServiceSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withClusterIP(instance.getClusterIP()); 
            fluent.withExternalIPs(instance.getExternalIPs()); 
            fluent.withExternalName(instance.getExternalName()); 
            fluent.withExternalTrafficPolicy(instance.getExternalTrafficPolicy()); 
            fluent.withHealthCheckNodePort(instance.getHealthCheckNodePort()); 
            fluent.withLoadBalancerIP(instance.getLoadBalancerIP()); 
            fluent.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges()); 
            fluent.withPorts(instance.getPorts()); 
            fluent.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withSessionAffinity(instance.getSessionAffinity()); 
            fluent.withSessionAffinityConfig(instance.getSessionAffinityConfig()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceSpecBuilder(ServiceSpec instance,Validator validator){
            this.fluent = this; 
            this.withClusterIP(instance.getClusterIP()); 
            this.withExternalIPs(instance.getExternalIPs()); 
            this.withExternalName(instance.getExternalName()); 
            this.withExternalTrafficPolicy(instance.getExternalTrafficPolicy()); 
            this.withHealthCheckNodePort(instance.getHealthCheckNodePort()); 
            this.withLoadBalancerIP(instance.getLoadBalancerIP()); 
            this.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges()); 
            this.withPorts(instance.getPorts()); 
            this.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses()); 
            this.withSelector(instance.getSelector()); 
            this.withSessionAffinity(instance.getSessionAffinity()); 
            this.withSessionAffinityConfig(instance.getSessionAffinityConfig()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceSpec build(){
            ServiceSpec buildable = new ServiceSpec(fluent.getClusterIP(),fluent.getExternalIPs(),fluent.getExternalName(),fluent.getExternalTrafficPolicy(),fluent.getHealthCheckNodePort(),fluent.getLoadBalancerIP(),fluent.getLoadBalancerSourceRanges(),fluent.getPorts(),fluent.isPublishNotReadyAddresses(),fluent.getSelector(),fluent.getSessionAffinity(),fluent.getSessionAffinityConfig(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceSpecBuilder that = (ServiceSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
