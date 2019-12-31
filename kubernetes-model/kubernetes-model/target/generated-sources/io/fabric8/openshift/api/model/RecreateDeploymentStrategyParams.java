
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
    "mid",
    "post",
    "pre",
    "timeoutSeconds"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RecreateDeploymentStrategyParams implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("mid")
    @Valid
    private LifecycleHook mid;
    /**
     * 
     * 
     */
    @JsonProperty("post")
    @Valid
    private LifecycleHook post;
    /**
     * 
     * 
     */
    @JsonProperty("pre")
    @Valid
    private LifecycleHook pre;
    /**
     * 
     * 
     */
    @JsonProperty("timeoutSeconds")
    private Long timeoutSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecreateDeploymentStrategyParams() {
    }

    /**
     * 
     * @param pre
     * @param post
     * @param mid
     * @param timeoutSeconds
     */
    public RecreateDeploymentStrategyParams(LifecycleHook mid, LifecycleHook post, LifecycleHook pre, Long timeoutSeconds) {
        this.mid = mid;
        this.post = post;
        this.pre = pre;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The mid
     */
    @JsonProperty("mid")
    public LifecycleHook getMid() {
        return mid;
    }

    /**
     * 
     * 
     * @param mid
     *     The mid
     */
    @JsonProperty("mid")
    public void setMid(LifecycleHook mid) {
        this.mid = mid;
    }

    /**
     * 
     * 
     * @return
     *     The post
     */
    @JsonProperty("post")
    public LifecycleHook getPost() {
        return post;
    }

    /**
     * 
     * 
     * @param post
     *     The post
     */
    @JsonProperty("post")
    public void setPost(LifecycleHook post) {
        this.post = post;
    }

    /**
     * 
     * 
     * @return
     *     The pre
     */
    @JsonProperty("pre")
    public LifecycleHook getPre() {
        return pre;
    }

    /**
     * 
     * 
     * @param pre
     *     The pre
     */
    @JsonProperty("pre")
    public void setPre(LifecycleHook pre) {
        this.pre = pre;
    }

    /**
     * 
     * 
     * @return
     *     The timeoutSeconds
     */
    @JsonProperty("timeoutSeconds")
    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * 
     * 
     * @param timeoutSeconds
     *     The timeoutSeconds
     */
    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
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
