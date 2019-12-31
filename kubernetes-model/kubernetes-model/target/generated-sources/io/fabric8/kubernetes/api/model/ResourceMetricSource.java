
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
    "name",
    "targetAverageUtilization",
    "targetAverageValue"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ResourceMetricSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * 
     */
    @JsonProperty("targetAverageUtilization")
    private Integer targetAverageUtilization;
    /**
     * 
     * 
     */
    @JsonProperty("targetAverageValue")
    @Valid
    private Quantity targetAverageValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceMetricSource() {
    }

    /**
     * 
     * @param targetAverageUtilization
     * @param targetAverageValue
     * @param name
     */
    public ResourceMetricSource(String name, Integer targetAverageUtilization, Quantity targetAverageValue) {
        this.name = name;
        this.targetAverageUtilization = targetAverageUtilization;
        this.targetAverageValue = targetAverageValue;
    }

    /**
     * 
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * 
     * @return
     *     The targetAverageUtilization
     */
    @JsonProperty("targetAverageUtilization")
    public Integer getTargetAverageUtilization() {
        return targetAverageUtilization;
    }

    /**
     * 
     * 
     * @param targetAverageUtilization
     *     The targetAverageUtilization
     */
    @JsonProperty("targetAverageUtilization")
    public void setTargetAverageUtilization(Integer targetAverageUtilization) {
        this.targetAverageUtilization = targetAverageUtilization;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
