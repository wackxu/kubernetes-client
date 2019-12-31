
package io.fabric8.kubernetes.api.model.apiextensions;

import java.util.HashMap;
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
    "Allows",
    "Schema"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class JSONSchemaPropsOrBool implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("Allows")
    private Boolean allows;
    /**
     * 
     * 
     */
    @JsonProperty("Schema")
    @Valid
    private JSONSchemaProps schema;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JSONSchemaPropsOrBool() {
    }

    /**
     * 
     * @param allows
     * @param schema
     */
    public JSONSchemaPropsOrBool(Boolean allows, JSONSchemaProps schema) {
        this.allows = allows;
        this.schema = schema;
    }

    /**
     * 
     * 
     * @return
     *     The allows
     */
    @JsonProperty("Allows")
    public Boolean getAllows() {
        return allows;
    }

    /**
     * 
     * 
     * @param allows
     *     The Allows
     */
    @JsonProperty("Allows")
    public void setAllows(Boolean allows) {
        this.allows = allows;
    }

    /**
     * 
     * 
     * @return
     *     The schema
     */
    @JsonProperty("Schema")
    public JSONSchemaProps getSchema() {
        return schema;
    }

    /**
     * 
     * 
     * @param schema
     *     The Schema
     */
    @JsonProperty("Schema")
    public void setSchema(JSONSchemaProps schema) {
        this.schema = schema;
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
