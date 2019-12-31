
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
    "type",
    "uid",
    "uidRangeMax",
    "uidRangeMin"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RunAsUserStrategyOptions implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * 
     * 
     */
    @JsonProperty("uid")
    private Long uid;
    /**
     * 
     * 
     */
    @JsonProperty("uidRangeMax")
    private Long uidRangeMax;
    /**
     * 
     * 
     */
    @JsonProperty("uidRangeMin")
    private Long uidRangeMin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RunAsUserStrategyOptions() {
    }

    /**
     * 
     * @param uid
     * @param uidRangeMin
     * @param uidRangeMax
     * @param type
     */
    public RunAsUserStrategyOptions(String type, Long uid, Long uidRangeMax, Long uidRangeMin) {
        this.type = type;
        this.uid = uid;
        this.uidRangeMax = uidRangeMax;
        this.uidRangeMin = uidRangeMin;
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

    /**
     * 
     * 
     * @return
     *     The uid
     */
    @JsonProperty("uid")
    public Long getUid() {
        return uid;
    }

    /**
     * 
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 
     * 
     * @return
     *     The uidRangeMax
     */
    @JsonProperty("uidRangeMax")
    public Long getUidRangeMax() {
        return uidRangeMax;
    }

    /**
     * 
     * 
     * @param uidRangeMax
     *     The uidRangeMax
     */
    @JsonProperty("uidRangeMax")
    public void setUidRangeMax(Long uidRangeMax) {
        this.uidRangeMax = uidRangeMax;
    }

    /**
     * 
     * 
     * @return
     *     The uidRangeMin
     */
    @JsonProperty("uidRangeMin")
    public Long getUidRangeMin() {
        return uidRangeMin;
    }

    /**
     * 
     * 
     * @param uidRangeMin
     *     The uidRangeMin
     */
    @JsonProperty("uidRangeMin")
    public void setUidRangeMin(Long uidRangeMin) {
        this.uidRangeMin = uidRangeMin;
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
