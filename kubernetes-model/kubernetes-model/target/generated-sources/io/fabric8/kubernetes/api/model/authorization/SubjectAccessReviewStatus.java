
package io.fabric8.kubernetes.api.model.authorization;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.KubernetesResource;
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
    "denied",
    "evaluationError",
    "reason"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SubjectAccessReviewStatus implements KubernetesResource
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
    @JsonProperty("denied")
    private Boolean denied;
    /**
     * 
     * 
     */
    @JsonProperty("evaluationError")
    private String evaluationError;
    /**
     * 
     * 
     */
    @JsonProperty("reason")
    private String reason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubjectAccessReviewStatus() {
    }

    /**
     * 
     * @param reason
     * @param allowed
     * @param evaluationError
     * @param denied
     */
    public SubjectAccessReviewStatus(Boolean allowed, Boolean denied, String evaluationError, String reason) {
        this.allowed = allowed;
        this.denied = denied;
        this.evaluationError = evaluationError;
        this.reason = reason;
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
     *     The denied
     */
    @JsonProperty("denied")
    public Boolean getDenied() {
        return denied;
    }

    /**
     * 
     * 
     * @param denied
     *     The denied
     */
    @JsonProperty("denied")
    public void setDenied(Boolean denied) {
        this.denied = denied;
    }

    /**
     * 
     * 
     * @return
     *     The evaluationError
     */
    @JsonProperty("evaluationError")
    public String getEvaluationError() {
        return evaluationError;
    }

    /**
     * 
     * 
     * @param evaluationError
     *     The evaluationError
     */
    @JsonProperty("evaluationError")
    public void setEvaluationError(String evaluationError) {
        this.evaluationError = evaluationError;
    }

    /**
     * 
     * 
     * @return
     *     The reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * 
     * 
     * @param reason
     *     The reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
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
