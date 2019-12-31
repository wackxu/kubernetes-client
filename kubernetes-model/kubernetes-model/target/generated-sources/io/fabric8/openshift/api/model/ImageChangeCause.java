
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
import io.fabric8.kubernetes.api.model.ObjectReference;
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
    "fromRef",
    "imageID"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ImageChangeCause implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("fromRef")
    @Valid
    private ObjectReference fromRef;
    /**
     * 
     * 
     */
    @JsonProperty("imageID")
    private String imageID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageChangeCause() {
    }

    /**
     * 
     * @param imageID
     * @param fromRef
     */
    public ImageChangeCause(ObjectReference fromRef, String imageID) {
        this.fromRef = fromRef;
        this.imageID = imageID;
    }

    /**
     * 
     * 
     * @return
     *     The fromRef
     */
    @JsonProperty("fromRef")
    public ObjectReference getFromRef() {
        return fromRef;
    }

    /**
     * 
     * 
     * @param fromRef
     *     The fromRef
     */
    @JsonProperty("fromRef")
    public void setFromRef(ObjectReference fromRef) {
        this.fromRef = fromRef;
    }

    /**
     * 
     * 
     * @return
     *     The imageID
     */
    @JsonProperty("imageID")
    public String getImageID() {
        return imageID;
    }

    /**
     * 
     * 
     * @param imageID
     *     The imageID
     */
    @JsonProperty("imageID")
    public void setImageID(String imageID) {
        this.imageID = imageID;
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
