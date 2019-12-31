
package io.fabric8.kubernetes.api.model.apiextensions;

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
    "categories",
    "listKind",
    "plural",
    "shortNames",
    "singular"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceDefinitionNames implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("categories")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> categories = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("kind")
    private String kind;
    /**
     * 
     * 
     */
    @JsonProperty("listKind")
    private String listKind;
    /**
     * 
     * 
     */
    @JsonProperty("plural")
    private String plural;
    /**
     * 
     * 
     */
    @JsonProperty("shortNames")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> shortNames = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("singular")
    private String singular;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceDefinitionNames() {
    }

    /**
     * 
     * @param listKind
     * @param shortNames
     * @param plural
     * @param kind
     * @param categories
     * @param singular
     */
    public CustomResourceDefinitionNames(List<String> categories, String kind, String listKind, String plural, List<String> shortNames, String singular) {
        this.categories = categories;
        this.kind = kind;
        this.listKind = listKind;
        this.plural = plural;
        this.shortNames = shortNames;
        this.singular = singular;
    }

    /**
     * 
     * 
     * @return
     *     The categories
     */
    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    /**
     * 
     * 
     * @param categories
     *     The categories
     */
    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * 
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * 
     * @return
     *     The listKind
     */
    @JsonProperty("listKind")
    public String getListKind() {
        return listKind;
    }

    /**
     * 
     * 
     * @param listKind
     *     The listKind
     */
    @JsonProperty("listKind")
    public void setListKind(String listKind) {
        this.listKind = listKind;
    }

    /**
     * 
     * 
     * @return
     *     The plural
     */
    @JsonProperty("plural")
    public String getPlural() {
        return plural;
    }

    /**
     * 
     * 
     * @param plural
     *     The plural
     */
    @JsonProperty("plural")
    public void setPlural(String plural) {
        this.plural = plural;
    }

    /**
     * 
     * 
     * @return
     *     The shortNames
     */
    @JsonProperty("shortNames")
    public List<String> getShortNames() {
        return shortNames;
    }

    /**
     * 
     * 
     * @param shortNames
     *     The shortNames
     */
    @JsonProperty("shortNames")
    public void setShortNames(List<String> shortNames) {
        this.shortNames = shortNames;
    }

    /**
     * 
     * 
     * @return
     *     The singular
     */
    @JsonProperty("singular")
    public String getSingular() {
        return singular;
    }

    /**
     * 
     * 
     * @param singular
     *     The singular
     */
    @JsonProperty("singular")
    public void setSingular(String singular) {
        this.singular = singular;
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
