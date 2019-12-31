
package io.fabric8.openshift.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.KubernetesResource;
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
    "max",
    "min"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class IDRange implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("max")
    private Long max;
    /**
     * 
     * 
     */
    @JsonProperty("min")
    private Long min;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IDRange() {
    }

    /**
     * 
     * @param min
     * @param max
     */
    public IDRange(Long max, Long min) {
        this.max = max;
        this.min = min;
    }

    /**
     * 
     * 
     * @return
     *     The max
     */
    @JsonProperty("max")
    public Long getMax() {
        return max;
    }

    /**
     * 
     * 
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(Long max) {
        this.max = max;
    }

    /**
     * 
     * 
     * @return
     *     The min
     */
    @JsonProperty("min")
    public Long getMin() {
        return min;
    }

    /**
     * 
     * 
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(Long min) {
        this.min = min;
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
