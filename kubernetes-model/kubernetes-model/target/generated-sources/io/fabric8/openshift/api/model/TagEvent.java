
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
    "created",
    "dockerImageReference",
    "generation",
    "image"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class TagEvent implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("created")
    @Valid
    private String created;
    /**
     * 
     * 
     */
    @JsonProperty("dockerImageReference")
    private java.lang.String dockerImageReference;
    /**
     * 
     * 
     */
    @JsonProperty("generation")
    private Long generation;
    /**
     * 
     * 
     */
    @JsonProperty("image")
    private java.lang.String image;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TagEvent() {
    }

    /**
     * 
     * @param generation
     * @param image
     * @param created
     * @param dockerImageReference
     */
    public TagEvent(String created, java.lang.String dockerImageReference, Long generation, java.lang.String image) {
        this.created = created;
        this.dockerImageReference = dockerImageReference;
        this.generation = generation;
        this.image = image;
    }

    /**
     * 
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageReference
     */
    @JsonProperty("dockerImageReference")
    public java.lang.String getDockerImageReference() {
        return dockerImageReference;
    }

    /**
     * 
     * 
     * @param dockerImageReference
     *     The dockerImageReference
     */
    @JsonProperty("dockerImageReference")
    public void setDockerImageReference(java.lang.String dockerImageReference) {
        this.dockerImageReference = dockerImageReference;
    }

    /**
     * 
     * 
     * @return
     *     The generation
     */
    @JsonProperty("generation")
    public Long getGeneration() {
        return generation;
    }

    /**
     * 
     * 
     * @param generation
     *     The generation
     */
    @JsonProperty("generation")
    public void setGeneration(Long generation) {
        this.generation = generation;
    }

    /**
     * 
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public java.lang.String getImage() {
        return image;
    }

    /**
     * 
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(java.lang.String image) {
        this.image = image;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
