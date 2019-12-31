
package io.fabric8.kubernetes.api.model.apiextensions;

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
    "labelSelectorPath",
    "specReplicasPath",
    "statusReplicasPath"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceSubresourceScale implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("labelSelectorPath")
    private String labelSelectorPath;
    /**
     * 
     * 
     */
    @JsonProperty("specReplicasPath")
    private String specReplicasPath;
    /**
     * 
     * 
     */
    @JsonProperty("statusReplicasPath")
    private String statusReplicasPath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceSubresourceScale() {
    }

    /**
     * 
     * @param statusReplicasPath
     * @param labelSelectorPath
     * @param specReplicasPath
     */
    public CustomResourceSubresourceScale(String labelSelectorPath, String specReplicasPath, String statusReplicasPath) {
        this.labelSelectorPath = labelSelectorPath;
        this.specReplicasPath = specReplicasPath;
        this.statusReplicasPath = statusReplicasPath;
    }

    /**
     * 
     * 
     * @return
     *     The labelSelectorPath
     */
    @JsonProperty("labelSelectorPath")
    public String getLabelSelectorPath() {
        return labelSelectorPath;
    }

    /**
     * 
     * 
     * @param labelSelectorPath
     *     The labelSelectorPath
     */
    @JsonProperty("labelSelectorPath")
    public void setLabelSelectorPath(String labelSelectorPath) {
        this.labelSelectorPath = labelSelectorPath;
    }

    /**
     * 
     * 
     * @return
     *     The specReplicasPath
     */
    @JsonProperty("specReplicasPath")
    public String getSpecReplicasPath() {
        return specReplicasPath;
    }

    /**
     * 
     * 
     * @param specReplicasPath
     *     The specReplicasPath
     */
    @JsonProperty("specReplicasPath")
    public void setSpecReplicasPath(String specReplicasPath) {
        this.specReplicasPath = specReplicasPath;
    }

    /**
     * 
     * 
     * @return
     *     The statusReplicasPath
     */
    @JsonProperty("statusReplicasPath")
    public String getStatusReplicasPath() {
        return statusReplicasPath;
    }

    /**
     * 
     * 
     * @param statusReplicasPath
     *     The statusReplicasPath
     */
    @JsonProperty("statusReplicasPath")
    public void setStatusReplicasPath(String statusReplicasPath) {
        this.statusReplicasPath = statusReplicasPath;
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
