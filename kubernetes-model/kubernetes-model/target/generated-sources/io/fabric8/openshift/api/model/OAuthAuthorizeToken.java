
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
    "clientName",
    "codeChallenge",
    "codeChallengeMethod",
    "expiresIn",
    "redirectURI",
    "scopes",
    "state",
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
public class OAuthAuthorizeToken implements HasMetadata
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
    @JsonProperty("clientName")
    private String clientName;
    /**
     * 
     * 
     */
    @JsonProperty("codeChallenge")
    private String codeChallenge;
    /**
     * 
     * 
     */
    @JsonProperty("codeChallengeMethod")
    private String codeChallengeMethod;
    /**
     * 
     * 
     */
    @JsonProperty("expiresIn")
    private Long expiresIn;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "OAuthAuthorizeToken";
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
    @JsonProperty("scopes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> scopes = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("state")
    private String state;
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
    public OAuthAuthorizeToken() {
    }

    /**
     * 
     * @param expiresIn
     * @param redirectURI
     * @param metadata
     * @param apiVersion
     * @param clientName
     * @param kind
     * @param codeChallenge
     * @param codeChallengeMethod
     * @param scopes
     * @param state
     * @param userName
     * @param userUID
     */
    public OAuthAuthorizeToken(String apiVersion, String clientName, String codeChallenge, String codeChallengeMethod, Long expiresIn, String kind, ObjectMeta metadata, String redirectURI, List<String> scopes, String state, String userName, String userUID) {
        this.apiVersion = apiVersion;
        this.clientName = clientName;
        this.codeChallenge = codeChallenge;
        this.codeChallengeMethod = codeChallengeMethod;
        this.expiresIn = expiresIn;
        this.kind = kind;
        this.metadata = metadata;
        this.redirectURI = redirectURI;
        this.scopes = scopes;
        this.state = state;
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
     *     The codeChallenge
     */
    @JsonProperty("codeChallenge")
    public String getCodeChallenge() {
        return codeChallenge;
    }

    /**
     * 
     * 
     * @param codeChallenge
     *     The codeChallenge
     */
    @JsonProperty("codeChallenge")
    public void setCodeChallenge(String codeChallenge) {
        this.codeChallenge = codeChallenge;
    }

    /**
     * 
     * 
     * @return
     *     The codeChallengeMethod
     */
    @JsonProperty("codeChallengeMethod")
    public String getCodeChallengeMethod() {
        return codeChallengeMethod;
    }

    /**
     * 
     * 
     * @param codeChallengeMethod
     *     The codeChallengeMethod
     */
    @JsonProperty("codeChallengeMethod")
    public void setCodeChallengeMethod(String codeChallengeMethod) {
        this.codeChallengeMethod = codeChallengeMethod;
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
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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
