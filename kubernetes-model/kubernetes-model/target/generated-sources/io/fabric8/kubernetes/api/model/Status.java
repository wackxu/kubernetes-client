
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
    "code",
    "details",
    "message",
    "reason",
    "status"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Status implements KubernetesResource
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private String apiVersion = "v1";
    /**
     * 
     * 
     */
    @JsonProperty("code")
    private Integer code;
    /**
     * 
     * 
     */
    @JsonProperty("details")
    @Valid
    private StatusDetails details;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "Status";
    /**
     * 
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    @Valid
    private ListMeta metadata;
    /**
     * 
     * 
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * 
     * 
     */
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param reason
     * @param metadata
     * @param apiVersion
     * @param code
     * @param kind
     * @param details
     * @param message
     * @param status
     */
    public Status(String apiVersion, Integer code, StatusDetails details, String kind, String message, ListMeta metadata, String reason, String status) {
        this.apiVersion = apiVersion;
        this.code = code;
        this.details = details;
        this.kind = kind;
        this.message = message;
        this.metadata = metadata;
        this.reason = reason;
        this.status = status;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     * 
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 
     * 
     * @return
     *     The details
     */
    @JsonProperty("details")
    public StatusDetails getDetails() {
        return details;
    }

    /**
     * 
     * 
     * @param details
     *     The details
     */
    @JsonProperty("details")
    public void setDetails(StatusDetails details) {
        this.details = details;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public ListMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * 
     * @return
     *     The reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * 
     * 
     * @param reason
     *     The reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
