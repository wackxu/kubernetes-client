
package io.fabric8.kubernetes.api.model.extensions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "allowPrivilegeEscalation",
    "allowedCapabilities",
    "allowedFlexVolumes",
    "allowedHostPaths",
    "allowedProcMountTypes",
    "allowedUnsafeSysctls",
    "defaultAddCapabilities",
    "defaultAllowPrivilegeEscalation",
    "forbiddenSysctls",
    "fsGroup",
    "hostIPC",
    "hostNetwork",
    "hostPID",
    "hostPorts",
    "privileged",
    "readOnlyRootFilesystem",
    "requiredDropCapabilities",
    "runAsGroup",
    "runAsUser",
    "seLinux",
    "supplementalGroups",
    "volumes"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodSecurityPolicySpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    private Boolean allowPrivilegeEscalation;
    /**
     * 
     * 
     */
    @JsonProperty("allowedCapabilities")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> allowedCapabilities = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("allowedFlexVolumes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<AllowedFlexVolume> allowedFlexVolumes = new ArrayList<AllowedFlexVolume>();
    /**
     * 
     * 
     */
    @JsonProperty("allowedHostPaths")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<AllowedHostPath> allowedHostPaths = new ArrayList<AllowedHostPath>();
    /**
     * 
     * 
     */
    @JsonProperty("allowedProcMountTypes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> allowedProcMountTypes = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("allowedUnsafeSysctls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> allowedUnsafeSysctls = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("defaultAddCapabilities")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> defaultAddCapabilities = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("defaultAllowPrivilegeEscalation")
    private Boolean defaultAllowPrivilegeEscalation;
    /**
     * 
     * 
     */
    @JsonProperty("forbiddenSysctls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> forbiddenSysctls = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("fsGroup")
    @Valid
    private FSGroupStrategyOptions fsGroup;
    /**
     * 
     * 
     */
    @JsonProperty("hostIPC")
    private Boolean hostIPC;
    /**
     * 
     * 
     */
    @JsonProperty("hostNetwork")
    private Boolean hostNetwork;
    /**
     * 
     * 
     */
    @JsonProperty("hostPID")
    private Boolean hostPID;
    /**
     * 
     * 
     */
    @JsonProperty("hostPorts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<HostPortRange> hostPorts = new ArrayList<HostPortRange>();
    /**
     * 
     * 
     */
    @JsonProperty("privileged")
    private Boolean privileged;
    /**
     * 
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    private Boolean readOnlyRootFilesystem;
    /**
     * 
     * 
     */
    @JsonProperty("requiredDropCapabilities")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> requiredDropCapabilities = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("runAsGroup")
    @Valid
    private RunAsGroupStrategyOptions runAsGroup;
    /**
     * 
     * 
     */
    @JsonProperty("runAsUser")
    @Valid
    private KubernetesRunAsUserStrategyOptions runAsUser;
    /**
     * 
     * 
     */
    @JsonProperty("seLinux")
    @Valid
    private SELinuxStrategyOptions seLinux;
    /**
     * 
     * 
     */
    @JsonProperty("supplementalGroups")
    @Valid
    private SupplementalGroupsStrategyOptions supplementalGroups;
    /**
     * 
     * 
     */
    @JsonProperty("volumes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> volumes = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodSecurityPolicySpec() {
    }

    /**
     * 
     * @param defaultAddCapabilities
     * @param hostPorts
     * @param allowedProcMountTypes
     * @param fsGroup
     * @param seLinux
     * @param hostNetwork
     * @param hostIPC
     * @param volumes
     * @param requiredDropCapabilities
     * @param runAsGroup
     * @param allowedCapabilities
     * @param readOnlyRootFilesystem
     * @param privileged
     * @param runAsUser
     * @param allowedHostPaths
     * @param forbiddenSysctls
     * @param supplementalGroups
     * @param defaultAllowPrivilegeEscalation
     * @param allowedUnsafeSysctls
     * @param allowPrivilegeEscalation
     * @param allowedFlexVolumes
     * @param hostPID
     */
    public PodSecurityPolicySpec(Boolean allowPrivilegeEscalation, List<String> allowedCapabilities, List<AllowedFlexVolume> allowedFlexVolumes, List<AllowedHostPath> allowedHostPaths, List<String> allowedProcMountTypes, List<String> allowedUnsafeSysctls, List<String> defaultAddCapabilities, Boolean defaultAllowPrivilegeEscalation, List<String> forbiddenSysctls, FSGroupStrategyOptions fsGroup, Boolean hostIPC, Boolean hostNetwork, Boolean hostPID, List<HostPortRange> hostPorts, Boolean privileged, Boolean readOnlyRootFilesystem, List<String> requiredDropCapabilities, RunAsGroupStrategyOptions runAsGroup, KubernetesRunAsUserStrategyOptions runAsUser, SELinuxStrategyOptions seLinux, SupplementalGroupsStrategyOptions supplementalGroups, List<String> volumes) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.allowedCapabilities = allowedCapabilities;
        this.allowedFlexVolumes = allowedFlexVolumes;
        this.allowedHostPaths = allowedHostPaths;
        this.allowedProcMountTypes = allowedProcMountTypes;
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        this.defaultAddCapabilities = defaultAddCapabilities;
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
        this.forbiddenSysctls = forbiddenSysctls;
        this.fsGroup = fsGroup;
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostPorts = hostPorts;
        this.privileged = privileged;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.requiredDropCapabilities = requiredDropCapabilities;
        this.runAsGroup = runAsGroup;
        this.runAsUser = runAsUser;
        this.seLinux = seLinux;
        this.supplementalGroups = supplementalGroups;
        this.volumes = volumes;
    }

    /**
     * 
     * 
     * @return
     *     The allowPrivilegeEscalation
     */
    @JsonProperty("allowPrivilegeEscalation")
    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    /**
     * 
     * 
     * @param allowPrivilegeEscalation
     *     The allowPrivilegeEscalation
     */
    @JsonProperty("allowPrivilegeEscalation")
    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    /**
     * 
     * 
     * @return
     *     The allowedCapabilities
     */
    @JsonProperty("allowedCapabilities")
    public List<String> getAllowedCapabilities() {
        return allowedCapabilities;
    }

    /**
     * 
     * 
     * @param allowedCapabilities
     *     The allowedCapabilities
     */
    @JsonProperty("allowedCapabilities")
    public void setAllowedCapabilities(List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
    }

    /**
     * 
     * 
     * @return
     *     The allowedFlexVolumes
     */
    @JsonProperty("allowedFlexVolumes")
    public List<AllowedFlexVolume> getAllowedFlexVolumes() {
        return allowedFlexVolumes;
    }

    /**
     * 
     * 
     * @param allowedFlexVolumes
     *     The allowedFlexVolumes
     */
    @JsonProperty("allowedFlexVolumes")
    public void setAllowedFlexVolumes(List<AllowedFlexVolume> allowedFlexVolumes) {
        this.allowedFlexVolumes = allowedFlexVolumes;
    }

    /**
     * 
     * 
     * @return
     *     The allowedHostPaths
     */
    @JsonProperty("allowedHostPaths")
    public List<AllowedHostPath> getAllowedHostPaths() {
        return allowedHostPaths;
    }

    /**
     * 
     * 
     * @param allowedHostPaths
     *     The allowedHostPaths
     */
    @JsonProperty("allowedHostPaths")
    public void setAllowedHostPaths(List<AllowedHostPath> allowedHostPaths) {
        this.allowedHostPaths = allowedHostPaths;
    }

    /**
     * 
     * 
     * @return
     *     The allowedProcMountTypes
     */
    @JsonProperty("allowedProcMountTypes")
    public List<String> getAllowedProcMountTypes() {
        return allowedProcMountTypes;
    }

    /**
     * 
     * 
     * @param allowedProcMountTypes
     *     The allowedProcMountTypes
     */
    @JsonProperty("allowedProcMountTypes")
    public void setAllowedProcMountTypes(List<String> allowedProcMountTypes) {
        this.allowedProcMountTypes = allowedProcMountTypes;
    }

    /**
     * 
     * 
     * @return
     *     The allowedUnsafeSysctls
     */
    @JsonProperty("allowedUnsafeSysctls")
    public List<String> getAllowedUnsafeSysctls() {
        return allowedUnsafeSysctls;
    }

    /**
     * 
     * 
     * @param allowedUnsafeSysctls
     *     The allowedUnsafeSysctls
     */
    @JsonProperty("allowedUnsafeSysctls")
    public void setAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
    }

    /**
     * 
     * 
     * @return
     *     The defaultAddCapabilities
     */
    @JsonProperty("defaultAddCapabilities")
    public List<String> getDefaultAddCapabilities() {
        return defaultAddCapabilities;
    }

    /**
     * 
     * 
     * @param defaultAddCapabilities
     *     The defaultAddCapabilities
     */
    @JsonProperty("defaultAddCapabilities")
    public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
        this.defaultAddCapabilities = defaultAddCapabilities;
    }

    /**
     * 
     * 
     * @return
     *     The defaultAllowPrivilegeEscalation
     */
    @JsonProperty("defaultAllowPrivilegeEscalation")
    public Boolean getDefaultAllowPrivilegeEscalation() {
        return defaultAllowPrivilegeEscalation;
    }

    /**
     * 
     * 
     * @param defaultAllowPrivilegeEscalation
     *     The defaultAllowPrivilegeEscalation
     */
    @JsonProperty("defaultAllowPrivilegeEscalation")
    public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    }

    /**
     * 
     * 
     * @return
     *     The forbiddenSysctls
     */
    @JsonProperty("forbiddenSysctls")
    public List<String> getForbiddenSysctls() {
        return forbiddenSysctls;
    }

    /**
     * 
     * 
     * @param forbiddenSysctls
     *     The forbiddenSysctls
     */
    @JsonProperty("forbiddenSysctls")
    public void setForbiddenSysctls(List<String> forbiddenSysctls) {
        this.forbiddenSysctls = forbiddenSysctls;
    }

    /**
     * 
     * 
     * @return
     *     The fsGroup
     */
    @JsonProperty("fsGroup")
    public FSGroupStrategyOptions getFsGroup() {
        return fsGroup;
    }

    /**
     * 
     * 
     * @param fsGroup
     *     The fsGroup
     */
    @JsonProperty("fsGroup")
    public void setFsGroup(FSGroupStrategyOptions fsGroup) {
        this.fsGroup = fsGroup;
    }

    /**
     * 
     * 
     * @return
     *     The hostIPC
     */
    @JsonProperty("hostIPC")
    public Boolean getHostIPC() {
        return hostIPC;
    }

    /**
     * 
     * 
     * @param hostIPC
     *     The hostIPC
     */
    @JsonProperty("hostIPC")
    public void setHostIPC(Boolean hostIPC) {
        this.hostIPC = hostIPC;
    }

    /**
     * 
     * 
     * @return
     *     The hostNetwork
     */
    @JsonProperty("hostNetwork")
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    /**
     * 
     * 
     * @param hostNetwork
     *     The hostNetwork
     */
    @JsonProperty("hostNetwork")
    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    /**
     * 
     * 
     * @return
     *     The hostPID
     */
    @JsonProperty("hostPID")
    public Boolean getHostPID() {
        return hostPID;
    }

    /**
     * 
     * 
     * @param hostPID
     *     The hostPID
     */
    @JsonProperty("hostPID")
    public void setHostPID(Boolean hostPID) {
        this.hostPID = hostPID;
    }

    /**
     * 
     * 
     * @return
     *     The hostPorts
     */
    @JsonProperty("hostPorts")
    public List<HostPortRange> getHostPorts() {
        return hostPorts;
    }

    /**
     * 
     * 
     * @param hostPorts
     *     The hostPorts
     */
    @JsonProperty("hostPorts")
    public void setHostPorts(List<HostPortRange> hostPorts) {
        this.hostPorts = hostPorts;
    }

    /**
     * 
     * 
     * @return
     *     The privileged
     */
    @JsonProperty("privileged")
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * 
     * 
     * @param privileged
     *     The privileged
     */
    @JsonProperty("privileged")
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * 
     * 
     * @return
     *     The readOnlyRootFilesystem
     */
    @JsonProperty("readOnlyRootFilesystem")
    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    /**
     * 
     * 
     * @param readOnlyRootFilesystem
     *     The readOnlyRootFilesystem
     */
    @JsonProperty("readOnlyRootFilesystem")
    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    /**
     * 
     * 
     * @return
     *     The requiredDropCapabilities
     */
    @JsonProperty("requiredDropCapabilities")
    public List<String> getRequiredDropCapabilities() {
        return requiredDropCapabilities;
    }

    /**
     * 
     * 
     * @param requiredDropCapabilities
     *     The requiredDropCapabilities
     */
    @JsonProperty("requiredDropCapabilities")
    public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
        this.requiredDropCapabilities = requiredDropCapabilities;
    }

    /**
     * 
     * 
     * @return
     *     The runAsGroup
     */
    @JsonProperty("runAsGroup")
    public RunAsGroupStrategyOptions getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * 
     * 
     * @param runAsGroup
     *     The runAsGroup
     */
    @JsonProperty("runAsGroup")
    public void setRunAsGroup(RunAsGroupStrategyOptions runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * 
     * 
     * @return
     *     The runAsUser
     */
    @JsonProperty("runAsUser")
    public KubernetesRunAsUserStrategyOptions getRunAsUser() {
        return runAsUser;
    }

    /**
     * 
     * 
     * @param runAsUser
     *     The runAsUser
     */
    @JsonProperty("runAsUser")
    public void setRunAsUser(KubernetesRunAsUserStrategyOptions runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * 
     * 
     * @return
     *     The seLinux
     */
    @JsonProperty("seLinux")
    public SELinuxStrategyOptions getSeLinux() {
        return seLinux;
    }

    /**
     * 
     * 
     * @param seLinux
     *     The seLinux
     */
    @JsonProperty("seLinux")
    public void setSeLinux(SELinuxStrategyOptions seLinux) {
        this.seLinux = seLinux;
    }

    /**
     * 
     * 
     * @return
     *     The supplementalGroups
     */
    @JsonProperty("supplementalGroups")
    public SupplementalGroupsStrategyOptions getSupplementalGroups() {
        return supplementalGroups;
    }

    /**
     * 
     * 
     * @param supplementalGroups
     *     The supplementalGroups
     */
    @JsonProperty("supplementalGroups")
    public void setSupplementalGroups(SupplementalGroupsStrategyOptions supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    /**
     * 
     * 
     * @return
     *     The volumes
     */
    @JsonProperty("volumes")
    public List<String> getVolumes() {
        return volumes;
    }

    /**
     * 
     * 
     * @param volumes
     *     The volumes
     */
    @JsonProperty("volumes")
    public void setVolumes(List<String> volumes) {
        this.volumes = volumes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
