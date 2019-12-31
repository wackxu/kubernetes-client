
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
    "args",
    "command",
    "env"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ExecConfig implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("apiVersion")
    private String apiVersion;
    /**
     * 
     * 
     */
    @JsonProperty("args")
    @Valid
    private List<String> args = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("command")
    private String command;
    /**
     * 
     * 
     */
    @JsonProperty("env")
    @Valid
    private List<ExecEnvVar> env = new ArrayList<ExecEnvVar>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExecConfig() {
    }

    /**
     * 
     * @param args
     * @param apiVersion
     * @param env
     * @param command
     */
    public ExecConfig(String apiVersion, List<String> args, String command, List<ExecEnvVar> env) {
        this.apiVersion = apiVersion;
        this.args = args;
        this.command = command;
        this.env = env;
    }

    /**
     * 
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
    public String getCommand() {
        return command;
    }

    /**
     * 
     * 
     * @param command
     *     The command
     */
    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * 
     * 
     * @return
     *     The env
     */
    @JsonProperty("env")
    public List<ExecEnvVar> getEnv() {
        return env;
    }

    /**
     * 
     * 
     * @param env
     *     The env
     */
    @JsonProperty("env")
    public void setEnv(List<ExecEnvVar> env) {
        this.env = env;
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
