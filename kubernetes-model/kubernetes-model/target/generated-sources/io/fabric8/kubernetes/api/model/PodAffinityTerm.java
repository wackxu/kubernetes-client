
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
    "labelSelector",
    "namespaces",
    "topologyKey"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodAffinityTerm implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("labelSelector")
    @Valid
    private LabelSelector labelSelector;
    /**
     * 
     * 
     */
    @JsonProperty("namespaces")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> namespaces = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("topologyKey")
    private String topologyKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodAffinityTerm() {
    }

    /**
     * 
     * @param labelSelector
     * @param topologyKey
     * @param namespaces
     */
    public PodAffinityTerm(LabelSelector labelSelector, List<String> namespaces, String topologyKey) {
        this.labelSelector = labelSelector;
        this.namespaces = namespaces;
        this.topologyKey = topologyKey;
    }

    /**
     * 
     * 
     * @return
     *     The labelSelector
     */
    @JsonProperty("labelSelector")
    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    /**
     * 
     * 
     * @param labelSelector
     *     The labelSelector
     */
    @JsonProperty("labelSelector")
    public void setLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    /**
     * 
     * 
     * @return
     *     The namespaces
     */
    @JsonProperty("namespaces")
    public List<String> getNamespaces() {
        return namespaces;
    }

    /**
     * 
     * 
     * @param namespaces
     *     The namespaces
     */
    @JsonProperty("namespaces")
    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    /**
     * 
     * 
     * @return
     *     The topologyKey
     */
    @JsonProperty("topologyKey")
    public String getTopologyKey() {
        return topologyKey;
    }

    /**
     * 
     * 
     * @param topologyKey
     *     The topologyKey
     */
    @JsonProperty("topologyKey")
    public void setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
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
