
package io.fabric8.kubernetes.api.model.extensions;

import java.util.HashMap;
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
    "name",
    "rollbackTo",
    "updatedAnnotations"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DeploymentRollback implements KubernetesResource
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private java.lang.String apiVersion = "extensions/v1beta1";
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private java.lang.String kind = "DeploymentRollback";
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
    @JsonProperty("rollbackTo")
    @Valid
    private RollbackConfig rollbackTo;
    /**
     * 
     * 
     */
    @JsonProperty("updatedAnnotations")
    @Valid
    private Map<String, String> updatedAnnotations;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeploymentRollback() {
    }

    /**
     * 
     * @param updatedAnnotations
     * @param apiVersion
     * @param kind
     * @param name
     * @param rollbackTo
     */
    public DeploymentRollback(java.lang.String apiVersion, java.lang.String kind, java.lang.String name, RollbackConfig rollbackTo, Map<String, String> updatedAnnotations) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
        this.rollbackTo = rollbackTo;
        this.updatedAnnotations = updatedAnnotations;
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
     *     The rollbackTo
     */
    @JsonProperty("rollbackTo")
    public RollbackConfig getRollbackTo() {
        return rollbackTo;
    }

    /**
     * 
     * 
     * @param rollbackTo
     *     The rollbackTo
     */
    @JsonProperty("rollbackTo")
    public void setRollbackTo(RollbackConfig rollbackTo) {
        this.rollbackTo = rollbackTo;
    }

    /**
     * 
     * 
     * @return
     *     The updatedAnnotations
     */
    @JsonProperty("updatedAnnotations")
    public Map<String, String> getUpdatedAnnotations() {
        return updatedAnnotations;
    }

    /**
     * 
     * 
     * @param updatedAnnotations
     *     The updatedAnnotations
     */
    @JsonProperty("updatedAnnotations")
    public void setUpdatedAnnotations(Map<String, String> updatedAnnotations) {
        this.updatedAnnotations = updatedAnnotations;
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
