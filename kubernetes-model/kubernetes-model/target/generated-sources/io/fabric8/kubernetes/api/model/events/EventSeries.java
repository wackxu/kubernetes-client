
package io.fabric8.kubernetes.api.model.events;

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
import io.fabric8.kubernetes.api.model.MicroTime;
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
    "count",
    "lastObservedTime",
    "state"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class EventSeries implements KubernetesResource
{

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
    @JsonProperty("lastObservedTime")
    @Valid
    private MicroTime lastObservedTime;
    /**
     * 
     * 
     */
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EventSeries() {
    }

    /**
     * 
     * @param count
     * @param lastObservedTime
     * @param state
     */
    public EventSeries(Integer count, MicroTime lastObservedTime, String state) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
        this.state = state;
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
     *     The lastObservedTime
     */
    @JsonProperty("lastObservedTime")
    public MicroTime getLastObservedTime() {
        return lastObservedTime;
    }

    /**
     * 
     * 
     * @param lastObservedTime
     *     The lastObservedTime
     */
    @JsonProperty("lastObservedTime")
    public void setLastObservedTime(MicroTime lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    /**
     * 
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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
