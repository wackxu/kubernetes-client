
package io.fabric8.kubernetes.api.model;

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
    "hostname",
    "ip",
    "nodeName",
    "targetRef"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class EndpointAddress implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("hostname")
    private String hostname;
    /**
     * 
     * 
     */
    @JsonProperty("ip")
    private String ip;
    /**
     * 
     * 
     */
    @JsonProperty("nodeName")
    private String nodeName;
    /**
     * 
     * 
     */
    @JsonProperty("targetRef")
    @Valid
    private ObjectReference targetRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EndpointAddress() {
    }

    /**
     * 
     * @param nodeName
     * @param targetRef
     * @param hostname
     * @param ip
     */
    public EndpointAddress(String hostname, String ip, String nodeName, ObjectReference targetRef) {
        this.hostname = hostname;
        this.ip = ip;
        this.nodeName = nodeName;
        this.targetRef = targetRef;
    }

    /**
     * 
     * 
     * @return
     *     The hostname
     */
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * 
     * 
     * @param hostname
     *     The hostname
     */
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * 
     * 
     * @return
     *     The ip
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * 
     * 
     * @param ip
     *     The ip
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 
     * 
     * @return
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public String getNodeName() {
        return nodeName;
    }

    /**
     * 
     * 
     * @param nodeName
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * 
     * 
     * @return
     *     The targetRef
     */
    @JsonProperty("targetRef")
    public ObjectReference getTargetRef() {
        return targetRef;
    }

    /**
     * 
     * 
     * @param targetRef
     *     The targetRef
     */
    @JsonProperty("targetRef")
    public void setTargetRef(ObjectReference targetRef) {
        this.targetRef = targetRef;
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
