
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
    "conditions",
    "currentMetrics",
    "currentReplicas",
    "desiredReplicas",
    "lastScaleTime",
    "observedGeneration"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class HorizontalPodAutoscalerStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @Valid
    private List<HorizontalPodAutoscalerCondition> conditions = new ArrayList<HorizontalPodAutoscalerCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("currentMetrics")
    @Valid
    private List<MetricStatus> currentMetrics = new ArrayList<MetricStatus>();
    /**
     * 
     * 
     */
    @JsonProperty("currentReplicas")
    private Integer currentReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("desiredReplicas")
    private Integer desiredReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("lastScaleTime")
    @Valid
    private String lastScaleTime;
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
    public HorizontalPodAutoscalerStatus() {
    }

    /**
     * 
     * @param desiredReplicas
     * @param currentReplicas
     * @param conditions
     * @param lastScaleTime
     * @param observedGeneration
     * @param currentMetrics
     */
    public HorizontalPodAutoscalerStatus(List<HorizontalPodAutoscalerCondition> conditions, List<MetricStatus> currentMetrics, Integer currentReplicas, Integer desiredReplicas, String lastScaleTime, Long observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = desiredReplicas;
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<HorizontalPodAutoscalerCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<HorizontalPodAutoscalerCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The currentMetrics
     */
    @JsonProperty("currentMetrics")
    public List<MetricStatus> getCurrentMetrics() {
        return currentMetrics;
    }

    /**
     * 
     * 
     * @param currentMetrics
     *     The currentMetrics
     */
    @JsonProperty("currentMetrics")
    public void setCurrentMetrics(List<MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
    }

    /**
     * 
     * 
     * @return
     *     The currentReplicas
     */
    @JsonProperty("currentReplicas")
    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    /**
     * 
     * 
     * @param currentReplicas
     *     The currentReplicas
     */
    @JsonProperty("currentReplicas")
    public void setCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The desiredReplicas
     */
    @JsonProperty("desiredReplicas")
    public Integer getDesiredReplicas() {
        return desiredReplicas;
    }

    /**
     * 
     * 
     * @param desiredReplicas
     *     The desiredReplicas
     */
    @JsonProperty("desiredReplicas")
    public void setDesiredReplicas(Integer desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The lastScaleTime
     */
    @JsonProperty("lastScaleTime")
    public String getLastScaleTime() {
        return lastScaleTime;
    }

    /**
     * 
     * 
     * @param lastScaleTime
     *     The lastScaleTime
     */
    @JsonProperty("lastScaleTime")
    public void setLastScaleTime(String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
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
