
package io.fabric8.kubernetes.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
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
    "annotations",
    "clusterName",
    "creationTimestamp",
    "deletionGracePeriodSeconds",
    "deletionTimestamp",
    "finalizers",
    "generateName",
    "generation",
    "initializers",
    "labels",
    "name",
    "namespace",
    "ownerReferences",
    "resourceVersion",
    "selfLink",
    "uid"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ObjectMeta implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("annotations")
    @Valid
    private Map<String, String> annotations;
    /**
     * 
     * 
     */
    @JsonProperty("clusterName")
    private java.lang.String clusterName;
    /**
     * 
     * 
     */
    @JsonProperty("creationTimestamp")
    @Valid
    private String creationTimestamp;
    /**
     * 
     * 
     */
    @JsonProperty("deletionGracePeriodSeconds")
    private Long deletionGracePeriodSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("deletionTimestamp")
    @Valid
    private String deletionTimestamp;
    /**
     * 
     * 
     */
    @JsonProperty("finalizers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> finalizers = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("generateName")
    private java.lang.String generateName;
    /**
     * 
     * 
     */
    @JsonProperty("generation")
    private Long generation;
    /**
     * 
     * 
     */
    @JsonProperty("initializers")
    @Valid
    private Initializers initializers;
    /**
     * 
     * 
     */
    @JsonProperty("labels")
    @Valid
    private Map<String, String> labels;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    private java.lang.String name;
    /**
     * 
     * 
     */
    @JsonProperty("namespace")
    @Pattern(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*$")
    @Size(max = 253)
    private java.lang.String namespace;
    /**
     * 
     * 
     */
    @JsonProperty("ownerReferences")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<OwnerReference> ownerReferences = new ArrayList<OwnerReference>();
    /**
     * 
     * 
     */
    @JsonProperty("resourceVersion")
    private java.lang.String resourceVersion;
    /**
     * 
     * 
     */
    @JsonProperty("selfLink")
    private java.lang.String selfLink;
    /**
     * 
     * 
     */
    @JsonProperty("uid")
    private java.lang.String uid;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectMeta() {
    }

    /**
     * 
     * @param generation
     * @param finalizers
     * @param resourceVersion
     * @param annotations
     * @param generateName
     * @param deletionTimestamp
     * @param labels
     * @param ownerReferences
     * @param selfLink
     * @param deletionGracePeriodSeconds
     * @param uid
     * @param initializers
     * @param clusterName
     * @param creationTimestamp
     * @param name
     * @param namespace
     */
    public ObjectMeta(Map<String, String> annotations, java.lang.String clusterName, String creationTimestamp, Long deletionGracePeriodSeconds, String deletionTimestamp, List<java.lang.String> finalizers, java.lang.String generateName, Long generation, Initializers initializers, Map<String, String> labels, java.lang.String name, java.lang.String namespace, List<OwnerReference> ownerReferences, java.lang.String resourceVersion, java.lang.String selfLink, java.lang.String uid) {
        this.annotations = annotations;
        this.clusterName = clusterName;
        this.creationTimestamp = creationTimestamp;
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        this.deletionTimestamp = deletionTimestamp;
        this.finalizers = finalizers;
        this.generateName = generateName;
        this.generation = generation;
        this.initializers = initializers;
        this.labels = labels;
        this.name = name;
        this.namespace = namespace;
        this.ownerReferences = ownerReferences;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    /**
     * 
     * 
     * @return
     *     The annotations
     */
    @JsonProperty("annotations")
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    /**
     * 
     * 
     * @param annotations
     *     The annotations
     */
    @JsonProperty("annotations")
    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * 
     * 
     * @return
     *     The clusterName
     */
    @JsonProperty("clusterName")
    public java.lang.String getClusterName() {
        return clusterName;
    }

    /**
     * 
     * 
     * @param clusterName
     *     The clusterName
     */
    @JsonProperty("clusterName")
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * 
     * 
     * @return
     *     The creationTimestamp
     */
    @JsonProperty("creationTimestamp")
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * 
     * 
     * @param creationTimestamp
     *     The creationTimestamp
     */
    @JsonProperty("creationTimestamp")
    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * 
     * 
     * @return
     *     The deletionGracePeriodSeconds
     */
    @JsonProperty("deletionGracePeriodSeconds")
    public Long getDeletionGracePeriodSeconds() {
        return deletionGracePeriodSeconds;
    }

    /**
     * 
     * 
     * @param deletionGracePeriodSeconds
     *     The deletionGracePeriodSeconds
     */
    @JsonProperty("deletionGracePeriodSeconds")
    public void setDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The deletionTimestamp
     */
    @JsonProperty("deletionTimestamp")
    public String getDeletionTimestamp() {
        return deletionTimestamp;
    }

    /**
     * 
     * 
     * @param deletionTimestamp
     *     The deletionTimestamp
     */
    @JsonProperty("deletionTimestamp")
    public void setDeletionTimestamp(String deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
    }

    /**
     * 
     * 
     * @return
     *     The finalizers
     */
    @JsonProperty("finalizers")
    public List<java.lang.String> getFinalizers() {
        return finalizers;
    }

    /**
     * 
     * 
     * @param finalizers
     *     The finalizers
     */
    @JsonProperty("finalizers")
    public void setFinalizers(List<java.lang.String> finalizers) {
        this.finalizers = finalizers;
    }

    /**
     * 
     * 
     * @return
     *     The generateName
     */
    @JsonProperty("generateName")
    public java.lang.String getGenerateName() {
        return generateName;
    }

    /**
     * 
     * 
     * @param generateName
     *     The generateName
     */
    @JsonProperty("generateName")
    public void setGenerateName(java.lang.String generateName) {
        this.generateName = generateName;
    }

    /**
     * 
     * 
     * @return
     *     The generation
     */
    @JsonProperty("generation")
    public Long getGeneration() {
        return generation;
    }

    /**
     * 
     * 
     * @param generation
     *     The generation
     */
    @JsonProperty("generation")
    public void setGeneration(Long generation) {
        this.generation = generation;
    }

    /**
     * 
     * 
     * @return
     *     The initializers
     */
    @JsonProperty("initializers")
    public Initializers getInitializers() {
        return initializers;
    }

    /**
     * 
     * 
     * @param initializers
     *     The initializers
     */
    @JsonProperty("initializers")
    public void setInitializers(Initializers initializers) {
        this.initializers = initializers;
    }

    /**
     * 
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    /**
     * 
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * 
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * 
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 
     * 
     * @return
     *     The namespace
     */
    @JsonProperty("namespace")
    public java.lang.String getNamespace() {
        return namespace;
    }

    /**
     * 
     * 
     * @param namespace
     *     The namespace
     */
    @JsonProperty("namespace")
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }

    /**
     * 
     * 
     * @return
     *     The ownerReferences
     */
    @JsonProperty("ownerReferences")
    public List<OwnerReference> getOwnerReferences() {
        return ownerReferences;
    }

    /**
     * 
     * 
     * @param ownerReferences
     *     The ownerReferences
     */
    @JsonProperty("ownerReferences")
    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
        this.ownerReferences = ownerReferences;
    }

    /**
     * 
     * 
     * @return
     *     The resourceVersion
     */
    @JsonProperty("resourceVersion")
    public java.lang.String getResourceVersion() {
        return resourceVersion;
    }

    /**
     * 
     * 
     * @param resourceVersion
     *     The resourceVersion
     */
    @JsonProperty("resourceVersion")
    public void setResourceVersion(java.lang.String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    /**
     * 
     * 
     * @return
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public java.lang.String getSelfLink() {
        return selfLink;
    }

    /**
     * 
     * 
     * @param selfLink
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public void setSelfLink(java.lang.String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * 
     * 
     * @return
     *     The uid
     */
    @JsonProperty("uid")
    public java.lang.String getUid() {
        return uid;
    }

    /**
     * 
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(java.lang.String uid) {
        this.uid = uid;
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
