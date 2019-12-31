
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
    "datasetName",
    "datasetUUID"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class FlockerVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("datasetName")
    private String datasetName;
    /**
     * 
     * 
     */
    @JsonProperty("datasetUUID")
    private String datasetUUID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FlockerVolumeSource() {
    }

    /**
     * 
     * @param datasetName
     * @param datasetUUID
     */
    public FlockerVolumeSource(String datasetName, String datasetUUID) {
        this.datasetName = datasetName;
        this.datasetUUID = datasetUUID;
    }

    /**
     * 
     * 
     * @return
     *     The datasetName
     */
    @JsonProperty("datasetName")
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * 
     * 
     * @param datasetName
     *     The datasetName
     */
    @JsonProperty("datasetName")
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * 
     * 
     * @return
     *     The datasetUUID
     */
    @JsonProperty("datasetUUID")
    public String getDatasetUUID() {
        return datasetUUID;
    }

    /**
     * 
     * 
     * @param datasetUUID
     *     The datasetUUID
     */
    @JsonProperty("datasetUUID")
    public void setDatasetUUID(String datasetUUID) {
        this.datasetUUID = datasetUUID;
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
