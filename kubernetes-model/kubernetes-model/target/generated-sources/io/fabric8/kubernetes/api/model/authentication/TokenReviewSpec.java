
package io.fabric8.kubernetes.api.model.authentication;

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
    "audiences",
    "token"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class TokenReviewSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("audiences")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<String> audiences = new ArrayList<String>();
    /**
     * 
     * 
     */
    @JsonProperty("token")
    private String token;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TokenReviewSpec() {
    }

    /**
     * 
     * @param audiences
     * @param token
     */
    public TokenReviewSpec(List<String> audiences, String token) {
        this.audiences = audiences;
        this.token = token;
    }

    /**
     * 
     * 
     * @return
     *     The audiences
     */
    @JsonProperty("audiences")
    public List<String> getAudiences() {
        return audiences;
    }

    /**
     * 
     * 
     * @param audiences
     *     The audiences
     */
    @JsonProperty("audiences")
    public void setAudiences(List<String> audiences) {
        this.audiences = audiences;
    }

    /**
     * 
     * 
     * @return
     *     The token
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * 
     * 
     * @param token
     *     The token
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
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
