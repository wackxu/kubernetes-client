
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
    "openAPIV3Schema"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceValidation implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("openAPIV3Schema")
    @Valid
    private JSONSchemaProps openAPIV3Schema;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceValidation() {
    }

    /**
     * 
     * @param openAPIV3Schema
     */
    public CustomResourceValidation(JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    /**
     * 
     * 
     * @return
     *     The openAPIV3Schema
     */
    @JsonProperty("openAPIV3Schema")
    public JSONSchemaProps getOpenAPIV3Schema() {
        return openAPIV3Schema;
    }

    /**
     * 
     * 
     * @param openAPIV3Schema
     *     The openAPIV3Schema
     */
    @JsonProperty("openAPIV3Schema")
    public void setOpenAPIV3Schema(JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
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
