package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
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

public interface RouteStatusFluent<A extends RouteStatusFluent<A>> extends Fluent<A>{


    public A addToIngress(int index,RouteIngress item);
    public A setToIngress(int index,RouteIngress item);
    public A addToIngress(RouteIngress... items);
    public A addAllToIngress(Collection<RouteIngress> items);
    public A removeFromIngress(RouteIngress... items);
    public A removeAllFromIngress(Collection<RouteIngress> items);
    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public List<RouteIngress> getIngress();
    public List<RouteIngress> buildIngress();
    public RouteIngress buildIngress(int index);
    public RouteIngress buildFirstIngress();
    public RouteIngress buildLastIngress();
    public RouteIngress buildMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressBuilder> predicate);
    public A withIngress(List<RouteIngress> ingress);
    public A withIngress(RouteIngress... ingress);
    public Boolean hasIngress();
    public RouteStatusFluent.IngressNested<A> addNewIngress();
    public RouteStatusFluent.IngressNested<A> addNewIngressLike(RouteIngress item);
    public RouteStatusFluent.IngressNested<A> setNewIngressLike(int index,RouteIngress item);
    public RouteStatusFluent.IngressNested<A> editIngress(int index);
    public RouteStatusFluent.IngressNested<A> editFirstIngress();
    public RouteStatusFluent.IngressNested<A> editLastIngress();
    public RouteStatusFluent.IngressNested<A> editMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressBuilder> predicate);

    public interface IngressNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteIngressFluent<RouteStatusFluent.IngressNested<N>>{

        
    public N and();    public N endIngress();
}


}
