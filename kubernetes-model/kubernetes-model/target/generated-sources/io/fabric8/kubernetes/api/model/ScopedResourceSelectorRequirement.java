
package io.fabric8.kubernetes.api.model;

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
    "operator",
    "scopeName",
    "values"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ScopedResourceSelectorRequirement implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("operator")
    private String operator;
    /**
     * 
     * 
     */
    @JsonProperty("scopeName")
    private String scopeName;
    /**
     * 
     * 
     */
    @JsonProperty("values")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> values = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ScopedResourceSelectorRequirement() {
    }

    /**
     * 
     * @param scopeName
     * @param values
     * @param operator
     */
    public ScopedResourceSelectorRequirement(String operator, String scopeName, List<String> values) {
        this.operator = operator;
        this.scopeName = scopeName;
        this.values = values;
    }

    /**
     * 
     * 
     * @return
     *     The operator
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * 
     * 
     * @param operator
     *     The operator
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 
     * 
     * @return
     *     The scopeName
     */
    @JsonProperty("scopeName")
    public String getScopeName() {
        return scopeName;
    }

    /**
     * 
     * 
     * @param scopeName
     *     The scopeName
     */
    @JsonProperty("scopeName")
    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    /**
     * 
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<String> getValues() {
        return values;
    }

    /**
     * 
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
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
