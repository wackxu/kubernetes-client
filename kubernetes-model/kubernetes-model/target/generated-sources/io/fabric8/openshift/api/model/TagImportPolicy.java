
package io.fabric8.openshift.api.model;

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
    "insecure",
    "scheduled"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class TagImportPolicy implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("insecure")
    private Boolean insecure;
    /**
     * 
     * 
     */
    @JsonProperty("scheduled")
    private Boolean scheduled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TagImportPolicy() {
    }

    /**
     * 
     * @param scheduled
     * @param insecure
     */
    public TagImportPolicy(Boolean insecure, Boolean scheduled) {
        this.insecure = insecure;
        this.scheduled = scheduled;
    }

    /**
     * 
     * 
     * @return
     *     The insecure
     */
    @JsonProperty("insecure")
    public Boolean getInsecure() {
        return insecure;
    }

    /**
     * 
     * 
     * @param insecure
     *     The insecure
     */
    @JsonProperty("insecure")
    public void setInsecure(Boolean insecure) {
        this.insecure = insecure;
    }

    /**
     * 
     * 
     * @return
     *     The scheduled
     */
    @JsonProperty("scheduled")
    public Boolean getScheduled() {
        return scheduled;
    }

    /**
     * 
     * 
     * @param scheduled
     *     The scheduled
     */
    @JsonProperty("scheduled")
    public void setScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
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
