
package io.fabric8.openshift.api.model;

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
    "author",
    "commit",
    "committer",
    "message"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class GitSourceRevision implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("author")
    @Valid
    private SourceControlUser author;
    /**
     * 
     * 
     */
    @JsonProperty("commit")
    private String commit;
    /**
     * 
     * 
     */
    @JsonProperty("committer")
    @Valid
    private SourceControlUser committer;
    /**
     * 
     * 
     */
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitSourceRevision() {
    }

    /**
     * 
     * @param committer
     * @param author
     * @param commit
     * @param message
     */
    public GitSourceRevision(SourceControlUser author, String commit, SourceControlUser committer, String message) {
        this.author = author;
        this.commit = commit;
        this.committer = committer;
        this.message = message;
    }

    /**
     * 
     * 
     * @return
     *     The author
     */
    @JsonProperty("author")
    public SourceControlUser getAuthor() {
        return author;
    }

    /**
     * 
     * 
     * @param author
     *     The author
     */
    @JsonProperty("author")
    public void setAuthor(SourceControlUser author) {
        this.author = author;
    }

    /**
     * 
     * 
     * @return
     *     The commit
     */
    @JsonProperty("commit")
    public String getCommit() {
        return commit;
    }

    /**
     * 
     * 
     * @param commit
     *     The commit
     */
    @JsonProperty("commit")
    public void setCommit(String commit) {
        this.commit = commit;
    }

    /**
     * 
     * 
     * @return
     *     The committer
     */
    @JsonProperty("committer")
    public SourceControlUser getCommitter() {
        return committer;
    }

    /**
     * 
     * 
     * @param committer
     *     The committer
     */
    @JsonProperty("committer")
    public void setCommitter(SourceControlUser committer) {
        this.committer = committer;
    }

    /**
     * 
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
