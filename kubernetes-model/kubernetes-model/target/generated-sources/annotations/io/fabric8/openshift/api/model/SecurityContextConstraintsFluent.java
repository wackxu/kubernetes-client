package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface SecurityContextConstraintsFluent<A extends SecurityContextConstraintsFluent<A>> extends Fluent<A>{


    public Boolean isAllowHostDirVolumePlugin();
    public A withAllowHostDirVolumePlugin(Boolean allowHostDirVolumePlugin);
    public Boolean hasAllowHostDirVolumePlugin();
    public A withNewAllowHostDirVolumePlugin(String arg1);
    public A withNewAllowHostDirVolumePlugin(boolean arg1);
    public Boolean isAllowHostIPC();
    public A withAllowHostIPC(Boolean allowHostIPC);
    public Boolean hasAllowHostIPC();
    public A withNewAllowHostIPC(String arg1);
    public A withNewAllowHostIPC(boolean arg1);
    public Boolean isAllowHostNetwork();
    public A withAllowHostNetwork(Boolean allowHostNetwork);
    public Boolean hasAllowHostNetwork();
    public A withNewAllowHostNetwork(String arg1);
    public A withNewAllowHostNetwork(boolean arg1);
    public Boolean isAllowHostPID();
    public A withAllowHostPID(Boolean allowHostPID);
    public Boolean hasAllowHostPID();
    public A withNewAllowHostPID(String arg1);
    public A withNewAllowHostPID(boolean arg1);
    public Boolean isAllowHostPorts();
    public A withAllowHostPorts(Boolean allowHostPorts);
    public Boolean hasAllowHostPorts();
    public A withNewAllowHostPorts(String arg1);
    public A withNewAllowHostPorts(boolean arg1);
    public Boolean isAllowPrivilegeEscalation();
    public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation);
    public Boolean hasAllowPrivilegeEscalation();
    public A withNewAllowPrivilegeEscalation(String arg1);
    public A withNewAllowPrivilegeEscalation(boolean arg1);
    public Boolean isAllowPrivilegedContainer();
    public A withAllowPrivilegedContainer(Boolean allowPrivilegedContainer);
    public Boolean hasAllowPrivilegedContainer();
    public A withNewAllowPrivilegedContainer(String arg1);
    public A withNewAllowPrivilegedContainer(boolean arg1);
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
    public A addToAllowedFlexVolumes(int index,io.fabric8.openshift.api.model.AllowedFlexVolume item);
    public A setToAllowedFlexVolumes(int index,io.fabric8.openshift.api.model.AllowedFlexVolume item);
    public A addToAllowedFlexVolumes(io.fabric8.openshift.api.model.AllowedFlexVolume... items);
    public A addAllToAllowedFlexVolumes(Collection<io.fabric8.openshift.api.model.AllowedFlexVolume> items);
    public A removeFromAllowedFlexVolumes(io.fabric8.openshift.api.model.AllowedFlexVolume... items);
    public A removeAllFromAllowedFlexVolumes(Collection<io.fabric8.openshift.api.model.AllowedFlexVolume> items);
    
/**
 * This method has been deprecated, please use method buildAllowedFlexVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<io.fabric8.openshift.api.model.AllowedFlexVolume> getAllowedFlexVolumes();
    public List<io.fabric8.openshift.api.model.AllowedFlexVolume> buildAllowedFlexVolumes();
    public io.fabric8.openshift.api.model.AllowedFlexVolume buildAllowedFlexVolume(int index);
    public io.fabric8.openshift.api.model.AllowedFlexVolume buildFirstAllowedFlexVolume();
    public io.fabric8.openshift.api.model.AllowedFlexVolume buildLastAllowedFlexVolume();
    public io.fabric8.openshift.api.model.AllowedFlexVolume buildMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder> predicate);
    public A withAllowedFlexVolumes(List<io.fabric8.openshift.api.model.AllowedFlexVolume> allowedFlexVolumes);
    public A withAllowedFlexVolumes(io.fabric8.openshift.api.model.AllowedFlexVolume... allowedFlexVolumes);
    public Boolean hasAllowedFlexVolumes();
    public A addNewAllowedFlexVolume(String driver);
    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolume();
    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolumeLike(io.fabric8.openshift.api.model.AllowedFlexVolume item);
    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> setNewAllowedFlexVolumeLike(int index,io.fabric8.openshift.api.model.AllowedFlexVolume item);
    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editAllowedFlexVolume(int index);
    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editFirstAllowedFlexVolume();
    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editLastAllowedFlexVolume();
    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder> predicate);
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
    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
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
@Deprecated public io.fabric8.openshift.api.model.FSGroupStrategyOptions getFsGroup();
    public io.fabric8.openshift.api.model.FSGroupStrategyOptions buildFsGroup();
    public A withFsGroup(io.fabric8.openshift.api.model.FSGroupStrategyOptions fsGroup);
    public Boolean hasFsGroup();
    public SecurityContextConstraintsFluent.FsGroupNested<A> withNewFsGroup();
    public SecurityContextConstraintsFluent.FsGroupNested<A> withNewFsGroupLike(io.fabric8.openshift.api.model.FSGroupStrategyOptions item);
    public SecurityContextConstraintsFluent.FsGroupNested<A> editFsGroup();
    public SecurityContextConstraintsFluent.FsGroupNested<A> editOrNewFsGroup();
    public SecurityContextConstraintsFluent.FsGroupNested<A> editOrNewFsGroupLike(io.fabric8.openshift.api.model.FSGroupStrategyOptions item);
    public A addToGroups(int index,String item);
    public A setToGroups(int index,String item);
    public A addToGroups(String... items);
    public A addAllToGroups(Collection<String> items);
    public A removeFromGroups(String... items);
    public A removeAllFromGroups(Collection<String> items);
    public List<String> getGroups();
    public String getGroup(int index);
    public String getFirstGroup();
    public String getLastGroup();
    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withGroups(List<String> groups);
    public A withGroups(String... groups);
    public Boolean hasGroups();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public SecurityContextConstraintsFluent.MetadataNested<A> withNewMetadata();
    public SecurityContextConstraintsFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public SecurityContextConstraintsFluent.MetadataNested<A> editMetadata();
    public SecurityContextConstraintsFluent.MetadataNested<A> editOrNewMetadata();
    public SecurityContextConstraintsFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public Integer getPriority();
    public A withPriority(Integer priority);
    public Boolean hasPriority();
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
 * This method has been deprecated, please use method buildRunAsUser instead.
 * @return The buildable object.
 */
