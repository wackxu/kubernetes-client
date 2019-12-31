
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
    "availableReplicas",
    "conditions",
    "details",
    "latestVersion",
    "observedGeneration",
    "readyReplicas",
    "replicas",
    "unavailableReplicas",
    "updatedReplicas"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DeploymentConfigStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("availableReplicas")
    private Integer availableReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<DeploymentCondition> conditions = new ArrayList<DeploymentCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("details")
    @Valid
    private DeploymentDetails details;
    /**
     * 
     * 
     */
    @JsonProperty("latestVersion")
    private Long latestVersion;
    /**
     * 
     * 
     */
    @JsonProperty("observedGeneration")
    private Long observedGeneration;
    /**
     * 
     * 
     */
    @JsonProperty("readyReplicas")
    private Integer readyReplicas;
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
    @JsonProperty("unavailableReplicas")
    private Integer unavailableReplicas;
    /**
     * 
     * 
     */
    @JsonProperty("updatedReplicas")
    private Integer updatedReplicas;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeploymentConfigStatus() {
    }

    /**
     * 
     * @param unavailableReplicas
     * @param latestVersion
     * @param replicas
     * @param readyReplicas
     * @param details
     * @param conditions
     * @param updatedReplicas
     * @param availableReplicas
     * @param observedGeneration
     */
    public DeploymentConfigStatus(Integer availableReplicas, List<DeploymentCondition> conditions, DeploymentDetails details, Long latestVersion, Long observedGeneration, Integer readyReplicas, Integer replicas, Integer unavailableReplicas, Integer updatedReplicas) {
        this.availableReplicas = availableReplicas;
        this.conditions = conditions;
        this.details = details;
        this.latestVersion = latestVersion;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
        this.unavailableReplicas = unavailableReplicas;
        this.updatedReplicas = updatedReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The availableReplicas
     */
    @JsonProperty("availableReplicas")
    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    /**
     * 
     * 
     * @param availableReplicas
     *     The availableReplicas
     */
    @JsonProperty("availableReplicas")
    public void setAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<DeploymentCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<DeploymentCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The details
     */
    @JsonProperty("details")
    public DeploymentDetails getDetails() {
        return details;
    }

    /**
     * 
     * 
     * @param details
     *     The details
     */
    @JsonProperty("details")
    public void setDetails(DeploymentDetails details) {
        this.details = details;
    }

    /**
     * 
     * 
     * @return
     *     The latestVersion
     */
    @JsonProperty("latestVersion")
    public Long getLatestVersion() {
        return latestVersion;
    }

    /**
     * 
     * 
     * @param latestVersion
     *     The latestVersion
     */
    @JsonProperty("latestVersion")
    public void setLatestVersion(Long latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * 
     * 
     * @return
     *     The observedGeneration
     */
    @JsonProperty("observedGeneration")
    public Long getObservedGeneration() {
        return observedGeneration;
    }

    /**
     * 
     * 
     * @param observedGeneration
     *     The observedGeneration
     */
    @JsonProperty("observedGeneration")
    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * 
     * 
     * @return
     *     The readyReplicas
     */
    @JsonProperty("readyReplicas")
    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    /**
     * 
     * 
     * @param readyReplicas
     *     The readyReplicas
     */
    @JsonProperty("readyReplicas")
    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
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
     *     The unavailableReplicas
     */
    @JsonProperty("unavailableReplicas")
    public Integer getUnavailableReplicas() {
        return unavailableReplicas;
    }

    /**
     * 
     * 
     * @param unavailableReplicas
     *     The unavailableReplicas
     */
    @JsonProperty("unavailableReplicas")
    public void setUnavailableReplicas(Integer unavailableReplicas) {
        this.unavailableReplicas = unavailableReplicas;
    }

    /**
     * 
     * 
     * @return
     *     The updatedReplicas
     */
    @JsonProperty("updatedReplicas")
    public Integer getUpdatedReplicas() {
        return updatedReplicas;
    }

    /**
     * 
     * 
     * @param updatedReplicas
     *     The updatedReplicas
     */
    @JsonProperty("updatedReplicas")
    public void setUpdatedReplicas(Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
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
