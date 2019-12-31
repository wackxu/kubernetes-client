
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
    "maxReplicas",
    "metrics",
    "minReplicas",
    "scaleTargetRef"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class HorizontalPodAutoscalerSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("maxReplicas")
    private Integer maxReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("metrics")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<MetricSpec> metrics = new ArrayList<MetricSpec>();
    /**
     * 
     * 
     */
    @JsonProperty("minReplicas")
    private Integer minReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("scaleTargetRef")
    @Valid
    private CrossVersionObjectReference scaleTargetRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public HorizontalPodAutoscalerSpec() {
    }

    /**
     * 
     * @param maxReplicas
     * @param minReplicas
     * @param metrics
     * @param scaleTargetRef
     */
    public HorizontalPodAutoscalerSpec(Integer maxReplicas, List<MetricSpec> metrics, Integer minReplicas, CrossVersionObjectReference scaleTargetRef) {
        this.maxReplicas = maxReplicas;
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = scaleTargetRef;
    }

    /**
     * 
     * 
     * @return
     *     The maxReplicas
     */
    @JsonProperty("maxReplicas")
    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    /**
     * 
     * 
     * @param maxReplicas
     *     The maxReplicas
     */
    @JsonProperty("maxReplicas")
    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The metrics
     */
    @JsonProperty("metrics")
    public List<MetricSpec> getMetrics() {
        return metrics;
    }

    /**
     * 
     * 
     * @param metrics
     *     The metrics
     */
    @JsonProperty("metrics")
    public void setMetrics(List<MetricSpec> metrics) {
        this.metrics = metrics;
    }

    /**
     * 
     * 
     * @return
     *     The minReplicas
     */
    @JsonProperty("minReplicas")
    public Integer getMinReplicas() {
        return minReplicas;
    }

    /**
     * 
     * 
     * @param minReplicas
     *     The minReplicas
     */
    @JsonProperty("minReplicas")
    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The scaleTargetRef
     */
    @JsonProperty("scaleTargetRef")
    public CrossVersionObjectReference getScaleTargetRef() {
        return scaleTargetRef;
    }

    /**
     * 
     * 
     * @param scaleTargetRef
     *     The scaleTargetRef
     */
    @JsonProperty("scaleTargetRef")
    public void setScaleTargetRef(CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
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
