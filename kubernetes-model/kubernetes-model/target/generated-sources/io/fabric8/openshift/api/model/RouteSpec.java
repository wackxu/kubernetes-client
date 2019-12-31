
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
    "alternateBackends",
    "host",
    "path",
    "port",
    "tls",
    "to",
    "wildcardPolicy"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class RouteSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("alternateBackends")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<RouteTargetReference> alternateBackends = new ArrayList<RouteTargetReference>();
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
    @JsonProperty("path")
    private String path;
    /**
     * 
     * 
     */
    @JsonProperty("port")
    @Valid
    private RoutePort port;
    /**
     * 
     * 
     */
    @JsonProperty("tls")
    @Valid
    private TLSConfig tls;
    /**
     * 
     * 
     */
    @JsonProperty("to")
    @Valid
    private RouteTargetReference to;
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
    public RouteSpec() {
    }

    /**
     * 
     * @param path
     * @param alternateBackends
     * @param port
     * @param wildcardPolicy
     * @param host
     * @param tls
     * @param to
     */
    public RouteSpec(List<RouteTargetReference> alternateBackends, String host, String path, RoutePort port, TLSConfig tls, RouteTargetReference to, String wildcardPolicy) {
        this.alternateBackends = alternateBackends;
        this.host = host;
        this.path = path;
        this.port = port;
        this.tls = tls;
        this.to = to;
        this.wildcardPolicy = wildcardPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The alternateBackends
     */
    @JsonProperty("alternateBackends")
    public List<RouteTargetReference> getAlternateBackends() {
        return alternateBackends;
    }

    /**
     * 
     * 
     * @param alternateBackends
     *     The alternateBackends
     */
    @JsonProperty("alternateBackends")
    public void setAlternateBackends(List<RouteTargetReference> alternateBackends) {
        this.alternateBackends = alternateBackends;
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

    /**
     * 
     * 
     * @return
     *     The port
     */
    @JsonProperty("port")
    public RoutePort getPort() {
        return port;
    }

    /**
     * 
     * 
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(RoutePort port) {
        this.port = port;
    }

    /**
     * 
     * 
     * @return
     *     The tls
     */
    @JsonProperty("tls")
    public TLSConfig getTls() {
        return tls;
    }

    /**
     * 
     * 
     * @param tls
     *     The tls
     */
    @JsonProperty("tls")
    public void setTls(TLSConfig tls) {
        this.tls = tls;
    }

    /**
     * 
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public RouteTargetReference getTo() {
        return to;
    }

    /**
     * 
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(RouteTargetReference to) {
        this.to = to;
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
