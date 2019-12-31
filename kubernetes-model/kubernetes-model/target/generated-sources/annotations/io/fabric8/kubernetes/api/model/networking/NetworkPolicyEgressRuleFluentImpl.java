package io.fabric8.kubernetes.api.model.networking;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class NetworkPolicyEgressRuleFluentImpl<A extends NetworkPolicyEgressRuleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NetworkPolicyEgressRuleFluent<A>{

    private List<NetworkPolicyPortBuilder> ports;
    private List<NetworkPolicyPeerBuilder> to;

    public NetworkPolicyEgressRuleFluentImpl(){
    }
    public NetworkPolicyEgressRuleFluentImpl(NetworkPolicyEgressRule instance){
            this.withPorts(instance.getPorts()); 
            this.withTo(instance.getTo()); 
    }

    public A addToPorts(int index,NetworkPolicyPort item){
            if (this.ports == null) {this.ports = new ArrayList<NetworkPolicyPortBuilder>();}
            NetworkPolicyPortBuilder builder = new NetworkPolicyPortBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
    }

    public A setToPorts(int index,NetworkPolicyPort item){
            if (this.ports == null) {this.ports = new ArrayList<NetworkPolicyPortBuilder>();}
            NetworkPolicyPortBuilder builder = new NetworkPolicyPortBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
             return (A)this;
    }

    public A addToPorts(NetworkPolicyPort... items){
            if (this.ports == null) {this.ports = new ArrayList<NetworkPolicyPortBuilder>();}
            for (NetworkPolicyPort item : items) {NetworkPolicyPortBuilder builder = new NetworkPolicyPortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A addAllToPorts(Collection<NetworkPolicyPort> items){
            if (this.ports == null) {this.ports = new ArrayList<NetworkPolicyPortBuilder>();}
            for (NetworkPolicyPort item : items) {NetworkPolicyPortBuilder builder = new NetworkPolicyPortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A removeFromPorts(NetworkPolicyPort... items){
            for (NetworkPolicyPort item : items) {NetworkPolicyPortBuilder builder = new NetworkPolicyPortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    public A removeAllFromPorts(Collection<NetworkPolicyPort> items){
            for (NetworkPolicyPort item : items) {NetworkPolicyPortBuilder builder = new NetworkPolicyPortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyPort> getPorts(){
            return build(ports);
    }

    public List<NetworkPolicyPort> buildPorts(){
            return build(ports);
    }

    public NetworkPolicyPort buildPort(int index){
            return this.ports.get(index).build();
    }

    public NetworkPolicyPort buildFirstPort(){
            return this.ports.get(0).build();
    }

    public NetworkPolicyPort buildLastPort(){
            return this.ports.get(ports.size() - 1).build();
    }

    public NetworkPolicyPort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPortBuilder> predicate){
            for (NetworkPolicyPortBuilder item: ports) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPorts(List<NetworkPolicyPort> ports){
            if (this.ports != null) { _visitables.removeAll(this.ports);}
            if (ports != null) {this.ports = new ArrayList<NetworkPolicyPortBuilder>(); for (NetworkPolicyPort item : ports){this.addToPorts(item);}} else { this.ports = new ArrayList<NetworkPolicyPortBuilder>();} return (A) this;
    }

    public A withPorts(NetworkPolicyPort... ports){
            if (this.ports != null) {this.ports.clear();}
            if (ports != null) {for (NetworkPolicyPort item :ports){ this.addToPorts(item);}} return (A) this;
    }

    public Boolean hasPorts(){
            return ports != null && !ports.isEmpty();
    }

    public NetworkPolicyEgressRuleFluent.PortsNested<A> addNewPort(){
            return new PortsNestedImpl();
    }

    public NetworkPolicyEgressRuleFluent.PortsNested<A> addNewPortLike(NetworkPolicyPort item){
            return new PortsNestedImpl(-1, item);
    }

    public NetworkPolicyEgressRuleFluent.PortsNested<A> setNewPortLike(int index,NetworkPolicyPort item){
            return new PortsNestedImpl(index, item);
    }

    public NetworkPolicyEgressRuleFluent.PortsNested<A> editPort(int index){
            if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
            return setNewPortLike(index, buildPort(index));
    }

    public NetworkPolicyEgressRuleFluent.PortsNested<A> editFirstPort(){
            if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
            return setNewPortLike(0, buildPort(0));
    }

    public NetworkPolicyEgressRuleFluent.PortsNested<A> editLastPort(){
            int index = ports.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
            return setNewPortLike(index, buildPort(index));
    }

    public NetworkPolicyEgressRuleFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPortBuilder> predicate){
            int index = -1;
            for (int i=0;i<ports.size();i++) { 
            if (predicate.apply(ports.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
            return setNewPortLike(index, buildPort(index));
    }

    public A addToTo(int index,NetworkPolicyPeer item){
            if (this.to == null) {this.to = new ArrayList<NetworkPolicyPeerBuilder>();}
            NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.to.add(index >= 0 ? index : to.size(), builder); return (A)this;
    }

    public A setToTo(int index,NetworkPolicyPeer item){
            if (this.to == null) {this.to = new ArrayList<NetworkPolicyPeerBuilder>();}
            NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= to.size()) { to.add(builder); } else { to.set(index, builder);}
             return (A)this;
    }

    public A addToTo(NetworkPolicyPeer... items){
            if (this.to == null) {this.to = new ArrayList<NetworkPolicyPeerBuilder>();}
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.add(builder);this.to.add(builder);} return (A)this;
    }

    public A addAllToTo(Collection<NetworkPolicyPeer> items){
            if (this.to == null) {this.to = new ArrayList<NetworkPolicyPeerBuilder>();}
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.add(builder);this.to.add(builder);} return (A)this;
    }

    public A removeFromTo(NetworkPolicyPeer... items){
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.remove(builder);if (this.to != null) {this.to.remove(builder);}} return (A)this;
    }

    public A removeAllFromTo(Collection<NetworkPolicyPeer> items){
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.remove(builder);if (this.to != null) {this.to.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyPeer> getTo(){
            return build(to);
    }

    public List<NetworkPolicyPeer> buildTo(){
            return build(to);
    }

    public NetworkPolicyPeer buildTo(int index){
            return this.to.get(index).build();
    }

    public NetworkPolicyPeer buildFirstTo(){
            return this.to.get(0).build();
    }

    public NetworkPolicyPeer buildLastTo(){
            return this.to.get(to.size() - 1).build();
    }

    public NetworkPolicyPeer buildMatchingTo(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate){
            for (NetworkPolicyPeerBuilder item: to) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTo(List<NetworkPolicyPeer> to){
            if (this.to != null) { _visitables.removeAll(this.to);}
            if (to != null) {this.to = new ArrayList<NetworkPolicyPeerBuilder>(); for (NetworkPolicyPeer item : to){this.addToTo(item);}} else { this.to = new ArrayList<NetworkPolicyPeerBuilder>();} return (A) this;
    }

    public A withTo(NetworkPolicyPeer... to){
            if (this.to != null) {this.to.clear();}
            if (to != null) {for (NetworkPolicyPeer item :to){ this.addToTo(item);}} return (A) this;
    }

    public Boolean hasTo(){
            return to != null && !to.isEmpty();
    }

    public NetworkPolicyEgressRuleFluent.ToNested<A> addNewTo(){
            return new ToNestedImpl();
    }

    public NetworkPolicyEgressRuleFluent.ToNested<A> addNewToLike(NetworkPolicyPeer item){
            return new ToNestedImpl(-1, item);
    }

    public NetworkPolicyEgressRuleFluent.ToNested<A> setNewToLike(int index,NetworkPolicyPeer item){
            return new ToNestedImpl(index, item);
    }

    public NetworkPolicyEgressRuleFluent.ToNested<A> editTo(int index){
            if (to.size() <= index) throw new RuntimeException("Can't edit to. Index exceeds size.");
            return setNewToLike(index, buildTo(index));
    }

    public NetworkPolicyEgressRuleFluent.ToNested<A> editFirstTo(){
            if (to.size() == 0) throw new RuntimeException("Can't edit first to. The list is empty.");
            return setNewToLike(0, buildTo(0));
    }

    public NetworkPolicyEgressRuleFluent.ToNested<A> editLastTo(){
            int index = to.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last to. The list is empty.");
            return setNewToLike(index, buildTo(index));
    }

    public NetworkPolicyEgressRuleFluent.ToNested<A> editMatchingTo(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate){
            int index = -1;
            for (int i=0;i<to.size();i++) { 
            if (predicate.apply(to.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching to. No match found.");
            return setNewToLike(index, buildTo(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyEgressRuleFluentImpl that = (NetworkPolicyEgressRuleFluentImpl) o;
            if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
            if (to != null ? !to.equals(that.to) :that.to != null) return false;
            return true;
    }


    public class PortsNestedImpl<N> extends NetworkPolicyPortFluentImpl<NetworkPolicyEgressRuleFluent.PortsNested<N>> implements NetworkPolicyEgressRuleFluent.PortsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyPortBuilder builder;
        private final int index;
    
            PortsNestedImpl(int index,NetworkPolicyPort item){
                    this.index = index;
                    this.builder = new NetworkPolicyPortBuilder(this, item);
            }
            PortsNestedImpl(){
                    this.index = -1;
                    this.builder = new NetworkPolicyPortBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicyEgressRuleFluentImpl.this.setToPorts(index, builder.build());
    }
    public N endPort(){
            return and();
    }

}
    public class ToNestedImpl<N> extends NetworkPolicyPeerFluentImpl<NetworkPolicyEgressRuleFluent.ToNested<N>> implements NetworkPolicyEgressRuleFluent.ToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyPeerBuilder builder;
        private final int index;
    
            ToNestedImpl(int index,NetworkPolicyPeer item){
                    this.index = index;
                    this.builder = new NetworkPolicyPeerBuilder(this, item);
            }
            ToNestedImpl(){
                    this.index = -1;
                    this.builder = new NetworkPolicyPeerBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicyEgressRuleFluentImpl.this.setToTo(index, builder.build());
    }
    public N endTo(){
            return and();
    }

}


}
