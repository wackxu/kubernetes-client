
package io.fabric8.openshift.api.model;

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
    "httpProxy",
    "httpsProxy",
    "noProxy",
    "ref",
    "uri"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class GitBuildSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("httpProxy")
    private String httpProxy;
    /**
     * 
     * 
     */
    @JsonProperty("httpsProxy")
    private String httpsProxy;
    /**
     * 
     * 
     */
    @JsonProperty("noProxy")
    private String noProxy;
    /**
     * 
     * 
     */
    @JsonProperty("ref")
    private String ref;
    /**
     * 
     * 
     */
    @JsonProperty("uri")
    private String uri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitBuildSource() {
    }

    /**
     * 
     * @param ref
     * @param httpProxy
     * @param httpsProxy
     * @param noProxy
     * @param uri
     */
    public GitBuildSource(String httpProxy, String httpsProxy, String noProxy, String ref, String uri) {
        this.httpProxy = httpProxy;
        this.httpsProxy = httpsProxy;
        this.noProxy = noProxy;
        this.ref = ref;
        this.uri = uri;
    }

    /**
     * 
     * 
     * @return
     *     The httpProxy
     */
    @JsonProperty("httpProxy")
    public String getHttpProxy() {
        return httpProxy;
    }

    /**
     * 
     * 
     * @param httpProxy
     *     The httpProxy
     */
    @JsonProperty("httpProxy")
    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    /**
     * 
     * 
     * @return
     *     The httpsProxy
     */
    @JsonProperty("httpsProxy")
    public String getHttpsProxy() {
        return httpsProxy;
    }

    /**
     * 
     * 
     * @param httpsProxy
     *     The httpsProxy
     */
    @JsonProperty("httpsProxy")
    public void setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    /**
     * 
     * 
     * @return
     *     The noProxy
     */
    @JsonProperty("noProxy")
    public String getNoProxy() {
        return noProxy;
    }

    /**
     * 
     * 
     * @param noProxy
     *     The noProxy
     */
    @JsonProperty("noProxy")
    public void setNoProxy(String noProxy) {
        this.noProxy = noProxy;
    }

    /**
     * 
     * 
     * @return
     *     The ref
     */
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    /**
     * 
     * 
     * @param ref
     *     The ref
     */
    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * 
     * 
     * @return
     *     The uri
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     * 
     * 
     * @param uri
     *     The uri
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
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
