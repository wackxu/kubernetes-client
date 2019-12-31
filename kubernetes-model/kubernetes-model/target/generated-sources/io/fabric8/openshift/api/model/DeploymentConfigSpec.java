
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
    "replicas",
    "revisionHistoryLimit",
    "selector",
    "strategy",
    "template",
    "test",
    "triggers"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DeploymentConfigSpec implements KubernetesResource
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
    private Map<String, String> selector;
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
    /**
     * 
     * 
     */
    @JsonProperty("test")
    private Boolean test;
    /**
     * 
     * 
     */
    @JsonProperty("triggers")
    @Valid
    private List<DeploymentTriggerPolicy> triggers = new ArrayList<DeploymentTriggerPolicy>();
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeploymentConfigSpec() {
    }

    /**
     * 
     * @param template
     * @param paused
     * @param test
     * @param replicas
     * @param revisionHistoryLimit
     * @param selector
     * @param minReadySeconds
     * @param strategy
     * @param triggers
     */
    public DeploymentConfigSpec(Integer minReadySeconds, Boolean paused, Integer replicas, Integer revisionHistoryLimit, Map<String, String> selector, DeploymentStrategy strategy, PodTemplateSpec template, Boolean test, List<DeploymentTriggerPolicy> triggers) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.strategy = strategy;
        this.template = template;
        this.test = test;
        this.triggers = triggers;
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
    public Map<String, String> getSelector() {
        return selector;
    }

    /**
     * 
     * 
     * @param selector
     *     The selector
     */
    @JsonProperty("selector")
    public void setSelector(Map<String, String> selector) {
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

    /**
     * 
     * 
     * @return
     *     The test
     */
    @JsonProperty("test")
    public Boolean getTest() {
        return test;
    }

    /**
     * 
     * 
     * @param test
     *     The test
     */
    @JsonProperty("test")
    public void setTest(Boolean test) {
        this.test = test;
    }

    /**
     * 
     * 
     * @return
     *     The triggers
     */
    @JsonProperty("triggers")
    public List<DeploymentTriggerPolicy> getTriggers() {
        return triggers;
    }

    /**
     * 
     * 
     * @param triggers
     *     The triggers
     */
    @JsonProperty("triggers")
    public void setTriggers(List<DeploymentTriggerPolicy> triggers) {
        this.triggers = triggers;
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
