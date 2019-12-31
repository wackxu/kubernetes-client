
package io.fabric8.openshift.api.model;

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
import io.fabric8.kubernetes.api.model.ObjectReference;
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
    "cancelled",
    "completionTimestamp",
    "config",
    "duration",
    "logSnippet",
    "message",
    "output",
    "outputDockerImageReference",
    "phase",
    "reason",
    "stages",
    "startTimestamp"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("cancelled")
    private Boolean cancelled;
    /**
     * 
     * 
     */
    @JsonProperty("completionTimestamp")
    @Valid
    private String completionTimestamp;
    /**
     * 
     * 
     */
    @JsonProperty("config")
    @Valid
    private ObjectReference config;
    /**
     * 
     * 
     */
    @JsonProperty("duration")
    private Long duration;
    /**
     * 
     * 
     */
    @JsonProperty("logSnippet")
    private java.lang.String logSnippet;
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
    @JsonProperty("output")
    @Valid
    private BuildStatusOutput output;
    /**
     * 
     * 
     */
    @JsonProperty("outputDockerImageReference")
    private java.lang.String outputDockerImageReference;
    /**
     * 
     * 
     */
    @JsonProperty("phase")
    private java.lang.String phase;
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
    @JsonProperty("stages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<StageInfo> stages = new ArrayList<StageInfo>();
    /**
     * 
     * 
     */
    @JsonProperty("startTimestamp")
    @Valid
    private String startTimestamp;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildStatus() {
    }

    /**
     * 
     * @param duration
     * @param output
     * @param phase
     * @param reason
     * @param completionTimestamp
     * @param stages
     * @param cancelled
     * @param message
     * @param config
     * @param logSnippet
     * @param outputDockerImageReference
     * @param startTimestamp
     */
    public BuildStatus(Boolean cancelled, String completionTimestamp, ObjectReference config, Long duration, java.lang.String logSnippet, java.lang.String message, BuildStatusOutput output, java.lang.String outputDockerImageReference, java.lang.String phase, java.lang.String reason, List<StageInfo> stages, String startTimestamp) {
        this.cancelled = cancelled;
        this.completionTimestamp = completionTimestamp;
        this.config = config;
        this.duration = duration;
        this.logSnippet = logSnippet;
        this.message = message;
        this.output = output;
        this.outputDockerImageReference = outputDockerImageReference;
        this.phase = phase;
        this.reason = reason;
        this.stages = stages;
        this.startTimestamp = startTimestamp;
    }

    /**
     * 
     * 
     * @return
     *     The cancelled
     */
    @JsonProperty("cancelled")
    public Boolean getCancelled() {
        return cancelled;
    }

    /**
     * 
     * 
     * @param cancelled
     *     The cancelled
     */
    @JsonProperty("cancelled")
    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * 
     * 
     * @return
     *     The completionTimestamp
     */
    @JsonProperty("completionTimestamp")
    public String getCompletionTimestamp() {
        return completionTimestamp;
    }

    /**
     * 
     * 
     * @param completionTimestamp
     *     The completionTimestamp
     */
    @JsonProperty("completionTimestamp")
    public void setCompletionTimestamp(String completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    /**
     * 
     * 
     * @return
     *     The config
     */
    @JsonProperty("config")
    public ObjectReference getConfig() {
        return config;
    }

    /**
     * 
     * 
     * @param config
     *     The config
     */
    @JsonProperty("config")
    public void setConfig(ObjectReference config) {
        this.config = config;
    }

    /**
     * 
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    /**
     * 
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * 
     * 
     * @return
     *     The logSnippet
     */
    @JsonProperty("logSnippet")
    public java.lang.String getLogSnippet() {
        return logSnippet;
    }

    /**
     * 
     * 
     * @param logSnippet
     *     The logSnippet
     */
    @JsonProperty("logSnippet")
    public void setLogSnippet(java.lang.String logSnippet) {
        this.logSnippet = logSnippet;
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
     *     The output
     */
    @JsonProperty("output")
    public BuildStatusOutput getOutput() {
        return output;
    }

    /**
     * 
     * 
     * @param output
     *     The output
     */
    @JsonProperty("output")
    public void setOutput(BuildStatusOutput output) {
        this.output = output;
    }

    /**
     * 
     * 
     * @return
     *     The outputDockerImageReference
     */
    @JsonProperty("outputDockerImageReference")
    public java.lang.String getOutputDockerImageReference() {
        return outputDockerImageReference;
    }

    /**
     * 
     * 
     * @param outputDockerImageReference
     *     The outputDockerImageReference
     */
    @JsonProperty("outputDockerImageReference")
    public void setOutputDockerImageReference(java.lang.String outputDockerImageReference) {
        this.outputDockerImageReference = outputDockerImageReference;
    }

    /**
     * 
     * 
     * @return
     *     The phase
     */
    @JsonProperty("phase")
    public java.lang.String getPhase() {
        return phase;
    }

    /**
     * 
     * 
     * @param phase
     *     The phase
     */
    @JsonProperty("phase")
    public void setPhase(java.lang.String phase) {
        this.phase = phase;
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
     *     The stages
     */
    @JsonProperty("stages")
    public List<StageInfo> getStages() {
        return stages;
    }

    /**
     * 
     * 
     * @param stages
     *     The stages
     */
    @JsonProperty("stages")
    public void setStages(List<StageInfo> stages) {
        this.stages = stages;
    }

    /**
     * 
     * 
     * @return
     *     The startTimestamp
     */
    @JsonProperty("startTimestamp")
    public String getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * 
     * 
     * @param startTimestamp
     *     The startTimestamp
     */
    @JsonProperty("startTimestamp")
    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
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
