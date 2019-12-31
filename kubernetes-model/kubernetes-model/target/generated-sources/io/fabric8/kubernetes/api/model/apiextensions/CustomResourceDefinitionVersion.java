
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
    "additionalPrinterColumns",
    "name",
    "schema",
    "served",
    "storage",
    "subresources"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceDefinitionVersion implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("additionalPrinterColumns")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<CustomResourceColumnDefinition> additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinition>();
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
    @JsonProperty("schema")
    @Valid
    private CustomResourceValidation schema;
    /**
     * 
     * 
     */
    @JsonProperty("served")
    private Boolean served;
    /**
     * 
     * 
     */
    @JsonProperty("storage")
    private Boolean storage;
    /**
     * 
     * 
     */
    @JsonProperty("subresources")
    @Valid
    private CustomResourceSubresources subresources;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceDefinitionVersion() {
    }

    /**
     * 
     * @param schema
     * @param served
     * @param name
     * @param subresources
     * @param storage
     * @param additionalPrinterColumns
     */
    public CustomResourceDefinitionVersion(List<CustomResourceColumnDefinition> additionalPrinterColumns, String name, CustomResourceValidation schema, Boolean served, Boolean storage, CustomResourceSubresources subresources) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.name = name;
        this.schema = schema;
        this.served = served;
        this.storage = storage;
        this.subresources = subresources;
    }

    /**
     * 
     * 
     * @return
     *     The additionalPrinterColumns
     */
    @JsonProperty("additionalPrinterColumns")
    public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return additionalPrinterColumns;
    }

    /**
     * 
     * 
     * @param additionalPrinterColumns
     *     The additionalPrinterColumns
     */
    @JsonProperty("additionalPrinterColumns")
    public void setAdditionalPrinterColumns(List<CustomResourceColumnDefinition> additionalPrinterColumns) {
        this.additionalPrinterColumns = additionalPrinterColumns;
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
     *     The schema
     */
    @JsonProperty("schema")
    public CustomResourceValidation getSchema() {
        return schema;
    }

    /**
     * 
     * 
     * @param schema
     *     The schema
     */
    @JsonProperty("schema")
    public void setSchema(CustomResourceValidation schema) {
        this.schema = schema;
    }

    /**
     * 
     * 
     * @return
     *     The served
     */
    @JsonProperty("served")
    public Boolean getServed() {
        return served;
    }

    /**
     * 
     * 
     * @param served
     *     The served
     */
    @JsonProperty("served")
    public void setServed(Boolean served) {
        this.served = served;
    }

    /**
     * 
     * 
     * @return
     *     The storage
     */
    @JsonProperty("storage")
    public Boolean getStorage() {
        return storage;
    }

    /**
     * 
     * 
     * @param storage
     *     The storage
     */
    @JsonProperty("storage")
    public void setStorage(Boolean storage) {
        this.storage = storage;
    }

    /**
     * 
     * 
     * @return
     *     The subresources
     */
    @JsonProperty("subresources")
    public CustomResourceSubresources getSubresources() {
        return subresources;
    }

    /**
     * 
     * 
     * @param subresources
     *     The subresources
     */
    @JsonProperty("subresources")
    public void setSubresources(CustomResourceSubresources subresources) {
        this.subresources = subresources;
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
