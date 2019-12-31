
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
    "configSource",
    "externalID",
    "podCIDR",
    "providerID",
    "taints",
    "unschedulable"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NodeSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("configSource")
    @Valid
    private NodeConfigSource configSource;
    /**
     * 
     * 
     */
    @JsonProperty("externalID")
    private String externalID;
    /**
     * 
     * 
     */
    @JsonProperty("podCIDR")
    private String podCIDR;
    /**
     * 
     * 
     */
    @JsonProperty("providerID")
    private String providerID;
    /**
     * 
     * 
     */
    @JsonProperty("taints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<Taint> taints = new ArrayList<Taint>();
    /**
     * 
     * 
     */
    @JsonProperty("unschedulable")
    private Boolean unschedulable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeSpec() {
    }

    /**
     * 
     * @param providerID
     * @param externalID
     * @param taints
     * @param configSource
     * @param unschedulable
     * @param podCIDR
     */
    public NodeSpec(NodeConfigSource configSource, String externalID, String podCIDR, String providerID, List<Taint> taints, Boolean unschedulable) {
        this.configSource = configSource;
        this.externalID = externalID;
        this.podCIDR = podCIDR;
        this.providerID = providerID;
        this.taints = taints;
        this.unschedulable = unschedulable;
    }

    /**
     * 
     * 
     * @return
     *     The configSource
     */
    @JsonProperty("configSource")
    public NodeConfigSource getConfigSource() {
        return configSource;
    }

    /**
     * 
     * 
     * @param configSource
     *     The configSource
     */
    @JsonProperty("configSource")
    public void setConfigSource(NodeConfigSource configSource) {
        this.configSource = configSource;
    }

    /**
     * 
     * 
     * @return
     *     The externalID
     */
    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    /**
     * 
     * 
     * @param externalID
     *     The externalID
     */
    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    /**
     * 
     * 
     * @return
     *     The podCIDR
     */
    @JsonProperty("podCIDR")
    public String getPodCIDR() {
        return podCIDR;
    }

    /**
     * 
     * 
     * @param podCIDR
     *     The podCIDR
     */
    @JsonProperty("podCIDR")
    public void setPodCIDR(String podCIDR) {
        this.podCIDR = podCIDR;
    }

    /**
     * 
     * 
     * @return
     *     The providerID
     */
    @JsonProperty("providerID")
    public String getProviderID() {
        return providerID;
    }

    /**
     * 
     * 
     * @param providerID
     *     The providerID
     */
    @JsonProperty("providerID")
    public void setProviderID(String providerID) {
        this.providerID = providerID;
    }

    /**
     * 
     * 
     * @return
     *     The taints
     */
    @JsonProperty("taints")
    public List<Taint> getTaints() {
        return taints;
    }

    /**
     * 
     * 
     * @param taints
     *     The taints
     */
    @JsonProperty("taints")
    public void setTaints(List<Taint> taints) {
        this.taints = taints;
    }

    /**
     * 
     * 
     * @return
     *     The unschedulable
     */
    @JsonProperty("unschedulable")
    public Boolean getUnschedulable() {
        return unschedulable;
    }

    /**
     * 
     * 
     * @param unschedulable
     *     The unschedulable
     */
    @JsonProperty("unschedulable")
    public void setUnschedulable(Boolean unschedulable) {
        this.unschedulable = unschedulable;
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
