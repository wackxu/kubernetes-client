
package io.fabric8.kubernetes.api.model.admission;

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
import io.fabric8.kubernetes.api.model.Status;
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
    "allowed",
    "auditAnnotations",
    "patch",
    "patchType",
    "status",
    "uid"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class AdmissionResponse implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("allowed")
    private Boolean allowed;
    /**
     * 
     * 
     */
    @JsonProperty("auditAnnotations")
    @Valid
    private Map<String, String> auditAnnotations;
    /**
     * 
     * 
     */
    @JsonProperty("patch")
    private java.lang.String patch;
    /**
     * 
     * 
     */
    @JsonProperty("patchType")
    private java.lang.String patchType;
    /**
     * 
     * 
     */
    @JsonProperty("status")
    @Valid
    private Status status;
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
    public AdmissionResponse() {
    }

    /**
     * 
     * @param patch
     * @param uid
     * @param patchType
     * @param allowed
     * @param auditAnnotations
     * @param status
     */
    public AdmissionResponse(Boolean allowed, Map<String, String> auditAnnotations, java.lang.String patch, java.lang.String patchType, Status status, java.lang.String uid) {
        this.allowed = allowed;
        this.auditAnnotations = auditAnnotations;
        this.patch = patch;
        this.patchType = patchType;
        this.status = status;
        this.uid = uid;
    }

    /**
     * 
     * 
     * @return
     *     The allowed
     */
    @JsonProperty("allowed")
    public Boolean getAllowed() {
        return allowed;
    }

    /**
     * 
     * 
     * @param allowed
     *     The allowed
     */
    @JsonProperty("allowed")
    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }

    /**
     * 
     * 
     * @return
     *     The auditAnnotations
     */
    @JsonProperty("auditAnnotations")
    public Map<String, String> getAuditAnnotations() {
        return auditAnnotations;
    }

    /**
     * 
     * 
     * @param auditAnnotations
     *     The auditAnnotations
     */
    @JsonProperty("auditAnnotations")
    public void setAuditAnnotations(Map<String, String> auditAnnotations) {
        this.auditAnnotations = auditAnnotations;
    }

    /**
     * 
     * 
     * @return
     *     The patch
     */
    @JsonProperty("patch")
    public java.lang.String getPatch() {
        return patch;
    }

    /**
     * 
     * 
     * @param patch
     *     The patch
     */
    @JsonProperty("patch")
    public void setPatch(java.lang.String patch) {
        this.patch = patch;
    }

    /**
     * 
     * 
     * @return
     *     The patchType
     */
    @JsonProperty("patchType")
    public java.lang.String getPatchType() {
        return patchType;
    }

    /**
     * 
     * 
     * @param patchType
     *     The patchType
     */
    @JsonProperty("patchType")
    public void setPatchType(java.lang.String patchType) {
        this.patchType = patchType;
    }

    /**
     * 
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
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
