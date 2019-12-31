
package io.fabric8.kubernetes.api.model.events;

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
import io.fabric8.kubernetes.api.model.EventSource;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.MicroTime;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
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
    "action",
    "deprecatedCount",
    "deprecatedFirstTimestamp",
    "deprecatedLastTimestamp",
    "deprecatedSource",
    "eventTime",
    "note",
    "reason",
    "regarding",
    "related",
    "reportingController",
    "reportingInstance",
    "series",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
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
    private java.lang.String apiVersion = "events.k8s.io/v1beta1";
    /**
     * 
     * 
     */
    @JsonProperty("deprecatedCount")
    private Integer deprecatedCount;
    /**
     * 
     * 
     */
    @JsonProperty("deprecatedFirstTimestamp")
    @Valid
    private String deprecatedFirstTimestamp;
    /**
     * 
     * 
     */
    @JsonProperty("deprecatedLastTimestamp")
    @Valid
    private String deprecatedLastTimestamp;
    /**
     * 
     * 
     */
    @JsonProperty("deprecatedSource")
    @Valid
    private EventSource deprecatedSource;
    /**
     * 
     * 
     */
    @JsonProperty("eventTime")
    @Valid
    private MicroTime eventTime;
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
    @JsonProperty("metadata")
    @Valid
    @CheckObjectMeta(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*$", max = 253)
    private ObjectMeta metadata;
    /**
     * 
     * 
     */
    @JsonProperty("note")
    private java.lang.String note;
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
    @JsonProperty("regarding")
    @Valid
    private ObjectReference regarding;
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
    @JsonProperty("reportingController")
    private java.lang.String reportingController;
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
     * @param note
     * @param reason
     * @param metadata
     * @param reportingInstance
     * @param deprecatedCount
     * @param kind
     * @param deprecatedSource
     * @param type
     * @param deprecatedLastTimestamp
     * @param regarding
     * @param deprecatedFirstTimestamp
     * @param apiVersion
     * @param reportingController
     * @param related
     * @param series
     * @param eventTime
     * @param action
     */
    public Event(java.lang.String action, java.lang.String apiVersion, Integer deprecatedCount, String deprecatedFirstTimestamp, String deprecatedLastTimestamp, EventSource deprecatedSource, MicroTime eventTime, java.lang.String kind, ObjectMeta metadata, java.lang.String note, java.lang.String reason, ObjectReference regarding, ObjectReference related, java.lang.String reportingController, java.lang.String reportingInstance, EventSeries series, java.lang.String type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.deprecatedCount = deprecatedCount;
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        this.deprecatedSource = deprecatedSource;
        this.eventTime = eventTime;
        this.kind = kind;
        this.metadata = metadata;
        this.note = note;
        this.reason = reason;
        this.regarding = regarding;
        this.related = related;
        this.reportingController = reportingController;
        this.reportingInstance = reportingInstance;
        this.series = series;
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
     *     The deprecatedCount
     */
    @JsonProperty("deprecatedCount")
    public Integer getDeprecatedCount() {
        return deprecatedCount;
    }

    /**
     * 
     * 
     * @param deprecatedCount
     *     The deprecatedCount
     */
    @JsonProperty("deprecatedCount")
    public void setDeprecatedCount(Integer deprecatedCount) {
        this.deprecatedCount = deprecatedCount;
    }

    /**
     * 
     * 
     * @return
     *     The deprecatedFirstTimestamp
     */
    @JsonProperty("deprecatedFirstTimestamp")
    public String getDeprecatedFirstTimestamp() {
        return deprecatedFirstTimestamp;
    }

    /**
     * 
     * 
     * @param deprecatedFirstTimestamp
     *     The deprecatedFirstTimestamp
     */
    @JsonProperty("deprecatedFirstTimestamp")
    public void setDeprecatedFirstTimestamp(String deprecatedFirstTimestamp) {
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    }

    /**
     * 
     * 
     * @return
     *     The deprecatedLastTimestamp
     */
    @JsonProperty("deprecatedLastTimestamp")
    public String getDeprecatedLastTimestamp() {
        return deprecatedLastTimestamp;
    }

    /**
     * 
     * 
     * @param deprecatedLastTimestamp
     *     The deprecatedLastTimestamp
     */
    @JsonProperty("deprecatedLastTimestamp")
    public void setDeprecatedLastTimestamp(String deprecatedLastTimestamp) {
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    }

    /**
     * 
     * 
     * @return
     *     The deprecatedSource
     */
    @JsonProperty("deprecatedSource")
    public EventSource getDeprecatedSource() {
        return deprecatedSource;
    }

    /**
     * 
     * 
     * @param deprecatedSource
     *     The deprecatedSource
     */
    @JsonProperty("deprecatedSource")
    public void setDeprecatedSource(EventSource deprecatedSource) {
        this.deprecatedSource = deprecatedSource;
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
     *     The note
     */
    @JsonProperty("note")
    public java.lang.String getNote() {
        return note;
    }

    /**
     * 
     * 
     * @param note
     *     The note
     */
    @JsonProperty("note")
    public void setNote(java.lang.String note) {
        this.note = note;
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
     *     The regarding
     */
    @JsonProperty("regarding")
    public ObjectReference getRegarding() {
        return regarding;
    }

    /**
     * 
     * 
     * @param regarding
     *     The regarding
     */
    @JsonProperty("regarding")
    public void setRegarding(ObjectReference regarding) {
        this.regarding = regarding;
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
     *     The reportingController
     */
    @JsonProperty("reportingController")
    public java.lang.String getReportingController() {
        return reportingController;
    }

    /**
     * 
     * 
     * @param reportingController
     *     The reportingController
     */
    @JsonProperty("reportingController")
    public void setReportingController(java.lang.String reportingController) {
        this.reportingController = reportingController;
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
