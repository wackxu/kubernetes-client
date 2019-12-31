
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
    "env",
    "forcePull",
    "from",
    "incremental",
    "pullSecret",
    "scripts"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SourceBuildStrategy implements KubernetesResource
{

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
    @JsonProperty("incremental")
    private Boolean incremental;
    /**
     * 
     * 
     */
    @JsonProperty("pullSecret")
    @Valid
    private LocalObjectReference pullSecret;
    /**
     * 
     * 
     */
    @JsonProperty("scripts")
    private String scripts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SourceBuildStrategy() {
    }

    /**
     * 
     * @param forcePull
     * @param from
     * @param incremental
     * @param env
     * @param scripts
     * @param pullSecret
     */
    public SourceBuildStrategy(List<EnvVar> env, Boolean forcePull, ObjectReference from, Boolean incremental, LocalObjectReference pullSecret, String scripts) {
        this.env = env;
        this.forcePull = forcePull;
        this.from = from;
        this.incremental = incremental;
        this.pullSecret = pullSecret;
        this.scripts = scripts;
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
     *     The incremental
     */
    @JsonProperty("incremental")
    public Boolean getIncremental() {
        return incremental;
    }

    /**
     * 
     * 
     * @param incremental
     *     The incremental
     */
    @JsonProperty("incremental")
    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
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

    /**
     * 
     * 
     * @return
     *     The scripts
     */
    @JsonProperty("scripts")
    public String getScripts() {
        return scripts;
    }

    /**
     * 
     * 
     * @param scripts
     *     The scripts
     */
    @JsonProperty("scripts")
    public void setScripts(String scripts) {
        this.scripts = scripts;
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
