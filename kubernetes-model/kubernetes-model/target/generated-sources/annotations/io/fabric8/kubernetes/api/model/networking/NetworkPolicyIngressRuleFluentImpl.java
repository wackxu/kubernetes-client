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

public class NetworkPolicyIngressRuleFluentImpl<A extends NetworkPolicyIngressRuleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NetworkPolicyIngressRuleFluent<A>{

    private List<NetworkPolicyPeerBuilder> from;
    private List<NetworkPolicyPortBuilder> ports;

    public NetworkPolicyIngressRuleFluentImpl(){
    }
    public NetworkPolicyIngressRuleFluentImpl(NetworkPolicyIngressRule instance){
            this.withFrom(instance.getFrom()); 
            this.withPorts(instance.getPorts()); 
    }

    public A addToFrom(int index,NetworkPolicyPeer item){
            if (this.from == null) {this.from = new ArrayList<NetworkPolicyPeerBuilder>();}
            NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.from.add(index >= 0 ? index : from.size(), builder); return (A)this;
    }

    public A setToFrom(int index,NetworkPolicyPeer item){
            if (this.from == null) {this.from = new ArrayList<NetworkPolicyPeerBuilder>();}
            NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= from.size()) { from.add(builder); } else { from.set(index, builder);}
             return (A)this;
    }

    public A addToFrom(NetworkPolicyPeer... items){
            if (this.from == null) {this.from = new ArrayList<NetworkPolicyPeerBuilder>();}
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.add(builder);this.from.add(builder);} return (A)this;
    }

    public A addAllToFrom(Collection<NetworkPolicyPeer> items){
            if (this.from == null) {this.from = new ArrayList<NetworkPolicyPeerBuilder>();}
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.add(builder);this.from.add(builder);} return (A)this;
    }

    public A removeFromFrom(NetworkPolicyPeer... items){
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.remove(builder);if (this.from != null) {this.from.remove(builder);}} return (A)this;
    }

    public A removeAllFromFrom(Collection<NetworkPolicyPeer> items){
            for (NetworkPolicyPeer item : items) {NetworkPolicyPeerBuilder builder = new NetworkPolicyPeerBuilder(item);_visitables.remove(builder);if (this.from != null) {this.from.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyPeer> getFrom(){
            return build(from);
    }

    public List<NetworkPolicyPeer> buildFrom(){
            return build(from);
    }

    public NetworkPolicyPeer buildFrom(int index){
            return this.from.get(index).build();
    }

    public NetworkPolicyPeer buildFirstFrom(){
            return this.from.get(0).build();
    }

    public NetworkPolicyPeer buildLastFrom(){
            return this.from.get(from.size() - 1).build();
    }

    public NetworkPolicyPeer buildMatchingFrom(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate){
            for (NetworkPolicyPeerBuilder item: from) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withFrom(List<NetworkPolicyPeer> from){
            if (this.from != null) { _visitables.removeAll(this.from);}
            if (from != null) {this.from = new ArrayList<NetworkPolicyPeerBuilder>(); for (NetworkPolicyPeer item : from){this.addToFrom(item);}} else { this.from = new ArrayList<NetworkPolicyPeerBuilder>();} return (A) this;
    }

    public A withFrom(NetworkPolicyPeer... from){
            if (this.from != null) {this.from.clear();}
            if (from != null) {for (NetworkPolicyPeer item :from){ this.addToFrom(item);}} return (A) this;
    }

    public Boolean hasFrom(){
            return from != null && !from.isEmpty();
    }

    public NetworkPolicyIngressRuleFluent.FromNested<A> addNewFrom(){
            return new FromNestedImpl();
    }

    public NetworkPolicyIngressRuleFluent.FromNested<A> addNewFromLike(NetworkPolicyPeer item){
            return new FromNestedImpl(-1, item);
    }

    public NetworkPolicyIngressRuleFluent.FromNested<A> setNewFromLike(int index,NetworkPolicyPeer item){
            return new FromNestedImpl(index, item);
    }

    public NetworkPolicyIngressRuleFluent.FromNested<A> editFrom(int index){
            if (from.size() <= index) throw new RuntimeException("Can't edit from. Index exceeds size.");
            return setNewFromLike(index, buildFrom(index));
    }

    public NetworkPolicyIngressRuleFluent.FromNested<A> editFirstFrom(){
            if (from.size() == 0) throw new RuntimeException("Can't edit first from. The list is empty.");
            return setNewFromLike(0, buildFrom(0));
    }

    public NetworkPolicyIngressRuleFluent.FromNested<A> editLastFrom(){
            int index = from.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last from. The list is empty.");
            return setNewFromLike(index, buildFrom(index));
    }

    public NetworkPolicyIngressRuleFluent.FromNested<A> editMatchingFrom(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPeerBuilder> predicate){
            int index = -1;
            for (int i=0;i<from.size();i++) { 
            if (predicate.apply(from.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching from. No match found.");
            return setNewFromLike(index, buildFrom(index));
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

    public NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPort(){
            return new PortsNestedImpl();
    }

    public NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPortLike(NetworkPolicyPort item){
            return new PortsNestedImpl(-1, item);
    }

    public NetworkPolicyIngressRuleFluent.PortsNested<A> setNewPortLike(int index,NetworkPolicyPort item){
            return new PortsNestedImpl(index, item);
    }

    public NetworkPolicyIngressRuleFluent.PortsNested<A> editPort(int index){
            if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
            return setNewPortLike(index, buildPort(index));
    }

    public NetworkPolicyIngressRuleFluent.PortsNested<A> editFirstPort(){
            if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
            return setNewPortLike(0, buildPort(0));
    }

    public NetworkPolicyIngressRuleFluent.PortsNested<A> editLastPort(){
            int index = ports.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
            return setNewPortLike(index, buildPort(index));
    }

    public NetworkPolicyIngressRuleFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyPortBuilder> predicate){
            int index = -1;
            for (int i=0;i<ports.size();i++) { 
            if (predicate.apply(ports.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
            return setNewPortLike(index, buildPort(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyIngressRuleFluentImpl that = (NetworkPolicyIngressRuleFluentImpl) o;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends NetworkPolicyPeerFluentImpl<NetworkPolicyIngressRuleFluent.FromNested<N>> implements NetworkPolicyIngressRuleFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyPeerBuilder builder;
        private final int index;
    
            FromNestedImpl(int index,NetworkPolicyPeer item){
                    this.index = index;
                    this.builder = new NetworkPolicyPeerBuilder(this, item);
            }
            FromNestedImpl(){
                    this.index = -1;
                    this.builder = new NetworkPolicyPeerBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicyIngressRuleFluentImpl.this.setToFrom(index, builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class PortsNestedImpl<N> extends NetworkPolicyPortFluentImpl<NetworkPolicyIngressRuleFluent.PortsNested<N>> implements NetworkPolicyIngressRuleFluent.PortsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

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
            return (N) NetworkPolicyIngressRuleFluentImpl.this.setToPorts(index, builder.build());
    }
    public N endPort(){
            return and();
    }

}


}
