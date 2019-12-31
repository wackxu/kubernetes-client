
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
    "acceptedNames",
    "conditions",
    "storedVersions"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceDefinitionStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("acceptedNames")
    @Valid
    private CustomResourceDefinitionNames acceptedNames;
    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @Valid
    private List<CustomResourceDefinitionCondition> conditions = new ArrayList<CustomResourceDefinitionCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("storedVersions")
    @Valid
    private List<String> storedVersions = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceDefinitionStatus() {
    }

    /**
     * 
     * @param storedVersions
     * @param conditions
     * @param acceptedNames
     */
    public CustomResourceDefinitionStatus(CustomResourceDefinitionNames acceptedNames, List<CustomResourceDefinitionCondition> conditions, List<String> storedVersions) {
        this.acceptedNames = acceptedNames;
        this.conditions = conditions;
        this.storedVersions = storedVersions;
    }

    /**
     * 
     * 
     * @return
     *     The acceptedNames
     */
    @JsonProperty("acceptedNames")
    public CustomResourceDefinitionNames getAcceptedNames() {
        return acceptedNames;
    }

    /**
     * 
     * 
     * @param acceptedNames
     *     The acceptedNames
     */
    @JsonProperty("acceptedNames")
    public void setAcceptedNames(CustomResourceDefinitionNames acceptedNames) {
        this.acceptedNames = acceptedNames;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<CustomResourceDefinitionCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<CustomResourceDefinitionCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The storedVersions
     */
    @JsonProperty("storedVersions")
    public List<String> getStoredVersions() {
        return storedVersions;
    }

    /**
     * 
     * 
     * @param storedVersions
     *     The storedVersions
     */
    @JsonProperty("storedVersions")
    public void setStoredVersions(List<String> storedVersions) {
        this.storedVersions = storedVersions;
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
