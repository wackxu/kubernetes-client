
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
    "accessModes",
    "capacity",
    "conditions",
    "phase"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PersistentVolumeClaimStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("accessModes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> accessModes = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("capacity")
    @Valid
    private Map<String, Quantity> capacity;
    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<PersistentVolumeClaimCondition> conditions = new ArrayList<PersistentVolumeClaimCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("phase")
    private java.lang.String phase;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersistentVolumeClaimStatus() {
    }

    /**
     * 
     * @param phase
     * @param accessModes
     * @param conditions
     * @param capacity
     */
    public PersistentVolumeClaimStatus(List<java.lang.String> accessModes, Map<String, Quantity> capacity, List<PersistentVolumeClaimCondition> conditions, java.lang.String phase) {
        this.accessModes = accessModes;
        this.capacity = capacity;
        this.conditions = conditions;
        this.phase = phase;
    }

    /**
     * 
     * 
     * @return
     *     The accessModes
     */
    @JsonProperty("accessModes")
    public List<java.lang.String> getAccessModes() {
        return accessModes;
    }

    /**
     * 
     * 
     * @param accessModes
     *     The accessModes
     */
    @JsonProperty("accessModes")
    public void setAccessModes(List<java.lang.String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * 
     * 
     * @return
     *     The capacity
     */
    @JsonProperty("capacity")
    public Map<String, Quantity> getCapacity() {
        return capacity;
    }

    /**
     * 
     * 
     * @param capacity
     *     The capacity
     */
    @JsonProperty("capacity")
    public void setCapacity(Map<String, Quantity> capacity) {
        this.capacity = capacity;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<PersistentVolumeClaimCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<PersistentVolumeClaimCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The phase
     */
    @JsonProperty("phase")
    public java.lang.String getPhase() {
        return phase;
    }

    /**
     * 
     * 
     * @param phase
     *     The phase
     */
    @JsonProperty("phase")
    public void setPhase(java.lang.String phase) {
        this.phase = phase;
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
