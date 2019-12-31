
package io.fabric8.openshift.api.model;

import java.util.HashMap;
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
    "allowEnv",
    "secret",
    "secretReference"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class WebHookTrigger implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("allowEnv")
    private Boolean allowEnv;
    /**
     * 
     * 
     */
    @JsonProperty("secret")
    private String secret;
    /**
     * 
     * 
     */
    @JsonProperty("secretReference")
    @Valid
    private SecretLocalReference secretReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WebHookTrigger() {
    }

    /**
     * 
     * @param allowEnv
     * @param secret
     * @param secretReference
     */
    public WebHookTrigger(Boolean allowEnv, String secret, SecretLocalReference secretReference) {
        this.allowEnv = allowEnv;
        this.secret = secret;
        this.secretReference = secretReference;
    }

    /**
     * 
     * 
     * @return
     *     The allowEnv
     */
    @JsonProperty("allowEnv")
    public Boolean getAllowEnv() {
        return allowEnv;
    }

    /**
     * 
     * 
     * @param allowEnv
     *     The allowEnv
     */
    @JsonProperty("allowEnv")
    public void setAllowEnv(Boolean allowEnv) {
        this.allowEnv = allowEnv;
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

    /**
     * 
     * 
     * @return
     *     The secretReference
     */
    @JsonProperty("secretReference")
    public SecretLocalReference getSecretReference() {
        return secretReference;
    }

    /**
     * 
     * 
     * @param secretReference
     *     The secretReference
     */
    @JsonProperty("secretReference")
    public void setSecretReference(SecretLocalReference secretReference) {
        this.secretReference = secretReference;
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
