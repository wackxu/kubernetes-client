
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
    "name",
    "nodePort",
    "port",
    "protocol",
    "targetPort"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ServicePort implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("name")
    @Pattern(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?$")
    @Size(max = 63)
    private String name;
    /**
     * 
     * 
     */
    @JsonProperty("nodePort")
    private Integer nodePort;
    /**
     * 
     * 
     */
    @JsonProperty("port")
    private Integer port;
    /**
     * 
     * 
     */
    @JsonProperty("protocol")
    private String protocol;
    /**
     * 
     * 
     */
    @JsonProperty("targetPort")
    @Valid
    private IntOrString targetPort;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServicePort() {
    }

    /**
     * 
     * @param protocol
     * @param port
     * @param name
     * @param nodePort
     * @param targetPort
     */
    public ServicePort(String name, Integer nodePort, Integer port, String protocol, IntOrString targetPort) {
        this.name = name;
        this.nodePort = nodePort;
        this.port = port;
        this.protocol = protocol;
        this.targetPort = targetPort;
    }

    /**
     * 
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * 
     * @return
     *     The nodePort
     */
    @JsonProperty("nodePort")
    public Integer getNodePort() {
        return nodePort;
    }

    /**
     * 
     * 
     * @param nodePort
     *     The nodePort
     */
    @JsonProperty("nodePort")
    public void setNodePort(Integer nodePort) {
        this.nodePort = nodePort;
    }

    /**
     * 
     * 
     * @return
     *     The port
     */
    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    /**
     * 
     * 
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * 
     * 
     * @return
     *     The protocol
     */
    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     * 
     * 
     * @param protocol
     *     The protocol
     */
    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * 
     * 
     * @return
     *     The targetPort
     */
    @JsonProperty("targetPort")
    public IntOrString getTargetPort() {
        return targetPort;
    }

    /**
     * 
     * 
     * @param targetPort
     *     The targetPort
     */
    @JsonProperty("targetPort")
    public void setTargetPort(IntOrString targetPort) {
        this.targetPort = targetPort;
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
