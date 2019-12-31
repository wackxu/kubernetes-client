
package io.fabric8.kubernetes.api.model.apps;

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
    "maxSurge",
    "maxUnavailable"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RollingUpdateDeployment implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("maxSurge")
    @Valid
    private IntOrString maxSurge;
    /**
     * 
     * 
     */
    @JsonProperty("maxUnavailable")
    @Valid
    private IntOrString maxUnavailable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RollingUpdateDeployment() {
    }

    /**
     * 
     * @param maxSurge
     * @param maxUnavailable
     */
    public RollingUpdateDeployment(IntOrString maxSurge, IntOrString maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * 
     * 
     * @return
     *     The maxSurge
     */
    @JsonProperty("maxSurge")
    public IntOrString getMaxSurge() {
        return maxSurge;
    }

    /**
     * 
     * 
     * @param maxSurge
     *     The maxSurge
     */
    @JsonProperty("maxSurge")
    public void setMaxSurge(IntOrString maxSurge) {
        this.maxSurge = maxSurge;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
