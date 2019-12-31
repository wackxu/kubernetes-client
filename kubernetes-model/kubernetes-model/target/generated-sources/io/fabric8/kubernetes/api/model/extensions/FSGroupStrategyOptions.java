
package io.fabric8.kubernetes.api.model.extensions;

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
    "ranges",
    "rule"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class FSGroupStrategyOptions implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("ranges")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<IDRange> ranges = new ArrayList<IDRange>();
    /**
     * 
     * 
     */
    @JsonProperty("rule")
    private String rule;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FSGroupStrategyOptions() {
    }

    /**
     * 
     * @param ranges
     * @param rule
     */
    public FSGroupStrategyOptions(List<IDRange> ranges, String rule) {
        this.ranges = ranges;
        this.rule = rule;
    }

    /**
     * 
     * 
     * @return
     *     The ranges
     */
    @JsonProperty("ranges")
    public List<IDRange> getRanges() {
        return ranges;
    }

    /**
     * 
     * 
     * @param ranges
     *     The ranges
     */
    @JsonProperty("ranges")
    public void setRanges(List<IDRange> ranges) {
        this.ranges = ranges;
    }

    /**
     * 
     * 
     * @return
     *     The rule
     */
    @JsonProperty("rule")
    public String getRule() {
        return rule;
    }

    /**
     * 
     * 
     * @param rule
     *     The rule
     */
    @JsonProperty("rule")
    public void setRule(String rule) {
        this.rule = rule;
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
