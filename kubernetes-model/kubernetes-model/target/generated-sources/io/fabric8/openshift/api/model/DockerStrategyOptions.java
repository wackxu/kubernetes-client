
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
import io.fabric8.kubernetes.api.model.EnvVar;
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
    "buildArgs",
    "noCache"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DockerStrategyOptions implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("buildArgs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EnvVar> buildArgs = new ArrayList<EnvVar>();
    /**
     * 
     * 
     */
    @JsonProperty("noCache")
    private Boolean noCache;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DockerStrategyOptions() {
    }

    /**
     * 
     * @param noCache
     * @param buildArgs
     */
    public DockerStrategyOptions(List<EnvVar> buildArgs, Boolean noCache) {
        this.buildArgs = buildArgs;
        this.noCache = noCache;
    }

    /**
     * 
     * 
     * @return
     *     The buildArgs
     */
    @JsonProperty("buildArgs")
    public List<EnvVar> getBuildArgs() {
        return buildArgs;
    }

    /**
     * 
     * 
     * @param buildArgs
     *     The buildArgs
     */
    @JsonProperty("buildArgs")
    public void setBuildArgs(List<EnvVar> buildArgs) {
        this.buildArgs = buildArgs;
    }

    /**
     * 
     * 
     * @return
     *     The noCache
     */
    @JsonProperty("noCache")
    public Boolean getNoCache() {
        return noCache;
    }

    /**
     * 
     * 
     * @param noCache
     *     The noCache
     */
    @JsonProperty("noCache")
    public void setNoCache(Boolean noCache) {
        this.noCache = noCache;
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
