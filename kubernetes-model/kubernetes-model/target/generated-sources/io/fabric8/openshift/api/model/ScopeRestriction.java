
package io.fabric8.openshift.api.model;

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
    "clusterRole",
    "literals"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ScopeRestriction implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("clusterRole")
    @Valid
    private OpenshiftClusterRoleScopeRestriction clusterRole;
    /**
     * 
     * 
     */
    @JsonProperty("literals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> literals = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ScopeRestriction() {
    }

    /**
     * 
     * @param clusterRole
     * @param literals
     */
    public ScopeRestriction(OpenshiftClusterRoleScopeRestriction clusterRole, List<String> literals) {
        this.clusterRole = clusterRole;
        this.literals = literals;
    }

    /**
     * 
     * 
     * @return
     *     The clusterRole
     */
    @JsonProperty("clusterRole")
    public OpenshiftClusterRoleScopeRestriction getClusterRole() {
        return clusterRole;
    }

    /**
     * 
     * 
     * @param clusterRole
     *     The clusterRole
     */
    @JsonProperty("clusterRole")
    public void setClusterRole(OpenshiftClusterRoleScopeRestriction clusterRole) {
        this.clusterRole = clusterRole;
    }

    /**
     * 
     * 
     * @return
     *     The literals
     */
    @JsonProperty("literals")
    public List<String> getLiterals() {
        return literals;
    }

    /**
     * 
     * 
     * @param literals
     *     The literals
     */
    @JsonProperty("literals")
    public void setLiterals(List<String> literals) {
        this.literals = literals;
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
