
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
    "JSONSchemas",
    "Schema"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class JSONSchemaPropsOrArray implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("JSONSchemas")
    @Valid
    private List<JSONSchemaProps> jSONSchemas = new ArrayList<JSONSchemaProps>();
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
    public JSONSchemaPropsOrArray() {
    }

    /**
     * 
     * @param schema
     * @param jSONSchemas
     */
    public JSONSchemaPropsOrArray(List<JSONSchemaProps> jSONSchemas, JSONSchemaProps schema) {
        this.jSONSchemas = jSONSchemas;
        this.schema = schema;
    }

    /**
     * 
     * 
     * @return
     *     The jSONSchemas
     */
    @JsonProperty("JSONSchemas")
    public List<JSONSchemaProps> getJSONSchemas() {
        return jSONSchemas;
    }

    /**
     * 
     * 
     * @param jSONSchemas
     *     The JSONSchemas
     */
    @JsonProperty("JSONSchemas")
    public void setJSONSchemas(List<JSONSchemaProps> jSONSchemas) {
        this.jSONSchemas = jSONSchemas;
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
