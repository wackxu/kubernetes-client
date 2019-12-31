
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
    "configMap",
    "downwardAPI",
    "secret",
    "serviceAccountToken"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class VolumeProjection implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("configMap")
    @Valid
    private ConfigMapProjection configMap;
    /**
     * 
     * 
     */
    @JsonProperty("downwardAPI")
    @Valid
    private DownwardAPIProjection downwardAPI;
    /**
     * 
     * 
     */
    @JsonProperty("secret")
    @Valid
    private SecretProjection secret;
    /**
     * 
     * 
     */
    @JsonProperty("serviceAccountToken")
    @Valid
    private ServiceAccountTokenProjection serviceAccountToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VolumeProjection() {
    }

    /**
     * 
     * @param downwardAPI
     * @param configMap
     * @param secret
     * @param serviceAccountToken
     */
    public VolumeProjection(ConfigMapProjection configMap, DownwardAPIProjection downwardAPI, SecretProjection secret, ServiceAccountTokenProjection serviceAccountToken) {
        this.configMap = configMap;
        this.downwardAPI = downwardAPI;
        this.secret = secret;
        this.serviceAccountToken = serviceAccountToken;
    }

    /**
     * 
     * 
     * @return
     *     The configMap
     */
    @JsonProperty("configMap")
    public ConfigMapProjection getConfigMap() {
        return configMap;
    }

    /**
     * 
     * 
     * @param configMap
     *     The configMap
     */
    @JsonProperty("configMap")
    public void setConfigMap(ConfigMapProjection configMap) {
        this.configMap = configMap;
    }

    /**
     * 
     * 
     * @return
     *     The downwardAPI
     */
    @JsonProperty("downwardAPI")
    public DownwardAPIProjection getDownwardAPI() {
        return downwardAPI;
    }

    /**
     * 
     * 
     * @param downwardAPI
     *     The downwardAPI
     */
    @JsonProperty("downwardAPI")
    public void setDownwardAPI(DownwardAPIProjection downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * 
     * 
     * @return
     *     The secret
     */
    @JsonProperty("secret")
    public SecretProjection getSecret() {
        return secret;
    }

    /**
     * 
     * 
     * @param secret
     *     The secret
     */
    @JsonProperty("secret")
    public void setSecret(SecretProjection secret) {
        this.secret = secret;
    }

    /**
     * 
     * 
     * @return
     *     The serviceAccountToken
     */
    @JsonProperty("serviceAccountToken")
    public ServiceAccountTokenProjection getServiceAccountToken() {
        return serviceAccountToken;
    }

    /**
     * 
     * 
     * @param serviceAccountToken
     *     The serviceAccountToken
     */
    @JsonProperty("serviceAccountToken")
    public void setServiceAccountToken(ServiceAccountTokenProjection serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
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
