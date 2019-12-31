package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class EndpointSubsetFluentImpl<A extends EndpointSubsetFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EndpointSubsetFluent<A>{

    private List<EndpointAddressBuilder> addresses;
    private List<EndpointAddressBuilder> notReadyAddresses;
    private List<EndpointPortBuilder> ports;

    public EndpointSubsetFluentImpl(){
    }
    public EndpointSubsetFluentImpl(EndpointSubset instance){
            this.withAddresses(instance.getAddresses()); 
            this.withNotReadyAddresses(instance.getNotReadyAddresses()); 
            this.withPorts(instance.getPorts()); 
    }

    public A addToAddresses(int index,EndpointAddress item){
            if (this.addresses == null) {this.addresses = new ArrayList<EndpointAddressBuilder>();}
            EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.addresses.add(index >= 0 ? index : addresses.size(), builder); return (A)this;
    }

    public A setToAddresses(int index,EndpointAddress item){
            if (this.addresses == null) {this.addresses = new ArrayList<EndpointAddressBuilder>();}
            EndpointAddressBuilder builder = new EndpointAddressBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= addresses.size()) { addresses.add(builder); } else { addresses.set(index, builder);}
             return (A)this;
    }

    public A addToAddresses(EndpointAddress... items){
            if (this.addresses == null) {this.addresses = new ArrayList<EndpointAddressBuilder>();}
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.add(builder);this.addresses.add(builder);} return (A)this;
    }

    public A addAllToAddresses(Collection<EndpointAddress> items){
            if (this.addresses == null) {this.addresses = new ArrayList<EndpointAddressBuilder>();}
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.add(builder);this.addresses.add(builder);} return (A)this;
    }

    public A removeFromAddresses(EndpointAddress... items){
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
    }

    public A removeAllFromAddresses(Collection<EndpointAddress> items){
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAddresses instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointAddress> getAddresses(){
            return build(addresses);
    }

    public List<EndpointAddress> buildAddresses(){
            return build(addresses);
    }

    public EndpointAddress buildAddress(int index){
            return this.addresses.get(index).build();
    }

    public EndpointAddress buildFirstAddress(){
            return this.addresses.get(0).build();
    }

    public EndpointAddress buildLastAddress(){
            return this.addresses.get(addresses.size() - 1).build();
    }

    public EndpointAddress buildMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate){
            for (EndpointAddressBuilder item: addresses) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAddresses(List<EndpointAddress> addresses){
            if (this.addresses != null) { _visitables.removeAll(this.addresses);}
            if (addresses != null) {this.addresses = new ArrayList<EndpointAddressBuilder>(); for (EndpointAddress item : addresses){this.addToAddresses(item);}} else { this.addresses = new ArrayList<EndpointAddressBuilder>();} return (A) this;
    }

    public A withAddresses(EndpointAddress... addresses){
            if (this.addresses != null) {this.addresses.clear();}
            if (addresses != null) {for (EndpointAddress item :addresses){ this.addToAddresses(item);}} return (A) this;
    }

    public Boolean hasAddresses(){
            return addresses != null && !addresses.isEmpty();
    }

    public EndpointSubsetFluent.AddressesNested<A> addNewAddress(){
            return new AddressesNestedImpl();
    }

    public EndpointSubsetFluent.AddressesNested<A> addNewAddressLike(EndpointAddress item){
            return new AddressesNestedImpl(-1, item);
    }

    public EndpointSubsetFluent.AddressesNested<A> setNewAddressLike(int index,EndpointAddress item){
            return new AddressesNestedImpl(index, item);
    }

    public EndpointSubsetFluent.AddressesNested<A> editAddress(int index){
            if (addresses.size() <= index) throw new RuntimeException("Can't edit addresses. Index exceeds size.");
            return setNewAddressLike(index, buildAddress(index));
    }

    public EndpointSubsetFluent.AddressesNested<A> editFirstAddress(){
            if (addresses.size() == 0) throw new RuntimeException("Can't edit first addresses. The list is empty.");
            return setNewAddressLike(0, buildAddress(0));
    }

    public EndpointSubsetFluent.AddressesNested<A> editLastAddress(){
            int index = addresses.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last addresses. The list is empty.");
            return setNewAddressLike(index, buildAddress(index));
    }

    public EndpointSubsetFluent.AddressesNested<A> editMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate){
            int index = -1;
            for (int i=0;i<addresses.size();i++) { 
            if (predicate.apply(addresses.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching addresses. No match found.");
            return setNewAddressLike(index, buildAddress(index));
    }

    public A addToNotReadyAddresses(int index,EndpointAddress item){
            if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<EndpointAddressBuilder>();}
            EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.notReadyAddresses.add(index >= 0 ? index : notReadyAddresses.size(), builder); return (A)this;
    }

    public A setToNotReadyAddresses(int index,EndpointAddress item){
            if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<EndpointAddressBuilder>();}
            EndpointAddressBuilder builder = new EndpointAddressBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= notReadyAddresses.size()) { notReadyAddresses.add(builder); } else { notReadyAddresses.set(index, builder);}
             return (A)this;
    }

    public A addToNotReadyAddresses(EndpointAddress... items){
            if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<EndpointAddressBuilder>();}
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.add(builder);this.notReadyAddresses.add(builder);} return (A)this;
    }

    public A addAllToNotReadyAddresses(Collection<EndpointAddress> items){
            if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<EndpointAddressBuilder>();}
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.add(builder);this.notReadyAddresses.add(builder);} return (A)this;
    }

    public A removeFromNotReadyAddresses(EndpointAddress... items){
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.remove(builder);if (this.notReadyAddresses != null) {this.notReadyAddresses.remove(builder);}} return (A)this;
    }

    public A removeAllFromNotReadyAddresses(Collection<EndpointAddress> items){
            for (EndpointAddress item : items) {EndpointAddressBuilder builder = new EndpointAddressBuilder(item);_visitables.remove(builder);if (this.notReadyAddresses != null) {this.notReadyAddresses.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildNotReadyAddresses instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointAddress> getNotReadyAddresses(){
            return build(notReadyAddresses);
    }

    public List<EndpointAddress> buildNotReadyAddresses(){
            return build(notReadyAddresses);
    }

    public EndpointAddress buildNotReadyAddress(int index){
            return this.notReadyAddresses.get(index).build();
    }

    public EndpointAddress buildFirstNotReadyAddress(){
            return this.notReadyAddresses.get(0).build();
    }

    public EndpointAddress buildLastNotReadyAddress(){
            return this.notReadyAddresses.get(notReadyAddresses.size() - 1).build();
    }

    public EndpointAddress buildMatchingNotReadyAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate){
            for (EndpointAddressBuilder item: notReadyAddresses) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withNotReadyAddresses(List<EndpointAddress> notReadyAddresses){
            if (this.notReadyAddresses != null) { _visitables.removeAll(this.notReadyAddresses);}
            if (notReadyAddresses != null) {this.notReadyAddresses = new ArrayList<EndpointAddressBuilder>(); for (EndpointAddress item : notReadyAddresses){this.addToNotReadyAddresses(item);}} else { this.notReadyAddresses = new ArrayList<EndpointAddressBuilder>();} return (A) this;
    }

    public A withNotReadyAddresses(EndpointAddress... notReadyAddresses){
            if (this.notReadyAddresses != null) {this.notReadyAddresses.clear();}
            if (notReadyAddresses != null) {for (EndpointAddress item :notReadyAddresses){ this.addToNotReadyAddresses(item);}} return (A) this;
    }

    public Boolean hasNotReadyAddresses(){
            return notReadyAddresses != null && !notReadyAddresses.isEmpty();
    }

    public EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddress(){
            return new NotReadyAddressesNestedImpl();
    }

    public EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddressLike(EndpointAddress item){
            return new NotReadyAddressesNestedImpl(-1, item);
    }

    public EndpointSubsetFluent.NotReadyAddressesNested<A> setNewNotReadyAddressLike(int index,EndpointAddress item){
            return new NotReadyAddressesNestedImpl(index, item);
    }

    public EndpointSubsetFluent.NotReadyAddressesNested<A> editNotReadyAddress(int index){
            if (notReadyAddresses.size() <= index) throw new RuntimeException("Can't edit notReadyAddresses. Index exceeds size.");
            return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
    }

    public EndpointSubsetFluent.NotReadyAddressesNested<A> editFirstNotReadyAddress(){
            if (notReadyAddresses.size() == 0) throw new RuntimeException("Can't edit first notReadyAddresses. The list is empty.");
            return setNewNotReadyAddressLike(0, buildNotReadyAddress(0));
    }

    public EndpointSubsetFluent.NotReadyAddressesNested<A> editLastNotReadyAddress(){
            int index = notReadyAddresses.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last notReadyAddresses. The list is empty.");
            return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
    }

    public EndpointSubsetFluent.NotReadyAddressesNested<A> editMatchingNotReadyAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate){
            int index = -1;
            for (int i=0;i<notReadyAddresses.size();i++) { 
            if (predicate.apply(notReadyAddresses.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching notReadyAddresses. No match found.");
            return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
    }

    public A addToPorts(int index,EndpointPort item){
            if (this.ports == null) {this.ports = new ArrayList<EndpointPortBuilder>();}
            EndpointPortBuilder builder = new EndpointPortBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
    }

    public A setToPorts(int index,EndpointPort item){
            if (this.ports == null) {this.ports = new ArrayList<EndpointPortBuilder>();}
            EndpointPortBuilder builder = new EndpointPortBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
             return (A)this;
    }

    public A addToPorts(EndpointPort... items){
            if (this.ports == null) {this.ports = new ArrayList<EndpointPortBuilder>();}
            for (EndpointPort item : items) {EndpointPortBuilder builder = new EndpointPortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A addAllToPorts(Collection<EndpointPort> items){
            if (this.ports == null) {this.ports = new ArrayList<EndpointPortBuilder>();}
            for (EndpointPort item : items) {EndpointPortBuilder builder = new EndpointPortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A removeFromPorts(EndpointPort... items){
            for (EndpointPort item : items) {EndpointPortBuilder builder = new EndpointPortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    public A removeAllFromPorts(Collection<EndpointPort> items){
            for (EndpointPort item : items) {EndpointPortBuilder builder = new EndpointPortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointPort> getPorts(){
            return build(ports);
    }

    public List<EndpointPort> buildPorts(){
            return build(ports);
    }

    public EndpointPort buildPort(int index){
            return this.ports.get(index).build();
    }

    public EndpointPort buildFirstPort(){
            return this.ports.get(0).build();
    }

    public EndpointPort buildLastPort(){
            return this.ports.get(ports.size() - 1).build();
    }

    public EndpointPort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<EndpointPortBuilder> predicate){
            for (EndpointPortBuilder item: ports) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPorts(List<EndpointPort> ports){
            if (this.ports != null) { _visitables.removeAll(this.ports);}
            if (ports != null) {this.ports = new ArrayList<EndpointPortBuilder>(); for (EndpointPort item : ports){this.addToPorts(item);}} else { this.ports = new ArrayList<EndpointPortBuilder>();} return (A) this;
    }

    public A withPorts(EndpointPort... ports){
            if (this.ports != null) {this.ports.clear();}
            if (ports != null) {for (EndpointPort item :ports){ this.addToPorts(item);}} return (A) this;
    }

    public Boolean hasPorts(){
            return ports != null && !ports.isEmpty();
    }

    public A addNewPort(String name,Integer port,String protocol){
            return (A)addToPorts(new EndpointPort(name, port, protocol));
    }

    public EndpointSubsetFluent.PortsNested<A> addNewPort(){
            return new PortsNestedImpl();
    }

    public EndpointSubsetFluent.PortsNested<A> addNewPortLike(EndpointPort item){
            return new PortsNestedImpl(-1, item);
    }

    public EndpointSubsetFluent.PortsNested<A> setNewPortLike(int index,EndpointPort item){
            return new PortsNestedImpl(index, item);
    }

    public EndpointSubsetFluent.PortsNested<A> editPort(int index){
            if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
            return setNewPortLike(index, buildPort(index));
    }

    public EndpointSubsetFluent.PortsNested<A> editFirstPort(){
            if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
            return setNewPortLike(0, buildPort(0));
    }

    public EndpointSubsetFluent.PortsNested<A> editLastPort(){
            int index = ports.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
            return setNewPortLike(index, buildPort(index));
    }

    public EndpointSubsetFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<EndpointPortBuilder> predicate){
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
            EndpointSubsetFluentImpl that = (EndpointSubsetFluentImpl) o;
            if (addresses != null ? !addresses.equals(that.addresses) :that.addresses != null) return false;
            if (notReadyAddresses != null ? !notReadyAddresses.equals(that.notReadyAddresses) :that.notReadyAddresses != null) return false;
            if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
            return true;
    }


    public class AddressesNestedImpl<N> extends EndpointAddressFluentImpl<EndpointSubsetFluent.AddressesNested<N>> implements EndpointSubsetFluent.AddressesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointAddressBuilder builder;
        private final int index;
    
            AddressesNestedImpl(int index,EndpointAddress item){
                    this.index = index;
                    this.builder = new EndpointAddressBuilder(this, item);
            }
            AddressesNestedImpl(){
                    this.index = -1;
                    this.builder = new EndpointAddressBuilder(this);
            }
    
    public N and(){
            return (N) EndpointSubsetFluentImpl.this.setToAddresses(index, builder.build());
    }
    public N endAddress(){
            return and();
    }

}
    public class NotReadyAddressesNestedImpl<N> extends EndpointAddressFluentImpl<EndpointSubsetFluent.NotReadyAddressesNested<N>> implements EndpointSubsetFluent.NotReadyAddressesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointAddressBuilder builder;
        private final int index;
    
            NotReadyAddressesNestedImpl(int index,EndpointAddress item){
                    this.index = index;
                    this.builder = new EndpointAddressBuilder(this, item);
            }
            NotReadyAddressesNestedImpl(){
                    this.index = -1;
                    this.builder = new EndpointAddressBuilder(this);
            }
    
    public N and(){
            return (N) EndpointSubsetFluentImpl.this.setToNotReadyAddresses(index, builder.build());
    }
    public N endNotReadyAddress(){
            return and();
    }

}
    public class PortsNestedImpl<N> extends EndpointPortFluentImpl<EndpointSubsetFluent.PortsNested<N>> implements EndpointSubsetFluent.PortsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EndpointPortBuilder builder;
        private final int index;
    
            PortsNestedImpl(int index,EndpointPort item){
                    this.index = index;
                    this.builder = new EndpointPortBuilder(this, item);
            }
            PortsNestedImpl(){
                    this.index = -1;
                    this.builder = new EndpointPortBuilder(this);
            }
    
    public N and(){
            return (N) EndpointSubsetFluentImpl.this.setToPorts(index, builder.build());
    }
    public N endPort(){
            return and();
    }

}


}
