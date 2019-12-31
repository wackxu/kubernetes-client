
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
    "cachingMode",
    "diskName",
    "diskURI",
    "fsType",
    "readOnly"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class AzureDiskVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("cachingMode")
    private String cachingMode;
    /**
     * 
     * 
     */
    @JsonProperty("diskName")
    private String diskName;
    /**
     * 
     * 
     */
    @JsonProperty("diskURI")
    private String diskURI;
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
    @JsonProperty("kind")
    private String kind;
    /**
     * 
     * 
     */
    @JsonProperty("readOnly")
    private Boolean readOnly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AzureDiskVolumeSource() {
    }

    /**
     * 
     * @param diskName
     * @param kind
     * @param readOnly
     * @param cachingMode
     * @param diskURI
     * @param fsType
     */
    public AzureDiskVolumeSource(String cachingMode, String diskName, String diskURI, String fsType, String kind, Boolean readOnly) {
        this.cachingMode = cachingMode;
        this.diskName = diskName;
        this.diskURI = diskURI;
        this.fsType = fsType;
        this.kind = kind;
        this.readOnly = readOnly;
    }

    /**
     * 
     * 
     * @return
     *     The cachingMode
     */
    @JsonProperty("cachingMode")
    public String getCachingMode() {
        return cachingMode;
    }

    /**
     * 
     * 
     * @param cachingMode
     *     The cachingMode
     */
    @JsonProperty("cachingMode")
    public void setCachingMode(String cachingMode) {
        this.cachingMode = cachingMode;
    }

    /**
     * 
     * 
     * @return
     *     The diskName
     */
    @JsonProperty("diskName")
    public String getDiskName() {
        return diskName;
    }

    /**
     * 
     * 
     * @param diskName
     *     The diskName
     */
    @JsonProperty("diskName")
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * 
     * 
     * @return
     *     The diskURI
     */
    @JsonProperty("diskURI")
    public String getDiskURI() {
        return diskURI;
    }

    /**
     * 
     * 
     * @param diskURI
     *     The diskURI
     */
    @JsonProperty("diskURI")
    public void setDiskURI(String diskURI) {
        this.diskURI = diskURI;
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
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
