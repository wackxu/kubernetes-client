
package io.fabric8.kubernetes.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "names",
    "sizeBytes"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ContainerImage implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("names")
    @Valid
    private List<String> names = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("sizeBytes")
    private Long sizeBytes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerImage() {
    }

    /**
     * 
     * @param names
     * @param sizeBytes
     */
    public ContainerImage(List<String> names, Long sizeBytes) {
        this.names = names;
        this.sizeBytes = sizeBytes;
    }

    /**
     * 
     * 
     * @return
     *     The names
     */
    @JsonProperty("names")
    public List<String> getNames() {
        return names;
    }

    /**
     * 
     * 
     * @param names
     *     The names
     */
    @JsonProperty("names")
    public void setNames(List<String> names) {
        this.names = names;
    }

    /**
     * 
     * 
     * @return
     *     The sizeBytes
     */
    @JsonProperty("sizeBytes")
    public Long getSizeBytes() {
        return sizeBytes;
    }

    /**
     * 
     * 
     * @param sizeBytes
     *     The sizeBytes
     */
    @JsonProperty("sizeBytes")
    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
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
