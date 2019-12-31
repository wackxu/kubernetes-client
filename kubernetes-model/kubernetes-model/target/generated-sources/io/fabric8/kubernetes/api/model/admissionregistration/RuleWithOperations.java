
package io.fabric8.kubernetes.api.model.admissionregistration;

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
    "apiVersions",
    "operations",
    "resources"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RuleWithOperations implements KubernetesResource
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
    @JsonProperty("apiVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> apiVersions = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("operations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> operations = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("resources")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> resources = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RuleWithOperations() {
    }

    /**
     * 
     * @param operations
     * @param apiVersions
     * @param resources
     * @param apiGroups
     */
    public RuleWithOperations(List<String> apiGroups, List<String> apiVersions, List<String> operations, List<String> resources) {
        this.apiGroups = apiGroups;
        this.apiVersions = apiVersions;
        this.operations = operations;
        this.resources = resources;
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
     *     The apiVersions
     */
    @JsonProperty("apiVersions")
    public List<String> getApiVersions() {
        return apiVersions;
    }

    /**
     * 
     * 
     * @param apiVersions
     *     The apiVersions
     */
    @JsonProperty("apiVersions")
    public void setApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
    }

    /**
     * 
     * 
     * @return
     *     The operations
     */
    @JsonProperty("operations")
    public List<String> getOperations() {
        return operations;
    }

    /**
     * 
     * 
     * @param operations
     *     The operations
     */
    @JsonProperty("operations")
    public void setOperations(List<String> operations) {
        this.operations = operations;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
