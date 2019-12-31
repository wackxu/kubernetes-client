package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import java.lang.Integer;

public interface PodSpecFluent<A extends PodSpecFluent<A>> extends Fluent<A>{


    public Long getActiveDeadlineSeconds();
    public A withActiveDeadlineSeconds(Long activeDeadlineSeconds);
    public Boolean hasActiveDeadlineSeconds();
    public A withNewActiveDeadlineSeconds(String arg1);
    public A withNewActiveDeadlineSeconds(long arg1);
    
/**
 * This method has been deprecated, please use method buildAffinity instead.
 * @return The buildable object.
 */
@Deprecated public Affinity getAffinity();
    public Affinity buildAffinity();
    public A withAffinity(Affinity affinity);
    public Boolean hasAffinity();
    public PodSpecFluent.AffinityNested<A> withNewAffinity();
    public PodSpecFluent.AffinityNested<A> withNewAffinityLike(Affinity item);
    public PodSpecFluent.AffinityNested<A> editAffinity();
    public PodSpecFluent.AffinityNested<A> editOrNewAffinity();
    public PodSpecFluent.AffinityNested<A> editOrNewAffinityLike(Affinity item);
    public Boolean isAutomountServiceAccountToken();
    public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken);
    public Boolean hasAutomountServiceAccountToken();
    public A withNewAutomountServiceAccountToken(String arg1);
    public A withNewAutomountServiceAccountToken(boolean arg1);
    public A addToContainers(int index,Container item);
    public A setToContainers(int index,Container item);
    public A addToContainers(Container... items);
    public A addAllToContainers(Collection<Container> items);
    public A removeFromContainers(Container... items);
    public A removeAllFromContainers(Collection<Container> items);
    
/**
 * This method has been deprecated, please use method buildContainers instead.
 * @return The buildable object.
 */
@Deprecated public List<Container> getContainers();
    public List<Container> buildContainers();
    public Container buildContainer(int index);
    public Container buildFirstContainer();
    public Container buildLastContainer();
    public Container buildMatchingContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate);
    public A withContainers(List<Container> containers);
    public A withContainers(Container... containers);
    public Boolean hasContainers();
    public PodSpecFluent.ContainersNested<A> addNewContainer();
    public PodSpecFluent.ContainersNested<A> addNewContainerLike(Container item);
    public PodSpecFluent.ContainersNested<A> setNewContainerLike(int index,Container item);
    public PodSpecFluent.ContainersNested<A> editContainer(int index);
    public PodSpecFluent.ContainersNested<A> editFirstContainer();
    public PodSpecFluent.ContainersNested<A> editLastContainer();
    public PodSpecFluent.ContainersNested<A> editMatchingContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildDnsConfig instead.
 * @return The buildable object.
 */
@Deprecated public PodDNSConfig getDnsConfig();
    public PodDNSConfig buildDnsConfig();
    public A withDnsConfig(PodDNSConfig dnsConfig);
    public Boolean hasDnsConfig();
    public PodSpecFluent.DnsConfigNested<A> withNewDnsConfig();
    public PodSpecFluent.DnsConfigNested<A> withNewDnsConfigLike(PodDNSConfig item);
    public PodSpecFluent.DnsConfigNested<A> editDnsConfig();
    public PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfig();
    public PodSpecFluent.DnsConfigNested<A> editOrNewDnsConfigLike(PodDNSConfig item);
    public String getDnsPolicy();
    public A withDnsPolicy(String dnsPolicy);
    public Boolean hasDnsPolicy();
    public Boolean isEnableServiceLinks();
    public A withEnableServiceLinks(Boolean enableServiceLinks);
    public Boolean hasEnableServiceLinks();
    public A withNewEnableServiceLinks(String arg1);
    public A withNewEnableServiceLinks(boolean arg1);
    public A addToHostAliases(int index,HostAlias item);
    public A setToHostAliases(int index,HostAlias item);
    public A addToHostAliases(HostAlias... items);
    public A addAllToHostAliases(Collection<HostAlias> items);
    public A removeFromHostAliases(HostAlias... items);
    public A removeAllFromHostAliases(Collection<HostAlias> items);
    
/**
 * This method has been deprecated, please use method buildHostAliases instead.
 * @return The buildable object.
 */
