
package io.fabric8.kubernetes.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "as",
    "as-groups",
    "as-user-extra",
    "auth-provider",
    "client-certificate",
    "client-certificate-data",
    "client-key",
    "client-key-data",
    "exec",
    "extensions",
    "password",
    "token",
    "tokenFile",
    "username"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class AuthInfo implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("as")
    private java.lang.String as;
    /**
     * 
     * 
     */
    @JsonProperty("as-groups")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> asGroups = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("as-user-extra")
    @Valid
    private Map<String, ArrayList<String>> asUserExtra;
    /**
     * 
     * 
     */
    @JsonProperty("auth-provider")
    @Valid
    private AuthProviderConfig authProvider;
    /**
     * 
     * 
     */
    @JsonProperty("client-certificate")
    private java.lang.String clientCertificate;
    /**
     * 
     * 
     */
    @JsonProperty("client-certificate-data")
    private java.lang.String clientCertificateData;
    /**
     * 
     * 
     */
    @JsonProperty("client-key")
    private java.lang.String clientKey;
    /**
     * 
     * 
     */
    @JsonProperty("client-key-data")
    private java.lang.String clientKeyData;
    /**
     * 
     * 
     */
    @JsonProperty("exec")
    @Valid
    private ExecConfig exec;
    /**
     * 
     * 
     */
    @JsonProperty("extensions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NamedExtension> extensions = new ArrayList<NamedExtension>();
    /**
     * 
     * 
     */
    @JsonProperty("password")
    private java.lang.String password;
    /**
     * 
     * 
     */
    @JsonProperty("token")
    private java.lang.String token;
    /**
     * 
     * 
     */
    @JsonProperty("tokenFile")
    private java.lang.String tokenFile;
    /**
     * 
     * 
     */
    @JsonProperty("username")
    private java.lang.String username;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AuthInfo() {
    }

    /**
     * 
     * @param clientCertificate
     * @param asGroups
     * @param token
     * @param authProvider
     * @param as
     * @param extensions
     * @param password
     * @param clientKeyData
     * @param clientKey
     * @param asUserExtra
     * @param clientCertificateData
     * @param tokenFile
     * @param exec
     * @param username
     */
    public AuthInfo(java.lang.String as, List<java.lang.String> asGroups, Map<String, ArrayList<String>> asUserExtra, AuthProviderConfig authProvider, java.lang.String clientCertificate, java.lang.String clientCertificateData, java.lang.String clientKey, java.lang.String clientKeyData, ExecConfig exec, List<NamedExtension> extensions, java.lang.String password, java.lang.String token, java.lang.String tokenFile, java.lang.String username) {
        this.as = as;
        this.asGroups = asGroups;
        this.asUserExtra = asUserExtra;
        this.authProvider = authProvider;
        this.clientCertificate = clientCertificate;
        this.clientCertificateData = clientCertificateData;
        this.clientKey = clientKey;
        this.clientKeyData = clientKeyData;
        this.exec = exec;
        this.extensions = extensions;
        this.password = password;
        this.token = token;
        this.tokenFile = tokenFile;
        this.username = username;
    }

    /**
     * 
     * 
     * @return
     *     The as
     */
    @JsonProperty("as")
    public java.lang.String getAs() {
        return as;
    }

    /**
     * 
     * 
     * @param as
     *     The as
     */
    @JsonProperty("as")
    public void setAs(java.lang.String as) {
        this.as = as;
    }

    /**
     * 
     * 
     * @return
     *     The asGroups
     */
    @JsonProperty("as-groups")
    public List<java.lang.String> getAsGroups() {
        return asGroups;
    }

    /**
     * 
     * 
     * @param asGroups
     *     The as-groups
     */
    @JsonProperty("as-groups")
    public void setAsGroups(List<java.lang.String> asGroups) {
        this.asGroups = asGroups;
    }

    /**
     * 
     * 
     * @return
     *     The asUserExtra
     */
    @JsonProperty("as-user-extra")
    public Map<String, ArrayList<String>> getAsUserExtra() {
        return asUserExtra;
    }

    /**
     * 
     * 
     * @param asUserExtra
     *     The as-user-extra
     */
    @JsonProperty("as-user-extra")
    public void setAsUserExtra(Map<String, ArrayList<String>> asUserExtra) {
        this.asUserExtra = asUserExtra;
    }

    /**
     * 
     * 
     * @return
     *     The authProvider
     */
    @JsonProperty("auth-provider")
    public AuthProviderConfig getAuthProvider() {
        return authProvider;
    }

    /**
     * 
     * 
     * @param authProvider
     *     The auth-provider
     */
    @JsonProperty("auth-provider")
    public void setAuthProvider(AuthProviderConfig authProvider) {
        this.authProvider = authProvider;
    }

    /**
     * 
     * 
     * @return
     *     The clientCertificate
     */
    @JsonProperty("client-certificate")
    public java.lang.String getClientCertificate() {
        return clientCertificate;
    }

    /**
     * 
     * 
     * @param clientCertificate
     *     The client-certificate
     */
    @JsonProperty("client-certificate")
    public void setClientCertificate(java.lang.String clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    /**
     * 
     * 
     * @return
     *     The clientCertificateData
     */
    @JsonProperty("client-certificate-data")
    public java.lang.String getClientCertificateData() {
        return clientCertificateData;
    }

    /**
     * 
     * 
     * @param clientCertificateData
     *     The client-certificate-data
     */
    @JsonProperty("client-certificate-data")
    public void setClientCertificateData(java.lang.String clientCertificateData) {
        this.clientCertificateData = clientCertificateData;
    }

    /**
     * 
     * 
     * @return
     *     The clientKey
     */
    @JsonProperty("client-key")
    public java.lang.String getClientKey() {
        return clientKey;
    }

    /**
     * 
     * 
     * @param clientKey
     *     The client-key
     */
    @JsonProperty("client-key")
    public void setClientKey(java.lang.String clientKey) {
        this.clientKey = clientKey;
    }

    /**
     * 
     * 
     * @return
     *     The clientKeyData
     */
    @JsonProperty("client-key-data")
    public java.lang.String getClientKeyData() {
        return clientKeyData;
    }

    /**
     * 
     * 
     * @param clientKeyData
     *     The client-key-data
     */
    @JsonProperty("client-key-data")
    public void setClientKeyData(java.lang.String clientKeyData) {
        this.clientKeyData = clientKeyData;
    }

    /**
     * 
     * 
     * @return
     *     The exec
     */
    @JsonProperty("exec")
    public ExecConfig getExec() {
        return exec;
    }

    /**
     * 
     * 
     * @param exec
     *     The exec
     */
    @JsonProperty("exec")
    public void setExec(ExecConfig exec) {
        this.exec = exec;
    }

    /**
     * 
     * 
     * @return
     *     The extensions
     */
    @JsonProperty("extensions")
    public List<NamedExtension> getExtensions() {
        return extensions;
    }

    /**
     * 
     * 
     * @param extensions
     *     The extensions
     */
    @JsonProperty("extensions")
    public void setExtensions(List<NamedExtension> extensions) {
        this.extensions = extensions;
    }

    /**
     * 
     * 
     * @return
     *     The password
     */
    @JsonProperty("password")
    public java.lang.String getPassword() {
        return password;
    }

    /**
     * 
     * 
     * @param password
     *     The password
     */
    @JsonProperty("password")
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * 
     * 
     * @return
     *     The token
     */
    @JsonProperty("token")
    public java.lang.String getToken() {
        return token;
    }

    /**
     * 
     * 
     * @param token
     *     The token
     */
    @JsonProperty("token")
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    /**
     * 
     * 
     * @return
     *     The tokenFile
     */
    @JsonProperty("tokenFile")
    public java.lang.String getTokenFile() {
        return tokenFile;
    }

    /**
     * 
     * 
     * @param tokenFile
     *     The tokenFile
     */
    @JsonProperty("tokenFile")
    public void setTokenFile(java.lang.String tokenFile) {
        this.tokenFile = tokenFile;
    }

    /**
     * 
     * 
     * @return
     *     The username
     */
    @JsonProperty("username")
    public java.lang.String getUsername() {
        return username;
    }

    /**
     * 
     * 
     * @param username
     *     The username
     */
    @JsonProperty("username")
    public void setUsername(java.lang.String username) {
        this.username = username;
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
