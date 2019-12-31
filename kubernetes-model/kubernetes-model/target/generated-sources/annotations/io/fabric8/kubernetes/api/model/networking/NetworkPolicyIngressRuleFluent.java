package io.fabric8.kubernetes.api.model.networking;

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

public interface NetworkPolicyIngressRuleFluent<A extends NetworkPolicyIngressRuleFluent<A>> extends Fluent<A>{


    public A addToFrom(int index,NetworkPolicyPeer item);
    public A setToFrom(int index,NetworkPolicyPeer item);
    public A addToFrom(NetworkPolicyPeer... items);
    public A addAllToFrom(Collection<NetworkPolicyPeer> items);
    public A removeFromFrom(NetworkPolicyPeer... items);
    public A removeAllFromFrom(Collection<NetworkPolicyPeer> items);
    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyPeer> getFrom();
    public List<NetworkPolicyPeer> buildFrom();
    public NetworkPolicyPeer buildFrom(int index);
    public NetworkPolicyPeer buildFirstFrom();
    public NetworkPolicyPeer buildLastFrom();
    public NetworkPolicyPeer buildMatchingFrom(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate);
    public A withFrom(List<NetworkPolicyPeer> from);
    public A withFrom(NetworkPolicyPeer... from);
    public Boolean hasFrom();
    public NetworkPolicyIngressRuleFluent.FromNested<A> addNewFrom();
    public NetworkPolicyIngressRuleFluent.FromNested<A> addNewFromLike(NetworkPolicyPeer item);
    public NetworkPolicyIngressRuleFluent.FromNested<A> setNewFromLike(int index,NetworkPolicyPeer item);
    public NetworkPolicyIngressRuleFluent.FromNested<A> editFrom(int index);
    public NetworkPolicyIngressRuleFluent.FromNested<A> editFirstFrom();
    public NetworkPolicyIngressRuleFluent.FromNested<A> editLastFrom();
    public NetworkPolicyIngressRuleFluent.FromNested<A> editMatchingFrom(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate);
    public A addToPorts(int index,NetworkPolicyPort item);
    public A setToPorts(int index,NetworkPolicyPort item);
    public A addToPorts(NetworkPolicyPort... items);
    public A addAllToPorts(Collection<NetworkPolicyPort> items);
    public A removeFromPorts(NetworkPolicyPort... items);
    public A removeAllFromPorts(Collection<NetworkPolicyPort> items);
    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyPort> getPorts();
    public List<NetworkPolicyPort> buildPorts();
    public NetworkPolicyPort buildPort(int index);
    public NetworkPolicyPort buildFirstPort();
    public NetworkPolicyPort buildLastPort();
    public NetworkPolicyPort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPortBuilder> predicate);
    public A withPorts(List<NetworkPolicyPort> ports);
    public A withPorts(NetworkPolicyPort... ports);
    public Boolean hasPorts();
    public NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPort();
    public NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPortLike(NetworkPolicyPort item);
    public NetworkPolicyIngressRuleFluent.PortsNested<A> setNewPortLike(int index,NetworkPolicyPort item);
    public NetworkPolicyIngressRuleFluent.PortsNested<A> editPort(int index);
    public NetworkPolicyIngressRuleFluent.PortsNested<A> editFirstPort();
    public NetworkPolicyIngressRuleFluent.PortsNested<A> editLastPort();
    public NetworkPolicyIngressRuleFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPortBuilder> predicate);

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyPeerFluent<NetworkPolicyIngressRuleFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface PortsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyPortFluent<NetworkPolicyIngressRuleFluent.PortsNested<N>>{

        
    public N and();    public N endPort();
}


}
