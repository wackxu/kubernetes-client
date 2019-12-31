
package io.fabric8.kubernetes.api.model.apiextensions;

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
    "strategy",
    "webhookClientConfig"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class CustomResourceConversion implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("strategy")
    private String strategy;
    /**
     * 
     * 
     */
    @JsonProperty("webhookClientConfig")
    @Valid
    private WebhookClientConfig webhookClientConfig;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomResourceConversion() {
    }

    /**
     * 
     * @param webhookClientConfig
     * @param strategy
     */
    public CustomResourceConversion(String strategy, WebhookClientConfig webhookClientConfig) {
        this.strategy = strategy;
        this.webhookClientConfig = webhookClientConfig;
    }

    /**
     * 
     * 
     * @return
     *     The strategy
     */
    @JsonProperty("strategy")
    public String getStrategy() {
        return strategy;
    }

    /**
     * 
     * 
     * @param strategy
     *     The strategy
     */
    @JsonProperty("strategy")
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * 
     * 
     * @return
     *     The webhookClientConfig
     */
    @JsonProperty("webhookClientConfig")
    public WebhookClientConfig getWebhookClientConfig() {
        return webhookClientConfig;
    }

    /**
     * 
     * 
     * @param webhookClientConfig
     *     The webhookClientConfig
     */
    @JsonProperty("webhookClientConfig")
    public void setWebhookClientConfig(WebhookClientConfig webhookClientConfig) {
        this.webhookClientConfig = webhookClientConfig;
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
