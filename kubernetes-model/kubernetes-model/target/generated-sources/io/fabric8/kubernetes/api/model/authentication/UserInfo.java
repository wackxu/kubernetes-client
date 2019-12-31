
package io.fabric8.kubernetes.api.model.authentication;

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
    "extra",
    "groups",
    "uid",
    "username"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class UserInfo implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("extra")
    @Valid
    private Map<String, ArrayList<String>> extra;
    /**
     * 
     * 
     */
    @JsonProperty("groups")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> groups = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("uid")
    private java.lang.String uid;
    /**
     * 
     * 
     */
    @JsonProperty("username")
    private java.lang.String username;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserInfo() {
    }

    /**
     * 
     * @param uid
     * @param extra
     * @param groups
     * @param username
     */
    public UserInfo(Map<String, ArrayList<String>> extra, List<java.lang.String> groups, java.lang.String uid, java.lang.String username) {
        this.extra = extra;
        this.groups = groups;
        this.uid = uid;
        this.username = username;
    }

    /**
     * 
     * 
     * @return
     *     The extra
     */
    @JsonProperty("extra")
    public Map<String, ArrayList<String>> getExtra() {
        return extra;
    }

    /**
     * 
     * 
     * @param extra
     *     The extra
     */
    @JsonProperty("extra")
    public void setExtra(Map<String, ArrayList<String>> extra) {
        this.extra = extra;
    }

    /**
     * 
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public List<java.lang.String> getGroups() {
        return groups;
    }

    /**
     * 
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<java.lang.String> groups) {
        this.groups = groups;
    }

    /**
     * 
     * 
     * @return
     *     The uid
     */
    @JsonProperty("uid")
    public java.lang.String getUid() {
        return uid;
    }

    /**
     * 
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    /**
     * 
     * 
     * @return
     *     The username
     */
    @JsonProperty("username")
    public java.lang.String getUsername() {
        return username;
    }

    /**
     * 
     * 
     * @param username
     *     The username
     */
    @JsonProperty("username")
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
