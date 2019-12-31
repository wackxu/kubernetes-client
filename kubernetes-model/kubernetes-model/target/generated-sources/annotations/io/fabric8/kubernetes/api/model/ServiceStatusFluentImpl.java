package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class ServiceStatusFluentImpl<A extends ServiceStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceStatusFluent<A>{

    private LoadBalancerStatusBuilder loadBalancer;

    public ServiceStatusFluentImpl(){
    }
    public ServiceStatusFluentImpl(ServiceStatus instance){
            this.withLoadBalancer(instance.getLoadBalancer()); 
    }

    
/**
 * This method has been deprecated, please use method buildLoadBalancer instead.
 * @return The buildable object.
 */
@Deprecated public LoadBalancerStatus getLoadBalancer(){
            return this.loadBalancer!=null?this.loadBalancer.build():null;
    }

    public LoadBalancerStatus buildLoadBalancer(){
            return this.loadBalancer!=null?this.loadBalancer.build():null;
    }

    public A withLoadBalancer(LoadBalancerStatus loadBalancer){
            _visitables.remove(this.loadBalancer);
            if (loadBalancer!=null){ this.loadBalancer= new LoadBalancerStatusBuilder(loadBalancer); _visitables.add(this.loadBalancer);} return (A) this;
    }

    public Boolean hasLoadBalancer(){
            return this.loadBalancer != null;
    }

    public ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancer(){
            return new LoadBalancerNestedImpl();
    }

    public ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(LoadBalancerStatus item){
            return new LoadBalancerNestedImpl(item);
    }

    public ServiceStatusFluent.LoadBalancerNested<A> editLoadBalancer(){
            return withNewLoadBalancerLike(getLoadBalancer());
    }

    public ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer(){
            return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): new LoadBalancerStatusBuilder().build());
    }

    public ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(LoadBalancerStatus item){
            return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceStatusFluentImpl that = (ServiceStatusFluentImpl) o;
            if (loadBalancer != null ? !loadBalancer.equals(that.loadBalancer) :that.loadBalancer != null) return false;
            return true;
    }


    public class LoadBalancerNestedImpl<N> extends LoadBalancerStatusFluentImpl<ServiceStatusFluent.LoadBalancerNested<N>> implements ServiceStatusFluent.LoadBalancerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LoadBalancerStatusBuilder builder;
    
            LoadBalancerNestedImpl(LoadBalancerStatus item){
                    this.builder = new LoadBalancerStatusBuilder(this, item);
            }
            LoadBalancerNestedImpl(){
                    this.builder = new LoadBalancerStatusBuilder(this);
            }
    
    public N and(){
            return (N) ServiceStatusFluentImpl.this.withLoadBalancer(builder.build());
    }
    public N endLoadBalancer(){
            return and();
    }

}


}
