
package io.fabric8.kubernetes.api.model;

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
    "readOnly",
    "secretName",
    "secretNamespace",
    "shareName"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class AzureFilePersistentVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("readOnly")
    private Boolean readOnly;
    /**
     * 
     * 
     */
    @JsonProperty("secretName")
    private String secretName;
    /**
     * 
     * 
     */
    @JsonProperty("secretNamespace")
    private String secretNamespace;
    /**
     * 
     * 
     */
    @JsonProperty("shareName")
    private String shareName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AzureFilePersistentVolumeSource() {
    }

    /**
     * 
     * @param secretName
     * @param secretNamespace
     * @param readOnly
     * @param shareName
     */
    public AzureFilePersistentVolumeSource(Boolean readOnly, String secretName, String secretNamespace, String shareName) {
        this.readOnly = readOnly;
        this.secretName = secretName;
        this.secretNamespace = secretNamespace;
        this.shareName = shareName;
    }

    /**
     * 
     * 
     * @return
     *     The readOnly
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * 
     * 
     * @param readOnly
     *     The readOnly
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * 
     * 
     * @return
     *     The secretName
     */
    @JsonProperty("secretName")
    public String getSecretName() {
        return secretName;
    }

    /**
     * 
     * 
     * @param secretName
     *     The secretName
     */
    @JsonProperty("secretName")
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    /**
     * 
     * 
     * @return
     *     The secretNamespace
     */
    @JsonProperty("secretNamespace")
    public String getSecretNamespace() {
        return secretNamespace;
    }

    /**
     * 
     * 
     * @param secretNamespace
     *     The secretNamespace
     */
    @JsonProperty("secretNamespace")
    public void setSecretNamespace(String secretNamespace) {
        this.secretNamespace = secretNamespace;
    }

    /**
     * 
     * 
     * @return
     *     The shareName
     */
    @JsonProperty("shareName")
    public String getShareName() {
        return shareName;
    }

    /**
     * 
     * 
     * @param shareName
     *     The shareName
     */
    @JsonProperty("shareName")
    public void setShareName(String shareName) {
        this.shareName = shareName;
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
