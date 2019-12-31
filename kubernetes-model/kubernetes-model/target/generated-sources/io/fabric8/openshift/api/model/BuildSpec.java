
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
    "completionDeadlineSeconds",
    "nodeSelector",
    "output",
    "postCommit",
    "resources",
    "revision",
    "serviceAccount",
    "source",
    "strategy",
    "triggeredBy"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("completionDeadlineSeconds")
    private Long completionDeadlineSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("nodeSelector")
    @Valid
    private Map<String, String> nodeSelector;
    /**
     * 
     * 
     */
    @JsonProperty("output")
    @Valid
    private BuildOutput output;
    /**
     * 
     * 
     */
    @JsonProperty("postCommit")
    @Valid
    private BuildPostCommitSpec postCommit;
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
    @JsonProperty("revision")
    @Valid
    private SourceRevision revision;
    /**
     * 
     * 
     */
    @JsonProperty("serviceAccount")
    private java.lang.String serviceAccount;
    /**
     * 
     * 
     */
    @JsonProperty("source")
    @Valid
    private BuildSource source;
    /**
     * 
     * 
     */
    @JsonProperty("strategy")
    @Valid
    private BuildStrategy strategy;
    /**
     * 
     * 
     */
    @JsonProperty("triggeredBy")
    @Valid
    private List<BuildTriggerCause> triggeredBy = new ArrayList<BuildTriggerCause>();
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildSpec() {
    }

    /**
     * 
     * @param output
     * @param completionDeadlineSeconds
     * @param resources
     * @param serviceAccount
     * @param source
     * @param postCommit
     * @param strategy
     * @param nodeSelector
     * @param revision
     * @param triggeredBy
     */
    public BuildSpec(Long completionDeadlineSeconds, Map<String, String> nodeSelector, BuildOutput output, BuildPostCommitSpec postCommit, ResourceRequirements resources, SourceRevision revision, java.lang.String serviceAccount, BuildSource source, BuildStrategy strategy, List<BuildTriggerCause> triggeredBy) {
        this.completionDeadlineSeconds = completionDeadlineSeconds;
        this.nodeSelector = nodeSelector;
        this.output = output;
        this.postCommit = postCommit;
        this.resources = resources;
        this.revision = revision;
        this.serviceAccount = serviceAccount;
        this.source = source;
        this.strategy = strategy;
        this.triggeredBy = triggeredBy;
    }

    /**
     * 
     * 
     * @return
     *     The completionDeadlineSeconds
     */
    @JsonProperty("completionDeadlineSeconds")
    public Long getCompletionDeadlineSeconds() {
        return completionDeadlineSeconds;
    }

    /**
     * 
     * 
     * @param completionDeadlineSeconds
     *     The completionDeadlineSeconds
     */
    @JsonProperty("completionDeadlineSeconds")
    public void setCompletionDeadlineSeconds(Long completionDeadlineSeconds) {
        this.completionDeadlineSeconds = completionDeadlineSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The nodeSelector
     */
    @JsonProperty("nodeSelector")
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    /**
     * 
     * 
     * @param nodeSelector
     *     The nodeSelector
     */
    @JsonProperty("nodeSelector")
    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * 
     * 
     * @return
     *     The output
     */
    @JsonProperty("output")
    public BuildOutput getOutput() {
        return output;
    }

    /**
     * 
     * 
     * @param output
     *     The output
     */
    @JsonProperty("output")
    public void setOutput(BuildOutput output) {
        this.output = output;
    }

    /**
     * 
     * 
     * @return
     *     The postCommit
     */
    @JsonProperty("postCommit")
    public BuildPostCommitSpec getPostCommit() {
        return postCommit;
    }

    /**
     * 
     * 
     * @param postCommit
     *     The postCommit
     */
    @JsonProperty("postCommit")
    public void setPostCommit(BuildPostCommitSpec postCommit) {
        this.postCommit = postCommit;
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
     *     The revision
     */
    @JsonProperty("revision")
    public SourceRevision getRevision() {
        return revision;
    }

    /**
     * 
     * 
     * @param revision
     *     The revision
     */
    @JsonProperty("revision")
    public void setRevision(SourceRevision revision) {
        this.revision = revision;
    }

    /**
     * 
     * 
     * @return
     *     The serviceAccount
     */
    @JsonProperty("serviceAccount")
    public java.lang.String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * 
     * 
     * @param serviceAccount
     *     The serviceAccount
     */
    @JsonProperty("serviceAccount")
    public void setServiceAccount(java.lang.String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * 
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public BuildSource getSource() {
        return source;
    }

    /**
     * 
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(BuildSource source) {
        this.source = source;
    }

    /**
     * 
     * 
     * @return
     *     The strategy
     */
    @JsonProperty("strategy")
    public BuildStrategy getStrategy() {
        return strategy;
    }

    /**
     * 
     * 
     * @param strategy
     *     The strategy
     */
    @JsonProperty("strategy")
    public void setStrategy(BuildStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 
     * 
     * @return
     *     The triggeredBy
     */
    @JsonProperty("triggeredBy")
    public List<BuildTriggerCause> getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * 
     * 
     * @param triggeredBy
     *     The triggeredBy
     */
    @JsonProperty("triggeredBy")
    public void setTriggeredBy(List<BuildTriggerCause> triggeredBy) {
        this.triggeredBy = triggeredBy;
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
