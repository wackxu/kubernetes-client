
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
    "conditions",
    "containerStatuses",
    "hostIP",
    "initContainerStatuses",
    "message",
    "nominatedNodeName",
    "phase",
    "podIP",
    "qosClass",
    "reason",
    "startTime"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodStatus implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<PodCondition> conditions = new ArrayList<PodCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("containerStatuses")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ContainerStatus> containerStatuses = new ArrayList<ContainerStatus>();
    /**
     * 
     * 
     */
    @JsonProperty("hostIP")
    private java.lang.String hostIP;
    /**
     * 
     * 
     */
    @JsonProperty("initContainerStatuses")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ContainerStatus> initContainerStatuses = new ArrayList<ContainerStatus>();
    /**
     * 
     * 
     */
    @JsonProperty("message")
    private java.lang.String message;
    /**
     * 
     * 
     */
    @JsonProperty("nominatedNodeName")
    private java.lang.String nominatedNodeName;
    /**
     * 
     * 
     */
    @JsonProperty("phase")
    private java.lang.String phase;
    /**
     * 
     * 
     */
    @JsonProperty("podIP")
    private java.lang.String podIP;
    /**
     * 
     * 
     */
    @JsonProperty("qosClass")
    private java.lang.String qosClass;
    /**
     * 
     * 
     */
    @JsonProperty("reason")
    private java.lang.String reason;
    /**
     * 
     * 
     */
    @JsonProperty("startTime")
    @Valid
    private String startTime;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodStatus() {
    }

    /**
     * 
     * @param phase
     * @param reason
     * @param podIP
     * @param containerStatuses
     * @param hostIP
     * @param startTime
     * @param nominatedNodeName
     * @param qosClass
     * @param conditions
     * @param message
     * @param initContainerStatuses
     */
    public PodStatus(List<PodCondition> conditions, List<ContainerStatus> containerStatuses, java.lang.String hostIP, List<ContainerStatus> initContainerStatuses, java.lang.String message, java.lang.String nominatedNodeName, java.lang.String phase, java.lang.String podIP, java.lang.String qosClass, java.lang.String reason, String startTime) {
        this.conditions = conditions;
        this.containerStatuses = containerStatuses;
        this.hostIP = hostIP;
        this.initContainerStatuses = initContainerStatuses;
        this.message = message;
        this.nominatedNodeName = nominatedNodeName;
        this.phase = phase;
        this.podIP = podIP;
        this.qosClass = qosClass;
        this.reason = reason;
        this.startTime = startTime;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<PodCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<PodCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The containerStatuses
     */
    @JsonProperty("containerStatuses")
    public List<ContainerStatus> getContainerStatuses() {
        return containerStatuses;
    }

    /**
     * 
     * 
     * @param containerStatuses
     *     The containerStatuses
     */
    @JsonProperty("containerStatuses")
    public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    /**
     * 
     * 
     * @return
     *     The hostIP
     */
    @JsonProperty("hostIP")
    public java.lang.String getHostIP() {
        return hostIP;
    }

    /**
     * 
     * 
     * @param hostIP
     *     The hostIP
     */
    @JsonProperty("hostIP")
    public void setHostIP(java.lang.String hostIP) {
        this.hostIP = hostIP;
    }

    /**
     * 
     * 
     * @return
     *     The initContainerStatuses
     */
    @JsonProperty("initContainerStatuses")
    public List<ContainerStatus> getInitContainerStatuses() {
        return initContainerStatuses;
    }

    /**
     * 
     * 
     * @param initContainerStatuses
     *     The initContainerStatuses
     */
    @JsonProperty("initContainerStatuses")
    public void setInitContainerStatuses(List<ContainerStatus> initContainerStatuses) {
        this.initContainerStatuses = initContainerStatuses;
    }

    /**
     * 
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * 
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    /**
     * 
     * 
     * @return
     *     The nominatedNodeName
     */
    @JsonProperty("nominatedNodeName")
    public java.lang.String getNominatedNodeName() {
        return nominatedNodeName;
    }

    /**
     * 
     * 
     * @param nominatedNodeName
     *     The nominatedNodeName
     */
    @JsonProperty("nominatedNodeName")
    public void setNominatedNodeName(java.lang.String nominatedNodeName) {
        this.nominatedNodeName = nominatedNodeName;
    }

    /**
     * 
     * 
     * @return
     *     The phase
     */
    @JsonProperty("phase")
    public java.lang.String getPhase() {
        return phase;
    }

    /**
     * 
     * 
     * @param phase
     *     The phase
     */
    @JsonProperty("phase")
    public void setPhase(java.lang.String phase) {
        this.phase = phase;
    }

    /**
     * 
     * 
     * @return
     *     The podIP
     */
    @JsonProperty("podIP")
    public java.lang.String getPodIP() {
        return podIP;
    }

    /**
     * 
     * 
     * @param podIP
     *     The podIP
     */
    @JsonProperty("podIP")
    public void setPodIP(java.lang.String podIP) {
        this.podIP = podIP;
    }

    /**
     * 
     * 
     * @return
     *     The qosClass
     */
    @JsonProperty("qosClass")
    public java.lang.String getQosClass() {
        return qosClass;
    }

    /**
     * 
     * 
     * @param qosClass
     *     The qosClass
     */
    @JsonProperty("qosClass")
    public void setQosClass(java.lang.String qosClass) {
        this.qosClass = qosClass;
    }

    /**
     * 
     * 
     * @return
     *     The reason
     */
    @JsonProperty("reason")
    public java.lang.String getReason() {
        return reason;
    }

    /**
     * 
     * 
     * @param reason
     *     The reason
     */
    @JsonProperty("reason")
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    /**
     * 
     * 
     * @return
     *     The startTime
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * 
     * 
     * @param startTime
     *     The startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
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
