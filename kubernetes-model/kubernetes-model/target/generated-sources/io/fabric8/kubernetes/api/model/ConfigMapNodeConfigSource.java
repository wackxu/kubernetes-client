
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
    "kubeletConfigKey",
    "name",
    "namespace",
    "resourceVersion",
    "uid"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ConfigMapNodeConfigSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("kubeletConfigKey")
    private String kubeletConfigKey;
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
    @JsonProperty("resourceVersion")
    private String resourceVersion;
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
    public ConfigMapNodeConfigSource() {
    }

    /**
     * 
     * @param uid
     * @param kubeletConfigKey
     * @param resourceVersion
     * @param name
     * @param namespace
     */
    public ConfigMapNodeConfigSource(String kubeletConfigKey, String name, String namespace, String resourceVersion, String uid) {
        this.kubeletConfigKey = kubeletConfigKey;
        this.name = name;
        this.namespace = namespace;
        this.resourceVersion = resourceVersion;
        this.uid = uid;
    }

    /**
     * 
     * 
     * @return
     *     The kubeletConfigKey
     */
    @JsonProperty("kubeletConfigKey")
    public String getKubeletConfigKey() {
        return kubeletConfigKey;
    }

    /**
     * 
     * 
     * @param kubeletConfigKey
     *     The kubeletConfigKey
     */
    @JsonProperty("kubeletConfigKey")
    public void setKubeletConfigKey(String kubeletConfigKey) {
        this.kubeletConfigKey = kubeletConfigKey;
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
     *     The resourceVersion
     */
    @JsonProperty("resourceVersion")
    public String getResourceVersion() {
        return resourceVersion;
    }

    /**
     * 
     * 
     * @param resourceVersion
     *     The resourceVersion
     */
    @JsonProperty("resourceVersion")
    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
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
