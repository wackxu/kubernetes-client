
package io.fabric8.kubernetes.api.model.networking;

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
    "ipBlock",
    "namespaceSelector",
    "podSelector"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NetworkPolicyPeer implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("ipBlock")
    @Valid
    private IPBlock ipBlock;
    /**
     * 
     * 
     */
    @JsonProperty("namespaceSelector")
    @Valid
    private LabelSelector namespaceSelector;
    /**
     * 
     * 
     */
    @JsonProperty("podSelector")
    @Valid
    private LabelSelector podSelector;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NetworkPolicyPeer() {
    }

    /**
     * 
     * @param podSelector
     * @param ipBlock
     * @param namespaceSelector
     */
    public NetworkPolicyPeer(IPBlock ipBlock, LabelSelector namespaceSelector, LabelSelector podSelector) {
        this.ipBlock = ipBlock;
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    /**
     * 
     * 
     * @return
     *     The ipBlock
     */
    @JsonProperty("ipBlock")
    public IPBlock getIpBlock() {
        return ipBlock;
    }

    /**
     * 
     * 
     * @param ipBlock
     *     The ipBlock
     */
    @JsonProperty("ipBlock")
    public void setIpBlock(IPBlock ipBlock) {
        this.ipBlock = ipBlock;
    }

    /**
     * 
     * 
     * @return
     *     The namespaceSelector
     */
    @JsonProperty("namespaceSelector")
    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    /**
     * 
     * 
     * @param namespaceSelector
     *     The namespaceSelector
     */
    @JsonProperty("namespaceSelector")
    public void setNamespaceSelector(LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
