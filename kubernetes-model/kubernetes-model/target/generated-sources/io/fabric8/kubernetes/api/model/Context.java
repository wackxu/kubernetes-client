
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
    "cluster",
    "extensions",
    "namespace",
    "user"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Context implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("cluster")
    private String cluster;
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
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 
     * 
     */
    @JsonProperty("user")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Context() {
    }

    /**
     * 
     * @param cluster
     * @param extensions
     * @param namespace
     * @param user
     */
    public Context(String cluster, List<NamedExtension> extensions, String namespace, String user) {
        this.cluster = cluster;
        this.extensions = extensions;
        this.namespace = namespace;
        this.user = user;
    }

    /**
     * 
     * 
     * @return
     *     The cluster
     */
    @JsonProperty("cluster")
    public String getCluster() {
        return cluster;
    }

    /**
     * 
     * 
     * @param cluster
     *     The cluster
     */
    @JsonProperty("cluster")
    public void setCluster(String cluster) {
        this.cluster = cluster;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
