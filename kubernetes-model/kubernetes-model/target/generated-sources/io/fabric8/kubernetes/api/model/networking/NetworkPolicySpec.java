
package io.fabric8.kubernetes.api.model.networking;

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
    "egress",
    "ingress",
    "podSelector",
    "policyTypes"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NetworkPolicySpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("egress")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NetworkPolicyEgressRule> egress = new ArrayList<NetworkPolicyEgressRule>();
    /**
     * 
     * 
     */
    @JsonProperty("ingress")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NetworkPolicyIngressRule> ingress = new ArrayList<NetworkPolicyIngressRule>();
    /**
     * 
     * 
     */
    @JsonProperty("podSelector")
    @Valid
    private LabelSelector podSelector;
    /**
     * 
     * 
     */
    @JsonProperty("policyTypes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> policyTypes = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NetworkPolicySpec() {
    }

    /**
     * 
     * @param ingress
     * @param podSelector
     * @param policyTypes
     * @param egress
     */
    public NetworkPolicySpec(List<NetworkPolicyEgressRule> egress, List<NetworkPolicyIngressRule> ingress, LabelSelector podSelector, List<String> policyTypes) {
        this.egress = egress;
        this.ingress = ingress;
        this.podSelector = podSelector;
        this.policyTypes = policyTypes;
    }

    /**
     * 
     * 
     * @return
     *     The egress
     */
    @JsonProperty("egress")
    public List<NetworkPolicyEgressRule> getEgress() {
        return egress;
    }

    /**
     * 
     * 
     * @param egress
     *     The egress
     */
    @JsonProperty("egress")
    public void setEgress(List<NetworkPolicyEgressRule> egress) {
        this.egress = egress;
    }

    /**
     * 
     * 
     * @return
     *     The ingress
     */
    @JsonProperty("ingress")
    public List<NetworkPolicyIngressRule> getIngress() {
        return ingress;
    }

    /**
     * 
     * 
     * @param ingress
     *     The ingress
     */
    @JsonProperty("ingress")
    public void setIngress(List<NetworkPolicyIngressRule> ingress) {
        this.ingress = ingress;
    }

    /**
     * 
     * 
     * @return
     *     The podSelector
     */
    @JsonProperty("podSelector")
    public LabelSelector getPodSelector() {
        return podSelector;
    }

    /**
     * 
     * 
     * @param podSelector
     *     The podSelector
     */
    @JsonProperty("podSelector")
    public void setPodSelector(LabelSelector podSelector) {
        this.podSelector = podSelector;
    }

    /**
     * 
     * 
     * @return
     *     The policyTypes
     */
    @JsonProperty("policyTypes")
    public List<String> getPolicyTypes() {
        return policyTypes;
    }

    /**
     * 
     * 
     * @param policyTypes
     *     The policyTypes
     */
    @JsonProperty("policyTypes")
    public void setPolicyTypes(List<String> policyTypes) {
        this.policyTypes = policyTypes;
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
