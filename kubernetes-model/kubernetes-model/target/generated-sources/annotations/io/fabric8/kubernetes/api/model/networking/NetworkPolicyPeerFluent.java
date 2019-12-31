package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.lang.Boolean;
import java.util.Map;

public interface NetworkPolicyPeerFluent<A extends NetworkPolicyPeerFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildIpBlock instead.
 * @return The buildable object.
 */
@Deprecated public IPBlock getIpBlock();
    public IPBlock buildIpBlock();
    public A withIpBlock(IPBlock ipBlock);
    public Boolean hasIpBlock();
    public NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlock();
    public NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlockLike(IPBlock item);
    public NetworkPolicyPeerFluent.IpBlockNested<A> editIpBlock();
    public NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlock();
    public NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlockLike(IPBlock item);
    
/**
 * This method has been deprecated, please use method buildNamespaceSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getNamespaceSelector();
    public LabelSelector buildNamespaceSelector();
    public A withNamespaceSelector(LabelSelector namespaceSelector);
    public Boolean hasNamespaceSelector();
    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(LabelSelector item);
    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editNamespaceSelector();
    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildPodSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getPodSelector();
    public LabelSelector buildPodSelector();
    public A withPodSelector(LabelSelector podSelector);
    public Boolean hasPodSelector();
    public NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelector();
    public NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelectorLike(LabelSelector item);
    public NetworkPolicyPeerFluent.PodSelectorNested<A> editPodSelector();
    public NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelector();
    public NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelectorLike(LabelSelector item);

    public interface IpBlockNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IPBlockFluent<NetworkPolicyPeerFluent.IpBlockNested<N>>{

        
    public N and();    public N endIpBlock();
}
    public interface NamespaceSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<NetworkPolicyPeerFluent.NamespaceSelectorNested<N>>{

        
    public N and();    public N endNamespaceSelector();
}
    public interface PodSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<NetworkPolicyPeerFluent.PodSelectorNested<N>>{

        
    public N and();    public N endPodSelector();
}


}
