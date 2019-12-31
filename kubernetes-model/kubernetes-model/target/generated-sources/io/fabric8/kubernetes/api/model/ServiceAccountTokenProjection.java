
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
    "audience",
    "expirationSeconds",
    "path"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ServiceAccountTokenProjection implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("audience")
    private String audience;
    /**
     * 
     * 
     */
    @JsonProperty("expirationSeconds")
    private Long expirationSeconds;
    /**
     * 
     * 
     */
    @JsonProperty("path")
    private String path;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceAccountTokenProjection() {
    }

    /**
     * 
     * @param path
     * @param audience
     * @param expirationSeconds
     */
    public ServiceAccountTokenProjection(String audience, Long expirationSeconds, String path) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
        this.path = path;
    }

    /**
     * 
     * 
     * @return
     *     The audience
     */
    @JsonProperty("audience")
    public String getAudience() {
        return audience;
    }

    /**
     * 
     * 
     * @param audience
     *     The audience
     */
    @JsonProperty("audience")
    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * 
     * 
     * @return
     *     The expirationSeconds
     */
    @JsonProperty("expirationSeconds")
    public Long getExpirationSeconds() {
        return expirationSeconds;
    }

    /**
     * 
     * 
     * @param expirationSeconds
     *     The expirationSeconds
     */
    @JsonProperty("expirationSeconds")
    public void setExpirationSeconds(Long expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    /**
     * 
     * 
     * @return
     *     The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * 
     * 
     * @param path
     *     The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
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
