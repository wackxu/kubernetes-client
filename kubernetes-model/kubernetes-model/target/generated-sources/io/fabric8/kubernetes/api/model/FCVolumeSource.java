
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
    "lun",
    "readOnly",
    "targetWWNs",
    "wwids"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class FCVolumeSource implements KubernetesResource
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
    @JsonProperty("lun")
    private Integer lun;
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
    @JsonProperty("targetWWNs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> targetWWNs = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("wwids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> wwids = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FCVolumeSource() {
    }

    /**
     * 
     * @param lun
     * @param targetWWNs
     * @param readOnly
     * @param wwids
     * @param fsType
     */
    public FCVolumeSource(String fsType, Integer lun, Boolean readOnly, List<String> targetWWNs, List<String> wwids) {
        this.fsType = fsType;
        this.lun = lun;
        this.readOnly = readOnly;
        this.targetWWNs = targetWWNs;
        this.wwids = wwids;
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
     *     The targetWWNs
     */
    @JsonProperty("targetWWNs")
    public List<String> getTargetWWNs() {
        return targetWWNs;
    }

    /**
     * 
     * 
     * @param targetWWNs
     *     The targetWWNs
     */
    @JsonProperty("targetWWNs")
    public void setTargetWWNs(List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
    }

    /**
     * 
     * 
     * @return
     *     The wwids
     */
    @JsonProperty("wwids")
    public List<String> getWwids() {
        return wwids;
    }

    /**
     * 
     * 
     * @param wwids
     *     The wwids
     */
    @JsonProperty("wwids")
    public void setWwids(List<String> wwids) {
        this.wwids = wwids;
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
