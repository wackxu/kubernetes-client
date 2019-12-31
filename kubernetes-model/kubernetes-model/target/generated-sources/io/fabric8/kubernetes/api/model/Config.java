
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
    "clusters",
    "contexts",
    "current-context",
    "extensions",
    "preferences",
    "users"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Config implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("apiVersion")
    private String apiVersion;
    /**
     * 
     * 
     */
    @JsonProperty("clusters")
    @Valid
    private List<NamedCluster> clusters = new ArrayList<NamedCluster>();
    /**
     * 
     * 
     */
    @JsonProperty("contexts")
    @Valid
    private List<NamedContext> contexts = new ArrayList<NamedContext>();
    /**
     * 
     * 
     */
    @JsonProperty("current-context")
    private String currentContext;
    /**
     * 
     * 
     */
    @JsonProperty("extensions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<NamedExtension> extensions = new ArrayList<NamedExtension>();
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
    @JsonProperty("preferences")
    @Valid
    private Preferences preferences;
    /**
     * 
     * 
     */
    @JsonProperty("users")
    @Valid
    private List<NamedAuthInfo> users = new ArrayList<NamedAuthInfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Config() {
    }

    /**
     * 
     * @param extensions
     * @param preferences
     * @param apiVersion
     * @param currentContext
     * @param kind
     * @param contexts
     * @param clusters
     * @param users
     */
    public Config(String apiVersion, List<NamedCluster> clusters, List<NamedContext> contexts, String currentContext, List<NamedExtension> extensions, String kind, Preferences preferences, List<NamedAuthInfo> users) {
        this.apiVersion = apiVersion;
        this.clusters = clusters;
        this.contexts = contexts;
        this.currentContext = currentContext;
        this.extensions = extensions;
        this.kind = kind;
        this.preferences = preferences;
        this.users = users;
    }

    /**
     * 
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
     *     The clusters
     */
    @JsonProperty("clusters")
    public List<NamedCluster> getClusters() {
        return clusters;
    }

    /**
     * 
     * 
     * @param clusters
     *     The clusters
     */
    @JsonProperty("clusters")
    public void setClusters(List<NamedCluster> clusters) {
        this.clusters = clusters;
    }

    /**
     * 
     * 
     * @return
     *     The contexts
     */
    @JsonProperty("contexts")
    public List<NamedContext> getContexts() {
        return contexts;
    }

    /**
     * 
     * 
     * @param contexts
     *     The contexts
     */
    @JsonProperty("contexts")
    public void setContexts(List<NamedContext> contexts) {
        this.contexts = contexts;
    }

    /**
     * 
     * 
     * @return
     *     The currentContext
     */
    @JsonProperty("current-context")
    public String getCurrentContext() {
        return currentContext;
    }

    /**
     * 
     * 
     * @param currentContext
     *     The current-context
     */
    @JsonProperty("current-context")
    public void setCurrentContext(String currentContext) {
        this.currentContext = currentContext;
    }

    /**
     * 
     * 
     * @return
     *     The extensions
     */
    @JsonProperty("extensions")
    public List<NamedExtension> getExtensions() {
        return extensions;
    }

    /**
     * 
     * 
     * @param extensions
     *     The extensions
     */
    @JsonProperty("extensions")
    public void setExtensions(List<NamedExtension> extensions) {
        this.extensions = extensions;
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
     *     The preferences
     */
    @JsonProperty("preferences")
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * 
     * 
     * @param preferences
     *     The preferences
     */
    @JsonProperty("preferences")
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    /**
     * 
     * 
     * @return
     *     The users
     */
    @JsonProperty("users")
    public List<NamedAuthInfo> getUsers() {
        return users;
    }

    /**
     * 
     * 
     * @param users
     *     The users
     */
    @JsonProperty("users")
    public void setUsers(List<NamedAuthInfo> users) {
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
