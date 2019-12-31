
package io.fabric8.kubernetes.api.model.batch;

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
    "concurrencyPolicy",
    "failedJobsHistoryLimit",
    "jobTemplate",
    "schedule",
    "startingDeadlineSeconds",
    "successfulJobsHistoryLimit",
    "suspend"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CronJobSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("concurrencyPolicy")
    private String concurrencyPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("failedJobsHistoryLimit")
    private Integer failedJobsHistoryLimit;
    /**
     * 
     * 
     */
    @JsonProperty("jobTemplate")
    @Valid
    private JobTemplateSpec jobTemplate;
    /**
     * 
     * 
     */
    @JsonProperty("schedule")
    private String schedule;
    /**
     * 
     * 
     */
    @JsonProperty("startingDeadlineSeconds")
    private Long startingDeadlineSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("successfulJobsHistoryLimit")
    private Integer successfulJobsHistoryLimit;
    /**
     * 
     * 
     */
    @JsonProperty("suspend")
    private Boolean suspend;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CronJobSpec() {
    }

    /**
     * 
     * @param suspend
     * @param schedule
     * @param jobTemplate
     * @param startingDeadlineSeconds
     * @param concurrencyPolicy
     * @param failedJobsHistoryLimit
     * @param successfulJobsHistoryLimit
     */
    public CronJobSpec(String concurrencyPolicy, Integer failedJobsHistoryLimit, JobTemplateSpec jobTemplate, String schedule, Long startingDeadlineSeconds, Integer successfulJobsHistoryLimit, Boolean suspend) {
        this.concurrencyPolicy = concurrencyPolicy;
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        this.jobTemplate = jobTemplate;
        this.schedule = schedule;
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        this.suspend = suspend;
    }

    /**
     * 
     * 
     * @return
     *     The concurrencyPolicy
     */
    @JsonProperty("concurrencyPolicy")
    public String getConcurrencyPolicy() {
        return concurrencyPolicy;
    }

    /**
     * 
     * 
     * @param concurrencyPolicy
     *     The concurrencyPolicy
     */
    @JsonProperty("concurrencyPolicy")
    public void setConcurrencyPolicy(String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The failedJobsHistoryLimit
     */
    @JsonProperty("failedJobsHistoryLimit")
    public Integer getFailedJobsHistoryLimit() {
        return failedJobsHistoryLimit;
    }

    /**
     * 
     * 
     * @param failedJobsHistoryLimit
     *     The failedJobsHistoryLimit
     */
    @JsonProperty("failedJobsHistoryLimit")
    public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    }

    /**
     * 
     * 
     * @return
     *     The jobTemplate
     */
    @JsonProperty("jobTemplate")
    public JobTemplateSpec getJobTemplate() {
        return jobTemplate;
    }

    /**
     * 
     * 
     * @param jobTemplate
     *     The jobTemplate
     */
    @JsonProperty("jobTemplate")
    public void setJobTemplate(JobTemplateSpec jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * 
     * 
     * @return
     *     The schedule
     */
    @JsonProperty("schedule")
    public String getSchedule() {
        return schedule;
    }

    /**
     * 
     * 
     * @param schedule
     *     The schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * 
     * 
     * @return
     *     The startingDeadlineSeconds
     */
    @JsonProperty("startingDeadlineSeconds")
    public Long getStartingDeadlineSeconds() {
        return startingDeadlineSeconds;
    }

    /**
     * 
     * 
     * @param startingDeadlineSeconds
     *     The startingDeadlineSeconds
     */
    @JsonProperty("startingDeadlineSeconds")
    public void setStartingDeadlineSeconds(Long startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The successfulJobsHistoryLimit
     */
    @JsonProperty("successfulJobsHistoryLimit")
    public Integer getSuccessfulJobsHistoryLimit() {
        return successfulJobsHistoryLimit;
    }

    /**
     * 
     * 
     * @param successfulJobsHistoryLimit
     *     The successfulJobsHistoryLimit
     */
    @JsonProperty("successfulJobsHistoryLimit")
    public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    }

    /**
     * 
     * 
     * @return
     *     The suspend
     */
    @JsonProperty("suspend")
    public Boolean getSuspend() {
        return suspend;
    }

    /**
     * 
     * 
     * @param suspend
     *     The suspend
     */
    @JsonProperty("suspend")
    public void setSuspend(Boolean suspend) {
        this.suspend = suspend;
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
