
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
    "active",
    "assigned",
    "error",
    "lastKnownGood"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NodeConfigStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("active")
    @Valid
    private NodeConfigSource active;
    /**
     * 
     * 
     */
    @JsonProperty("assigned")
    @Valid
    private NodeConfigSource assigned;
    /**
     * 
     * 
     */
    @JsonProperty("error")
    private String error;
    /**
     * 
     * 
     */
    @JsonProperty("lastKnownGood")
    @Valid
    private NodeConfigSource lastKnownGood;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeConfigStatus() {
    }

    /**
     * 
     * @param lastKnownGood
     * @param active
     * @param assigned
     * @param error
     */
    public NodeConfigStatus(NodeConfigSource active, NodeConfigSource assigned, String error, NodeConfigSource lastKnownGood) {
        this.active = active;
        this.assigned = assigned;
        this.error = error;
        this.lastKnownGood = lastKnownGood;
    }

    /**
     * 
     * 
     * @return
     *     The active
     */
    @JsonProperty("active")
    public NodeConfigSource getActive() {
        return active;
    }

    /**
     * 
     * 
     * @param active
     *     The active
     */
    @JsonProperty("active")
    public void setActive(NodeConfigSource active) {
        this.active = active;
    }

    /**
     * 
     * 
     * @return
     *     The assigned
     */
    @JsonProperty("assigned")
    public NodeConfigSource getAssigned() {
        return assigned;
    }

    /**
     * 
     * 
     * @param assigned
     *     The assigned
     */
    @JsonProperty("assigned")
    public void setAssigned(NodeConfigSource assigned) {
        this.assigned = assigned;
    }

    /**
     * 
     * 
     * @return
     *     The error
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * 
     * 
     * @param error
     *     The error
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * 
     * 
     * @return
     *     The lastKnownGood
     */
    @JsonProperty("lastKnownGood")
    public NodeConfigSource getLastKnownGood() {
        return lastKnownGood;
    }

    /**
     * 
     * 
     * @param lastKnownGood
     *     The lastKnownGood
     */
    @JsonProperty("lastKnownGood")
    public void setLastKnownGood(NodeConfigSource lastKnownGood) {
        this.lastKnownGood = lastKnownGood;
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
