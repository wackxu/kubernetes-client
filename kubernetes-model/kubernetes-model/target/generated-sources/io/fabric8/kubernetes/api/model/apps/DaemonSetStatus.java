
package io.fabric8.kubernetes.api.model.apps;

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
    "collisionCount",
    "conditions",
    "currentNumberScheduled",
    "desiredNumberScheduled",
    "numberAvailable",
    "numberMisscheduled",
    "numberReady",
    "numberUnavailable",
    "observedGeneration",
    "updatedNumberScheduled"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DaemonSetStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("collisionCount")
    private Integer collisionCount;
    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<DaemonSetCondition> conditions = new ArrayList<DaemonSetCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("currentNumberScheduled")
    private Integer currentNumberScheduled;
    /**
     * 
     * 
     */
    @JsonProperty("desiredNumberScheduled")
    private Integer desiredNumberScheduled;
    /**
     * 
     * 
     */
    @JsonProperty("numberAvailable")
    private Integer numberAvailable;
    /**
     * 
     * 
     */
    @JsonProperty("numberMisscheduled")
    private Integer numberMisscheduled;
    /**
     * 
     * 
     */
    @JsonProperty("numberReady")
    private Integer numberReady;
    /**
     * 
     * 
     */
    @JsonProperty("numberUnavailable")
    private Integer numberUnavailable;
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
    @JsonProperty("updatedNumberScheduled")
    private Integer updatedNumberScheduled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DaemonSetStatus() {
    }

    /**
     * 
     * @param numberUnavailable
     * @param updatedNumberScheduled
     * @param numberAvailable
     * @param numberMisscheduled
     * @param numberReady
     * @param currentNumberScheduled
     * @param collisionCount
     * @param desiredNumberScheduled
     * @param conditions
     * @param observedGeneration
     */
    public DaemonSetStatus(Integer collisionCount, List<DaemonSetCondition> conditions, Integer currentNumberScheduled, Integer desiredNumberScheduled, Integer numberAvailable, Integer numberMisscheduled, Integer numberReady, Integer numberUnavailable, Long observedGeneration, Integer updatedNumberScheduled) {
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.currentNumberScheduled = currentNumberScheduled;
        this.desiredNumberScheduled = desiredNumberScheduled;
        this.numberAvailable = numberAvailable;
        this.numberMisscheduled = numberMisscheduled;
        this.numberReady = numberReady;
        this.numberUnavailable = numberUnavailable;
        this.observedGeneration = observedGeneration;
        this.updatedNumberScheduled = updatedNumberScheduled;
    }

    /**
     * 
     * 
     * @return
     *     The collisionCount
     */
    @JsonProperty("collisionCount")
    public Integer getCollisionCount() {
        return collisionCount;
    }

    /**
     * 
     * 
     * @param collisionCount
     *     The collisionCount
     */
    @JsonProperty("collisionCount")
    public void setCollisionCount(Integer collisionCount) {
        this.collisionCount = collisionCount;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<DaemonSetCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<DaemonSetCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The currentNumberScheduled
     */
    @JsonProperty("currentNumberScheduled")
    public Integer getCurrentNumberScheduled() {
        return currentNumberScheduled;
    }

    /**
     * 
     * 
     * @param currentNumberScheduled
     *     The currentNumberScheduled
     */
    @JsonProperty("currentNumberScheduled")
    public void setCurrentNumberScheduled(Integer currentNumberScheduled) {
        this.currentNumberScheduled = currentNumberScheduled;
    }

    /**
     * 
     * 
     * @return
     *     The desiredNumberScheduled
     */
    @JsonProperty("desiredNumberScheduled")
    public Integer getDesiredNumberScheduled() {
        return desiredNumberScheduled;
    }

    /**
     * 
     * 
     * @param desiredNumberScheduled
     *     The desiredNumberScheduled
     */
    @JsonProperty("desiredNumberScheduled")
    public void setDesiredNumberScheduled(Integer desiredNumberScheduled) {
        this.desiredNumberScheduled = desiredNumberScheduled;
    }

    /**
     * 
     * 
     * @return
     *     The numberAvailable
     */
    @JsonProperty("numberAvailable")
    public Integer getNumberAvailable() {
        return numberAvailable;
    }

    /**
     * 
     * 
     * @param numberAvailable
     *     The numberAvailable
     */
    @JsonProperty("numberAvailable")
    public void setNumberAvailable(Integer numberAvailable) {
        this.numberAvailable = numberAvailable;
    }

    /**
     * 
     * 
     * @return
     *     The numberMisscheduled
     */
    @JsonProperty("numberMisscheduled")
    public Integer getNumberMisscheduled() {
        return numberMisscheduled;
    }

    /**
     * 
     * 
     * @param numberMisscheduled
     *     The numberMisscheduled
     */
    @JsonProperty("numberMisscheduled")
    public void setNumberMisscheduled(Integer numberMisscheduled) {
        this.numberMisscheduled = numberMisscheduled;
    }

    /**
     * 
     * 
     * @return
     *     The numberReady
     */
    @JsonProperty("numberReady")
    public Integer getNumberReady() {
        return numberReady;
    }

    /**
     * 
     * 
     * @param numberReady
     *     The numberReady
     */
    @JsonProperty("numberReady")
    public void setNumberReady(Integer numberReady) {
        this.numberReady = numberReady;
    }

    /**
     * 
     * 
     * @return
     *     The numberUnavailable
     */
    @JsonProperty("numberUnavailable")
    public Integer getNumberUnavailable() {
        return numberUnavailable;
    }

    /**
     * 
     * 
     * @param numberUnavailable
     *     The numberUnavailable
     */
    @JsonProperty("numberUnavailable")
    public void setNumberUnavailable(Integer numberUnavailable) {
        this.numberUnavailable = numberUnavailable;
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
     *     The updatedNumberScheduled
     */
    @JsonProperty("updatedNumberScheduled")
    public Integer getUpdatedNumberScheduled() {
        return updatedNumberScheduled;
    }

    /**
     * 
     * 
     * @param updatedNumberScheduled
     *     The updatedNumberScheduled
     */
    @JsonProperty("updatedNumberScheduled")
    public void setUpdatedNumberScheduled(Integer updatedNumberScheduled) {
        this.updatedNumberScheduled = updatedNumberScheduled;
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
