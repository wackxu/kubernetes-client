
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
    "addresses",
    "notReadyAddresses",
    "ports"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class EndpointSubset implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("addresses")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EndpointAddress> addresses = new ArrayList<EndpointAddress>();
    /**
     * 
     * 
     */
    @JsonProperty("notReadyAddresses")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EndpointAddress> notReadyAddresses = new ArrayList<EndpointAddress>();
    /**
     * 
     * 
     */
    @JsonProperty("ports")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EndpointPort> ports = new ArrayList<EndpointPort>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EndpointSubset() {
    }

    /**
     * 
     * @param notReadyAddresses
     * @param addresses
     * @param ports
     */
    public EndpointSubset(List<EndpointAddress> addresses, List<EndpointAddress> notReadyAddresses, List<EndpointPort> ports) {
        this.addresses = addresses;
        this.notReadyAddresses = notReadyAddresses;
        this.ports = ports;
    }

    /**
     * 
     * 
     * @return
     *     The addresses
     */
    @JsonProperty("addresses")
    public List<EndpointAddress> getAddresses() {
        return addresses;
    }

    /**
     * 
     * 
     * @param addresses
     *     The addresses
     */
    @JsonProperty("addresses")
    public void setAddresses(List<EndpointAddress> addresses) {
        this.addresses = addresses;
    }

    /**
     * 
     * 
     * @return
     *     The notReadyAddresses
     */
    @JsonProperty("notReadyAddresses")
    public List<EndpointAddress> getNotReadyAddresses() {
        return notReadyAddresses;
    }

    /**
     * 
     * 
     * @param notReadyAddresses
     *     The notReadyAddresses
     */
    @JsonProperty("notReadyAddresses")
    public void setNotReadyAddresses(List<EndpointAddress> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
    }

    /**
     * 
     * 
     * @return
     *     The ports
     */
    @JsonProperty("ports")
    public List<EndpointPort> getPorts() {
        return ports;
    }

    /**
     * 
     * 
     * @param ports
     *     The ports
     */
    @JsonProperty("ports")
    public void setPorts(List<EndpointPort> ports) {
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
