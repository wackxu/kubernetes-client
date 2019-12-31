
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
    "currentAverageValue",
    "metricName",
    "selector"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodsMetricStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("currentAverageValue")
    @Valid
    private Quantity currentAverageValue;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodsMetricStatus() {
    }

    /**
     * 
     * @param metricName
     * @param currentAverageValue
     * @param selector
     */
    public PodsMetricStatus(Quantity currentAverageValue, String metricName, LabelSelector selector) {
        this.currentAverageValue = currentAverageValue;
        this.metricName = metricName;
        this.selector = selector;
    }

    /**
     * 
     * 
     * @return
     *     The currentAverageValue
     */
    @JsonProperty("currentAverageValue")
    public Quantity getCurrentAverageValue() {
        return currentAverageValue;
    }

    /**
     * 
     * 
     * @param currentAverageValue
     *     The currentAverageValue
     */
    @JsonProperty("currentAverageValue")
    public void setCurrentAverageValue(Quantity currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
