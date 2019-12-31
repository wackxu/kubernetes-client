
package io.fabric8.kubernetes.api.model;

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
    "configMapRef",
    "prefix",
    "secretRef"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class EnvFromSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("configMapRef")
    @Valid
    private ConfigMapEnvSource configMapRef;
    /**
     * 
     * 
     */
    @JsonProperty("prefix")
    private String prefix;
    /**
     * 
     * 
     */
    @JsonProperty("secretRef")
    @Valid
    private SecretEnvSource secretRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvFromSource() {
    }

    /**
     * 
     * @param configMapRef
     * @param prefix
     * @param secretRef
     */
    public EnvFromSource(ConfigMapEnvSource configMapRef, String prefix, SecretEnvSource secretRef) {
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    /**
     * 
     * 
     * @return
     *     The configMapRef
     */
    @JsonProperty("configMapRef")
    public ConfigMapEnvSource getConfigMapRef() {
        return configMapRef;
    }

    /**
     * 
     * 
     * @param configMapRef
     *     The configMapRef
     */
    @JsonProperty("configMapRef")
    public void setConfigMapRef(ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
    }

    /**
     * 
     * 
     * @return
     *     The prefix
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * 
     * 
     * @param prefix
     *     The prefix
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * 
     * 
     * @return
     *     The secretRef
     */
    @JsonProperty("secretRef")
    public SecretEnvSource getSecretRef() {
        return secretRef;
    }

    /**
     * 
     * 
     * @param secretRef
     *     The secretRef
     */
    @JsonProperty("secretRef")
    public void setSecretRef(SecretEnvSource secretRef) {
        this.secretRef = secretRef;
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
