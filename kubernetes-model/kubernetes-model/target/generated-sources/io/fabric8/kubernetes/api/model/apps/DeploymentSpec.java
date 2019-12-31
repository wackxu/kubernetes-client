
package io.fabric8.kubernetes.api.model.apps;

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
    "minReadySeconds",
    "paused",
    "progressDeadlineSeconds",
    "replicas",
    "revisionHistoryLimit",
    "selector",
    "strategy",
    "template"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DeploymentSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("minReadySeconds")
    private Integer minReadySeconds;
    /**
     * 
     * 
     */
    @JsonProperty("paused")
    private Boolean paused;
    /**
     * 
     * 
     */
    @JsonProperty("progressDeadlineSeconds")
    private Integer progressDeadlineSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("replicas")
    private Integer replicas;
    /**
     * 
     * 
     */
    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;
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
    @JsonProperty("strategy")
    @Valid
    private DeploymentStrategy strategy;
    /**
     * 
     * 
     */
    @JsonProperty("template")
    @Valid
    private PodTemplateSpec template;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeploymentSpec() {
    }

    /**
     * 
     * @param template
     * @param paused
     * @param replicas
     * @param revisionHistoryLimit
     * @param selector
     * @param minReadySeconds
     * @param strategy
     * @param progressDeadlineSeconds
     */
    public DeploymentSpec(Integer minReadySeconds, Boolean paused, Integer progressDeadlineSeconds, Integer replicas, Integer revisionHistoryLimit, LabelSelector selector, DeploymentStrategy strategy, PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.strategy = strategy;
        this.template = template;
    }

    /**
     * 
     * 
     * @return
     *     The minReadySeconds
     */
    @JsonProperty("minReadySeconds")
    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    /**
     * 
     * 
     * @param minReadySeconds
     *     The minReadySeconds
     */
    @JsonProperty("minReadySeconds")
    public void setMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    /**
     * 
     * 
     * @return
     *     The paused
     */
    @JsonProperty("paused")
    public Boolean getPaused() {
        return paused;
    }

    /**
     * 
     * 
     * @param paused
     *     The paused
     */
    @JsonProperty("paused")
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    /**
     * 
     * 
     * @return
     *     The progressDeadlineSeconds
     */
    @JsonProperty("progressDeadlineSeconds")
    public Integer getProgressDeadlineSeconds() {
        return progressDeadlineSeconds;
    }

    /**
     * 
     * 
     * @param progressDeadlineSeconds
     *     The progressDeadlineSeconds
     */
    @JsonProperty("progressDeadlineSeconds")
    public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
        this.progressDeadlineSeconds = progressDeadlineSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The replicas
     */
    @JsonProperty("replicas")
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * 
     * 
     * @param replicas
     *     The replicas
     */
    @JsonProperty("replicas")
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * 
     * 
     * @return
     *     The revisionHistoryLimit
     */
    @JsonProperty("revisionHistoryLimit")
    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    /**
     * 
     * 
     * @param revisionHistoryLimit
     *     The revisionHistoryLimit
     */
    @JsonProperty("revisionHistoryLimit")
    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
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
     *     The strategy
     */
    @JsonProperty("strategy")
    public DeploymentStrategy getStrategy() {
        return strategy;
    }

    /**
     * 
     * 
     * @param strategy
     *     The strategy
     */
    @JsonProperty("strategy")
    public void setStrategy(DeploymentStrategy strategy) {
        this.strategy = strategy;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
