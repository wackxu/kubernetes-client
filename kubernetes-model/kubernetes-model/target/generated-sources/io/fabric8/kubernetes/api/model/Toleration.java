
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
    "effect",
    "key",
    "operator",
    "tolerationSeconds",
    "value"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Toleration implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("effect")
    private String effect;
    /**
     * 
     * 
     */
    @JsonProperty("key")
    private String key;
    /**
     * 
     * 
     */
    @JsonProperty("operator")
    private String operator;
    /**
     * 
     * 
     */
    @JsonProperty("tolerationSeconds")
    private Long tolerationSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Toleration() {
    }

    /**
     * 
     * @param effect
     * @param tolerationSeconds
     * @param value
     * @param key
     * @param operator
     */
    public Toleration(String effect, String key, String operator, Long tolerationSeconds, String value) {
        this.effect = effect;
        this.key = key;
        this.operator = operator;
        this.tolerationSeconds = tolerationSeconds;
        this.value = value;
    }

    /**
     * 
     * 
     * @return
     *     The effect
     */
    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    /**
     * 
     * 
     * @param effect
     *     The effect
     */
    @JsonProperty("effect")
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * 
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * 
     * @param key
     *     The key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     * 
     * @return
     *     The operator
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * 
     * 
     * @param operator
     *     The operator
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 
     * 
     * @return
     *     The tolerationSeconds
     */
    @JsonProperty("tolerationSeconds")
    public Long getTolerationSeconds() {
        return tolerationSeconds;
    }

    /**
     * 
     * 
     * @param tolerationSeconds
     *     The tolerationSeconds
     */
    @JsonProperty("tolerationSeconds")
    public void setTolerationSeconds(Long tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
