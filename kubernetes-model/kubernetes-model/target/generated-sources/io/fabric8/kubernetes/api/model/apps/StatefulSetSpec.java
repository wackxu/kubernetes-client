
package io.fabric8.kubernetes.api.model.apps;

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
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
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
    "podManagementPolicy",
    "replicas",
    "revisionHistoryLimit",
    "selector",
    "serviceName",
    "template",
    "updateStrategy",
    "volumeClaimTemplates"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class StatefulSetSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("podManagementPolicy")
    private String podManagementPolicy;
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
    @JsonProperty("serviceName")
    private String serviceName;
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
    private StatefulSetUpdateStrategy updateStrategy;
    /**
     * 
     * 
     */
    @JsonProperty("volumeClaimTemplates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<PersistentVolumeClaim> volumeClaimTemplates = new ArrayList<PersistentVolumeClaim>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatefulSetSpec() {
    }

    /**
     * 
     * @param template
     * @param podManagementPolicy
     * @param updateStrategy
     * @param replicas
     * @param revisionHistoryLimit
     * @param selector
     * @param serviceName
     * @param volumeClaimTemplates
     */
    public StatefulSetSpec(String podManagementPolicy, Integer replicas, Integer revisionHistoryLimit, LabelSelector selector, String serviceName, PodTemplateSpec template, StatefulSetUpdateStrategy updateStrategy, List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.podManagementPolicy = podManagementPolicy;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.serviceName = serviceName;
        this.template = template;
        this.updateStrategy = updateStrategy;
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    /**
     * 
     * 
     * @return
     *     The podManagementPolicy
     */
    @JsonProperty("podManagementPolicy")
    public String getPodManagementPolicy() {
        return podManagementPolicy;
    }

    /**
     * 
     * 
     * @param podManagementPolicy
     *     The podManagementPolicy
     */
    @JsonProperty("podManagementPolicy")
    public void setPodManagementPolicy(String podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
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
     *     The serviceName
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 
     * 
     * @param serviceName
     *     The serviceName
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
    public StatefulSetUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    /**
     * 
     * 
     * @param updateStrategy
     *     The updateStrategy
     */
    @JsonProperty("updateStrategy")
    public void setUpdateStrategy(StatefulSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    /**
     * 
     * 
     * @return
     *     The volumeClaimTemplates
     */
    @JsonProperty("volumeClaimTemplates")
    public List<PersistentVolumeClaim> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    /**
     * 
     * 
     * @param volumeClaimTemplates
     *     The volumeClaimTemplates
     */
    @JsonProperty("volumeClaimTemplates")
    public void setVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
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
