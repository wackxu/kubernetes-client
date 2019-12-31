
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
    "bitbucket",
    "generic",
    "github",
    "gitlab",
    "imageChange",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildTriggerPolicy implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("bitbucket")
    @Valid
    private WebHookTrigger bitbucket;
    /**
     * 
     * 
     */
    @JsonProperty("generic")
    @Valid
    private WebHookTrigger generic;
    /**
     * 
     * 
     */
    @JsonProperty("github")
    @Valid
    private WebHookTrigger github;
    /**
     * 
     * 
     */
    @JsonProperty("gitlab")
    @Valid
    private WebHookTrigger gitlab;
    /**
     * 
     * 
     */
    @JsonProperty("imageChange")
    @Valid
    private ImageChangeTrigger imageChange;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildTriggerPolicy() {
    }

    /**
     * 
     * @param imageChange
     * @param github
     * @param gitlab
     * @param bitbucket
     * @param type
     * @param generic
     */
    public BuildTriggerPolicy(WebHookTrigger bitbucket, WebHookTrigger generic, WebHookTrigger github, WebHookTrigger gitlab, ImageChangeTrigger imageChange, String type) {
        this.bitbucket = bitbucket;
        this.generic = generic;
        this.github = github;
        this.gitlab = gitlab;
        this.imageChange = imageChange;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The bitbucket
     */
    @JsonProperty("bitbucket")
    public WebHookTrigger getBitbucket() {
        return bitbucket;
    }

    /**
     * 
     * 
     * @param bitbucket
     *     The bitbucket
     */
    @JsonProperty("bitbucket")
    public void setBitbucket(WebHookTrigger bitbucket) {
        this.bitbucket = bitbucket;
    }

    /**
     * 
     * 
     * @return
     *     The generic
     */
    @JsonProperty("generic")
    public WebHookTrigger getGeneric() {
        return generic;
    }

    /**
     * 
     * 
     * @param generic
     *     The generic
     */
    @JsonProperty("generic")
    public void setGeneric(WebHookTrigger generic) {
        this.generic = generic;
    }

    /**
     * 
     * 
     * @return
     *     The github
     */
    @JsonProperty("github")
    public WebHookTrigger getGithub() {
        return github;
    }

    /**
     * 
     * 
     * @param github
     *     The github
     */
    @JsonProperty("github")
    public void setGithub(WebHookTrigger github) {
        this.github = github;
    }

    /**
     * 
     * 
     * @return
     *     The gitlab
     */
    @JsonProperty("gitlab")
    public WebHookTrigger getGitlab() {
        return gitlab;
    }

    /**
     * 
     * 
     * @param gitlab
     *     The gitlab
     */
    @JsonProperty("gitlab")
    public void setGitlab(WebHookTrigger gitlab) {
        this.gitlab = gitlab;
    }

    /**
     * 
     * 
     * @return
     *     The imageChange
     */
    @JsonProperty("imageChange")
    public ImageChangeTrigger getImageChange() {
        return imageChange;
    }

    /**
     * 
     * 
     * @param imageChange
     *     The imageChange
     */
    @JsonProperty("imageChange")
    public void setImageChange(ImageChangeTrigger imageChange) {
        this.imageChange = imageChange;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
