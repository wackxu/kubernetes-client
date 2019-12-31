package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkPolicyPeerFluentImpl<A extends NetworkPolicyPeerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NetworkPolicyPeerFluent<A>{

    private IPBlockBuilder ipBlock;
    private LabelSelectorBuilder namespaceSelector;
    private LabelSelectorBuilder podSelector;

    public NetworkPolicyPeerFluentImpl(){
    }
    public NetworkPolicyPeerFluentImpl(NetworkPolicyPeer instance){
            this.withIpBlock(instance.getIpBlock()); 
            this.withNamespaceSelector(instance.getNamespaceSelector()); 
            this.withPodSelector(instance.getPodSelector()); 
    }

    
/**
 * This method has been deprecated, please use method buildIpBlock instead.
 * @return The buildable object.
 */
@Deprecated public IPBlock getIpBlock(){
            return this.ipBlock!=null?this.ipBlock.build():null;
    }

    public IPBlock buildIpBlock(){
            return this.ipBlock!=null?this.ipBlock.build():null;
    }

    public A withIpBlock(IPBlock ipBlock){
            _visitables.remove(this.ipBlock);
            if (ipBlock!=null){ this.ipBlock= new IPBlockBuilder(ipBlock); _visitables.add(this.ipBlock);} return (A) this;
    }

    public Boolean hasIpBlock(){
            return this.ipBlock != null;
    }

    public NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlock(){
            return new IpBlockNestedImpl();
    }

    public NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlockLike(IPBlock item){
            return new IpBlockNestedImpl(item);
    }

    public NetworkPolicyPeerFluent.IpBlockNested<A> editIpBlock(){
            return withNewIpBlockLike(getIpBlock());
    }

    public NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlock(){
            return withNewIpBlockLike(getIpBlock() != null ? getIpBlock(): new IPBlockBuilder().build());
    }

    public NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlockLike(IPBlock item){
            return withNewIpBlockLike(getIpBlock() != null ? getIpBlock(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNamespaceSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getNamespaceSelector(){
            return this.namespaceSelector!=null?this.namespaceSelector.build():null;
    }

    public LabelSelector buildNamespaceSelector(){
            return this.namespaceSelector!=null?this.namespaceSelector.build():null;
    }

    public A withNamespaceSelector(LabelSelector namespaceSelector){
            _visitables.remove(this.namespaceSelector);
            if (namespaceSelector!=null){ this.namespaceSelector= new LabelSelectorBuilder(namespaceSelector); _visitables.add(this.namespaceSelector);} return (A) this;
    }

    public Boolean hasNamespaceSelector(){
            return this.namespaceSelector != null;
    }

    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelector(){
            return new NamespaceSelectorNestedImpl();
    }

    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(LabelSelector item){
            return new NamespaceSelectorNestedImpl(item);
    }

    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editNamespaceSelector(){
            return withNewNamespaceSelectorLike(getNamespaceSelector());
    }

    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector(){
            return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): new LabelSelectorBuilder().build());
    }

    public NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(LabelSelector item){
            return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getPodSelector(){
            return this.podSelector!=null?this.podSelector.build():null;
    }

    public LabelSelector buildPodSelector(){
            return this.podSelector!=null?this.podSelector.build():null;
    }

    public A withPodSelector(LabelSelector podSelector){
            _visitables.remove(this.podSelector);
            if (podSelector!=null){ this.podSelector= new LabelSelectorBuilder(podSelector); _visitables.add(this.podSelector);} return (A) this;
    }

    public Boolean hasPodSelector(){
            return this.podSelector != null;
    }

    public NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelector(){
            return new PodSelectorNestedImpl();
    }

    public NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelectorLike(LabelSelector item){
            return new PodSelectorNestedImpl(item);
    }

    public NetworkPolicyPeerFluent.PodSelectorNested<A> editPodSelector(){
            return withNewPodSelectorLike(getPodSelector());
    }

    public NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelector(){
            return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): new LabelSelectorBuilder().build());
    }

    public NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelectorLike(LabelSelector item){
            return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyPeerFluentImpl that = (NetworkPolicyPeerFluentImpl) o;
            if (ipBlock != null ? !ipBlock.equals(that.ipBlock) :that.ipBlock != null) return false;
            if (namespaceSelector != null ? !namespaceSelector.equals(that.namespaceSelector) :that.namespaceSelector != null) return false;
            if (podSelector != null ? !podSelector.equals(that.podSelector) :that.podSelector != null) return false;
            return true;
    }


    public class IpBlockNestedImpl<N> extends IPBlockFluentImpl<NetworkPolicyPeerFluent.IpBlockNested<N>> implements NetworkPolicyPeerFluent.IpBlockNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IPBlockBuilder builder;
    
            IpBlockNestedImpl(IPBlock item){
                    this.builder = new IPBlockBuilder(this, item);
            }
            IpBlockNestedImpl(){
                    this.builder = new IPBlockBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicyPeerFluentImpl.this.withIpBlock(builder.build());
    }
    public N endIpBlock(){
            return and();
    }

}
    public class NamespaceSelectorNestedImpl<N> extends LabelSelectorFluentImpl<NetworkPolicyPeerFluent.NamespaceSelectorNested<N>> implements NetworkPolicyPeerFluent.NamespaceSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            NamespaceSelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            NamespaceSelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicyPeerFluentImpl.this.withNamespaceSelector(builder.build());
    }
    public N endNamespaceSelector(){
            return and();
    }

}
    public class PodSelectorNestedImpl<N> extends LabelSelectorFluentImpl<NetworkPolicyPeerFluent.PodSelectorNested<N>> implements NetworkPolicyPeerFluent.PodSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            PodSelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            PodSelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicyPeerFluentImpl.this.withPodSelector(builder.build());
    }
    public N endPodSelector(){
            return and();
    }

}


}
