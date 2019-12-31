
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
    "bitbucketWebHook",
    "genericWebHook",
    "githubWebHook",
    "gitlabWebHook",
    "imageChangeBuild",
    "message"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildTriggerCause implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("bitbucketWebHook")
    @Valid
    private BitbucketWebHookCause bitbucketWebHook;
    /**
     * 
     * 
     */
    @JsonProperty("genericWebHook")
    @Valid
    private GenericWebHookCause genericWebHook;
    /**
     * 
     * 
     */
    @JsonProperty("githubWebHook")
    @Valid
    private GitHubWebHookCause githubWebHook;
    /**
     * 
     * 
     */
    @JsonProperty("gitlabWebHook")
    @Valid
    private GitLabWebHookCause gitlabWebHook;
    /**
     * 
     * 
     */
    @JsonProperty("imageChangeBuild")
    @Valid
    private ImageChangeCause imageChangeBuild;
    /**
     * 
     * 
     */
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildTriggerCause() {
    }

    /**
     * 
     * @param githubWebHook
     * @param genericWebHook
     * @param bitbucketWebHook
     * @param imageChangeBuild
     * @param message
     * @param gitlabWebHook
     */
    public BuildTriggerCause(BitbucketWebHookCause bitbucketWebHook, GenericWebHookCause genericWebHook, GitHubWebHookCause githubWebHook, GitLabWebHookCause gitlabWebHook, ImageChangeCause imageChangeBuild, String message) {
        this.bitbucketWebHook = bitbucketWebHook;
        this.genericWebHook = genericWebHook;
        this.githubWebHook = githubWebHook;
        this.gitlabWebHook = gitlabWebHook;
        this.imageChangeBuild = imageChangeBuild;
        this.message = message;
    }

    /**
     * 
     * 
     * @return
     *     The bitbucketWebHook
     */
    @JsonProperty("bitbucketWebHook")
    public BitbucketWebHookCause getBitbucketWebHook() {
        return bitbucketWebHook;
    }

    /**
     * 
     * 
     * @param bitbucketWebHook
     *     The bitbucketWebHook
     */
    @JsonProperty("bitbucketWebHook")
    public void setBitbucketWebHook(BitbucketWebHookCause bitbucketWebHook) {
        this.bitbucketWebHook = bitbucketWebHook;
    }

    /**
     * 
     * 
     * @return
     *     The genericWebHook
     */
    @JsonProperty("genericWebHook")
    public GenericWebHookCause getGenericWebHook() {
        return genericWebHook;
    }

    /**
     * 
     * 
     * @param genericWebHook
     *     The genericWebHook
     */
    @JsonProperty("genericWebHook")
    public void setGenericWebHook(GenericWebHookCause genericWebHook) {
        this.genericWebHook = genericWebHook;
    }

    /**
     * 
     * 
     * @return
     *     The githubWebHook
     */
    @JsonProperty("githubWebHook")
    public GitHubWebHookCause getGithubWebHook() {
        return githubWebHook;
    }

    /**
     * 
     * 
     * @param githubWebHook
     *     The githubWebHook
     */
    @JsonProperty("githubWebHook")
    public void setGithubWebHook(GitHubWebHookCause githubWebHook) {
        this.githubWebHook = githubWebHook;
    }

    /**
     * 
     * 
     * @return
     *     The gitlabWebHook
     */
    @JsonProperty("gitlabWebHook")
    public GitLabWebHookCause getGitlabWebHook() {
        return gitlabWebHook;
    }

    /**
     * 
     * 
     * @param gitlabWebHook
     *     The gitlabWebHook
     */
    @JsonProperty("gitlabWebHook")
    public void setGitlabWebHook(GitLabWebHookCause gitlabWebHook) {
        this.gitlabWebHook = gitlabWebHook;
    }

    /**
     * 
     * 
     * @return
     *     The imageChangeBuild
     */
    @JsonProperty("imageChangeBuild")
    public ImageChangeCause getImageChangeBuild() {
        return imageChangeBuild;
    }

    /**
     * 
     * 
     * @param imageChangeBuild
     *     The imageChangeBuild
     */
    @JsonProperty("imageChangeBuild")
    public void setImageChangeBuild(ImageChangeCause imageChangeBuild) {
        this.imageChangeBuild = imageChangeBuild;
    }

    /**
     * 
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
