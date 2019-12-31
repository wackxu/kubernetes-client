
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
    "exec",
    "httpGet",
    "tcpSocket"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Handler implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("exec")
    @Valid
    private ExecAction exec;
    /**
     * 
     * 
     */
    @JsonProperty("httpGet")
    @Valid
    private HTTPGetAction httpGet;
    /**
     * 
     * 
     */
    @JsonProperty("tcpSocket")
    @Valid
    private TCPSocketAction tcpSocket;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Handler() {
    }

    /**
     * 
     * @param tcpSocket
     * @param exec
     * @param httpGet
     */
    public Handler(ExecAction exec, HTTPGetAction httpGet, TCPSocketAction tcpSocket) {
        this.exec = exec;
        this.httpGet = httpGet;
        this.tcpSocket = tcpSocket;
    }

    /**
     * 
     * 
     * @return
     *     The exec
     */
    @JsonProperty("exec")
    public ExecAction getExec() {
        return exec;
    }

    /**
     * 
     * 
     * @param exec
     *     The exec
     */
    @JsonProperty("exec")
    public void setExec(ExecAction exec) {
        this.exec = exec;
    }

    /**
     * 
     * 
     * @return
     *     The httpGet
     */
    @JsonProperty("httpGet")
    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    /**
     * 
     * 
     * @param httpGet
     *     The httpGet
     */
    @JsonProperty("httpGet")
    public void setHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * 
     * 
     * @return
     *     The tcpSocket
     */
    @JsonProperty("tcpSocket")
    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    /**
     * 
     * 
     * @param tcpSocket
     *     The tcpSocket
     */
    @JsonProperty("tcpSocket")
    public void setTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
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
