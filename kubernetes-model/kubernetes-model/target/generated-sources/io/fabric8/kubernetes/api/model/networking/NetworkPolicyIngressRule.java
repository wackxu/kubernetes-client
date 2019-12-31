
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
    "from",
    "ports"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NetworkPolicyIngressRule implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("from")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NetworkPolicyPeer> from = new ArrayList<NetworkPolicyPeer>();
    /**
     * 
     * 
     */
    @JsonProperty("ports")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NetworkPolicyPort> ports = new ArrayList<NetworkPolicyPort>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NetworkPolicyIngressRule() {
    }

    /**
     * 
     * @param from
     * @param ports
     */
    public NetworkPolicyIngressRule(List<NetworkPolicyPeer> from, List<NetworkPolicyPort> ports) {
        this.from = from;
        this.ports = ports;
    }

    /**
     * 
     * 
     * @return
     *     The from
     */
    @JsonProperty("from")
    public List<NetworkPolicyPeer> getFrom() {
        return from;
    }

    /**
     * 
     * 
     * @param from
     *     The from
     */
    @JsonProperty("from")
    public void setFrom(List<NetworkPolicyPeer> from) {
        this.from = from;
    }

    /**
     * 
     * 
     * @return
     *     The ports
     */
    @JsonProperty("ports")
    public List<NetworkPolicyPort> getPorts() {
        return ports;
    }

    /**
     * 
     * 
     * @param ports
     *     The ports
     */
    @JsonProperty("ports")
    public void setPorts(List<NetworkPolicyPort> ports) {
        this.ports = ports;
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
