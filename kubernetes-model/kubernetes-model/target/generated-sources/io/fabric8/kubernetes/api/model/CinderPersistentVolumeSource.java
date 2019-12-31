
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
    "fsType",
    "readOnly",
    "secretRef",
    "volumeID"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CinderPersistentVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("fsType")
    private String fsType;
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
    @JsonProperty("secretRef")
    @Valid
    private SecretReference secretRef;
    /**
     * 
     * 
     */
    @JsonProperty("volumeID")
    private String volumeID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CinderPersistentVolumeSource() {
    }

    /**
     * 
     * @param secretRef
     * @param volumeID
     * @param readOnly
     * @param fsType
     */
    public CinderPersistentVolumeSource(String fsType, Boolean readOnly, SecretReference secretRef, String volumeID) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeID = volumeID;
    }

    /**
     * 
     * 
     * @return
     *     The fsType
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * 
     * 
     * @param fsType
     *     The fsType
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
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
     *     The secretRef
     */
    @JsonProperty("secretRef")
    public SecretReference getSecretRef() {
        return secretRef;
    }

    /**
     * 
     * 
     * @param secretRef
     *     The secretRef
     */
    @JsonProperty("secretRef")
    public void setSecretRef(SecretReference secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * 
     * 
     * @return
     *     The volumeID
     */
    @JsonProperty("volumeID")
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * 
     * 
     * @param volumeID
     *     The volumeID
     */
    @JsonProperty("volumeID")
    public void setVolumeID(String volumeID) {
        this.volumeID = volumeID;
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
