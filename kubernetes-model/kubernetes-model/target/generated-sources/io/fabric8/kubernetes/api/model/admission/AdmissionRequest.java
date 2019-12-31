
package io.fabric8.kubernetes.api.model.admission;

import java.util.HashMap;
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
import io.fabric8.kubernetes.api.model.GroupVersionKind;
import io.fabric8.kubernetes.api.model.GroupVersionResource;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.authentication.UserInfo;
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
    "dryRun",
    "name",
    "namespace",
    "object",
    "oldObject",
    "operation",
    "resource",
    "subResource",
    "uid",
    "userInfo"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class AdmissionRequest implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("dryRun")
    private Boolean dryRun;
    /**
     * 
     * 
     */
    @JsonProperty("kind")
    @Valid
    private GroupVersionKind kind;
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
    @JsonProperty("object")
    @Valid
    private HasMetadata object;
    /**
     * 
     * 
     */
    @JsonProperty("oldObject")
    @Valid
    private HasMetadata oldObject;
    /**
     * 
     * 
     */
    @JsonProperty("operation")
    private String operation;
    /**
     * 
     * 
     */
    @JsonProperty("resource")
    @Valid
    private GroupVersionResource resource;
    /**
     * 
     * 
     */
    @JsonProperty("subResource")
    private String subResource;
    /**
     * 
     * 
     */
    @JsonProperty("uid")
    private String uid;
    /**
     * 
     * 
     */
    @JsonProperty("userInfo")
    @Valid
    private UserInfo userInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdmissionRequest() {
    }

    /**
     * 
     * @param uid
     * @param userInfo
     * @param dryRun
     * @param resource
     * @param kind
     * @param name
     * @param namespace
     * @param oldObject
     * @param subResource
     * @param operation
     * @param object
     */
    public AdmissionRequest(Boolean dryRun, GroupVersionKind kind, String name, String namespace, HasMetadata object, HasMetadata oldObject, String operation, GroupVersionResource resource, String subResource, String uid, UserInfo userInfo) {
        this.dryRun = dryRun;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
        this.object = object;
        this.oldObject = oldObject;
        this.operation = operation;
        this.resource = resource;
        this.subResource = subResource;
        this.uid = uid;
        this.userInfo = userInfo;
    }

    /**
     * 
     * 
     * @return
     *     The dryRun
     */
    @JsonProperty("dryRun")
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * 
     * 
     * @param dryRun
     *     The dryRun
     */
    @JsonProperty("dryRun")
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * 
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public GroupVersionKind getKind() {
        return kind;
    }

    /**
     * 
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(GroupVersionKind kind) {
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

    /**
     * 
     * 
     * @return
     *     The object
     */
    @JsonProperty("object")
    public HasMetadata getObject() {
        return object;
    }

    /**
     * 
     * 
     * @param object
     *     The object
     */
    @JsonProperty("object")
    public void setObject(HasMetadata object) {
        this.object = object;
    }

    /**
     * 
     * 
     * @return
     *     The oldObject
     */
    @JsonProperty("oldObject")
    public HasMetadata getOldObject() {
        return oldObject;
    }

    /**
     * 
     * 
     * @param oldObject
     *     The oldObject
     */
    @JsonProperty("oldObject")
    public void setOldObject(HasMetadata oldObject) {
        this.oldObject = oldObject;
    }

    /**
     * 
     * 
     * @return
     *     The operation
     */
    @JsonProperty("operation")
    public String getOperation() {
        return operation;
    }

    /**
     * 
     * 
     * @param operation
     *     The operation
     */
    @JsonProperty("operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * 
     * 
     * @return
     *     The resource
     */
    @JsonProperty("resource")
    public GroupVersionResource getResource() {
        return resource;
    }

    /**
     * 
     * 
     * @param resource
     *     The resource
     */
    @JsonProperty("resource")
    public void setResource(GroupVersionResource resource) {
        this.resource = resource;
    }

    /**
     * 
     * 
     * @return
     *     The subResource
     */
    @JsonProperty("subResource")
    public String getSubResource() {
        return subResource;
    }

    /**
     * 
     * 
     * @param subResource
     *     The subResource
     */
    @JsonProperty("subResource")
    public void setSubResource(String subResource) {
        this.subResource = subResource;
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

    /**
     * 
     * 
     * @return
     *     The userInfo
     */
    @JsonProperty("userInfo")
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * 
     * 
     * @param userInfo
     *     The userInfo
     */
    @JsonProperty("userInfo")
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
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
