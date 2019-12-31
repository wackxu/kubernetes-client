
package io.fabric8.kubernetes.api.model.authorization;

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
    "nonResourceAttributes",
    "resourceAttributes",
    "uid",
    "user"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SubjectAccessReviewSpec implements KubernetesResource
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
    @JsonProperty("nonResourceAttributes")
    @Valid
    private NonResourceAttributes nonResourceAttributes;
    /**
     * 
     * 
     */
    @JsonProperty("resourceAttributes")
    @Valid
    private ResourceAttributes resourceAttributes;
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
    @JsonProperty("user")
    private java.lang.String user;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubjectAccessReviewSpec() {
    }

    /**
     * 
     * @param uid
     * @param nonResourceAttributes
     * @param extra
     * @param groups
     * @param resourceAttributes
     * @param user
     */
    public SubjectAccessReviewSpec(Map<String, ArrayList<String>> extra, List<java.lang.String> groups, NonResourceAttributes nonResourceAttributes, ResourceAttributes resourceAttributes, java.lang.String uid, java.lang.String user) {
        this.extra = extra;
        this.groups = groups;
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
        this.uid = uid;
        this.user = user;
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
     *     The nonResourceAttributes
     */
    @JsonProperty("nonResourceAttributes")
    public NonResourceAttributes getNonResourceAttributes() {
        return nonResourceAttributes;
    }

    /**
     * 
     * 
     * @param nonResourceAttributes
     *     The nonResourceAttributes
     */
    @JsonProperty("nonResourceAttributes")
    public void setNonResourceAttributes(NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
    }

    /**
     * 
     * 
     * @return
     *     The resourceAttributes
     */
    @JsonProperty("resourceAttributes")
    public ResourceAttributes getResourceAttributes() {
        return resourceAttributes;
    }

    /**
     * 
     * 
     * @param resourceAttributes
     *     The resourceAttributes
     */
    @JsonProperty("resourceAttributes")
    public void setResourceAttributes(ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
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
     *     The user
     */
    @JsonProperty("user")
    public java.lang.String getUser() {
        return user;
    }

    /**
     * 
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(java.lang.String user) {
        this.user = user;
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
