
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
    "authorizeToken",
    "clientName",
    "expiresIn",
    "inactivityTimeoutSeconds",
    "redirectURI",
    "refreshToken",
    "scopes",
    "userName",
    "userUID"
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
public class OAuthAccessToken implements HasMetadata
{

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
    @JsonProperty("authorizeToken")
    private String authorizeToken;
    /**
     * 
     * 
     */
    @JsonProperty("clientName")
    private String clientName;
    /**
     * 
     * 
     */
    @JsonProperty("expiresIn")
    private Long expiresIn;
    /**
     * 
     * 
     */
    @JsonProperty("inactivityTimeoutSeconds")
    private Integer inactivityTimeoutSeconds;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "OAuthAccessToken";
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
    @JsonProperty("redirectURI")
    private String redirectURI;
    /**
     * 
     * 
     */
    @JsonProperty("refreshToken")
    private String refreshToken;
    /**
     * 
     * 
     */
    @JsonProperty("scopes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> scopes = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("userName")
    private String userName;
    /**
     * 
     * 
     */
    @JsonProperty("userUID")
    private String userUID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OAuthAccessToken() {
    }

    /**
     * 
     * @param expiresIn
     * @param redirectURI
     * @param metadata
     * @param apiVersion
     * @param authorizeToken
     * @param clientName
     * @param inactivityTimeoutSeconds
     * @param kind
     * @param scopes
     * @param userName
     * @param refreshToken
     * @param userUID
     */
    public OAuthAccessToken(String apiVersion, String authorizeToken, String clientName, Long expiresIn, Integer inactivityTimeoutSeconds, String kind, ObjectMeta metadata, String redirectURI, String refreshToken, List<String> scopes, String userName, String userUID) {
        this.apiVersion = apiVersion;
        this.authorizeToken = authorizeToken;
        this.clientName = clientName;
        this.expiresIn = expiresIn;
        this.inactivityTimeoutSeconds = inactivityTimeoutSeconds;
        this.kind = kind;
        this.metadata = metadata;
        this.redirectURI = redirectURI;
        this.refreshToken = refreshToken;
        this.scopes = scopes;
        this.userName = userName;
        this.userUID = userUID;
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
     *     The authorizeToken
     */
    @JsonProperty("authorizeToken")
    public String getAuthorizeToken() {
        return authorizeToken;
    }

    /**
     * 
     * 
     * @param authorizeToken
     *     The authorizeToken
     */
    @JsonProperty("authorizeToken")
    public void setAuthorizeToken(String authorizeToken) {
        this.authorizeToken = authorizeToken;
    }

    /**
     * 
     * 
     * @return
     *     The clientName
     */
    @JsonProperty("clientName")
    public String getClientName() {
        return clientName;
    }

    /**
     * 
     * 
     * @param clientName
     *     The clientName
     */
    @JsonProperty("clientName")
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * 
     * 
     * @return
     *     The expiresIn
     */
    @JsonProperty("expiresIn")
    public Long getExpiresIn() {
        return expiresIn;
    }

    /**
     * 
     * 
     * @param expiresIn
     *     The expiresIn
     */
    @JsonProperty("expiresIn")
    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * 
     * 
     * @return
     *     The inactivityTimeoutSeconds
     */
    @JsonProperty("inactivityTimeoutSeconds")
    public Integer getInactivityTimeoutSeconds() {
        return inactivityTimeoutSeconds;
    }

    /**
     * 
     * 
     * @param inactivityTimeoutSeconds
     *     The inactivityTimeoutSeconds
     */
    @JsonProperty("inactivityTimeoutSeconds")
    public void setInactivityTimeoutSeconds(Integer inactivityTimeoutSeconds) {
        this.inactivityTimeoutSeconds = inactivityTimeoutSeconds;
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
     *     The redirectURI
     */
    @JsonProperty("redirectURI")
    public String getRedirectURI() {
        return redirectURI;
    }

    /**
     * 
     * 
     * @param redirectURI
     *     The redirectURI
     */
    @JsonProperty("redirectURI")
    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }

    /**
     * 
     * 
     * @return
     *     The refreshToken
     */
    @JsonProperty("refreshToken")
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 
     * 
     * @param refreshToken
     *     The refreshToken
     */
    @JsonProperty("refreshToken")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 
     * 
     * @return
     *     The scopes
     */
    @JsonProperty("scopes")
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * 
     * 
     * @param scopes
     *     The scopes
     */
    @JsonProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * 
     * 
     * @return
     *     The userName
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * 
     * @param userName
     *     The userName
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     * 
     * @return
     *     The userUID
     */
    @JsonProperty("userUID")
    public String getUserUID() {
        return userUID;
    }

    /**
     * 
     * 
     * @param userUID
     *     The userUID
     */
    @JsonProperty("userUID")
    public void setUserUID(String userUID) {
        this.userUID = userUID;
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
