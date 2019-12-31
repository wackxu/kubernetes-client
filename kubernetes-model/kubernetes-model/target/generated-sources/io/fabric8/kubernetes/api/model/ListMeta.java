
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
    "continue",
    "resourceVersion",
    "selfLink"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ListMeta implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("continue")
    private String _continue;
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
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListMeta() {
    }

    /**
     * 
     * @param _continue
     * @param resourceVersion
     * @param selfLink
     */
    public ListMeta(String _continue, String resourceVersion, String selfLink) {
        this._continue = _continue;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
    }

    /**
     * 
     * 
     * @return
     *     The _continue
     */
    @JsonProperty("continue")
    public String getContinue() {
        return _continue;
    }

    /**
     * 
     * 
     * @param _continue
     *     The continue
     */
    @JsonProperty("continue")
    public void setContinue(String _continue) {
        this._continue = _continue;
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
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    /**
     * 
     * 
     * @param selfLink
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
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
