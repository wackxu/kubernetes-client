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

public interface BuildFluent<A extends BuildFluent<A>> extends Fluent<A>{


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
    public BuildFluent.MetadataNested<A> withNewMetadata();
    public BuildFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public BuildFluent.MetadataNested<A> editMetadata();
    public BuildFluent.MetadataNested<A> editOrNewMetadata();
    public BuildFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public BuildSpec getSpec();
    public BuildSpec buildSpec();
    public A withSpec(BuildSpec spec);
    public Boolean hasSpec();
    public BuildFluent.SpecNested<A> withNewSpec();
    public BuildFluent.SpecNested<A> withNewSpecLike(BuildSpec item);
    public BuildFluent.SpecNested<A> editSpec();
    public BuildFluent.SpecNested<A> editOrNewSpec();
    public BuildFluent.SpecNested<A> editOrNewSpecLike(BuildSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public BuildStatus getStatus();
    public BuildStatus buildStatus();
    public A withStatus(BuildStatus status);
    public Boolean hasStatus();
    public BuildFluent.StatusNested<A> withNewStatus();
    public BuildFluent.StatusNested<A> withNewStatusLike(BuildStatus item);
    public BuildFluent.StatusNested<A> editStatus();
    public BuildFluent.StatusNested<A> editOrNewStatus();
    public BuildFluent.StatusNested<A> editOrNewStatusLike(BuildStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<BuildFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildSpecFluent<BuildFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStatusFluent<BuildFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
