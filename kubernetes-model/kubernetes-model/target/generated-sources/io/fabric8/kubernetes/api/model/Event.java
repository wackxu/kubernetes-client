
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
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import io.sundr.transform.annotations.VelocityTransformation;
import io.sundr.transform.annotations.VelocityTransformations;
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
    "action",
    "count",
    "eventTime",
    "firstTimestamp",
    "involvedObject",
    "lastTimestamp",
    "message",
    "reason",
    "related",
    "reportingComponent",
    "reportingInstance",
    "series",
    "source",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
@ApiVersion("v1")
@ApiGroup("")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "kubernetes.properties", gather = true)
})
public class Event implements HasMetadata
{

    /**
     * 
     * 
     */
    @JsonProperty("action")
    private java.lang.String action;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private java.lang.String apiVersion = "v1";
    /**
     * 
     * 
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * 
     * 
     */
    @JsonProperty("eventTime")
    @Valid
    private MicroTime eventTime;
    /**
     * 
     * 
     */
    @JsonProperty("firstTimestamp")
    @Valid
    private String firstTimestamp;
    /**
     * 
     * 
     */
    @JsonProperty("involvedObject")
    @Valid
    private ObjectReference involvedObject;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private java.lang.String kind = "Event";
    /**
     * 
     * 
     */
    @JsonProperty("lastTimestamp")
    @Valid
    private String lastTimestamp;
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
    @JsonProperty("metadata")
    @Valid
    @CheckObjectMeta(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*$", max = 253)
    private ObjectMeta metadata;
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
    @JsonProperty("related")
    @Valid
    private ObjectReference related;
    /**
     * 
     * 
     */
    @JsonProperty("reportingComponent")
    private java.lang.String reportingComponent;
    /**
     * 
     * 
     */
    @JsonProperty("reportingInstance")
    private java.lang.String reportingInstance;
    /**
     * 
     * 
     */
    @JsonProperty("series")
    @Valid
    private EventSeries series;
    /**
     * 
     * 
     */
    @JsonProperty("source")
    @Valid
    private EventSource source;
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
    public Event() {
    }

    /**
     * 
     * @param reason
     * @param metadata
     * @param involvedObject
     * @param reportingInstance
     * @param kind
     * @param count
     * @param source
     * @param message
     * @param type
     * @param reportingComponent
     * @param firstTimestamp
     * @param apiVersion
     * @param related
     * @param lastTimestamp
     * @param series
     * @param eventTime
     * @param action
     */
    public Event(java.lang.String action, java.lang.String apiVersion, Integer count, MicroTime eventTime, String firstTimestamp, ObjectReference involvedObject, java.lang.String kind, String lastTimestamp, java.lang.String message, ObjectMeta metadata, java.lang.String reason, ObjectReference related, java.lang.String reportingComponent, java.lang.String reportingInstance, EventSeries series, EventSource source, java.lang.String type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.count = count;
        this.eventTime = eventTime;
        this.firstTimestamp = firstTimestamp;
        this.involvedObject = involvedObject;
        this.kind = kind;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.metadata = metadata;
        this.reason = reason;
        this.related = related;
        this.reportingComponent = reportingComponent;
        this.reportingInstance = reportingInstance;
        this.series = series;
        this.source = source;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public java.lang.String getAction() {
        return action;
    }

    /**
     * 
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public java.lang.String getApiVersion() {
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
    public void setApiVersion(java.lang.String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * 
     * @return
     *     The eventTime
     */
    @JsonProperty("eventTime")
    public MicroTime getEventTime() {
        return eventTime;
    }

    /**
     * 
     * 
     * @param eventTime
     *     The eventTime
     */
    @JsonProperty("eventTime")
    public void setEventTime(MicroTime eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * 
     * 
     * @return
     *     The firstTimestamp
     */
    @JsonProperty("firstTimestamp")
    public String getFirstTimestamp() {
        return firstTimestamp;
    }

    /**
     * 
     * 
     * @param firstTimestamp
     *     The firstTimestamp
     */
    @JsonProperty("firstTimestamp")
    public void setFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    /**
     * 
     * 
     * @return
     *     The involvedObject
     */
    @JsonProperty("involvedObject")
    public ObjectReference getInvolvedObject() {
        return involvedObject;
    }

    /**
     * 
     * 
     * @param involvedObject
     *     The involvedObject
     */
    @JsonProperty("involvedObject")
    public void setInvolvedObject(ObjectReference involvedObject) {
        this.involvedObject = involvedObject;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public java.lang.String getKind() {
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
    public void setKind(java.lang.String kind) {
        this.kind = kind;
    }

    /**
     * 
     * 
     * @return
     *     The lastTimestamp
     */
    @JsonProperty("lastTimestamp")
    public String getLastTimestamp() {
        return lastTimestamp;
    }

    /**
     * 
     * 
     * @param lastTimestamp
     *     The lastTimestamp
     */
    @JsonProperty("lastTimestamp")
    public void setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
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
     *     The metadata
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
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
     *     The related
     */
    @JsonProperty("related")
    public ObjectReference getRelated() {
        return related;
    }

    /**
     * 
     * 
     * @param related
     *     The related
     */
    @JsonProperty("related")
    public void setRelated(ObjectReference related) {
        this.related = related;
    }

    /**
     * 
     * 
     * @return
     *     The reportingComponent
     */
    @JsonProperty("reportingComponent")
    public java.lang.String getReportingComponent() {
        return reportingComponent;
    }

    /**
     * 
     * 
     * @param reportingComponent
     *     The reportingComponent
     */
    @JsonProperty("reportingComponent")
    public void setReportingComponent(java.lang.String reportingComponent) {
        this.reportingComponent = reportingComponent;
    }

    /**
     * 
     * 
     * @return
     *     The reportingInstance
     */
    @JsonProperty("reportingInstance")
    public java.lang.String getReportingInstance() {
        return reportingInstance;
    }

    /**
     * 
     * 
     * @param reportingInstance
     *     The reportingInstance
     */
    @JsonProperty("reportingInstance")
    public void setReportingInstance(java.lang.String reportingInstance) {
        this.reportingInstance = reportingInstance;
    }

    /**
     * 
     * 
     * @return
     *     The series
     */
    @JsonProperty("series")
    public EventSeries getSeries() {
        return series;
    }

    /**
     * 
     * 
     * @param series
     *     The series
     */
    @JsonProperty("series")
    public void setSeries(EventSeries series) {
        this.series = series;
    }

    /**
     * 
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public EventSource getSource() {
        return source;
    }

    /**
     * 
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(EventSource source) {
        this.source = source;
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
