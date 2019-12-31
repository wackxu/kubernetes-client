
package io.fabric8.openshift.api.model;

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
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
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
    "extra",
    "providerName",
    "providerUserName",
    "user"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
@ApiVersion("v1")
@ApiGroup("user.openshift.io")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "openshift.properties", gather = true)
})
public class Identity implements HasMetadata
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private java.lang.String apiVersion = "user.openshift.io/v1";
    /**
     * 
     * 
     */
    @JsonProperty("extra")
    @Valid
    private Map<String, String> extra;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private java.lang.String kind = "Identity";
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
    @JsonProperty("providerName")
    private java.lang.String providerName;
    /**
     * 
     * 
     */
    @JsonProperty("providerUserName")
    private java.lang.String providerUserName;
    /**
     * 
     * 
     */
    @JsonProperty("user")
    @Valid
    private ObjectReference user;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Identity() {
    }

    /**
     * 
     * @param metadata
     * @param apiVersion
     * @param kind
     * @param extra
     * @param providerUserName
     * @param user
     * @param providerName
     */
    public Identity(java.lang.String apiVersion, Map<String, String> extra, java.lang.String kind, ObjectMeta metadata, java.lang.String providerName, java.lang.String providerUserName, ObjectReference user) {
        this.apiVersion = apiVersion;
        this.extra = extra;
        this.kind = kind;
        this.metadata = metadata;
        this.providerName = providerName;
        this.providerUserName = providerUserName;
        this.user = user;
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
     *     The extra
     */
    @JsonProperty("extra")
    public Map<String, String> getExtra() {
        return extra;
    }

    /**
     * 
     * 
     * @param extra
     *     The extra
     */
    @JsonProperty("extra")
    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
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
     *     The providerName
     */
    @JsonProperty("providerName")
    public java.lang.String getProviderName() {
        return providerName;
    }

    /**
     * 
     * 
     * @param providerName
     *     The providerName
     */
    @JsonProperty("providerName")
    public void setProviderName(java.lang.String providerName) {
        this.providerName = providerName;
    }

    /**
     * 
     * 
     * @return
     *     The providerUserName
     */
    @JsonProperty("providerUserName")
    public java.lang.String getProviderUserName() {
        return providerUserName;
    }

    /**
     * 
     * 
     * @param providerUserName
     *     The providerUserName
     */
    @JsonProperty("providerUserName")
    public void setProviderUserName(java.lang.String providerUserName) {
        this.providerUserName = providerUserName;
    }

    /**
     * 
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public ObjectReference getUser() {
        return user;
    }

    /**
     * 
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(ObjectReference user) {
        this.user = user;
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
