
package io.fabric8.kubernetes.api.model.apiextensions;

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
    "scale",
    "status"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceSubresources implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("scale")
    @Valid
    private CustomResourceSubresourceScale scale;
    /**
     * 
     * 
     */
    @JsonProperty("status")
    @Valid
    private CustomResourceSubresourceStatus status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceSubresources() {
    }

    /**
     * 
     * @param scale
     * @param status
     */
    public CustomResourceSubresources(CustomResourceSubresourceScale scale, CustomResourceSubresourceStatus status) {
        this.scale = scale;
        this.status = status;
    }

    /**
     * 
     * 
     * @return
     *     The scale
     */
    @JsonProperty("scale")
    public CustomResourceSubresourceScale getScale() {
        return scale;
    }

    /**
     * 
     * 
     * @param scale
     *     The scale
     */
    @JsonProperty("scale")
    public void setScale(CustomResourceSubresourceScale scale) {
        this.scale = scale;
    }

    /**
     * 
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public CustomResourceSubresourceStatus getStatus() {
        return status;
    }

    /**
     * 
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(CustomResourceSubresourceStatus status) {
        this.status = status;
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
