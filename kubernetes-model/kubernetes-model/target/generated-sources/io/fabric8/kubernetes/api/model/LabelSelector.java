
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
    "matchExpressions",
    "matchLabels"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class LabelSelector implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("matchExpressions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<LabelSelectorRequirement> matchExpressions = new ArrayList<LabelSelectorRequirement>();
    /**
     * 
     * 
     */
    @JsonProperty("matchLabels")
    @Valid
    private Map<String, String> matchLabels;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LabelSelector() {
    }

    /**
     * 
     * @param matchExpressions
     * @param matchLabels
     */
    public LabelSelector(List<LabelSelectorRequirement> matchExpressions, Map<String, String> matchLabels) {
        this.matchExpressions = matchExpressions;
        this.matchLabels = matchLabels;
    }

    /**
     * 
     * 
     * @return
     *     The matchExpressions
     */
    @JsonProperty("matchExpressions")
    public List<LabelSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    /**
     * 
     * 
     * @param matchExpressions
     *     The matchExpressions
     */
    @JsonProperty("matchExpressions")
    public void setMatchExpressions(List<LabelSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * 
     * 
     * @return
     *     The matchLabels
     */
    @JsonProperty("matchLabels")
    public Map<String, String> getMatchLabels() {
        return matchLabels;
    }

    /**
     * 
     * 
     * @param matchLabels
     *     The matchLabels
     */
    @JsonProperty("matchLabels")
    public void setMatchLabels(Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
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
