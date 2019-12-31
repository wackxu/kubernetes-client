
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
    "currentAverageUtilization",
    "currentAverageValue",
    "name"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ResourceMetricStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("currentAverageUtilization")
    private Integer currentAverageUtilization;
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
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceMetricStatus() {
    }

    /**
     * 
     * @param currentAverageValue
     * @param name
     * @param currentAverageUtilization
     */
    public ResourceMetricStatus(Integer currentAverageUtilization, Quantity currentAverageValue, String name) {
        this.currentAverageUtilization = currentAverageUtilization;
        this.currentAverageValue = currentAverageValue;
        this.name = name;
    }

    /**
     * 
     * 
     * @return
     *     The currentAverageUtilization
     */
    @JsonProperty("currentAverageUtilization")
    public Integer getCurrentAverageUtilization() {
        return currentAverageUtilization;
    }

    /**
     * 
     * 
     * @param currentAverageUtilization
     *     The currentAverageUtilization
     */
    @JsonProperty("currentAverageUtilization")
    public void setCurrentAverageUtilization(Integer currentAverageUtilization) {
        this.currentAverageUtilization = currentAverageUtilization;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
