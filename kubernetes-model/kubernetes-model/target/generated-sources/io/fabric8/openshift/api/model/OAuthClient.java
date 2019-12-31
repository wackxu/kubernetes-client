
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
    "accessTokenInactivityTimeoutSeconds",
    "accessTokenMaxAgeSeconds",
    "additionalSecrets",
    "grantMethod",
    "redirectURIs",
    "respondWithChallenges",
    "scopeRestrictions",
    "secret"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
@ApiVersion("v1")
@ApiGroup("oauth.openshift.io")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "openshift.properties", gather = true)
})
public class OAuthClient implements HasMetadata
{

    /**
     * 
     * 
     */
    @JsonProperty("accessTokenInactivityTimeoutSeconds")
    private Integer accessTokenInactivityTimeoutSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("accessTokenMaxAgeSeconds")
    private Integer accessTokenMaxAgeSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("additionalSecrets")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> additionalSecrets = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private String apiVersion = "oauth.openshift.io/v1";
    /**
     * 
     * 
     */
    @JsonProperty("grantMethod")
    private String grantMethod;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "OAuthClient";
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
    @JsonProperty("redirectURIs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> redirectURIs = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("respondWithChallenges")
    private Boolean respondWithChallenges;
    /**
     * 
     * 
     */
    @JsonProperty("scopeRestrictions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ScopeRestriction> scopeRestrictions = new ArrayList<ScopeRestriction>();
    /**
     * 
     * 
     */
    @JsonProperty("secret")
    private String secret;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OAuthClient() {
    }

    /**
     * 
     * @param additionalSecrets
     * @param metadata
     * @param respondWithChallenges
     * @param apiVersion
     * @param scopeRestrictions
     * @param kind
     * @param accessTokenInactivityTimeoutSeconds
     * @param grantMethod
     * @param accessTokenMaxAgeSeconds
     * @param secret
     * @param redirectURIs
     */
    public OAuthClient(Integer accessTokenInactivityTimeoutSeconds, Integer accessTokenMaxAgeSeconds, List<String> additionalSecrets, String apiVersion, String grantMethod, String kind, ObjectMeta metadata, List<String> redirectURIs, Boolean respondWithChallenges, List<ScopeRestriction> scopeRestrictions, String secret) {
        this.accessTokenInactivityTimeoutSeconds = accessTokenInactivityTimeoutSeconds;
        this.accessTokenMaxAgeSeconds = accessTokenMaxAgeSeconds;
        this.additionalSecrets = additionalSecrets;
        this.apiVersion = apiVersion;
        this.grantMethod = grantMethod;
        this.kind = kind;
        this.metadata = metadata;
        this.redirectURIs = redirectURIs;
        this.respondWithChallenges = respondWithChallenges;
        this.scopeRestrictions = scopeRestrictions;
        this.secret = secret;
    }

    /**
     * 
     * 
     * @return
     *     The accessTokenInactivityTimeoutSeconds
     */
    @JsonProperty("accessTokenInactivityTimeoutSeconds")
    public Integer getAccessTokenInactivityTimeoutSeconds() {
        return accessTokenInactivityTimeoutSeconds;
    }

    /**
     * 
     * 
     * @param accessTokenInactivityTimeoutSeconds
     *     The accessTokenInactivityTimeoutSeconds
     */
    @JsonProperty("accessTokenInactivityTimeoutSeconds")
    public void setAccessTokenInactivityTimeoutSeconds(Integer accessTokenInactivityTimeoutSeconds) {
        this.accessTokenInactivityTimeoutSeconds = accessTokenInactivityTimeoutSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The accessTokenMaxAgeSeconds
     */
    @JsonProperty("accessTokenMaxAgeSeconds")
    public Integer getAccessTokenMaxAgeSeconds() {
        return accessTokenMaxAgeSeconds;
    }

    /**
     * 
     * 
     * @param accessTokenMaxAgeSeconds
     *     The accessTokenMaxAgeSeconds
     */
    @JsonProperty("accessTokenMaxAgeSeconds")
    public void setAccessTokenMaxAgeSeconds(Integer accessTokenMaxAgeSeconds) {
        this.accessTokenMaxAgeSeconds = accessTokenMaxAgeSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The additionalSecrets
     */
    @JsonProperty("additionalSecrets")
    public List<String> getAdditionalSecrets() {
        return additionalSecrets;
    }

    /**
     * 
     * 
     * @param additionalSecrets
     *     The additionalSecrets
     */
    @JsonProperty("additionalSecrets")
    public void setAdditionalSecrets(List<String> additionalSecrets) {
        this.additionalSecrets = additionalSecrets;
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
     *     The grantMethod
     */
    @JsonProperty("grantMethod")
    public String getGrantMethod() {
        return grantMethod;
    }

    /**
     * 
     * 
     * @param grantMethod
     *     The grantMethod
     */
    @JsonProperty("grantMethod")
    public void setGrantMethod(String grantMethod) {
        this.grantMethod = grantMethod;
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
     *     The redirectURIs
     */
    @JsonProperty("redirectURIs")
    public List<String> getRedirectURIs() {
        return redirectURIs;
    }

    /**
     * 
     * 
     * @param redirectURIs
     *     The redirectURIs
     */
    @JsonProperty("redirectURIs")
    public void setRedirectURIs(List<String> redirectURIs) {
        this.redirectURIs = redirectURIs;
    }

    /**
     * 
     * 
     * @return
     *     The respondWithChallenges
     */
    @JsonProperty("respondWithChallenges")
    public Boolean getRespondWithChallenges() {
        return respondWithChallenges;
    }

    /**
     * 
     * 
     * @param respondWithChallenges
     *     The respondWithChallenges
     */
    @JsonProperty("respondWithChallenges")
    public void setRespondWithChallenges(Boolean respondWithChallenges) {
        this.respondWithChallenges = respondWithChallenges;
    }

    /**
     * 
     * 
     * @return
     *     The scopeRestrictions
     */
    @JsonProperty("scopeRestrictions")
    public List<ScopeRestriction> getScopeRestrictions() {
        return scopeRestrictions;
    }

    /**
     * 
     * 
     * @param scopeRestrictions
     *     The scopeRestrictions
     */
    @JsonProperty("scopeRestrictions")
    public void setScopeRestrictions(List<ScopeRestriction> scopeRestrictions) {
        this.scopeRestrictions = scopeRestrictions;
    }

    /**
     * 
     * 
     * @return
     *     The secret
     */
    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    /**
     * 
     * 
     * @param secret
     *     The secret
     */
    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
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
