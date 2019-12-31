
package io.fabric8.openshift.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.HasMetadata;
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
    "content",
    "groups",
    "isNonResourceURL",
    "namespace",
    "path",
    "resource",
    "resourceAPIGroup",
    "resourceAPIVersion",
    "resourceName",
    "scopes",
    "user",
    "verb"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class SubjectAccessReview implements KubernetesResource
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private String apiVersion = "authorization.openshift.io/v1";
    /**
     * 
     * 
     */
    @JsonProperty("content")
    @Valid
    private HasMetadata content;
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
    @JsonProperty("isNonResourceURL")
    private Boolean isNonResourceURL;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "SubjectAccessReview";
    /**
     * 
     * 
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 
     * 
     */
    @JsonProperty("path")
    private String path;
    /**
     * 
     * 
     */
    @JsonProperty("resource")
    private String resource;
    /**
     * 
     * 
     */
    @JsonProperty("resourceAPIGroup")
    private String resourceAPIGroup;
    /**
     * 
     * 
     */
    @JsonProperty("resourceAPIVersion")
    private String resourceAPIVersion;
    /**
     * 
     * 
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * 
     * 
     */
    @JsonProperty("scopes")
    @Valid
    private List<String> scopes = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("user")
    private String user;
    /**
     * 
     * 
     */
    @JsonProperty("verb")
    private String verb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubjectAccessReview() {
    }

    /**
     * 
     * @param isNonResourceURL
     * @param resource
     * @param kind
     * @param resourceAPIGroup
     * @param verb
     * @param groups
     * @param resourceName
     * @param content
     * @param path
     * @param apiVersion
     * @param namespace
     * @param resourceAPIVersion
     * @param scopes
     * @param user
     */
    public SubjectAccessReview(String apiVersion, HasMetadata content, List<String> groups, Boolean isNonResourceURL, String kind, String namespace, String path, String resource, String resourceAPIGroup, String resourceAPIVersion, String resourceName, List<String> scopes, String user, String verb) {
        this.apiVersion = apiVersion;
        this.content = content;
        this.groups = groups;
        this.isNonResourceURL = isNonResourceURL;
        this.kind = kind;
        this.namespace = namespace;
        this.path = path;
        this.resource = resource;
        this.resourceAPIGroup = resourceAPIGroup;
        this.resourceAPIVersion = resourceAPIVersion;
        this.resourceName = resourceName;
        this.scopes = scopes;
        this.user = user;
        this.verb = verb;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * 
     * @return
     *     The content
     */
    @JsonProperty("content")
    public HasMetadata getContent() {
        return content;
    }

    /**
     * 
     * 
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(HasMetadata content) {
        this.content = content;
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
     *     The isNonResourceURL
     */
    @JsonProperty("isNonResourceURL")
    public Boolean getIsNonResourceURL() {
        return isNonResourceURL;
    }

    /**
     * 
     * 
     * @param isNonResourceURL
     *     The isNonResourceURL
     */
    @JsonProperty("isNonResourceURL")
    public void setIsNonResourceURL(Boolean isNonResourceURL) {
        this.isNonResourceURL = isNonResourceURL;
    }

    /**
     * 
     * (Required)
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
     * (Required)
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
     *     The namespace
     */
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * 
     * 
     * @param namespace
     *     The namespace
     */
    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * 
     * 
     * @return
     *     The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * 
     * 
     * @param path
     *     The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 
     * 
     * @return
     *     The resource
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * 
     * 
     * @param resource
     *     The resource
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * 
     * 
     * @return
     *     The resourceAPIGroup
     */
    @JsonProperty("resourceAPIGroup")
    public String getResourceAPIGroup() {
        return resourceAPIGroup;
    }

    /**
     * 
     * 
     * @param resourceAPIGroup
     *     The resourceAPIGroup
     */
    @JsonProperty("resourceAPIGroup")
    public void setResourceAPIGroup(String resourceAPIGroup) {
        this.resourceAPIGroup = resourceAPIGroup;
    }

    /**
     * 
     * 
     * @return
     *     The resourceAPIVersion
     */
    @JsonProperty("resourceAPIVersion")
    public String getResourceAPIVersion() {
        return resourceAPIVersion;
    }

    /**
     * 
     * 
     * @param resourceAPIVersion
     *     The resourceAPIVersion
     */
    @JsonProperty("resourceAPIVersion")
    public void setResourceAPIVersion(String resourceAPIVersion) {
        this.resourceAPIVersion = resourceAPIVersion;
    }

    /**
     * 
     * 
     * @return
     *     The resourceName
     */
    @JsonProperty("resourceName")
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 
     * 
     * @param resourceName
     *     The resourceName
     */
    @JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 
     * 
     * @return
     *     The scopes
     */
    @JsonProperty("scopes")
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * 
     * 
     * @param scopes
     *     The scopes
     */
    @JsonProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * 
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 
     * 
     * @return
     *     The verb
     */
    @JsonProperty("verb")
    public String getVerb() {
        return verb;
    }

    /**
     * 
     * 
     * @param verb
     *     The verb
     */
    @JsonProperty("verb")
    public void setVerb(String verb) {
        this.verb = verb;
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
