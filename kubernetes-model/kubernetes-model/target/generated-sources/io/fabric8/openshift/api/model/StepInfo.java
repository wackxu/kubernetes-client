
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
    "durationMilliseconds",
    "name",
    "startTime"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class StepInfo implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("durationMilliseconds")
    private Long durationMilliseconds;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    private java.lang.String name;
    /**
     * 
     * 
     */
    @JsonProperty("startTime")
    @Valid
    private String startTime;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StepInfo() {
    }

    /**
     * 
     * @param durationMilliseconds
     * @param name
     * @param startTime
     */
    public StepInfo(Long durationMilliseconds, java.lang.String name, String startTime) {
        this.durationMilliseconds = durationMilliseconds;
        this.name = name;
        this.startTime = startTime;
    }

    /**
     * 
     * 
     * @return
     *     The durationMilliseconds
     */
    @JsonProperty("durationMilliseconds")
    public Long getDurationMilliseconds() {
        return durationMilliseconds;
    }

    /**
     * 
     * 
     * @param durationMilliseconds
     *     The durationMilliseconds
     */
    @JsonProperty("durationMilliseconds")
    public void setDurationMilliseconds(Long durationMilliseconds) {
        this.durationMilliseconds = durationMilliseconds;
    }

    /**
     * 
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * 
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 
     * 
     * @return
     *     The startTime
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * 
     * 
     * @param startTime
     *     The startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
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
