
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
    "namespaces",
    "serviceaccounts"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ServiceAccountRestriction implements KubernetesResource
{

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
    @JsonProperty("serviceaccounts")
    @Valid
    private List<ServiceAccountReference> serviceaccounts = new ArrayList<ServiceAccountReference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceAccountRestriction() {
    }

    /**
     * 
     * @param serviceaccounts
     * @param namespaces
     */
    public ServiceAccountRestriction(List<String> namespaces, List<ServiceAccountReference> serviceaccounts) {
        this.namespaces = namespaces;
        this.serviceaccounts = serviceaccounts;
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
     *     The serviceaccounts
     */
    @JsonProperty("serviceaccounts")
    public List<ServiceAccountReference> getServiceaccounts() {
        return serviceaccounts;
    }

    /**
     * 
     * 
     * @param serviceaccounts
     *     The serviceaccounts
     */
    @JsonProperty("serviceaccounts")
    public void setServiceaccounts(List<ServiceAccountReference> serviceaccounts) {
        this.serviceaccounts = serviceaccounts;
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
