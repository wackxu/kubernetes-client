
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
    "gateway",
    "protectionDomain",
    "readOnly",
    "secretRef",
    "sslEnabled",
    "storageMode",
    "storagePool",
    "system",
    "volumeName"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ScaleIOVolumeSource implements KubernetesResource
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
    @JsonProperty("gateway")
    private String gateway;
    /**
     * 
     * 
     */
    @JsonProperty("protectionDomain")
    private String protectionDomain;
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
    @JsonProperty("sslEnabled")
    private Boolean sslEnabled;
    /**
     * 
     * 
     */
    @JsonProperty("storageMode")
    private String storageMode;
    /**
     * 
     * 
     */
    @JsonProperty("storagePool")
    private String storagePool;
    /**
     * 
     * 
     */
    @JsonProperty("system")
    private String system;
    /**
     * 
     * 
     */
    @JsonProperty("volumeName")
    private String volumeName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ScaleIOVolumeSource() {
    }

    /**
     * 
     * @param system
     * @param protectionDomain
     * @param sslEnabled
     * @param storageMode
     * @param volumeName
     * @param secretRef
     * @param readOnly
     * @param fsType
     * @param storagePool
     * @param gateway
     */
    public ScaleIOVolumeSource(String fsType, String gateway, String protectionDomain, Boolean readOnly, LocalObjectReference secretRef, Boolean sslEnabled, String storageMode, String storagePool, String system, String volumeName) {
        this.fsType = fsType;
        this.gateway = gateway;
        this.protectionDomain = protectionDomain;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.sslEnabled = sslEnabled;
        this.storageMode = storageMode;
        this.storagePool = storagePool;
        this.system = system;
        this.volumeName = volumeName;
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
     *     The gateway
     */
    @JsonProperty("gateway")
    public String getGateway() {
        return gateway;
    }

    /**
     * 
     * 
     * @param gateway
     *     The gateway
     */
    @JsonProperty("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * 
     * 
     * @return
     *     The protectionDomain
     */
    @JsonProperty("protectionDomain")
    public String getProtectionDomain() {
        return protectionDomain;
    }

    /**
     * 
     * 
     * @param protectionDomain
     *     The protectionDomain
     */
    @JsonProperty("protectionDomain")
    public void setProtectionDomain(String protectionDomain) {
        this.protectionDomain = protectionDomain;
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
     *     The sslEnabled
     */
    @JsonProperty("sslEnabled")
    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    /**
     * 
     * 
     * @param sslEnabled
     *     The sslEnabled
     */
    @JsonProperty("sslEnabled")
    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    /**
     * 
     * 
     * @return
     *     The storageMode
     */
    @JsonProperty("storageMode")
    public String getStorageMode() {
        return storageMode;
    }

    /**
     * 
     * 
     * @param storageMode
     *     The storageMode
     */
    @JsonProperty("storageMode")
    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * 
     * 
     * @return
     *     The storagePool
     */
    @JsonProperty("storagePool")
    public String getStoragePool() {
        return storagePool;
    }

    /**
     * 
     * 
     * @param storagePool
     *     The storagePool
     */
    @JsonProperty("storagePool")
    public void setStoragePool(String storagePool) {
        this.storagePool = storagePool;
    }

    /**
     * 
     * 
     * @return
     *     The system
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * 
     * 
     * @param system
     *     The system
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * 
     * 
     * @return
     *     The volumeName
     */
    @JsonProperty("volumeName")
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * 
     * 
     * @param volumeName
     *     The volumeName
     */
    @JsonProperty("volumeName")
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
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
