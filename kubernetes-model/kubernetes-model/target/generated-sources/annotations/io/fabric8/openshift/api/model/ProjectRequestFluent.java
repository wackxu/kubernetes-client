package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ProjectRequestFluent<A extends ProjectRequestFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getDescription();
    public A withDescription(String description);
    public Boolean hasDescription();
    public String getDisplayName();
    public A withDisplayName(String displayName);
    public Boolean hasDisplayName();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public ProjectRequestFluent.MetadataNested<A> withNewMetadata();
    public ProjectRequestFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ProjectRequestFluent.MetadataNested<A> editMetadata();
    public ProjectRequestFluent.MetadataNested<A> editOrNewMetadata();
    public ProjectRequestFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ProjectRequestFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
