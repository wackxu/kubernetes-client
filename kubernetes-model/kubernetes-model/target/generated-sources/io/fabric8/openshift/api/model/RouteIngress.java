
package io.fabric8.openshift.api.model;

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
    "conditions",
    "host",
    "routerCanonicalHostname",
    "routerName",
    "wildcardPolicy"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RouteIngress implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<RouteIngressCondition> conditions = new ArrayList<RouteIngressCondition>();
    /**
     * 
     * 
     */
    @JsonProperty("host")
    private String host;
    /**
     * 
     * 
     */
    @JsonProperty("routerCanonicalHostname")
    private String routerCanonicalHostname;
    /**
     * 
     * 
     */
    @JsonProperty("routerName")
    private String routerName;
    /**
     * 
     * 
     */
    @JsonProperty("wildcardPolicy")
    private String wildcardPolicy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RouteIngress() {
    }

    /**
     * 
     * @param routerName
     * @param wildcardPolicy
     * @param host
     * @param routerCanonicalHostname
     * @param conditions
     */
    public RouteIngress(List<RouteIngressCondition> conditions, String host, String routerCanonicalHostname, String routerName, String wildcardPolicy) {
        this.conditions = conditions;
        this.host = host;
        this.routerCanonicalHostname = routerCanonicalHostname;
        this.routerName = routerName;
        this.wildcardPolicy = wildcardPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The conditions
     */
    @JsonProperty("conditions")
    public List<RouteIngressCondition> getConditions() {
        return conditions;
    }

    /**
     * 
     * 
     * @param conditions
     *     The conditions
     */
    @JsonProperty("conditions")
    public void setConditions(List<RouteIngressCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * 
     * @return
     *     The host
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * 
     * 
     * @param host
     *     The host
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 
     * 
     * @return
     *     The routerCanonicalHostname
     */
    @JsonProperty("routerCanonicalHostname")
    public String getRouterCanonicalHostname() {
        return routerCanonicalHostname;
    }

    /**
     * 
     * 
     * @param routerCanonicalHostname
     *     The routerCanonicalHostname
     */
    @JsonProperty("routerCanonicalHostname")
    public void setRouterCanonicalHostname(String routerCanonicalHostname) {
        this.routerCanonicalHostname = routerCanonicalHostname;
    }

    /**
     * 
     * 
     * @return
     *     The routerName
     */
    @JsonProperty("routerName")
    public String getRouterName() {
        return routerName;
    }

    /**
     * 
     * 
     * @param routerName
     *     The routerName
     */
    @JsonProperty("routerName")
    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    /**
     * 
     * 
     * @return
     *     The wildcardPolicy
     */
    @JsonProperty("wildcardPolicy")
    public String getWildcardPolicy() {
        return wildcardPolicy;
    }

    /**
     * 
     * 
     * @param wildcardPolicy
     *     The wildcardPolicy
     */
    @JsonProperty("wildcardPolicy")
    public void setWildcardPolicy(String wildcardPolicy) {
        this.wildcardPolicy = wildcardPolicy;
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
