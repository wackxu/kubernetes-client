
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
    "grouprestriction",
    "serviceaccountrestriction",
    "userrestriction"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class OpenshiftRoleBindingRestrictionSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("grouprestriction")
    @Valid
    private GroupRestriction grouprestriction;
    /**
     * 
     * 
     */
    @JsonProperty("serviceaccountrestriction")
    @Valid
    private ServiceAccountRestriction serviceaccountrestriction;
    /**
     * 
     * 
     */
    @JsonProperty("userrestriction")
    @Valid
    private UserRestriction userrestriction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OpenshiftRoleBindingRestrictionSpec() {
    }

    /**
     * 
     * @param serviceaccountrestriction
     * @param grouprestriction
     * @param userrestriction
     */
    public OpenshiftRoleBindingRestrictionSpec(GroupRestriction grouprestriction, ServiceAccountRestriction serviceaccountrestriction, UserRestriction userrestriction) {
        this.grouprestriction = grouprestriction;
        this.serviceaccountrestriction = serviceaccountrestriction;
        this.userrestriction = userrestriction;
    }

    /**
     * 
     * 
     * @return
     *     The grouprestriction
     */
    @JsonProperty("grouprestriction")
    public GroupRestriction getGrouprestriction() {
        return grouprestriction;
    }

    /**
     * 
     * 
     * @param grouprestriction
     *     The grouprestriction
     */
    @JsonProperty("grouprestriction")
    public void setGrouprestriction(GroupRestriction grouprestriction) {
        this.grouprestriction = grouprestriction;
    }

    /**
     * 
     * 
     * @return
     *     The serviceaccountrestriction
     */
    @JsonProperty("serviceaccountrestriction")
    public ServiceAccountRestriction getServiceaccountrestriction() {
        return serviceaccountrestriction;
    }

    /**
     * 
     * 
     * @param serviceaccountrestriction
     *     The serviceaccountrestriction
     */
    @JsonProperty("serviceaccountrestriction")
    public void setServiceaccountrestriction(ServiceAccountRestriction serviceaccountrestriction) {
        this.serviceaccountrestriction = serviceaccountrestriction;
    }

    /**
     * 
     * 
     * @return
     *     The userrestriction
     */
    @JsonProperty("userrestriction")
    public UserRestriction getUserrestriction() {
        return userrestriction;
    }

    /**
     * 
     * 
     * @param userrestriction
     *     The userrestriction
     */
    @JsonProperty("userrestriction")
    public void setUserrestriction(UserRestriction userrestriction) {
        this.userrestriction = userrestriction;
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
