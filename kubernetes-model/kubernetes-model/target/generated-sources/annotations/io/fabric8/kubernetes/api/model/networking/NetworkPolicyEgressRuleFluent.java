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

public interface NetworkPolicyEgressRuleFluent<A extends NetworkPolicyEgressRuleFluent<A>> extends Fluent<A>{


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
    public NetworkPolicyEgressRuleFluent.PortsNested<A> addNewPort();
    public NetworkPolicyEgressRuleFluent.PortsNested<A> addNewPortLike(NetworkPolicyPort item);
    public NetworkPolicyEgressRuleFluent.PortsNested<A> setNewPortLike(int index,NetworkPolicyPort item);
    public NetworkPolicyEgressRuleFluent.PortsNested<A> editPort(int index);
    public NetworkPolicyEgressRuleFluent.PortsNested<A> editFirstPort();
    public NetworkPolicyEgressRuleFluent.PortsNested<A> editLastPort();
    public NetworkPolicyEgressRuleFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPortBuilder> predicate);
    public A addToTo(int index,NetworkPolicyPeer item);
    public A setToTo(int index,NetworkPolicyPeer item);
    public A addToTo(NetworkPolicyPeer... items);
    public A addAllToTo(Collection<NetworkPolicyPeer> items);
    public A removeFromTo(NetworkPolicyPeer... items);
    public A removeAllFromTo(Collection<NetworkPolicyPeer> items);
    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyPeer> getTo();
    public List<NetworkPolicyPeer> buildTo();
    public NetworkPolicyPeer buildTo(int index);
    public NetworkPolicyPeer buildFirstTo();
    public NetworkPolicyPeer buildLastTo();
    public NetworkPolicyPeer buildMatchingTo(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate);
    public A withTo(List<NetworkPolicyPeer> to);
    public A withTo(NetworkPolicyPeer... to);
    public Boolean hasTo();
    public NetworkPolicyEgressRuleFluent.ToNested<A> addNewTo();
    public NetworkPolicyEgressRuleFluent.ToNested<A> addNewToLike(NetworkPolicyPeer item);
    public NetworkPolicyEgressRuleFluent.ToNested<A> setNewToLike(int index,NetworkPolicyPeer item);
    public NetworkPolicyEgressRuleFluent.ToNested<A> editTo(int index);
    public NetworkPolicyEgressRuleFluent.ToNested<A> editFirstTo();
    public NetworkPolicyEgressRuleFluent.ToNested<A> editLastTo();
    public NetworkPolicyEgressRuleFluent.ToNested<A> editMatchingTo(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate);

    public interface PortsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyPortFluent<NetworkPolicyEgressRuleFluent.PortsNested<N>>{

        
    public N and();    public N endPort();
}
    public interface ToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyPeerFluent<NetworkPolicyEgressRuleFluent.ToNested<N>>{

        
    public N and();    public N endTo();
}


}
