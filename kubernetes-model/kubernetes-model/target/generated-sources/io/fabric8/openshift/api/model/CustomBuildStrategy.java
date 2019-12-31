
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
    "buildAPIVersion",
    "env",
    "exposeDockerSocket",
    "forcePull",
    "from",
    "pullSecret",
    "secrets"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomBuildStrategy implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("buildAPIVersion")
    private String buildAPIVersion;
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
    @JsonProperty("exposeDockerSocket")
    private Boolean exposeDockerSocket;
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
    @JsonProperty("pullSecret")
    @Valid
    private LocalObjectReference pullSecret;
    /**
     * 
     * 
     */
    @JsonProperty("secrets")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<SecretSpec> secrets = new ArrayList<SecretSpec>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomBuildStrategy() {
    }

    /**
     * 
     * @param buildAPIVersion
     * @param forcePull
     * @param from
     * @param env
     * @param exposeDockerSocket
     * @param pullSecret
     * @param secrets
     */
    public CustomBuildStrategy(String buildAPIVersion, List<EnvVar> env, Boolean exposeDockerSocket, Boolean forcePull, ObjectReference from, LocalObjectReference pullSecret, List<SecretSpec> secrets) {
        this.buildAPIVersion = buildAPIVersion;
        this.env = env;
        this.exposeDockerSocket = exposeDockerSocket;
        this.forcePull = forcePull;
        this.from = from;
        this.pullSecret = pullSecret;
        this.secrets = secrets;
    }

    /**
     * 
     * 
     * @return
     *     The buildAPIVersion
     */
    @JsonProperty("buildAPIVersion")
    public String getBuildAPIVersion() {
        return buildAPIVersion;
    }

    /**
     * 
     * 
     * @param buildAPIVersion
     *     The buildAPIVersion
     */
    @JsonProperty("buildAPIVersion")
    public void setBuildAPIVersion(String buildAPIVersion) {
        this.buildAPIVersion = buildAPIVersion;
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
     *     The exposeDockerSocket
     */
    @JsonProperty("exposeDockerSocket")
    public Boolean getExposeDockerSocket() {
        return exposeDockerSocket;
    }

    /**
     * 
     * 
     * @param exposeDockerSocket
     *     The exposeDockerSocket
     */
    @JsonProperty("exposeDockerSocket")
    public void setExposeDockerSocket(Boolean exposeDockerSocket) {
        this.exposeDockerSocket = exposeDockerSocket;
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
     *     The secrets
     */
    @JsonProperty("secrets")
    public List<SecretSpec> getSecrets() {
        return secrets;
    }

    /**
     * 
     * 
     * @param secrets
     *     The secrets
     */
    @JsonProperty("secrets")
    public void setSecrets(List<SecretSpec> secrets) {
        this.secrets = secrets;
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
