
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
    "from",
    "importPolicy",
    "includeManifest",
    "referencePolicy",
    "to"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ImageImportSpec implements KubernetesResource
{

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
    @JsonProperty("importPolicy")
    @Valid
    private TagImportPolicy importPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("includeManifest")
    private Boolean includeManifest;
    /**
     * 
     * 
     */
    @JsonProperty("referencePolicy")
    @Valid
    private TagReferencePolicy referencePolicy;
    /**
     * 
     * 
     */
    @JsonProperty("to")
    @Valid
    private LocalObjectReference to;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageImportSpec() {
    }

    /**
     * 
     * @param importPolicy
     * @param includeManifest
     * @param referencePolicy
     * @param from
     * @param to
     */
    public ImageImportSpec(ObjectReference from, TagImportPolicy importPolicy, Boolean includeManifest, TagReferencePolicy referencePolicy, LocalObjectReference to) {
        this.from = from;
        this.importPolicy = importPolicy;
        this.includeManifest = includeManifest;
        this.referencePolicy = referencePolicy;
        this.to = to;
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
     *     The includeManifest
     */
    @JsonProperty("includeManifest")
    public Boolean getIncludeManifest() {
        return includeManifest;
    }

    /**
     * 
     * 
     * @param includeManifest
     *     The includeManifest
     */
    @JsonProperty("includeManifest")
    public void setIncludeManifest(Boolean includeManifest) {
        this.includeManifest = includeManifest;
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

    /**
     * 
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public LocalObjectReference getTo() {
        return to;
    }

    /**
     * 
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(LocalObjectReference to) {
        this.to = to;
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
