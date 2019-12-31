
package io.fabric8.kubernetes.api.model.policy;

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
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
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
    "maxUnavailable",
    "minAvailable",
    "selector"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodDisruptionBudgetSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("maxUnavailable")
    @Valid
    private IntOrString maxUnavailable;
    /**
     * 
     * 
     */
    @JsonProperty("minAvailable")
    @Valid
    private IntOrString minAvailable;
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
    public PodDisruptionBudgetSpec() {
    }

    /**
     * 
     * @param minAvailable
     * @param maxUnavailable
     * @param selector
     */
    public PodDisruptionBudgetSpec(IntOrString maxUnavailable, IntOrString minAvailable, LabelSelector selector) {
        this.maxUnavailable = maxUnavailable;
        this.minAvailable = minAvailable;
        this.selector = selector;
    }

    /**
     * 
     * 
     * @return
     *     The maxUnavailable
     */
    @JsonProperty("maxUnavailable")
    public IntOrString getMaxUnavailable() {
        return maxUnavailable;
    }

    /**
     * 
     * 
     * @param maxUnavailable
     *     The maxUnavailable
     */
    @JsonProperty("maxUnavailable")
    public void setMaxUnavailable(IntOrString maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * 
     * 
     * @return
     *     The minAvailable
     */
    @JsonProperty("minAvailable")
    public IntOrString getMinAvailable() {
        return minAvailable;
    }

    /**
     * 
     * 
     * @param minAvailable
     *     The minAvailable
     */
    @JsonProperty("minAvailable")
    public void setMinAvailable(IntOrString minAvailable) {
        this.minAvailable = minAvailable;
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
