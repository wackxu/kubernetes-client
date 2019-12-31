
package io.fabric8.kubernetes.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "args",
    "command",
    "env",
    "envFrom",
    "image",
    "imagePullPolicy",
    "lifecycle",
    "livenessProbe",
    "name",
    "ports",
    "readinessProbe",
    "resources",
    "securityContext",
    "stdin",
    "stdinOnce",
    "terminationMessagePath",
    "terminationMessagePolicy",
    "tty",
    "volumeDevices",
    "volumeMounts",
    "workingDir"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Container implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("args")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> args = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("command")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> command = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("env")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EnvVar> env = new ArrayList<EnvVar>();
    /**
     * 
     * 
     */
    @JsonProperty("envFrom")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EnvFromSource> envFrom = new ArrayList<EnvFromSource>();
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
    @JsonProperty("imagePullPolicy")
    private String imagePullPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("lifecycle")
    @Valid
    private Lifecycle lifecycle;
    /**
     * 
     * 
     */
    @JsonProperty("livenessProbe")
    @Valid
    private Probe livenessProbe;
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
    @JsonProperty("ports")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ContainerPort> ports = new ArrayList<ContainerPort>();
    /**
     * 
     * 
     */
    @JsonProperty("readinessProbe")
    @Valid
    private Probe readinessProbe;
    /**
     * 
     * 
     */
    @JsonProperty("resources")
    @Valid
    private ResourceRequirements resources;
    /**
     * 
     * 
     */
    @JsonProperty("securityContext")
    @Valid
    private SecurityContext securityContext;
    /**
     * 
     * 
     */
    @JsonProperty("stdin")
    private Boolean stdin;
    /**
     * 
     * 
     */
    @JsonProperty("stdinOnce")
    private Boolean stdinOnce;
    /**
     * 
     * 
     */
    @JsonProperty("terminationMessagePath")
    private String terminationMessagePath;
    /**
     * 
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    private String terminationMessagePolicy;
    /**
     * 
     * 
     */
    @JsonProperty("tty")
    private Boolean tty;
    /**
     * 
     * 
     */
    @JsonProperty("volumeDevices")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<VolumeDevice> volumeDevices = new ArrayList<VolumeDevice>();
    /**
     * 
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
    /**
     * 
     * 
     */
    @JsonProperty("workingDir")
    private String workingDir;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Container() {
    }

    /**
     * 
     * @param volumeDevices
     * @param image
     * @param imagePullPolicy
     * @param livenessProbe
     * @param stdin
     * @param terminationMessagePolicy
     * @param terminationMessagePath
     * @param workingDir
     * @param resources
     * @param securityContext
     * @param env
     * @param ports
     * @param command
     * @param volumeMounts
     * @param args
     * @param lifecycle
     * @param name
     * @param tty
     * @param readinessProbe
     * @param stdinOnce
     * @param envFrom
     */
    public Container(List<String> args, List<String> command, List<EnvVar> env, List<EnvFromSource> envFrom, String image, String imagePullPolicy, Lifecycle lifecycle, Probe livenessProbe, String name, List<ContainerPort> ports, Probe readinessProbe, ResourceRequirements resources, SecurityContext securityContext, Boolean stdin, Boolean stdinOnce, String terminationMessagePath, String terminationMessagePolicy, Boolean tty, List<VolumeDevice> volumeDevices, List<VolumeMount> volumeMounts, String workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.lifecycle = lifecycle;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.stdin = stdin;
        this.stdinOnce = stdinOnce;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.tty = tty;
        this.volumeDevices = volumeDevices;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    /**
     * 
     * 
     * @return
     *     The args
     */
    @JsonProperty("args")
    public List<String> getArgs() {
        return args;
    }

    /**
     * 
     * 
     * @param args
     *     The args
     */
    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * 
     * 
     * @return
     *     The command
     */
    @JsonProperty("command")
    public List<String> getCommand() {
        return command;
    }

    /**
     * 
     * 
     * @param command
     *     The command
     */
    @JsonProperty("command")
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * 
     * 
     * @return
     *     The env
     */
    @JsonProperty("env")
    public List<EnvVar> getEnv() {
        return env;
    }

    /**
     * 
     * 
     * @param env
     *     The env
     */
    @JsonProperty("env")
    public void setEnv(List<EnvVar> env) {
        this.env = env;
    }

    /**
     * 
     * 
     * @return
     *     The envFrom
     */
    @JsonProperty("envFrom")
    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    /**
     * 
     * 
     * @param envFrom
     *     The envFrom
     */
    @JsonProperty("envFrom")
    public void setEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
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
     *     The imagePullPolicy
     */
    @JsonProperty("imagePullPolicy")
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    /**
     * 
     * 
     * @param imagePullPolicy
     *     The imagePullPolicy
     */
    @JsonProperty("imagePullPolicy")
    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The lifecycle
     */
    @JsonProperty("lifecycle")
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * 
     * 
     * @param lifecycle
     *     The lifecycle
     */
    @JsonProperty("lifecycle")
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * 
     * 
     * @return
     *     The livenessProbe
     */
    @JsonProperty("livenessProbe")
    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    /**
     * 
     * 
     * @param livenessProbe
     *     The livenessProbe
     */
    @JsonProperty("livenessProbe")
    public void setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
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
     *     The ports
     */
    @JsonProperty("ports")
    public List<ContainerPort> getPorts() {
        return ports;
    }

    /**
     * 
     * 
     * @param ports
     *     The ports
     */
    @JsonProperty("ports")
    public void setPorts(List<ContainerPort> ports) {
        this.ports = ports;
    }

    /**
     * 
     * 
     * @return
     *     The readinessProbe
     */
    @JsonProperty("readinessProbe")
    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    /**
     * 
     * 
     * @param readinessProbe
     *     The readinessProbe
     */
    @JsonProperty("readinessProbe")
    public void setReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * 
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public ResourceRequirements getResources() {
        return resources;
    }

    /**
     * 
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    /**
     * 
     * 
     * @return
     *     The securityContext
     */
    @JsonProperty("securityContext")
    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * 
     * 
     * @param securityContext
     *     The securityContext
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * 
     * 
     * @return
     *     The stdin
     */
    @JsonProperty("stdin")
    public Boolean getStdin() {
        return stdin;
    }

    /**
     * 
     * 
     * @param stdin
     *     The stdin
     */
    @JsonProperty("stdin")
    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    /**
     * 
     * 
     * @return
     *     The stdinOnce
     */
    @JsonProperty("stdinOnce")
    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    /**
     * 
     * 
     * @param stdinOnce
     *     The stdinOnce
     */
    @JsonProperty("stdinOnce")
    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    /**
     * 
     * 
     * @return
     *     The terminationMessagePath
     */
    @JsonProperty("terminationMessagePath")
    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    /**
     * 
     * 
     * @param terminationMessagePath
     *     The terminationMessagePath
     */
    @JsonProperty("terminationMessagePath")
    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    /**
     * 
     * 
     * @return
     *     The terminationMessagePolicy
     */
    @JsonProperty("terminationMessagePolicy")
    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    /**
     * 
     * 
     * @param terminationMessagePolicy
     *     The terminationMessagePolicy
     */
    @JsonProperty("terminationMessagePolicy")
    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    /**
     * 
     * 
     * @return
     *     The tty
     */
    @JsonProperty("tty")
    public Boolean getTty() {
        return tty;
    }

    /**
     * 
     * 
     * @param tty
     *     The tty
     */
    @JsonProperty("tty")
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    /**
     * 
     * 
     * @return
     *     The volumeDevices
     */
    @JsonProperty("volumeDevices")
    public List<VolumeDevice> getVolumeDevices() {
        return volumeDevices;
    }

    /**
     * 
     * 
     * @param volumeDevices
     *     The volumeDevices
     */
    @JsonProperty("volumeDevices")
    public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    /**
     * 
     * 
     * @return
     *     The volumeMounts
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * 
     * 
     * @param volumeMounts
     *     The volumeMounts
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    /**
     * 
     * 
     * @return
     *     The workingDir
     */
    @JsonProperty("workingDir")
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * 
     * 
     * @param workingDir
     *     The workingDir
     */
    @JsonProperty("workingDir")
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
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
