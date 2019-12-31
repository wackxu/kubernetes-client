package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class ServiceSpecFluentImpl<A extends ServiceSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceSpecFluent<A>{

    private String clusterIP;
    private List<String> externalIPs;
    private String externalName;
    private String externalTrafficPolicy;
    private Integer healthCheckNodePort;
    private String loadBalancerIP;
    private List<String> loadBalancerSourceRanges;
    private List<ServicePortBuilder> ports;
    private Boolean publishNotReadyAddresses;
    private Map<String,String> selector;
    private String sessionAffinity;
    private SessionAffinityConfigBuilder sessionAffinityConfig;
    private String type;

    public ServiceSpecFluentImpl(){
    }
    public ServiceSpecFluentImpl(ServiceSpec instance){
            this.withClusterIP(instance.getClusterIP()); 
            this.withExternalIPs(instance.getExternalIPs()); 
            this.withExternalName(instance.getExternalName()); 
            this.withExternalTrafficPolicy(instance.getExternalTrafficPolicy()); 
            this.withHealthCheckNodePort(instance.getHealthCheckNodePort()); 
            this.withLoadBalancerIP(instance.getLoadBalancerIP()); 
            this.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges()); 
            this.withPorts(instance.getPorts()); 
            this.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses()); 
            this.withSelector(instance.getSelector()); 
            this.withSessionAffinity(instance.getSessionAffinity()); 
            this.withSessionAffinityConfig(instance.getSessionAffinityConfig()); 
            this.withType(instance.getType()); 
    }

    public String getClusterIP(){
            return this.clusterIP;
    }

    public A withClusterIP(String clusterIP){
            this.clusterIP=clusterIP; return (A) this;
    }

    public Boolean hasClusterIP(){
            return this.clusterIP != null;
    }

    public A addToExternalIPs(int index,String item){
            if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
            this.externalIPs.add(index, item);
            return (A)this;
    }

    public A setToExternalIPs(int index,String item){
            if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
            this.externalIPs.set(index, item); return (A)this;
    }

    public A addToExternalIPs(String... items){
            if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
            for (String item : items) {this.externalIPs.add(item);} return (A)this;
    }

    public A addAllToExternalIPs(Collection<String> items){
            if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
            for (String item : items) {this.externalIPs.add(item);} return (A)this;
    }

    public A removeFromExternalIPs(String... items){
            for (String item : items) {if (this.externalIPs!= null){ this.externalIPs.remove(item);}} return (A)this;
    }

    public A removeAllFromExternalIPs(Collection<String> items){
            for (String item : items) {if (this.externalIPs!= null){ this.externalIPs.remove(item);}} return (A)this;
    }

    public List<String> getExternalIPs(){
            return this.externalIPs;
    }

    public String getExternalIP(int index){
            return this.externalIPs.get(index);
    }

    public String getFirstExternalIP(){
            return this.externalIPs.get(0);
    }

    public String getLastExternalIP(){
            return this.externalIPs.get(externalIPs.size() - 1);
    }

    public String getMatchingExternalIP(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: externalIPs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withExternalIPs(List<String> externalIPs){
            if (this.externalIPs != null) { _visitables.removeAll(this.externalIPs);}
            if (externalIPs != null) {this.externalIPs = new ArrayList<String>(); for (String item : externalIPs){this.addToExternalIPs(item);}} else { this.externalIPs = new ArrayList<String>();} return (A) this;
    }

    public A withExternalIPs(String... externalIPs){
            if (this.externalIPs != null) {this.externalIPs.clear();}
            if (externalIPs != null) {for (String item :externalIPs){ this.addToExternalIPs(item);}} return (A) this;
    }

    public Boolean hasExternalIPs(){
            return externalIPs != null && !externalIPs.isEmpty();
    }

    public String getExternalName(){
            return this.externalName;
    }

    public A withExternalName(String externalName){
            this.externalName=externalName; return (A) this;
    }

    public Boolean hasExternalName(){
            return this.externalName != null;
    }

    public String getExternalTrafficPolicy(){
            return this.externalTrafficPolicy;
    }

    public A withExternalTrafficPolicy(String externalTrafficPolicy){
            this.externalTrafficPolicy=externalTrafficPolicy; return (A) this;
    }

    public Boolean hasExternalTrafficPolicy(){
            return this.externalTrafficPolicy != null;
    }

    public Integer getHealthCheckNodePort(){
            return this.healthCheckNodePort;
    }

    public A withHealthCheckNodePort(Integer healthCheckNodePort){
            this.healthCheckNodePort=healthCheckNodePort; return (A) this;
    }

    public Boolean hasHealthCheckNodePort(){
            return this.healthCheckNodePort != null;
    }

    public String getLoadBalancerIP(){
            return this.loadBalancerIP;
    }

    public A withLoadBalancerIP(String loadBalancerIP){
            this.loadBalancerIP=loadBalancerIP; return (A) this;
    }

    public Boolean hasLoadBalancerIP(){
            return this.loadBalancerIP != null;
    }

    public A addToLoadBalancerSourceRanges(int index,String item){
            if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
            this.loadBalancerSourceRanges.add(index, item);
            return (A)this;
    }

    public A setToLoadBalancerSourceRanges(int index,String item){
            if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
            this.loadBalancerSourceRanges.set(index, item); return (A)this;
    }

    public A addToLoadBalancerSourceRanges(String... items){
            if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
            for (String item : items) {this.loadBalancerSourceRanges.add(item);} return (A)this;
    }

    public A addAllToLoadBalancerSourceRanges(Collection<String> items){
            if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
            for (String item : items) {this.loadBalancerSourceRanges.add(item);} return (A)this;
    }

    public A removeFromLoadBalancerSourceRanges(String... items){
            for (String item : items) {if (this.loadBalancerSourceRanges!= null){ this.loadBalancerSourceRanges.remove(item);}} return (A)this;
    }

    public A removeAllFromLoadBalancerSourceRanges(Collection<String> items){
            for (String item : items) {if (this.loadBalancerSourceRanges!= null){ this.loadBalancerSourceRanges.remove(item);}} return (A)this;
    }

    public List<String> getLoadBalancerSourceRanges(){
            return this.loadBalancerSourceRanges;
    }

    public String getLoadBalancerSourceRange(int index){
            return this.loadBalancerSourceRanges.get(index);
    }

    public String getFirstLoadBalancerSourceRange(){
            return this.loadBalancerSourceRanges.get(0);
    }

    public String getLastLoadBalancerSourceRange(){
            return this.loadBalancerSourceRanges.get(loadBalancerSourceRanges.size() - 1);
    }

    public String getMatchingLoadBalancerSourceRange(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: loadBalancerSourceRanges) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges){
            if (this.loadBalancerSourceRanges != null) { _visitables.removeAll(this.loadBalancerSourceRanges);}
            if (loadBalancerSourceRanges != null) {this.loadBalancerSourceRanges = new ArrayList<String>(); for (String item : loadBalancerSourceRanges){this.addToLoadBalancerSourceRanges(item);}} else { this.loadBalancerSourceRanges = new ArrayList<String>();} return (A) this;
    }

    public A withLoadBalancerSourceRanges(String... loadBalancerSourceRanges){
            if (this.loadBalancerSourceRanges != null) {this.loadBalancerSourceRanges.clear();}
            if (loadBalancerSourceRanges != null) {for (String item :loadBalancerSourceRanges){ this.addToLoadBalancerSourceRanges(item);}} return (A) this;
    }

    public Boolean hasLoadBalancerSourceRanges(){
            return loadBalancerSourceRanges != null && !loadBalancerSourceRanges.isEmpty();
    }

    public A addToPorts(int index,ServicePort item){
            if (this.ports == null) {this.ports = new ArrayList<ServicePortBuilder>();}
            ServicePortBuilder builder = new ServicePortBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
    }

    public A setToPorts(int index,ServicePort item){
            if (this.ports == null) {this.ports = new ArrayList<ServicePortBuilder>();}
            ServicePortBuilder builder = new ServicePortBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
             return (A)this;
    }

    public A addToPorts(ServicePort... items){
            if (this.ports == null) {this.ports = new ArrayList<ServicePortBuilder>();}
            for (ServicePort item : items) {ServicePortBuilder builder = new ServicePortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A addAllToPorts(Collection<ServicePort> items){
            if (this.ports == null) {this.ports = new ArrayList<ServicePortBuilder>();}
            for (ServicePort item : items) {ServicePortBuilder builder = new ServicePortBuilder(item);_visitables.add(builder);this.ports.add(builder);} return (A)this;
    }

    public A removeFromPorts(ServicePort... items){
            for (ServicePort item : items) {ServicePortBuilder builder = new ServicePortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    public A removeAllFromPorts(Collection<ServicePort> items){
            for (ServicePort item : items) {ServicePortBuilder builder = new ServicePortBuilder(item);_visitables.remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<ServicePort> getPorts(){
            return build(ports);
    }

    public List<ServicePort> buildPorts(){
            return build(ports);
    }

    public ServicePort buildPort(int index){
            return this.ports.get(index).build();
    }

    public ServicePort buildFirstPort(){
            return this.ports.get(0).build();
    }

    public ServicePort buildLastPort(){
            return this.ports.get(ports.size() - 1).build();
    }

    public ServicePort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ServicePortBuilder> predicate){
            for (ServicePortBuilder item: ports) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPorts(List<ServicePort> ports){
            if (this.ports != null) { _visitables.removeAll(this.ports);}
            if (ports != null) {this.ports = new ArrayList<ServicePortBuilder>(); for (ServicePort item : ports){this.addToPorts(item);}} else { this.ports = new ArrayList<ServicePortBuilder>();} return (A) this;
    }

    public A withPorts(ServicePort... ports){
            if (this.ports != null) {this.ports.clear();}
            if (ports != null) {for (ServicePort item :ports){ this.addToPorts(item);}} return (A) this;
    }

    public Boolean hasPorts(){
            return ports != null && !ports.isEmpty();
    }

    public ServiceSpecFluent.PortsNested<A> addNewPort(){
            return new PortsNestedImpl();
    }

    public ServiceSpecFluent.PortsNested<A> addNewPortLike(ServicePort item){
            return new PortsNestedImpl(-1, item);
    }

    public ServiceSpecFluent.PortsNested<A> setNewPortLike(int index,ServicePort item){
            return new PortsNestedImpl(index, item);
    }

    public ServiceSpecFluent.PortsNested<A> editPort(int index){
            if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
            return setNewPortLike(index, buildPort(index));
    }

    public ServiceSpecFluent.PortsNested<A> editFirstPort(){
            if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
            return setNewPortLike(0, buildPort(0));
    }

    public ServiceSpecFluent.PortsNested<A> editLastPort(){
            int index = ports.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
            return setNewPortLike(index, buildPort(index));
    }

    public ServiceSpecFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ServicePortBuilder> predicate){
            int index = -1;
            for (int i=0;i<ports.size();i++) { 
            if (predicate.apply(ports.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
            return setNewPortLike(index, buildPort(index));
    }

    public Boolean isPublishNotReadyAddresses(){
            return this.publishNotReadyAddresses;
    }

    public A withPublishNotReadyAddresses(Boolean publishNotReadyAddresses){
            this.publishNotReadyAddresses=publishNotReadyAddresses; return (A) this;
    }

    public Boolean hasPublishNotReadyAddresses(){
            return this.publishNotReadyAddresses != null;
    }

    public A withNewPublishNotReadyAddresses(String arg1){
            return (A)withPublishNotReadyAddresses(new Boolean(arg1));
    }

    public A withNewPublishNotReadyAddresses(boolean arg1){
            return (A)withPublishNotReadyAddresses(new Boolean(arg1));
    }

    public A addToSelector(String key,String value){
            if(this.selector == null && key != null && value != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.selector.put(key, value);} return (A)this;
    }

    public A addToSelector(Map<String,String> map){
            if(this.selector == null && map != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(map != null) { this.selector.putAll(map);} return (A)this;
    }

    public A removeFromSelector(String key){
            if(this.selector == null) { return (A) this; }
            if(key != null && this.selector != null) {this.selector.remove(key);} return (A)this;
    }

    public A removeFromSelector(Map<String,String> map){
            if(this.selector == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.selector != null){this.selector.remove(key);}}} return (A)this;
    }

    public Map<String,String> getSelector(){
            return this.selector;
    }

    public A withSelector(Map<String,String> selector){
            if (selector == null) { this.selector =  new LinkedHashMap<String,String>();} else {this.selector = new LinkedHashMap<String,String>(selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    public String getSessionAffinity(){
            return this.sessionAffinity;
    }

    public A withSessionAffinity(String sessionAffinity){
            this.sessionAffinity=sessionAffinity; return (A) this;
    }

    public Boolean hasSessionAffinity(){
            return this.sessionAffinity != null;
    }

    
/**
 * This method has been deprecated, please use method buildSessionAffinityConfig instead.
 * @return The buildable object.
 */
@Deprecated public SessionAffinityConfig getSessionAffinityConfig(){
            return this.sessionAffinityConfig!=null?this.sessionAffinityConfig.build():null;
    }

    public SessionAffinityConfig buildSessionAffinityConfig(){
            return this.sessionAffinityConfig!=null?this.sessionAffinityConfig.build():null;
    }

    public A withSessionAffinityConfig(SessionAffinityConfig sessionAffinityConfig){
            _visitables.remove(this.sessionAffinityConfig);
            if (sessionAffinityConfig!=null){ this.sessionAffinityConfig= new SessionAffinityConfigBuilder(sessionAffinityConfig); _visitables.add(this.sessionAffinityConfig);} return (A) this;
    }

    public Boolean hasSessionAffinityConfig(){
            return this.sessionAffinityConfig != null;
    }

    public ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfig(){
            return new SessionAffinityConfigNestedImpl();
    }

    public ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfigLike(SessionAffinityConfig item){
            return new SessionAffinityConfigNestedImpl(item);
    }

    public ServiceSpecFluent.SessionAffinityConfigNested<A> editSessionAffinityConfig(){
            return withNewSessionAffinityConfigLike(getSessionAffinityConfig());
    }

    public ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfig(){
            return withNewSessionAffinityConfigLike(getSessionAffinityConfig() != null ? getSessionAffinityConfig(): new SessionAffinityConfigBuilder().build());
    }

    public ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfigLike(SessionAffinityConfig item){
            return withNewSessionAffinityConfigLike(getSessionAffinityConfig() != null ? getSessionAffinityConfig(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceSpecFluentImpl that = (ServiceSpecFluentImpl) o;
            if (clusterIP != null ? !clusterIP.equals(that.clusterIP) :that.clusterIP != null) return false;
            if (externalIPs != null ? !externalIPs.equals(that.externalIPs) :that.externalIPs != null) return false;
            if (externalName != null ? !externalName.equals(that.externalName) :that.externalName != null) return false;
            if (externalTrafficPolicy != null ? !externalTrafficPolicy.equals(that.externalTrafficPolicy) :that.externalTrafficPolicy != null) return false;
            if (healthCheckNodePort != null ? !healthCheckNodePort.equals(that.healthCheckNodePort) :that.healthCheckNodePort != null) return false;
            if (loadBalancerIP != null ? !loadBalancerIP.equals(that.loadBalancerIP) :that.loadBalancerIP != null) return false;
            if (loadBalancerSourceRanges != null ? !loadBalancerSourceRanges.equals(that.loadBalancerSourceRanges) :that.loadBalancerSourceRanges != null) return false;
            if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
            if (publishNotReadyAddresses != null ? !publishNotReadyAddresses.equals(that.publishNotReadyAddresses) :that.publishNotReadyAddresses != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (sessionAffinity != null ? !sessionAffinity.equals(that.sessionAffinity) :that.sessionAffinity != null) return false;
            if (sessionAffinityConfig != null ? !sessionAffinityConfig.equals(that.sessionAffinityConfig) :that.sessionAffinityConfig != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class PortsNestedImpl<N> extends ServicePortFluentImpl<ServiceSpecFluent.PortsNested<N>> implements ServiceSpecFluent.PortsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServicePortBuilder builder;
        private final int index;
    
            PortsNestedImpl(int index,ServicePort item){
                    this.index = index;
                    this.builder = new ServicePortBuilder(this, item);
            }
            PortsNestedImpl(){
                    this.index = -1;
                    this.builder = new ServicePortBuilder(this);
            }
    
    public N and(){
            return (N) ServiceSpecFluentImpl.this.setToPorts(index, builder.build());
    }
    public N endPort(){
            return and();
    }

}
    public class SessionAffinityConfigNestedImpl<N> extends SessionAffinityConfigFluentImpl<ServiceSpecFluent.SessionAffinityConfigNested<N>> implements ServiceSpecFluent.SessionAffinityConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SessionAffinityConfigBuilder builder;
    
            SessionAffinityConfigNestedImpl(SessionAffinityConfig item){
                    this.builder = new SessionAffinityConfigBuilder(this, item);
            }
            SessionAffinityConfigNestedImpl(){
                    this.builder = new SessionAffinityConfigBuilder(this);
            }
    
    public N and(){
            return (N) ServiceSpecFluentImpl.this.withSessionAffinityConfig(builder.build());
    }
    public N endSessionAffinityConfig(){
            return and();
    }

}


}
