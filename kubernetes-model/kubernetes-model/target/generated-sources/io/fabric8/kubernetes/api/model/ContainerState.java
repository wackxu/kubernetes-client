
package io.fabric8.kubernetes.api.model;

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
    "running",
    "terminated",
    "waiting"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ContainerState implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("running")
    @Valid
    private ContainerStateRunning running;
    /**
     * 
     * 
     */
    @JsonProperty("terminated")
    @Valid
    private ContainerStateTerminated terminated;
    /**
     * 
     * 
     */
    @JsonProperty("waiting")
    @Valid
    private ContainerStateWaiting waiting;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContainerState() {
    }

    /**
     * 
     * @param running
     * @param waiting
     * @param terminated
     */
    public ContainerState(ContainerStateRunning running, ContainerStateTerminated terminated, ContainerStateWaiting waiting) {
        this.running = running;
        this.terminated = terminated;
        this.waiting = waiting;
    }

    /**
     * 
     * 
     * @return
     *     The running
     */
    @JsonProperty("running")
    public ContainerStateRunning getRunning() {
        return running;
    }

    /**
     * 
     * 
     * @param running
     *     The running
     */
    @JsonProperty("running")
    public void setRunning(ContainerStateRunning running) {
        this.running = running;
    }

    /**
     * 
     * 
     * @return
     *     The terminated
     */
    @JsonProperty("terminated")
    public ContainerStateTerminated getTerminated() {
        return terminated;
    }

    /**
     * 
     * 
     * @param terminated
     *     The terminated
     */
    @JsonProperty("terminated")
    public void setTerminated(ContainerStateTerminated terminated) {
        this.terminated = terminated;
    }

    /**
     * 
     * 
     * @return
     *     The waiting
     */
    @JsonProperty("waiting")
    public ContainerStateWaiting getWaiting() {
        return waiting;
    }

    /**
     * 
     * 
     * @param waiting
     *     The waiting
     */
    @JsonProperty("waiting")
    public void setWaiting(ContainerStateWaiting waiting) {
        this.waiting = waiting;
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
