
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
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import io.sundr.transform.annotations.VelocityTransformation;
import io.sundr.transform.annotations.VelocityTransformations;
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
    "groupNames",
    "roleRef",
    "subjects",
    "userNames"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
@ApiVersion("v1")
@ApiGroup("authorization.openshift.io")
@VelocityTransformations({
    @VelocityTransformation(value = "/manifest.vm", outputPath = "openshift.properties", gather = true)
})
public class OpenshiftRoleBinding implements HasMetadata
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
    @JsonProperty("groupNames")
    @Valid
    private List<String> groupNames = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "RoleBinding";
    /**
     * 
     * 
     */
    @JsonProperty("metadata")
    @Valid
    @CheckObjectMeta(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*$", max = 253)
    private ObjectMeta metadata;
    /**
     * 
     * 
     */
    @JsonProperty("roleRef")
    @Valid
    private ObjectReference roleRef;
    /**
     * 
     * 
     */
    @JsonProperty("subjects")
    @Valid
    private List<ObjectReference> subjects = new ArrayList<ObjectReference>();
    /**
     * 
     * 
     */
    @JsonProperty("userNames")
    @Valid
    private List<String> userNames = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OpenshiftRoleBinding() {
    }

    /**
     * 
     * @param groupNames
     * @param metadata
     * @param apiVersion
     * @param kind
     * @param subjects
     * @param userNames
     * @param roleRef
     */
    public OpenshiftRoleBinding(String apiVersion, List<String> groupNames, String kind, ObjectMeta metadata, ObjectReference roleRef, List<ObjectReference> subjects, List<String> userNames) {
        this.apiVersion = apiVersion;
        this.groupNames = groupNames;
        this.kind = kind;
        this.metadata = metadata;
        this.roleRef = roleRef;
        this.subjects = subjects;
        this.userNames = userNames;
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
     *     The groupNames
     */
    @JsonProperty("groupNames")
    public List<String> getGroupNames() {
        return groupNames;
    }

    /**
     * 
     * 
     * @param groupNames
     *     The groupNames
     */
    @JsonProperty("groupNames")
    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
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
     *     The metadata
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * 
     * @return
     *     The roleRef
     */
    @JsonProperty("roleRef")
    public ObjectReference getRoleRef() {
        return roleRef;
    }

    /**
     * 
     * 
     * @param roleRef
     *     The roleRef
     */
    @JsonProperty("roleRef")
    public void setRoleRef(ObjectReference roleRef) {
        this.roleRef = roleRef;
    }

    /**
     * 
     * 
     * @return
     *     The subjects
     */
    @JsonProperty("subjects")
    public List<ObjectReference> getSubjects() {
        return subjects;
    }

    /**
     * 
     * 
     * @param subjects
     *     The subjects
     */
    @JsonProperty("subjects")
    public void setSubjects(List<ObjectReference> subjects) {
        this.subjects = subjects;
    }

    /**
     * 
     * 
     * @return
     *     The userNames
     */
    @JsonProperty("userNames")
    public List<String> getUserNames() {
        return userNames;
    }

    /**
     * 
     * 
     * @param userNames
     *     The userNames
     */
    @JsonProperty("userNames")
    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
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
