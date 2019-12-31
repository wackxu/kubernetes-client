
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
    "metricName",
    "metricSelector",
    "targetAverageValue",
    "targetValue"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ExternalMetricSource implements KubernetesResource
{

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
    @JsonProperty("metricSelector")
    @Valid
    private LabelSelector metricSelector;
    /**
     * 
     * 
     */
    @JsonProperty("targetAverageValue")
    @Valid
    private Quantity targetAverageValue;
    /**
     * 
     * 
     */
    @JsonProperty("targetValue")
    @Valid
    private Quantity targetValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalMetricSource() {
    }

    /**
     * 
     * @param metricSelector
     * @param metricName
     * @param targetAverageValue
     * @param targetValue
     */
    public ExternalMetricSource(String metricName, LabelSelector metricSelector, Quantity targetAverageValue, Quantity targetValue) {
        this.metricName = metricName;
        this.metricSelector = metricSelector;
        this.targetAverageValue = targetAverageValue;
        this.targetValue = targetValue;
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
     *     The metricSelector
     */
    @JsonProperty("metricSelector")
    public LabelSelector getMetricSelector() {
        return metricSelector;
    }

    /**
     * 
     * 
     * @param metricSelector
     *     The metricSelector
     */
    @JsonProperty("metricSelector")
    public void setMetricSelector(LabelSelector metricSelector) {
        this.metricSelector = metricSelector;
    }

    /**
     * 
     * 
     * @return
     *     The targetAverageValue
     */
    @JsonProperty("targetAverageValue")
    public Quantity getTargetAverageValue() {
        return targetAverageValue;
    }

    /**
     * 
     * 
     * @param targetAverageValue
     *     The targetAverageValue
     */
    @JsonProperty("targetAverageValue")
    public void setTargetAverageValue(Quantity targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    /**
     * 
     * 
     * @return
     *     The targetValue
     */
    @JsonProperty("targetValue")
    public Quantity getTargetValue() {
        return targetValue;
    }

    /**
     * 
     * 
     * @param targetValue
     *     The targetValue
     */
    @JsonProperty("targetValue")
    public void setTargetValue(Quantity targetValue) {
        this.targetValue = targetValue;
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
