
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
    "conditions",
    "content",
    "created",
    "imageIdentity",
    "issuedBy",
    "issuedTo",
    "signedClaims",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ImageSignature implements HasMetadata
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private java.lang.String apiVersion = "image.openshift.io/v1";
    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<SignatureCondition> conditions = new ArrayList<SignatureCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("content")
    private java.lang.String content;
    /**
     * 
     * 
     */
    @JsonProperty("created")
    @Valid
    private String created;
    /**
     * 
     * 
     */
    @JsonProperty("imageIdentity")
    private java.lang.String imageIdentity;
    /**
     * 
     * 
     */
    @JsonProperty("issuedBy")
    @Valid
    private SignatureIssuer issuedBy;
    /**
     * 
     * 
     */
    @JsonProperty("issuedTo")
    @Valid
    private SignatureSubject issuedTo;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private java.lang.String kind = "ImageSignature";
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
    @JsonProperty("signedClaims")
    @Valid
    private Map<String, String> signedClaims;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private java.lang.String type;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageSignature() {
    }

    /**
     * 
     * @param metadata
     * @param apiVersion
     * @param issuedTo
     * @param created
     * @param kind
     * @param issuedBy
     * @param signedClaims
     * @param conditions
     * @param type
     * @param content
     * @param imageIdentity
     */
    public ImageSignature(java.lang.String apiVersion, List<SignatureCondition> conditions, java.lang.String content, String created, java.lang.String imageIdentity, SignatureIssuer issuedBy, SignatureSubject issuedTo, java.lang.String kind, ObjectMeta metadata, Map<String, String> signedClaims, java.lang.String type) {
        this.apiVersion = apiVersion;
        this.conditions = conditions;
        this.content = content;
        this.created = created;
        this.imageIdentity = imageIdentity;
        this.issuedBy = issuedBy;
        this.issuedTo = issuedTo;
        this.kind = kind;
        this.metadata = metadata;
        this.signedClaims = signedClaims;
        this.type = type;
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
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<SignatureCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<SignatureCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The content
     */
    @JsonProperty("content")
    public java.lang.String getContent() {
        return content;
    }

    /**
     * 
     * 
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    /**
     * 
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * 
     * @return
     *     The imageIdentity
     */
    @JsonProperty("imageIdentity")
    public java.lang.String getImageIdentity() {
        return imageIdentity;
    }

    /**
     * 
     * 
     * @param imageIdentity
     *     The imageIdentity
     */
    @JsonProperty("imageIdentity")
    public void setImageIdentity(java.lang.String imageIdentity) {
        this.imageIdentity = imageIdentity;
    }

    /**
     * 
     * 
     * @return
     *     The issuedBy
     */
    @JsonProperty("issuedBy")
    public SignatureIssuer getIssuedBy() {
        return issuedBy;
    }

    /**
     * 
     * 
     * @param issuedBy
     *     The issuedBy
     */
    @JsonProperty("issuedBy")
    public void setIssuedBy(SignatureIssuer issuedBy) {
        this.issuedBy = issuedBy;
    }

    /**
     * 
     * 
     * @return
     *     The issuedTo
     */
    @JsonProperty("issuedTo")
    public SignatureSubject getIssuedTo() {
        return issuedTo;
    }

    /**
     * 
     * 
     * @param issuedTo
     *     The issuedTo
     */
    @JsonProperty("issuedTo")
    public void setIssuedTo(SignatureSubject issuedTo) {
        this.issuedTo = issuedTo;
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
     *     The signedClaims
     */
    @JsonProperty("signedClaims")
    public Map<String, String> getSignedClaims() {
        return signedClaims;
    }

    /**
     * 
     * 
     * @param signedClaims
     *     The signedClaims
     */
    @JsonProperty("signedClaims")
    public void setSignedClaims(Map<String, String> signedClaims) {
        this.signedClaims = signedClaims;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
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
