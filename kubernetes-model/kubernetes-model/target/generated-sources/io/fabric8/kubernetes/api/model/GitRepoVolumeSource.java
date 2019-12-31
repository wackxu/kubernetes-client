
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
    "directory",
    "repository",
    "revision"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class GitRepoVolumeSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("directory")
    private String directory;
    /**
     * 
     * 
     */
    @JsonProperty("repository")
    private String repository;
    /**
     * 
     * 
     */
    @JsonProperty("revision")
    private String revision;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitRepoVolumeSource() {
    }

    /**
     * 
     * @param repository
     * @param directory
     * @param revision
     */
    public GitRepoVolumeSource(String directory, String repository, String revision) {
        this.directory = directory;
        this.repository = repository;
        this.revision = revision;
    }

    /**
     * 
     * 
     * @return
     *     The directory
     */
    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    /**
     * 
     * 
     * @param directory
     *     The directory
     */
    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * 
     * 
     * @return
     *     The repository
     */
    @JsonProperty("repository")
    public String getRepository() {
        return repository;
    }

    /**
     * 
     * 
     * @param repository
     *     The repository
     */
    @JsonProperty("repository")
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * 
     * 
     * @return
     *     The revision
     */
    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    /**
     * 
     * 
     * @param revision
     *     The revision
     */
    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
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
