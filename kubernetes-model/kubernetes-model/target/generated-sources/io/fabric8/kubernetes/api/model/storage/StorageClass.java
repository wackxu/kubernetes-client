
package io.fabric8.kubernetes.api.model.storage;

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
import io.fabric8.kubernetes.api.model.TopologySelectorTerm;
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
    "allowVolumeExpansion",
    "allowedTopologies",
    "mountOptions",
    "parameters",
    "provisioner",
    "reclaimPolicy",
    "volumeBindingMode"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
@ApiVersion("v1")
@ApiGroup("storage.k8s.io")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "kubernetes.properties", gather = true)
})
public class StorageClass implements HasMetadata
{

    /**
     * 
     * 
     */
    @JsonProperty("allowVolumeExpansion")
    private Boolean allowVolumeExpansion;
    /**
     * 
     * 
     */
    @JsonProperty("allowedTopologies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<TopologySelectorTerm> allowedTopologies = new ArrayList<TopologySelectorTerm>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private java.lang.String apiVersion = "storage.k8s.io/v1";
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private java.lang.String kind = "StorageClass";
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
    @JsonProperty("mountOptions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> mountOptions = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("parameters")
    @Valid
    private Map<String, String> parameters;
    /**
     * 
     * 
     */
    @JsonProperty("provisioner")
    private java.lang.String provisioner;
    /**
     * 
     * 
     */
    @JsonProperty("reclaimPolicy")
    private java.lang.String reclaimPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("volumeBindingMode")
    private java.lang.String volumeBindingMode;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StorageClass() {
    }

    /**
     * 
     * @param volumeBindingMode
     * @param metadata
     * @param provisioner
     * @param apiVersion
     * @param allowVolumeExpansion
     * @param reclaimPolicy
     * @param kind
     * @param mountOptions
     * @param parameters
     * @param allowedTopologies
     */
    public StorageClass(Boolean allowVolumeExpansion, List<TopologySelectorTerm> allowedTopologies, java.lang.String apiVersion, java.lang.String kind, ObjectMeta metadata, List<java.lang.String> mountOptions, Map<String, String> parameters, java.lang.String provisioner, java.lang.String reclaimPolicy, java.lang.String volumeBindingMode) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        this.allowedTopologies = allowedTopologies;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.mountOptions = mountOptions;
        this.parameters = parameters;
        this.provisioner = provisioner;
        this.reclaimPolicy = reclaimPolicy;
        this.volumeBindingMode = volumeBindingMode;
    }

    /**
     * 
     * 
     * @return
     *     The allowVolumeExpansion
     */
    @JsonProperty("allowVolumeExpansion")
    public Boolean getAllowVolumeExpansion() {
        return allowVolumeExpansion;
    }

    /**
     * 
     * 
     * @param allowVolumeExpansion
     *     The allowVolumeExpansion
     */
    @JsonProperty("allowVolumeExpansion")
    public void setAllowVolumeExpansion(Boolean allowVolumeExpansion) {
        this.allowVolumeExpansion = allowVolumeExpansion;
    }

    /**
     * 
     * 
     * @return
     *     The allowedTopologies
     */
    @JsonProperty("allowedTopologies")
    public List<TopologySelectorTerm> getAllowedTopologies() {
        return allowedTopologies;
    }

    /**
     * 
     * 
     * @param allowedTopologies
     *     The allowedTopologies
     */
    @JsonProperty("allowedTopologies")
    public void setAllowedTopologies(List<TopologySelectorTerm> allowedTopologies) {
        this.allowedTopologies = allowedTopologies;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public java.lang.String getApiVersion() {
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
    public void setApiVersion(java.lang.String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public java.lang.String getKind() {
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
    public void setKind(java.lang.String kind) {
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
     *     The mountOptions
     */
    @JsonProperty("mountOptions")
    public List<java.lang.String> getMountOptions() {
        return mountOptions;
    }

    /**
     * 
     * 
     * @param mountOptions
     *     The mountOptions
     */
    @JsonProperty("mountOptions")
    public void setMountOptions(List<java.lang.String> mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * 
     * 
     * @return
     *     The parameters
     */
    @JsonProperty("parameters")
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * 
     * 
     * @param parameters
     *     The parameters
     */
    @JsonProperty("parameters")
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * 
     * 
     * @return
     *     The provisioner
     */
    @JsonProperty("provisioner")
    public java.lang.String getProvisioner() {
        return provisioner;
    }

    /**
     * 
     * 
     * @param provisioner
     *     The provisioner
     */
    @JsonProperty("provisioner")
    public void setProvisioner(java.lang.String provisioner) {
        this.provisioner = provisioner;
    }

    /**
     * 
     * 
     * @return
     *     The reclaimPolicy
     */
    @JsonProperty("reclaimPolicy")
    public java.lang.String getReclaimPolicy() {
        return reclaimPolicy;
    }

    /**
     * 
     * 
     * @param reclaimPolicy
     *     The reclaimPolicy
     */
    @JsonProperty("reclaimPolicy")
    public void setReclaimPolicy(java.lang.String reclaimPolicy) {
        this.reclaimPolicy = reclaimPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The volumeBindingMode
     */
    @JsonProperty("volumeBindingMode")
    public java.lang.String getVolumeBindingMode() {
        return volumeBindingMode;
    }

    /**
     * 
     * 
     * @param volumeBindingMode
     *     The volumeBindingMode
     */
    @JsonProperty("volumeBindingMode")
    public void setVolumeBindingMode(java.lang.String volumeBindingMode) {
        this.volumeBindingMode = volumeBindingMode;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
