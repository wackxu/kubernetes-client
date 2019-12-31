
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
import io.fabric8.kubernetes.api.model.LocalObjectReference;
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
    "mountPath",
    "secretSource"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SecretSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("mountPath")
    private String mountPath;
    /**
     * 
     * 
     */
    @JsonProperty("secretSource")
    @Valid
    private LocalObjectReference secretSource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecretSpec() {
    }

    /**
     * 
     * @param mountPath
     * @param secretSource
     */
    public SecretSpec(String mountPath, LocalObjectReference secretSource) {
        this.mountPath = mountPath;
        this.secretSource = secretSource;
    }

    /**
     * 
     * 
     * @return
     *     The mountPath
     */
    @JsonProperty("mountPath")
    public String getMountPath() {
        return mountPath;
    }

    /**
     * 
     * 
     * @param mountPath
     *     The mountPath
     */
    @JsonProperty("mountPath")
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * 
     * 
     * @return
     *     The secretSource
     */
    @JsonProperty("secretSource")
    public LocalObjectReference getSecretSource() {
        return secretSource;
    }

    /**
     * 
     * 
     * @param secretSource
     *     The secretSource
     */
    @JsonProperty("secretSource")
    public void setSecretSource(LocalObjectReference secretSource) {
        this.secretSource = secretSource;
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
