
package io.fabric8.kubernetes.api.model.extensions;

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
import io.fabric8.kubernetes.api.model.SELinuxOptions;
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
    "rule",
    "seLinuxOptions"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SELinuxStrategyOptions implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("rule")
    private String rule;
    /**
     * 
     * 
     */
    @JsonProperty("seLinuxOptions")
    @Valid
    private SELinuxOptions seLinuxOptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SELinuxStrategyOptions() {
    }

    /**
     * 
     * @param seLinuxOptions
     * @param rule
     */
    public SELinuxStrategyOptions(String rule, SELinuxOptions seLinuxOptions) {
        this.rule = rule;
        this.seLinuxOptions = seLinuxOptions;
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

    /**
     * 
     * 
     * @return
     *     The seLinuxOptions
     */
    @JsonProperty("seLinuxOptions")
    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    /**
     * 
     * 
     * @param seLinuxOptions
     *     The seLinuxOptions
     */
    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
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
