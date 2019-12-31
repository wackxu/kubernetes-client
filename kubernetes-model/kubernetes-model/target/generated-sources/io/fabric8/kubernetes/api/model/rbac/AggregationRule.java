
package io.fabric8.kubernetes.api.model.rbac;

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
import io.fabric8.kubernetes.api.model.LabelSelector;
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
    "clusterRoleSelectors"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class AggregationRule implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("clusterRoleSelectors")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<LabelSelector> clusterRoleSelectors = new ArrayList<LabelSelector>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AggregationRule() {
    }

    /**
     * 
     * @param clusterRoleSelectors
     */
    public AggregationRule(List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    /**
     * 
     * 
     * @return
     *     The clusterRoleSelectors
     */
    @JsonProperty("clusterRoleSelectors")
    public List<LabelSelector> getClusterRoleSelectors() {
        return clusterRoleSelectors;
    }

    /**
     * 
     * 
     * @param clusterRoleSelectors
     *     The clusterRoleSelectors
     */
    @JsonProperty("clusterRoleSelectors")
    public void setClusterRoleSelectors(List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
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
