
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
    "matchLabelExpressions"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class TopologySelectorTerm implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("matchLabelExpressions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<TopologySelectorLabelRequirement> matchLabelExpressions = new ArrayList<TopologySelectorLabelRequirement>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TopologySelectorTerm() {
    }

    /**
     * 
     * @param matchLabelExpressions
     */
    public TopologySelectorTerm(List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
    }

    /**
     * 
     * 
     * @return
     *     The matchLabelExpressions
     */
    @JsonProperty("matchLabelExpressions")
    public List<TopologySelectorLabelRequirement> getMatchLabelExpressions() {
        return matchLabelExpressions;
    }

    /**
     * 
     * 
     * @param matchLabelExpressions
     *     The matchLabelExpressions
     */
    @JsonProperty("matchLabelExpressions")
    public void setMatchLabelExpressions(List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
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
