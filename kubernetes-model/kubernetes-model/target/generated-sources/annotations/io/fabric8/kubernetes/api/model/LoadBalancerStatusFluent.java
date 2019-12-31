package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface LoadBalancerStatusFluent<A extends LoadBalancerStatusFluent<A>> extends Fluent<A>{


    public A addToIngress(int index,LoadBalancerIngress item);
    public A setToIngress(int index,LoadBalancerIngress item);
    public A addToIngress(LoadBalancerIngress... items);
    public A addAllToIngress(Collection<LoadBalancerIngress> items);
    public A removeFromIngress(LoadBalancerIngress... items);
    public A removeAllFromIngress(Collection<LoadBalancerIngress> items);
    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public List<LoadBalancerIngress> getIngress();
    public List<LoadBalancerIngress> buildIngress();
    public LoadBalancerIngress buildIngress(int index);
    public LoadBalancerIngress buildFirstIngress();
    public LoadBalancerIngress buildLastIngress();
    public LoadBalancerIngress buildMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<LoadBalancerIngressBuilder> predicate);
    public A withIngress(List<LoadBalancerIngress> ingress);
    public A withIngress(LoadBalancerIngress... ingress);
    public Boolean hasIngress();
    public A addNewIngress(String hostname,String ip);
    public LoadBalancerStatusFluent.IngressNested<A> addNewIngress();
    public LoadBalancerStatusFluent.IngressNested<A> addNewIngressLike(LoadBalancerIngress item);
    public LoadBalancerStatusFluent.IngressNested<A> setNewIngressLike(int index,LoadBalancerIngress item);
    public LoadBalancerStatusFluent.IngressNested<A> editIngress(int index);
    public LoadBalancerStatusFluent.IngressNested<A> editFirstIngress();
    public LoadBalancerStatusFluent.IngressNested<A> editLastIngress();
    public LoadBalancerStatusFluent.IngressNested<A> editMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<LoadBalancerIngressBuilder> predicate);

    public interface IngressNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LoadBalancerIngressFluent<LoadBalancerStatusFluent.IngressNested<N>>{

        
    public N and();    public N endIngress();
}


}
