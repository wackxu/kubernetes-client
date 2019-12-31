
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
    "causes",
    "group",
    "name",
    "retryAfterSeconds",
    "uid"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class StatusDetails implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("causes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<StatusCause> causes = new ArrayList<StatusCause>();
    /**
     * 
     * 
     */
    @JsonProperty("group")
    private String group;
    /**
     * 
     * 
     */
    @JsonProperty("kind")
    private String kind;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * 
     */
    @JsonProperty("retryAfterSeconds")
    private Integer retryAfterSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("uid")
    private String uid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StatusDetails() {
    }

    /**
     * 
     * @param uid
     * @param kind
     * @param causes
     * @param retryAfterSeconds
     * @param name
     * @param group
     */
    public StatusDetails(List<StatusCause> causes, String group, String kind, String name, Integer retryAfterSeconds, String uid) {
        this.causes = causes;
        this.group = group;
        this.kind = kind;
        this.name = name;
        this.retryAfterSeconds = retryAfterSeconds;
        this.uid = uid;
    }

    /**
     * 
     * 
     * @return
     *     The causes
     */
    @JsonProperty("causes")
    public List<StatusCause> getCauses() {
        return causes;
    }

    /**
     * 
     * 
     * @param causes
     *     The causes
     */
    @JsonProperty("causes")
    public void setCauses(List<StatusCause> causes) {
        this.causes = causes;
    }

    /**
     * 
     * 
     * @return
     *     The group
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * 
     * 
     * @param group
     *     The group
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * 
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
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
     *     The retryAfterSeconds
     */
    @JsonProperty("retryAfterSeconds")
    public Integer getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    /**
     * 
     * 
     * @param retryAfterSeconds
     *     The retryAfterSeconds
     */
    @JsonProperty("retryAfterSeconds")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The uid
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * 
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
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
