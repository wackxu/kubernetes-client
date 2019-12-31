
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
import io.fabric8.kubernetes.api.model.LocalObjectReference;
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
    "imageLabels",
    "pushSecret",
    "to"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildOutput implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("imageLabels")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ImageLabel> imageLabels = new ArrayList<ImageLabel>();
    /**
     * 
     * 
     */
    @JsonProperty("pushSecret")
    @Valid
    private LocalObjectReference pushSecret;
    /**
     * 
     * 
     */
    @JsonProperty("to")
    @Valid
    private ObjectReference to;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildOutput() {
    }

    /**
     * 
     * @param to
     * @param pushSecret
     * @param imageLabels
     */
    public BuildOutput(List<ImageLabel> imageLabels, LocalObjectReference pushSecret, ObjectReference to) {
        this.imageLabels = imageLabels;
        this.pushSecret = pushSecret;
        this.to = to;
    }

    /**
     * 
     * 
     * @return
     *     The imageLabels
     */
    @JsonProperty("imageLabels")
    public List<ImageLabel> getImageLabels() {
        return imageLabels;
    }

    /**
     * 
     * 
     * @param imageLabels
     *     The imageLabels
     */
    @JsonProperty("imageLabels")
    public void setImageLabels(List<ImageLabel> imageLabels) {
        this.imageLabels = imageLabels;
    }

    /**
     * 
     * 
     * @return
     *     The pushSecret
     */
    @JsonProperty("pushSecret")
    public LocalObjectReference getPushSecret() {
        return pushSecret;
    }

    /**
     * 
     * 
     * @param pushSecret
     *     The pushSecret
     */
    @JsonProperty("pushSecret")
    public void setPushSecret(LocalObjectReference pushSecret) {
        this.pushSecret = pushSecret;
    }

    /**
     * 
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public ObjectReference getTo() {
        return to;
    }

    /**
     * 
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(ObjectReference to) {
        this.to = to;
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
