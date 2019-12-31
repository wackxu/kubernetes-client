
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
    "containerName",
    "divisor",
    "resource"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ResourceFieldSelector implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("containerName")
    private String containerName;
    /**
     * 
     * 
     */
    @JsonProperty("divisor")
    @Valid
    private Quantity divisor;
    /**
     * 
     * 
     */
    @JsonProperty("resource")
    private String resource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceFieldSelector() {
    }

    /**
     * 
     * @param divisor
     * @param resource
     * @param containerName
     */
    public ResourceFieldSelector(String containerName, Quantity divisor, String resource) {
        this.containerName = containerName;
        this.divisor = divisor;
        this.resource = resource;
    }

    /**
     * 
     * 
     * @return
     *     The containerName
     */
    @JsonProperty("containerName")
    public String getContainerName() {
        return containerName;
    }

    /**
     * 
     * 
     * @param containerName
     *     The containerName
     */
    @JsonProperty("containerName")
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * 
     * 
     * @return
     *     The divisor
     */
    @JsonProperty("divisor")
    public Quantity getDivisor() {
        return divisor;
    }

    /**
     * 
     * 
     * @param divisor
     *     The divisor
     */
    @JsonProperty("divisor")
    public void setDivisor(Quantity divisor) {
        this.divisor = divisor;
    }

    /**
     * 
     * 
     * @return
     *     The resource
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * 
     * 
     * @param resource
     *     The resource
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
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
