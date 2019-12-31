
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
    "caBundle",
    "service",
    "url"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class WebhookClientConfig implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("caBundle")
    private String caBundle;
    /**
     * 
     * 
     */
    @JsonProperty("service")
    @Valid
    private ServiceReference service;
    /**
     * 
     * 
     */
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WebhookClientConfig() {
    }

    /**
     * 
     * @param caBundle
     * @param service
     * @param url
     */
    public WebhookClientConfig(String caBundle, ServiceReference service, String url) {
        this.caBundle = caBundle;
        this.service = service;
        this.url = url;
    }

    /**
     * 
     * 
     * @return
     *     The caBundle
     */
    @JsonProperty("caBundle")
    public String getCaBundle() {
        return caBundle;
    }

    /**
     * 
     * 
     * @param caBundle
     *     The caBundle
     */
    @JsonProperty("caBundle")
    public void setCaBundle(String caBundle) {
        this.caBundle = caBundle;
    }

    /**
     * 
     * 
     * @return
     *     The service
     */
    @JsonProperty("service")
    public ServiceReference getService() {
        return service;
    }

    /**
     * 
     * 
     * @param service
     *     The service
     */
    @JsonProperty("service")
    public void setService(ServiceReference service) {
        this.service = service;
    }

    /**
     * 
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
