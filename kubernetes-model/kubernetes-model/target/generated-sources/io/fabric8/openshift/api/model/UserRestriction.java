
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
import io.fabric8.kubernetes.api.model.LabelSelector;
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
    "groups",
    "labels",
    "users"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class UserRestriction implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("groups")
    @Valid
    private List<String> groups = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("labels")
    @Valid
    private List<LabelSelector> labels = new ArrayList<LabelSelector>();
    /**
     * 
     * 
     */
    @JsonProperty("users")
    @Valid
    private List<String> users = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserRestriction() {
    }

    /**
     * 
     * @param groups
     * @param users
     * @param labels
     */
    public UserRestriction(List<String> groups, List<LabelSelector> labels, List<String> users) {
        this.groups = groups;
        this.labels = labels;
        this.users = users;
    }

    /**
     * 
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public List<String> getGroups() {
        return groups;
    }

    /**
     * 
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    /**
     * 
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public List<LabelSelector> getLabels() {
        return labels;
    }

    /**
     * 
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(List<LabelSelector> labels) {
        this.labels = labels;
    }

    /**
     * 
     * 
     * @return
     *     The users
     */
    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    /**
     * 
     * 
     * @param users
     *     The users
     */
    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
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
