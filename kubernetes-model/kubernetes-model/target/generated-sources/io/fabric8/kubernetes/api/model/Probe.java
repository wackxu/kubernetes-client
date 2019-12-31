
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
    "failureThreshold",
    "httpGet",
    "initialDelaySeconds",
    "periodSeconds",
    "successThreshold",
    "tcpSocket",
    "timeoutSeconds"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Probe implements KubernetesResource
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
    @JsonProperty("failureThreshold")
    private Integer failureThreshold;
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
    @JsonProperty("initialDelaySeconds")
    private Integer initialDelaySeconds;
    /**
     * 
     * 
     */
    @JsonProperty("periodSeconds")
    private Integer periodSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("successThreshold")
    private Integer successThreshold;
    /**
     * 
     * 
     */
    @JsonProperty("tcpSocket")
    @Valid
    private TCPSocketAction tcpSocket;
    /**
     * 
     * 
     */
    @JsonProperty("timeoutSeconds")
    private Integer timeoutSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Probe() {
    }

    /**
     * 
     * @param failureThreshold
     * @param periodSeconds
     * @param tcpSocket
     * @param timeoutSeconds
     * @param successThreshold
     * @param initialDelaySeconds
     * @param exec
     * @param httpGet
     */
    public Probe(ExecAction exec, Integer failureThreshold, HTTPGetAction httpGet, Integer initialDelaySeconds, Integer periodSeconds, Integer successThreshold, TCPSocketAction tcpSocket, Integer timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.timeoutSeconds = timeoutSeconds;
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
     *     The failureThreshold
     */
    @JsonProperty("failureThreshold")
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * 
     * 
     * @param failureThreshold
     *     The failureThreshold
     */
    @JsonProperty("failureThreshold")
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
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
     *     The initialDelaySeconds
     */
    @JsonProperty("initialDelaySeconds")
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    /**
     * 
     * 
     * @param initialDelaySeconds
     *     The initialDelaySeconds
     */
    @JsonProperty("initialDelaySeconds")
    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    /**
     * 
     * 
     * @return
     *     The periodSeconds
     */
    @JsonProperty("periodSeconds")
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    /**
     * 
     * 
     * @param periodSeconds
     *     The periodSeconds
     */
    @JsonProperty("periodSeconds")
    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The successThreshold
     */
    @JsonProperty("successThreshold")
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    /**
     * 
     * 
     * @param successThreshold
     *     The successThreshold
     */
    @JsonProperty("successThreshold")
    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
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

    /**
     * 
     * 
     * @return
     *     The timeoutSeconds
     */
    @JsonProperty("timeoutSeconds")
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * 
     * 
     * @param timeoutSeconds
     *     The timeoutSeconds
     */
    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
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
