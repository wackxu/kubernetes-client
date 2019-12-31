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

public interface NodeFluent<A extends NodeFluent<A>> extends Fluent<A>{


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
    public NodeFluent.MetadataNested<A> withNewMetadata();
    public NodeFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public NodeFluent.MetadataNested<A> editMetadata();
    public NodeFluent.MetadataNested<A> editOrNewMetadata();
    public NodeFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public NodeSpec getSpec();
    public NodeSpec buildSpec();
    public A withSpec(NodeSpec spec);
    public Boolean hasSpec();
    public NodeFluent.SpecNested<A> withNewSpec();
    public NodeFluent.SpecNested<A> withNewSpecLike(NodeSpec item);
    public NodeFluent.SpecNested<A> editSpec();
    public NodeFluent.SpecNested<A> editOrNewSpec();
    public NodeFluent.SpecNested<A> editOrNewSpecLike(NodeSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public NodeStatus getStatus();
    public NodeStatus buildStatus();
    public A withStatus(NodeStatus status);
    public Boolean hasStatus();
    public NodeFluent.StatusNested<A> withNewStatus();
    public NodeFluent.StatusNested<A> withNewStatusLike(NodeStatus item);
    public NodeFluent.StatusNested<A> editStatus();
    public NodeFluent.StatusNested<A> editOrNewStatus();
    public NodeFluent.StatusNested<A> editOrNewStatusLike(NodeStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<NodeFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSpecFluent<NodeFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeStatusFluent<NodeFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
