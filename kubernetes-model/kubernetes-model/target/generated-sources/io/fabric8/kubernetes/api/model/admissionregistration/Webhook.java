
package io.fabric8.kubernetes.api.model.admissionregistration;

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
import io.fabric8.kubernetes.api.model.LabelSelector;
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
    "clientConfig",
    "failurePolicy",
    "name",
    "namespaceSelector",
    "rules",
    "sideEffects"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Webhook implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("clientConfig")
    @Valid
    private WebhookClientConfig clientConfig;
    /**
     * 
     * 
     */
    @JsonProperty("failurePolicy")
    private String failurePolicy;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * 
     */
    @JsonProperty("namespaceSelector")
    @Valid
    private LabelSelector namespaceSelector;
    /**
     * 
     * 
     */
    @JsonProperty("rules")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<RuleWithOperations> rules = new ArrayList<RuleWithOperations>();
    /**
     * 
     * 
     */
    @JsonProperty("sideEffects")
    private String sideEffects;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Webhook() {
    }

    /**
     * 
     * @param name
     * @param namespaceSelector
     * @param rules
     * @param clientConfig
     * @param failurePolicy
     * @param sideEffects
     */
    public Webhook(WebhookClientConfig clientConfig, String failurePolicy, String name, LabelSelector namespaceSelector, List<RuleWithOperations> rules, String sideEffects) {
        this.clientConfig = clientConfig;
        this.failurePolicy = failurePolicy;
        this.name = name;
        this.namespaceSelector = namespaceSelector;
        this.rules = rules;
        this.sideEffects = sideEffects;
    }

    /**
     * 
     * 
     * @return
     *     The clientConfig
     */
    @JsonProperty("clientConfig")
    public WebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    /**
     * 
     * 
     * @param clientConfig
     *     The clientConfig
     */
    @JsonProperty("clientConfig")
    public void setClientConfig(WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    /**
     * 
     * 
     * @return
     *     The failurePolicy
     */
    @JsonProperty("failurePolicy")
    public String getFailurePolicy() {
        return failurePolicy;
    }

    /**
     * 
     * 
     * @param failurePolicy
     *     The failurePolicy
     */
    @JsonProperty("failurePolicy")
    public void setFailurePolicy(String failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    /**
     * 
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * 
     * @return
     *     The namespaceSelector
     */
    @JsonProperty("namespaceSelector")
    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    /**
     * 
     * 
     * @param namespaceSelector
     *     The namespaceSelector
     */
    @JsonProperty("namespaceSelector")
    public void setNamespaceSelector(LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    /**
     * 
     * 
     * @return
     *     The rules
     */
    @JsonProperty("rules")
    public List<RuleWithOperations> getRules() {
        return rules;
    }

    /**
     * 
     * 
     * @param rules
     *     The rules
     */
    @JsonProperty("rules")
    public void setRules(List<RuleWithOperations> rules) {
        this.rules = rules;
    }

    /**
     * 
     * 
     * @return
     *     The sideEffects
     */
    @JsonProperty("sideEffects")
    public String getSideEffects() {
        return sideEffects;
    }

    /**
     * 
     * 
     * @param sideEffects
     *     The sideEffects
     */
    @JsonProperty("sideEffects")
    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
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
