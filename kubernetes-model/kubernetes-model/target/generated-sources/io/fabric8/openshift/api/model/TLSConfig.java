
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
    "caCertificate",
    "certificate",
    "destinationCACertificate",
    "insecureEdgeTerminationPolicy",
    "key",
    "termination"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class TLSConfig implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("caCertificate")
    private String caCertificate;
    /**
     * 
     * 
     */
    @JsonProperty("certificate")
    private String certificate;
    /**
     * 
     * 
     */
    @JsonProperty("destinationCACertificate")
    private String destinationCACertificate;
    /**
     * 
     * 
     */
    @JsonProperty("insecureEdgeTerminationPolicy")
    private String insecureEdgeTerminationPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("key")
    private String key;
    /**
     * 
     * 
     */
    @JsonProperty("termination")
    private String termination;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TLSConfig() {
    }

    /**
     * 
     * @param termination
     * @param insecureEdgeTerminationPolicy
     * @param certificate
     * @param destinationCACertificate
     * @param caCertificate
     * @param key
     */
    public TLSConfig(String caCertificate, String certificate, String destinationCACertificate, String insecureEdgeTerminationPolicy, String key, String termination) {
        this.caCertificate = caCertificate;
        this.certificate = certificate;
        this.destinationCACertificate = destinationCACertificate;
        this.insecureEdgeTerminationPolicy = insecureEdgeTerminationPolicy;
        this.key = key;
        this.termination = termination;
    }

    /**
     * 
     * 
     * @return
     *     The caCertificate
     */
    @JsonProperty("caCertificate")
    public String getCaCertificate() {
        return caCertificate;
    }

    /**
     * 
     * 
     * @param caCertificate
     *     The caCertificate
     */
    @JsonProperty("caCertificate")
    public void setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
    }

    /**
     * 
     * 
     * @return
     *     The certificate
     */
    @JsonProperty("certificate")
    public String getCertificate() {
        return certificate;
    }

    /**
     * 
     * 
     * @param certificate
     *     The certificate
     */
    @JsonProperty("certificate")
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * 
     * 
     * @return
     *     The destinationCACertificate
     */
    @JsonProperty("destinationCACertificate")
    public String getDestinationCACertificate() {
        return destinationCACertificate;
    }

    /**
     * 
     * 
     * @param destinationCACertificate
     *     The destinationCACertificate
     */
    @JsonProperty("destinationCACertificate")
    public void setDestinationCACertificate(String destinationCACertificate) {
        this.destinationCACertificate = destinationCACertificate;
    }

    /**
     * 
     * 
     * @return
     *     The insecureEdgeTerminationPolicy
     */
    @JsonProperty("insecureEdgeTerminationPolicy")
    public String getInsecureEdgeTerminationPolicy() {
        return insecureEdgeTerminationPolicy;
    }

    /**
     * 
     * 
     * @param insecureEdgeTerminationPolicy
     *     The insecureEdgeTerminationPolicy
     */
    @JsonProperty("insecureEdgeTerminationPolicy")
    public void setInsecureEdgeTerminationPolicy(String insecureEdgeTerminationPolicy) {
        this.insecureEdgeTerminationPolicy = insecureEdgeTerminationPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * 
     * @param key
     *     The key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     * 
     * @return
     *     The termination
     */
    @JsonProperty("termination")
    public String getTermination() {
        return termination;
    }

    /**
     * 
     * 
     * @param termination
     *     The termination
     */
    @JsonProperty("termination")
    public void setTermination(String termination) {
        this.termination = termination;
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
