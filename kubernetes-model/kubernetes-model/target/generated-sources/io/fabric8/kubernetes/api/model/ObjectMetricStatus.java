
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
    "averageValue",
    "currentValue",
    "metricName",
    "selector",
    "target"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ObjectMetricStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("averageValue")
    @Valid
    private Quantity averageValue;
    /**
     * 
     * 
     */
    @JsonProperty("currentValue")
    @Valid
    private Quantity currentValue;
    /**
     * 
     * 
     */
    @JsonProperty("metricName")
    private String metricName;
    /**
     * 
     * 
     */
    @JsonProperty("selector")
    @Valid
    private LabelSelector selector;
    /**
     * 
     * 
     */
    @JsonProperty("target")
    @Valid
    private CrossVersionObjectReference target;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectMetricStatus() {
    }

    /**
     * 
     * @param averageValue
     * @param metricName
     * @param selector
     * @param currentValue
     * @param target
     */
    public ObjectMetricStatus(Quantity averageValue, Quantity currentValue, String metricName, LabelSelector selector, CrossVersionObjectReference target) {
        this.averageValue = averageValue;
        this.currentValue = currentValue;
        this.metricName = metricName;
        this.selector = selector;
        this.target = target;
    }

    /**
     * 
     * 
     * @return
     *     The averageValue
     */
    @JsonProperty("averageValue")
    public Quantity getAverageValue() {
        return averageValue;
    }

    /**
     * 
     * 
     * @param averageValue
     *     The averageValue
     */
    @JsonProperty("averageValue")
    public void setAverageValue(Quantity averageValue) {
        this.averageValue = averageValue;
    }

    /**
     * 
     * 
     * @return
     *     The currentValue
     */
    @JsonProperty("currentValue")
    public Quantity getCurrentValue() {
        return currentValue;
    }

    /**
     * 
     * 
     * @param currentValue
     *     The currentValue
     */
    @JsonProperty("currentValue")
    public void setCurrentValue(Quantity currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * 
     * 
     * @return
     *     The metricName
     */
    @JsonProperty("metricName")
    public String getMetricName() {
        return metricName;
    }

    /**
     * 
     * 
     * @param metricName
     *     The metricName
     */
    @JsonProperty("metricName")
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * 
     * 
     * @return
     *     The selector
     */
    @JsonProperty("selector")
    public LabelSelector getSelector() {
        return selector;
    }

    /**
     * 
     * 
     * @param selector
     *     The selector
     */
    @JsonProperty("selector")
    public void setSelector(LabelSelector selector) {
        this.selector = selector;
    }

    /**
     * 
     * 
     * @return
     *     The target
     */
    @JsonProperty("target")
    public CrossVersionObjectReference getTarget() {
        return target;
    }

    /**
     * 
     * 
     * @param target
     *     The target
     */
    @JsonProperty("target")
    public void setTarget(CrossVersionObjectReference target) {
        this.target = target;
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
