package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import javax.validation.constraints.Pattern;
import java.lang.Integer;

public interface ContainerFluent<A extends ContainerFluent<A>> extends Fluent<A>{


    public A addToArgs(int index,String item);
    public A setToArgs(int index,String item);
    public A addToArgs(String... items);
    public A addAllToArgs(Collection<String> items);
    public A removeFromArgs(String... items);
    public A removeAllFromArgs(Collection<String> items);
    public List<String> getArgs();
    public String getArg(int index);
    public String getFirstArg();
    public String getLastArg();
    public String getMatchingArg(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withArgs(List<String> args);
    public A withArgs(String... args);
    public Boolean hasArgs();
    public A addToCommand(int index,String item);
    public A setToCommand(int index,String item);
    public A addToCommand(String... items);
    public A addAllToCommand(Collection<String> items);
    public A removeFromCommand(String... items);
    public A removeAllFromCommand(Collection<String> items);
    public List<String> getCommand();
    public String getCommand(int index);
    public String getFirstCommand();
    public String getLastCommand();
    public String getMatchingCommand(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withCommand(List<String> command);
    public A withCommand(String... command);
    public Boolean hasCommand();
    public A addToEnv(int index,EnvVar item);
    public A setToEnv(int index,EnvVar item);
    public A addToEnv(EnvVar... items);
    public A addAllToEnv(Collection<EnvVar> items);
    public A removeFromEnv(EnvVar... items);
    public A removeAllFromEnv(Collection<EnvVar> items);
    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv();
    public List<EnvVar> buildEnv();
    public EnvVar buildEnv(int index);
    public EnvVar buildFirstEnv();
    public EnvVar buildLastEnv();
    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A withEnv(List<EnvVar> env);
    public A withEnv(EnvVar... env);
    public Boolean hasEnv();
    public ContainerFluent.EnvNested<A> addNewEnv();
    public ContainerFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public ContainerFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public ContainerFluent.EnvNested<A> editEnv(int index);
    public ContainerFluent.EnvNested<A> editFirstEnv();
    public ContainerFluent.EnvNested<A> editLastEnv();
    public ContainerFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A addToEnvFrom(int index,EnvFromSource item);
    public A setToEnvFrom(int index,EnvFromSource item);
    public A addToEnvFrom(EnvFromSource... items);
    public A addAllToEnvFrom(Collection<EnvFromSource> items);
    public A removeFromEnvFrom(EnvFromSource... items);
    public A removeAllFromEnvFrom(Collection<EnvFromSource> items);
    
/**
 * This method has been deprecated, please use method buildEnvFrom instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvFromSource> getEnvFrom();
    public List<EnvFromSource> buildEnvFrom();
    public EnvFromSource buildEnvFrom(int index);
    public EnvFromSource buildFirstEnvFrom();
    public EnvFromSource buildLastEnvFrom();
    public EnvFromSource buildMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate);
    public A withEnvFrom(List<EnvFromSource> envFrom);
    public A withEnvFrom(EnvFromSource... envFrom);
    public Boolean hasEnvFrom();
    public ContainerFluent.EnvFromNested<A> addNewEnvFrom();
    public ContainerFluent.EnvFromNested<A> addNewEnvFromLike(EnvFromSource item);
    public ContainerFluent.EnvFromNested<A> setNewEnvFromLike(int index,EnvFromSource item);
    public ContainerFluent.EnvFromNested<A> editEnvFrom(int index);
    public ContainerFluent.EnvFromNested<A> editFirstEnvFrom();
    public ContainerFluent.EnvFromNested<A> editLastEnvFrom();
    public ContainerFluent.EnvFromNested<A> editMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate);
    public String getImage();
    public A withImage(String image);
    public Boolean hasImage();
    public String getImagePullPolicy();
    public A withImagePullPolicy(String imagePullPolicy);
    public Boolean hasImagePullPolicy();
    
/**
 * This method has been deprecated, please use method buildLifecycle instead.
 * @return The buildable object.
 */
@Deprecated public Lifecycle getLifecycle();
    public Lifecycle buildLifecycle();
    public A withLifecycle(Lifecycle lifecycle);
    public Boolean hasLifecycle();
    public ContainerFluent.LifecycleNested<A> withNewLifecycle();
    public ContainerFluent.LifecycleNested<A> withNewLifecycleLike(Lifecycle item);
    public ContainerFluent.LifecycleNested<A> editLifecycle();
    public ContainerFluent.LifecycleNested<A> editOrNewLifecycle();
    public ContainerFluent.LifecycleNested<A> editOrNewLifecycleLike(Lifecycle item);
    
/**
 * This method has been deprecated, please use method buildLivenessProbe instead.
 * @return The buildable object.
 */
@Deprecated public Probe getLivenessProbe();
    public Probe buildLivenessProbe();
    public A withLivenessProbe(Probe livenessProbe);
    public Boolean hasLivenessProbe();
    public ContainerFluent.LivenessProbeNested<A> withNewLivenessProbe();
    public ContainerFluent.LivenessProbeNested<A> withNewLivenessProbeLike(Probe item);
    public ContainerFluent.LivenessProbeNested<A> editLivenessProbe();
    public ContainerFluent.LivenessProbeNested<A> editOrNewLivenessProbe();
    public ContainerFluent.LivenessProbeNested<A> editOrNewLivenessProbeLike(Probe item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public A addToPorts(int index,ContainerPort item);
    public A setToPorts(int index,ContainerPort item);
    public A addToPorts(ContainerPort... items);
    public A addAllToPorts(Collection<ContainerPort> items);
    public A removeFromPorts(ContainerPort... items);
    public A removeAllFromPorts(Collection<ContainerPort> items);
    
/**
 * This method has been deprecated, please use method buildPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerPort> getPorts();
    public List<ContainerPort> buildPorts();
    public ContainerPort buildPort(int index);
    public ContainerPort buildFirstPort();
    public ContainerPort buildLastPort();
    public ContainerPort buildMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ContainerPortBuilder> predicate);
    public A withPorts(List<ContainerPort> ports);
    public A withPorts(ContainerPort... ports);
    public Boolean hasPorts();
    public A addNewPort(Integer containerPort,String hostIP,Integer hostPort,String name,String protocol);
    public ContainerFluent.PortsNested<A> addNewPort();
    public ContainerFluent.PortsNested<A> addNewPortLike(ContainerPort item);
    public ContainerFluent.PortsNested<A> setNewPortLike(int index,ContainerPort item);
    public ContainerFluent.PortsNested<A> editPort(int index);
    public ContainerFluent.PortsNested<A> editFirstPort();
    public ContainerFluent.PortsNested<A> editLastPort();
    public ContainerFluent.PortsNested<A> editMatchingPort(io.fabric8.kubernetes.api.builder.Predicate<ContainerPortBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildReadinessProbe instead.
 * @return The buildable object.
 */
@Deprecated public Probe getReadinessProbe();
    public Probe buildReadinessProbe();
    public A withReadinessProbe(Probe readinessProbe);
    public Boolean hasReadinessProbe();
    public ContainerFluent.ReadinessProbeNested<A> withNewReadinessProbe();
    public ContainerFluent.ReadinessProbeNested<A> withNewReadinessProbeLike(Probe item);
    public ContainerFluent.ReadinessProbeNested<A> editReadinessProbe();
    public ContainerFluent.ReadinessProbeNested<A> editOrNewReadinessProbe();
    public ContainerFluent.ReadinessProbeNested<A> editOrNewReadinessProbeLike(Probe item);
    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources();
    public ResourceRequirements buildResources();
    public A withResources(ResourceRequirements resources);
    public Boolean hasResources();
    public ContainerFluent.ResourcesNested<A> withNewResources();
    public ContainerFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item);
    public ContainerFluent.ResourcesNested<A> editResources();
    public ContainerFluent.ResourcesNested<A> editOrNewResources();
    public ContainerFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item);
    
/**
 * This method has been deprecated, please use method buildSecurityContext instead.
 * @return The buildable object.
 */
@Deprecated public SecurityContext getSecurityContext();
    public SecurityContext buildSecurityContext();
    public A withSecurityContext(SecurityContext securityContext);
    public Boolean hasSecurityContext();
    public ContainerFluent.SecurityContextNested<A> withNewSecurityContext();
    public ContainerFluent.SecurityContextNested<A> withNewSecurityContextLike(SecurityContext item);
    public ContainerFluent.SecurityContextNested<A> editSecurityContext();
    public ContainerFluent.SecurityContextNested<A> editOrNewSecurityContext();
    public ContainerFluent.SecurityContextNested<A> editOrNewSecurityContextLike(SecurityContext item);
    public Boolean isStdin();
    public A withStdin(Boolean stdin);
    public Boolean hasStdin();
    public A withNewStdin(String arg1);
    public A withNewStdin(boolean arg1);
    public Boolean isStdinOnce();
    public A withStdinOnce(Boolean stdinOnce);
    public Boolean hasStdinOnce();
    public A withNewStdinOnce(String arg1);
    public A withNewStdinOnce(boolean arg1);
    public String getTerminationMessagePath();
    public A withTerminationMessagePath(String terminationMessagePath);
    public Boolean hasTerminationMessagePath();
    public String getTerminationMessagePolicy();
    public A withTerminationMessagePolicy(String terminationMessagePolicy);
    public Boolean hasTerminationMessagePolicy();
    public Boolean isTty();
    public A withTty(Boolean tty);
    public Boolean hasTty();
    public A withNewTty(String arg1);
    public A withNewTty(boolean arg1);
    public A addToVolumeDevices(int index,VolumeDevice item);
    public A setToVolumeDevices(int index,VolumeDevice item);
    public A addToVolumeDevices(VolumeDevice... items);
    public A addAllToVolumeDevices(Collection<VolumeDevice> items);
    public A removeFromVolumeDevices(VolumeDevice... items);
    public A removeAllFromVolumeDevices(Collection<VolumeDevice> items);
    
/**
 * This method has been deprecated, please use method buildVolumeDevices instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeDevice> getVolumeDevices();
    public List<VolumeDevice> buildVolumeDevices();
    public VolumeDevice buildVolumeDevice(int index);
    public VolumeDevice buildFirstVolumeDevice();
    public VolumeDevice buildLastVolumeDevice();
    public VolumeDevice buildMatchingVolumeDevice(io.fabric8.kubernetes.api.builder.Predicate<VolumeDeviceBuilder> predicate);
    public A withVolumeDevices(List<VolumeDevice> volumeDevices);
    public A withVolumeDevices(VolumeDevice... volumeDevices);
    public Boolean hasVolumeDevices();
    public A addNewVolumeDevice(String devicePath,String name);
    public ContainerFluent.VolumeDevicesNested<A> addNewVolumeDevice();
    public ContainerFluent.VolumeDevicesNested<A> addNewVolumeDeviceLike(VolumeDevice item);
    public ContainerFluent.VolumeDevicesNested<A> setNewVolumeDeviceLike(int index,VolumeDevice item);
    public ContainerFluent.VolumeDevicesNested<A> editVolumeDevice(int index);
    public ContainerFluent.VolumeDevicesNested<A> editFirstVolumeDevice();
    public ContainerFluent.VolumeDevicesNested<A> editLastVolumeDevice();
    public ContainerFluent.VolumeDevicesNested<A> editMatchingVolumeDevice(io.fabric8.kubernetes.api.builder.Predicate<VolumeDeviceBuilder> predicate);
    public A addToVolumeMounts(int index,VolumeMount item);
    public A setToVolumeMounts(int index,VolumeMount item);
    public A addToVolumeMounts(VolumeMount... items);
    public A addAllToVolumeMounts(Collection<VolumeMount> items);
    public A removeFromVolumeMounts(VolumeMount... items);
    public A removeAllFromVolumeMounts(Collection<VolumeMount> items);
    
/**
 * This method has been deprecated, please use method buildVolumeMounts instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeMount> getVolumeMounts();
    public List<VolumeMount> buildVolumeMounts();
    public VolumeMount buildVolumeMount(int index);
    public VolumeMount buildFirstVolumeMount();
    public VolumeMount buildLastVolumeMount();
    public VolumeMount buildMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate);
    public A withVolumeMounts(List<VolumeMount> volumeMounts);
    public A withVolumeMounts(VolumeMount... volumeMounts);
    public Boolean hasVolumeMounts();
    public A addNewVolumeMount(String mountPath,String mountPropagation,String name,Boolean readOnly,String subPath);
    public ContainerFluent.VolumeMountsNested<A> addNewVolumeMount();
    public ContainerFluent.VolumeMountsNested<A> addNewVolumeMountLike(VolumeMount item);
    public ContainerFluent.VolumeMountsNested<A> setNewVolumeMountLike(int index,VolumeMount item);
    public ContainerFluent.VolumeMountsNested<A> editVolumeMount(int index);
    public ContainerFluent.VolumeMountsNested<A> editFirstVolumeMount();
    public ContainerFluent.VolumeMountsNested<A> editLastVolumeMount();
    public ContainerFluent.VolumeMountsNested<A> editMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate);
    public String getWorkingDir();
    public A withWorkingDir(String workingDir);
    public Boolean hasWorkingDir();

    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<ContainerFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}
    public interface EnvFromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvFromSourceFluent<ContainerFluent.EnvFromNested<N>>{

        
    public N and();    public N endEnvFrom();
}
    public interface LifecycleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleFluent<ContainerFluent.LifecycleNested<N>>{

        
    public N and();    public N endLifecycle();
}
    public interface LivenessProbeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProbeFluent<ContainerFluent.LivenessProbeNested<N>>{

        
    public N and();    public N endLivenessProbe();
}
    public interface PortsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerPortFluent<ContainerFluent.PortsNested<N>>{

        
    public N and();    public N endPort();
}
    public interface ReadinessProbeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProbeFluent<ContainerFluent.ReadinessProbeNested<N>>{

        
    public N and();    public N endReadinessProbe();
}
    public interface ResourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceRequirementsFluent<ContainerFluent.ResourcesNested<N>>{

        
    public N and();    public N endResources();
}
    public interface SecurityContextNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextFluent<ContainerFluent.SecurityContextNested<N>>{

        
    public N and();    public N endSecurityContext();
}
    public interface VolumeDevicesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeDeviceFluent<ContainerFluent.VolumeDevicesNested<N>>{

        
    public N and();    public N endVolumeDevice();
}
    public interface VolumeMountsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeMountFluent<ContainerFluent.VolumeMountsNested<N>>{

        
    public N and();    public N endVolumeMount();
}


}
