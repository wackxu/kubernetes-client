
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
    "availableReplicas",
    "conditions",
    "fullyLabeledReplicas",
    "observedGeneration",
    "readyReplicas",
    "replicas"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ReplicationControllerStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("availableReplicas")
    private Integer availableReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ReplicationControllerCondition> conditions = new ArrayList<ReplicationControllerCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("fullyLabeledReplicas")
    private Integer fullyLabeledReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("observedGeneration")
    private Long observedGeneration;
    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    private Integer readyReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    private Integer replicas;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReplicationControllerStatus() {
    }

    /**
     * 
     * @param fullyLabeledReplicas
     * @param replicas
     * @param readyReplicas
     * @param conditions
     * @param availableReplicas
     * @param observedGeneration
     */
    public ReplicationControllerStatus(Integer availableReplicas, List<ReplicationControllerCondition> conditions, Integer fullyLabeledReplicas, Long observedGeneration, Integer readyReplicas, Integer replicas) {
        this.availableReplicas = availableReplicas;
        this.conditions = conditions;
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
    }

    /**
     * 
     * 
     * @return
     *     The availableReplicas
     */
    @JsonProperty("availableReplicas")
    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    /**
     * 
     * 
     * @param availableReplicas
     *     The availableReplicas
     */
    @JsonProperty("availableReplicas")
    public void setAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<ReplicationControllerCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<ReplicationControllerCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The fullyLabeledReplicas
     */
    @JsonProperty("fullyLabeledReplicas")
    public Integer getFullyLabeledReplicas() {
        return fullyLabeledReplicas;
    }

    /**
     * 
     * 
     * @param fullyLabeledReplicas
     *     The fullyLabeledReplicas
     */
    @JsonProperty("fullyLabeledReplicas")
    public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
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

    /**
     * 
     * 
     * @return
     *     The readyReplicas
     */
    @JsonProperty("readyReplicas")
    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    /**
     * 
     * 
     * @param readyReplicas
     *     The readyReplicas
     */
    @JsonProperty("readyReplicas")
    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The replicas
     */
    @JsonProperty("replicas")
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * 
     * 
     * @param replicas
     *     The replicas
     */
    @JsonProperty("replicas")
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
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
