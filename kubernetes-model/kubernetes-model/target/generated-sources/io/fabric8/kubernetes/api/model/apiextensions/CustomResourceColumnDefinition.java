
package io.fabric8.kubernetes.api.model.apiextensions;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
    "JSONPath",
    "description",
    "format",
    "name",
    "priority",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceColumnDefinition implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("JSONPath")
    private String jSONPath;
    /**
     * 
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     * 
     */
    @JsonProperty("format")
    private String format;
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
    @JsonProperty("priority")
    private Integer priority;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceColumnDefinition() {
    }

    /**
     * 
     * @param format
     * @param name
     * @param description
     * @param jSONPath
     * @param priority
     * @param type
     */
    public CustomResourceColumnDefinition(String jSONPath, String description, String format, String name, Integer priority, String type) {
        this.jSONPath = jSONPath;
        this.description = description;
        this.format = format;
        this.name = name;
        this.priority = priority;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The jSONPath
     */
    @JsonProperty("JSONPath")
    public String getJSONPath() {
        return jSONPath;
    }

    /**
     * 
     * 
     * @param jSONPath
     *     The JSONPath
     */
    @JsonProperty("JSONPath")
    public void setJSONPath(String jSONPath) {
        this.jSONPath = jSONPath;
    }

    /**
     * 
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * 
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
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
     *     The priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * 
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
