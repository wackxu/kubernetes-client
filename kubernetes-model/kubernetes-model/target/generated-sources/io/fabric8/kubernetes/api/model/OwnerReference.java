
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
    "blockOwnerDeletion",
    "controller",
    "name",
    "uid"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class OwnerReference implements KubernetesResource
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
    @JsonProperty("blockOwnerDeletion")
    private Boolean blockOwnerDeletion;
    /**
     * 
     * 
     */
    @JsonProperty("controller")
    private Boolean controller;
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
    @JsonProperty("uid")
    private String uid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OwnerReference() {
    }

    /**
     * 
     * @param uid
     * @param controller
     * @param apiVersion
     * @param kind
     * @param name
     * @param blockOwnerDeletion
     */
    public OwnerReference(String apiVersion, Boolean blockOwnerDeletion, Boolean controller, String kind, String name, String uid) {
        this.apiVersion = apiVersion;
        this.blockOwnerDeletion = blockOwnerDeletion;
        this.controller = controller;
        this.kind = kind;
        this.name = name;
        this.uid = uid;
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
     *     The blockOwnerDeletion
     */
    @JsonProperty("blockOwnerDeletion")
    public Boolean getBlockOwnerDeletion() {
        return blockOwnerDeletion;
    }

    /**
     * 
     * 
     * @param blockOwnerDeletion
     *     The blockOwnerDeletion
     */
    @JsonProperty("blockOwnerDeletion")
    public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
    }

    /**
     * 
     * 
     * @return
     *     The controller
     */
    @JsonProperty("controller")
    public Boolean getController() {
        return controller;
    }

    /**
     * 
     * 
     * @param controller
     *     The controller
     */
    @JsonProperty("controller")
    public void setController(Boolean controller) {
        this.controller = controller;
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
