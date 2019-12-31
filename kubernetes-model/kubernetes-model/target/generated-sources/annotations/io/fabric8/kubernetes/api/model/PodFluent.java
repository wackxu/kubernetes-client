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

public interface PodFluent<A extends PodFluent<A>> extends Fluent<A>{


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
    public PodFluent.MetadataNested<A> withNewMetadata();
    public PodFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public PodFluent.MetadataNested<A> editMetadata();
    public PodFluent.MetadataNested<A> editOrNewMetadata();
    public PodFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodSpec getSpec();
    public PodSpec buildSpec();
    public A withSpec(PodSpec spec);
    public Boolean hasSpec();
    public PodFluent.SpecNested<A> withNewSpec();
    public PodFluent.SpecNested<A> withNewSpecLike(PodSpec item);
    public PodFluent.SpecNested<A> editSpec();
    public PodFluent.SpecNested<A> editOrNewSpec();
    public PodFluent.SpecNested<A> editOrNewSpecLike(PodSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public PodStatus getStatus();
    public PodStatus buildStatus();
    public A withStatus(PodStatus status);
    public Boolean hasStatus();
    public PodFluent.StatusNested<A> withNewStatus();
    public PodFluent.StatusNested<A> withNewStatusLike(PodStatus item);
    public PodFluent.StatusNested<A> editStatus();
    public PodFluent.StatusNested<A> editOrNewStatus();
    public PodFluent.StatusNested<A> editOrNewStatusLike(PodStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<PodFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSpecFluent<PodFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodStatusFluent<PodFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
