
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
    "podAffinityTerm",
    "weight"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class WeightedPodAffinityTerm implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("podAffinityTerm")
    @Valid
    private PodAffinityTerm podAffinityTerm;
    /**
     * 
     * 
     */
    @JsonProperty("weight")
    private Integer weight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeightedPodAffinityTerm() {
    }

    /**
     * 
     * @param podAffinityTerm
     * @param weight
     */
    public WeightedPodAffinityTerm(PodAffinityTerm podAffinityTerm, Integer weight) {
        this.podAffinityTerm = podAffinityTerm;
        this.weight = weight;
    }

    /**
     * 
     * 
     * @return
     *     The podAffinityTerm
     */
    @JsonProperty("podAffinityTerm")
    public PodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    /**
     * 
     * 
     * @param podAffinityTerm
     *     The podAffinityTerm
     */
    @JsonProperty("podAffinityTerm")
    public void setPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    /**
     * 
     * 
     * @return
     *     The weight
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * 
     * @param weight
     *     The weight
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
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
