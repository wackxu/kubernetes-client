
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
    "containerID",
    "image",
    "imageID",
    "lastState",
    "name",
    "ready",
    "restartCount",
    "state"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ContainerStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("containerID")
    private String containerID;
    /**
     * 
     * 
     */
    @JsonProperty("image")
    private String image;
    /**
     * 
     * 
     */
    @JsonProperty("imageID")
    private String imageID;
    /**
     * 
     * 
     */
    @JsonProperty("lastState")
    @Valid
    private ContainerState lastState;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    @Pattern(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?$")
    @Size(max = 63)
    private String name;
    /**
     * 
     * 
     */
    @JsonProperty("ready")
    private Boolean ready;
    /**
     * 
     * 
     */
    @JsonProperty("restartCount")
    private Integer restartCount;
    /**
     * 
     * 
     */
    @JsonProperty("state")
    @Valid
    private ContainerState state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerStatus() {
    }

    /**
     * 
     * @param image
     * @param imageID
     * @param restartCount
     * @param ready
     * @param name
     * @param state
     * @param containerID
     * @param lastState
     */
    public ContainerStatus(String containerID, String image, String imageID, ContainerState lastState, String name, Boolean ready, Integer restartCount, ContainerState state) {
        this.containerID = containerID;
        this.image = image;
        this.imageID = imageID;
        this.lastState = lastState;
        this.name = name;
        this.ready = ready;
        this.restartCount = restartCount;
        this.state = state;
    }

    /**
     * 
     * 
     * @return
     *     The containerID
     */
    @JsonProperty("containerID")
    public String getContainerID() {
        return containerID;
    }

    /**
     * 
     * 
     * @param containerID
     *     The containerID
     */
    @JsonProperty("containerID")
    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    /**
     * 
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
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

    /**
     * 
     * 
     * @return
     *     The lastState
     */
    @JsonProperty("lastState")
    public ContainerState getLastState() {
        return lastState;
    }

    /**
     * 
     * 
     * @param lastState
     *     The lastState
     */
    @JsonProperty("lastState")
    public void setLastState(ContainerState lastState) {
        this.lastState = lastState;
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
     *     The ready
     */
    @JsonProperty("ready")
    public Boolean getReady() {
        return ready;
    }

    /**
     * 
     * 
     * @param ready
     *     The ready
     */
    @JsonProperty("ready")
    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    /**
     * 
     * 
     * @return
     *     The restartCount
     */
    @JsonProperty("restartCount")
    public Integer getRestartCount() {
        return restartCount;
    }

    /**
     * 
     * 
     * @param restartCount
     *     The restartCount
     */
    @JsonProperty("restartCount")
    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    /**
     * 
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public ContainerState getState() {
        return state;
    }

    /**
     * 
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(ContainerState state) {
        this.state = state;
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
