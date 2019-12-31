
package io.fabric8.kubernetes.api.model;

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
    "configMapKeyRef",
    "fieldRef",
    "resourceFieldRef",
    "secretKeyRef"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class EnvVarSource implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("configMapKeyRef")
    @Valid
    private ConfigMapKeySelector configMapKeyRef;
    /**
     * 
     * 
     */
    @JsonProperty("fieldRef")
    @Valid
    private ObjectFieldSelector fieldRef;
    /**
     * 
     * 
     */
    @JsonProperty("resourceFieldRef")
    @Valid
    private ResourceFieldSelector resourceFieldRef;
    /**
     * 
     * 
     */
    @JsonProperty("secretKeyRef")
    @Valid
    private SecretKeySelector secretKeyRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvVarSource() {
    }

    /**
     * 
     * @param secretKeyRef
     * @param resourceFieldRef
     * @param configMapKeyRef
     * @param fieldRef
     */
    public EnvVarSource(ConfigMapKeySelector configMapKeyRef, ObjectFieldSelector fieldRef, ResourceFieldSelector resourceFieldRef, SecretKeySelector secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.fieldRef = fieldRef;
        this.resourceFieldRef = resourceFieldRef;
        this.secretKeyRef = secretKeyRef;
    }

    /**
     * 
     * 
     * @return
     *     The configMapKeyRef
     */
    @JsonProperty("configMapKeyRef")
    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * 
     * 
     * @param configMapKeyRef
     *     The configMapKeyRef
     */
    @JsonProperty("configMapKeyRef")
    public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    /**
     * 
     * 
     * @return
     *     The fieldRef
     */
    @JsonProperty("fieldRef")
    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    /**
     * 
     * 
     * @param fieldRef
     *     The fieldRef
     */
    @JsonProperty("fieldRef")
    public void setFieldRef(ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
    }

    /**
     * 
     * 
     * @return
     *     The resourceFieldRef
     */
    @JsonProperty("resourceFieldRef")
    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    /**
     * 
     * 
     * @param resourceFieldRef
     *     The resourceFieldRef
     */
    @JsonProperty("resourceFieldRef")
    public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    /**
     * 
     * 
     * @return
     *     The secretKeyRef
     */
    @JsonProperty("secretKeyRef")
    public SecretKeySelector getSecretKeyRef() {
        return secretKeyRef;
    }

    /**
     * 
     * 
     * @param secretKeyRef
     *     The secretKeyRef
     */
    @JsonProperty("secretKeyRef")
    public void setSecretKeyRef(SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
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
