
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
    "clusterIP",
    "externalIPs",
    "externalName",
    "externalTrafficPolicy",
    "healthCheckNodePort",
    "loadBalancerIP",
    "loadBalancerSourceRanges",
    "ports",
    "publishNotReadyAddresses",
    "selector",
    "sessionAffinity",
    "sessionAffinityConfig",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ServiceSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("clusterIP")
    private java.lang.String clusterIP;
    /**
     * 
     * 
     */
    @JsonProperty("externalIPs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> externalIPs = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("externalName")
    private java.lang.String externalName;
    /**
     * 
     * 
     */
    @JsonProperty("externalTrafficPolicy")
    private java.lang.String externalTrafficPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("healthCheckNodePort")
    private Integer healthCheckNodePort;
    /**
     * 
     * 
     */
    @JsonProperty("loadBalancerIP")
    private java.lang.String loadBalancerIP;
    /**
     * 
     * 
     */
    @JsonProperty("loadBalancerSourceRanges")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> loadBalancerSourceRanges = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("ports")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ServicePort> ports = new ArrayList<ServicePort>();
    /**
     * 
     * 
     */
    @JsonProperty("publishNotReadyAddresses")
    private Boolean publishNotReadyAddresses;
    /**
     * 
     * 
     */
    @JsonProperty("selector")
    @Valid
    private Map<String, String> selector;
    /**
     * 
     * 
     */
    @JsonProperty("sessionAffinity")
    private java.lang.String sessionAffinity;
    /**
     * 
     * 
     */
    @JsonProperty("sessionAffinityConfig")
    @Valid
    private SessionAffinityConfig sessionAffinityConfig;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private java.lang.String type;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceSpec() {
    }

    /**
     * 
     * @param healthCheckNodePort
     * @param externalIPs
     * @param sessionAffinity
     * @param ports
     * @param type
     * @param sessionAffinityConfig
     * @param loadBalancerIP
     * @param externalName
     * @param loadBalancerSourceRanges
     * @param externalTrafficPolicy
     * @param selector
     * @param publishNotReadyAddresses
     * @param clusterIP
     */
    public ServiceSpec(java.lang.String clusterIP, List<java.lang.String> externalIPs, java.lang.String externalName, java.lang.String externalTrafficPolicy, Integer healthCheckNodePort, java.lang.String loadBalancerIP, List<java.lang.String> loadBalancerSourceRanges, List<ServicePort> ports, Boolean publishNotReadyAddresses, Map<String, String> selector, java.lang.String sessionAffinity, SessionAffinityConfig sessionAffinityConfig, java.lang.String type) {
        this.clusterIP = clusterIP;
        this.externalIPs = externalIPs;
        this.externalName = externalName;
        this.externalTrafficPolicy = externalTrafficPolicy;
        this.healthCheckNodePort = healthCheckNodePort;
        this.loadBalancerIP = loadBalancerIP;
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
        this.ports = ports;
        this.publishNotReadyAddresses = publishNotReadyAddresses;
        this.selector = selector;
        this.sessionAffinity = sessionAffinity;
        this.sessionAffinityConfig = sessionAffinityConfig;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The clusterIP
     */
    @JsonProperty("clusterIP")
    public java.lang.String getClusterIP() {
        return clusterIP;
    }

    /**
     * 
     * 
     * @param clusterIP
     *     The clusterIP
     */
    @JsonProperty("clusterIP")
    public void setClusterIP(java.lang.String clusterIP) {
        this.clusterIP = clusterIP;
    }

    /**
     * 
     * 
     * @return
     *     The externalIPs
     */
    @JsonProperty("externalIPs")
    public List<java.lang.String> getExternalIPs() {
        return externalIPs;
    }

    /**
     * 
     * 
     * @param externalIPs
     *     The externalIPs
     */
    @JsonProperty("externalIPs")
    public void setExternalIPs(List<java.lang.String> externalIPs) {
        this.externalIPs = externalIPs;
    }

    /**
     * 
     * 
     * @return
     *     The externalName
     */
    @JsonProperty("externalName")
    public java.lang.String getExternalName() {
        return externalName;
    }

    /**
     * 
     * 
     * @param externalName
     *     The externalName
     */
    @JsonProperty("externalName")
    public void setExternalName(java.lang.String externalName) {
        this.externalName = externalName;
    }

    /**
     * 
     * 
     * @return
     *     The externalTrafficPolicy
     */
    @JsonProperty("externalTrafficPolicy")
    public java.lang.String getExternalTrafficPolicy() {
        return externalTrafficPolicy;
    }

    /**
     * 
     * 
     * @param externalTrafficPolicy
     *     The externalTrafficPolicy
     */
    @JsonProperty("externalTrafficPolicy")
    public void setExternalTrafficPolicy(java.lang.String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The healthCheckNodePort
     */
    @JsonProperty("healthCheckNodePort")
    public Integer getHealthCheckNodePort() {
        return healthCheckNodePort;
    }

    /**
     * 
     * 
     * @param healthCheckNodePort
     *     The healthCheckNodePort
     */
    @JsonProperty("healthCheckNodePort")
    public void setHealthCheckNodePort(Integer healthCheckNodePort) {
        this.healthCheckNodePort = healthCheckNodePort;
    }

    /**
     * 
     * 
     * @return
     *     The loadBalancerIP
     */
    @JsonProperty("loadBalancerIP")
    public java.lang.String getLoadBalancerIP() {
        return loadBalancerIP;
    }

    /**
     * 
     * 
     * @param loadBalancerIP
     *     The loadBalancerIP
     */
    @JsonProperty("loadBalancerIP")
    public void setLoadBalancerIP(java.lang.String loadBalancerIP) {
        this.loadBalancerIP = loadBalancerIP;
    }

    /**
     * 
     * 
     * @return
     *     The loadBalancerSourceRanges
     */
    @JsonProperty("loadBalancerSourceRanges")
    public List<java.lang.String> getLoadBalancerSourceRanges() {
        return loadBalancerSourceRanges;
    }

    /**
     * 
     * 
     * @param loadBalancerSourceRanges
     *     The loadBalancerSourceRanges
     */
    @JsonProperty("loadBalancerSourceRanges")
    public void setLoadBalancerSourceRanges(List<java.lang.String> loadBalancerSourceRanges) {
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    }

    /**
     * 
     * 
     * @return
     *     The ports
     */
    @JsonProperty("ports")
    public List<ServicePort> getPorts() {
        return ports;
    }

    /**
     * 
     * 
     * @param ports
     *     The ports
     */
    @JsonProperty("ports")
    public void setPorts(List<ServicePort> ports) {
        this.ports = ports;
    }

    /**
     * 
     * 
     * @return
     *     The publishNotReadyAddresses
     */
    @JsonProperty("publishNotReadyAddresses")
    public Boolean getPublishNotReadyAddresses() {
        return publishNotReadyAddresses;
    }

    /**
     * 
     * 
     * @param publishNotReadyAddresses
     *     The publishNotReadyAddresses
     */
    @JsonProperty("publishNotReadyAddresses")
    public void setPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
        this.publishNotReadyAddresses = publishNotReadyAddresses;
    }

    /**
     * 
     * 
     * @return
     *     The selector
     */
    @JsonProperty("selector")
    public Map<String, String> getSelector() {
        return selector;
    }

    /**
     * 
     * 
     * @param selector
     *     The selector
     */
    @JsonProperty("selector")
    public void setSelector(Map<String, String> selector) {
        this.selector = selector;
    }

    /**
     * 
     * 
     * @return
     *     The sessionAffinity
     */
    @JsonProperty("sessionAffinity")
    public java.lang.String getSessionAffinity() {
        return sessionAffinity;
    }

    /**
     * 
     * 
     * @param sessionAffinity
     *     The sessionAffinity
     */
    @JsonProperty("sessionAffinity")
    public void setSessionAffinity(java.lang.String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
    }

    /**
     * 
     * 
     * @return
     *     The sessionAffinityConfig
     */
    @JsonProperty("sessionAffinityConfig")
    public SessionAffinityConfig getSessionAffinityConfig() {
        return sessionAffinityConfig;
    }

    /**
     * 
     * 
     * @param sessionAffinityConfig
     *     The sessionAffinityConfig
     */
    @JsonProperty("sessionAffinityConfig")
    public void setSessionAffinityConfig(SessionAffinityConfig sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
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
