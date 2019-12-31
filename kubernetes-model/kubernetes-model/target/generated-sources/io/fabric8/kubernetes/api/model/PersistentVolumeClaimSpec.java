
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
    "accessModes",
    "dataSource",
    "resources",
    "selector",
    "storageClassName",
    "volumeMode",
    "volumeName"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PersistentVolumeClaimSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("accessModes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> accessModes = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("dataSource")
    @Valid
    private TypedLocalObjectReference dataSource;
    /**
     * 
     * 
     */
    @JsonProperty("resources")
    @Valid
    private ResourceRequirements resources;
    /**
     * 
     * 
     */
    @JsonProperty("selector")
    @Valid
    private LabelSelector selector;
    /**
     * 
     * 
     */
    @JsonProperty("storageClassName")
    private String storageClassName;
    /**
     * 
     * 
     */
    @JsonProperty("volumeMode")
    private String volumeMode;
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
    public PersistentVolumeClaimSpec() {
    }

    /**
     * 
     * @param storageClassName
     * @param volumeName
     * @param resources
     * @param selector
     * @param accessModes
     * @param dataSource
     * @param volumeMode
     */
    public PersistentVolumeClaimSpec(List<String> accessModes, TypedLocalObjectReference dataSource, ResourceRequirements resources, LabelSelector selector, String storageClassName, String volumeMode, String volumeName) {
        this.accessModes = accessModes;
        this.dataSource = dataSource;
        this.resources = resources;
        this.selector = selector;
        this.storageClassName = storageClassName;
        this.volumeMode = volumeMode;
        this.volumeName = volumeName;
    }

    /**
     * 
     * 
     * @return
     *     The accessModes
     */
    @JsonProperty("accessModes")
    public List<String> getAccessModes() {
        return accessModes;
    }

    /**
     * 
     * 
     * @param accessModes
     *     The accessModes
     */
    @JsonProperty("accessModes")
    public void setAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * 
     * 
     * @return
     *     The dataSource
     */
    @JsonProperty("dataSource")
    public TypedLocalObjectReference getDataSource() {
        return dataSource;
    }

    /**
     * 
     * 
     * @param dataSource
     *     The dataSource
     */
    @JsonProperty("dataSource")
    public void setDataSource(TypedLocalObjectReference dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public ResourceRequirements getResources() {
        return resources;
    }

    /**
     * 
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    /**
     * 
     * 
     * @return
     *     The selector
     */
    @JsonProperty("selector")
    public LabelSelector getSelector() {
        return selector;
    }

    /**
     * 
     * 
     * @param selector
     *     The selector
     */
    @JsonProperty("selector")
    public void setSelector(LabelSelector selector) {
        this.selector = selector;
    }

    /**
     * 
     * 
     * @return
     *     The storageClassName
     */
    @JsonProperty("storageClassName")
    public String getStorageClassName() {
        return storageClassName;
    }

    /**
     * 
     * 
     * @param storageClassName
     *     The storageClassName
     */
    @JsonProperty("storageClassName")
    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    /**
     * 
     * 
     * @return
     *     The volumeMode
     */
    @JsonProperty("volumeMode")
    public String getVolumeMode() {
        return volumeMode;
    }

    /**
     * 
     * 
     * @param volumeMode
     *     The volumeMode
     */
    @JsonProperty("volumeMode")
    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
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
