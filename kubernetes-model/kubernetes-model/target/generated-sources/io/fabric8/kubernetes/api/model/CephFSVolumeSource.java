
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
    "monitors",
    "path",
    "readOnly",
    "secretFile",
    "secretRef",
    "user"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CephFSVolumeSource implements KubernetesResource
{

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
    @JsonProperty("path")
    private String path;
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
    @JsonProperty("secretFile")
    private String secretFile;
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
    public CephFSVolumeSource() {
    }

    /**
     * 
     * @param path
     * @param secretRef
     * @param secretFile
     * @param readOnly
     * @param user
     * @param monitors
     */
    public CephFSVolumeSource(List<String> monitors, String path, Boolean readOnly, String secretFile, LocalObjectReference secretRef, String user) {
        this.monitors = monitors;
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
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
     *     The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * 
     * 
     * @param path
     *     The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
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
     *     The secretFile
     */
    @JsonProperty("secretFile")
    public String getSecretFile() {
        return secretFile;
    }

    /**
     * 
     * 
     * @param secretFile
     *     The secretFile
     */
    @JsonProperty("secretFile")
    public void setSecretFile(String secretFile) {
        this.secretFile = secretFile;
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
