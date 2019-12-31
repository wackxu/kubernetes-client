
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
    "pdID"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PhotonPersistentDiskVolumeSource implements KubernetesResource
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
    @JsonProperty("pdID")
    private String pdID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PhotonPersistentDiskVolumeSource() {
    }

    /**
     * 
     * @param pdID
     * @param fsType
     */
    public PhotonPersistentDiskVolumeSource(String fsType, String pdID) {
        this.fsType = fsType;
        this.pdID = pdID;
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
     *     The pdID
     */
    @JsonProperty("pdID")
    public String getPdID() {
        return pdID;
    }

    /**
     * 
     * 
     * @param pdID
     *     The pdID
     */
    @JsonProperty("pdID")
    public void setPdID(String pdID) {
        this.pdID = pdID;
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
