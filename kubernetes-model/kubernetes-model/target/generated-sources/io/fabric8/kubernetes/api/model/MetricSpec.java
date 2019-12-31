
package io.fabric8.kubernetes.api.model;

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
    "external",
    "object",
    "pods",
    "resource",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class MetricSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("external")
    @Valid
    private ExternalMetricSource external;
    /**
     * 
     * 
     */
    @JsonProperty("object")
    @Valid
    private ObjectMetricSource object;
    /**
     * 
     * 
     */
    @JsonProperty("pods")
    @Valid
    private PodsMetricSource pods;
    /**
     * 
     * 
     */
    @JsonProperty("resource")
    @Valid
    private ResourceMetricSource resource;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetricSpec() {
    }

    /**
     * 
     * @param external
     * @param resource
     * @param pods
     * @param type
     * @param object
     */
    public MetricSpec(ExternalMetricSource external, ObjectMetricSource object, PodsMetricSource pods, ResourceMetricSource resource, String type) {
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The external
     */
    @JsonProperty("external")
    public ExternalMetricSource getExternal() {
        return external;
    }

    /**
     * 
     * 
     * @param external
     *     The external
     */
    @JsonProperty("external")
    public void setExternal(ExternalMetricSource external) {
        this.external = external;
    }

    /**
     * 
     * 
     * @return
     *     The object
     */
    @JsonProperty("object")
    public ObjectMetricSource getObject() {
        return object;
    }

    /**
     * 
     * 
     * @param object
     *     The object
     */
    @JsonProperty("object")
    public void setObject(ObjectMetricSource object) {
        this.object = object;
    }

    /**
     * 
     * 
     * @return
     *     The pods
     */
    @JsonProperty("pods")
    public PodsMetricSource getPods() {
        return pods;
    }

    /**
     * 
     * 
     * @param pods
     *     The pods
     */
    @JsonProperty("pods")
    public void setPods(PodsMetricSource pods) {
        this.pods = pods;
    }

    /**
     * 
     * 
     * @return
     *     The resource
     */
    @JsonProperty("resource")
    public ResourceMetricSource getResource() {
        return resource;
    }

    /**
     * 
     * 
     * @param resource
     *     The resource
     */
    @JsonProperty("resource")
    public void setResource(ResourceMetricSource resource) {
        this.resource = resource;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
