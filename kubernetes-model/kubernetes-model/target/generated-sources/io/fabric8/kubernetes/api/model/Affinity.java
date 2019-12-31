
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
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
    "nodeAffinity",
    "podAffinity",
    "podAntiAffinity"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Affinity implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("nodeAffinity")
    @Valid
    private NodeAffinity nodeAffinity;
    /**
     * 
     * 
     */
    @JsonProperty("podAffinity")
    @Valid
    private PodAffinity podAffinity;
    /**
     * 
     * 
     */
    @JsonProperty("podAntiAffinity")
    @Valid
    private PodAntiAffinity podAntiAffinity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Affinity() {
    }

    /**
     * 
     * @param nodeAffinity
     * @param podAffinity
     * @param podAntiAffinity
     */
    public Affinity(NodeAffinity nodeAffinity, PodAffinity podAffinity, PodAntiAffinity podAntiAffinity) {
        this.nodeAffinity = nodeAffinity;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
    }

    /**
     * 
     * 
     * @return
     *     The nodeAffinity
     */
    @JsonProperty("nodeAffinity")
    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    /**
     * 
     * 
     * @param nodeAffinity
     *     The nodeAffinity
     */
    @JsonProperty("nodeAffinity")
    public void setNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * 
     * 
     * @return
     *     The podAffinity
     */
    @JsonProperty("podAffinity")
    public PodAffinity getPodAffinity() {
        return podAffinity;
    }

    /**
     * 
     * 
     * @param podAffinity
     *     The podAffinity
     */
    @JsonProperty("podAffinity")
    public void setPodAffinity(PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * 
     * 
     * @return
     *     The podAntiAffinity
     */
    @JsonProperty("podAntiAffinity")
    public PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    /**
     * 
     * 
     * @param podAntiAffinity
     *     The podAntiAffinity
     */
    @JsonProperty("podAntiAffinity")
    public void setPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
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
