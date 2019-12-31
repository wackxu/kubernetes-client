
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
    "image",
    "status",
    "tag"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ImageImportStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("image")
    @Valid
    private Image image;
    /**
     * 
     * 
     */
    @JsonProperty("status")
    @Valid
    private Status status;
    /**
     * 
     * 
     */
    @JsonProperty("tag")
    private String tag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageImportStatus() {
    }

    /**
     * 
     * @param image
     * @param tag
     * @param status
     */
    public ImageImportStatus(Image image, Status status, String tag) {
        this.image = image;
        this.status = status;
        this.tag = tag;
    }

    /**
     * 
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    /**
     * 
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
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

    /**
     * 
     * 
     * @return
     *     The tag
     */
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    /**
     * 
     * 
     * @param tag
     *     The tag
     */
    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
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
