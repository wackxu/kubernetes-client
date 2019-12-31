package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface PersistentVolumeClaimFluent<A extends PersistentVolumeClaimFluent<A>> extends Fluent<A>{


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
    public PersistentVolumeClaimFluent.MetadataNested<A> withNewMetadata();
    public PersistentVolumeClaimFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PersistentVolumeClaimFluent.MetadataNested<A> editMetadata();
    public PersistentVolumeClaimFluent.MetadataNested<A> editOrNewMetadata();
    public PersistentVolumeClaimFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimSpec getSpec();
    public PersistentVolumeClaimSpec buildSpec();
    public A withSpec(PersistentVolumeClaimSpec spec);
    public Boolean hasSpec();
    public PersistentVolumeClaimFluent.SpecNested<A> withNewSpec();
    public PersistentVolumeClaimFluent.SpecNested<A> withNewSpecLike(PersistentVolumeClaimSpec item);
    public PersistentVolumeClaimFluent.SpecNested<A> editSpec();
    public PersistentVolumeClaimFluent.SpecNested<A> editOrNewSpec();
    public PersistentVolumeClaimFluent.SpecNested<A> editOrNewSpecLike(PersistentVolumeClaimSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimStatus getStatus();
    public PersistentVolumeClaimStatus buildStatus();
    public A withStatus(PersistentVolumeClaimStatus status);
    public Boolean hasStatus();
    public PersistentVolumeClaimFluent.StatusNested<A> withNewStatus();
    public PersistentVolumeClaimFluent.StatusNested<A> withNewStatusLike(PersistentVolumeClaimStatus item);
    public PersistentVolumeClaimFluent.StatusNested<A> editStatus();
    public PersistentVolumeClaimFluent.StatusNested<A> editOrNewStatus();
    public PersistentVolumeClaimFluent.StatusNested<A> editOrNewStatusLike(PersistentVolumeClaimStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PersistentVolumeClaimFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimSpecFluent<PersistentVolumeClaimFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimStatusFluent<PersistentVolumeClaimFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
