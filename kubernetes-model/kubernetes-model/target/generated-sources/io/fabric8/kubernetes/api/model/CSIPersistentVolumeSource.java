
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
    "controllerPublishSecretRef",
    "driver",
    "fsType",
    "nodePublishSecretRef",
    "nodeStageSecretRef",
    "readOnly",
    "volumeAttributes",
    "volumeHandle"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CSIPersistentVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("controllerPublishSecretRef")
    @Valid
    private SecretReference controllerPublishSecretRef;
    /**
     * 
     * 
     */
    @JsonProperty("driver")
    private java.lang.String driver;
    /**
     * 
     * 
     */
    @JsonProperty("fsType")
    private java.lang.String fsType;
    /**
     * 
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    @Valid
    private SecretReference nodePublishSecretRef;
    /**
     * 
     * 
     */
    @JsonProperty("nodeStageSecretRef")
    @Valid
    private SecretReference nodeStageSecretRef;
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
    @JsonProperty("volumeAttributes")
    @Valid
    private Map<String, String> volumeAttributes;
    /**
     * 
     * 
     */
    @JsonProperty("volumeHandle")
    private java.lang.String volumeHandle;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CSIPersistentVolumeSource() {
    }

    /**
     * 
     * @param controllerPublishSecretRef
     * @param driver
     * @param nodePublishSecretRef
     * @param nodeStageSecretRef
     * @param volumeHandle
     * @param readOnly
     * @param fsType
     * @param volumeAttributes
     */
    public CSIPersistentVolumeSource(SecretReference controllerPublishSecretRef, java.lang.String driver, java.lang.String fsType, SecretReference nodePublishSecretRef, SecretReference nodeStageSecretRef, Boolean readOnly, Map<String, String> volumeAttributes, java.lang.String volumeHandle) {
        this.controllerPublishSecretRef = controllerPublishSecretRef;
        this.driver = driver;
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.nodeStageSecretRef = nodeStageSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
        this.volumeHandle = volumeHandle;
    }

    /**
     * 
     * 
     * @return
     *     The controllerPublishSecretRef
     */
    @JsonProperty("controllerPublishSecretRef")
    public SecretReference getControllerPublishSecretRef() {
        return controllerPublishSecretRef;
    }

    /**
     * 
     * 
     * @param controllerPublishSecretRef
     *     The controllerPublishSecretRef
     */
    @JsonProperty("controllerPublishSecretRef")
    public void setControllerPublishSecretRef(SecretReference controllerPublishSecretRef) {
        this.controllerPublishSecretRef = controllerPublishSecretRef;
    }

    /**
     * 
     * 
     * @return
     *     The driver
     */
    @JsonProperty("driver")
    public java.lang.String getDriver() {
        return driver;
    }

    /**
     * 
     * 
     * @param driver
     *     The driver
     */
    @JsonProperty("driver")
    public void setDriver(java.lang.String driver) {
        this.driver = driver;
    }

    /**
     * 
     * 
     * @return
     *     The fsType
     */
    @JsonProperty("fsType")
    public java.lang.String getFsType() {
        return fsType;
    }

    /**
     * 
     * 
     * @param fsType
     *     The fsType
     */
    @JsonProperty("fsType")
    public void setFsType(java.lang.String fsType) {
        this.fsType = fsType;
    }

    /**
     * 
     * 
     * @return
     *     The nodePublishSecretRef
     */
    @JsonProperty("nodePublishSecretRef")
    public SecretReference getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    /**
     * 
     * 
     * @param nodePublishSecretRef
     *     The nodePublishSecretRef
     */
    @JsonProperty("nodePublishSecretRef")
    public void setNodePublishSecretRef(SecretReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    /**
     * 
     * 
     * @return
     *     The nodeStageSecretRef
     */
    @JsonProperty("nodeStageSecretRef")
    public SecretReference getNodeStageSecretRef() {
        return nodeStageSecretRef;
    }

    /**
     * 
     * 
     * @param nodeStageSecretRef
     *     The nodeStageSecretRef
     */
    @JsonProperty("nodeStageSecretRef")
    public void setNodeStageSecretRef(SecretReference nodeStageSecretRef) {
        this.nodeStageSecretRef = nodeStageSecretRef;
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
     *     The volumeAttributes
     */
    @JsonProperty("volumeAttributes")
    public Map<String, String> getVolumeAttributes() {
        return volumeAttributes;
    }

    /**
     * 
     * 
     * @param volumeAttributes
     *     The volumeAttributes
     */
    @JsonProperty("volumeAttributes")
    public void setVolumeAttributes(Map<String, String> volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
    }

    /**
     * 
     * 
     * @return
     *     The volumeHandle
     */
    @JsonProperty("volumeHandle")
    public java.lang.String getVolumeHandle() {
        return volumeHandle;
    }

    /**
     * 
     * 
     * @param volumeHandle
     *     The volumeHandle
     */
    @JsonProperty("volumeHandle")
    public void setVolumeHandle(java.lang.String volumeHandle) {
        this.volumeHandle = volumeHandle;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
