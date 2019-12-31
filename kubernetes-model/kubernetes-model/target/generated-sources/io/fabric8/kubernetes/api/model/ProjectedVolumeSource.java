
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
    "defaultMode",
    "sources"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ProjectedVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("defaultMode")
    private Integer defaultMode;
    /**
     * 
     * 
     */
    @JsonProperty("sources")
    @Valid
    private List<VolumeProjection> sources = new ArrayList<VolumeProjection>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProjectedVolumeSource() {
    }

    /**
     * 
     * @param sources
     * @param defaultMode
     */
    public ProjectedVolumeSource(Integer defaultMode, List<VolumeProjection> sources) {
        this.defaultMode = defaultMode;
        this.sources = sources;
    }

    /**
     * 
     * 
     * @return
     *     The defaultMode
     */
    @JsonProperty("defaultMode")
    public Integer getDefaultMode() {
        return defaultMode;
    }

    /**
     * 
     * 
     * @param defaultMode
     *     The defaultMode
     */
    @JsonProperty("defaultMode")
    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    /**
     * 
     * 
     * @return
     *     The sources
     */
    @JsonProperty("sources")
    public List<VolumeProjection> getSources() {
        return sources;
    }

    /**
     * 
     * 
     * @param sources
     *     The sources
     */
    @JsonProperty("sources")
    public void setSources(List<VolumeProjection> sources) {
        this.sources = sources;
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
