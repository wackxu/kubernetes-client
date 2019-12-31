package io.fabric8.kubernetes.api.model;

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

public interface EndpointSubsetFluent<A extends EndpointSubsetFluent<A>> extends Fluent<A>{


    public A addToAddresses(int index,EndpointAddress item);
    public A setToAddresses(int index,EndpointAddress item);
    public A addToAddresses(EndpointAddress... items);
    public A addAllToAddresses(Collection<EndpointAddress> items);
    public A removeFromAddresses(EndpointAddress... items);
    public A removeAllFromAddresses(Collection<EndpointAddress> items);
    
/**
 * This method has been deprecated, please use method buildAddresses instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointAddress> getAddresses();
    public List<EndpointAddress> buildAddresses();
    public EndpointAddress buildAddress(int index);
    public EndpointAddress buildFirstAddress();
    public EndpointAddress buildLastAddress();
    public EndpointAddress buildMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate);
    public A withAddresses(List<EndpointAddress> addresses);
    public A withAddresses(EndpointAddress... addresses);
    public Boolean hasAddresses();
    public EndpointSubsetFluent.AddressesNested<A> addNewAddress();
    public EndpointSubsetFluent.AddressesNested<A> addNewAddressLike(EndpointAddress item);
    public EndpointSubsetFluent.AddressesNested<A> setNewAddressLike(int index,EndpointAddress item);
    public EndpointSubsetFluent.AddressesNested<A> editAddress(int index);
    public EndpointSubsetFluent.AddressesNested<A> editFirstAddress();
    public EndpointSubsetFluent.AddressesNested<A> editLastAddress();
    public EndpointSubsetFluent.AddressesNested<A> editMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate);
    public A addToNotReadyAddresses(int index,EndpointAddress item);
    public A setToNotReadyAddresses(int index,EndpointAddress item);
    public A addToNotReadyAddresses(EndpointAddress... items);
    public A addAllToNotReadyAddresses(Collection<EndpointAddress> items);
    public A removeFromNotReadyAddresses(EndpointAddress... items);
    public A removeAllFromNotReadyAddresses(Collection<EndpointAddress> items);
    
/**
 * This method has been deprecated, please use method buildNotReadyAddresses instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointAddress> getNotReadyAddresses();
    public List<EndpointAddress> buildNotReadyAddresses();
    public EndpointAddress buildNotReadyAddress(int index);
    public EndpointAddress buildFirstNotReadyAddress();
    public EndpointAddress buildLastNotReadyAddress();
    public EndpointAddress buildMatchingNotReadyAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate);
    public A withNotReadyAddresses(List<EndpointAddress> notReadyAddresses);
    public A withNotReadyAddresses(EndpointAddress... notReadyAddresses);
    public Boolean hasNotReadyAddresses();
    public EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddress();
    public EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddressLike(EndpointAddress item);
    public EndpointSubsetFluent.NotReadyAddressesNested<A> setNewNotReadyAddressLike(int index,EndpointAddress item);
    public EndpointSubsetFluent.NotReadyAddressesNested<A> editNotReadyAddress(int index);
    public EndpointSubsetFluent.NotReadyAddressesNested<A> editFirstNotReadyAddress();
    public EndpointSubsetFluent.NotReadyAddressesNested<A> editLastNotReadyAddress();
    public EndpointSubsetFluent.NotReadyAddressesNested<A> editMatchingNotReadyAddress(io.fabric8.kubernetes.api.builder.Predicate<EndpointAddressBuilder> predicate);
    public A addToPorts(int index,EndpointPort item);
    public A setToPorts(int index,EndpointPort item);
    public A addToPorts(EndpointPort... items);
    public A addAllToPorts(Collection<EndpointPort> items);
    public A removeFromPorts(EndpointPort... items);
    public A removeAllFromPorts(Collection<EndpointPort> items);
    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointPort> getPorts();
    public List<EndpointPort> buildPorts();
    public EndpointPort buildPort(int index);
    public EndpointPort buildFirstPort();
    public EndpointPort buildLastPort();
    public EndpointPort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<EndpointPortBuilder> predicate);
    public A withPorts(List<EndpointPort> ports);
    public A withPorts(EndpointPort... ports);
    public Boolean hasPorts();
    public A addNewPort(String name,Integer port,String protocol);
    public EndpointSubsetFluent.PortsNested<A> addNewPort();
    public EndpointSubsetFluent.PortsNested<A> addNewPortLike(EndpointPort item);
    public EndpointSubsetFluent.PortsNested<A> setNewPortLike(int index,EndpointPort item);
    public EndpointSubsetFluent.PortsNested<A> editPort(int index);
    public EndpointSubsetFluent.PortsNested<A> editFirstPort();
    public EndpointSubsetFluent.PortsNested<A> editLastPort();
    public EndpointSubsetFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<EndpointPortBuilder> predicate);

    public interface AddressesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointAddressFluent<EndpointSubsetFluent.AddressesNested<N>>{

        
    public N and();    public N endAddress();
}
    public interface NotReadyAddressesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointAddressFluent<EndpointSubsetFluent.NotReadyAddressesNested<N>>{

        
    public N and();    public N endNotReadyAddress();
}
    public interface PortsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointPortFluent<EndpointSubsetFluent.PortsNested<N>>{

        
    public N and();    public N endPort();
}


}
