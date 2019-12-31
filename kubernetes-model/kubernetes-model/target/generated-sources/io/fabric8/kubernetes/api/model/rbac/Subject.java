
package io.fabric8.kubernetes.api.model.rbac;

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
    "apiGroup",
    "name",
    "namespace"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Subject implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("apiGroup")
    private String apiGroup;
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
    @JsonProperty("namespace")
    private String namespace;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Subject() {
    }

    /**
     * 
     * @param apiGroup
     * @param kind
     * @param name
     * @param namespace
     */
    public Subject(String apiGroup, String kind, String name, String namespace) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * 
     * 
     * @return
     *     The apiGroup
     */
    @JsonProperty("apiGroup")
    public String getApiGroup() {
        return apiGroup;
    }

    /**
     * 
     * 
     * @param apiGroup
     *     The apiGroup
     */
    @JsonProperty("apiGroup")
    public void setApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
