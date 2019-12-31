
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
    "binary",
    "configMaps",
    "contextDir",
    "dockerfile",
    "git",
    "images",
    "secrets",
    "sourceSecret",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("binary")
    @Valid
    private BinaryBuildSource binary;
    /**
     * 
     * 
     */
    @JsonProperty("configMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ConfigMapBuildSource> configMaps = new ArrayList<ConfigMapBuildSource>();
    /**
     * 
     * 
     */
    @JsonProperty("contextDir")
    private String contextDir;
    /**
     * 
     * 
     */
    @JsonProperty("dockerfile")
    private String dockerfile;
    /**
     * 
     * 
     */
    @JsonProperty("git")
    @Valid
    private GitBuildSource git;
    /**
     * 
     * 
     */
    @JsonProperty("images")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ImageSource> images = new ArrayList<ImageSource>();
    /**
     * 
     * 
     */
    @JsonProperty("secrets")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<SecretBuildSource> secrets = new ArrayList<SecretBuildSource>();
    /**
     * 
     * 
     */
    @JsonProperty("sourceSecret")
    @Valid
    private LocalObjectReference sourceSecret;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildSource() {
    }

    /**
     * 
     * @param sourceSecret
     * @param images
     * @param git
     * @param configMaps
     * @param binary
     * @param dockerfile
     * @param type
     * @param secrets
     * @param contextDir
     */
    public BuildSource(BinaryBuildSource binary, List<ConfigMapBuildSource> configMaps, String contextDir, String dockerfile, GitBuildSource git, List<ImageSource> images, List<SecretBuildSource> secrets, LocalObjectReference sourceSecret, String type) {
        this.binary = binary;
        this.configMaps = configMaps;
        this.contextDir = contextDir;
        this.dockerfile = dockerfile;
        this.git = git;
        this.images = images;
        this.secrets = secrets;
        this.sourceSecret = sourceSecret;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The binary
     */
    @JsonProperty("binary")
    public BinaryBuildSource getBinary() {
        return binary;
    }

    /**
     * 
     * 
     * @param binary
     *     The binary
     */
    @JsonProperty("binary")
    public void setBinary(BinaryBuildSource binary) {
        this.binary = binary;
    }

    /**
     * 
     * 
     * @return
     *     The configMaps
     */
    @JsonProperty("configMaps")
    public List<ConfigMapBuildSource> getConfigMaps() {
        return configMaps;
    }

    /**
     * 
     * 
     * @param configMaps
     *     The configMaps
     */
    @JsonProperty("configMaps")
    public void setConfigMaps(List<ConfigMapBuildSource> configMaps) {
        this.configMaps = configMaps;
    }

    /**
     * 
     * 
     * @return
     *     The contextDir
     */
    @JsonProperty("contextDir")
    public String getContextDir() {
        return contextDir;
    }

    /**
     * 
     * 
     * @param contextDir
     *     The contextDir
     */
    @JsonProperty("contextDir")
    public void setContextDir(String contextDir) {
        this.contextDir = contextDir;
    }

    /**
     * 
     * 
     * @return
     *     The dockerfile
     */
    @JsonProperty("dockerfile")
    public String getDockerfile() {
        return dockerfile;
    }

    /**
     * 
     * 
     * @param dockerfile
     *     The dockerfile
     */
    @JsonProperty("dockerfile")
    public void setDockerfile(String dockerfile) {
        this.dockerfile = dockerfile;
    }

    /**
     * 
     * 
     * @return
     *     The git
     */
    @JsonProperty("git")
    public GitBuildSource getGit() {
        return git;
    }

    /**
     * 
     * 
     * @param git
     *     The git
     */
    @JsonProperty("git")
    public void setGit(GitBuildSource git) {
        this.git = git;
    }

    /**
     * 
     * 
     * @return
     *     The images
     */
    @JsonProperty("images")
    public List<ImageSource> getImages() {
        return images;
    }

    /**
     * 
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(List<ImageSource> images) {
        this.images = images;
    }

    /**
     * 
     * 
     * @return
     *     The secrets
     */
    @JsonProperty("secrets")
    public List<SecretBuildSource> getSecrets() {
        return secrets;
    }

    /**
     * 
     * 
     * @param secrets
     *     The secrets
     */
    @JsonProperty("secrets")
    public void setSecrets(List<SecretBuildSource> secrets) {
        this.secrets = secrets;
    }

    /**
     * 
     * 
     * @return
     *     The sourceSecret
     */
    @JsonProperty("sourceSecret")
    public LocalObjectReference getSourceSecret() {
        return sourceSecret;
    }

    /**
     * 
     * 
     * @param sourceSecret
     *     The sourceSecret
     */
    @JsonProperty("sourceSecret")
    public void setSourceSecret(LocalObjectReference sourceSecret) {
        this.sourceSecret = sourceSecret;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