@Deprecated public List<HostAlias> getHostAliases();
    public List<HostAlias> buildHostAliases();
    public HostAlias buildHostAlias(int index);
    public HostAlias buildFirstHostAlias();
    public HostAlias buildLastHostAlias();
    public HostAlias buildMatchingHostAlias(io.fabric8.kubernetes.api.builder.Predicate<HostAliasBuilder> predicate);
    public A withHostAliases(List<HostAlias> hostAliases);
    public A withHostAliases(HostAlias... hostAliases);
    public Boolean hasHostAliases();
    public PodSpecFluent.HostAliasesNested<A> addNewHostAlias();
    public PodSpecFluent.HostAliasesNested<A> addNewHostAliasLike(HostAlias item);
    public PodSpecFluent.HostAliasesNested<A> setNewHostAliasLike(int index,HostAlias item);
    public PodSpecFluent.HostAliasesNested<A> editHostAlias(int index);
    public PodSpecFluent.HostAliasesNested<A> editFirstHostAlias();
    public PodSpecFluent.HostAliasesNested<A> editLastHostAlias();
    public PodSpecFluent.HostAliasesNested<A> editMatchingHostAlias(io.fabric8.kubernetes.api.builder.Predicate<HostAliasBuilder> predicate);
    public Boolean isHostIPC();
    public A withHostIPC(Boolean hostIPC);
    public Boolean hasHostIPC();
    public A withNewHostIPC(String arg1);
    public A withNewHostIPC(boolean arg1);
    public Boolean isHostNetwork();
    public A withHostNetwork(Boolean hostNetwork);
    public Boolean hasHostNetwork();
    public A withNewHostNetwork(String arg1);
    public A withNewHostNetwork(boolean arg1);
    public Boolean isHostPID();
    public A withHostPID(Boolean hostPID);
    public Boolean hasHostPID();
    public A withNewHostPID(String arg1);
    public A withNewHostPID(boolean arg1);
    public String getHostname();
    public A withHostname(String hostname);
    public Boolean hasHostname();
    public A addToImagePullSecrets(int index,LocalObjectReference item);
    public A setToImagePullSecrets(int index,LocalObjectReference item);
    public A addToImagePullSecrets(LocalObjectReference... items);
    public A addAllToImagePullSecrets(Collection<LocalObjectReference> items);
    public A removeFromImagePullSecrets(LocalObjectReference... items);
    public A removeAllFromImagePullSecrets(Collection<LocalObjectReference> items);
    
/**
 * This method has been deprecated, please use method buildImagePullSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<LocalObjectReference> getImagePullSecrets();
    public List<LocalObjectReference> buildImagePullSecrets();
    public LocalObjectReference buildImagePullSecret(int index);
    public LocalObjectReference buildFirstImagePullSecret();
    public LocalObjectReference buildLastImagePullSecret();
    public LocalObjectReference buildMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate);
    public A withImagePullSecrets(List<LocalObjectReference> imagePullSecrets);
    public A withImagePullSecrets(LocalObjectReference... imagePullSecrets);
    public Boolean hasImagePullSecrets();
    public A addNewImagePullSecret(String name);
    public PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecret();
    public PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecretLike(LocalObjectReference item);
    public PodSpecFluent.ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,LocalObjectReference item);
    public PodSpecFluent.ImagePullSecretsNested<A> editImagePullSecret(int index);
    public PodSpecFluent.ImagePullSecretsNested<A> editFirstImagePullSecret();
    public PodSpecFluent.ImagePullSecretsNested<A> editLastImagePullSecret();
    public PodSpecFluent.ImagePullSecretsNested<A> editMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate);
    public A addToInitContainers(int index,Container item);
    public A setToInitContainers(int index,Container item);
    public A addToInitContainers(Container... items);
    public A addAllToInitContainers(Collection<Container> items);
    public A removeFromInitContainers(Container... items);
    public A removeAllFromInitContainers(Collection<Container> items);
    
/**
 * This method has been deprecated, please use method buildInitContainers instead.
 * @return The buildable object.
 */
