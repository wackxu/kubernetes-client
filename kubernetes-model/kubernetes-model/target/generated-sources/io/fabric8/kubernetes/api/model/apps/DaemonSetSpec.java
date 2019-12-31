
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
    "revisionHistoryLimit",
    "selector",
    "template",
    "updateStrategy"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DaemonSetSpec implements KubernetesResource
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
    @JsonProperty("template")
    @Valid
    private PodTemplateSpec template;
    /**
     * 
     * 
     */
    @JsonProperty("updateStrategy")
    @Valid
    private DaemonSetUpdateStrategy updateStrategy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DaemonSetSpec() {
    }

    /**
     * 
     * @param template
     * @param updateStrategy
     * @param revisionHistoryLimit
     * @param selector
     * @param minReadySeconds
     */
    public DaemonSetSpec(Integer minReadySeconds, Integer revisionHistoryLimit, LabelSelector selector, PodTemplateSpec template, DaemonSetUpdateStrategy updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.template = template;
        this.updateStrategy = updateStrategy;
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
     *     The updateStrategy
     */
    @JsonProperty("updateStrategy")
    public DaemonSetUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    /**
     * 
     * 
     * @param updateStrategy
     *     The updateStrategy
     */
    @JsonProperty("updateStrategy")
    public void setUpdateStrategy(DaemonSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
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
