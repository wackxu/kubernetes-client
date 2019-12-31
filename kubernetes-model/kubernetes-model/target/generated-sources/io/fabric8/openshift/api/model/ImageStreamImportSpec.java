
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
    "images",
    "import",
    "repository"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ImageStreamImportSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("images")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<ImageImportSpec> images = new ArrayList<ImageImportSpec>();
    /**
     * 
     * 
     */
    @JsonProperty("import")
    private Boolean _import;
    /**
     * 
     * 
     */
    @JsonProperty("repository")
    @Valid
    private RepositoryImportSpec repository;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageStreamImportSpec() {
    }

    /**
     * 
     * @param images
     * @param _import
     * @param repository
     */
    public ImageStreamImportSpec(List<ImageImportSpec> images, Boolean _import, RepositoryImportSpec repository) {
        this.images = images;
        this._import = _import;
        this.repository = repository;
    }

    /**
     * 
     * 
     * @return
     *     The images
     */
    @JsonProperty("images")
    public List<ImageImportSpec> getImages() {
        return images;
    }

    /**
     * 
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(List<ImageImportSpec> images) {
        this.images = images;
    }

    /**
     * 
     * 
     * @return
     *     The _import
     */
    @JsonProperty("import")
    public Boolean getImport() {
        return _import;
    }

    /**
     * 
     * 
     * @param _import
     *     The import
     */
    @JsonProperty("import")
    public void setImport(Boolean _import) {
        this._import = _import;
    }

    /**
     * 
     * 
     * @return
     *     The repository
     */
    @JsonProperty("repository")
    public RepositoryImportSpec getRepository() {
        return repository;
    }

    /**
     * 
     * 
     * @param repository
     *     The repository
     */
    @JsonProperty("repository")
    public void setRepository(RepositoryImportSpec repository) {
        this.repository = repository;
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
