
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
    "env",
    "jenkinsfile",
    "jenkinsfilePath"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class JenkinsPipelineBuildStrategy implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("env")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EnvVar> env = new ArrayList<EnvVar>();
    /**
     * 
     * 
     */
    @JsonProperty("jenkinsfile")
    private String jenkinsfile;
    /**
     * 
     * 
     */
    @JsonProperty("jenkinsfilePath")
    private String jenkinsfilePath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JenkinsPipelineBuildStrategy() {
    }

    /**
     * 
     * @param jenkinsfilePath
     * @param jenkinsfile
     * @param env
     */
    public JenkinsPipelineBuildStrategy(List<EnvVar> env, String jenkinsfile, String jenkinsfilePath) {
        this.env = env;
        this.jenkinsfile = jenkinsfile;
        this.jenkinsfilePath = jenkinsfilePath;
    }

    /**
     * 
     * 
     * @return
     *     The env
     */
    @JsonProperty("env")
    public List<EnvVar> getEnv() {
        return env;
    }

    /**
     * 
     * 
     * @param env
     *     The env
     */
    @JsonProperty("env")
    public void setEnv(List<EnvVar> env) {
        this.env = env;
    }

    /**
     * 
     * 
     * @return
     *     The jenkinsfile
     */
    @JsonProperty("jenkinsfile")
    public String getJenkinsfile() {
        return jenkinsfile;
    }

    /**
     * 
     * 
     * @param jenkinsfile
     *     The jenkinsfile
     */
    @JsonProperty("jenkinsfile")
    public void setJenkinsfile(String jenkinsfile) {
        this.jenkinsfile = jenkinsfile;
    }

    /**
     * 
     * 
     * @return
     *     The jenkinsfilePath
     */
    @JsonProperty("jenkinsfilePath")
    public String getJenkinsfilePath() {
        return jenkinsfilePath;
    }

    /**
     * 
     * 
     * @param jenkinsfilePath
     *     The jenkinsfilePath
     */
    @JsonProperty("jenkinsfilePath")
    public void setJenkinsfilePath(String jenkinsfilePath) {
        this.jenkinsfilePath = jenkinsfilePath;
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