@Deprecated public List<Container> getInitContainers();
    public List<Container> buildInitContainers();
    public Container buildInitContainer(int index);
    public Container buildFirstInitContainer();
    public Container buildLastInitContainer();
    public Container buildMatchingInitContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate);
    public A withInitContainers(List<Container> initContainers);
    public A withInitContainers(Container... initContainers);
    public Boolean hasInitContainers();
    public PodSpecFluent.InitContainersNested<A> addNewInitContainer();
    public PodSpecFluent.InitContainersNested<A> addNewInitContainerLike(Container item);
    public PodSpecFluent.InitContainersNested<A> setNewInitContainerLike(int index,Container item);
    public PodSpecFluent.InitContainersNested<A> editInitContainer(int index);
    public PodSpecFluent.InitContainersNested<A> editFirstInitContainer();
    public PodSpecFluent.InitContainersNested<A> editLastInitContainer();
    public PodSpecFluent.InitContainersNested<A> editMatchingInitContainer(io.fabric8.kubernetes.api.builder.Predicate<ContainerBuilder> predicate);
    public String getNodeName();
    public A withNodeName(String nodeName);
    public Boolean hasNodeName();
    public A addToNodeSelector(String key,String value);
    public A addToNodeSelector(Map<String,String> map);
    public A removeFromNodeSelector(String key);
    public A removeFromNodeSelector(Map<String,String> map);
    public Map<String,String> getNodeSelector();
    public A withNodeSelector(Map<String,String> nodeSelector);
    public Boolean hasNodeSelector();
    public Integer getPriority();
    public A withPriority(Integer priority);
    public Boolean hasPriority();
    public String getPriorityClassName();
    public A withPriorityClassName(String priorityClassName);
    public Boolean hasPriorityClassName();
    public A addToReadinessGates(int index,PodReadinessGate item);
    public A setToReadinessGates(int index,PodReadinessGate item);
    public A addToReadinessGates(PodReadinessGate... items);
    public A addAllToReadinessGates(Collection<PodReadinessGate> items);
    public A removeFromReadinessGates(PodReadinessGate... items);
    public A removeAllFromReadinessGates(Collection<PodReadinessGate> items);
    
/**
 * This method has been deprecated, please use method buildReadinessGates instead.
 * @return The buildable object.
 */
@Deprecated public List<PodReadinessGate> getReadinessGates();
    public List<PodReadinessGate> buildReadinessGates();
    public PodReadinessGate buildReadinessGate(int index);
    public PodReadinessGate buildFirstReadinessGate();
    public PodReadinessGate buildLastReadinessGate();
    public PodReadinessGate buildMatchingReadinessGate(io.fabric8.kubernetes.api.builder.Predicate<PodReadinessGateBuilder> predicate);
    public A withReadinessGates(List<PodReadinessGate> readinessGates);
    public A withReadinessGates(PodReadinessGate... readinessGates);
    public Boolean hasReadinessGates();
    public A addNewReadinessGate(String conditionType);
    public PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGate();
    public PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGateLike(PodReadinessGate item);
    public PodSpecFluent.ReadinessGatesNested<A> setNewReadinessGateLike(int index,PodReadinessGate item);
    public PodSpecFluent.ReadinessGatesNested<A> editReadinessGate(int index);
    public PodSpecFluent.ReadinessGatesNested<A> editFirstReadinessGate();
    public PodSpecFluent.ReadinessGatesNested<A> editLastReadinessGate();
    public PodSpecFluent.ReadinessGatesNested<A> editMatchingReadinessGate(io.fabric8.kubernetes.api.builder.Predicate<PodReadinessGateBuilder> predicate);
    public String getRestartPolicy();
    public A withRestartPolicy(String restartPolicy);
    public Boolean hasRestartPolicy();
    public String getRuntimeClassName();
    public A withRuntimeClassName(String runtimeClassName);
    public Boolean hasRuntimeClassName();
    public String getSchedulerName();
    public A withSchedulerName(String schedulerName);
    public Boolean hasSchedulerName();
    
/**
 * This method has been deprecated, please use method buildSecurityContext instead.
 * @return The buildable object.
 */
@Deprecated public PodSecurityContext getSecurityContext();
    public PodSecurityContext buildSecurityContext();
    public A withSecurityContext(PodSecurityContext securityContext);
    public Boolean hasSecurityContext();
    public PodSpecFluent.SecurityContextNested<A> withNewSecurityContext();
    public PodSpecFluent.SecurityContextNested<A> withNewSecurityContextLike(PodSecurityContext item);
    public PodSpecFluent.SecurityContextNested<A> editSecurityContext();
    public PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContext();
    public PodSpecFluent.SecurityContextNested<A> editOrNewSecurityContextLike(PodSecurityContext item);
    public String getServiceAccount();
    public A withServiceAccount(String serviceAccount);
    public Boolean hasServiceAccount();
    public String getServiceAccountName();
    public A withServiceAccountName(String serviceAccountName);
    public Boolean hasServiceAccountName();
    public Boolean isShareProcessNamespace();
    public A withShareProcessNamespace(Boolean shareProcessNamespace);
    public Boolean hasShareProcessNamespace();
    public A withNewShareProcessNamespace(String arg1);
    public A withNewShareProcessNamespace(boolean arg1);
    public String getSubdomain();
    public A withSubdomain(String subdomain);
    public Boolean hasSubdomain();
    public Long getTerminationGracePeriodSeconds();
    public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds);
    public Boolean hasTerminationGracePeriodSeconds();
    public A withNewTerminationGracePeriodSeconds(String arg1);
    public A withNewTerminationGracePeriodSeconds(long arg1);
    public A addToTolerations(int index,Toleration item);
    public A setToTolerations(int index,Toleration item);
    public A addToTolerations(Toleration... items);
    public A addAllToTolerations(Collection<Toleration> items);
    public A removeFromTolerations(Toleration... items);
    public A removeAllFromTolerations(Collection<Toleration> items);
    
