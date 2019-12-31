
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
    "failedBuildsHistoryLimit",
    "nodeSelector",
    "output",
    "postCommit",
    "resources",
    "revision",
    "runPolicy",
    "serviceAccount",
    "source",
    "strategy",
    "successfulBuildsHistoryLimit",
    "triggers"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildConfigSpec implements KubernetesResource
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
    @JsonProperty("failedBuildsHistoryLimit")
    private Integer failedBuildsHistoryLimit;
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
    @JsonProperty("runPolicy")
    private java.lang.String runPolicy;
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
    @JsonProperty("successfulBuildsHistoryLimit")
    private Integer successfulBuildsHistoryLimit;
    /**
     * 
     * 
     */
    @JsonProperty("triggers")
    @Valid
    private List<BuildTriggerPolicy> triggers = new ArrayList<BuildTriggerPolicy>();
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildConfigSpec() {
    }

    /**
     * 
     * @param completionDeadlineSeconds
     * @param resources
     * @param serviceAccount
     * @param source
     * @param triggers
     * @param nodeSelector
     * @param revision
     * @param output
     * @param successfulBuildsHistoryLimit
     * @param failedBuildsHistoryLimit
     * @param postCommit
     * @param strategy
     * @param runPolicy
     */
    public BuildConfigSpec(Long completionDeadlineSeconds, Integer failedBuildsHistoryLimit, Map<String, String> nodeSelector, BuildOutput output, BuildPostCommitSpec postCommit, ResourceRequirements resources, SourceRevision revision, java.lang.String runPolicy, java.lang.String serviceAccount, BuildSource source, BuildStrategy strategy, Integer successfulBuildsHistoryLimit, List<BuildTriggerPolicy> triggers) {
        this.completionDeadlineSeconds = completionDeadlineSeconds;
        this.failedBuildsHistoryLimit = failedBuildsHistoryLimit;
        this.nodeSelector = nodeSelector;
        this.output = output;
        this.postCommit = postCommit;
        this.resources = resources;
        this.revision = revision;
        this.runPolicy = runPolicy;
        this.serviceAccount = serviceAccount;
        this.source = source;
        this.strategy = strategy;
        this.successfulBuildsHistoryLimit = successfulBuildsHistoryLimit;
        this.triggers = triggers;
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
     *     The failedBuildsHistoryLimit
     */
    @JsonProperty("failedBuildsHistoryLimit")
    public Integer getFailedBuildsHistoryLimit() {
        return failedBuildsHistoryLimit;
    }

    /**
     * 
     * 
     * @param failedBuildsHistoryLimit
     *     The failedBuildsHistoryLimit
     */
    @JsonProperty("failedBuildsHistoryLimit")
    public void setFailedBuildsHistoryLimit(Integer failedBuildsHistoryLimit) {
        this.failedBuildsHistoryLimit = failedBuildsHistoryLimit;
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
     *     The runPolicy
     */
    @JsonProperty("runPolicy")
    public java.lang.String getRunPolicy() {
        return runPolicy;
    }

    /**
     * 
     * 
     * @param runPolicy
     *     The runPolicy
     */
    @JsonProperty("runPolicy")
    public void setRunPolicy(java.lang.String runPolicy) {
        this.runPolicy = runPolicy;
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
     *     The successfulBuildsHistoryLimit
     */
    @JsonProperty("successfulBuildsHistoryLimit")
    public Integer getSuccessfulBuildsHistoryLimit() {
        return successfulBuildsHistoryLimit;
    }

    /**
     * 
     * 
     * @param successfulBuildsHistoryLimit
     *     The successfulBuildsHistoryLimit
     */
    @JsonProperty("successfulBuildsHistoryLimit")
    public void setSuccessfulBuildsHistoryLimit(Integer successfulBuildsHistoryLimit) {
        this.successfulBuildsHistoryLimit = successfulBuildsHistoryLimit;
    }

    /**
     * 
     * 
     * @return
     *     The triggers
     */
    @JsonProperty("triggers")
    public List<BuildTriggerPolicy> getTriggers() {
        return triggers;
    }

    /**
     * 
     * 
     * @param triggers
     *     The triggers
     */
    @JsonProperty("triggers")
    public void setTriggers(List<BuildTriggerPolicy> triggers) {
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
