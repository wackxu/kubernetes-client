
package io.fabric8.kubernetes.api.model;

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
    "host",
    "httpHeaders",
    "path",
    "port",
    "scheme"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class HTTPGetAction implements KubernetesResource
{

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
    @JsonProperty("httpHeaders")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<HTTPHeader> httpHeaders = new ArrayList<HTTPHeader>();
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
    private IntOrString port;
    /**
     * 
     * 
     */
    @JsonProperty("scheme")
    private String scheme;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public HTTPGetAction() {
    }

    /**
     * 
     * @param path
     * @param scheme
     * @param port
     * @param host
     * @param httpHeaders
     */
    public HTTPGetAction(String host, List<HTTPHeader> httpHeaders, String path, IntOrString port, String scheme) {
        this.host = host;
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.port = port;
        this.scheme = scheme;
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
     *     The httpHeaders
     */
    @JsonProperty("httpHeaders")
    public List<HTTPHeader> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * 
     * 
     * @param httpHeaders
     *     The httpHeaders
     */
    @JsonProperty("httpHeaders")
    public void setHttpHeaders(List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
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
    public IntOrString getPort() {
        return port;
    }

    /**
     * 
     * 
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(IntOrString port) {
        this.port = port;
    }

    /**
     * 
     * 
     * @return
     *     The scheme
     */
    @JsonProperty("scheme")
    public String getScheme() {
        return scheme;
    }

    /**
     * 
     * 
     * @param scheme
     *     The scheme
     */
    @JsonProperty("scheme")
    public void setScheme(String scheme) {
        this.scheme = scheme;
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
