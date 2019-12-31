
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
    "limits",
    "requests"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ResourceRequirements implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("limits")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> limits;
    /**
     * 
     * 
     */
    @JsonProperty("requests")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> requests;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceRequirements() {
    }

    /**
     * 
     * @param requests
     * @param limits
     */
    public ResourceRequirements(Map<String, io.fabric8.kubernetes.api.model.Quantity> limits, Map<String, io.fabric8.kubernetes.api.model.Quantity> requests) {
        this.limits = limits;
        this.requests = requests;
    }

    /**
     * 
     * 
     * @return
     *     The limits
     */
    @JsonProperty("limits")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getLimits() {
        return limits;
    }

    /**
     * 
     * 
     * @param limits
     *     The limits
     */
    @JsonProperty("limits")
    public void setLimits(Map<String, io.fabric8.kubernetes.api.model.Quantity> limits) {
        this.limits = limits;
    }

    /**
     * 
     * 
     * @return
     *     The requests
     */
    @JsonProperty("requests")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getRequests() {
        return requests;
    }

    /**
     * 
     * 
     * @param requests
     *     The requests
     */
    @JsonProperty("requests")
    public void setRequests(Map<String, io.fabric8.kubernetes.api.model.Quantity> requests) {
        this.requests = requests;
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
