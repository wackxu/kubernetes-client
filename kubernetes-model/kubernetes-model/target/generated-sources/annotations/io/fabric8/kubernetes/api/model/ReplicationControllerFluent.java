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

public interface ReplicationControllerFluent<A extends ReplicationControllerFluent<A>> extends Fluent<A>{


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
    public ReplicationControllerFluent.MetadataNested<A> withNewMetadata();
    public ReplicationControllerFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ReplicationControllerFluent.MetadataNested<A> editMetadata();
    public ReplicationControllerFluent.MetadataNested<A> editOrNewMetadata();
    public ReplicationControllerFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ReplicationControllerSpec getSpec();
    public ReplicationControllerSpec buildSpec();
    public A withSpec(ReplicationControllerSpec spec);
    public Boolean hasSpec();
    public ReplicationControllerFluent.SpecNested<A> withNewSpec();
    public ReplicationControllerFluent.SpecNested<A> withNewSpecLike(ReplicationControllerSpec item);
    public ReplicationControllerFluent.SpecNested<A> editSpec();
    public ReplicationControllerFluent.SpecNested<A> editOrNewSpec();
    public ReplicationControllerFluent.SpecNested<A> editOrNewSpecLike(ReplicationControllerSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ReplicationControllerStatus getStatus();
    public ReplicationControllerStatus buildStatus();
    public A withStatus(ReplicationControllerStatus status);
    public Boolean hasStatus();
    public ReplicationControllerFluent.StatusNested<A> withNewStatus();
    public ReplicationControllerFluent.StatusNested<A> withNewStatusLike(ReplicationControllerStatus item);
    public ReplicationControllerFluent.StatusNested<A> editStatus();
    public ReplicationControllerFluent.StatusNested<A> editOrNewStatus();
    public ReplicationControllerFluent.StatusNested<A> editOrNewStatusLike(ReplicationControllerStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ReplicationControllerFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerSpecFluent<ReplicationControllerFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerStatusFluent<ReplicationControllerFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
