
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
    "apiGroups",
    "nonResourceURLs",
    "resourceNames",
    "resources",
    "verbs"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PolicyRule implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("apiGroups")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> apiGroups = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("nonResourceURLs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> nonResourceURLs = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("resourceNames")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> resourceNames = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("resources")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> resources = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("verbs")
    @Valid
    private List<String> verbs = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PolicyRule() {
    }

    /**
     * 
     * @param resourceNames
     * @param resources
     * @param verbs
     * @param apiGroups
     * @param nonResourceURLs
     */
    public PolicyRule(List<String> apiGroups, List<String> nonResourceURLs, List<String> resourceNames, List<String> resources, List<String> verbs) {
        this.apiGroups = apiGroups;
        this.nonResourceURLs = nonResourceURLs;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.verbs = verbs;
    }

    /**
     * 
     * 
     * @return
     *     The apiGroups
     */
    @JsonProperty("apiGroups")
    public List<String> getApiGroups() {
        return apiGroups;
    }

    /**
     * 
     * 
     * @param apiGroups
     *     The apiGroups
     */
    @JsonProperty("apiGroups")
    public void setApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
    }

    /**
     * 
     * 
     * @return
     *     The nonResourceURLs
     */
    @JsonProperty("nonResourceURLs")
    public List<String> getNonResourceURLs() {
        return nonResourceURLs;
    }

    /**
     * 
     * 
     * @param nonResourceURLs
     *     The nonResourceURLs
     */
    @JsonProperty("nonResourceURLs")
    public void setNonResourceURLs(List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
    }

    /**
     * 
     * 
     * @return
     *     The resourceNames
     */
    @JsonProperty("resourceNames")
    public List<String> getResourceNames() {
        return resourceNames;
    }

    /**
     * 
     * 
     * @param resourceNames
     *     The resourceNames
     */
    @JsonProperty("resourceNames")
    public void setResourceNames(List<String> resourceNames) {
        this.resourceNames = resourceNames;
    }

    /**
     * 
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public List<String> getResources() {
        return resources;
    }

    /**
     * 
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    /**
     * 
     * 
     * @return
     *     The verbs
     */
    @JsonProperty("verbs")
    public List<String> getVerbs() {
        return verbs;
    }

    /**
     * 
     * 
     * @param verbs
     *     The verbs
     */
    @JsonProperty("verbs")
    public void setVerbs(List<String> verbs) {
        this.verbs = verbs;
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
