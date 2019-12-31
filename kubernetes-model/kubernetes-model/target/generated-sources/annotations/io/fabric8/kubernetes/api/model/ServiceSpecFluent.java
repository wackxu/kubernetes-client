package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ServiceSpecFluent<A extends ServiceSpecFluent<A>> extends Fluent<A>{


    public String getClusterIP();
    public A withClusterIP(String clusterIP);
    public Boolean hasClusterIP();
    public A addToExternalIPs(int index,String item);
    public A setToExternalIPs(int index,String item);
    public A addToExternalIPs(String... items);
    public A addAllToExternalIPs(Collection<String> items);
    public A removeFromExternalIPs(String... items);
    public A removeAllFromExternalIPs(Collection<String> items);
    public List<String> getExternalIPs();
    public String getExternalIP(int index);
    public String getFirstExternalIP();
    public String getLastExternalIP();
    public String getMatchingExternalIP(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withExternalIPs(List<String> externalIPs);
    public A withExternalIPs(String... externalIPs);
    public Boolean hasExternalIPs();
    public String getExternalName();
    public A withExternalName(String externalName);
    public Boolean hasExternalName();
    public String getExternalTrafficPolicy();
    public A withExternalTrafficPolicy(String externalTrafficPolicy);
    public Boolean hasExternalTrafficPolicy();
    public Integer getHealthCheckNodePort();
    public A withHealthCheckNodePort(Integer healthCheckNodePort);
    public Boolean hasHealthCheckNodePort();
    public String getLoadBalancerIP();
    public A withLoadBalancerIP(String loadBalancerIP);
    public Boolean hasLoadBalancerIP();
    public A addToLoadBalancerSourceRanges(int index,String item);
    public A setToLoadBalancerSourceRanges(int index,String item);
    public A addToLoadBalancerSourceRanges(String... items);
    public A addAllToLoadBalancerSourceRanges(Collection<String> items);
    public A removeFromLoadBalancerSourceRanges(String... items);
    public A removeAllFromLoadBalancerSourceRanges(Collection<String> items);
    public List<String> getLoadBalancerSourceRanges();
    public String getLoadBalancerSourceRange(int index);
    public String getFirstLoadBalancerSourceRange();
    public String getLastLoadBalancerSourceRange();
    public String getMatchingLoadBalancerSourceRange(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges);
    public A withLoadBalancerSourceRanges(String... loadBalancerSourceRanges);
    public Boolean hasLoadBalancerSourceRanges();
    public A addToPorts(int index,ServicePort item);
    public A setToPorts(int index,ServicePort item);
    public A addToPorts(ServicePort... items);
    public A addAllToPorts(Collection<ServicePort> items);
    public A removeFromPorts(ServicePort... items);
    public A removeAllFromPorts(Collection<ServicePort> items);
    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<ServicePort> getPorts();
    public List<ServicePort> buildPorts();
    public ServicePort buildPort(int index);
    public ServicePort buildFirstPort();
    public ServicePort buildLastPort();
    public ServicePort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ServicePortBuilder> predicate);
    public A withPorts(List<ServicePort> ports);
    public A withPorts(ServicePort... ports);
    public Boolean hasPorts();
    public ServiceSpecFluent.PortsNested<A> addNewPort();
    public ServiceSpecFluent.PortsNested<A> addNewPortLike(ServicePort item);
    public ServiceSpecFluent.PortsNested<A> setNewPortLike(int index,ServicePort item);
    public ServiceSpecFluent.PortsNested<A> editPort(int index);
    public ServiceSpecFluent.PortsNested<A> editFirstPort();
    public ServiceSpecFluent.PortsNested<A> editLastPort();
    public ServiceSpecFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ServicePortBuilder> predicate);
    public Boolean isPublishNotReadyAddresses();
    public A withPublishNotReadyAddresses(Boolean publishNotReadyAddresses);
    public Boolean hasPublishNotReadyAddresses();
    public A withNewPublishNotReadyAddresses(String arg1);
    public A withNewPublishNotReadyAddresses(boolean arg1);
    public A addToSelector(String key,String value);
    public A addToSelector(Map<String,String> map);
    public A removeFromSelector(String key);
    public A removeFromSelector(Map<String,String> map);
    public Map<String,String> getSelector();
    public A withSelector(Map<String,String> selector);
    public Boolean hasSelector();
    public String getSessionAffinity();
    public A withSessionAffinity(String sessionAffinity);
    public Boolean hasSessionAffinity();
    
/**
 * This method has been deprecated, please use method buildSessionAffinityConfig instead.
 * @return The buildable object.
 */
@Deprecated public SessionAffinityConfig getSessionAffinityConfig();
    public SessionAffinityConfig buildSessionAffinityConfig();
    public A withSessionAffinityConfig(SessionAffinityConfig sessionAffinityConfig);
    public Boolean hasSessionAffinityConfig();
    public ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfig();
    public ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfigLike(SessionAffinityConfig item);
    public ServiceSpecFluent.SessionAffinityConfigNested<A> editSessionAffinityConfig();
    public ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfig();
    public ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfigLike(SessionAffinityConfig item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface PortsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServicePortFluent<ServiceSpecFluent.PortsNested<N>>{

        
    public N and();    public N endPort();
}
    public interface SessionAffinityConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SessionAffinityConfigFluent<ServiceSpecFluent.SessionAffinityConfigNested<N>>{

        
    public N and();    public N endSessionAffinityConfig();
}


}
