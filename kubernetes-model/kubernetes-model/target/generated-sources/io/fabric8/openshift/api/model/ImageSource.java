
package io.fabric8.openshift.api.model;

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
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReference;
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
    "as",
    "from",
    "paths",
    "pullSecret"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ImageSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("as")
    @Valid
    private List<String> as = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("from")
    @Valid
    private ObjectReference from;
    /**
     * 
     * 
     */
    @JsonProperty("paths")
    @Valid
    private List<ImageSourcePath> paths = new ArrayList<ImageSourcePath>();
    /**
     * 
     * 
     */
    @JsonProperty("pullSecret")
    @Valid
    private LocalObjectReference pullSecret;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageSource() {
    }

    /**
     * 
     * @param as
     * @param paths
     * @param from
     * @param pullSecret
     */
    public ImageSource(List<String> as, ObjectReference from, List<ImageSourcePath> paths, LocalObjectReference pullSecret) {
        this.as = as;
        this.from = from;
        this.paths = paths;
        this.pullSecret = pullSecret;
    }

    /**
     * 
     * 
     * @return
     *     The as
     */
    @JsonProperty("as")
    public List<String> getAs() {
        return as;
    }

    /**
     * 
     * 
     * @param as
     *     The as
     */
    @JsonProperty("as")
    public void setAs(List<String> as) {
        this.as = as;
    }

    /**
     * 
     * 
     * @return
     *     The from
     */
    @JsonProperty("from")
    public ObjectReference getFrom() {
        return from;
    }

    /**
     * 
     * 
     * @param from
     *     The from
     */
    @JsonProperty("from")
    public void setFrom(ObjectReference from) {
        this.from = from;
    }

    /**
     * 
     * 
     * @return
     *     The paths
     */
    @JsonProperty("paths")
    public List<ImageSourcePath> getPaths() {
        return paths;
    }

    /**
     * 
     * 
     * @param paths
     *     The paths
     */
    @JsonProperty("paths")
    public void setPaths(List<ImageSourcePath> paths) {
        this.paths = paths;
    }

    /**
     * 
     * 
     * @return
     *     The pullSecret
     */
    @JsonProperty("pullSecret")
    public LocalObjectReference getPullSecret() {
        return pullSecret;
    }

    /**
     * 
     * 
     * @param pullSecret
     *     The pullSecret
     */
    @JsonProperty("pullSecret")
    public void setPullSecret(LocalObjectReference pullSecret) {
        this.pullSecret = pullSecret;
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
