
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
    "fsType",
    "storagePolicyID",
    "storagePolicyName",
    "volumePath"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class VsphereVirtualDiskVolumeSource implements KubernetesResource
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
    @JsonProperty("storagePolicyID")
    private String storagePolicyID;
    /**
     * 
     * 
     */
    @JsonProperty("storagePolicyName")
    private String storagePolicyName;
    /**
     * 
     * 
     */
    @JsonProperty("volumePath")
    private String volumePath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VsphereVirtualDiskVolumeSource() {
    }

    /**
     * 
     * @param storagePolicyName
     * @param storagePolicyID
     * @param volumePath
     * @param fsType
     */
    public VsphereVirtualDiskVolumeSource(String fsType, String storagePolicyID, String storagePolicyName, String volumePath) {
        this.fsType = fsType;
        this.storagePolicyID = storagePolicyID;
        this.storagePolicyName = storagePolicyName;
        this.volumePath = volumePath;
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
     *     The storagePolicyID
     */
    @JsonProperty("storagePolicyID")
    public String getStoragePolicyID() {
        return storagePolicyID;
    }

    /**
     * 
     * 
     * @param storagePolicyID
     *     The storagePolicyID
     */
    @JsonProperty("storagePolicyID")
    public void setStoragePolicyID(String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
    }

    /**
     * 
     * 
     * @return
     *     The storagePolicyName
     */
    @JsonProperty("storagePolicyName")
    public String getStoragePolicyName() {
        return storagePolicyName;
    }

    /**
     * 
     * 
     * @param storagePolicyName
     *     The storagePolicyName
     */
    @JsonProperty("storagePolicyName")
    public void setStoragePolicyName(String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
    }

    /**
     * 
     * 
     * @return
     *     The volumePath
     */
    @JsonProperty("volumePath")
    public String getVolumePath() {
        return volumePath;
    }

    /**
     * 
     * 
     * @param volumePath
     *     The volumePath
     */
    @JsonProperty("volumePath")
    public void setVolumePath(String volumePath) {
        this.volumePath = volumePath;
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
