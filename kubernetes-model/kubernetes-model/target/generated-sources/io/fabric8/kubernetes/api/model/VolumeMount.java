
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
    "mountPath",
    "mountPropagation",
    "name",
    "readOnly",
    "subPath"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class VolumeMount implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("mountPath")
    private String mountPath;
    /**
     * 
     * 
     */
    @JsonProperty("mountPropagation")
    private String mountPropagation;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
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
    @JsonProperty("subPath")
    private String subPath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VolumeMount() {
    }

    /**
     * 
     * @param mountPath
     * @param mountPropagation
     * @param name
     * @param readOnly
     * @param subPath
     */
    public VolumeMount(String mountPath, String mountPropagation, String name, Boolean readOnly, String subPath) {
        this.mountPath = mountPath;
        this.mountPropagation = mountPropagation;
        this.name = name;
        this.readOnly = readOnly;
        this.subPath = subPath;
    }

    /**
     * 
     * 
     * @return
     *     The mountPath
     */
    @JsonProperty("mountPath")
    public String getMountPath() {
        return mountPath;
    }

    /**
     * 
     * 
     * @param mountPath
     *     The mountPath
     */
    @JsonProperty("mountPath")
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * 
     * 
     * @return
     *     The mountPropagation
     */
    @JsonProperty("mountPropagation")
    public String getMountPropagation() {
        return mountPropagation;
    }

    /**
     * 
     * 
     * @param mountPropagation
     *     The mountPropagation
     */
    @JsonProperty("mountPropagation")
    public void setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    /**
     * 
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
     *     The subPath
     */
    @JsonProperty("subPath")
    public String getSubPath() {
        return subPath;
    }

    /**
     * 
     * 
     * @param subPath
     *     The subPath
     */
    @JsonProperty("subPath")
    public void setSubPath(String subPath) {
        this.subPath = subPath;
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
