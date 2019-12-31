
package io.fabric8.openshift.api.model;

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
    "conditions",
    "items",
    "tag"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NamedTagEventList implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<TagEventCondition> conditions = new ArrayList<TagEventCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("items")
    @Valid
    private List<TagEvent> items = new ArrayList<TagEvent>();
    /**
     * 
     * 
     */
    @JsonProperty("tag")
    private String tag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NamedTagEventList() {
    }

    /**
     * 
     * @param tag
     * @param conditions
     * @param items
     */
    public NamedTagEventList(List<TagEventCondition> conditions, List<TagEvent> items, String tag) {
        this.conditions = conditions;
        this.items = items;
        this.tag = tag;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<TagEventCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<TagEventCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    public List<TagEvent> getItems() {
        return items;
    }

    /**
     * 
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    public void setItems(List<TagEvent> items) {
        this.items = items;
    }

    /**
     * 
     * 
     * @return
     *     The tag
     */
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    /**
     * 
     * 
     * @param tag
     *     The tag
     */
    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
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
