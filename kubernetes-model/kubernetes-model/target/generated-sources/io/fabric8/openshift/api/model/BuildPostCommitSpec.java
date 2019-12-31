
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
    "args",
    "command",
    "script"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class BuildPostCommitSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("args")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> args = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("command")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> command = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("script")
    private String script;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuildPostCommitSpec() {
    }

    /**
     * 
     * @param args
     * @param command
     * @param script
     */
    public BuildPostCommitSpec(List<String> args, List<String> command, String script) {
        this.args = args;
        this.command = command;
        this.script = script;
    }

    /**
     * 
     * 
     * @return
     *     The args
     */
    @JsonProperty("args")
    public List<String> getArgs() {
        return args;
    }

    /**
     * 
     * 
     * @param args
     *     The args
     */
    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * 
     * 
     * @return
     *     The command
     */
    @JsonProperty("command")
    public List<String> getCommand() {
        return command;
    }

    /**
     * 
     * 
     * @param command
     *     The command
     */
    @JsonProperty("command")
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * 
     * 
     * @return
     *     The script
     */
    @JsonProperty("script")
    public String getScript() {
        return script;
    }

    /**
     * 
     * 
     * @param script
     *     The script
     */
    @JsonProperty("script")
    public void setScript(String script) {
        this.script = script;
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
