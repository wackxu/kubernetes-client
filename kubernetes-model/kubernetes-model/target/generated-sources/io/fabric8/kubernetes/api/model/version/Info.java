
package io.fabric8.kubernetes.api.model.version;

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
import io.fabric8.kubernetes.api.model.KubernetesResource;
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
    "buildDate",
    "compiler",
    "gitCommit",
    "gitTreeState",
    "gitVersion",
    "goVersion",
    "major",
    "minor",
    "platform"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Info implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("buildDate")
    private String buildDate;
    /**
     * 
     * 
     */
    @JsonProperty("compiler")
    private String compiler;
    /**
     * 
     * 
     */
    @JsonProperty("gitCommit")
    private String gitCommit;
    /**
     * 
     * 
     */
    @JsonProperty("gitTreeState")
    private String gitTreeState;
    /**
     * 
     * 
     */
    @JsonProperty("gitVersion")
    private String gitVersion;
    /**
     * 
     * 
     */
    @JsonProperty("goVersion")
    private String goVersion;
    /**
     * 
     * 
     */
    @JsonProperty("major")
    private String major;
    /**
     * 
     * 
     */
    @JsonProperty("minor")
    private String minor;
    /**
     * 
     * 
     */
    @JsonProperty("platform")
    private String platform;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Info() {
    }

    /**
     * 
     * @param gitVersion
     * @param gitCommit
     * @param major
     * @param minor
     * @param goVersion
     * @param buildDate
     * @param compiler
     * @param gitTreeState
     * @param platform
     */
    public Info(String buildDate, String compiler, String gitCommit, String gitTreeState, String gitVersion, String goVersion, String major, String minor, String platform) {
        this.buildDate = buildDate;
        this.compiler = compiler;
        this.gitCommit = gitCommit;
        this.gitTreeState = gitTreeState;
        this.gitVersion = gitVersion;
        this.goVersion = goVersion;
        this.major = major;
        this.minor = minor;
        this.platform = platform;
    }

    /**
     * 
     * 
     * @return
     *     The buildDate
     */
    @JsonProperty("buildDate")
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * 
     * 
     * @param buildDate
     *     The buildDate
     */
    @JsonProperty("buildDate")
    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * 
     * 
     * @return
     *     The compiler
     */
    @JsonProperty("compiler")
    public String getCompiler() {
        return compiler;
    }

    /**
     * 
     * 
     * @param compiler
     *     The compiler
     */
    @JsonProperty("compiler")
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    /**
     * 
     * 
     * @return
     *     The gitCommit
     */
    @JsonProperty("gitCommit")
    public String getGitCommit() {
        return gitCommit;
    }

    /**
     * 
     * 
     * @param gitCommit
     *     The gitCommit
     */
    @JsonProperty("gitCommit")
    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    /**
     * 
     * 
     * @return
     *     The gitTreeState
     */
    @JsonProperty("gitTreeState")
    public String getGitTreeState() {
        return gitTreeState;
    }

    /**
     * 
     * 
     * @param gitTreeState
     *     The gitTreeState
     */
    @JsonProperty("gitTreeState")
    public void setGitTreeState(String gitTreeState) {
        this.gitTreeState = gitTreeState;
    }

    /**
     * 
     * 
     * @return
     *     The gitVersion
     */
    @JsonProperty("gitVersion")
    public String getGitVersion() {
        return gitVersion;
    }

    /**
     * 
     * 
     * @param gitVersion
     *     The gitVersion
     */
    @JsonProperty("gitVersion")
    public void setGitVersion(String gitVersion) {
        this.gitVersion = gitVersion;
    }

    /**
     * 
     * 
     * @return
     *     The goVersion
     */
    @JsonProperty("goVersion")
    public String getGoVersion() {
        return goVersion;
    }

    /**
     * 
     * 
     * @param goVersion
     *     The goVersion
     */
    @JsonProperty("goVersion")
    public void setGoVersion(String goVersion) {
        this.goVersion = goVersion;
    }

    /**
     * 
     * 
     * @return
     *     The major
     */
    @JsonProperty("major")
    public String getMajor() {
        return major;
    }

    /**
     * 
     * 
     * @param major
     *     The major
     */
    @JsonProperty("major")
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 
     * 
     * @return
     *     The minor
     */
    @JsonProperty("minor")
    public String getMinor() {
        return minor;
    }

    /**
     * 
     * 
     * @param minor
     *     The minor
     */
    @JsonProperty("minor")
    public void setMinor(String minor) {
        this.minor = minor;
    }

    /**
     * 
     * 
     * @return
     *     The platform
     */
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     * 
     * @param platform
     *     The platform
     */
    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
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
