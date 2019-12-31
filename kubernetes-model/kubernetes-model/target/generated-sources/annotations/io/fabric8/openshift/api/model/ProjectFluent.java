package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface ProjectFluent<A extends ProjectFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
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
    public ProjectFluent.MetadataNested<A> withNewMetadata();
    public ProjectFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ProjectFluent.MetadataNested<A> editMetadata();
    public ProjectFluent.MetadataNested<A> editOrNewMetadata();
    public ProjectFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ProjectSpec getSpec();
    public ProjectSpec buildSpec();
    public A withSpec(ProjectSpec spec);
    public Boolean hasSpec();
    public ProjectFluent.SpecNested<A> withNewSpec();
    public ProjectFluent.SpecNested<A> withNewSpecLike(ProjectSpec item);
    public ProjectFluent.SpecNested<A> editSpec();
    public ProjectFluent.SpecNested<A> editOrNewSpec();
    public ProjectFluent.SpecNested<A> editOrNewSpecLike(ProjectSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ProjectStatus getStatus();
    public ProjectStatus buildStatus();
    public A withStatus(ProjectStatus status);
    public Boolean hasStatus();
    public A withNewStatus(String phase);
    public ProjectFluent.StatusNested<A> withNewStatus();
    public ProjectFluent.StatusNested<A> withNewStatusLike(ProjectStatus item);
    public ProjectFluent.StatusNested<A> editStatus();
    public ProjectFluent.StatusNested<A> editOrNewStatus();
    public ProjectFluent.StatusNested<A> editOrNewStatusLike(ProjectStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ProjectFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectSpecFluent<ProjectFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectStatusFluent<ProjectFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
