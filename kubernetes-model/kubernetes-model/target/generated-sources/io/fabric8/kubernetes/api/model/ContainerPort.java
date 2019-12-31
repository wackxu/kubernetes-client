
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
    "containerPort",
    "hostIP",
    "hostPort",
    "name",
    "protocol"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ContainerPort implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("containerPort")
    private Integer containerPort;
    /**
     * 
     * 
     */
    @JsonProperty("hostIP")
    private String hostIP;
    /**
     * 
     * 
     */
    @JsonProperty("hostPort")
    private Integer hostPort;
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
    @JsonProperty("protocol")
    private String protocol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerPort() {
    }

    /**
     * 
     * @param protocol
     * @param hostIP
     * @param name
     * @param containerPort
     * @param hostPort
     */
    public ContainerPort(Integer containerPort, String hostIP, Integer hostPort, String name, String protocol) {
        this.containerPort = containerPort;
        this.hostIP = hostIP;
        this.hostPort = hostPort;
        this.name = name;
        this.protocol = protocol;
    }

    /**
     * 
     * 
     * @return
     *     The containerPort
     */
    @JsonProperty("containerPort")
    public Integer getContainerPort() {
        return containerPort;
    }

    /**
     * 
     * 
     * @param containerPort
     *     The containerPort
     */
    @JsonProperty("containerPort")
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * 
     * 
     * @return
     *     The hostIP
     */
    @JsonProperty("hostIP")
    public String getHostIP() {
        return hostIP;
    }

    /**
     * 
     * 
     * @param hostIP
     *     The hostIP
     */
    @JsonProperty("hostIP")
    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    /**
     * 
     * 
     * @return
     *     The hostPort
     */
    @JsonProperty("hostPort")
    public Integer getHostPort() {
        return hostPort;
    }

    /**
     * 
     * 
     * @param hostPort
     *     The hostPort
     */
    @JsonProperty("hostPort")
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
