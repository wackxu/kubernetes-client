
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
    "annotations",
    "from",
    "generation",
    "importPolicy",
    "name",
    "reference",
    "referencePolicy"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class TagReference implements KubernetesResource
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
    @JsonProperty("from")
    @Valid
    private ObjectReference from;
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
    @JsonProperty("importPolicy")
    @Valid
    private TagImportPolicy importPolicy;
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
    @JsonProperty("reference")
    private Boolean reference;
    /**
     * 
     * 
     */
    @JsonProperty("referencePolicy")
    @Valid
    private TagReferencePolicy referencePolicy;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TagReference() {
    }

    /**
     * 
     * @param generation
     * @param reference
     * @param importPolicy
     * @param name
     * @param referencePolicy
     * @param annotations
     * @param from
     */
    public TagReference(Map<String, String> annotations, ObjectReference from, Long generation, TagImportPolicy importPolicy, java.lang.String name, Boolean reference, TagReferencePolicy referencePolicy) {
        this.annotations = annotations;
        this.from = from;
        this.generation = generation;
        this.importPolicy = importPolicy;
        this.name = name;
        this.reference = reference;
        this.referencePolicy = referencePolicy;
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
     *     The importPolicy
     */
    @JsonProperty("importPolicy")
    public TagImportPolicy getImportPolicy() {
        return importPolicy;
    }

    /**
     * 
     * 
     * @param importPolicy
     *     The importPolicy
     */
    @JsonProperty("importPolicy")
    public void setImportPolicy(TagImportPolicy importPolicy) {
        this.importPolicy = importPolicy;
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
     *     The reference
     */
    @JsonProperty("reference")
    public Boolean getReference() {
        return reference;
    }

    /**
     * 
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(Boolean reference) {
        this.reference = reference;
    }

    /**
     * 
     * 
     * @return
     *     The referencePolicy
     */
    @JsonProperty("referencePolicy")
    public TagReferencePolicy getReferencePolicy() {
        return referencePolicy;
    }

    /**
     * 
     * 
     * @param referencePolicy
     *     The referencePolicy
     */
    @JsonProperty("referencePolicy")
    public void setReferencePolicy(TagReferencePolicy referencePolicy) {
        this.referencePolicy = referencePolicy;
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
