
package io.fabric8.openshift.api.model;

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
    "commonName",
    "organization",
    "publicKeyID"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SignatureSubject implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("commonName")
    private String commonName;
    /**
     * 
     * 
     */
    @JsonProperty("organization")
    private String organization;
    /**
     * 
     * 
     */
    @JsonProperty("publicKeyID")
    private String publicKeyID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SignatureSubject() {
    }

    /**
     * 
     * @param commonName
     * @param organization
     * @param publicKeyID
     */
    public SignatureSubject(String commonName, String organization, String publicKeyID) {
        this.commonName = commonName;
        this.organization = organization;
        this.publicKeyID = publicKeyID;
    }

    /**
     * 
     * 
     * @return
     *     The commonName
     */
    @JsonProperty("commonName")
    public String getCommonName() {
        return commonName;
    }

    /**
     * 
     * 
     * @param commonName
     *     The commonName
     */
    @JsonProperty("commonName")
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * 
     * 
     * @return
     *     The organization
     */
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    /**
     * 
     * 
     * @param organization
     *     The organization
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * 
     * 
     * @return
     *     The publicKeyID
     */
    @JsonProperty("publicKeyID")
    public String getPublicKeyID() {
        return publicKeyID;
    }

    /**
     * 
     * 
     * @param publicKeyID
     *     The publicKeyID
     */
    @JsonProperty("publicKeyID")
    public void setPublicKeyID(String publicKeyID) {
        this.publicKeyID = publicKeyID;
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
