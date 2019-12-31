
package io.fabric8.kubernetes.api.model.policy;

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
    "currentHealthy",
    "desiredHealthy",
    "disruptedPods",
    "disruptionsAllowed",
    "expectedPods",
    "observedGeneration"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodDisruptionBudgetStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("currentHealthy")
    private Integer currentHealthy;
    /**
     * 
     * 
     */
    @JsonProperty("desiredHealthy")
    private Integer desiredHealthy;
    /**
     * 
     * 
     */
    @JsonProperty("disruptedPods")
    @Valid
    private Map<String, String> disruptedPods;
    /**
     * 
     * 
     */
    @JsonProperty("disruptionsAllowed")
    private Integer disruptionsAllowed;
    /**
     * 
     * 
     */
    @JsonProperty("expectedPods")
    private Integer expectedPods;
    /**
     * 
     * 
     */
    @JsonProperty("observedGeneration")
    private Long observedGeneration;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodDisruptionBudgetStatus() {
    }

    /**
     * 
     * @param currentHealthy
     * @param expectedPods
     * @param disruptionsAllowed
     * @param disruptedPods
     * @param observedGeneration
     * @param desiredHealthy
     */
    public PodDisruptionBudgetStatus(Integer currentHealthy, Integer desiredHealthy, Map<String, String> disruptedPods, Integer disruptionsAllowed, Integer expectedPods, Long observedGeneration) {
        this.currentHealthy = currentHealthy;
        this.desiredHealthy = desiredHealthy;
        this.disruptedPods = disruptedPods;
        this.disruptionsAllowed = disruptionsAllowed;
        this.expectedPods = expectedPods;
        this.observedGeneration = observedGeneration;
    }

    /**
     * 
     * 
     * @return
     *     The currentHealthy
     */
    @JsonProperty("currentHealthy")
    public Integer getCurrentHealthy() {
        return currentHealthy;
    }

    /**
     * 
     * 
     * @param currentHealthy
     *     The currentHealthy
     */
    @JsonProperty("currentHealthy")
    public void setCurrentHealthy(Integer currentHealthy) {
        this.currentHealthy = currentHealthy;
    }

    /**
     * 
     * 
     * @return
     *     The desiredHealthy
     */
    @JsonProperty("desiredHealthy")
    public Integer getDesiredHealthy() {
        return desiredHealthy;
    }

    /**
     * 
     * 
     * @param desiredHealthy
     *     The desiredHealthy
     */
    @JsonProperty("desiredHealthy")
    public void setDesiredHealthy(Integer desiredHealthy) {
        this.desiredHealthy = desiredHealthy;
    }

    /**
     * 
     * 
     * @return
     *     The disruptedPods
     */
    @JsonProperty("disruptedPods")
    public Map<String, String> getDisruptedPods() {
        return disruptedPods;
    }

    /**
     * 
     * 
     * @param disruptedPods
     *     The disruptedPods
     */
    @JsonProperty("disruptedPods")
    public void setDisruptedPods(Map<String, String> disruptedPods) {
        this.disruptedPods = disruptedPods;
    }

    /**
     * 
     * 
     * @return
     *     The disruptionsAllowed
     */
    @JsonProperty("disruptionsAllowed")
    public Integer getDisruptionsAllowed() {
        return disruptionsAllowed;
    }

    /**
     * 
     * 
     * @param disruptionsAllowed
     *     The disruptionsAllowed
     */
    @JsonProperty("disruptionsAllowed")
    public void setDisruptionsAllowed(Integer disruptionsAllowed) {
        this.disruptionsAllowed = disruptionsAllowed;
    }

    /**
     * 
     * 
     * @return
     *     The expectedPods
     */
    @JsonProperty("expectedPods")
    public Integer getExpectedPods() {
        return expectedPods;
    }

    /**
     * 
     * 
     * @param expectedPods
     *     The expectedPods
     */
    @JsonProperty("expectedPods")
    public void setExpectedPods(Integer expectedPods) {
        this.expectedPods = expectedPods;
    }

    /**
     * 
     * 
     * @return
     *     The observedGeneration
     */
    @JsonProperty("observedGeneration")
    public Long getObservedGeneration() {
        return observedGeneration;
    }

    /**
     * 
     * 
     * @param observedGeneration
     *     The observedGeneration
     */
    @JsonProperty("observedGeneration")
    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
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
