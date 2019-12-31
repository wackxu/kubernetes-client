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

public interface NamespaceFluent<A extends NamespaceFluent<A>> extends Fluent<A>{


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
    public NamespaceFluent.MetadataNested<A> withNewMetadata();
    public NamespaceFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public NamespaceFluent.MetadataNested<A> editMetadata();
    public NamespaceFluent.MetadataNested<A> editOrNewMetadata();
    public NamespaceFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public NamespaceSpec getSpec();
    public NamespaceSpec buildSpec();
    public A withSpec(NamespaceSpec spec);
    public Boolean hasSpec();
    public NamespaceFluent.SpecNested<A> withNewSpec();
    public NamespaceFluent.SpecNested<A> withNewSpecLike(NamespaceSpec item);
    public NamespaceFluent.SpecNested<A> editSpec();
    public NamespaceFluent.SpecNested<A> editOrNewSpec();
    public NamespaceFluent.SpecNested<A> editOrNewSpecLike(NamespaceSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public NamespaceStatus getStatus();
    public NamespaceStatus buildStatus();
    public A withStatus(NamespaceStatus status);
    public Boolean hasStatus();
    public A withNewStatus(String phase);
    public NamespaceFluent.StatusNested<A> withNewStatus();
    public NamespaceFluent.StatusNested<A> withNewStatusLike(NamespaceStatus item);
    public NamespaceFluent.StatusNested<A> editStatus();
    public NamespaceFluent.StatusNested<A> editOrNewStatus();
    public NamespaceFluent.StatusNested<A> editOrNewStatusLike(NamespaceStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<NamespaceFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceSpecFluent<NamespaceFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceStatusFluent<NamespaceFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
