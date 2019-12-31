
package io.fabric8.kubernetes.api.model.extensions;

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
    "backend",
    "rules",
    "tls"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class IngressSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("backend")
    @Valid
    private IngressBackend backend;
    /**
     * 
     * 
     */
    @JsonProperty("rules")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<IngressRule> rules = new ArrayList<IngressRule>();
    /**
     * 
     * 
     */
    @JsonProperty("tls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<IngressTLS> tls = new ArrayList<IngressTLS>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IngressSpec() {
    }

    /**
     * 
     * @param backend
     * @param rules
     * @param tls
     */
    public IngressSpec(IngressBackend backend, List<IngressRule> rules, List<IngressTLS> tls) {
        this.backend = backend;
        this.rules = rules;
        this.tls = tls;
    }

    /**
     * 
     * 
     * @return
     *     The backend
     */
    @JsonProperty("backend")
    public IngressBackend getBackend() {
        return backend;
    }

    /**
     * 
     * 
     * @param backend
     *     The backend
     */
    @JsonProperty("backend")
    public void setBackend(IngressBackend backend) {
        this.backend = backend;
    }

    /**
     * 
     * 
     * @return
     *     The rules
     */
    @JsonProperty("rules")
    public List<IngressRule> getRules() {
        return rules;
    }

    /**
     * 
     * 
     * @param rules
     *     The rules
     */
    @JsonProperty("rules")
    public void setRules(List<IngressRule> rules) {
        this.rules = rules;
    }

    /**
     * 
     * 
     * @return
     *     The tls
     */
    @JsonProperty("tls")
    public List<IngressTLS> getTls() {
        return tls;
    }

    /**
     * 
     * 
     * @param tls
     *     The tls
     */
    @JsonProperty("tls")
    public void setTls(List<IngressTLS> tls) {
        this.tls = tls;
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
