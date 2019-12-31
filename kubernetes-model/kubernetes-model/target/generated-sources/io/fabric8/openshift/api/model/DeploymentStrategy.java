
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
import io.fabric8.kubernetes.api.model.ResourceRequirements;
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
    "annotations",
    "customParams",
    "labels",
    "recreateParams",
    "resources",
    "rollingParams",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DeploymentStrategy implements KubernetesResource
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
    @JsonProperty("annotations")
    @Valid
    private Map<String, String> annotations;
    /**
     * 
     * 
     */
    @JsonProperty("customParams")
    @Valid
    private CustomDeploymentStrategyParams customParams;
    /**
     * 
     * 
     */
    @JsonProperty("labels")
    @Valid
    private Map<String, String> labels;
    /**
     * 
     * 
     */
    @JsonProperty("recreateParams")
    @Valid
    private RecreateDeploymentStrategyParams recreateParams;
    /**
     * 
     * 
     */
    @JsonProperty("resources")
    @Valid
    private ResourceRequirements resources;
    /**
     * 
     * 
     */
    @JsonProperty("rollingParams")
    @Valid
    private RollingDeploymentStrategyParams rollingParams;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private java.lang.String type;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeploymentStrategy() {
    }

    /**
     * 
     * @param recreateParams
     * @param rollingParams
     * @param customParams
     * @param annotations
     * @param resources
     * @param type
     * @param activeDeadlineSeconds
     * @param labels
     */
    public DeploymentStrategy(Long activeDeadlineSeconds, Map<String, String> annotations, CustomDeploymentStrategyParams customParams, Map<String, String> labels, RecreateDeploymentStrategyParams recreateParams, ResourceRequirements resources, RollingDeploymentStrategyParams rollingParams, java.lang.String type) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.annotations = annotations;
        this.customParams = customParams;
        this.labels = labels;
        this.recreateParams = recreateParams;
        this.resources = resources;
        this.rollingParams = rollingParams;
        this.type = type;
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
     *     The annotations
     */
    @JsonProperty("annotations")
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    /**
     * 
     * 
     * @param annotations
     *     The annotations
     */
    @JsonProperty("annotations")
    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * 
     * 
     * @return
     *     The customParams
     */
    @JsonProperty("customParams")
    public CustomDeploymentStrategyParams getCustomParams() {
        return customParams;
    }

    /**
     * 
     * 
     * @param customParams
     *     The customParams
     */
    @JsonProperty("customParams")
    public void setCustomParams(CustomDeploymentStrategyParams customParams) {
        this.customParams = customParams;
    }

    /**
     * 
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    /**
     * 
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * 
     * 
     * @return
     *     The recreateParams
     */
    @JsonProperty("recreateParams")
    public RecreateDeploymentStrategyParams getRecreateParams() {
        return recreateParams;
    }

    /**
     * 
     * 
     * @param recreateParams
     *     The recreateParams
     */
    @JsonProperty("recreateParams")
    public void setRecreateParams(RecreateDeploymentStrategyParams recreateParams) {
        this.recreateParams = recreateParams;
    }

    /**
     * 
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public ResourceRequirements getResources() {
        return resources;
    }

    /**
     * 
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    /**
     * 
     * 
     * @return
     *     The rollingParams
     */
    @JsonProperty("rollingParams")
    public RollingDeploymentStrategyParams getRollingParams() {
        return rollingParams;
    }

    /**
     * 
     * 
     * @param rollingParams
     *     The rollingParams
     */
    @JsonProperty("rollingParams")
    public void setRollingParams(RollingDeploymentStrategyParams rollingParams) {
        this.rollingParams = rollingParams;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
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
