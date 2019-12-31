
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
    "completionTime",
    "conditions",
    "failed",
    "startTime",
    "succeeded"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class JobStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("active")
    private Integer active;
    /**
     * 
     * 
     */
    @JsonProperty("completionTime")
    @Valid
    private String completionTime;
    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<JobCondition> conditions = new ArrayList<JobCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("failed")
    private Integer failed;
    /**
     * 
     * 
     */
    @JsonProperty("startTime")
    @Valid
    private String startTime;
    /**
     * 
     * 
     */
    @JsonProperty("succeeded")
    private Integer succeeded;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobStatus() {
    }

    /**
     * 
     * @param completionTime
     * @param active
     * @param startTime
     * @param failed
     * @param conditions
     * @param succeeded
     */
    public JobStatus(Integer active, String completionTime, List<JobCondition> conditions, Integer failed, String startTime, Integer succeeded) {
        this.active = active;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.startTime = startTime;
        this.succeeded = succeeded;
    }

    /**
     * 
     * 
     * @return
     *     The active
     */
    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    /**
     * 
     * 
     * @param active
     *     The active
     */
    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * 
     * 
     * @return
     *     The completionTime
     */
    @JsonProperty("completionTime")
    public String getCompletionTime() {
        return completionTime;
    }

    /**
     * 
     * 
     * @param completionTime
     *     The completionTime
     */
    @JsonProperty("completionTime")
    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<JobCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<JobCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The failed
     */
    @JsonProperty("failed")
    public Integer getFailed() {
        return failed;
    }

    /**
     * 
     * 
     * @param failed
     *     The failed
     */
    @JsonProperty("failed")
    public void setFailed(Integer failed) {
        this.failed = failed;
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

    /**
     * 
     * 
     * @return
     *     The succeeded
     */
    @JsonProperty("succeeded")
    public Integer getSucceeded() {
        return succeeded;
    }

    /**
     * 
     * 
     * @param succeeded
     *     The succeeded
     */
    @JsonProperty("succeeded")
    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
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
