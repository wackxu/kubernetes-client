package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import java.lang.Integer;

public class PodSpecFluentImpl<A extends PodSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodSpecFluent<A>{

    private Long activeDeadlineSeconds;
    private AffinityBuilder affinity;
    private Boolean automountServiceAccountToken;
    private List<ContainerBuilder> containers;
    private PodDNSConfigBuilder dnsConfig;
    private String dnsPolicy;
    private Boolean enableServiceLinks;
    private List<HostAliasBuilder> hostAliases;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private String hostname;
    private List<LocalObjectReferenceBuilder> imagePullSecrets;
    private List<ContainerBuilder> initContainers;
    private String nodeName;
    private Map<String,String> nodeSelector;
    private Integer priority;
    private String priorityClassName;
    private List<PodReadinessGateBuilder> readinessGates;
    private String restartPolicy;
    private String runtimeClassName;
    private String schedulerName;
    private PodSecurityContextBuilder securityContext;
    private String serviceAccount;
    private String serviceAccountName;
    private Boolean shareProcessNamespace;
    private String subdomain;
    private Long terminationGracePeriodSeconds;
    private List<TolerationBuilder> tolerations;
    private List<VolumeBuilder> volumes;

    public PodSpecFluentImpl(){
    }
    public PodSpecFluentImpl(PodSpec instance){
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withAffinity(instance.getAffinity()); 
            this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            this.withContainers(instance.getContainers()); 
            this.withDnsConfig(instance.getDnsConfig()); 
            this.withDnsPolicy(instance.getDnsPolicy()); 
            this.withEnableServiceLinks(instance.getEnableServiceLinks()); 
            this.withHostAliases(instance.getHostAliases()); 
            this.withHostIPC(instance.getHostIPC()); 
            this.withHostNetwork(instance.getHostNetwork()); 
            this.withHostPID(instance.getHostPID()); 
            this.withHostname(instance.getHostname()); 
            this.withImagePullSecrets(instance.getImagePullSecrets()); 
            this.withInitContainers(instance.getInitContainers()); 
            this.withNodeName(instance.getNodeName()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withPriority(instance.getPriority()); 
            this.withPriorityClassName(instance.getPriorityClassName()); 
            this.withReadinessGates(instance.getReadinessGates()); 
            this.withRestartPolicy(instance.getRestartPolicy()); 
            this.withRuntimeClassName(instance.getRuntimeClassName()); 
            this.withSchedulerName(instance.getSchedulerName()); 
            this.withSecurityContext(instance.getSecurityContext()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withServiceAccountName(instance.getServiceAccountName()); 
            this.withShareProcessNamespace(instance.getShareProcessNamespace()); 
            this.withSubdomain(instance.getSubdomain()); 
            this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds()); 
            this.withTolerations(instance.getTolerations()); 
            this.withVolumes(instance.getVolumes()); 
    }

    public Long getActiveDeadlineSeconds(){
            return this.activeDeadlineSeconds;
    }

    public A withActiveDeadlineSeconds(Long activeDeadlineSeconds){
            this.activeDeadlineSeconds=activeDeadlineSeconds; return (A) this;
    }

    public Boolean hasActiveDeadlineSeconds(){
            return this.activeDeadlineSeconds != null;
    }

    public A withNewActiveDeadlineSeconds(String arg1){
            return (A)withActiveDeadlineSeconds(new Long(arg1));
    }

    public A withNewActiveDeadlineSeconds(long arg1){
            return (A)withActiveDeadlineSeconds(new Long(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildAffinity instead.
 * @return The buildable object.
 */
@Deprecated public Affinity getAffinity(){
            return this.affinity!=null?this.affinity.build():null;
    }

    public Affinity buildAffinity(){
            return this.affinity!=null?this.affinity.build():null;
    }

    public A withAffinity(Affinity affinity){
            _visitables.remove(this.affinity);
            if (affinity!=null){ this.affinity= new AffinityBuilder(affinity); _visitables.add(this.affinity);} return (A) this;
    }

    public Boolean hasAffinity(){
            return this.affinity != null;
    }

    public PodSpecFluent.AffinityNested<A> withNewAffinity(){
            return new AffinityNestedImpl();
    }

    public PodSpecFluent.AffinityNested<A> withNewAffinityLike(Affinity item){
            return new AffinityNestedImpl(item);
    }

    public PodSpecFluent.AffinityNested<A> editAffinity(){
            return withNewAffinityLike(getAffinity());
    }

    public PodSpecFluent.AffinityNested<A> editOrNewAffinity(){
            return withNewAffinityLike(getAffinity() != null ? getAffinity(): new AffinityBuilder().build());
    }

    public PodSpecFluent.AffinityNested<A> editOrNewAffinityLike(Affinity item){
            return withNewAffinityLike(getAffinity() != null ? getAffinity(): item);
    }

    public Boolean isAutomountServiceAccountToken(){
            return this.automountServiceAccountToken;
    }

    public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken){
            this.automountServiceAccountToken=automountServiceAccountToken; return (A) this;
    }

    public Boolean hasAutomountServiceAccountToken(){
            return this.automountServiceAccountToken != null;
    }

    public A withNewAutomountServiceAccountToken(String arg1){
            return (A)withAutomountServiceAccountToken(new Boolean(arg1));
    }

    public A withNewAutomountServiceAccountToken(boolean arg1){
            return (A)withAutomountServiceAccountToken(new Boolean(arg1));
    }

    public A addToContainers(int index,Container item){
            if (this.containers == null) {this.containers = new ArrayList<ContainerBuilder>();}
            ContainerBuilder builder = new ContainerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.containers.add(index >= 0 ? index : containers.size(), builder); return (A)this;
    }

    public A setToContainers(int index,Container item){
            if (this.containers == null) {this.containers = new ArrayList<ContainerBuilder>();}
            ContainerBuilder builder = new ContainerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= containers.size()) { containers.add(builder); } else { containers.set(index, builder);}
             return (A)this;
    }

    public A addToContainers(Container... items){
            if (this.containers == null) {this.containers = new ArrayList<ContainerBuilder>();}
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.add(builder);this.containers.add(builder);} return (A)this;
    }

    public A addAllToContainers(Collection<Container> items){
            if (this.containers == null) {this.containers = new ArrayList<ContainerBuilder>();}
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.add(builder);this.containers.add(builder);} return (A)this;
    }

