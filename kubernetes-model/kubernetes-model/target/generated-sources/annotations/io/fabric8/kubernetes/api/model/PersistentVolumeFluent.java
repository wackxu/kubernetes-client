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

public interface PersistentVolumeFluent<A extends PersistentVolumeFluent<A>> extends Fluent<A>{


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
    public PersistentVolumeFluent.MetadataNested<A> withNewMetadata();
    public PersistentVolumeFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PersistentVolumeFluent.MetadataNested<A> editMetadata();
    public PersistentVolumeFluent.MetadataNested<A> editOrNewMetadata();
    public PersistentVolumeFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeSpec getSpec();
    public PersistentVolumeSpec buildSpec();
    public A withSpec(PersistentVolumeSpec spec);
    public Boolean hasSpec();
    public PersistentVolumeFluent.SpecNested<A> withNewSpec();
    public PersistentVolumeFluent.SpecNested<A> withNewSpecLike(PersistentVolumeSpec item);
    public PersistentVolumeFluent.SpecNested<A> editSpec();
    public PersistentVolumeFluent.SpecNested<A> editOrNewSpec();
    public PersistentVolumeFluent.SpecNested<A> editOrNewSpecLike(PersistentVolumeSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeStatus getStatus();
    public PersistentVolumeStatus buildStatus();
    public A withStatus(PersistentVolumeStatus status);
    public Boolean hasStatus();
    public A withNewStatus(String message,String phase,String reason);
    public PersistentVolumeFluent.StatusNested<A> withNewStatus();
    public PersistentVolumeFluent.StatusNested<A> withNewStatusLike(PersistentVolumeStatus item);
    public PersistentVolumeFluent.StatusNested<A> editStatus();
    public PersistentVolumeFluent.StatusNested<A> editOrNewStatus();
    public PersistentVolumeFluent.StatusNested<A> editOrNewStatusLike(PersistentVolumeStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PersistentVolumeFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeSpecFluent<PersistentVolumeFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeStatusFluent<PersistentVolumeFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
