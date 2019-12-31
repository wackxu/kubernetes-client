
package io.fabric8.kubernetes.api.model.apiextensions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
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
    "$ref",
    "$schema",
    "additionalItems",
    "additionalProperties",
    "allOf",
    "anyOf",
    "default",
    "definitions",
    "dependencies",
    "description",
    "enum",
    "example",
    "exclusiveMaximum",
    "exclusiveMinimum",
    "externalDocs",
    "format",
    "id",
    "items",
    "maxItems",
    "maxLength",
    "maxProperties",
    "maximum",
    "minItems",
    "minLength",
    "minProperties",
    "minimum",
    "multipleOf",
    "not",
    "oneOf",
    "pattern",
    "patternProperties",
    "properties",
    "required",
    "title",
    "type",
    "uniqueItems"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class JSONSchemaProps implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("$ref")
    private java.lang.String $ref;
    /**
     * 
     * 
     */
    @JsonProperty("$schema")
    private java.lang.String $schema;
    /**
     * 
     * 
     */
    @JsonProperty("additionalItems")
    @Valid
    private JSONSchemaPropsOrBool additionalItems;
    /**
     * 
     * 
     */
    @JsonProperty("additionalProperties")
    @Valid
    private JSONSchemaPropsOrBool additionalProperties;
    /**
     * 
     * 
     */
    @JsonProperty("allOf")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<JSONSchemaProps> allOf = new ArrayList<JSONSchemaProps>();
    /**
     * 
     * 
     */
    @JsonProperty("anyOf")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<JSONSchemaProps> anyOf = new ArrayList<JSONSchemaProps>();
    /**
     * 
     * 
     */
    @JsonProperty("default")
    @Valid
    private JSON _default;
    /**
     * 
     * 
     */
    @JsonProperty("definitions")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> definitions;
    /**
     * 
     * 
     */
    @JsonProperty("dependencies")
    @Valid
    private Map<String, JSONSchemaPropsOrStringArray> dependencies;
    /**
     * 
     * 
     */
    @JsonProperty("description")
    private java.lang.String description;
    /**
     * 
     * 
     */
    @JsonProperty("enum")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<JSON> _enum = new ArrayList<JSON>();
    /**
     * 
     * 
     */
    @JsonProperty("example")
    @Valid
    private JSON example;
    /**
     * 
     * 
     */
    @JsonProperty("exclusiveMaximum")
    private Boolean exclusiveMaximum;
    /**
     * 
     * 
     */
    @JsonProperty("exclusiveMinimum")
    private Boolean exclusiveMinimum;
    /**
     * 
     * 
     */
    @JsonProperty("externalDocs")
    @Valid
    private ExternalDocumentation externalDocs;
    /**
     * 
     * 
     */
    @JsonProperty("format")
    private java.lang.String format;
    /**
     * 
     * 
     */
    @JsonProperty("id")
    private java.lang.String id;
    /**
     * 
     * 
     */
    @JsonProperty("items")
    @Valid
    private JSONSchemaPropsOrArray items;
    /**
     * 
     * 
     */
    @JsonProperty("maxItems")
    private Long maxItems;
    /**
     * 
     * 
     */
    @JsonProperty("maxLength")
    private Long maxLength;
    /**
     * 
     * 
     */
    @JsonProperty("maxProperties")
    private Long maxProperties;
    /**
     * 
     * 
     */
    @JsonProperty("maximum")
    private Double maximum;
    /**
     * 
     * 
     */
    @JsonProperty("minItems")
    private Long minItems;
    /**
     * 
     * 
     */
    @JsonProperty("minLength")
    private Long minLength;
    /**
     * 
     * 
     */
    @JsonProperty("minProperties")
    private Long minProperties;
    /**
     * 
     * 
     */
    @JsonProperty("minimum")
    private Double minimum;
    /**
     * 
     * 
     */
    @JsonProperty("multipleOf")
    private Double multipleOf;
    /**
     * 
     * 
     */
    @JsonProperty("not")
    @Valid
    private JSONSchemaProps not;
    /**
     * 
     * 
     */
    @JsonProperty("oneOf")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<JSONSchemaProps> oneOf = new ArrayList<JSONSchemaProps>();
    /**
     * 
     * 
     */
    @JsonProperty("pattern")
    private java.lang.String pattern;
    /**
     * 
     * 
     */
    @JsonProperty("patternProperties")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> patternProperties;
    /**
     * 
     * 
     */
    @JsonProperty("properties")
    @Valid
    private Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> properties;
    /**
     * 
     * 
     */
    @JsonProperty("required")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> required = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("title")
    private java.lang.String title;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private java.lang.String type;
    /**
     * 
     * 
     */
    @JsonProperty("uniqueItems")
    private Boolean uniqueItems;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JSONSchemaProps() {
    }

    /**
     * 
     * @param $schema
     * @param minLength
     * @param pattern
     * @param description
     * @param _enum
     * @param title
     * @param type
     * @param required
     * @param example
     * @param exclusiveMaximum
     * @param patternProperties
     * @param allOf
     * @param not
     * @param oneOf
     * @param additionalItems
     * @param id
     * @param maxProperties
     * @param exclusiveMinimum
     * @param definitions
     * @param multipleOf
     * @param _default
     * @param maxItems
     * @param format
     * @param anyOf
     * @param dependencies
     * @param minProperties
     * @param minItems
     * @param uniqueItems
     * @param maximum
     * @param additionalProperties
     * @param externalDocs
     * @param $ref
     * @param items
     * @param minimum
     * @param maxLength
     * @param properties
     */
    public JSONSchemaProps(java.lang.String $ref, java.lang.String $schema, JSONSchemaPropsOrBool additionalItems, JSONSchemaPropsOrBool additionalProperties, List<JSONSchemaProps> allOf, List<JSONSchemaProps> anyOf, JSON _default, Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> definitions, Map<String, JSONSchemaPropsOrStringArray> dependencies, java.lang.String description, List<JSON> _enum, JSON example, Boolean exclusiveMaximum, Boolean exclusiveMinimum, ExternalDocumentation externalDocs, java.lang.String format, java.lang.String id, JSONSchemaPropsOrArray items, Long maxItems, Long maxLength, Long maxProperties, Double maximum, Long minItems, Long minLength, Long minProperties, Double minimum, Double multipleOf, JSONSchemaProps not, List<JSONSchemaProps> oneOf, java.lang.String pattern, Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> patternProperties, Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> properties, List<java.lang.String> required, java.lang.String title, java.lang.String type, Boolean uniqueItems) {
        this.$ref = $ref;
        this.$schema = $schema;
        this.additionalItems = additionalItems;
        this.additionalProperties = additionalProperties;
        this.allOf = allOf;
        this.anyOf = anyOf;
        this._default = _default;
        this.definitions = definitions;
        this.dependencies = dependencies;
        this.description = description;
        this._enum = _enum;
        this.example = example;
        this.exclusiveMaximum = exclusiveMaximum;
        this.exclusiveMinimum = exclusiveMinimum;
        this.externalDocs = externalDocs;
        this.format = format;
        this.id = id;
        this.items = items;
        this.maxItems = maxItems;
        this.maxLength = maxLength;
        this.maxProperties = maxProperties;
        this.maximum = maximum;
        this.minItems = minItems;
        this.minLength = minLength;
        this.minProperties = minProperties;
        this.minimum = minimum;
        this.multipleOf = multipleOf;
        this.not = not;
        this.oneOf = oneOf;
        this.pattern = pattern;
        this.patternProperties = patternProperties;
        this.properties = properties;
        this.required = required;
        this.title = title;
        this.type = type;
        this.uniqueItems = uniqueItems;
    }

    /**
     * 
     * 
     * @return
     *     The $ref
     */
    @JsonProperty("$ref")
    public java.lang.String get$ref() {
        return $ref;
    }

    /**
     * 
     * 
     * @param $ref
     *     The $ref
     */
    @JsonProperty("$ref")
    public void set$ref(java.lang.String $ref) {
        this.$ref = $ref;
    }

    /**
     * 
     * 
     * @return
     *     The $schema
     */
    @JsonProperty("$schema")
    public java.lang.String get$schema() {
        return $schema;
    }

    /**
     * 
     * 
     * @param $schema
     *     The $schema
     */
    @JsonProperty("$schema")
    public void set$schema(java.lang.String $schema) {
        this.$schema = $schema;
    }

    /**
     * 
     * 
     * @return
     *     The additionalItems
     */
    @JsonProperty("additionalItems")
    public JSONSchemaPropsOrBool getAdditionalItems() {
        return additionalItems;
    }

    /**
     * 
     * 
     * @param additionalItems
     *     The additionalItems
     */
    @JsonProperty("additionalItems")
    public void setAdditionalItems(JSONSchemaPropsOrBool additionalItems) {
        this.additionalItems = additionalItems;
    }

    /**
     * 
     * 
     * @return
     *     The additionalProperties
     */
    @JsonProperty("additionalProperties")
    public JSONSchemaPropsOrBool getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * 
     * 
     * @param additionalProperties
     *     The additionalProperties
     */
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(JSONSchemaPropsOrBool additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    /**
     * 
     * 
     * @return
     *     The allOf
     */
    @JsonProperty("allOf")
    public List<JSONSchemaProps> getAllOf() {
        return allOf;
    }

    /**
     * 
     * 
     * @param allOf
     *     The allOf
     */
    @JsonProperty("allOf")
    public void setAllOf(List<JSONSchemaProps> allOf) {
        this.allOf = allOf;
    }

    /**
     * 
     * 
     * @return
     *     The anyOf
     */
    @JsonProperty("anyOf")
    public List<JSONSchemaProps> getAnyOf() {
        return anyOf;
    }

    /**
     * 
     * 
     * @param anyOf
     *     The anyOf
     */
    @JsonProperty("anyOf")
    public void setAnyOf(List<JSONSchemaProps> anyOf) {
        this.anyOf = anyOf;
    }

    /**
     * 
     * 
     * @return
     *     The _default
     */
    @JsonProperty("default")
    public JSON getDefault() {
        return _default;
    }

    /**
     * 
     * 
     * @param _default
     *     The default
     */
    @JsonProperty("default")
    public void setDefault(JSON _default) {
        this._default = _default;
    }

    /**
     * 
     * 
     * @return
     *     The definitions
     */
    @JsonProperty("definitions")
    public Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> getDefinitions() {
        return definitions;
    }

    /**
     * 
     * 
     * @param definitions
     *     The definitions
     */
    @JsonProperty("definitions")
    public void setDefinitions(Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> definitions) {
        this.definitions = definitions;
    }

    /**
     * 
     * 
     * @return
     *     The dependencies
     */
    @JsonProperty("dependencies")
    public Map<String, JSONSchemaPropsOrStringArray> getDependencies() {
        return dependencies;
    }

    /**
     * 
     * 
     * @param dependencies
     *     The dependencies
     */
    @JsonProperty("dependencies")
    public void setDependencies(Map<String, JSONSchemaPropsOrStringArray> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * 
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * 
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * 
     * 
     * @return
     *     The _enum
     */
    @JsonProperty("enum")
    public List<JSON> getEnum() {
        return _enum;
    }

    /**
     * 
     * 
     * @param _enum
     *     The enum
     */
    @JsonProperty("enum")
    public void setEnum(List<JSON> _enum) {
        this._enum = _enum;
    }

    /**
     * 
     * 
     * @return
     *     The example
     */
    @JsonProperty("example")
    public JSON getExample() {
        return example;
    }

    /**
     * 
     * 
     * @param example
     *     The example
     */
    @JsonProperty("example")
    public void setExample(JSON example) {
        this.example = example;
    }

    /**
     * 
     * 
     * @return
     *     The exclusiveMaximum
     */
    @JsonProperty("exclusiveMaximum")
    public Boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    /**
     * 
     * 
     * @param exclusiveMaximum
     *     The exclusiveMaximum
     */
    @JsonProperty("exclusiveMaximum")
    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    /**
     * 
     * 
     * @return
     *     The exclusiveMinimum
     */
    @JsonProperty("exclusiveMinimum")
    public Boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    /**
     * 
     * 
     * @param exclusiveMinimum
     *     The exclusiveMinimum
     */
    @JsonProperty("exclusiveMinimum")
    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    /**
     * 
     * 
     * @return
     *     The externalDocs
     */
    @JsonProperty("externalDocs")
    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    /**
     * 
     * 
     * @param externalDocs
     *     The externalDocs
     */
    @JsonProperty("externalDocs")
    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    /**
     * 
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public java.lang.String getFormat() {
        return format;
    }

    /**
     * 
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(java.lang.String format) {
        this.format = format;
    }

    /**
     * 
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public java.lang.String getId() {
        return id;
    }

    /**
     * 
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(java.lang.String id) {
        this.id = id;
    }

    /**
     * 
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    public JSONSchemaPropsOrArray getItems() {
        return items;
    }

    /**
     * 
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    public void setItems(JSONSchemaPropsOrArray items) {
        this.items = items;
    }

    /**
     * 
     * 
     * @return
     *     The maxItems
     */
    @JsonProperty("maxItems")
    public Long getMaxItems() {
        return maxItems;
    }

    /**
     * 
     * 
     * @param maxItems
     *     The maxItems
     */
    @JsonProperty("maxItems")
    public void setMaxItems(Long maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * 
     * 
     * @return
     *     The maxLength
     */
    @JsonProperty("maxLength")
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * 
     * 
     * @param maxLength
     *     The maxLength
     */
    @JsonProperty("maxLength")
    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * 
     * 
     * @return
     *     The maxProperties
     */
    @JsonProperty("maxProperties")
    public Long getMaxProperties() {
        return maxProperties;
    }

    /**
     * 
     * 
     * @param maxProperties
     *     The maxProperties
     */
    @JsonProperty("maxProperties")
    public void setMaxProperties(Long maxProperties) {
        this.maxProperties = maxProperties;
    }

    /**
     * 
     * 
     * @return
     *     The maximum
     */
    @JsonProperty("maximum")
    public Double getMaximum() {
        return maximum;
    }

    /**
     * 
     * 
     * @param maximum
     *     The maximum
     */
    @JsonProperty("maximum")
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * 
     * 
     * @return
     *     The minItems
     */
    @JsonProperty("minItems")
    public Long getMinItems() {
        return minItems;
    }

    /**
     * 
     * 
     * @param minItems
     *     The minItems
     */
    @JsonProperty("minItems")
    public void setMinItems(Long minItems) {
        this.minItems = minItems;
    }

    /**
     * 
     * 
     * @return
     *     The minLength
     */
    @JsonProperty("minLength")
    public Long getMinLength() {
        return minLength;
    }

    /**
     * 
     * 
     * @param minLength
     *     The minLength
     */
    @JsonProperty("minLength")
    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    /**
     * 
     * 
     * @return
     *     The minProperties
     */
    @JsonProperty("minProperties")
    public Long getMinProperties() {
        return minProperties;
    }

    /**
     * 
     * 
     * @param minProperties
     *     The minProperties
     */
    @JsonProperty("minProperties")
    public void setMinProperties(Long minProperties) {
        this.minProperties = minProperties;
    }

    /**
     * 
     * 
     * @return
     *     The minimum
     */
    @JsonProperty("minimum")
    public Double getMinimum() {
        return minimum;
    }

    /**
     * 
     * 
     * @param minimum
     *     The minimum
     */
    @JsonProperty("minimum")
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * 
     * 
     * @return
     *     The multipleOf
     */
    @JsonProperty("multipleOf")
    public Double getMultipleOf() {
        return multipleOf;
    }

    /**
     * 
     * 
     * @param multipleOf
     *     The multipleOf
     */
    @JsonProperty("multipleOf")
    public void setMultipleOf(Double multipleOf) {
        this.multipleOf = multipleOf;
    }

    /**
     * 
     * 
     * @return
     *     The not
     */
    @JsonProperty("not")
    public JSONSchemaProps getNot() {
        return not;
    }

    /**
     * 
     * 
     * @param not
     *     The not
     */
    @JsonProperty("not")
    public void setNot(JSONSchemaProps not) {
        this.not = not;
    }

    /**
     * 
     * 
     * @return
     *     The oneOf
     */
    @JsonProperty("oneOf")
    public List<JSONSchemaProps> getOneOf() {
        return oneOf;
    }

    /**
     * 
     * 
     * @param oneOf
     *     The oneOf
     */
    @JsonProperty("oneOf")
    public void setOneOf(List<JSONSchemaProps> oneOf) {
        this.oneOf = oneOf;
    }

    /**
     * 
     * 
     * @return
     *     The pattern
     */
    @JsonProperty("pattern")
    public java.lang.String getPattern() {
        return pattern;
    }

    /**
     * 
     * 
     * @param pattern
     *     The pattern
     */
    @JsonProperty("pattern")
    public void setPattern(java.lang.String pattern) {
        this.pattern = pattern;
    }

    /**
     * 
     * 
     * @return
     *     The patternProperties
     */
    @JsonProperty("patternProperties")
    public Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> getPatternProperties() {
        return patternProperties;
    }

    /**
     * 
     * 
     * @param patternProperties
     *     The patternProperties
     */
    @JsonProperty("patternProperties")
    public void setPatternProperties(Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> patternProperties) {
        this.patternProperties = patternProperties;
    }

    /**
     * 
     * 
     * @return
     *     The properties
     */
    @JsonProperty("properties")
    public Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> getProperties() {
        return properties;
    }

    /**
     * 
     * 
     * @param properties
     *     The properties
     */
    @JsonProperty("properties")
    public void setProperties(Map<String, io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps> properties) {
        this.properties = properties;
    }

    /**
     * 
     * 
     * @return
     *     The required
     */
    @JsonProperty("required")
    public List<java.lang.String> getRequired() {
        return required;
    }

    /**
     * 
     * 
     * @param required
     *     The required
     */
    @JsonProperty("required")
    public void setRequired(List<java.lang.String> required) {
        this.required = required;
    }

    /**
     * 
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * 
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The uniqueItems
     */
    @JsonProperty("uniqueItems")
    public Boolean getUniqueItems() {
        return uniqueItems;
    }

    /**
     * 
     * 
     * @param uniqueItems
     *     The uniqueItems
     */
    @JsonProperty("uniqueItems")
    public void setUniqueItems(Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

}
