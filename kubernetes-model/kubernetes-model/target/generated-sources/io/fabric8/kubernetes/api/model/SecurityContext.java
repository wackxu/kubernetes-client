
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
    "allowPrivilegeEscalation",
    "capabilities",
    "privileged",
    "procMount",
    "readOnlyRootFilesystem",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SecurityContext implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    private Boolean allowPrivilegeEscalation;
    /**
     * 
     * 
     */
    @JsonProperty("capabilities")
    @Valid
    private Capabilities capabilities;
    /**
     * 
     * 
     */
    @JsonProperty("privileged")
    private Boolean privileged;
    /**
     * 
     * 
     */
    @JsonProperty("procMount")
    private String procMount;
    /**
     * 
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    private Boolean readOnlyRootFilesystem;
    /**
     * 
     * 
     */
    @JsonProperty("runAsGroup")
    private Long runAsGroup;
    /**
     * 
     * 
     */
    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;
    /**
     * 
     * 
     */
    @JsonProperty("runAsUser")
    private Long runAsUser;
    /**
     * 
     * 
     */
    @JsonProperty("seLinuxOptions")
    @Valid
    private SELinuxOptions seLinuxOptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecurityContext() {
    }

    /**
     * 
     * @param privileged
     * @param runAsUser
     * @param capabilities
     * @param seLinuxOptions
     * @param procMount
     * @param allowPrivilegeEscalation
     * @param runAsGroup
     * @param runAsNonRoot
     * @param readOnlyRootFilesystem
     */
    public SecurityContext(Boolean allowPrivilegeEscalation, Capabilities capabilities, Boolean privileged, String procMount, Boolean readOnlyRootFilesystem, Long runAsGroup, Boolean runAsNonRoot, Long runAsUser, SELinuxOptions seLinuxOptions) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
    }

    /**
     * 
     * 
     * @return
     *     The allowPrivilegeEscalation
     */
    @JsonProperty("allowPrivilegeEscalation")
    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    /**
     * 
     * 
     * @param allowPrivilegeEscalation
     *     The allowPrivilegeEscalation
     */
    @JsonProperty("allowPrivilegeEscalation")
    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    /**
     * 
     * 
     * @return
     *     The capabilities
     */
    @JsonProperty("capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * 
     * 
     * @param capabilities
     *     The capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * 
     * 
     * @return
     *     The privileged
     */
    @JsonProperty("privileged")
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * 
     * 
     * @param privileged
     *     The privileged
     */
    @JsonProperty("privileged")
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * 
     * 
     * @return
     *     The procMount
     */
    @JsonProperty("procMount")
    public String getProcMount() {
        return procMount;
    }

    /**
     * 
     * 
     * @param procMount
     *     The procMount
     */
    @JsonProperty("procMount")
    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    /**
     * 
     * 
     * @return
     *     The readOnlyRootFilesystem
     */
    @JsonProperty("readOnlyRootFilesystem")
    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    /**
     * 
     * 
     * @param readOnlyRootFilesystem
     *     The readOnlyRootFilesystem
     */
    @JsonProperty("readOnlyRootFilesystem")
    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    /**
     * 
     * 
     * @return
     *     The runAsGroup
     */
    @JsonProperty("runAsGroup")
    public Long getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * 
     * 
     * @param runAsGroup
     *     The runAsGroup
     */
    @JsonProperty("runAsGroup")
    public void setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * 
     * 
     * @return
     *     The runAsNonRoot
     */
    @JsonProperty("runAsNonRoot")
    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    /**
     * 
     * 
     * @param runAsNonRoot
     *     The runAsNonRoot
     */
    @JsonProperty("runAsNonRoot")
    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    /**
     * 
     * 
     * @return
     *     The runAsUser
     */
    @JsonProperty("runAsUser")
    public Long getRunAsUser() {
        return runAsUser;
    }

    /**
     * 
     * 
     * @param runAsUser
     *     The runAsUser
     */
    @JsonProperty("runAsUser")
    public void setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * 
     * 
     * @return
     *     The seLinuxOptions
     */
    @JsonProperty("seLinuxOptions")
    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    /**
     * 
     * 
     * @param seLinuxOptions
     *     The seLinuxOptions
     */
    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
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
