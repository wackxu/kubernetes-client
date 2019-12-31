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

public interface DeploymentConfigFluent<A extends DeploymentConfigFluent<A>> extends Fluent<A>{


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
    public DeploymentConfigFluent.MetadataNested<A> withNewMetadata();
    public DeploymentConfigFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public DeploymentConfigFluent.MetadataNested<A> editMetadata();
    public DeploymentConfigFluent.MetadataNested<A> editOrNewMetadata();
    public DeploymentConfigFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfigSpec getSpec();
    public DeploymentConfigSpec buildSpec();
    public A withSpec(DeploymentConfigSpec spec);
    public Boolean hasSpec();
    public DeploymentConfigFluent.SpecNested<A> withNewSpec();
    public DeploymentConfigFluent.SpecNested<A> withNewSpecLike(DeploymentConfigSpec item);
    public DeploymentConfigFluent.SpecNested<A> editSpec();
    public DeploymentConfigFluent.SpecNested<A> editOrNewSpec();
    public DeploymentConfigFluent.SpecNested<A> editOrNewSpecLike(DeploymentConfigSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfigStatus getStatus();
    public DeploymentConfigStatus buildStatus();
    public A withStatus(DeploymentConfigStatus status);
    public Boolean hasStatus();
    public DeploymentConfigFluent.StatusNested<A> withNewStatus();
    public DeploymentConfigFluent.StatusNested<A> withNewStatusLike(DeploymentConfigStatus item);
    public DeploymentConfigFluent.StatusNested<A> editStatus();
    public DeploymentConfigFluent.StatusNested<A> editOrNewStatus();
    public DeploymentConfigFluent.StatusNested<A> editOrNewStatusLike(DeploymentConfigStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<DeploymentConfigFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigSpecFluent<DeploymentConfigFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigStatusFluent<DeploymentConfigFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
