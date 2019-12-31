
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
    "add",
    "drop"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Capabilities implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("add")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> add = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("drop")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> drop = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Capabilities() {
    }

    /**
     * 
     * @param add
     * @param drop
     */
    public Capabilities(List<String> add, List<String> drop) {
        this.add = add;
        this.drop = drop;
    }

    /**
     * 
     * 
     * @return
     *     The add
     */
    @JsonProperty("add")
    public List<String> getAdd() {
        return add;
    }

    /**
     * 
     * 
     * @param add
     *     The add
     */
    @JsonProperty("add")
    public void setAdd(List<String> add) {
        this.add = add;
    }

    /**
     * 
     * 
     * @return
     *     The drop
     */
    @JsonProperty("drop")
    public List<String> getDrop() {
        return drop;
    }

    /**
     * 
     * 
     * @param drop
     *     The drop
     */
    @JsonProperty("drop")
    public void setDrop(List<String> drop) {
        this.drop = drop;
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
