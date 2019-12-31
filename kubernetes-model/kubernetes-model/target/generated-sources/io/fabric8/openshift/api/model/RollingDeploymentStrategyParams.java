
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
import io.fabric8.kubernetes.api.model.IntOrString;
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
    "intervalSeconds",
    "maxSurge",
    "maxUnavailable",
    "post",
    "pre",
    "timeoutSeconds",
    "updatePeriodSeconds"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RollingDeploymentStrategyParams implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("intervalSeconds")
    private Long intervalSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("maxSurge")
    @Valid
    private IntOrString maxSurge;
    /**
     * 
     * 
     */
    @JsonProperty("maxUnavailable")
    @Valid
    private IntOrString maxUnavailable;
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
    /**
     * 
     * 
     */
    @JsonProperty("updatePeriodSeconds")
    private Long updatePeriodSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RollingDeploymentStrategyParams() {
    }

    /**
     * 
     * @param maxSurge
     * @param updatePeriodSeconds
     * @param pre
     * @param post
     * @param maxUnavailable
     * @param timeoutSeconds
     * @param intervalSeconds
     */
    public RollingDeploymentStrategyParams(Long intervalSeconds, IntOrString maxSurge, IntOrString maxUnavailable, LifecycleHook post, LifecycleHook pre, Long timeoutSeconds, Long updatePeriodSeconds) {
        this.intervalSeconds = intervalSeconds;
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
        this.post = post;
        this.pre = pre;
        this.timeoutSeconds = timeoutSeconds;
        this.updatePeriodSeconds = updatePeriodSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The intervalSeconds
     */
    @JsonProperty("intervalSeconds")
    public Long getIntervalSeconds() {
        return intervalSeconds;
    }

    /**
     * 
     * 
     * @param intervalSeconds
     *     The intervalSeconds
     */
    @JsonProperty("intervalSeconds")
    public void setIntervalSeconds(Long intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The maxSurge
     */
    @JsonProperty("maxSurge")
    public IntOrString getMaxSurge() {
        return maxSurge;
    }

    /**
     * 
     * 
     * @param maxSurge
     *     The maxSurge
     */
    @JsonProperty("maxSurge")
    public void setMaxSurge(IntOrString maxSurge) {
        this.maxSurge = maxSurge;
    }

    /**
     * 
     * 
     * @return
     *     The maxUnavailable
     */
    @JsonProperty("maxUnavailable")
    public IntOrString getMaxUnavailable() {
        return maxUnavailable;
    }

    /**
     * 
     * 
     * @param maxUnavailable
     *     The maxUnavailable
     */
    @JsonProperty("maxUnavailable")
    public void setMaxUnavailable(IntOrString maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
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

    /**
     * 
     * 
     * @return
     *     The updatePeriodSeconds
     */
    @JsonProperty("updatePeriodSeconds")
    public Long getUpdatePeriodSeconds() {
        return updatePeriodSeconds;
    }

    /**
     * 
     * 
     * @param updatePeriodSeconds
     *     The updatePeriodSeconds
     */
    @JsonProperty("updatePeriodSeconds")
    public void setUpdatePeriodSeconds(Long updatePeriodSeconds) {
        this.updatePeriodSeconds = updatePeriodSeconds;
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
