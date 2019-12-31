
package io.fabric8.openshift.api.model;

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
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
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
    "configMap",
    "destinationDir"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ConfigMapBuildSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("configMap")
    @Valid
    private LocalObjectReference configMap;
    /**
     * 
     * 
     */
    @JsonProperty("destinationDir")
    private String destinationDir;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConfigMapBuildSource() {
    }

    /**
     * 
     * @param destinationDir
     * @param configMap
     */
    public ConfigMapBuildSource(LocalObjectReference configMap, String destinationDir) {
        this.configMap = configMap;
        this.destinationDir = destinationDir;
    }

    /**
     * 
     * 
     * @return
     *     The configMap
     */
    @JsonProperty("configMap")
    public LocalObjectReference getConfigMap() {
        return configMap;
    }

    /**
     * 
     * 
     * @param configMap
     *     The configMap
     */
    @JsonProperty("configMap")
    public void setConfigMap(LocalObjectReference configMap) {
        this.configMap = configMap;
    }

    /**
     * 
     * 
     * @return
     *     The destinationDir
     */
    @JsonProperty("destinationDir")
    public String getDestinationDir() {
        return destinationDir;
    }

    /**
     * 
     * 
     * @param destinationDir
     *     The destinationDir
     */
    @JsonProperty("destinationDir")
    public void setDestinationDir(String destinationDir) {
        this.destinationDir = destinationDir;
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
