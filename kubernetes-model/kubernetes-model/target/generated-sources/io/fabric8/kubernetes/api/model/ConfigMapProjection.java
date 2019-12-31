
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
    "items",
    "name",
    "optional"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ConfigMapProjection implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("items")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<KeyToPath> items = new ArrayList<KeyToPath>();
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
    @JsonProperty("optional")
    private Boolean optional;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConfigMapProjection() {
    }

    /**
     * 
     * @param name
     * @param optional
     * @param items
     */
    public ConfigMapProjection(List<KeyToPath> items, String name, Boolean optional) {
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    /**
     * 
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    public List<KeyToPath> getItems() {
        return items;
    }

    /**
     * 
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    public void setItems(List<KeyToPath> items) {
        this.items = items;
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
     *     The optional
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * 
     * 
     * @param optional
     *     The optional
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
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