    public A removeFromContainers(Container... items){
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.remove(builder);if (this.containers != null) {this.containers.remove(builder);}} return (A)this;
    }

    public A removeAllFromContainers(Collection<Container> items){
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.remove(builder);if (this.containers != null) {this.containers.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildContainers instead.
 * @return The buildable object.
 */
@Deprecated public List<Container> getContainers(){
            return build(containers);
    }

    public List<Container> buildContainers(){
            return build(containers);
    }

    public Container buildContainer(int index){
            return this.containers.get(index).build();
    }

    public Container buildFirstContainer(){
            return this.containers.get(0).build();
    }

    public Container buildLastContainer(){
            return this.containers.get(containers.size() - 1).build();
    }

    public Container buildMatchingContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate){
            for (ContainerBuilder item: containers) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withContainers(List<Container> containers){
            if (this.containers != null) { _visitables.removeAll(this.containers);}
            if (containers != null) {this.containers = new ArrayList<ContainerBuilder>(); for (Container item : containers){this.addToContainers(item);}} else { this.containers = new ArrayList<ContainerBuilder>();} return (A) this;
    }

    public A withContainers(Container... containers){
            if (this.containers != null) {this.containers.clear();}
            if (containers != null) {for (Container item :containers){ this.addToContainers(item);}} return (A) this;
    }

    public Boolean hasContainers(){
            return containers != null && !containers.isEmpty();
    }

    public PodSpecFluent.ContainersNested<A> addNewContainer(){
            return new ContainersNestedImpl();
    }

    public PodSpecFluent.ContainersNested<A> addNewContainerLike(Container item){
            return new ContainersNestedImpl(-1, item);
    }

    public PodSpecFluent.ContainersNested<A> setNewContainerLike(int index,Container item){
            return new ContainersNestedImpl(index, item);
    }

    public PodSpecFluent.ContainersNested<A> editContainer(int index){
            if (containers.size() <= index) throw new RuntimeException("Can't edit containers. Index exceeds size.");
            return setNewContainerLike(index, buildContainer(index));
    }

    public PodSpecFluent.ContainersNested<A> editFirstContainer(){
            if (containers.size() == 0) throw new RuntimeException("Can't edit first containers. The list is empty.");
            return setNewContainerLike(0, buildContainer(0));
    }

    public PodSpecFluent.ContainersNested<A> editLastContainer(){
            int index = containers.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last containers. The list is empty.");
            return setNewContainerLike(index, buildContainer(index));
    }

    public PodSpecFluent.ContainersNested<A> editMatchingContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate){
            int index = -1;
            for (int i=0;i<containers.size();i++) { 
            if (predicate.apply(containers.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching containers. No match found.");
            return setNewContainerLike(index, buildContainer(index));
    }

    
/**
 * This method has been deprecated, please use method buildDnsConfig instead.
 * @return The buildable object.
 */
@Deprecated public PodDNSConfig getDnsConfig(){
            return this.dnsConfig!=null?this.dnsConfig.build():null;
    }

    public PodDNSConfig buildDnsConfig(){
            return this.dnsConfig!=null?this.dnsConfig.build():null;
    }

    public A withDnsConfig(PodDNSConfig dnsConfig){
            _visitables.remove(this.dnsConfig);
            if (dnsConfig!=null){ this.dnsConfig= new PodDNSConfigBuilder(dnsConfig); _visitables.add(this.dnsConfig);} return (A) this;
    }

    public Boolean hasDnsConfig(){
            return this.dnsConfig != null;
    }

    public PodSpecFluent.DnsConfigNested<A> withNewDnsConfig(){
            return new DnsConfigNestedImpl();
    }

    public PodSpecFluent.DnsConfigNested<A> withNewDnsConfigLike(PodDNSConfig item){
            return new DnsConfigNestedImpl(item);
    }

    public PodSpecFluent.DnsConfigNested<A> editDnsConfig(){
            return withNewDnsConfigLike(getDnsConfig());
    }

    public PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfig(){
            return withNewDnsConfigLike(getDnsConfig() != null ? getDnsConfig(): new PodDNSConfigBuilder().build());
    }

    public PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfigLike(PodDNSConfig item){
            return withNewDnsConfigLike(getDnsConfig() != null ? getDnsConfig(): item);
    }

    public String getDnsPolicy(){
            return this.dnsPolicy;
    }

    public A withDnsPolicy(String dnsPolicy){
            this.dnsPolicy=dnsPolicy; return (A) this;
    }

    public Boolean hasDnsPolicy(){
            return this.dnsPolicy != null;
    }

    public Boolean isEnableServiceLinks(){
            return this.enableServiceLinks;
    }

    public A withEnableServiceLinks(Boolean enableServiceLinks){
            this.enableServiceLinks=enableServiceLinks; return (A) this;
    }

    public Boolean hasEnableServiceLinks(){
            return this.enableServiceLinks != null;
    }

    public A withNewEnableServiceLinks(String arg1){
            return (A)withEnableServiceLinks(new Boolean(arg1));
    }

    public A withNewEnableServiceLinks(boolean arg1){
            return (A)withEnableServiceLinks(new Boolean(arg1));
    }

    public A addToHostAliases(int index,HostAlias item){
            if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasBuilder>();}
            HostAliasBuilder builder = new HostAliasBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.hostAliases.add(index >= 0 ? index : hostAliases.size(), builder); return (A)this;
    }

    public A setToHostAliases(int index,HostAlias item){
            if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasBuilder>();}
            HostAliasBuilder builder = new HostAliasBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= hostAliases.size()) { hostAliases.add(builder); } else { hostAliases.set(index, builder);}
             return (A)this;
    }

    public A addToHostAliases(HostAlias... items){
            if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasBuilder>();}
            for (HostAlias item : items) {HostAliasBuilder builder = new HostAliasBuilder(item);_visitables.add(builder);this.hostAliases.add(builder);} return (A)this;
    }

    public A addAllToHostAliases(Collection<HostAlias> items){
            if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasBuilder>();}
            for (HostAlias item : items) {HostAliasBuilder builder = new HostAliasBuilder(item);_visitables.add(builder);this.hostAliases.add(builder);} return (A)this;
    }

    public A removeFromHostAliases(HostAlias... items){
            for (HostAlias item : items) {HostAliasBuilder builder = new HostAliasBuilder(item);_visitables.remove(builder);if (this.hostAliases != null) {this.hostAliases.remove(builder);}} return (A)this;
    }

    public A removeAllFromHostAliases(Collection<HostAlias> items){
            for (HostAlias item : items) {HostAliasBuilder builder = new HostAliasBuilder(item);_visitables.remove(builder);if (this.hostAliases != null) {this.hostAliases.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildHostAliases instead.
 * @return The buildable object.
 */
@Deprecated public List<HostAlias> getHostAliases(){
            return build(hostAliases);
    }

    public List<HostAlias> buildHostAliases(){
            return build(hostAliases);
    }

    public HostAlias buildHostAlias(int index){
            return this.hostAliases.get(index).build();
    }

    public HostAlias buildFirstHostAlias(){
            return this.hostAliases.get(0).build();
    }

    public HostAlias buildLastHostAlias(){
            return this.hostAliases.get(hostAliases.size() - 1).build();
    }

    public HostAlias buildMatchingHostAlias(io.fabric8.kubernetes.api.builder.Predicate<HostAliasBuilder> predicate){
            for (HostAliasBuilder item: hostAliases) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withHostAliases(List<HostAlias> hostAliases){
            if (this.hostAliases != null) { _visitables.removeAll(this.hostAliases);}
            if (hostAliases != null) {this.hostAliases = new ArrayList<HostAliasBuilder>(); for (HostAlias item : hostAliases){this.addToHostAliases(item);}} else { this.hostAliases = new ArrayList<HostAliasBuilder>();} return (A) this;
    }

    public A withHostAliases(HostAlias... hostAliases){
            if (this.hostAliases != null) {this.hostAliases.clear();}
            if (hostAliases != null) {for (HostAlias item :hostAliases){ this.addToHostAliases(item);}} return (A) this;
    }

    public Boolean hasHostAliases(){
            return hostAliases != null && !hostAliases.isEmpty();
    }

    public PodSpecFluent.HostAliasesNested<A> addNewHostAlias(){
            return new HostAliasesNestedImpl();
    }

    public PodSpecFluent.HostAliasesNested<A> addNewHostAliasLike(HostAlias item){
            return new HostAliasesNestedImpl(-1, item);
    }

    public PodSpecFluent.HostAliasesNested<A> setNewHostAliasLike(int index,HostAlias item){
            return new HostAliasesNestedImpl(index, item);
    }

    public PodSpecFluent.HostAliasesNested<A> editHostAlias(int index){
            if (hostAliases.size() <= index) throw new RuntimeException("Can't edit hostAliases. Index exceeds size.");
            return setNewHostAliasLike(index, buildHostAlias(index));
    }

    public PodSpecFluent.HostAliasesNested<A> editFirstHostAlias(){
            if (hostAliases.size() == 0) throw new RuntimeException("Can't edit first hostAliases. The list is empty.");
            return setNewHostAliasLike(0, buildHostAlias(0));
    }

    public PodSpecFluent.HostAliasesNested<A> editLastHostAlias(){
            int index = hostAliases.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last hostAliases. The list is empty.");
            return setNewHostAliasLike(index, buildHostAlias(index));
    }

    public PodSpecFluent.HostAliasesNested<A> editMatchingHostAlias(io.fabric8.kubernetes.api.builder.Predicate<HostAliasBuilder> predicate){
            int index = -1;
            for (int i=0;i<hostAliases.size();i++) { 
            if (predicate.apply(hostAliases.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching hostAliases. No match found.");
            return setNewHostAliasLike(index, buildHostAlias(index));
    }

    public Boolean isHostIPC(){
            return this.hostIPC;
    }

    public A withHostIPC(Boolean hostIPC){
            this.hostIPC=hostIPC; return (A) this;
    }

    public Boolean hasHostIPC(){
            return this.hostIPC != null;
    }

    public A withNewHostIPC(String arg1){
            return (A)withHostIPC(new Boolean(arg1));
    }

    public A withNewHostIPC(boolean arg1){
            return (A)withHostIPC(new Boolean(arg1));
    }

    public Boolean isHostNetwork(){
            return this.hostNetwork;
    }

    public A withHostNetwork(Boolean hostNetwork){
            this.hostNetwork=hostNetwork; return (A) this;
    }

    public Boolean hasHostNetwork(){
            return this.hostNetwork != null;
    }

    public A withNewHostNetwork(String arg1){
            return (A)withHostNetwork(new Boolean(arg1));
    }

    public A withNewHostNetwork(boolean arg1){
            return (A)withHostNetwork(new Boolean(arg1));
    }

    public Boolean isHostPID(){
            return this.hostPID;
    }

    public A withHostPID(Boolean hostPID){
            this.hostPID=hostPID; return (A) this;
    }

    public Boolean hasHostPID(){
            return this.hostPID != null;
    }

    public A withNewHostPID(String arg1){
            return (A)withHostPID(new Boolean(arg1));
    }

    public A withNewHostPID(boolean arg1){
            return (A)withHostPID(new Boolean(arg1));
    }

    public String getHostname(){
            return this.hostname;
    }

    public A withHostname(String hostname){
            this.hostname=hostname; return (A) this;
    }

    public Boolean hasHostname(){
            return this.hostname != null;
    }

    public A addToImagePullSecrets(int index,LocalObjectReference item){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.imagePullSecrets.add(index >= 0 ? index : imagePullSecrets.size(), builder); return (A)this;
    }

    public A setToImagePullSecrets(int index,LocalObjectReference item){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= imagePullSecrets.size()) { imagePullSecrets.add(builder); } else { imagePullSecrets.set(index, builder);}
             return (A)this;
    }

    public A addToImagePullSecrets(LocalObjectReference... items){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.add(builder);this.imagePullSecrets.add(builder);} return (A)this;
    }

    public A addAllToImagePullSecrets(Collection<LocalObjectReference> items){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.add(builder);this.imagePullSecrets.add(builder);} return (A)this;
    }

    public A removeFromImagePullSecrets(LocalObjectReference... items){
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
    }

    public A removeAllFromImagePullSecrets(Collection<LocalObjectReference> items){
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildImagePullSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<LocalObjectReference> getImagePullSecrets(){
            return build(imagePullSecrets);
    }

    public List<LocalObjectReference> buildImagePullSecrets(){
            return build(imagePullSecrets);
    }

    public LocalObjectReference buildImagePullSecret(int index){
            return this.imagePullSecrets.get(index).build();
    }

    public LocalObjectReference buildFirstImagePullSecret(){
            return this.imagePullSecrets.get(0).build();
    }

    public LocalObjectReference buildLastImagePullSecret(){
            return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
    }

    public LocalObjectReference buildMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate){
            for (LocalObjectReferenceBuilder item: imagePullSecrets) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withImagePullSecrets(List<LocalObjectReference> imagePullSecrets){
            if (this.imagePullSecrets != null) { _visitables.removeAll(this.imagePullSecrets);}
            if (imagePullSecrets != null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>(); for (LocalObjectReference item : imagePullSecrets){this.addToImagePullSecrets(item);}} else { this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();} return (A) this;
    }

    public A withImagePullSecrets(LocalObjectReference... imagePullSecrets){
            if (this.imagePullSecrets != null) {this.imagePullSecrets.clear();}
            if (imagePullSecrets != null) {for (LocalObjectReference item :imagePullSecrets){ this.addToImagePullSecrets(item);}} return (A) this;
    }

    public Boolean hasImagePullSecrets(){
            return imagePullSecrets != null && !imagePullSecrets.isEmpty();
    }

    public A addNewImagePullSecret(String name){
            return (A)addToImagePullSecrets(new LocalObjectReference(name));
    }

    public PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecret(){
            return new ImagePullSecretsNestedImpl();
    }

    public PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecretLike(LocalObjectReference item){
            return new ImagePullSecretsNestedImpl(-1, item);
    }

    public PodSpecFluent.ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,LocalObjectReference item){
            return new ImagePullSecretsNestedImpl(index, item);
    }

    public PodSpecFluent.ImagePullSecretsNested<A> editImagePullSecret(int index){
            if (imagePullSecrets.size() <= index) throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
            return setNewImagePullSecretLike(index, buildImagePullSecret(index));
    }

    public PodSpecFluent.ImagePullSecretsNested<A> editFirstImagePullSecret(){
            if (imagePullSecrets.size() == 0) throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
            return setNewImagePullSecretLike(0, buildImagePullSecret(0));
    }

    public PodSpecFluent.ImagePullSecretsNested<A> editLastImagePullSecret(){
            int index = imagePullSecrets.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
            return setNewImagePullSecretLike(index, buildImagePullSecret(index));
    }

    public PodSpecFluent.ImagePullSecretsNested<A> editMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<imagePullSecrets.size();i++) { 
            if (predicate.apply(imagePullSecrets.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
            return setNewImagePullSecretLike(index, buildImagePullSecret(index));
    }

    public A addToInitContainers(int index,Container item){
            if (this.initContainers == null) {this.initContainers = new ArrayList<ContainerBuilder>();}
            ContainerBuilder builder = new ContainerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.initContainers.add(index >= 0 ? index : initContainers.size(), builder); return (A)this;
    }

    public A setToInitContainers(int index,Container item){
            if (this.initContainers == null) {this.initContainers = new ArrayList<ContainerBuilder>();}
            ContainerBuilder builder = new ContainerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= initContainers.size()) { initContainers.add(builder); } else { initContainers.set(index, builder);}
             return (A)this;
    }

    public A addToInitContainers(Container... items){
            if (this.initContainers == null) {this.initContainers = new ArrayList<ContainerBuilder>();}
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.add(builder);this.initContainers.add(builder);} return (A)this;
    }

    public A addAllToInitContainers(Collection<Container> items){
            if (this.initContainers == null) {this.initContainers = new ArrayList<ContainerBuilder>();}
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.add(builder);this.initContainers.add(builder);} return (A)this;
    }

    public A removeFromInitContainers(Container... items){
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.remove(builder);if (this.initContainers != null) {this.initContainers.remove(builder);}} return (A)this;
    }

    public A removeAllFromInitContainers(Collection<Container> items){
            for (Container item : items) {ContainerBuilder builder = new ContainerBuilder(item);_visitables.remove(builder);if (this.initContainers != null) {this.initContainers.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildInitContainers instead.
 * @return The buildable object.
 */
@Deprecated public List<Container> getInitContainers(){
            return build(initContainers);
    }

    public List<Container> buildInitContainers(){
            return build(initContainers);
    }

    public Container buildInitContainer(int index){
            return this.initContainers.get(index).build();
    }

    public Container buildFirstInitContainer(){
            return this.initContainers.get(0).build();
    }

    public Container buildLastInitContainer(){
            return this.initContainers.get(initContainers.size() - 1).build();
    }

    public Container buildMatchingInitContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate){
            for (ContainerBuilder item: initContainers) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withInitContainers(List<Container> initContainers){
            if (this.initContainers != null) { _visitables.removeAll(this.initContainers);}
            if (initContainers != null) {this.initContainers = new ArrayList<ContainerBuilder>(); for (Container item : initContainers){this.addToInitContainers(item);}} else { this.initContainers = new ArrayList<ContainerBuilder>();} return (A) this;
    }

    public A withInitContainers(Container... initContainers){
            if (this.initContainers != null) {this.initContainers.clear();}
            if (initContainers != null) {for (Container item :initContainers){ this.addToInitContainers(item);}} return (A) this;
    }

    public Boolean hasInitContainers(){
            return initContainers != null && !initContainers.isEmpty();
    }

    public PodSpecFluent.InitContainersNested<A> addNewInitContainer(){
            return new InitContainersNestedImpl();
    }

    public PodSpecFluent.InitContainersNested<A> addNewInitContainerLike(Container item){
            return new InitContainersNestedImpl(-1, item);
    }

    public PodSpecFluent.InitContainersNested<A> setNewInitContainerLike(int index,Container item){
            return new InitContainersNestedImpl(index, item);
    }

    public PodSpecFluent.InitContainersNested<A> editInitContainer(int index){
            if (initContainers.size() <= index) throw new RuntimeException("Can't edit initContainers. Index exceeds size.");
            return setNewInitContainerLike(index, buildInitContainer(index));
    }

    public PodSpecFluent.InitContainersNested<A> editFirstInitContainer(){
            if (initContainers.size() == 0) throw new RuntimeException("Can't edit first initContainers. The list is empty.");
            return setNewInitContainerLike(0, buildInitContainer(0));
    }

    public PodSpecFluent.InitContainersNested<A> editLastInitContainer(){
            int index = initContainers.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last initContainers. The list is empty.");
            return setNewInitContainerLike(index, buildInitContainer(index));
    }

    public PodSpecFluent.InitContainersNested<A> editMatchingInitContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate){
            int index = -1;
            for (int i=0;i<initContainers.size();i++) { 
            if (predicate.apply(initContainers.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching initContainers. No match found.");
            return setNewInitContainerLike(index, buildInitContainer(index));
    }

    public String getNodeName(){
            return this.nodeName;
    }

    public A withNodeName(String nodeName){
            this.nodeName=nodeName; return (A) this;
    }

    public Boolean hasNodeName(){
            return this.nodeName != null;
    }

    public A addToNodeSelector(String key,String value){
            if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
    }

    public A addToNodeSelector(Map<String,String> map){
            if(this.nodeSelector == null && map != null) { this.nodeSelector = new LinkedHashMap<String,String>(); }
            if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
    }

    public A removeFromNodeSelector(String key){
            if(this.nodeSelector == null) { return (A) this; }
            if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
    }

    public A removeFromNodeSelector(Map<String,String> map){
            if(this.nodeSelector == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
    }

    public Map<String,String> getNodeSelector(){
            return this.nodeSelector;
    }

    public A withNodeSelector(Map<String,String> nodeSelector){
            if (nodeSelector == null) { this.nodeSelector =  new LinkedHashMap<String,String>();} else {this.nodeSelector = new LinkedHashMap<String,String>(nodeSelector);} return (A) this;
    }

    public Boolean hasNodeSelector(){
            return this.nodeSelector != null;
    }

    public Integer getPriority(){
            return this.priority;
    }

    public A withPriority(Integer priority){
            this.priority=priority; return (A) this;
    }

    public Boolean hasPriority(){
            return this.priority != null;
    }

    public String getPriorityClassName(){
            return this.priorityClassName;
    }

    public A withPriorityClassName(String priorityClassName){
            this.priorityClassName=priorityClassName; return (A) this;
    }

    public Boolean hasPriorityClassName(){
            return this.priorityClassName != null;
    }

    public A addToReadinessGates(int index,PodReadinessGate item){
            if (this.readinessGates == null) {this.readinessGates = new ArrayList<PodReadinessGateBuilder>();}
            PodReadinessGateBuilder builder = new PodReadinessGateBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.readinessGates.add(index >= 0 ? index : readinessGates.size(), builder); return (A)this;
    }

    public A setToReadinessGates(int index,PodReadinessGate item){
            if (this.readinessGates == null) {this.readinessGates = new ArrayList<PodReadinessGateBuilder>();}
            PodReadinessGateBuilder builder = new PodReadinessGateBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= readinessGates.size()) { readinessGates.add(builder); } else { readinessGates.set(index, builder);}
             return (A)this;
    }

    public A addToReadinessGates(PodReadinessGate... items){
            if (this.readinessGates == null) {this.readinessGates = new ArrayList<PodReadinessGateBuilder>();}
            for (PodReadinessGate item : items) {PodReadinessGateBuilder builder = new PodReadinessGateBuilder(item);_visitables.add(builder);this.readinessGates.add(builder);} return (A)this;
    }

    public A addAllToReadinessGates(Collection<PodReadinessGate> items){
            if (this.readinessGates == null) {this.readinessGates = new ArrayList<PodReadinessGateBuilder>();}
            for (PodReadinessGate item : items) {PodReadinessGateBuilder builder = new PodReadinessGateBuilder(item);_visitables.add(builder);this.readinessGates.add(builder);} return (A)this;
    }

    public A removeFromReadinessGates(PodReadinessGate... items){
            for (PodReadinessGate item : items) {PodReadinessGateBuilder builder = new PodReadinessGateBuilder(item);_visitables.remove(builder);if (this.readinessGates != null) {this.readinessGates.remove(builder);}} return (A)this;
    }

    public A removeAllFromReadinessGates(Collection<PodReadinessGate> items){
            for (PodReadinessGate item : items) {PodReadinessGateBuilder builder = new PodReadinessGateBuilder(item);_visitables.remove(builder);if (this.readinessGates != null) {this.readinessGates.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildReadinessGates instead.
 * @return The buildable object.
 */
@Deprecated public List<PodReadinessGate> getReadinessGates(){
            return build(readinessGates);
    }

    public List<PodReadinessGate> buildReadinessGates(){
            return build(readinessGates);
    }

    public PodReadinessGate buildReadinessGate(int index){
            return this.readinessGates.get(index).build();
    }

    public PodReadinessGate buildFirstReadinessGate(){
            return this.readinessGates.get(0).build();
    }

    public PodReadinessGate buildLastReadinessGate(){
            return this.readinessGates.get(readinessGates.size() - 1).build();
    }

    public PodReadinessGate buildMatchingReadinessGate(io.fabric8.kubernetes.api.builder.Predicate<PodReadinessGateBuilder> predicate){
            for (PodReadinessGateBuilder item: readinessGates) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withReadinessGates(List<PodReadinessGate> readinessGates){
            if (this.readinessGates != null) { _visitables.removeAll(this.readinessGates);}
            if (readinessGates != null) {this.readinessGates = new ArrayList<PodReadinessGateBuilder>(); for (PodReadinessGate item : readinessGates){this.addToReadinessGates(item);}} else { this.readinessGates = new ArrayList<PodReadinessGateBuilder>();} return (A) this;
    }

    public A withReadinessGates(PodReadinessGate... readinessGates){
            if (this.readinessGates != null) {this.readinessGates.clear();}
            if (readinessGates != null) {for (PodReadinessGate item :readinessGates){ this.addToReadinessGates(item);}} return (A) this;
    }

    public Boolean hasReadinessGates(){
            return readinessGates != null && !readinessGates.isEmpty();
    }

    public A addNewReadinessGate(String conditionType){
            return (A)addToReadinessGates(new PodReadinessGate(conditionType));
    }

    public PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGate(){
            return new ReadinessGatesNestedImpl();
    }

    public PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGateLike(PodReadinessGate item){
            return new ReadinessGatesNestedImpl(-1, item);
    }

    public PodSpecFluent.ReadinessGatesNested<A> setNewReadinessGateLike(int index,PodReadinessGate item){
            return new ReadinessGatesNestedImpl(index, item);
    }

    public PodSpecFluent.ReadinessGatesNested<A> editReadinessGate(int index){
            if (readinessGates.size() <= index) throw new RuntimeException("Can't edit readinessGates. Index exceeds size.");
            return setNewReadinessGateLike(index, buildReadinessGate(index));
    }

    public PodSpecFluent.ReadinessGatesNested<A> editFirstReadinessGate(){
            if (readinessGates.size() == 0) throw new RuntimeException("Can't edit first readinessGates. The list is empty.");
            return setNewReadinessGateLike(0, buildReadinessGate(0));
    }

    public PodSpecFluent.ReadinessGatesNested<A> editLastReadinessGate(){
            int index = readinessGates.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last readinessGates. The list is empty.");
            return setNewReadinessGateLike(index, buildReadinessGate(index));
    }

    public PodSpecFluent.ReadinessGatesNested<A> editMatchingReadinessGate(io.fabric8.kubernetes.api.builder.Predicate<PodReadinessGateBuilder> predicate){
            int index = -1;
            for (int i=0;i<readinessGates.size();i++) { 
            if (predicate.apply(readinessGates.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching readinessGates. No match found.");
            return setNewReadinessGateLike(index, buildReadinessGate(index));
    }

    public String getRestartPolicy(){
            return this.restartPolicy;
    }

    public A withRestartPolicy(String restartPolicy){
            this.restartPolicy=restartPolicy; return (A) this;
    }

    public Boolean hasRestartPolicy(){
            return this.restartPolicy != null;
    }

    public String getRuntimeClassName(){
            return this.runtimeClassName;
    }

    public A withRuntimeClassName(String runtimeClassName){
            this.runtimeClassName=runtimeClassName; return (A) this;
    }

    public Boolean hasRuntimeClassName(){
            return this.runtimeClassName != null;
    }

    public String getSchedulerName(){
            return this.schedulerName;
    }

    public A withSchedulerName(String schedulerName){
            this.schedulerName=schedulerName; return (A) this;
    }

    public Boolean hasSchedulerName(){
            return this.schedulerName != null;
    }

    
/**
 * This method has been deprecated, please use method buildSecurityContext instead.
 * @return The buildable object.
 */
@Deprecated public PodSecurityContext getSecurityContext(){
            return this.securityContext!=null?this.securityContext.build():null;
    }

    public PodSecurityContext buildSecurityContext(){
            return this.securityContext!=null?this.securityContext.build():null;
    }

    public A withSecurityContext(PodSecurityContext securityContext){
            _visitables.remove(this.securityContext);
            if (securityContext!=null){ this.securityContext= new PodSecurityContextBuilder(securityContext); _visitables.add(this.securityContext);} return (A) this;
    }

    public Boolean hasSecurityContext(){
            return this.securityContext != null;
    }

    public PodSpecFluent.SecurityContextNested<A> withNewSecurityContext(){
            return new SecurityContextNestedImpl();
    }

    public PodSpecFluent.SecurityContextNested<A> withNewSecurityContextLike(PodSecurityContext item){
            return new SecurityContextNestedImpl(item);
    }

    public PodSpecFluent.SecurityContextNested<A> editSecurityContext(){
            return withNewSecurityContextLike(getSecurityContext());
    }

    public PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContext(){
            return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): new PodSecurityContextBuilder().build());
    }

    public PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContextLike(PodSecurityContext item){
            return withNewSecurityContextLike(getSecurityContext() != null ? getSecurityContext(): item);
    }

    public String getServiceAccount(){
            return this.serviceAccount;
    }

    public A withServiceAccount(String serviceAccount){
            this.serviceAccount=serviceAccount; return (A) this;
    }

    public Boolean hasServiceAccount(){
            return this.serviceAccount != null;
    }

    public String getServiceAccountName(){
            return this.serviceAccountName;
    }

    public A withServiceAccountName(String serviceAccountName){
            this.serviceAccountName=serviceAccountName; return (A) this;
    }

    public Boolean hasServiceAccountName(){
            return this.serviceAccountName != null;
    }

    public Boolean isShareProcessNamespace(){
            return this.shareProcessNamespace;
    }

    public A withShareProcessNamespace(Boolean shareProcessNamespace){
            this.shareProcessNamespace=shareProcessNamespace; return (A) this;
    }

    public Boolean hasShareProcessNamespace(){
            return this.shareProcessNamespace != null;
    }

    public A withNewShareProcessNamespace(String arg1){
            return (A)withShareProcessNamespace(new Boolean(arg1));
    }

    public A withNewShareProcessNamespace(boolean arg1){
            return (A)withShareProcessNamespace(new Boolean(arg1));
    }

    public String getSubdomain(){
            return this.subdomain;
    }

    public A withSubdomain(String subdomain){
            this.subdomain=subdomain; return (A) this;
    }

    public Boolean hasSubdomain(){
            return this.subdomain != null;
    }

    public Long getTerminationGracePeriodSeconds(){
            return this.terminationGracePeriodSeconds;
    }

    public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds){
            this.terminationGracePeriodSeconds=terminationGracePeriodSeconds; return (A) this;
    }

    public Boolean hasTerminationGracePeriodSeconds(){
            return this.terminationGracePeriodSeconds != null;
    }

    public A withNewTerminationGracePeriodSeconds(String arg1){
            return (A)withTerminationGracePeriodSeconds(new Long(arg1));
    }

    public A withNewTerminationGracePeriodSeconds(long arg1){
            return (A)withTerminationGracePeriodSeconds(new Long(arg1));
    }

    public A addToTolerations(int index,Toleration item){
            if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationBuilder>();}
            TolerationBuilder builder = new TolerationBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.tolerations.add(index >= 0 ? index : tolerations.size(), builder); return (A)this;
    }

    public A setToTolerations(int index,Toleration item){
            if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationBuilder>();}
            TolerationBuilder builder = new TolerationBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= tolerations.size()) { tolerations.add(builder); } else { tolerations.set(index, builder);}
             return (A)this;
    }

    public A addToTolerations(Toleration... items){
            if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationBuilder>();}
            for (Toleration item : items) {TolerationBuilder builder = new TolerationBuilder(item);_visitables.add(builder);this.tolerations.add(builder);} return (A)this;
    }

    public A addAllToTolerations(Collection<Toleration> items){
            if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationBuilder>();}
            for (Toleration item : items) {TolerationBuilder builder = new TolerationBuilder(item);_visitables.add(builder);this.tolerations.add(builder);} return (A)this;
    }

    public A removeFromTolerations(Toleration... items){
            for (Toleration item : items) {TolerationBuilder builder = new TolerationBuilder(item);_visitables.remove(builder);if (this.tolerations != null) {this.tolerations.remove(builder);}} return (A)this;
    }

    public A removeAllFromTolerations(Collection<Toleration> items){
            for (Toleration item : items) {TolerationBuilder builder = new TolerationBuilder(item);_visitables.remove(builder);if (this.tolerations != null) {this.tolerations.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTolerations instead.
 * @return The buildable object.
 */
@Deprecated public List<Toleration> getTolerations(){
            return build(tolerations);
    }

    public List<Toleration> buildTolerations(){
            return build(tolerations);
    }

    public Toleration buildToleration(int index){
            return this.tolerations.get(index).build();
    }

    public Toleration buildFirstToleration(){
            return this.tolerations.get(0).build();
    }

    public Toleration buildLastToleration(){
            return this.tolerations.get(tolerations.size() - 1).build();
    }

    public Toleration buildMatchingToleration(io.fabric8.kubernetes.api.builder.Predicate<TolerationBuilder> predicate){
            for (TolerationBuilder item: tolerations) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTolerations(List<Toleration> tolerations){
            if (this.tolerations != null) { _visitables.removeAll(this.tolerations);}
            if (tolerations != null) {this.tolerations = new ArrayList<TolerationBuilder>(); for (Toleration item : tolerations){this.addToTolerations(item);}} else { this.tolerations = new ArrayList<TolerationBuilder>();} return (A) this;
    }

    public A withTolerations(Toleration... tolerations){
            if (this.tolerations != null) {this.tolerations.clear();}
            if (tolerations != null) {for (Toleration item :tolerations){ this.addToTolerations(item);}} return (A) this;
    }

    public Boolean hasTolerations(){
            return tolerations != null && !tolerations.isEmpty();
    }

    public A addNewToleration(String effect,String key,String operator,Long tolerationSeconds,String value){
            return (A)addToTolerations(new Toleration(effect, key, operator, tolerationSeconds, value));
    }

    public PodSpecFluent.TolerationsNested<A> addNewToleration(){
            return new TolerationsNestedImpl();
    }

    public PodSpecFluent.TolerationsNested<A> addNewTolerationLike(Toleration item){
            return new TolerationsNestedImpl(-1, item);
    }

    public PodSpecFluent.TolerationsNested<A> setNewTolerationLike(int index,Toleration item){
            return new TolerationsNestedImpl(index, item);
    }

    public PodSpecFluent.TolerationsNested<A> editToleration(int index){
            if (tolerations.size() <= index) throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
            return setNewTolerationLike(index, buildToleration(index));
    }

    public PodSpecFluent.TolerationsNested<A> editFirstToleration(){
            if (tolerations.size() == 0) throw new RuntimeException("Can't edit first tolerations. The list is empty.");
            return setNewTolerationLike(0, buildToleration(0));
    }

    public PodSpecFluent.TolerationsNested<A> editLastToleration(){
            int index = tolerations.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
            return setNewTolerationLike(index, buildToleration(index));
    }

    public PodSpecFluent.TolerationsNested<A> editMatchingToleration(io.fabric8.kubernetes.api.builder.Predicate<TolerationBuilder> predicate){
            int index = -1;
            for (int i=0;i<tolerations.size();i++) { 
            if (predicate.apply(tolerations.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
            return setNewTolerationLike(index, buildToleration(index));
    }

    public A addToVolumes(int index,Volume item){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            VolumeBuilder builder = new VolumeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.volumes.add(index >= 0 ? index : volumes.size(), builder); return (A)this;
    }

    public A setToVolumes(int index,Volume item){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            VolumeBuilder builder = new VolumeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= volumes.size()) { volumes.add(builder); } else { volumes.set(index, builder);}
             return (A)this;
    }

    public A addToVolumes(Volume... items){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.add(builder);this.volumes.add(builder);} return (A)this;
    }

    public A addAllToVolumes(Collection<Volume> items){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.add(builder);this.volumes.add(builder);} return (A)this;
    }

    public A removeFromVolumes(Volume... items){
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.remove(builder);if (this.volumes != null) {this.volumes.remove(builder);}} return (A)this;
    }

    public A removeAllFromVolumes(Collection<Volume> items){
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.remove(builder);if (this.volumes != null) {this.volumes.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<Volume> getVolumes(){
            return build(volumes);
    }

    public List<Volume> buildVolumes(){
            return build(volumes);
    }

    public Volume buildVolume(int index){
            return this.volumes.get(index).build();
    }

    public Volume buildFirstVolume(){
            return this.volumes.get(0).build();
    }

    public Volume buildLastVolume(){
            return this.volumes.get(volumes.size() - 1).build();
    }

    public Volume buildMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate){
            for (VolumeBuilder item: volumes) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVolumes(List<Volume> volumes){
            if (this.volumes != null) { _visitables.removeAll(this.volumes);}
            if (volumes != null) {this.volumes = new ArrayList<VolumeBuilder>(); for (Volume item : volumes){this.addToVolumes(item);}} else { this.volumes = new ArrayList<VolumeBuilder>();} return (A) this;
    }

    public A withVolumes(Volume... volumes){
            if (this.volumes != null) {this.volumes.clear();}
            if (volumes != null) {for (Volume item :volumes){ this.addToVolumes(item);}} return (A) this;
    }

    public Boolean hasVolumes(){
            return volumes != null && !volumes.isEmpty();
    }

    public PodSpecFluent.VolumesNested<A> addNewVolume(){
            return new VolumesNestedImpl();
    }

    public PodSpecFluent.VolumesNested<A> addNewVolumeLike(Volume item){
            return new VolumesNestedImpl(-1, item);
    }

    public PodSpecFluent.VolumesNested<A> setNewVolumeLike(int index,Volume item){
            return new VolumesNestedImpl(index, item);
    }

    public PodSpecFluent.VolumesNested<A> editVolume(int index){
            if (volumes.size() <= index) throw new RuntimeException("Can't edit volumes. Index exceeds size.");
            return setNewVolumeLike(index, buildVolume(index));
    }

    public PodSpecFluent.VolumesNested<A> editFirstVolume(){
            if (volumes.size() == 0) throw new RuntimeException("Can't edit first volumes. The list is empty.");
            return setNewVolumeLike(0, buildVolume(0));
    }

    public PodSpecFluent.VolumesNested<A> editLastVolume(){
            int index = volumes.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last volumes. The list is empty.");
            return setNewVolumeLike(index, buildVolume(index));
    }

    public PodSpecFluent.VolumesNested<A> editMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate){
            int index = -1;
            for (int i=0;i<volumes.size();i++) { 
            if (predicate.apply(volumes.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching volumes. No match found.");
            return setNewVolumeLike(index, buildVolume(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodSpecFluentImpl that = (PodSpecFluentImpl) o;
            if (activeDeadlineSeconds != null ? !activeDeadlineSeconds.equals(that.activeDeadlineSeconds) :that.activeDeadlineSeconds != null) return false;
            if (affinity != null ? !affinity.equals(that.affinity) :that.affinity != null) return false;
            if (automountServiceAccountToken != null ? !automountServiceAccountToken.equals(that.automountServiceAccountToken) :that.automountServiceAccountToken != null) return false;
            if (containers != null ? !containers.equals(that.containers) :that.containers != null) return false;
            if (dnsConfig != null ? !dnsConfig.equals(that.dnsConfig) :that.dnsConfig != null) return false;
            if (dnsPolicy != null ? !dnsPolicy.equals(that.dnsPolicy) :that.dnsPolicy != null) return false;
            if (enableServiceLinks != null ? !enableServiceLinks.equals(that.enableServiceLinks) :that.enableServiceLinks != null) return false;
            if (hostAliases != null ? !hostAliases.equals(that.hostAliases) :that.hostAliases != null) return false;
            if (hostIPC != null ? !hostIPC.equals(that.hostIPC) :that.hostIPC != null) return false;
            if (hostNetwork != null ? !hostNetwork.equals(that.hostNetwork) :that.hostNetwork != null) return false;
            if (hostPID != null ? !hostPID.equals(that.hostPID) :that.hostPID != null) return false;
            if (hostname != null ? !hostname.equals(that.hostname) :that.hostname != null) return false;
            if (imagePullSecrets != null ? !imagePullSecrets.equals(that.imagePullSecrets) :that.imagePullSecrets != null) return false;
            if (initContainers != null ? !initContainers.equals(that.initContainers) :that.initContainers != null) return false;
            if (nodeName != null ? !nodeName.equals(that.nodeName) :that.nodeName != null) return false;
            if (nodeSelector != null ? !nodeSelector.equals(that.nodeSelector) :that.nodeSelector != null) return false;
            if (priority != null ? !priority.equals(that.priority) :that.priority != null) return false;
            if (priorityClassName != null ? !priorityClassName.equals(that.priorityClassName) :that.priorityClassName != null) return false;
            if (readinessGates != null ? !readinessGates.equals(that.readinessGates) :that.readinessGates != null) return false;
            if (restartPolicy != null ? !restartPolicy.equals(that.restartPolicy) :that.restartPolicy != null) return false;
            if (runtimeClassName != null ? !runtimeClassName.equals(that.runtimeClassName) :that.runtimeClassName != null) return false;
            if (schedulerName != null ? !schedulerName.equals(that.schedulerName) :that.schedulerName != null) return false;
            if (securityContext != null ? !securityContext.equals(that.securityContext) :that.securityContext != null) return false;
            if (serviceAccount != null ? !serviceAccount.equals(that.serviceAccount) :that.serviceAccount != null) return false;
            if (serviceAccountName != null ? !serviceAccountName.equals(that.serviceAccountName) :that.serviceAccountName != null) return false;
            if (shareProcessNamespace != null ? !shareProcessNamespace.equals(that.shareProcessNamespace) :that.shareProcessNamespace != null) return false;
            if (subdomain != null ? !subdomain.equals(that.subdomain) :that.subdomain != null) return false;
            if (terminationGracePeriodSeconds != null ? !terminationGracePeriodSeconds.equals(that.terminationGracePeriodSeconds) :that.terminationGracePeriodSeconds != null) return false;
            if (tolerations != null ? !tolerations.equals(that.tolerations) :that.tolerations != null) return false;
            if (volumes != null ? !volumes.equals(that.volumes) :that.volumes != null) return false;
            return true;
    }


    public class AffinityNestedImpl<N> extends AffinityFluentImpl<PodSpecFluent.AffinityNested<N>> implements PodSpecFluent.AffinityNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AffinityBuilder builder;
    
            AffinityNestedImpl(Affinity item){
                    this.builder = new AffinityBuilder(this, item);
            }
            AffinityNestedImpl(){
                    this.builder = new AffinityBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.withAffinity(builder.build());
    }
    public N endAffinity(){
            return and();
    }

}
    public class ContainersNestedImpl<N> extends ContainerFluentImpl<PodSpecFluent.ContainersNested<N>> implements PodSpecFluent.ContainersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerBuilder builder;
        private final int index;
    
            ContainersNestedImpl(int index,Container item){
                    this.index = index;
                    this.builder = new ContainerBuilder(this, item);
            }
            ContainersNestedImpl(){
                    this.index = -1;
                    this.builder = new ContainerBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.setToContainers(index, builder.build());
    }
    public N endContainer(){
            return and();
    }

}
    public class DnsConfigNestedImpl<N> extends PodDNSConfigFluentImpl<PodSpecFluent.DnsConfigNested<N>> implements PodSpecFluent.DnsConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDNSConfigBuilder builder;
    
            DnsConfigNestedImpl(PodDNSConfig item){
                    this.builder = new PodDNSConfigBuilder(this, item);
            }
            DnsConfigNestedImpl(){
                    this.builder = new PodDNSConfigBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.withDnsConfig(builder.build());
    }
    public N endDnsConfig(){
            return and();
    }

}
    public class HostAliasesNestedImpl<N> extends HostAliasFluentImpl<PodSpecFluent.HostAliasesNested<N>> implements PodSpecFluent.HostAliasesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HostAliasBuilder builder;
        private final int index;
    
            HostAliasesNestedImpl(int index,HostAlias item){
                    this.index = index;
                    this.builder = new HostAliasBuilder(this, item);
            }
            HostAliasesNestedImpl(){
                    this.index = -1;
                    this.builder = new HostAliasBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.setToHostAliases(index, builder.build());
    }
    public N endHostAlias(){
            return and();
    }

}
    public class ImagePullSecretsNestedImpl<N> extends LocalObjectReferenceFluentImpl<PodSpecFluent.ImagePullSecretsNested<N>> implements PodSpecFluent.ImagePullSecretsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
        private final int index;
    
            ImagePullSecretsNestedImpl(int index,LocalObjectReference item){
                    this.index = index;
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            ImagePullSecretsNestedImpl(){
                    this.index = -1;
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.setToImagePullSecrets(index, builder.build());
    }
    public N endImagePullSecret(){
            return and();
    }

}
    public class InitContainersNestedImpl<N> extends ContainerFluentImpl<PodSpecFluent.InitContainersNested<N>> implements PodSpecFluent.InitContainersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerBuilder builder;
        private final int index;
    
            InitContainersNestedImpl(int index,Container item){
                    this.index = index;
                    this.builder = new ContainerBuilder(this, item);
            }
            InitContainersNestedImpl(){
                    this.index = -1;
                    this.builder = new ContainerBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.setToInitContainers(index, builder.build());
    }
    public N endInitContainer(){
            return and();
    }

}
    public class ReadinessGatesNestedImpl<N> extends PodReadinessGateFluentImpl<PodSpecFluent.ReadinessGatesNested<N>> implements PodSpecFluent.ReadinessGatesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodReadinessGateBuilder builder;
        private final int index;
    
            ReadinessGatesNestedImpl(int index,PodReadinessGate item){
                    this.index = index;
                    this.builder = new PodReadinessGateBuilder(this, item);
            }
            ReadinessGatesNestedImpl(){
                    this.index = -1;
                    this.builder = new PodReadinessGateBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.setToReadinessGates(index, builder.build());
    }
    public N endReadinessGate(){
            return and();
    }

}
    public class SecurityContextNestedImpl<N> extends PodSecurityContextFluentImpl<PodSpecFluent.SecurityContextNested<N>> implements PodSpecFluent.SecurityContextNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSecurityContextBuilder builder;
    
            SecurityContextNestedImpl(PodSecurityContext item){
                    this.builder = new PodSecurityContextBuilder(this, item);
            }
            SecurityContextNestedImpl(){
                    this.builder = new PodSecurityContextBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.withSecurityContext(builder.build());
    }
    public N endSecurityContext(){
            return and();
    }

}
    public class TolerationsNestedImpl<N> extends TolerationFluentImpl<PodSpecFluent.TolerationsNested<N>> implements PodSpecFluent.TolerationsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TolerationBuilder builder;
        private final int index;
    
            TolerationsNestedImpl(int index,Toleration item){
                    this.index = index;
                    this.builder = new TolerationBuilder(this, item);
            }
            TolerationsNestedImpl(){
                    this.index = -1;
                    this.builder = new TolerationBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.setToTolerations(index, builder.build());
    }
    public N endToleration(){
            return and();
    }

}
    public class VolumesNestedImpl<N> extends VolumeFluentImpl<PodSpecFluent.VolumesNested<N>> implements PodSpecFluent.VolumesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeBuilder builder;
        private final int index;
    
            VolumesNestedImpl(int index,Volume item){
                    this.index = index;
                    this.builder = new VolumeBuilder(this, item);
            }
            VolumesNestedImpl(){
                    this.index = -1;
                    this.builder = new VolumeBuilder(this);
            }
    
    public N and(){
            return (N) PodSpecFluentImpl.this.setToVolumes(index, builder.build());
    }
    public N endVolume(){
            return and();
    }

}


}
