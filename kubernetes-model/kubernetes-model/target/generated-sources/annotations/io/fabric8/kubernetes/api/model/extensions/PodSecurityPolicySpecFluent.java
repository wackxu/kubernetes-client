package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.lang.Integer;

public interface PodSecurityPolicySpecFluent<A extends PodSecurityPolicySpecFluent<A>> extends Fluent<A>{


    public Boolean isAllowPrivilegeEscalation();
    public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation);
    public Boolean hasAllowPrivilegeEscalation();
    public A withNewAllowPrivilegeEscalation(String arg1);
    public A withNewAllowPrivilegeEscalation(boolean arg1);
    public A addToAllowedCapabilities(int index,String item);
    public A setToAllowedCapabilities(int index,String item);
    public A addToAllowedCapabilities(String... items);
    public A addAllToAllowedCapabilities(Collection<String> items);
    public A removeFromAllowedCapabilities(String... items);
    public A removeAllFromAllowedCapabilities(Collection<String> items);
    public List<String> getAllowedCapabilities();
    public String getAllowedCapability(int index);
    public String getFirstAllowedCapability();
    public String getLastAllowedCapability();
    public String getMatchingAllowedCapability(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAllowedCapabilities(List<String> allowedCapabilities);
    public A withAllowedCapabilities(String... allowedCapabilities);
    public Boolean hasAllowedCapabilities();
    public A addToAllowedFlexVolumes(int index,AllowedFlexVolume item);
    public A setToAllowedFlexVolumes(int index,AllowedFlexVolume item);
    public A addToAllowedFlexVolumes(AllowedFlexVolume... items);
    public A addAllToAllowedFlexVolumes(Collection<AllowedFlexVolume> items);
    public A removeFromAllowedFlexVolumes(AllowedFlexVolume... items);
    public A removeAllFromAllowedFlexVolumes(Collection<AllowedFlexVolume> items);
    
/**
 * This method has been deprecated, please use method buildAllowedFlexVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<AllowedFlexVolume> getAllowedFlexVolumes();
    public List<AllowedFlexVolume> buildAllowedFlexVolumes();
    public AllowedFlexVolume buildAllowedFlexVolume(int index);
    public AllowedFlexVolume buildFirstAllowedFlexVolume();
    public AllowedFlexVolume buildLastAllowedFlexVolume();
    public AllowedFlexVolume buildMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<AllowedFlexVolumeBuilder> predicate);
    public A withAllowedFlexVolumes(List<AllowedFlexVolume> allowedFlexVolumes);
    public A withAllowedFlexVolumes(AllowedFlexVolume... allowedFlexVolumes);
    public Boolean hasAllowedFlexVolumes();
    public A addNewAllowedFlexVolume(String driver);
    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolume();
    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolumeLike(AllowedFlexVolume item);
    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> setNewAllowedFlexVolumeLike(int index,AllowedFlexVolume item);
    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editAllowedFlexVolume(int index);
    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editFirstAllowedFlexVolume();
    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editLastAllowedFlexVolume();
    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<AllowedFlexVolumeBuilder> predicate);
    public A addToAllowedHostPaths(int index,AllowedHostPath item);
    public A setToAllowedHostPaths(int index,AllowedHostPath item);
    public A addToAllowedHostPaths(AllowedHostPath... items);
    public A addAllToAllowedHostPaths(Collection<AllowedHostPath> items);
    public A removeFromAllowedHostPaths(AllowedHostPath... items);
    public A removeAllFromAllowedHostPaths(Collection<AllowedHostPath> items);
    
/**
 * This method has been deprecated, please use method buildAllowedHostPaths instead.
 * @return The buildable object.
 */
@Deprecated public List<AllowedHostPath> getAllowedHostPaths();
    public List<AllowedHostPath> buildAllowedHostPaths();
    public AllowedHostPath buildAllowedHostPath(int index);
    public AllowedHostPath buildFirstAllowedHostPath();
    public AllowedHostPath buildLastAllowedHostPath();
    public AllowedHostPath buildMatchingAllowedHostPath(io.fabric8.kubernetes.api.builder.Predicate<AllowedHostPathBuilder> predicate);
    public A withAllowedHostPaths(List<AllowedHostPath> allowedHostPaths);
    public A withAllowedHostPaths(AllowedHostPath... allowedHostPaths);
    public Boolean hasAllowedHostPaths();
    public A addNewAllowedHostPath(String pathPrefix,Boolean readOnly);
    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> addNewAllowedHostPath();
    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> addNewAllowedHostPathLike(AllowedHostPath item);
    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> setNewAllowedHostPathLike(int index,AllowedHostPath item);
    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editAllowedHostPath(int index);
    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editFirstAllowedHostPath();
    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editLastAllowedHostPath();
    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editMatchingAllowedHostPath(io.fabric8.kubernetes.api.builder.Predicate<AllowedHostPathBuilder> predicate);
    public A addToAllowedProcMountTypes(int index,String item);
    public A setToAllowedProcMountTypes(int index,String item);
    public A addToAllowedProcMountTypes(String... items);
    public A addAllToAllowedProcMountTypes(Collection<String> items);
    public A removeFromAllowedProcMountTypes(String... items);
    public A removeAllFromAllowedProcMountTypes(Collection<String> items);
    public List<String> getAllowedProcMountTypes();
    public String getAllowedProcMountType(int index);
    public String getFirstAllowedProcMountType();
    public String getLastAllowedProcMountType();
    public String getMatchingAllowedProcMountType(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAllowedProcMountTypes(List<String> allowedProcMountTypes);
    public A withAllowedProcMountTypes(String... allowedProcMountTypes);
    public Boolean hasAllowedProcMountTypes();
    public A addToAllowedUnsafeSysctls(int index,String item);
    public A setToAllowedUnsafeSysctls(int index,String item);
    public A addToAllowedUnsafeSysctls(String... items);
    public A addAllToAllowedUnsafeSysctls(Collection<String> items);
    public A removeFromAllowedUnsafeSysctls(String... items);
    public A removeAllFromAllowedUnsafeSysctls(Collection<String> items);
    public List<String> getAllowedUnsafeSysctls();
    public String getAllowedUnsafeSysctl(int index);
    public String getFirstAllowedUnsafeSysctl();
    public String getLastAllowedUnsafeSysctl();
    public String getMatchingAllowedUnsafeSysctl(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls);
    public A withAllowedUnsafeSysctls(String... allowedUnsafeSysctls);
    public Boolean hasAllowedUnsafeSysctls();
    public A addToDefaultAddCapabilities(int index,String item);
    public A setToDefaultAddCapabilities(int index,String item);
    public A addToDefaultAddCapabilities(String... items);
    public A addAllToDefaultAddCapabilities(Collection<String> items);
    public A removeFromDefaultAddCapabilities(String... items);
    public A removeAllFromDefaultAddCapabilities(Collection<String> items);
    public List<String> getDefaultAddCapabilities();
    public String getDefaultAddCapability(int index);
    public String getFirstDefaultAddCapability();
    public String getLastDefaultAddCapability();
    public String getMatchingDefaultAddCapability(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withDefaultAddCapabilities(List<String> defaultAddCapabilities);
    public A withDefaultAddCapabilities(String... defaultAddCapabilities);
    public Boolean hasDefaultAddCapabilities();
    public Boolean isDefaultAllowPrivilegeEscalation();
    public A withDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation);
    public Boolean hasDefaultAllowPrivilegeEscalation();
    public A withNewDefaultAllowPrivilegeEscalation(String arg1);
    public A withNewDefaultAllowPrivilegeEscalation(boolean arg1);
    public A addToForbiddenSysctls(int index,String item);
    public A setToForbiddenSysctls(int index,String item);
    public A addToForbiddenSysctls(String... items);
    public A addAllToForbiddenSysctls(Collection<String> items);
    public A removeFromForbiddenSysctls(String... items);
    public A removeAllFromForbiddenSysctls(Collection<String> items);
    public List<String> getForbiddenSysctls();
    public String getForbiddenSysctl(int index);
    public String getFirstForbiddenSysctl();
    public String getLastForbiddenSysctl();
    public String getMatchingForbiddenSysctl(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withForbiddenSysctls(List<String> forbiddenSysctls);
    public A withForbiddenSysctls(String... forbiddenSysctls);
    public Boolean hasForbiddenSysctls();
    
/**
 * This method has been deprecated, please use method buildFsGroup instead.
 * @return The buildable object.
 */
@Deprecated public FSGroupStrategyOptions getFsGroup();
    public FSGroupStrategyOptions buildFsGroup();
    public A withFsGroup(FSGroupStrategyOptions fsGroup);
    public Boolean hasFsGroup();
    public PodSecurityPolicySpecFluent.FsGroupNested<A> withNewFsGroup();
    public PodSecurityPolicySpecFluent.FsGroupNested<A> withNewFsGroupLike(FSGroupStrategyOptions item);
    public PodSecurityPolicySpecFluent.FsGroupNested<A> editFsGroup();
    public PodSecurityPolicySpecFluent.FsGroupNested<A> editOrNewFsGroup();
    public PodSecurityPolicySpecFluent.FsGroupNested<A> editOrNewFsGroupLike(FSGroupStrategyOptions item);
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
    public A addToHostPorts(int index,HostPortRange item);
    public A setToHostPorts(int index,HostPortRange item);
    public A addToHostPorts(HostPortRange... items);
    public A addAllToHostPorts(Collection<HostPortRange> items);
    public A removeFromHostPorts(HostPortRange... items);
    public A removeAllFromHostPorts(Collection<HostPortRange> items);
    
/**
 * This method has been deprecated, please use method buildHostPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<HostPortRange> getHostPorts();
    public List<HostPortRange> buildHostPorts();
    public HostPortRange buildHostPort(int index);
    public HostPortRange buildFirstHostPort();
    public HostPortRange buildLastHostPort();
    public HostPortRange buildMatchingHostPort(io.fabric8.kubernetes.api.builder.Predicate<HostPortRangeBuilder> predicate);
    public A withHostPorts(List<HostPortRange> hostPorts);
    public A withHostPorts(HostPortRange... hostPorts);
    public Boolean hasHostPorts();
    public A addNewHostPort(Integer max,Integer min);
    public PodSecurityPolicySpecFluent.HostPortsNested<A> addNewHostPort();
    public PodSecurityPolicySpecFluent.HostPortsNested<A> addNewHostPortLike(HostPortRange item);
    public PodSecurityPolicySpecFluent.HostPortsNested<A> setNewHostPortLike(int index,HostPortRange item);
    public PodSecurityPolicySpecFluent.HostPortsNested<A> editHostPort(int index);
    public PodSecurityPolicySpecFluent.HostPortsNested<A> editFirstHostPort();
    public PodSecurityPolicySpecFluent.HostPortsNested<A> editLastHostPort();
    public PodSecurityPolicySpecFluent.HostPortsNested<A> editMatchingHostPort(io.fabric8.kubernetes.api.builder.Predicate<HostPortRangeBuilder> predicate);
    public Boolean isPrivileged();
    public A withPrivileged(Boolean privileged);
    public Boolean hasPrivileged();
    public A withNewPrivileged(String arg1);
    public A withNewPrivileged(boolean arg1);
    public Boolean isReadOnlyRootFilesystem();
    public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem);
    public Boolean hasReadOnlyRootFilesystem();
    public A withNewReadOnlyRootFilesystem(String arg1);
    public A withNewReadOnlyRootFilesystem(boolean arg1);
    public A addToRequiredDropCapabilities(int index,String item);
    public A setToRequiredDropCapabilities(int index,String item);
    public A addToRequiredDropCapabilities(String... items);
    public A addAllToRequiredDropCapabilities(Collection<String> items);
    public A removeFromRequiredDropCapabilities(String... items);
    public A removeAllFromRequiredDropCapabilities(Collection<String> items);
    public List<String> getRequiredDropCapabilities();
    public String getRequiredDropCapability(int index);
    public String getFirstRequiredDropCapability();
    public String getLastRequiredDropCapability();
    public String getMatchingRequiredDropCapability(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withRequiredDropCapabilities(List<String> requiredDropCapabilities);
    public A withRequiredDropCapabilities(String... requiredDropCapabilities);
    public Boolean hasRequiredDropCapabilities();
    
/**
 * This method has been deprecated, please use method buildRunAsGroup instead.
 * @return The buildable object.
 */
@Deprecated public RunAsGroupStrategyOptions getRunAsGroup();
    public RunAsGroupStrategyOptions buildRunAsGroup();
    public A withRunAsGroup(RunAsGroupStrategyOptions runAsGroup);
    public Boolean hasRunAsGroup();
    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> withNewRunAsGroup();
    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> withNewRunAsGroupLike(RunAsGroupStrategyOptions item);
    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> editRunAsGroup();
    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> editOrNewRunAsGroup();
    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> editOrNewRunAsGroupLike(RunAsGroupStrategyOptions item);
    
/**
 * This method has been deprecated, please use method buildRunAsUser instead.
 * @return The buildable object.
 */
@Deprecated public KubernetesRunAsUserStrategyOptions getRunAsUser();
    public KubernetesRunAsUserStrategyOptions buildRunAsUser();
    public A withRunAsUser(KubernetesRunAsUserStrategyOptions runAsUser);
    public Boolean hasRunAsUser();
    public PodSecurityPolicySpecFluent.RunAsUserNested<A> withNewRunAsUser();
    public PodSecurityPolicySpecFluent.RunAsUserNested<A> withNewRunAsUserLike(KubernetesRunAsUserStrategyOptions item);
    public PodSecurityPolicySpecFluent.RunAsUserNested<A> editRunAsUser();
    public PodSecurityPolicySpecFluent.RunAsUserNested<A> editOrNewRunAsUser();
    public PodSecurityPolicySpecFluent.RunAsUserNested<A> editOrNewRunAsUserLike(KubernetesRunAsUserStrategyOptions item);
    
/**
 * This method has been deprecated, please use method buildSeLinux instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxStrategyOptions getSeLinux();
    public SELinuxStrategyOptions buildSeLinux();
    public A withSeLinux(SELinuxStrategyOptions seLinux);
    public Boolean hasSeLinux();
    public PodSecurityPolicySpecFluent.SeLinuxNested<A> withNewSeLinux();
    public PodSecurityPolicySpecFluent.SeLinuxNested<A> withNewSeLinuxLike(SELinuxStrategyOptions item);
    public PodSecurityPolicySpecFluent.SeLinuxNested<A> editSeLinux();
    public PodSecurityPolicySpecFluent.SeLinuxNested<A> editOrNewSeLinux();
    public PodSecurityPolicySpecFluent.SeLinuxNested<A> editOrNewSeLinuxLike(SELinuxStrategyOptions item);
    
/**
 * This method has been deprecated, please use method buildSupplementalGroups instead.
 * @return The buildable object.
 */
@Deprecated public SupplementalGroupsStrategyOptions getSupplementalGroups();
    public SupplementalGroupsStrategyOptions buildSupplementalGroups();
    public A withSupplementalGroups(SupplementalGroupsStrategyOptions supplementalGroups);
    public Boolean hasSupplementalGroups();
    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> withNewSupplementalGroups();
    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> withNewSupplementalGroupsLike(SupplementalGroupsStrategyOptions item);
    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editSupplementalGroups();
    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroups();
    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroupsLike(SupplementalGroupsStrategyOptions item);
    public A addToVolumes(int index,String item);
    public A setToVolumes(int index,String item);
    public A addToVolumes(String... items);
    public A addAllToVolumes(Collection<String> items);
    public A removeFromVolumes(String... items);
    public A removeAllFromVolumes(Collection<String> items);
    public List<String> getVolumes();
    public String getVolume(int index);
    public String getFirstVolume();
    public String getLastVolume();
    public String getMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withVolumes(List<String> volumes);
    public A withVolumes(String... volumes);
    public Boolean hasVolumes();

    public interface AllowedFlexVolumesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AllowedFlexVolumeFluent<PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<N>>{

        
    public N and();    public N endAllowedFlexVolume();
}
    public interface AllowedHostPathsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AllowedHostPathFluent<PodSecurityPolicySpecFluent.AllowedHostPathsNested<N>>{

        
    public N and();    public N endAllowedHostPath();
}
    public interface FsGroupNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FSGroupStrategyOptionsFluent<PodSecurityPolicySpecFluent.FsGroupNested<N>>{

        
    public N and();    public N endFsGroup();
}
    public interface HostPortsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HostPortRangeFluent<PodSecurityPolicySpecFluent.HostPortsNested<N>>{

        
    public N and();    public N endHostPort();
}
    public interface RunAsGroupNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RunAsGroupStrategyOptionsFluent<PodSecurityPolicySpecFluent.RunAsGroupNested<N>>{

        
    public N and();    public N endRunAsGroup();
}
    public interface RunAsUserNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,KubernetesRunAsUserStrategyOptionsFluent<PodSecurityPolicySpecFluent.RunAsUserNested<N>>{

        
    public N and();    public N endRunAsUser();
}
    public interface SeLinuxNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxStrategyOptionsFluent<PodSecurityPolicySpecFluent.SeLinuxNested<N>>{

        
    public N and();    public N endSeLinux();
}
    public interface SupplementalGroupsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SupplementalGroupsStrategyOptionsFluent<PodSecurityPolicySpecFluent.SupplementalGroupsNested<N>>{

        
    public N and();    public N endSupplementalGroups();
}


}
