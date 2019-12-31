package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.LoadBalancerStatusBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LoadBalancerStatusFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LoadBalancerStatus;
import java.util.Map;

public interface IngressStatusFluent<A extends IngressStatusFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildLoadBalancer instead.
 * @return The buildable object.
 */
@Deprecated public LoadBalancerStatus getLoadBalancer();
    public LoadBalancerStatus buildLoadBalancer();
    public A withLoadBalancer(LoadBalancerStatus loadBalancer);
    public Boolean hasLoadBalancer();
    public IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer();
    public IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(LoadBalancerStatus item);
    public IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer();
    public IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer();
    public IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(LoadBalancerStatus item);

    public interface LoadBalancerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LoadBalancerStatusFluent<IngressStatusFluent.LoadBalancerNested<N>>{

        
    public N and();    public N endLoadBalancer();
}


}
