package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.LoadBalancerStatusBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LoadBalancerStatus;
import io.fabric8.kubernetes.api.model.LoadBalancerStatusFluentImpl;

public class IngressStatusFluentImpl<A extends IngressStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IngressStatusFluent<A>{

    private LoadBalancerStatusBuilder loadBalancer;

    public IngressStatusFluentImpl(){
    }
    public IngressStatusFluentImpl(IngressStatus instance){
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

    public IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer(){
            return new LoadBalancerNestedImpl();
    }

    public IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(LoadBalancerStatus item){
            return new LoadBalancerNestedImpl(item);
    }

    public IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer(){
            return withNewLoadBalancerLike(getLoadBalancer());
    }

    public IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer(){
            return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): new LoadBalancerStatusBuilder().build());
    }

    public IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(LoadBalancerStatus item){
            return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressStatusFluentImpl that = (IngressStatusFluentImpl) o;
            if (loadBalancer != null ? !loadBalancer.equals(that.loadBalancer) :that.loadBalancer != null) return false;
            return true;
    }


    public class LoadBalancerNestedImpl<N> extends LoadBalancerStatusFluentImpl<IngressStatusFluent.LoadBalancerNested<N>> implements IngressStatusFluent.LoadBalancerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LoadBalancerStatusBuilder builder;
    
            LoadBalancerNestedImpl(LoadBalancerStatus item){
                    this.builder = new LoadBalancerStatusBuilder(this, item);
            }
            LoadBalancerNestedImpl(){
                    this.builder = new LoadBalancerStatusBuilder(this);
            }
    
    public N and(){
            return (N) IngressStatusFluentImpl.this.withLoadBalancer(builder.build());
    }
    public N endLoadBalancer(){
            return and();
    }

}


}
