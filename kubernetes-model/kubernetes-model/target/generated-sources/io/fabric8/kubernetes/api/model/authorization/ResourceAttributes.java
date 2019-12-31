
package io.fabric8.kubernetes.api.model.authorization;

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
    "group",
    "name",
    "namespace",
    "resource",
    "subresource",
    "verb",
    "version"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ResourceAttributes implements KubernetesResource
{

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
    @JsonProperty("name")
    private String name;
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
    @JsonProperty("resource")
    private String resource;
    /**
     * 
     * 
     */
    @JsonProperty("subresource")
    private String subresource;
    /**
     * 
     * 
     */
    @JsonProperty("verb")
    private String verb;
    /**
     * 
     * 
     */
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceAttributes() {
    }

    /**
     * 
     * @param resource
     * @param subresource
     * @param name
     * @param namespace
     * @param verb
     * @param version
     * @param group
     */
    public ResourceAttributes(String group, String name, String namespace, String resource, String subresource, String verb, String version) {
        this.group = group;
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.subresource = subresource;
        this.verb = verb;
        this.version = version;
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
     *     The subresource
     */
    @JsonProperty("subresource")
    public String getSubresource() {
        return subresource;
    }

    /**
     * 
     * 
     * @param subresource
     *     The subresource
     */
    @JsonProperty("subresource")
    public void setSubresource(String subresource) {
        this.subresource = subresource;
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

    /**
     * 
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
