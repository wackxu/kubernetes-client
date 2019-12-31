
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
    "preferredDuringSchedulingIgnoredDuringExecution",
    "requiredDuringSchedulingIgnoredDuringExecution"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NodeAffinity implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredSchedulingTerm>();
    /**
     * 
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @Valid
    private NodeSelector requiredDuringSchedulingIgnoredDuringExecution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeAffinity() {
    }

    /**
     * 
     * @param requiredDuringSchedulingIgnoredDuringExecution
     * @param preferredDuringSchedulingIgnoredDuringExecution
     */
    public NodeAffinity(List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution, NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @return
     *     The preferredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @param preferredDuringSchedulingIgnoredDuringExecution
     *     The preferredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public void setPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @return
     *     The requiredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     * 
     * @param requiredDuringSchedulingIgnoredDuringExecution
     *     The requiredDuringSchedulingIgnoredDuringExecution
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public void setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
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
