package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface RouteSpecFluent<A extends RouteSpecFluent<A>> extends Fluent<A>{


    public A addToAlternateBackends(int index,RouteTargetReference item);
    public A setToAlternateBackends(int index,RouteTargetReference item);
    public A addToAlternateBackends(RouteTargetReference... items);
    public A addAllToAlternateBackends(Collection<RouteTargetReference> items);
    public A removeFromAlternateBackends(RouteTargetReference... items);
    public A removeAllFromAlternateBackends(Collection<RouteTargetReference> items);
    
/**
 * This method has been deprecated, please use method buildAlternateBackends instead.
 * @return The buildable object.
 */
@Deprecated public List<RouteTargetReference> getAlternateBackends();
    public List<RouteTargetReference> buildAlternateBackends();
    public RouteTargetReference buildAlternateBackend(int index);
    public RouteTargetReference buildFirstAlternateBackend();
    public RouteTargetReference buildLastAlternateBackend();
    public RouteTargetReference buildMatchingAlternateBackend(io.fabric8.kubernetes.api.builder.Predicate<RouteTargetReferenceBuilder> predicate);
    public A withAlternateBackends(List<RouteTargetReference> alternateBackends);
    public A withAlternateBackends(RouteTargetReference... alternateBackends);
    public Boolean hasAlternateBackends();
    public A addNewAlternateBackend(String kind,String name,Integer weight);
    public RouteSpecFluent.AlternateBackendsNested<A> addNewAlternateBackend();
    public RouteSpecFluent.AlternateBackendsNested<A> addNewAlternateBackendLike(RouteTargetReference item);
    public RouteSpecFluent.AlternateBackendsNested<A> setNewAlternateBackendLike(int index,RouteTargetReference item);
    public RouteSpecFluent.AlternateBackendsNested<A> editAlternateBackend(int index);
    public RouteSpecFluent.AlternateBackendsNested<A> editFirstAlternateBackend();
    public RouteSpecFluent.AlternateBackendsNested<A> editLastAlternateBackend();
    public RouteSpecFluent.AlternateBackendsNested<A> editMatchingAlternateBackend(io.fabric8.kubernetes.api.builder.Predicate<RouteTargetReferenceBuilder> predicate);
    public String getHost();
    public A withHost(String host);
    public Boolean hasHost();
    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();
    
/**
 * This method has been deprecated, please use method buildPort instead.
 * @return The buildable object.
 */
@Deprecated public RoutePort getPort();
    public RoutePort buildPort();
    public A withPort(RoutePort port);
    public Boolean hasPort();
    public RouteSpecFluent.PortNested<A> withNewPort();
    public RouteSpecFluent.PortNested<A> withNewPortLike(RoutePort item);
    public RouteSpecFluent.PortNested<A> editPort();
    public RouteSpecFluent.PortNested<A> editOrNewPort();
    public RouteSpecFluent.PortNested<A> editOrNewPortLike(RoutePort item);
    
/**
 * This method has been deprecated, please use method buildTls instead.
 * @return The buildable object.
 */
@Deprecated public TLSConfig getTls();
    public TLSConfig buildTls();
    public A withTls(TLSConfig tls);
    public Boolean hasTls();
    public RouteSpecFluent.TlsNested<A> withNewTls();
    public RouteSpecFluent.TlsNested<A> withNewTlsLike(TLSConfig item);
    public RouteSpecFluent.TlsNested<A> editTls();
    public RouteSpecFluent.TlsNested<A> editOrNewTls();
    public RouteSpecFluent.TlsNested<A> editOrNewTlsLike(TLSConfig item);
    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public RouteTargetReference getTo();
    public RouteTargetReference buildTo();
    public A withTo(RouteTargetReference to);
    public Boolean hasTo();
    public A withNewTo(String kind,String name,Integer weight);
    public RouteSpecFluent.ToNested<A> withNewTo();
    public RouteSpecFluent.ToNested<A> withNewToLike(RouteTargetReference item);
    public RouteSpecFluent.ToNested<A> editTo();
    public RouteSpecFluent.ToNested<A> editOrNewTo();
    public RouteSpecFluent.ToNested<A> editOrNewToLike(RouteTargetReference item);
    public String getWildcardPolicy();
    public A withWildcardPolicy(String wildcardPolicy);
    public Boolean hasWildcardPolicy();

    public interface AlternateBackendsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteTargetReferenceFluent<RouteSpecFluent.AlternateBackendsNested<N>>{

        
    public N and();    public N endAlternateBackend();
}
    public interface PortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoutePortFluent<RouteSpecFluent.PortNested<N>>{

        
    public N and();    public N endPort();
}
    public interface TlsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TLSConfigFluent<RouteSpecFluent.TlsNested<N>>{

        
    public N and();    public N endTls();
}
    public interface ToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteTargetReferenceFluent<RouteSpecFluent.ToNested<N>>{

        
    public N and();    public N endTo();
}


}
