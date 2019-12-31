
package io.fabric8.openshift.api.model;

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
    "lastProbeTime",
    "lastTransitionTime",
    "message",
    "reason",
    "status",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SignatureCondition implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("lastProbeTime")
    @Valid
    private String lastProbeTime;
    /**
     * 
     * 
     */
    @JsonProperty("lastTransitionTime")
    @Valid
    private String lastTransitionTime;
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
    @JsonProperty("status")
    private java.lang.String status;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private java.lang.String type;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SignatureCondition() {
    }

    /**
     * 
     * @param reason
     * @param lastTransitionTime
     * @param message
     * @param type
     * @param lastProbeTime
     * @param status
     */
    public SignatureCondition(String lastProbeTime, String lastTransitionTime, java.lang.String message, java.lang.String reason, java.lang.String status, java.lang.String type) {
        this.lastProbeTime = lastProbeTime;
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The lastProbeTime
     */
    @JsonProperty("lastProbeTime")
    public String getLastProbeTime() {
        return lastProbeTime;
    }

    /**
     * 
     * 
     * @param lastProbeTime
     *     The lastProbeTime
     */
    @JsonProperty("lastProbeTime")
    public void setLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    /**
     * 
     * 
     * @return
     *     The lastTransitionTime
     */
    @JsonProperty("lastTransitionTime")
    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    /**
     * 
     * 
     * @param lastTransitionTime
     *     The lastTransitionTime
     */
    @JsonProperty("lastTransitionTime")
    public void setLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
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
     *     The status
     */
    @JsonProperty("status")
    public java.lang.String getStatus() {
        return status;
    }

    /**
     * 
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
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
