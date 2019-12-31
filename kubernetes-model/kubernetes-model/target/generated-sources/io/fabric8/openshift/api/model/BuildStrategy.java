
package io.fabric8.openshift.api.model;

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
    "customStrategy",
    "dockerStrategy",
    "jenkinsPipelineStrategy",
    "sourceStrategy",
    "type"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildStrategy implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("customStrategy")
    @Valid
    private CustomBuildStrategy customStrategy;
    /**
     * 
     * 
     */
    @JsonProperty("dockerStrategy")
    @Valid
    private DockerBuildStrategy dockerStrategy;
    /**
     * 
     * 
     */
    @JsonProperty("jenkinsPipelineStrategy")
    @Valid
    private JenkinsPipelineBuildStrategy jenkinsPipelineStrategy;
    /**
     * 
     * 
     */
    @JsonProperty("sourceStrategy")
    @Valid
    private SourceBuildStrategy sourceStrategy;
    /**
     * 
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildStrategy() {
    }

    /**
     * 
     * @param jenkinsPipelineStrategy
     * @param sourceStrategy
     * @param dockerStrategy
     * @param type
     * @param customStrategy
     */
    public BuildStrategy(CustomBuildStrategy customStrategy, DockerBuildStrategy dockerStrategy, JenkinsPipelineBuildStrategy jenkinsPipelineStrategy, SourceBuildStrategy sourceStrategy, String type) {
        this.customStrategy = customStrategy;
        this.dockerStrategy = dockerStrategy;
        this.jenkinsPipelineStrategy = jenkinsPipelineStrategy;
        this.sourceStrategy = sourceStrategy;
        this.type = type;
    }

    /**
     * 
     * 
     * @return
     *     The customStrategy
     */
    @JsonProperty("customStrategy")
    public CustomBuildStrategy getCustomStrategy() {
        return customStrategy;
    }

    /**
     * 
     * 
     * @param customStrategy
     *     The customStrategy
     */
    @JsonProperty("customStrategy")
    public void setCustomStrategy(CustomBuildStrategy customStrategy) {
        this.customStrategy = customStrategy;
    }

    /**
     * 
     * 
     * @return
     *     The dockerStrategy
     */
    @JsonProperty("dockerStrategy")
    public DockerBuildStrategy getDockerStrategy() {
        return dockerStrategy;
    }

    /**
     * 
     * 
     * @param dockerStrategy
     *     The dockerStrategy
     */
    @JsonProperty("dockerStrategy")
    public void setDockerStrategy(DockerBuildStrategy dockerStrategy) {
        this.dockerStrategy = dockerStrategy;
    }

    /**
     * 
     * 
     * @return
     *     The jenkinsPipelineStrategy
     */
    @JsonProperty("jenkinsPipelineStrategy")
    public JenkinsPipelineBuildStrategy getJenkinsPipelineStrategy() {
        return jenkinsPipelineStrategy;
    }

    /**
     * 
     * 
     * @param jenkinsPipelineStrategy
     *     The jenkinsPipelineStrategy
     */
    @JsonProperty("jenkinsPipelineStrategy")
    public void setJenkinsPipelineStrategy(JenkinsPipelineBuildStrategy jenkinsPipelineStrategy) {
        this.jenkinsPipelineStrategy = jenkinsPipelineStrategy;
    }

    /**
     * 
     * 
     * @return
     *     The sourceStrategy
     */
    @JsonProperty("sourceStrategy")
    public SourceBuildStrategy getSourceStrategy() {
        return sourceStrategy;
    }

    /**
     * 
     * 
     * @param sourceStrategy
     *     The sourceStrategy
     */
    @JsonProperty("sourceStrategy")
    public void setSourceStrategy(SourceBuildStrategy sourceStrategy) {
        this.sourceStrategy = sourceStrategy;
    }

    /**
     * 
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
