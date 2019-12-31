
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
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReference;
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
    "buildArgs",
    "dockerfilePath",
    "env",
    "forcePull",
    "from",
    "imageOptimizationPolicy",
    "noCache",
    "pullSecret"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DockerBuildStrategy implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("buildArgs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EnvVar> buildArgs = new ArrayList<EnvVar>();
    /**
     * 
     * 
     */
    @JsonProperty("dockerfilePath")
    private String dockerfilePath;
    /**
     * 
     * 
     */
    @JsonProperty("env")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EnvVar> env = new ArrayList<EnvVar>();
    /**
     * 
     * 
     */
    @JsonProperty("forcePull")
    private Boolean forcePull;
    /**
     * 
     * 
     */
    @JsonProperty("from")
    @Valid
    private ObjectReference from;
    /**
     * 
     * 
     */
    @JsonProperty("imageOptimizationPolicy")
    private String imageOptimizationPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("noCache")
    private Boolean noCache;
    /**
     * 
     * 
     */
    @JsonProperty("pullSecret")
    @Valid
    private LocalObjectReference pullSecret;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DockerBuildStrategy() {
    }

    /**
     * 
     * @param forcePull
     * @param imageOptimizationPolicy
     * @param dockerfilePath
     * @param noCache
     * @param from
     * @param env
     * @param buildArgs
     * @param pullSecret
     */
    public DockerBuildStrategy(List<EnvVar> buildArgs, String dockerfilePath, List<EnvVar> env, Boolean forcePull, ObjectReference from, String imageOptimizationPolicy, Boolean noCache, LocalObjectReference pullSecret) {
        this.buildArgs = buildArgs;
        this.dockerfilePath = dockerfilePath;
        this.env = env;
        this.forcePull = forcePull;
        this.from = from;
        this.imageOptimizationPolicy = imageOptimizationPolicy;
        this.noCache = noCache;
        this.pullSecret = pullSecret;
    }

    /**
     * 
     * 
     * @return
     *     The buildArgs
     */
    @JsonProperty("buildArgs")
    public List<EnvVar> getBuildArgs() {
        return buildArgs;
    }

    /**
     * 
     * 
     * @param buildArgs
     *     The buildArgs
     */
    @JsonProperty("buildArgs")
    public void setBuildArgs(List<EnvVar> buildArgs) {
        this.buildArgs = buildArgs;
    }

    /**
     * 
     * 
     * @return
     *     The dockerfilePath
     */
    @JsonProperty("dockerfilePath")
    public String getDockerfilePath() {
        return dockerfilePath;
    }

    /**
     * 
     * 
     * @param dockerfilePath
     *     The dockerfilePath
     */
    @JsonProperty("dockerfilePath")
    public void setDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
    }

    /**
     * 
     * 
     * @return
     *     The env
     */
    @JsonProperty("env")
    public List<EnvVar> getEnv() {
        return env;
    }

    /**
     * 
     * 
     * @param env
     *     The env
     */
    @JsonProperty("env")
    public void setEnv(List<EnvVar> env) {
        this.env = env;
    }

    /**
     * 
     * 
     * @return
     *     The forcePull
     */
    @JsonProperty("forcePull")
    public Boolean getForcePull() {
        return forcePull;
    }

    /**
     * 
     * 
     * @param forcePull
     *     The forcePull
     */
    @JsonProperty("forcePull")
    public void setForcePull(Boolean forcePull) {
        this.forcePull = forcePull;
    }

    /**
     * 
     * 
     * @return
     *     The from
     */
    @JsonProperty("from")
    public ObjectReference getFrom() {
        return from;
    }

    /**
     * 
     * 
     * @param from
     *     The from
     */
    @JsonProperty("from")
    public void setFrom(ObjectReference from) {
        this.from = from;
    }

    /**
     * 
     * 
     * @return
     *     The imageOptimizationPolicy
     */
    @JsonProperty("imageOptimizationPolicy")
    public String getImageOptimizationPolicy() {
        return imageOptimizationPolicy;
    }

    /**
     * 
     * 
     * @param imageOptimizationPolicy
     *     The imageOptimizationPolicy
     */
    @JsonProperty("imageOptimizationPolicy")
    public void setImageOptimizationPolicy(String imageOptimizationPolicy) {
        this.imageOptimizationPolicy = imageOptimizationPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The noCache
     */
    @JsonProperty("noCache")
    public Boolean getNoCache() {
        return noCache;
    }

    /**
     * 
     * 
     * @param noCache
     *     The noCache
     */
    @JsonProperty("noCache")
    public void setNoCache(Boolean noCache) {
        this.noCache = noCache;
    }

    /**
     * 
     * 
     * @return
     *     The pullSecret
     */
    @JsonProperty("pullSecret")
    public LocalObjectReference getPullSecret() {
        return pullSecret;
    }

    /**
     * 
     * 
     * @param pullSecret
     *     The pullSecret
     */
    @JsonProperty("pullSecret")
    public void setPullSecret(LocalObjectReference pullSecret) {
        this.pullSecret = pullSecret;
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
