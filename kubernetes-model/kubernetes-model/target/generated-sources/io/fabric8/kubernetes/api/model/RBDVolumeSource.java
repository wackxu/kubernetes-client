
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
    "fsType",
    "image",
    "keyring",
    "monitors",
    "pool",
    "readOnly",
    "secretRef",
    "user"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RBDVolumeSource implements KubernetesResource
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
    @JsonProperty("image")
    private String image;
    /**
     * 
     * 
     */
    @JsonProperty("keyring")
    private String keyring;
    /**
     * 
     * 
     */
    @JsonProperty("monitors")
    @Valid
    private List<String> monitors = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("pool")
    private String pool;
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
    private LocalObjectReference secretRef;
    /**
     * 
     * 
     */
    @JsonProperty("user")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RBDVolumeSource() {
    }

    /**
     * 
     * @param image
     * @param pool
     * @param secretRef
     * @param readOnly
     * @param fsType
     * @param keyring
     * @param user
     * @param monitors
     */
    public RBDVolumeSource(String fsType, String image, String keyring, List<String> monitors, String pool, Boolean readOnly, LocalObjectReference secretRef, String user) {
        this.fsType = fsType;
        this.image = image;
        this.keyring = keyring;
        this.monitors = monitors;
        this.pool = pool;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.user = user;
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
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * 
     * @return
     *     The keyring
     */
    @JsonProperty("keyring")
    public String getKeyring() {
        return keyring;
    }

    /**
     * 
     * 
     * @param keyring
     *     The keyring
     */
    @JsonProperty("keyring")
    public void setKeyring(String keyring) {
        this.keyring = keyring;
    }

    /**
     * 
     * 
     * @return
     *     The monitors
     */
    @JsonProperty("monitors")
    public List<String> getMonitors() {
        return monitors;
    }

    /**
     * 
     * 
     * @param monitors
     *     The monitors
     */
    @JsonProperty("monitors")
    public void setMonitors(List<String> monitors) {
        this.monitors = monitors;
    }

    /**
     * 
     * 
     * @return
     *     The pool
     */
    @JsonProperty("pool")
    public String getPool() {
        return pool;
    }

    /**
     * 
     * 
     * @param pool
     *     The pool
     */
    @JsonProperty("pool")
    public void setPool(String pool) {
        this.pool = pool;
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
    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    /**
     * 
     * 
     * @param secretRef
     *     The secretRef
     */
    @JsonProperty("secretRef")
    public void setSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * 
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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
