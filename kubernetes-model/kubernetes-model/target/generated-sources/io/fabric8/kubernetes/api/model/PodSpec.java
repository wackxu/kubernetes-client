
package io.fabric8.kubernetes.api.model;

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
    "activeDeadlineSeconds",
    "affinity",
    "automountServiceAccountToken",
    "containers",
    "dnsConfig",
    "dnsPolicy",
    "enableServiceLinks",
    "hostAliases",
    "hostIPC",
    "hostNetwork",
    "hostPID",
    "hostname",
    "imagePullSecrets",
    "initContainers",
    "nodeName",
    "nodeSelector",
    "priority",
    "priorityClassName",
    "readinessGates",
    "restartPolicy",
    "runtimeClassName",
    "schedulerName",
    "securityContext",
    "serviceAccount",
    "serviceAccountName",
    "shareProcessNamespace",
    "subdomain",
    "terminationGracePeriodSeconds",
    "tolerations",
    "volumes"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    private Long activeDeadlineSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("affinity")
    @Valid
    private Affinity affinity;
    /**
     * 
     * 
     */
    @JsonProperty("automountServiceAccountToken")
    private Boolean automountServiceAccountToken;
    /**
     * 
     * 
     */
    @JsonProperty("containers")
    @Valid
    private List<Container> containers = new ArrayList<Container>();
    /**
     * 
     * 
     */
    @JsonProperty("dnsConfig")
    @Valid
    private PodDNSConfig dnsConfig;
    /**
     * 
     * 
     */
    @JsonProperty("dnsPolicy")
    private java.lang.String dnsPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("enableServiceLinks")
    private Boolean enableServiceLinks;
    /**
     * 
     * 
     */
    @JsonProperty("hostAliases")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<HostAlias> hostAliases = new ArrayList<HostAlias>();
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
    @JsonProperty("hostname")
    private java.lang.String hostname;
    /**
     * 
     * 
     */
    @JsonProperty("imagePullSecrets")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<LocalObjectReference> imagePullSecrets = new ArrayList<LocalObjectReference>();
    /**
     * 
     * 
     */
    @JsonProperty("initContainers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<Container> initContainers = new ArrayList<Container>();
    /**
     * 
     * 
     */
    @JsonProperty("nodeName")
    private java.lang.String nodeName;
    /**
     * 
     * 
     */
    @JsonProperty("nodeSelector")
    @Valid
    private Map<String, String> nodeSelector;
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
    @JsonProperty("priorityClassName")
    private java.lang.String priorityClassName;
    /**
     * 
     * 
     */
    @JsonProperty("readinessGates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<PodReadinessGate> readinessGates = new ArrayList<PodReadinessGate>();
    /**
     * 
     * 
     */
    @JsonProperty("restartPolicy")
    private java.lang.String restartPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("runtimeClassName")
    private java.lang.String runtimeClassName;
    /**
     * 
     * 
     */
    @JsonProperty("schedulerName")
    private java.lang.String schedulerName;
    /**
     * 
     * 
     */
    @JsonProperty("securityContext")
    @Valid
    private PodSecurityContext securityContext;
    /**
     * 
     * 
     */
    @JsonProperty("serviceAccount")
    private java.lang.String serviceAccount;
    /**
     * 
     * 
     */
    @JsonProperty("serviceAccountName")
    private java.lang.String serviceAccountName;
    /**
     * 
     * 
     */
    @JsonProperty("shareProcessNamespace")
    private Boolean shareProcessNamespace;
    /**
     * 
     * 
     */
    @JsonProperty("subdomain")
    private java.lang.String subdomain;
    /**
     * 
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("tolerations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<Toleration> tolerations = new ArrayList<Toleration>();
    /**
     * 
     * 
     */
    @JsonProperty("volumes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<Volume> volumes = new ArrayList<Volume>();
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodSpec() {
    }

    /**
     * 
     * @param dnsPolicy
     * @param nodeName
     * @param terminationGracePeriodSeconds
     * @param dnsConfig
     * @param hostNetwork
     * @param readinessGates
     * @param serviceAccountName
     * @param imagePullSecrets
     * @param priorityClassName
     * @param hostAliases
     * @param securityContext
     * @param nodeSelector
     * @param hostname
     * @param runtimeClassName
     * @param tolerations
     * @param automountServiceAccountToken
     * @param schedulerName
     * @param activeDeadlineSeconds
     * @param enableServiceLinks
     * @param hostIPC
     * @param volumes
     * @param serviceAccount
     * @param priority
     * @param restartPolicy
     * @param shareProcessNamespace
     * @param subdomain
     * @param containers
     * @param initContainers
     * @param affinity
     * @param hostPID
     */
    public PodSpec(Long activeDeadlineSeconds, Affinity affinity, Boolean automountServiceAccountToken, List<Container> containers, PodDNSConfig dnsConfig, java.lang.String dnsPolicy, Boolean enableServiceLinks, List<HostAlias> hostAliases, Boolean hostIPC, Boolean hostNetwork, Boolean hostPID, java.lang.String hostname, List<LocalObjectReference> imagePullSecrets, List<Container> initContainers, java.lang.String nodeName, Map<String, String> nodeSelector, Integer priority, java.lang.String priorityClassName, List<PodReadinessGate> readinessGates, java.lang.String restartPolicy, java.lang.String runtimeClassName, java.lang.String schedulerName, PodSecurityContext securityContext, java.lang.String serviceAccount, java.lang.String serviceAccountName, Boolean shareProcessNamespace, java.lang.String subdomain, Long terminationGracePeriodSeconds, List<Toleration> tolerations, List<Volume> volumes) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.affinity = affinity;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.containers = containers;
        this.dnsConfig = dnsConfig;
        this.dnsPolicy = dnsPolicy;
        this.enableServiceLinks = enableServiceLinks;
        this.hostAliases = hostAliases;
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostname = hostname;
        this.imagePullSecrets = imagePullSecrets;
        this.initContainers = initContainers;
        this.nodeName = nodeName;
        this.nodeSelector = nodeSelector;
        this.priority = priority;
        this.priorityClassName = priorityClassName;
        this.readinessGates = readinessGates;
        this.restartPolicy = restartPolicy;
        this.runtimeClassName = runtimeClassName;
        this.schedulerName = schedulerName;
        this.securityContext = securityContext;
        this.serviceAccount = serviceAccount;
        this.serviceAccountName = serviceAccountName;
        this.shareProcessNamespace = shareProcessNamespace;
        this.subdomain = subdomain;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.tolerations = tolerations;
        this.volumes = volumes;
    }

    /**
     * 
     * 
     * @return
     *     The activeDeadlineSeconds
     */
    @JsonProperty("activeDeadlineSeconds")
    public Long getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    /**
     * 
     * 
     * @param activeDeadlineSeconds
     *     The activeDeadlineSeconds
     */
    @JsonProperty("activeDeadlineSeconds")
    public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The affinity
     */
    @JsonProperty("affinity")
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * 
     * 
     * @param affinity
     *     The affinity
     */
    @JsonProperty("affinity")
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * 
     * 
     * @return
     *     The automountServiceAccountToken
     */
    @JsonProperty("automountServiceAccountToken")
    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    /**
     * 
     * 
     * @param automountServiceAccountToken
     *     The automountServiceAccountToken
     */
    @JsonProperty("automountServiceAccountToken")
    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    /**
     * 
     * 
     * @return
     *     The containers
     */
    @JsonProperty("containers")
    public List<Container> getContainers() {
        return containers;
    }

    /**
     * 
     * 
     * @param containers
     *     The containers
     */
    @JsonProperty("containers")
    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    /**
     * 
     * 
     * @return
     *     The dnsConfig
     */
    @JsonProperty("dnsConfig")
    public PodDNSConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * 
     * 
     * @param dnsConfig
     *     The dnsConfig
     */
    @JsonProperty("dnsConfig")
    public void setDnsConfig(PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * 
     * 
     * @return
     *     The dnsPolicy
     */
    @JsonProperty("dnsPolicy")
    public java.lang.String getDnsPolicy() {
        return dnsPolicy;
    }

    /**
     * 
     * 
     * @param dnsPolicy
     *     The dnsPolicy
     */
    @JsonProperty("dnsPolicy")
    public void setDnsPolicy(java.lang.String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The enableServiceLinks
     */
    @JsonProperty("enableServiceLinks")
    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    /**
     * 
     * 
     * @param enableServiceLinks
     *     The enableServiceLinks
     */
    @JsonProperty("enableServiceLinks")
    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    /**
     * 
     * 
     * @return
     *     The hostAliases
     */
    @JsonProperty("hostAliases")
    public List<HostAlias> getHostAliases() {
        return hostAliases;
    }

    /**
     * 
     * 
     * @param hostAliases
     *     The hostAliases
     */
    @JsonProperty("hostAliases")
    public void setHostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
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
     *     The hostname
     */
    @JsonProperty("hostname")
    public java.lang.String getHostname() {
        return hostname;
    }

    /**
     * 
     * 
     * @param hostname
     *     The hostname
     */
    @JsonProperty("hostname")
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }

    /**
     * 
     * 
     * @return
     *     The imagePullSecrets
     */
    @JsonProperty("imagePullSecrets")
    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    /**
     * 
     * 
     * @param imagePullSecrets
     *     The imagePullSecrets
     */
    @JsonProperty("imagePullSecrets")
    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    /**
     * 
     * 
     * @return
     *     The initContainers
     */
    @JsonProperty("initContainers")
    public List<Container> getInitContainers() {
        return initContainers;
    }

    /**
     * 
     * 
     * @param initContainers
     *     The initContainers
     */
    @JsonProperty("initContainers")
    public void setInitContainers(List<Container> initContainers) {
        this.initContainers = initContainers;
    }

    /**
     * 
     * 
     * @return
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public java.lang.String getNodeName() {
        return nodeName;
    }

    /**
     * 
     * 
     * @param nodeName
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public void setNodeName(java.lang.String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * 
     * 
     * @return
     *     The nodeSelector
     */
    @JsonProperty("nodeSelector")
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    /**
     * 
     * 
     * @param nodeSelector
     *     The nodeSelector
     */
    @JsonProperty("nodeSelector")
    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
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
     *     The priorityClassName
     */
    @JsonProperty("priorityClassName")
    public java.lang.String getPriorityClassName() {
        return priorityClassName;
    }

    /**
     * 
     * 
     * @param priorityClassName
     *     The priorityClassName
     */
    @JsonProperty("priorityClassName")
    public void setPriorityClassName(java.lang.String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    /**
     * 
     * 
     * @return
     *     The readinessGates
     */
    @JsonProperty("readinessGates")
    public List<PodReadinessGate> getReadinessGates() {
        return readinessGates;
    }

    /**
     * 
     * 
     * @param readinessGates
     *     The readinessGates
     */
    @JsonProperty("readinessGates")
    public void setReadinessGates(List<PodReadinessGate> readinessGates) {
        this.readinessGates = readinessGates;
    }

    /**
     * 
     * 
     * @return
     *     The restartPolicy
     */
    @JsonProperty("restartPolicy")
    public java.lang.String getRestartPolicy() {
        return restartPolicy;
    }

    /**
     * 
     * 
     * @param restartPolicy
     *     The restartPolicy
     */
    @JsonProperty("restartPolicy")
    public void setRestartPolicy(java.lang.String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The runtimeClassName
     */
    @JsonProperty("runtimeClassName")
    public java.lang.String getRuntimeClassName() {
        return runtimeClassName;
    }

    /**
     * 
     * 
     * @param runtimeClassName
     *     The runtimeClassName
     */
    @JsonProperty("runtimeClassName")
    public void setRuntimeClassName(java.lang.String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
    }

    /**
     * 
     * 
     * @return
     *     The schedulerName
     */
    @JsonProperty("schedulerName")
    public java.lang.String getSchedulerName() {
        return schedulerName;
    }

    /**
     * 
     * 
     * @param schedulerName
     *     The schedulerName
     */
    @JsonProperty("schedulerName")
    public void setSchedulerName(java.lang.String schedulerName) {
        this.schedulerName = schedulerName;
    }

    /**
     * 
     * 
     * @return
     *     The securityContext
     */
    @JsonProperty("securityContext")
    public PodSecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * 
     * 
     * @param securityContext
     *     The securityContext
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * 
     * 
     * @return
     *     The serviceAccount
     */
    @JsonProperty("serviceAccount")
    public java.lang.String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * 
     * 
     * @param serviceAccount
     *     The serviceAccount
     */
    @JsonProperty("serviceAccount")
    public void setServiceAccount(java.lang.String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * 
     * 
     * @return
     *     The serviceAccountName
     */
    @JsonProperty("serviceAccountName")
    public java.lang.String getServiceAccountName() {
        return serviceAccountName;
    }

    /**
     * 
     * 
     * @param serviceAccountName
     *     The serviceAccountName
     */
    @JsonProperty("serviceAccountName")
    public void setServiceAccountName(java.lang.String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * 
     * 
     * @return
     *     The shareProcessNamespace
     */
    @JsonProperty("shareProcessNamespace")
    public Boolean getShareProcessNamespace() {
        return shareProcessNamespace;
    }

    /**
     * 
     * 
     * @param shareProcessNamespace
     *     The shareProcessNamespace
     */
    @JsonProperty("shareProcessNamespace")
    public void setShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
    }

    /**
     * 
     * 
     * @return
     *     The subdomain
     */
    @JsonProperty("subdomain")
    public java.lang.String getSubdomain() {
        return subdomain;
    }

    /**
     * 
     * 
     * @param subdomain
     *     The subdomain
     */
    @JsonProperty("subdomain")
    public void setSubdomain(java.lang.String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * 
     * 
     * @return
     *     The terminationGracePeriodSeconds
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    /**
     * 
     * 
     * @param terminationGracePeriodSeconds
     *     The terminationGracePeriodSeconds
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The tolerations
     */
    @JsonProperty("tolerations")
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    /**
     * 
     * 
     * @param tolerations
     *     The tolerations
     */
    @JsonProperty("tolerations")
    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    /**
     * 
     * 
     * @return
     *     The volumes
     */
    @JsonProperty("volumes")
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * 
     * 
     * @param volumes
     *     The volumes
     */
    @JsonProperty("volumes")
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
