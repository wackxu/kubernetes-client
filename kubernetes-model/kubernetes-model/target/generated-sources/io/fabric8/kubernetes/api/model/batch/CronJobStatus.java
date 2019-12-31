
package io.fabric8.kubernetes.api.model.batch;

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
    "active",
    "lastScheduleTime"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CronJobStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("active")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ObjectReference> active = new ArrayList<ObjectReference>();
    /**
     * 
     * 
     */
    @JsonProperty("lastScheduleTime")
    @Valid
    private String lastScheduleTime;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CronJobStatus() {
    }

    /**
     * 
     * @param lastScheduleTime
     * @param active
     */
    public CronJobStatus(List<ObjectReference> active, String lastScheduleTime) {
        this.active = active;
        this.lastScheduleTime = lastScheduleTime;
    }

    /**
     * 
     * 
     * @return
     *     The active
     */
    @JsonProperty("active")
    public List<ObjectReference> getActive() {
        return active;
    }

    /**
     * 
     * 
     * @param active
     *     The active
     */
    @JsonProperty("active")
    public void setActive(List<ObjectReference> active) {
        this.active = active;
    }

    /**
     * 
     * 
     * @return
     *     The lastScheduleTime
     */
    @JsonProperty("lastScheduleTime")
    public String getLastScheduleTime() {
        return lastScheduleTime;
    }

    /**
     * 
     * 
     * @param lastScheduleTime
     *     The lastScheduleTime
     */
    @JsonProperty("lastScheduleTime")
    public void setLastScheduleTime(String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
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
