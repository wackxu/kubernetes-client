
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
    "hard",
    "used"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ResourceQuotaStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("hard")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> hard;
    /**
     * 
     * 
     */
    @JsonProperty("used")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> used;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceQuotaStatus() {
    }

    /**
     * 
     * @param hard
     * @param used
     */
    public ResourceQuotaStatus(Map<String, io.fabric8.kubernetes.api.model.Quantity> hard, Map<String, io.fabric8.kubernetes.api.model.Quantity> used) {
        this.hard = hard;
        this.used = used;
    }

    /**
     * 
     * 
     * @return
     *     The hard
     */
    @JsonProperty("hard")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getHard() {
        return hard;
    }

    /**
     * 
     * 
     * @param hard
     *     The hard
     */
    @JsonProperty("hard")
    public void setHard(Map<String, io.fabric8.kubernetes.api.model.Quantity> hard) {
        this.hard = hard;
    }

    /**
     * 
     * 
     * @return
     *     The used
     */
    @JsonProperty("used")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getUsed() {
        return used;
    }

    /**
     * 
     * 
     * @param used
     *     The used
     */
    @JsonProperty("used")
    public void setUsed(Map<String, io.fabric8.kubernetes.api.model.Quantity> used) {
        this.used = used;
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
