
package io.fabric8.kubernetes.api.model.certificates;

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
    "request",
    "uid",
    "usages",
    "username"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CertificateSigningRequestSpec implements KubernetesResource
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
    @JsonProperty("request")
    private java.lang.String request;
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
    @JsonProperty("usages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> usages = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("username")
    private java.lang.String username;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CertificateSigningRequestSpec() {
    }

    /**
     * 
     * @param request
     * @param uid
     * @param extra
     * @param groups
     * @param usages
     * @param username
     */
    public CertificateSigningRequestSpec(Map<String, ArrayList<String>> extra, List<java.lang.String> groups, java.lang.String request, java.lang.String uid, List<java.lang.String> usages, java.lang.String username) {
        this.extra = extra;
        this.groups = groups;
        this.request = request;
        this.uid = uid;
        this.usages = usages;
        this.username = username;
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
     *     The request
     */
    @JsonProperty("request")
    public java.lang.String getRequest() {
        return request;
    }

    /**
     * 
     * 
     * @param request
     *     The request
     */
    @JsonProperty("request")
    public void setRequest(java.lang.String request) {
        this.request = request;
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
     *     The usages
     */
    @JsonProperty("usages")
    public List<java.lang.String> getUsages() {
        return usages;
    }

    /**
     * 
     * 
     * @param usages
     *     The usages
     */
    @JsonProperty("usages")
    public void setUsages(List<java.lang.String> usages) {
        this.usages = usages;
    }

    /**
     * 
     * 
     * @return
     *     The username
     */
    @JsonProperty("username")
    public java.lang.String getUsername() {
        return username;
    }

    /**
     * 
     * 
     * @param username
     *     The username
     */
    @JsonProperty("username")
    public void setUsername(java.lang.String username) {
        this.username = username;
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
