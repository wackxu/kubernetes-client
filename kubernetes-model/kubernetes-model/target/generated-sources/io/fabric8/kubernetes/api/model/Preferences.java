
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
    "colors",
    "extensions"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Preferences implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("colors")
    private Boolean colors;
    /**
     * 
     * 
     */
    @JsonProperty("extensions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NamedExtension> extensions = new ArrayList<NamedExtension>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Preferences() {
    }

    /**
     * 
     * @param extensions
     * @param colors
     */
    public Preferences(Boolean colors, List<NamedExtension> extensions) {
        this.colors = colors;
        this.extensions = extensions;
    }

    /**
     * 
     * 
     * @return
     *     The colors
     */
    @JsonProperty("colors")
    public Boolean getColors() {
        return colors;
    }

    /**
     * 
     * 
     * @param colors
     *     The colors
     */
    @JsonProperty("colors")
    public void setColors(Boolean colors) {
        this.colors = colors;
    }

    /**
     * 
     * 
     * @return
     *     The extensions
     */
    @JsonProperty("extensions")
    public List<NamedExtension> getExtensions() {
        return extensions;
    }

    /**
     * 
     * 
     * @param extensions
     *     The extensions
     */
    @JsonProperty("extensions")
    public void setExtensions(List<NamedExtension> extensions) {
        this.extensions = extensions;
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
