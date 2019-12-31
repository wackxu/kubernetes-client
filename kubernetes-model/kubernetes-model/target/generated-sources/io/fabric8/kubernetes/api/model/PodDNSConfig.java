
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
    "nameservers",
    "options",
    "searches"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PodDNSConfig implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("nameservers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> nameservers = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("options")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<PodDNSConfigOption> options = new ArrayList<PodDNSConfigOption>();
    /**
     * 
     * 
     */
    @JsonProperty("searches")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> searches = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PodDNSConfig() {
    }

    /**
     * 
     * @param searches
     * @param nameservers
     * @param options
     */
    public PodDNSConfig(List<String> nameservers, List<PodDNSConfigOption> options, List<String> searches) {
        this.nameservers = nameservers;
        this.options = options;
        this.searches = searches;
    }

    /**
     * 
     * 
     * @return
     *     The nameservers
     */
    @JsonProperty("nameservers")
    public List<String> getNameservers() {
        return nameservers;
    }

    /**
     * 
     * 
     * @param nameservers
     *     The nameservers
     */
    @JsonProperty("nameservers")
    public void setNameservers(List<String> nameservers) {
        this.nameservers = nameservers;
    }

    /**
     * 
     * 
     * @return
     *     The options
     */
    @JsonProperty("options")
    public List<PodDNSConfigOption> getOptions() {
        return options;
    }

    /**
     * 
     * 
     * @param options
     *     The options
     */
    @JsonProperty("options")
    public void setOptions(List<PodDNSConfigOption> options) {
        this.options = options;
    }

    /**
     * 
     * 
     * @return
     *     The searches
     */
    @JsonProperty("searches")
    public List<String> getSearches() {
        return searches;
    }

    /**
     * 
     * 
     * @param searches
     *     The searches
     */
    @JsonProperty("searches")
    public void setSearches(List<String> searches) {
        this.searches = searches;
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
