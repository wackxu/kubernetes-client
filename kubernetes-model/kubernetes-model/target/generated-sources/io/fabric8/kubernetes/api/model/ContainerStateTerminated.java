
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
    "containerID",
    "exitCode",
    "finishedAt",
    "message",
    "reason",
    "signal",
    "startedAt"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ContainerStateTerminated implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("containerID")
    private java.lang.String containerID;
    /**
     * 
     * 
     */
    @JsonProperty("exitCode")
    private Integer exitCode;
    /**
     * 
     * 
     */
    @JsonProperty("finishedAt")
    @Valid
    private String finishedAt;
    /**
     * 
     * 
     */
    @JsonProperty("message")
    private java.lang.String message;
    /**
     * 
     * 
     */
    @JsonProperty("reason")
    private java.lang.String reason;
    /**
     * 
     * 
     */
    @JsonProperty("signal")
    private Integer signal;
    /**
     * 
     * 
     */
    @JsonProperty("startedAt")
    @Valid
    private String startedAt;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerStateTerminated() {
    }

    /**
     * 
     * @param reason
     * @param exitCode
     * @param startedAt
     * @param containerID
     * @param message
     * @param signal
     * @param finishedAt
     */
    public ContainerStateTerminated(java.lang.String containerID, Integer exitCode, String finishedAt, java.lang.String message, java.lang.String reason, Integer signal, String startedAt) {
        this.containerID = containerID;
        this.exitCode = exitCode;
        this.finishedAt = finishedAt;
        this.message = message;
        this.reason = reason;
        this.signal = signal;
        this.startedAt = startedAt;
    }

    /**
     * 
     * 
     * @return
     *     The containerID
     */
    @JsonProperty("containerID")
    public java.lang.String getContainerID() {
        return containerID;
    }

    /**
     * 
     * 
     * @param containerID
     *     The containerID
     */
    @JsonProperty("containerID")
    public void setContainerID(java.lang.String containerID) {
        this.containerID = containerID;
    }

    /**
     * 
     * 
     * @return
     *     The exitCode
     */
    @JsonProperty("exitCode")
    public Integer getExitCode() {
        return exitCode;
    }

    /**
     * 
     * 
     * @param exitCode
     *     The exitCode
     */
    @JsonProperty("exitCode")
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * 
     * 
     * @return
     *     The finishedAt
     */
    @JsonProperty("finishedAt")
    public String getFinishedAt() {
        return finishedAt;
    }

    /**
     * 
     * 
     * @param finishedAt
     *     The finishedAt
     */
    @JsonProperty("finishedAt")
    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * 
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * 
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    /**
     * 
     * 
     * @return
     *     The reason
     */
    @JsonProperty("reason")
    public java.lang.String getReason() {
        return reason;
    }

    /**
     * 
     * 
     * @param reason
     *     The reason
     */
    @JsonProperty("reason")
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    /**
     * 
     * 
     * @return
     *     The signal
     */
    @JsonProperty("signal")
    public Integer getSignal() {
        return signal;
    }

    /**
     * 
     * 
     * @param signal
     *     The signal
     */
    @JsonProperty("signal")
    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    /**
     * 
     * 
     * @return
     *     The startedAt
     */
    @JsonProperty("startedAt")
    public String getStartedAt() {
        return startedAt;
    }

    /**
     * 
     * 
     * @param startedAt
     *     The startedAt
     */
    @JsonProperty("startedAt")
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
