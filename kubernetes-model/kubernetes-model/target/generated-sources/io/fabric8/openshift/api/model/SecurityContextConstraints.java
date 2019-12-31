
package io.fabric8.openshift.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import io.sundr.transform.annotations.VelocityTransformation;
import io.sundr.transform.annotations.VelocityTransformations;
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
    "allowHostDirVolumePlugin",
    "allowHostIPC",
    "allowHostNetwork",
    "allowHostPID",
    "allowHostPorts",
    "allowPrivilegeEscalation",
    "allowPrivilegedContainer",
    "allowedCapabilities",
    "allowedFlexVolumes",
    "allowedUnsafeSysctls",
    "defaultAddCapabilities",
    "defaultAllowPrivilegeEscalation",
    "forbiddenSysctls",
    "fsGroup",
    "groups",
    "priority",
    "readOnlyRootFilesystem",
    "requiredDropCapabilities",
    "runAsUser",
    "seLinuxContext",
    "seccompProfiles",
    "supplementalGroups",
    "users",
    "volumes"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
@ApiVersion("v1")
@ApiGroup("security.openshift.io")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "openshift.properties", gather = true)
})
public class SecurityContextConstraints implements HasMetadata
{

    /**
     * 
     * 
     */
    @JsonProperty("allowHostDirVolumePlugin")
    private Boolean allowHostDirVolumePlugin;
    /**
     * 
     * 
     */
    @JsonProperty("allowHostIPC")
    private Boolean allowHostIPC;
    /**
     * 
     * 
     */
    @JsonProperty("allowHostNetwork")
    private Boolean allowHostNetwork;
    /**
     * 
     * 
     */
    @JsonProperty("allowHostPID")
    private Boolean allowHostPID;
    /**
     * 
     * 
     */
    @JsonProperty("allowHostPorts")
    private Boolean allowHostPorts;
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
    @JsonProperty("allowPrivilegedContainer")
    private Boolean allowPrivilegedContainer;
    /**
     * 
     * 
     */
    @JsonProperty("allowedCapabilities")
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
    @JsonProperty("allowedUnsafeSysctls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> allowedUnsafeSysctls = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private String apiVersion = "security.openshift.io/v1";
    /**
     * 
     * 
     */
    @JsonProperty("defaultAddCapabilities")
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
    @JsonProperty("groups")
    @Valid
    private List<String> groups = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "SecurityContextConstraints";
    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    @Valid
    @CheckObjectMeta(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*$", max = 253)
    private ObjectMeta metadata;
    /**
     * 
     * 
     */
    @JsonProperty("priority")
    private Integer priority;
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
    @Valid
    private List<String> requiredDropCapabilities = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("runAsUser")
    @Valid
    private RunAsUserStrategyOptions runAsUser;
    /**
     * 
     * 
     */
    @JsonProperty("seLinuxContext")
    @Valid
    private SELinuxContextStrategyOptions seLinuxContext;
    /**
     * 
     * 
     */
    @JsonProperty("seccompProfiles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> seccompProfiles = new ArrayList<String>();
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
    @JsonProperty("users")
    @Valid
    private List<String> users = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("volumes")
    @Valid
    private List<String> volumes = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecurityContextConstraints() {
    }

    /**
     * 
     * @param defaultAddCapabilities
     * @param metadata
     * @param seccompProfiles
     * @param allowHostNetwork
     * @param readOnlyRootFilesystem
     * @param apiVersion
     * @param allowPrivilegedContainer
     * @param allowHostIPC
     * @param supplementalGroups
     * @param allowPrivilegeEscalation
     * @param allowedFlexVolumes
     * @param seLinuxContext
     * @param fsGroup
     * @param kind
     * @param volumes
     * @param allowHostPID
     * @param groups
     * @param requiredDropCapabilities
     * @param allowHostDirVolumePlugin
     * @param allowHostPorts
     * @param priority
     * @param users
     * @param allowedCapabilities
     * @param runAsUser
     * @param forbiddenSysctls
     * @param defaultAllowPrivilegeEscalation
     * @param allowedUnsafeSysctls
     */
    public SecurityContextConstraints(Boolean allowHostDirVolumePlugin, Boolean allowHostIPC, Boolean allowHostNetwork, Boolean allowHostPID, Boolean allowHostPorts, Boolean allowPrivilegeEscalation, Boolean allowPrivilegedContainer, List<String> allowedCapabilities, List<AllowedFlexVolume> allowedFlexVolumes, List<String> allowedUnsafeSysctls, String apiVersion, List<String> defaultAddCapabilities, Boolean defaultAllowPrivilegeEscalation, List<String> forbiddenSysctls, FSGroupStrategyOptions fsGroup, List<String> groups, String kind, ObjectMeta metadata, Integer priority, Boolean readOnlyRootFilesystem, List<String> requiredDropCapabilities, RunAsUserStrategyOptions runAsUser, SELinuxContextStrategyOptions seLinuxContext, List<String> seccompProfiles, SupplementalGroupsStrategyOptions supplementalGroups, List<String> users, List<String> volumes) {
        this.allowHostDirVolumePlugin = allowHostDirVolumePlugin;
        this.allowHostIPC = allowHostIPC;
        this.allowHostNetwork = allowHostNetwork;
        this.allowHostPID = allowHostPID;
        this.allowHostPorts = allowHostPorts;
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.allowPrivilegedContainer = allowPrivilegedContainer;
        this.allowedCapabilities = allowedCapabilities;
        this.allowedFlexVolumes = allowedFlexVolumes;
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        this.apiVersion = apiVersion;
        this.defaultAddCapabilities = defaultAddCapabilities;
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
        this.forbiddenSysctls = forbiddenSysctls;
        this.fsGroup = fsGroup;
        this.groups = groups;
        this.kind = kind;
        this.metadata = metadata;
        this.priority = priority;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.requiredDropCapabilities = requiredDropCapabilities;
        this.runAsUser = runAsUser;
        this.seLinuxContext = seLinuxContext;
        this.seccompProfiles = seccompProfiles;
        this.supplementalGroups = supplementalGroups;
        this.users = users;
        this.volumes = volumes;
    }

    /**
     * 
     * 
     * @return
     *     The allowHostDirVolumePlugin
     */
    @JsonProperty("allowHostDirVolumePlugin")
    public Boolean getAllowHostDirVolumePlugin() {
        return allowHostDirVolumePlugin;
    }

    /**
     * 
     * 
     * @param allowHostDirVolumePlugin
     *     The allowHostDirVolumePlugin
     */
    @JsonProperty("allowHostDirVolumePlugin")
    public void setAllowHostDirVolumePlugin(Boolean allowHostDirVolumePlugin) {
        this.allowHostDirVolumePlugin = allowHostDirVolumePlugin;
    }

    /**
     * 
     * 
     * @return
     *     The allowHostIPC
     */
    @JsonProperty("allowHostIPC")
    public Boolean getAllowHostIPC() {
        return allowHostIPC;
    }

    /**
     * 
     * 
     * @param allowHostIPC
     *     The allowHostIPC
     */
    @JsonProperty("allowHostIPC")
    public void setAllowHostIPC(Boolean allowHostIPC) {
        this.allowHostIPC = allowHostIPC;
    }

    /**
     * 
     * 
     * @return
     *     The allowHostNetwork
     */
    @JsonProperty("allowHostNetwork")
    public Boolean getAllowHostNetwork() {
        return allowHostNetwork;
    }

    /**
     * 
     * 
     * @param allowHostNetwork
     *     The allowHostNetwork
     */
    @JsonProperty("allowHostNetwork")
    public void setAllowHostNetwork(Boolean allowHostNetwork) {
        this.allowHostNetwork = allowHostNetwork;
    }

    /**
     * 
     * 
     * @return
     *     The allowHostPID
     */
    @JsonProperty("allowHostPID")
    public Boolean getAllowHostPID() {
        return allowHostPID;
    }

    /**
     * 
     * 
     * @param allowHostPID
     *     The allowHostPID
     */
    @JsonProperty("allowHostPID")
    public void setAllowHostPID(Boolean allowHostPID) {
        this.allowHostPID = allowHostPID;
    }

    /**
     * 
     * 
     * @return
     *     The allowHostPorts
     */
    @JsonProperty("allowHostPorts")
    public Boolean getAllowHostPorts() {
        return allowHostPorts;
    }

    /**
     * 
     * 
     * @param allowHostPorts
     *     The allowHostPorts
     */
    @JsonProperty("allowHostPorts")
    public void setAllowHostPorts(Boolean allowHostPorts) {
        this.allowHostPorts = allowHostPorts;
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
     *     The allowPrivilegedContainer
     */
    @JsonProperty("allowPrivilegedContainer")
    public Boolean getAllowPrivilegedContainer() {
        return allowPrivilegedContainer;
    }

    /**
     * 
     * 
     * @param allowPrivilegedContainer
     *     The allowPrivilegedContainer
     */
    @JsonProperty("allowPrivilegedContainer")
    public void setAllowPrivilegedContainer(Boolean allowPrivilegedContainer) {
        this.allowPrivilegedContainer = allowPrivilegedContainer;
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
     * (Required)
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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
     *     The groups
     */
    @JsonProperty("groups")
    public List<String> getGroups() {
        return groups;
    }

    /**
     * 
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * 
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
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
     *     The runAsUser
     */
    @JsonProperty("runAsUser")
    public RunAsUserStrategyOptions getRunAsUser() {
        return runAsUser;
    }

    /**
     * 
     * 
     * @param runAsUser
     *     The runAsUser
     */
    @JsonProperty("runAsUser")
    public void setRunAsUser(RunAsUserStrategyOptions runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * 
     * 
     * @return
     *     The seLinuxContext
     */
    @JsonProperty("seLinuxContext")
    public SELinuxContextStrategyOptions getSeLinuxContext() {
        return seLinuxContext;
    }

    /**
     * 
     * 
     * @param seLinuxContext
     *     The seLinuxContext
     */
    @JsonProperty("seLinuxContext")
    public void setSeLinuxContext(SELinuxContextStrategyOptions seLinuxContext) {
        this.seLinuxContext = seLinuxContext;
    }

    /**
     * 
     * 
     * @return
     *     The seccompProfiles
     */
    @JsonProperty("seccompProfiles")
    public List<String> getSeccompProfiles() {
        return seccompProfiles;
    }

    /**
     * 
     * 
     * @param seccompProfiles
     *     The seccompProfiles
     */
    @JsonProperty("seccompProfiles")
    public void setSeccompProfiles(List<String> seccompProfiles) {
        this.seccompProfiles = seccompProfiles;
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
     *     The users
     */
    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    /**
     * 
     * 
     * @param users
     *     The users
     */
    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
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
