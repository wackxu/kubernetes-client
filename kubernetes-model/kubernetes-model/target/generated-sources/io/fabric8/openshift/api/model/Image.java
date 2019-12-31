
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
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.runtime.RawExtension;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import io.sundr.transform.annotations.VelocityTransformation;
import io.sundr.transform.annotations.VelocityTransformations;
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
    "dockerImageConfig",
    "dockerImageLayers",
    "dockerImageManifest",
    "dockerImageManifestMediaType",
    "dockerImageMetadata",
    "dockerImageMetadataVersion",
    "dockerImageReference",
    "dockerImageSignatures",
    "signatures"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
@ApiVersion("v1")
@ApiGroup("image.openshift.io")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "openshift.properties", gather = true)
})
public class Image implements HasMetadata
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private String apiVersion = "image.openshift.io/v1";
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageConfig")
    private String dockerImageConfig;
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageLayers")
    @Valid
    private List<ImageLayer> dockerImageLayers = new ArrayList<ImageLayer>();
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageManifest")
    private String dockerImageManifest;
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageManifestMediaType")
    private String dockerImageManifestMediaType;
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageMetadata")
    @Valid
    private RawExtension dockerImageMetadata;
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageMetadataVersion")
    private String dockerImageMetadataVersion;
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageReference")
    private String dockerImageReference;
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageSignatures")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> dockerImageSignatures = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "Image";
    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    @Valid
    @CheckObjectMeta(minimal = true)
    private ObjectMeta metadata;
    /**
     * 
     * 
     */
    @JsonProperty("signatures")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ImageSignature> signatures = new ArrayList<ImageSignature>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param dockerImageLayers
     * @param dockerImageMetadata
     * @param metadata
     * @param apiVersion
     * @param dockerImageSignatures
     * @param kind
     * @param dockerImageReference
     * @param dockerImageManifestMediaType
     * @param dockerImageConfig
     * @param dockerImageMetadataVersion
     * @param dockerImageManifest
     * @param signatures
     */
    public Image(String apiVersion, String dockerImageConfig, List<ImageLayer> dockerImageLayers, String dockerImageManifest, String dockerImageManifestMediaType, RawExtension dockerImageMetadata, String dockerImageMetadataVersion, String dockerImageReference, List<String> dockerImageSignatures, String kind, ObjectMeta metadata, List<ImageSignature> signatures) {
        this.apiVersion = apiVersion;
        this.dockerImageConfig = dockerImageConfig;
        this.dockerImageLayers = dockerImageLayers;
        this.dockerImageManifest = dockerImageManifest;
        this.dockerImageManifestMediaType = dockerImageManifestMediaType;
        this.dockerImageMetadata = dockerImageMetadata;
        this.dockerImageMetadataVersion = dockerImageMetadataVersion;
        this.dockerImageReference = dockerImageReference;
        this.dockerImageSignatures = dockerImageSignatures;
        this.kind = kind;
        this.metadata = metadata;
        this.signatures = signatures;
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
     *     The dockerImageConfig
     */
    @JsonProperty("dockerImageConfig")
    public String getDockerImageConfig() {
        return dockerImageConfig;
    }

    /**
     * 
     * 
     * @param dockerImageConfig
     *     The dockerImageConfig
     */
    @JsonProperty("dockerImageConfig")
    public void setDockerImageConfig(String dockerImageConfig) {
        this.dockerImageConfig = dockerImageConfig;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageLayers
     */
    @JsonProperty("dockerImageLayers")
    public List<ImageLayer> getDockerImageLayers() {
        return dockerImageLayers;
    }

    /**
     * 
     * 
     * @param dockerImageLayers
     *     The dockerImageLayers
     */
    @JsonProperty("dockerImageLayers")
    public void setDockerImageLayers(List<ImageLayer> dockerImageLayers) {
        this.dockerImageLayers = dockerImageLayers;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageManifest
     */
    @JsonProperty("dockerImageManifest")
    public String getDockerImageManifest() {
        return dockerImageManifest;
    }

    /**
     * 
     * 
     * @param dockerImageManifest
     *     The dockerImageManifest
     */
    @JsonProperty("dockerImageManifest")
    public void setDockerImageManifest(String dockerImageManifest) {
        this.dockerImageManifest = dockerImageManifest;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageManifestMediaType
     */
    @JsonProperty("dockerImageManifestMediaType")
    public String getDockerImageManifestMediaType() {
        return dockerImageManifestMediaType;
    }

    /**
     * 
     * 
     * @param dockerImageManifestMediaType
     *     The dockerImageManifestMediaType
     */
    @JsonProperty("dockerImageManifestMediaType")
    public void setDockerImageManifestMediaType(String dockerImageManifestMediaType) {
        this.dockerImageManifestMediaType = dockerImageManifestMediaType;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageMetadata
     */
    @JsonProperty("dockerImageMetadata")
    public RawExtension getDockerImageMetadata() {
        return dockerImageMetadata;
    }

    /**
     * 
     * 
     * @param dockerImageMetadata
     *     The dockerImageMetadata
     */
    @JsonProperty("dockerImageMetadata")
    public void setDockerImageMetadata(RawExtension dockerImageMetadata) {
        this.dockerImageMetadata = dockerImageMetadata;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageMetadataVersion
     */
    @JsonProperty("dockerImageMetadataVersion")
    public String getDockerImageMetadataVersion() {
        return dockerImageMetadataVersion;
    }

    /**
     * 
     * 
     * @param dockerImageMetadataVersion
     *     The dockerImageMetadataVersion
     */
    @JsonProperty("dockerImageMetadataVersion")
    public void setDockerImageMetadataVersion(String dockerImageMetadataVersion) {
        this.dockerImageMetadataVersion = dockerImageMetadataVersion;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageReference
     */
    @JsonProperty("dockerImageReference")
    public String getDockerImageReference() {
        return dockerImageReference;
    }

    /**
     * 
     * 
     * @param dockerImageReference
     *     The dockerImageReference
     */
    @JsonProperty("dockerImageReference")
    public void setDockerImageReference(String dockerImageReference) {
        this.dockerImageReference = dockerImageReference;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageSignatures
     */
    @JsonProperty("dockerImageSignatures")
    public List<String> getDockerImageSignatures() {
        return dockerImageSignatures;
    }

    /**
     * 
     * 
     * @param dockerImageSignatures
     *     The dockerImageSignatures
     */
    @JsonProperty("dockerImageSignatures")
    public void setDockerImageSignatures(List<String> dockerImageSignatures) {
        this.dockerImageSignatures = dockerImageSignatures;
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
     *     The signatures
     */
    @JsonProperty("signatures")
    public List<ImageSignature> getSignatures() {
        return signatures;
    }

    /**
     * 
     * 
     * @param signatures
     *     The signatures
     */
    @JsonProperty("signatures")
    public void setSignatures(List<ImageSignature> signatures) {
        this.signatures = signatures;
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
