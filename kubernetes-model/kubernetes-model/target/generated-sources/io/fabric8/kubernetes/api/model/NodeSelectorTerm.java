
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
    "matchFields"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NodeSelectorTerm implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("matchExpressions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NodeSelectorRequirement> matchExpressions = new ArrayList<NodeSelectorRequirement>();
    /**
     * 
     * 
     */
    @JsonProperty("matchFields")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NodeSelectorRequirement> matchFields = new ArrayList<NodeSelectorRequirement>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeSelectorTerm() {
    }

    /**
     * 
     * @param matchExpressions
     * @param matchFields
     */
    public NodeSelectorTerm(List<NodeSelectorRequirement> matchExpressions, List<NodeSelectorRequirement> matchFields) {
        this.matchExpressions = matchExpressions;
        this.matchFields = matchFields;
    }

    /**
     * 
     * 
     * @return
     *     The matchExpressions
     */
    @JsonProperty("matchExpressions")
    public List<NodeSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    /**
     * 
     * 
     * @param matchExpressions
     *     The matchExpressions
     */
    @JsonProperty("matchExpressions")
    public void setMatchExpressions(List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * 
     * 
     * @return
     *     The matchFields
     */
    @JsonProperty("matchFields")
    public List<NodeSelectorRequirement> getMatchFields() {
        return matchFields;
    }

    /**
     * 
     * 
     * @param matchFields
     *     The matchFields
     */
    @JsonProperty("matchFields")
    public void setMatchFields(List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
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
