
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
    "default",
    "defaultRequest",
    "max",
    "maxLimitRequestRatio",
    "min",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class LimitRangeItem implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("default")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> _default;
    /**
     * 
     * 
     */
    @JsonProperty("defaultRequest")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> defaultRequest;
    /**
     * 
     * 
     */
    @JsonProperty("max")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> max;
    /**
     * 
     * 
     */
    @JsonProperty("maxLimitRequestRatio")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> maxLimitRequestRatio;
    /**
     * 
     * 
     */
    @JsonProperty("min")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.Quantity> min;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private java.lang.String type;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LimitRangeItem() {
    }

    /**
     * 
     * @param _default
     * @param min
     * @param max
     * @param maxLimitRequestRatio
     * @param type
     * @param defaultRequest
     */
    public LimitRangeItem(Map<String, io.fabric8.kubernetes.api.model.Quantity> _default, Map<String, io.fabric8.kubernetes.api.model.Quantity> defaultRequest, Map<String, io.fabric8.kubernetes.api.model.Quantity> max, Map<String, io.fabric8.kubernetes.api.model.Quantity> maxLimitRequestRatio, Map<String, io.fabric8.kubernetes.api.model.Quantity> min, java.lang.String type) {
        this._default = _default;
        this.defaultRequest = defaultRequest;
        this.max = max;
        this.maxLimitRequestRatio = maxLimitRequestRatio;
        this.min = min;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The _default
     */
    @JsonProperty("default")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getDefault() {
        return _default;
    }

    /**
     * 
     * 
     * @param _default
     *     The default
     */
    @JsonProperty("default")
    public void setDefault(Map<String, io.fabric8.kubernetes.api.model.Quantity> _default) {
        this._default = _default;
    }

    /**
     * 
     * 
     * @return
     *     The defaultRequest
     */
    @JsonProperty("defaultRequest")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getDefaultRequest() {
        return defaultRequest;
    }

    /**
     * 
     * 
     * @param defaultRequest
     *     The defaultRequest
     */
    @JsonProperty("defaultRequest")
    public void setDefaultRequest(Map<String, io.fabric8.kubernetes.api.model.Quantity> defaultRequest) {
        this.defaultRequest = defaultRequest;
    }

    /**
     * 
     * 
     * @return
     *     The max
     */
    @JsonProperty("max")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getMax() {
        return max;
    }

    /**
     * 
     * 
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(Map<String, io.fabric8.kubernetes.api.model.Quantity> max) {
        this.max = max;
    }

    /**
     * 
     * 
     * @return
     *     The maxLimitRequestRatio
     */
    @JsonProperty("maxLimitRequestRatio")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getMaxLimitRequestRatio() {
        return maxLimitRequestRatio;
    }

    /**
     * 
     * 
     * @param maxLimitRequestRatio
     *     The maxLimitRequestRatio
     */
    @JsonProperty("maxLimitRequestRatio")
    public void setMaxLimitRequestRatio(Map<String, io.fabric8.kubernetes.api.model.Quantity> maxLimitRequestRatio) {
        this.maxLimitRequestRatio = maxLimitRequestRatio;
    }

    /**
     * 
     * 
     * @return
     *     The min
     */
    @JsonProperty("min")
    public Map<String, io.fabric8.kubernetes.api.model.Quantity> getMin() {
        return min;
    }

    /**
     * 
     * 
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(Map<String, io.fabric8.kubernetes.api.model.Quantity> min) {
        this.min = min;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
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
