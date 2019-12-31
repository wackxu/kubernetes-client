package io.fabric8.kubernetes.api.model.apps;

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

public interface DeploymentFluent<A extends DeploymentFluent<A>> extends Fluent<A>{


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
    public DeploymentFluent.MetadataNested<A> withNewMetadata();
    public DeploymentFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public DeploymentFluent.MetadataNested<A> editMetadata();
    public DeploymentFluent.MetadataNested<A> editOrNewMetadata();
    public DeploymentFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentSpec getSpec();
    public DeploymentSpec buildSpec();
    public A withSpec(DeploymentSpec spec);
    public Boolean hasSpec();
    public DeploymentFluent.SpecNested<A> withNewSpec();
    public DeploymentFluent.SpecNested<A> withNewSpecLike(DeploymentSpec item);
    public DeploymentFluent.SpecNested<A> editSpec();
    public DeploymentFluent.SpecNested<A> editOrNewSpec();
    public DeploymentFluent.SpecNested<A> editOrNewSpecLike(DeploymentSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentStatus getStatus();
    public DeploymentStatus buildStatus();
    public A withStatus(DeploymentStatus status);
    public Boolean hasStatus();
    public DeploymentFluent.StatusNested<A> withNewStatus();
    public DeploymentFluent.StatusNested<A> withNewStatusLike(DeploymentStatus item);
    public DeploymentFluent.StatusNested<A> editStatus();
    public DeploymentFluent.StatusNested<A> editOrNewStatus();
    public DeploymentFluent.StatusNested<A> editOrNewStatusLike(DeploymentStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<DeploymentFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentSpecFluent<DeploymentFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentStatusFluent<DeploymentFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
