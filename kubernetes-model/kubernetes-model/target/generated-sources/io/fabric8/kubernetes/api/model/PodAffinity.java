
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
    "preferredDuringSchedulingIgnoredDuringExecution",
    "requiredDuringSchedulingIgnoredDuringExecution"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodAffinity implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTerm>();
    /**
     * 
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTerm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodAffinity() {
    }

    /**
     * 
     * @param requiredDuringSchedulingIgnoredDuringExecution
     * @param preferredDuringSchedulingIgnoredDuringExecution
     */
    public PodAffinity(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution, List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @return
     *     The preferredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @param preferredDuringSchedulingIgnoredDuringExecution
     *     The preferredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public void setPreferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @return
     *     The requiredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @param requiredDuringSchedulingIgnoredDuringExecution
     *     The requiredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public void setRequiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
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
