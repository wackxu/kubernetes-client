package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ServiceStatusFluent<A extends ServiceStatusFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildLoadBalancer instead.
 * @return The buildable object.
 */
@Deprecated public LoadBalancerStatus getLoadBalancer();
    public LoadBalancerStatus buildLoadBalancer();
    public A withLoadBalancer(LoadBalancerStatus loadBalancer);
    public Boolean hasLoadBalancer();
    public ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancer();
    public ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(LoadBalancerStatus item);
    public ServiceStatusFluent.LoadBalancerNested<A> editLoadBalancer();
    public ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer();
    public ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(LoadBalancerStatus item);

    public interface LoadBalancerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LoadBalancerStatusFluent<ServiceStatusFluent.LoadBalancerNested<N>>{

        
    public N and();    public N endLoadBalancer();
}


}
