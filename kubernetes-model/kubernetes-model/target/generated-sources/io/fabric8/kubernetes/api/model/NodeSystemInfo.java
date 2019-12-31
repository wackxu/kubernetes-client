
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
    "architecture",
    "bootID",
    "containerRuntimeVersion",
    "kernelVersion",
    "kubeProxyVersion",
    "kubeletVersion",
    "machineID",
    "operatingSystem",
    "osImage",
    "systemUUID"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class NodeSystemInfo implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("architecture")
    private String architecture;
    /**
     * 
     * 
     */
    @JsonProperty("bootID")
    private String bootID;
    /**
     * 
     * 
     */
    @JsonProperty("containerRuntimeVersion")
    private String containerRuntimeVersion;
    /**
     * 
     * 
     */
    @JsonProperty("kernelVersion")
    private String kernelVersion;
    /**
     * 
     * 
     */
    @JsonProperty("kubeProxyVersion")
    private String kubeProxyVersion;
    /**
     * 
     * 
     */
    @JsonProperty("kubeletVersion")
    private String kubeletVersion;
    /**
     * 
     * 
     */
    @JsonProperty("machineID")
    private String machineID;
    /**
     * 
     * 
     */
    @JsonProperty("operatingSystem")
    private String operatingSystem;
    /**
     * 
     * 
     */
    @JsonProperty("osImage")
    private String osImage;
    /**
     * 
     * 
     */
    @JsonProperty("systemUUID")
    private String systemUUID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NodeSystemInfo() {
    }

    /**
     * 
     * @param machineID
     * @param bootID
     * @param containerRuntimeVersion
     * @param kernelVersion
     * @param kubeletVersion
     * @param systemUUID
     * @param kubeProxyVersion
     * @param operatingSystem
     * @param architecture
     * @param osImage
     */
    public NodeSystemInfo(String architecture, String bootID, String containerRuntimeVersion, String kernelVersion, String kubeProxyVersion, String kubeletVersion, String machineID, String operatingSystem, String osImage, String systemUUID) {
        this.architecture = architecture;
        this.bootID = bootID;
        this.containerRuntimeVersion = containerRuntimeVersion;
        this.kernelVersion = kernelVersion;
        this.kubeProxyVersion = kubeProxyVersion;
        this.kubeletVersion = kubeletVersion;
        this.machineID = machineID;
        this.operatingSystem = operatingSystem;
        this.osImage = osImage;
        this.systemUUID = systemUUID;
    }

    /**
     * 
     * 
     * @return
     *     The architecture
     */
    @JsonProperty("architecture")
    public String getArchitecture() {
        return architecture;
    }

    /**
     * 
     * 
     * @param architecture
     *     The architecture
     */
    @JsonProperty("architecture")
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * 
     * 
     * @return
     *     The bootID
     */
    @JsonProperty("bootID")
    public String getBootID() {
        return bootID;
    }

    /**
     * 
     * 
     * @param bootID
     *     The bootID
     */
    @JsonProperty("bootID")
    public void setBootID(String bootID) {
        this.bootID = bootID;
    }

    /**
     * 
     * 
     * @return
     *     The containerRuntimeVersion
     */
    @JsonProperty("containerRuntimeVersion")
    public String getContainerRuntimeVersion() {
        return containerRuntimeVersion;
    }

    /**
     * 
     * 
     * @param containerRuntimeVersion
     *     The containerRuntimeVersion
     */
    @JsonProperty("containerRuntimeVersion")
    public void setContainerRuntimeVersion(String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
    }

    /**
     * 
     * 
     * @return
     *     The kernelVersion
     */
    @JsonProperty("kernelVersion")
    public String getKernelVersion() {
        return kernelVersion;
    }

    /**
     * 
     * 
     * @param kernelVersion
     *     The kernelVersion
     */
    @JsonProperty("kernelVersion")
    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    /**
     * 
     * 
     * @return
     *     The kubeProxyVersion
     */
    @JsonProperty("kubeProxyVersion")
    public String getKubeProxyVersion() {
        return kubeProxyVersion;
    }

    /**
     * 
     * 
     * @param kubeProxyVersion
     *     The kubeProxyVersion
     */
    @JsonProperty("kubeProxyVersion")
    public void setKubeProxyVersion(String kubeProxyVersion) {
        this.kubeProxyVersion = kubeProxyVersion;
    }

    /**
     * 
     * 
     * @return
     *     The kubeletVersion
     */
    @JsonProperty("kubeletVersion")
    public String getKubeletVersion() {
        return kubeletVersion;
    }

    /**
     * 
     * 
     * @param kubeletVersion
     *     The kubeletVersion
     */
    @JsonProperty("kubeletVersion")
    public void setKubeletVersion(String kubeletVersion) {
        this.kubeletVersion = kubeletVersion;
    }

    /**
     * 
     * 
     * @return
     *     The machineID
     */
    @JsonProperty("machineID")
    public String getMachineID() {
        return machineID;
    }

    /**
     * 
     * 
     * @param machineID
     *     The machineID
     */
    @JsonProperty("machineID")
    public void setMachineID(String machineID) {
        this.machineID = machineID;
    }

    /**
     * 
     * 
     * @return
     *     The operatingSystem
     */
    @JsonProperty("operatingSystem")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * 
     * 
     * @param operatingSystem
     *     The operatingSystem
     */
    @JsonProperty("operatingSystem")
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * 
     * 
     * @return
     *     The osImage
     */
    @JsonProperty("osImage")
    public String getOsImage() {
        return osImage;
    }

    /**
     * 
     * 
     * @param osImage
     *     The osImage
     */
    @JsonProperty("osImage")
    public void setOsImage(String osImage) {
        this.osImage = osImage;
    }

    /**
     * 
     * 
     * @return
     *     The systemUUID
     */
    @JsonProperty("systemUUID")
    public String getSystemUUID() {
        return systemUUID;
    }

    /**
     * 
     * 
     * @param systemUUID
     *     The systemUUID
     */
    @JsonProperty("systemUUID")
    public void setSystemUUID(String systemUUID) {
        this.systemUUID = systemUUID;
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