@Deprecated public RunAsUserStrategyOptions getRunAsUser();
    public RunAsUserStrategyOptions buildRunAsUser();
    public A withRunAsUser(RunAsUserStrategyOptions runAsUser);
    public Boolean hasRunAsUser();
    public A withNewRunAsUser(String type,Long uid,Long uidRangeMax,Long uidRangeMin);
    public SecurityContextConstraintsFluent.RunAsUserNested<A> withNewRunAsUser();
    public SecurityContextConstraintsFluent.RunAsUserNested<A> withNewRunAsUserLike(RunAsUserStrategyOptions item);
    public SecurityContextConstraintsFluent.RunAsUserNested<A> editRunAsUser();
    public SecurityContextConstraintsFluent.RunAsUserNested<A> editOrNewRunAsUser();
    public SecurityContextConstraintsFluent.RunAsUserNested<A> editOrNewRunAsUserLike(RunAsUserStrategyOptions item);
    
/**
 * This method has been deprecated, please use method buildSeLinuxContext instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxContextStrategyOptions getSeLinuxContext();
    public SELinuxContextStrategyOptions buildSeLinuxContext();
    public A withSeLinuxContext(SELinuxContextStrategyOptions seLinuxContext);
    public Boolean hasSeLinuxContext();
    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> withNewSeLinuxContext();
    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> withNewSeLinuxContextLike(SELinuxContextStrategyOptions item);
    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> editSeLinuxContext();
    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> editOrNewSeLinuxContext();
    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> editOrNewSeLinuxContextLike(SELinuxContextStrategyOptions item);
    public A addToSeccompProfiles(int index,String item);
    public A setToSeccompProfiles(int index,String item);
    public A addToSeccompProfiles(String... items);
    public A addAllToSeccompProfiles(Collection<String> items);
    public A removeFromSeccompProfiles(String... items);
    public A removeAllFromSeccompProfiles(Collection<String> items);
    public List<String> getSeccompProfiles();
    public String getSeccompProfile(int index);
    public String getFirstSeccompProfile();
    public String getLastSeccompProfile();
    public String getMatchingSeccompProfile(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withSeccompProfiles(List<String> seccompProfiles);
    public A withSeccompProfiles(String... seccompProfiles);
    public Boolean hasSeccompProfiles();
    
/**
 * This method has been deprecated, please use method buildSupplementalGroups instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions getSupplementalGroups();
    public io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions buildSupplementalGroups();
    public A withSupplementalGroups(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions supplementalGroups);
    public Boolean hasSupplementalGroups();
    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> withNewSupplementalGroups();
    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> withNewSupplementalGroupsLike(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item);
    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> editSupplementalGroups();
    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroups();
    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroupsLike(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item);
    public A addToUsers(int index,String item);
    public A setToUsers(int index,String item);
    public A addToUsers(String... items);
    public A addAllToUsers(Collection<String> items);
    public A removeFromUsers(String... items);
    public A removeAllFromUsers(Collection<String> items);
    public List<String> getUsers();
    public String getUser(int index);
    public String getFirstUser();
    public String getLastUser();
    public String getMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withUsers(List<String> users);
    public A withUsers(String... users);
    public Boolean hasUsers();
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

    public interface AllowedFlexVolumesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<SecurityContextConstraintsFluent.AllowedFlexVolumesNested<N>>{

        
    public N and();    public N endAllowedFlexVolume();
}
    public interface FsGroupNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluent<SecurityContextConstraintsFluent.FsGroupNested<N>>{

        
    public N and();    public N endFsGroup();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<SecurityContextConstraintsFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RunAsUserNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RunAsUserStrategyOptionsFluent<SecurityContextConstraintsFluent.RunAsUserNested<N>>{

        
    public N and();    public N endRunAsUser();
}
    public interface SeLinuxContextNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SELinuxContextStrategyOptionsFluent<SecurityContextConstraintsFluent.SeLinuxContextNested<N>>{

        
    public N and();    public N endSeLinuxContext();
}
    public interface SupplementalGroupsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluent<SecurityContextConstraintsFluent.SupplementalGroupsNested<N>>{

        
    public N and();    public N endSupplementalGroups();
}


}
