
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
    "effect",
    "key",
    "timeAdded",
    "value"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Taint implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("effect")
    private java.lang.String effect;
    /**
     * 
     * 
     */
    @JsonProperty("key")
    private java.lang.String key;
    /**
     * 
     * 
     */
    @JsonProperty("timeAdded")
    @Valid
    private String timeAdded;
    /**
     * 
     * 
     */
    @JsonProperty("value")
    private java.lang.String value;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Taint() {
    }

    /**
     * 
     * @param timeAdded
     * @param effect
     * @param value
     * @param key
     */
    public Taint(java.lang.String effect, java.lang.String key, String timeAdded, java.lang.String value) {
        this.effect = effect;
        this.key = key;
        this.timeAdded = timeAdded;
        this.value = value;
    }

    /**
     * 
     * 
     * @return
     *     The effect
     */
    @JsonProperty("effect")
    public java.lang.String getEffect() {
        return effect;
    }

    /**
     * 
     * 
     * @param effect
     *     The effect
     */
    @JsonProperty("effect")
    public void setEffect(java.lang.String effect) {
        this.effect = effect;
    }

    /**
     * 
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    public java.lang.String getKey() {
        return key;
    }

    /**
     * 
     * 
     * @param key
     *     The key
     */
    @JsonProperty("key")
    public void setKey(java.lang.String key) {
        this.key = key;
    }

    /**
     * 
     * 
     * @return
     *     The timeAdded
     */
    @JsonProperty("timeAdded")
    public String getTimeAdded() {
        return timeAdded;
    }

    /**
     * 
     * 
     * @param timeAdded
     *     The timeAdded
     */
    @JsonProperty("timeAdded")
    public void setTimeAdded(String timeAdded) {
        this.timeAdded = timeAdded;
    }

    /**
     * 
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public java.lang.String getValue() {
        return value;
    }

    /**
     * 
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(java.lang.String value) {
        this.value = value;
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
