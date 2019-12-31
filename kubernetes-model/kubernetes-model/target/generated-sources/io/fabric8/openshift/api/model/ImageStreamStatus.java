
package io.fabric8.openshift.api.model;

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
    "dockerImageRepository",
    "publicDockerImageRepository",
    "tags"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ImageStreamStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("dockerImageRepository")
    private String dockerImageRepository;
    /**
     * 
     * 
     */
    @JsonProperty("publicDockerImageRepository")
    private String publicDockerImageRepository;
    /**
     * 
     * 
     */
    @JsonProperty("tags")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NamedTagEventList> tags = new ArrayList<NamedTagEventList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageStreamStatus() {
    }

    /**
     * 
     * @param dockerImageRepository
     * @param publicDockerImageRepository
     * @param tags
     */
    public ImageStreamStatus(String dockerImageRepository, String publicDockerImageRepository, List<NamedTagEventList> tags) {
        this.dockerImageRepository = dockerImageRepository;
        this.publicDockerImageRepository = publicDockerImageRepository;
        this.tags = tags;
    }

    /**
     * 
     * 
     * @return
     *     The dockerImageRepository
     */
    @JsonProperty("dockerImageRepository")
    public String getDockerImageRepository() {
        return dockerImageRepository;
    }

    /**
     * 
     * 
     * @param dockerImageRepository
     *     The dockerImageRepository
     */
    @JsonProperty("dockerImageRepository")
    public void setDockerImageRepository(String dockerImageRepository) {
        this.dockerImageRepository = dockerImageRepository;
    }

    /**
     * 
     * 
     * @return
     *     The publicDockerImageRepository
     */
    @JsonProperty("publicDockerImageRepository")
    public String getPublicDockerImageRepository() {
        return publicDockerImageRepository;
    }

    /**
     * 
     * 
     * @param publicDockerImageRepository
     *     The publicDockerImageRepository
     */
    @JsonProperty("publicDockerImageRepository")
    public void setPublicDockerImageRepository(String publicDockerImageRepository) {
        this.publicDockerImageRepository = publicDockerImageRepository;
    }

    /**
     * 
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<NamedTagEventList> getTags() {
        return tags;
    }

    /**
     * 
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<NamedTagEventList> tags) {
        this.tags = tags;
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
