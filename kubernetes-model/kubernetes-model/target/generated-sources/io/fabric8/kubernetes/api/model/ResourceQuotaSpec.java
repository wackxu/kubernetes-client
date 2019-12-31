
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
    "hard",
    "scopeSelector",
    "scopes"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ResourceQuotaSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("hard")
    @Valid
    private Map<String, Quantity> hard;
    /**
     * 
     * 
     */
    @JsonProperty("scopeSelector")
    @Valid
    private ScopeSelector scopeSelector;
    /**
     * 
     * 
     */
    @JsonProperty("scopes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> scopes = new ArrayList<java.lang.String>();
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceQuotaSpec() {
    }

    /**
     * 
     * @param scopeSelector
     * @param hard
     * @param scopes
     */
    public ResourceQuotaSpec(Map<String, Quantity> hard, ScopeSelector scopeSelector, List<java.lang.String> scopes) {
        this.hard = hard;
        this.scopeSelector = scopeSelector;
        this.scopes = scopes;
    }

    /**
     * 
     * 
     * @return
     *     The hard
     */
    @JsonProperty("hard")
    public Map<String, Quantity> getHard() {
        return hard;
    }

    /**
     * 
     * 
     * @param hard
     *     The hard
     */
    @JsonProperty("hard")
    public void setHard(Map<String, Quantity> hard) {
        this.hard = hard;
    }

    /**
     * 
     * 
     * @return
     *     The scopeSelector
     */
    @JsonProperty("scopeSelector")
    public ScopeSelector getScopeSelector() {
        return scopeSelector;
    }

    /**
     * 
     * 
     * @param scopeSelector
     *     The scopeSelector
     */
    @JsonProperty("scopeSelector")
    public void setScopeSelector(ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
    }

    /**
     * 
     * 
     * @return
     *     The scopes
     */
    @JsonProperty("scopes")
    public List<java.lang.String> getScopes() {
        return scopes;
    }

    /**
     * 
     * 
     * @param scopes
     *     The scopes
     */
    @JsonProperty("scopes")
    public void setScopes(List<java.lang.String> scopes) {
        this.scopes = scopes;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
