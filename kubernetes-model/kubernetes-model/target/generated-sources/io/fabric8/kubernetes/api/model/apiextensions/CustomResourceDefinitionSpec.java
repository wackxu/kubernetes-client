
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
    "conversion",
    "group",
    "names",
    "scope",
    "subresources",
    "validation",
    "version",
    "versions"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceDefinitionSpec implements KubernetesResource
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
    @JsonProperty("conversion")
    @Valid
    private CustomResourceConversion conversion;
    /**
     * 
     * 
     */
    @JsonProperty("group")
    private String group;
    /**
     * 
     * 
     */
    @JsonProperty("names")
    @Valid
    private CustomResourceDefinitionNames names;
    /**
     * 
     * 
     */
    @JsonProperty("scope")
    private String scope;
    /**
     * 
     * 
     */
    @JsonProperty("subresources")
    @Valid
    private CustomResourceSubresources subresources;
    /**
     * 
     * 
     */
    @JsonProperty("validation")
    @Valid
    private CustomResourceValidation validation;
    /**
     * 
     * 
     */
    @JsonProperty("version")
    private String version;
    /**
     * 
     * 
     */
    @JsonProperty("versions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<CustomResourceDefinitionVersion> versions = new ArrayList<CustomResourceDefinitionVersion>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceDefinitionSpec() {
    }

    /**
     * 
     * @param names
     * @param versions
     * @param scope
     * @param subresources
     * @param additionalPrinterColumns
     * @param version
     * @param validation
     * @param conversion
     * @param group
     */
    public CustomResourceDefinitionSpec(List<CustomResourceColumnDefinition> additionalPrinterColumns, CustomResourceConversion conversion, String group, CustomResourceDefinitionNames names, String scope, CustomResourceSubresources subresources, CustomResourceValidation validation, String version, List<CustomResourceDefinitionVersion> versions) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.conversion = conversion;
        this.group = group;
        this.names = names;
        this.scope = scope;
        this.subresources = subresources;
        this.validation = validation;
        this.version = version;
        this.versions = versions;
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
     *     The conversion
     */
    @JsonProperty("conversion")
    public CustomResourceConversion getConversion() {
        return conversion;
    }

    /**
     * 
     * 
     * @param conversion
     *     The conversion
     */
    @JsonProperty("conversion")
    public void setConversion(CustomResourceConversion conversion) {
        this.conversion = conversion;
    }

    /**
     * 
     * 
     * @return
     *     The group
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * 
     * 
     * @param group
     *     The group
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * 
     * 
     * @return
     *     The names
     */
    @JsonProperty("names")
    public CustomResourceDefinitionNames getNames() {
        return names;
    }

    /**
     * 
     * 
     * @param names
     *     The names
     */
    @JsonProperty("names")
    public void setNames(CustomResourceDefinitionNames names) {
        this.names = names;
    }

    /**
     * 
     * 
     * @return
     *     The scope
     */
    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    /**
     * 
     * 
     * @param scope
     *     The scope
     */
    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
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

    /**
     * 
     * 
     * @return
     *     The validation
     */
    @JsonProperty("validation")
    public CustomResourceValidation getValidation() {
        return validation;
    }

    /**
     * 
     * 
     * @param validation
     *     The validation
     */
    @JsonProperty("validation")
    public void setValidation(CustomResourceValidation validation) {
        this.validation = validation;
    }

    /**
     * 
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * 
     * @return
     *     The versions
     */
    @JsonProperty("versions")
    public List<CustomResourceDefinitionVersion> getVersions() {
        return versions;
    }

    /**
     * 
     * 
     * @param versions
     *     The versions
     */
    @JsonProperty("versions")
    public void setVersions(List<CustomResourceDefinitionVersion> versions) {
        this.versions = versions;
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
