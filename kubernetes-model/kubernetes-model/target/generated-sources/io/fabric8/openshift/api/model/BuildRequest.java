
package io.fabric8.openshift.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
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
    "binary",
    "dockerStrategyOptions",
    "env",
    "from",
    "lastVersion",
    "revision",
    "sourceStrategyOptions",
    "triggeredBy",
    "triggeredByImage"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildRequest implements HasMetadata
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private String apiVersion = "build.openshift.io/v1";
    /**
     * 
     * 
     */
    @JsonProperty("binary")
    @Valid
    private BinaryBuildSource binary;
    /**
     * 
     * 
     */
    @JsonProperty("dockerStrategyOptions")
    @Valid
    private DockerStrategyOptions dockerStrategyOptions;
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
    @JsonProperty("from")
    @Valid
    private ObjectReference from;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "BuildRequest";
    /**
     * 
     * 
     */
    @JsonProperty("lastVersion")
    private Long lastVersion;
    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    @Valid
    @CheckObjectMeta(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*$", max = 253)
    private ObjectMeta metadata;
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
    @JsonProperty("sourceStrategyOptions")
    @Valid
    private SourceStrategyOptions sourceStrategyOptions;
    /**
     * 
     * 
     */
    @JsonProperty("triggeredBy")
    @Valid
    private List<BuildTriggerCause> triggeredBy = new ArrayList<BuildTriggerCause>();
    /**
     * 
     * 
     */
    @JsonProperty("triggeredByImage")
    @Valid
    private ObjectReference triggeredByImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildRequest() {
    }

    /**
     * 
     * @param sourceStrategyOptions
     * @param lastVersion
     * @param metadata
     * @param apiVersion
     * @param dockerStrategyOptions
     * @param triggeredByImage
     * @param kind
     * @param binary
     * @param from
     * @param env
     * @param revision
     * @param triggeredBy
     */
    public BuildRequest(String apiVersion, BinaryBuildSource binary, DockerStrategyOptions dockerStrategyOptions, List<EnvVar> env, ObjectReference from, String kind, Long lastVersion, ObjectMeta metadata, SourceRevision revision, SourceStrategyOptions sourceStrategyOptions, List<BuildTriggerCause> triggeredBy, ObjectReference triggeredByImage) {
        this.apiVersion = apiVersion;
        this.binary = binary;
        this.dockerStrategyOptions = dockerStrategyOptions;
        this.env = env;
        this.from = from;
        this.kind = kind;
        this.lastVersion = lastVersion;
        this.metadata = metadata;
        this.revision = revision;
        this.sourceStrategyOptions = sourceStrategyOptions;
        this.triggeredBy = triggeredBy;
        this.triggeredByImage = triggeredByImage;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * 
     * @return
     *     The binary
     */
    @JsonProperty("binary")
    public BinaryBuildSource getBinary() {
        return binary;
    }

    /**
     * 
     * 
     * @param binary
     *     The binary
     */
    @JsonProperty("binary")
    public void setBinary(BinaryBuildSource binary) {
        this.binary = binary;
    }

    /**
     * 
     * 
     * @return
     *     The dockerStrategyOptions
     */
    @JsonProperty("dockerStrategyOptions")
    public DockerStrategyOptions getDockerStrategyOptions() {
        return dockerStrategyOptions;
    }

    /**
     * 
     * 
     * @param dockerStrategyOptions
     *     The dockerStrategyOptions
     */
    @JsonProperty("dockerStrategyOptions")
    public void setDockerStrategyOptions(DockerStrategyOptions dockerStrategyOptions) {
        this.dockerStrategyOptions = dockerStrategyOptions;
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
     * (Required)
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * 
     * @return
     *     The lastVersion
     */
    @JsonProperty("lastVersion")
    public Long getLastVersion() {
        return lastVersion;
    }

    /**
     * 
     * 
     * @param lastVersion
     *     The lastVersion
     */
    @JsonProperty("lastVersion")
    public void setLastVersion(Long lastVersion) {
        this.lastVersion = lastVersion;
    }

    /**
     * 
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
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
     *     The sourceStrategyOptions
     */
    @JsonProperty("sourceStrategyOptions")
    public SourceStrategyOptions getSourceStrategyOptions() {
        return sourceStrategyOptions;
    }

    /**
     * 
     * 
     * @param sourceStrategyOptions
     *     The sourceStrategyOptions
     */
    @JsonProperty("sourceStrategyOptions")
    public void setSourceStrategyOptions(SourceStrategyOptions sourceStrategyOptions) {
        this.sourceStrategyOptions = sourceStrategyOptions;
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

    /**
     * 
     * 
     * @return
     *     The triggeredByImage
     */
    @JsonProperty("triggeredByImage")
    public ObjectReference getTriggeredByImage() {
        return triggeredByImage;
    }

    /**
     * 
     * 
     * @param triggeredByImage
     *     The triggeredByImage
     */
    @JsonProperty("triggeredByImage")
    public void setTriggeredByImage(ObjectReference triggeredByImage) {
        this.triggeredByImage = triggeredByImage;
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
