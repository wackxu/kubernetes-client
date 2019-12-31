
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
    "certificate-authority",
    "certificate-authority-data",
    "extensions",
    "insecure-skip-tls-verify",
    "server"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Cluster implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("certificate-authority")
    private String certificateAuthority;
    /**
     * 
     * 
     */
    @JsonProperty("certificate-authority-data")
    private String certificateAuthorityData;
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
    @JsonProperty("insecure-skip-tls-verify")
    private Boolean insecureSkipTlsVerify;
    /**
     * 
     * 
     */
    @JsonProperty("server")
    private String server;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cluster() {
    }

    /**
     * 
     * @param server
     * @param extensions
     * @param insecureSkipTlsVerify
     * @param certificateAuthorityData
     * @param certificateAuthority
     */
    public Cluster(String certificateAuthority, String certificateAuthorityData, List<NamedExtension> extensions, Boolean insecureSkipTlsVerify, String server) {
        this.certificateAuthority = certificateAuthority;
        this.certificateAuthorityData = certificateAuthorityData;
        this.extensions = extensions;
        this.insecureSkipTlsVerify = insecureSkipTlsVerify;
        this.server = server;
    }

    /**
     * 
     * 
     * @return
     *     The certificateAuthority
     */
    @JsonProperty("certificate-authority")
    public String getCertificateAuthority() {
        return certificateAuthority;
    }

    /**
     * 
     * 
     * @param certificateAuthority
     *     The certificate-authority
     */
    @JsonProperty("certificate-authority")
    public void setCertificateAuthority(String certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    /**
     * 
     * 
     * @return
     *     The certificateAuthorityData
     */
    @JsonProperty("certificate-authority-data")
    public String getCertificateAuthorityData() {
        return certificateAuthorityData;
    }

    /**
     * 
     * 
     * @param certificateAuthorityData
     *     The certificate-authority-data
     */
    @JsonProperty("certificate-authority-data")
    public void setCertificateAuthorityData(String certificateAuthorityData) {
        this.certificateAuthorityData = certificateAuthorityData;
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
     *     The insecureSkipTlsVerify
     */
    @JsonProperty("insecure-skip-tls-verify")
    public Boolean getInsecureSkipTlsVerify() {
        return insecureSkipTlsVerify;
    }

    /**
     * 
     * 
     * @param insecureSkipTlsVerify
     *     The insecure-skip-tls-verify
     */
    @JsonProperty("insecure-skip-tls-verify")
    public void setInsecureSkipTlsVerify(Boolean insecureSkipTlsVerify) {
        this.insecureSkipTlsVerify = insecureSkipTlsVerify;
    }

    /**
     * 
     * 
     * @return
     *     The server
     */
    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    /**
     * 
     * 
     * @param server
     *     The server
     */
    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
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
