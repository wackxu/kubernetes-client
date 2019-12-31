
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
import io.fabric8.kubernetes.api.model.Status;
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
    "additionalTags",
    "images",
    "status"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RepositoryImportStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("additionalTags")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> additionalTags = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("images")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ImageImportStatus> images = new ArrayList<ImageImportStatus>();
    /**
     * 
     * 
     */
    @JsonProperty("status")
    @Valid
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RepositoryImportStatus() {
    }

    /**
     * 
     * @param additionalTags
     * @param images
     * @param status
     */
    public RepositoryImportStatus(List<String> additionalTags, List<ImageImportStatus> images, Status status) {
        this.additionalTags = additionalTags;
        this.images = images;
        this.status = status;
    }

    /**
     * 
     * 
     * @return
     *     The additionalTags
     */
    @JsonProperty("additionalTags")
    public List<String> getAdditionalTags() {
        return additionalTags;
    }

    /**
     * 
     * 
     * @param additionalTags
     *     The additionalTags
     */
    @JsonProperty("additionalTags")
    public void setAdditionalTags(List<String> additionalTags) {
        this.additionalTags = additionalTags;
    }

    /**
     * 
     * 
     * @return
     *     The images
     */
    @JsonProperty("images")
    public List<ImageImportStatus> getImages() {
        return images;
    }

    /**
     * 
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(List<ImageImportStatus> images) {
        this.images = images;
    }

    /**
     * 
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
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
