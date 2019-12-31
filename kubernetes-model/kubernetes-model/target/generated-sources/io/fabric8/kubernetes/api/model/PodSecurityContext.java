
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
    "fsGroup",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions",
    "supplementalGroups",
    "sysctls"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodSecurityContext implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("fsGroup")
    private Long fsGroup;
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
    /**
     * 
     * 
     */
    @JsonProperty("supplementalGroups")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<Long> supplementalGroups = new ArrayList<Long>();
    /**
     * 
     * 
     */
    @JsonProperty("sysctls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<Sysctl> sysctls = new ArrayList<Sysctl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodSecurityContext() {
    }

    /**
     * 
     * @param runAsUser
     * @param seLinuxOptions
     * @param fsGroup
     * @param supplementalGroups
     * @param runAsGroup
     * @param runAsNonRoot
     * @param sysctls
     */
    public PodSecurityContext(Long fsGroup, Long runAsGroup, Boolean runAsNonRoot, Long runAsUser, SELinuxOptions seLinuxOptions, List<Long> supplementalGroups, List<Sysctl> sysctls) {
        this.fsGroup = fsGroup;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.supplementalGroups = supplementalGroups;
        this.sysctls = sysctls;
    }

    /**
     * 
     * 
     * @return
     *     The fsGroup
     */
    @JsonProperty("fsGroup")
    public Long getFsGroup() {
        return fsGroup;
    }

    /**
     * 
     * 
     * @param fsGroup
     *     The fsGroup
     */
    @JsonProperty("fsGroup")
    public void setFsGroup(Long fsGroup) {
        this.fsGroup = fsGroup;
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

    /**
     * 
     * 
     * @return
     *     The supplementalGroups
     */
    @JsonProperty("supplementalGroups")
    public List<Long> getSupplementalGroups() {
        return supplementalGroups;
    }

    /**
     * 
     * 
     * @param supplementalGroups
     *     The supplementalGroups
     */
    @JsonProperty("supplementalGroups")
    public void setSupplementalGroups(List<Long> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    /**
     * 
     * 
     * @return
     *     The sysctls
     */
    @JsonProperty("sysctls")
    public List<Sysctl> getSysctls() {
        return sysctls;
    }

    /**
     * 
     * 
     * @param sysctls
     *     The sysctls
     */
    @JsonProperty("sysctls")
    public void setSysctls(List<Sysctl> sysctls) {
        this.sysctls = sysctls;
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
