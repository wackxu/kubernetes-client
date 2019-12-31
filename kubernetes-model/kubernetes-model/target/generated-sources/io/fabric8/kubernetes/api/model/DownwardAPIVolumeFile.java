
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
    "fieldRef",
    "mode",
    "path",
    "resourceFieldRef"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DownwardAPIVolumeFile implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("fieldRef")
    @Valid
    private ObjectFieldSelector fieldRef;
    /**
     * 
     * 
     */
    @JsonProperty("mode")
    private Integer mode;
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
    @JsonProperty("resourceFieldRef")
    @Valid
    private ResourceFieldSelector resourceFieldRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DownwardAPIVolumeFile() {
    }

    /**
     * 
     * @param mode
     * @param path
     * @param resourceFieldRef
     * @param fieldRef
     */
    public DownwardAPIVolumeFile(ObjectFieldSelector fieldRef, Integer mode, String path, ResourceFieldSelector resourceFieldRef) {
        this.fieldRef = fieldRef;
        this.mode = mode;
        this.path = path;
        this.resourceFieldRef = resourceFieldRef;
    }

    /**
     * 
     * 
     * @return
     *     The fieldRef
     */
    @JsonProperty("fieldRef")
    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    /**
     * 
     * 
     * @param fieldRef
     *     The fieldRef
     */
    @JsonProperty("fieldRef")
    public void setFieldRef(ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
    }

    /**
     * 
     * 
     * @return
     *     The mode
     */
    @JsonProperty("mode")
    public Integer getMode() {
        return mode;
    }

    /**
     * 
     * 
     * @param mode
     *     The mode
     */
    @JsonProperty("mode")
    public void setMode(Integer mode) {
        this.mode = mode;
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
     *     The resourceFieldRef
     */
    @JsonProperty("resourceFieldRef")
    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    /**
     * 
     * 
     * @param resourceFieldRef
     *     The resourceFieldRef
     */
    @JsonProperty("resourceFieldRef")
    public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
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