/**
 * This method has been deprecated, please use method buildTolerations instead.
 * @return The buildable object.
 */
@Deprecated public List<Toleration> getTolerations();
    public List<Toleration> buildTolerations();
    public Toleration buildToleration(int index);
    public Toleration buildFirstToleration();
    public Toleration buildLastToleration();
    public Toleration buildMatchingToleration(io.fabric8.kubernetes.api.builder.Predicate<TolerationBuilder> predicate);
    public A withTolerations(List<Toleration> tolerations);
    public A withTolerations(Toleration... tolerations);
    public Boolean hasTolerations();
    public A addNewToleration(String effect,String key,String operator,Long tolerationSeconds,String value);
    public PodSpecFluent.TolerationsNested<A> addNewToleration();
    public PodSpecFluent.TolerationsNested<A> addNewTolerationLike(Toleration item);
    public PodSpecFluent.TolerationsNested<A> setNewTolerationLike(int index,Toleration item);
    public PodSpecFluent.TolerationsNested<A> editToleration(int index);
    public PodSpecFluent.TolerationsNested<A> editFirstToleration();
    public PodSpecFluent.TolerationsNested<A> editLastToleration();
    public PodSpecFluent.TolerationsNested<A> editMatchingToleration(io.fabric8.kubernetes.api.builder.Predicate<TolerationBuilder> predicate);
    public A addToVolumes(int index,Volume item);
    public A setToVolumes(int index,Volume item);
    public A addToVolumes(Volume... items);
    public A addAllToVolumes(Collection<Volume> items);
    public A removeFromVolumes(Volume... items);
    public A removeAllFromVolumes(Collection<Volume> items);
    
/**
 * This method has been deprecated, please use method buildVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<Volume> getVolumes();
    public List<Volume> buildVolumes();
    public Volume buildVolume(int index);
    public Volume buildFirstVolume();
    public Volume buildLastVolume();
    public Volume buildMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate);
    public A withVolumes(List<Volume> volumes);
    public A withVolumes(Volume... volumes);
    public Boolean hasVolumes();
    public PodSpecFluent.VolumesNested<A> addNewVolume();
    public PodSpecFluent.VolumesNested<A> addNewVolumeLike(Volume item);
    public PodSpecFluent.VolumesNested<A> setNewVolumeLike(int index,Volume item);
    public PodSpecFluent.VolumesNested<A> editVolume(int index);
    public PodSpecFluent.VolumesNested<A> editFirstVolume();
    public PodSpecFluent.VolumesNested<A> editLastVolume();
    public PodSpecFluent.VolumesNested<A> editMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate);

    public interface AffinityNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AffinityFluent<PodSpecFluent.AffinityNested<N>>{

        
    public N and();    public N endAffinity();
}
    public interface ContainersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerFluent<PodSpecFluent.ContainersNested<N>>{

        
    public N and();    public N endContainer();
}
    public interface DnsConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDNSConfigFluent<PodSpecFluent.DnsConfigNested<N>>{

        
    public N and();    public N endDnsConfig();
}
    public interface HostAliasesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HostAliasFluent<PodSpecFluent.HostAliasesNested<N>>{

        
    public N and();    public N endHostAlias();
}
    public interface ImagePullSecretsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<PodSpecFluent.ImagePullSecretsNested<N>>{

        
    public N and();    public N endImagePullSecret();
}
    public interface InitContainersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerFluent<PodSpecFluent.InitContainersNested<N>>{

        
    public N and();    public N endInitContainer();
}
    public interface ReadinessGatesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodReadinessGateFluent<PodSpecFluent.ReadinessGatesNested<N>>{

        
    public N and();    public N endReadinessGate();
}
    public interface SecurityContextNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityContextFluent<PodSpecFluent.SecurityContextNested<N>>{

        
    public N and();    public N endSecurityContext();
}
    public interface TolerationsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TolerationFluent<PodSpecFluent.TolerationsNested<N>>{

        
    public N and();    public N endToleration();
}
    public interface VolumesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeFluent<PodSpecFluent.VolumesNested<N>>{

        
    public N and();    public N endVolume();
}


}
