
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
    "execNewPod",
    "failurePolicy",
    "tagImages"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class LifecycleHook implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("execNewPod")
    @Valid
    private ExecNewPodHook execNewPod;
    /**
     * 
     * 
     */
    @JsonProperty("failurePolicy")
    private String failurePolicy;
    /**
     * 
     * 
     */
    @JsonProperty("tagImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<TagImageHook> tagImages = new ArrayList<TagImageHook>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LifecycleHook() {
    }

    /**
     * 
     * @param tagImages
     * @param execNewPod
     * @param failurePolicy
     */
    public LifecycleHook(ExecNewPodHook execNewPod, String failurePolicy, List<TagImageHook> tagImages) {
        this.execNewPod = execNewPod;
        this.failurePolicy = failurePolicy;
        this.tagImages = tagImages;
    }

    /**
     * 
     * 
     * @return
     *     The execNewPod
     */
    @JsonProperty("execNewPod")
    public ExecNewPodHook getExecNewPod() {
        return execNewPod;
    }

    /**
     * 
     * 
     * @param execNewPod
     *     The execNewPod
     */
    @JsonProperty("execNewPod")
    public void setExecNewPod(ExecNewPodHook execNewPod) {
        this.execNewPod = execNewPod;
    }

    /**
     * 
     * 
     * @return
     *     The failurePolicy
     */
    @JsonProperty("failurePolicy")
    public String getFailurePolicy() {
        return failurePolicy;
    }

    /**
     * 
     * 
     * @param failurePolicy
     *     The failurePolicy
     */
    @JsonProperty("failurePolicy")
    public void setFailurePolicy(String failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    /**
     * 
     * 
     * @return
     *     The tagImages
     */
    @JsonProperty("tagImages")
    public List<TagImageHook> getTagImages() {
        return tagImages;
    }

    /**
     * 
     * 
     * @param tagImages
     *     The tagImages
     */
    @JsonProperty("tagImages")
    public void setTagImages(List<TagImageHook> tagImages) {
        this.tagImages = tagImages;
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
