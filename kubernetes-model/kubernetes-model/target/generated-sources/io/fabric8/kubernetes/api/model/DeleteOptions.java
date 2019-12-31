
package io.fabric8.kubernetes.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
    "dryRun",
    "gracePeriodSeconds",
    "orphanDependents",
    "preconditions",
    "propagationPolicy"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class DeleteOptions implements KubernetesResource
{

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("apiVersion")
    private String apiVersion = "v1";
    /**
     * 
     * 
     */
    @JsonProperty("dryRun")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> dryRun = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("gracePeriodSeconds")
    private Long gracePeriodSeconds;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("kind")
    private String kind = "DeleteOptions";
    /**
     * 
     * 
     */
    @JsonProperty("orphanDependents")
    private Boolean orphanDependents;
    /**
     * 
     * 
     */
    @JsonProperty("preconditions")
    @Valid
    private Preconditions preconditions;
    /**
     * 
     * 
     */
    @JsonProperty("propagationPolicy")
    private String propagationPolicy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeleteOptions() {
    }

    /**
     * 
     * @param orphanDependents
     * @param apiVersion
     * @param dryRun
     * @param kind
     * @param preconditions
     * @param gracePeriodSeconds
     * @param propagationPolicy
     */
    public DeleteOptions(String apiVersion, List<String> dryRun, Long gracePeriodSeconds, String kind, Boolean orphanDependents, Preconditions preconditions, String propagationPolicy) {
        this.apiVersion = apiVersion;
        this.dryRun = dryRun;
        this.gracePeriodSeconds = gracePeriodSeconds;
        this.kind = kind;
        this.orphanDependents = orphanDependents;
        this.preconditions = preconditions;
        this.propagationPolicy = propagationPolicy;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * 
     * @return
     *     The dryRun
     */
    @JsonProperty("dryRun")
    public List<String> getDryRun() {
        return dryRun;
    }

    /**
     * 
     * 
     * @param dryRun
     *     The dryRun
     */
    @JsonProperty("dryRun")
    public void setDryRun(List<String> dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * 
     * 
     * @return
     *     The gracePeriodSeconds
     */
    @JsonProperty("gracePeriodSeconds")
    public Long getGracePeriodSeconds() {
        return gracePeriodSeconds;
    }

    /**
     * 
     * 
     * @param gracePeriodSeconds
     *     The gracePeriodSeconds
     */
    @JsonProperty("gracePeriodSeconds")
    public void setGracePeriodSeconds(Long gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * (Required)
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * 
     * @return
     *     The orphanDependents
     */
    @JsonProperty("orphanDependents")
    public Boolean getOrphanDependents() {
        return orphanDependents;
    }

    /**
     * 
     * 
     * @param orphanDependents
     *     The orphanDependents
     */
    @JsonProperty("orphanDependents")
    public void setOrphanDependents(Boolean orphanDependents) {
        this.orphanDependents = orphanDependents;
    }

    /**
     * 
     * 
     * @return
     *     The preconditions
     */
    @JsonProperty("preconditions")
    public Preconditions getPreconditions() {
        return preconditions;
    }

    /**
     * 
     * 
     * @param preconditions
     *     The preconditions
     */
    @JsonProperty("preconditions")
    public void setPreconditions(Preconditions preconditions) {
        this.preconditions = preconditions;
    }

    /**
     * 
     * 
     * @return
     *     The propagationPolicy
     */
    @JsonProperty("propagationPolicy")
    public String getPropagationPolicy() {
        return propagationPolicy;
    }

    /**
     * 
     * 
     * @param propagationPolicy
     *     The propagationPolicy
     */
    @JsonProperty("propagationPolicy")
    public void setPropagationPolicy(String propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
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
