
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
    "automatic",
    "containerNames",
    "from",
    "lastTriggeredImage"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DeploymentTriggerImageChangeParams implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("automatic")
    private Boolean automatic;
    /**
     * 
     * 
     */
    @JsonProperty("containerNames")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> containerNames = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("from")
    @Valid
    private ObjectReference from;
    /**
     * 
     * 
     */
    @JsonProperty("lastTriggeredImage")
    private String lastTriggeredImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeploymentTriggerImageChangeParams() {
    }

    /**
     * 
     * @param lastTriggeredImage
     * @param automatic
     * @param from
     * @param containerNames
     */
    public DeploymentTriggerImageChangeParams(Boolean automatic, List<String> containerNames, ObjectReference from, String lastTriggeredImage) {
        this.automatic = automatic;
        this.containerNames = containerNames;
        this.from = from;
        this.lastTriggeredImage = lastTriggeredImage;
    }

    /**
     * 
     * 
     * @return
     *     The automatic
     */
    @JsonProperty("automatic")
    public Boolean getAutomatic() {
        return automatic;
    }

    /**
     * 
     * 
     * @param automatic
     *     The automatic
     */
    @JsonProperty("automatic")
    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

    /**
     * 
     * 
     * @return
     *     The containerNames
     */
    @JsonProperty("containerNames")
    public List<String> getContainerNames() {
        return containerNames;
    }

    /**
     * 
     * 
     * @param containerNames
     *     The containerNames
     */
    @JsonProperty("containerNames")
    public void setContainerNames(List<String> containerNames) {
        this.containerNames = containerNames;
    }

    /**
     * 
     * 
     * @return
     *     The from
     */
    @JsonProperty("from")
    public ObjectReference getFrom() {
        return from;
    }

    /**
     * 
     * 
     * @param from
     *     The from
     */
    @JsonProperty("from")
    public void setFrom(ObjectReference from) {
        this.from = from;
    }

    /**
     * 
     * 
     * @return
     *     The lastTriggeredImage
     */
    @JsonProperty("lastTriggeredImage")
    public String getLastTriggeredImage() {
        return lastTriggeredImage;
    }

    /**
     * 
     * 
     * @param lastTriggeredImage
     *     The lastTriggeredImage
     */
    @JsonProperty("lastTriggeredImage")
    public void setLastTriggeredImage(String lastTriggeredImage) {
        this.lastTriggeredImage = lastTriggeredImage;
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
