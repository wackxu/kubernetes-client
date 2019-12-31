
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
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
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
    "activeDeadlineSeconds",
    "backoffLimit",
    "completions",
    "manualSelector",
    "parallelism",
    "selector",
    "template",
    "ttlSecondsAfterFinished"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class JobSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("activeDeadlineSeconds")
    private Long activeDeadlineSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("backoffLimit")
    private Integer backoffLimit;
    /**
     * 
     * 
     */
    @JsonProperty("completions")
    private Integer completions;
    /**
     * 
     * 
     */
    @JsonProperty("manualSelector")
    private Boolean manualSelector;
    /**
     * 
     * 
     */
    @JsonProperty("parallelism")
    private Integer parallelism;
    /**
     * 
     * 
     */
    @JsonProperty("selector")
    @Valid
    private LabelSelector selector;
    /**
     * 
     * 
     */
    @JsonProperty("template")
    @Valid
    private PodTemplateSpec template;
    /**
     * 
     * 
     */
    @JsonProperty("ttlSecondsAfterFinished")
    private Integer ttlSecondsAfterFinished;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobSpec() {
    }

    /**
     * 
     * @param template
     * @param backoffLimit
     * @param manualSelector
     * @param parallelism
     * @param completions
     * @param selector
     * @param activeDeadlineSeconds
     * @param ttlSecondsAfterFinished
     */
    public JobSpec(Long activeDeadlineSeconds, Integer backoffLimit, Integer completions, Boolean manualSelector, Integer parallelism, LabelSelector selector, PodTemplateSpec template, Integer ttlSecondsAfterFinished) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.backoffLimit = backoffLimit;
        this.completions = completions;
        this.manualSelector = manualSelector;
        this.parallelism = parallelism;
        this.selector = selector;
        this.template = template;
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    /**
     * 
     * 
     * @return
     *     The activeDeadlineSeconds
     */
    @JsonProperty("activeDeadlineSeconds")
    public Long getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    /**
     * 
     * 
     * @param activeDeadlineSeconds
     *     The activeDeadlineSeconds
     */
    @JsonProperty("activeDeadlineSeconds")
    public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The backoffLimit
     */
    @JsonProperty("backoffLimit")
    public Integer getBackoffLimit() {
        return backoffLimit;
    }

    /**
     * 
     * 
     * @param backoffLimit
     *     The backoffLimit
     */
    @JsonProperty("backoffLimit")
    public void setBackoffLimit(Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
    }

    /**
     * 
     * 
     * @return
     *     The completions
     */
    @JsonProperty("completions")
    public Integer getCompletions() {
        return completions;
    }

    /**
     * 
     * 
     * @param completions
     *     The completions
     */
    @JsonProperty("completions")
    public void setCompletions(Integer completions) {
        this.completions = completions;
    }

    /**
     * 
     * 
     * @return
     *     The manualSelector
     */
    @JsonProperty("manualSelector")
    public Boolean getManualSelector() {
        return manualSelector;
    }

    /**
     * 
     * 
     * @param manualSelector
     *     The manualSelector
     */
    @JsonProperty("manualSelector")
    public void setManualSelector(Boolean manualSelector) {
        this.manualSelector = manualSelector;
    }

    /**
     * 
     * 
     * @return
     *     The parallelism
     */
    @JsonProperty("parallelism")
    public Integer getParallelism() {
        return parallelism;
    }

    /**
     * 
     * 
     * @param parallelism
     *     The parallelism
     */
    @JsonProperty("parallelism")
    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    /**
     * 
     * 
     * @return
     *     The selector
     */
    @JsonProperty("selector")
    public LabelSelector getSelector() {
        return selector;
    }

    /**
     * 
     * 
     * @param selector
     *     The selector
     */
    @JsonProperty("selector")
    public void setSelector(LabelSelector selector) {
        this.selector = selector;
    }

    /**
     * 
     * 
     * @return
     *     The template
     */
    @JsonProperty("template")
    public PodTemplateSpec getTemplate() {
        return template;
    }

    /**
     * 
     * 
     * @param template
     *     The template
     */
    @JsonProperty("template")
    public void setTemplate(PodTemplateSpec template) {
        this.template = template;
    }

    /**
     * 
     * 
     * @return
     *     The ttlSecondsAfterFinished
     */
    @JsonProperty("ttlSecondsAfterFinished")
    public Integer getTtlSecondsAfterFinished() {
        return ttlSecondsAfterFinished;
    }

    /**
     * 
     * 
     * @param ttlSecondsAfterFinished
     *     The ttlSecondsAfterFinished
     */
    @JsonProperty("ttlSecondsAfterFinished")
    public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
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
