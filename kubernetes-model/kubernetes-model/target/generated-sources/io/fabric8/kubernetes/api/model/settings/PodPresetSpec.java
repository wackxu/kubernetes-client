
package io.fabric8.kubernetes.api.model.settings;

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
import io.fabric8.kubernetes.api.model.EnvFromSource;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
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
    "envFrom",
    "selector",
    "volumeMounts",
    "volumes"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodPresetSpec implements KubernetesResource
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
    @JsonProperty("envFrom")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<EnvFromSource> envFrom = new ArrayList<EnvFromSource>();
    /**
     * 
     * 
     */
    @JsonProperty("selector")
    @Valid
    private LabelSelector selector;
    /**
     * 
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
    /**
     * 
     * 
     */
    @JsonProperty("volumes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<Volume> volumes = new ArrayList<Volume>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodPresetSpec() {
    }

    /**
     * 
     * @param volumes
     * @param selector
     * @param env
     * @param envFrom
     * @param volumeMounts
     */
    public PodPresetSpec(List<EnvVar> env, List<EnvFromSource> envFrom, LabelSelector selector, List<VolumeMount> volumeMounts, List<Volume> volumes) {
        this.env = env;
        this.envFrom = envFrom;
        this.selector = selector;
        this.volumeMounts = volumeMounts;
        this.volumes = volumes;
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
     *     The envFrom
     */
    @JsonProperty("envFrom")
    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    /**
     * 
     * 
     * @param envFrom
     *     The envFrom
     */
    @JsonProperty("envFrom")
    public void setEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
    }

    /**
     * 
     * 
     * @return
     *     The selector
     */
    @JsonProperty("selector")
    public LabelSelector getSelector() {
        return selector;
    }

    /**
     * 
     * 
     * @param selector
     *     The selector
     */
    @JsonProperty("selector")
    public void setSelector(LabelSelector selector) {
        this.selector = selector;
    }

    /**
     * 
     * 
     * @return
     *     The volumeMounts
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * 
     * 
     * @param volumeMounts
     *     The volumeMounts
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    /**
     * 
     * 
     * @return
     *     The volumes
     */
    @JsonProperty("volumes")
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * 
     * 
     * @param volumes
     *     The volumes
     */
    @JsonProperty("volumes")
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
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
