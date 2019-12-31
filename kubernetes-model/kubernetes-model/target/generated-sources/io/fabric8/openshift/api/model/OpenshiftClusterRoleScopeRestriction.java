
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
    "allowEscalation",
    "namespaces",
    "roleNames"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class OpenshiftClusterRoleScopeRestriction implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("allowEscalation")
    private Boolean allowEscalation;
    /**
     * 
     * 
     */
    @JsonProperty("namespaces")
    @Valid
    private List<String> namespaces = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("roleNames")
    @Valid
    private List<String> roleNames = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OpenshiftClusterRoleScopeRestriction() {
    }

    /**
     * 
     * @param allowEscalation
     * @param roleNames
     * @param namespaces
     */
    public OpenshiftClusterRoleScopeRestriction(Boolean allowEscalation, List<String> namespaces, List<String> roleNames) {
        this.allowEscalation = allowEscalation;
        this.namespaces = namespaces;
        this.roleNames = roleNames;
    }

    /**
     * 
     * 
     * @return
     *     The allowEscalation
     */
    @JsonProperty("allowEscalation")
    public Boolean getAllowEscalation() {
        return allowEscalation;
    }

    /**
     * 
     * 
     * @param allowEscalation
     *     The allowEscalation
     */
    @JsonProperty("allowEscalation")
    public void setAllowEscalation(Boolean allowEscalation) {
        this.allowEscalation = allowEscalation;
    }

    /**
     * 
     * 
     * @return
     *     The namespaces
     */
    @JsonProperty("namespaces")
    public List<String> getNamespaces() {
        return namespaces;
    }

    /**
     * 
     * 
     * @param namespaces
     *     The namespaces
     */
    @JsonProperty("namespaces")
    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    /**
     * 
     * 
     * @return
     *     The roleNames
     */
    @JsonProperty("roleNames")
    public List<String> getRoleNames() {
        return roleNames;
    }

    /**
     * 
     * 
     * @param roleNames
     *     The roleNames
     */
    @JsonProperty("roleNames")
    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
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
