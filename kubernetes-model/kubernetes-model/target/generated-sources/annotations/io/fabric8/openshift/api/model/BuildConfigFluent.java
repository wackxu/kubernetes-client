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
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

public interface BuildConfigFluent<A extends BuildConfigFluent<A>> extends Fluent<A>{


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
    public BuildConfigFluent.MetadataNested<A> withNewMetadata();
    public BuildConfigFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public BuildConfigFluent.MetadataNested<A> editMetadata();
    public BuildConfigFluent.MetadataNested<A> editOrNewMetadata();
    public BuildConfigFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public BuildConfigSpec getSpec();
    public BuildConfigSpec buildSpec();
    public A withSpec(BuildConfigSpec spec);
    public Boolean hasSpec();
    public BuildConfigFluent.SpecNested<A> withNewSpec();
    public BuildConfigFluent.SpecNested<A> withNewSpecLike(BuildConfigSpec item);
    public BuildConfigFluent.SpecNested<A> editSpec();
    public BuildConfigFluent.SpecNested<A> editOrNewSpec();
    public BuildConfigFluent.SpecNested<A> editOrNewSpecLike(BuildConfigSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public BuildConfigStatus getStatus();
    public BuildConfigStatus buildStatus();
    public A withStatus(BuildConfigStatus status);
    public Boolean hasStatus();
    public A withNewStatus(Long lastVersion);
    public BuildConfigFluent.StatusNested<A> withNewStatus();
    public BuildConfigFluent.StatusNested<A> withNewStatusLike(BuildConfigStatus item);
    public BuildConfigFluent.StatusNested<A> editStatus();
    public BuildConfigFluent.StatusNested<A> editOrNewStatus();
    public BuildConfigFluent.StatusNested<A> editOrNewStatusLike(BuildConfigStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<BuildConfigFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigSpecFluent<BuildConfigFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigStatusFluent<BuildConfigFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
