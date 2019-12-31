
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
    "chapAuthDiscovery",
    "chapAuthSession",
    "fsType",
    "initiatorName",
    "iqn",
    "iscsiInterface",
    "lun",
    "portals",
    "readOnly",
    "secretRef",
    "targetPortal"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ISCSIPersistentVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("chapAuthDiscovery")
    private Boolean chapAuthDiscovery;
    /**
     * 
     * 
     */
    @JsonProperty("chapAuthSession")
    private Boolean chapAuthSession;
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
    @JsonProperty("initiatorName")
    private String initiatorName;
    /**
     * 
     * 
     */
    @JsonProperty("iqn")
    private String iqn;
    /**
     * 
     * 
     */
    @JsonProperty("iscsiInterface")
    private String iscsiInterface;
    /**
     * 
     * 
     */
    @JsonProperty("lun")
    private Integer lun;
    /**
     * 
     * 
     */
    @JsonProperty("portals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> portals = new ArrayList<String>();
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
    @JsonProperty("targetPortal")
    private String targetPortal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ISCSIPersistentVolumeSource() {
    }

    /**
     * 
     * @param chapAuthSession
     * @param iscsiInterface
     * @param lun
     * @param chapAuthDiscovery
     * @param iqn
     * @param portals
     * @param secretRef
     * @param initiatorName
     * @param readOnly
     * @param fsType
     * @param targetPortal
     */
    public ISCSIPersistentVolumeSource(Boolean chapAuthDiscovery, Boolean chapAuthSession, String fsType, String initiatorName, String iqn, String iscsiInterface, Integer lun, List<String> portals, Boolean readOnly, SecretReference secretRef, String targetPortal) {
        this.chapAuthDiscovery = chapAuthDiscovery;
        this.chapAuthSession = chapAuthSession;
        this.fsType = fsType;
        this.initiatorName = initiatorName;
        this.iqn = iqn;
        this.iscsiInterface = iscsiInterface;
        this.lun = lun;
        this.portals = portals;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.targetPortal = targetPortal;
    }

    /**
     * 
     * 
     * @return
     *     The chapAuthDiscovery
     */
    @JsonProperty("chapAuthDiscovery")
    public Boolean getChapAuthDiscovery() {
        return chapAuthDiscovery;
    }

    /**
     * 
     * 
     * @param chapAuthDiscovery
     *     The chapAuthDiscovery
     */
    @JsonProperty("chapAuthDiscovery")
    public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
    }

    /**
     * 
     * 
     * @return
     *     The chapAuthSession
     */
    @JsonProperty("chapAuthSession")
    public Boolean getChapAuthSession() {
        return chapAuthSession;
    }

    /**
     * 
     * 
     * @param chapAuthSession
     *     The chapAuthSession
     */
    @JsonProperty("chapAuthSession")
    public void setChapAuthSession(Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
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
     *     The initiatorName
     */
    @JsonProperty("initiatorName")
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * 
     * 
     * @param initiatorName
     *     The initiatorName
     */
    @JsonProperty("initiatorName")
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * 
     * 
     * @return
     *     The iqn
     */
    @JsonProperty("iqn")
    public String getIqn() {
        return iqn;
    }

    /**
     * 
     * 
     * @param iqn
     *     The iqn
     */
    @JsonProperty("iqn")
    public void setIqn(String iqn) {
        this.iqn = iqn;
    }

    /**
     * 
     * 
     * @return
     *     The iscsiInterface
     */
    @JsonProperty("iscsiInterface")
    public String getIscsiInterface() {
        return iscsiInterface;
    }

    /**
     * 
     * 
     * @param iscsiInterface
     *     The iscsiInterface
     */
    @JsonProperty("iscsiInterface")
    public void setIscsiInterface(String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
    }

    /**
     * 
     * 
     * @return
     *     The lun
     */
    @JsonProperty("lun")
    public Integer getLun() {
        return lun;
    }

    /**
     * 
     * 
     * @param lun
     *     The lun
     */
    @JsonProperty("lun")
    public void setLun(Integer lun) {
        this.lun = lun;
    }

    /**
     * 
     * 
     * @return
     *     The portals
     */
    @JsonProperty("portals")
    public List<String> getPortals() {
        return portals;
    }

    /**
     * 
     * 
     * @param portals
     *     The portals
     */
    @JsonProperty("portals")
    public void setPortals(List<String> portals) {
        this.portals = portals;
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
     *     The targetPortal
     */
    @JsonProperty("targetPortal")
    public String getTargetPortal() {
        return targetPortal;
    }

    /**
     * 
     * 
     * @param targetPortal
     *     The targetPortal
     */
    @JsonProperty("targetPortal")
    public void setTargetPortal(String targetPortal) {
        this.targetPortal = targetPortal;
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
