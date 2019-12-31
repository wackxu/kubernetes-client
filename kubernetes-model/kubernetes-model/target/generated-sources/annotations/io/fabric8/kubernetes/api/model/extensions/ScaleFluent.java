package io.fabric8.kubernetes.api.model.extensions;

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
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface ScaleFluent<A extends ScaleFluent<A>> extends Fluent<A>{


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
    public ScaleFluent.MetadataNested<A> withNewMetadata();
    public ScaleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ScaleFluent.MetadataNested<A> editMetadata();
    public ScaleFluent.MetadataNested<A> editOrNewMetadata();
    public ScaleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ScaleSpec getSpec();
    public ScaleSpec buildSpec();
    public A withSpec(ScaleSpec spec);
    public Boolean hasSpec();
    public A withNewSpec(Integer replicas);
    public ScaleFluent.SpecNested<A> withNewSpec();
    public ScaleFluent.SpecNested<A> withNewSpecLike(ScaleSpec item);
    public ScaleFluent.SpecNested<A> editSpec();
    public ScaleFluent.SpecNested<A> editOrNewSpec();
    public ScaleFluent.SpecNested<A> editOrNewSpecLike(ScaleSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ScaleStatus getStatus();
    public ScaleStatus buildStatus();
    public A withStatus(ScaleStatus status);
    public Boolean hasStatus();
    public ScaleFluent.StatusNested<A> withNewStatus();
    public ScaleFluent.StatusNested<A> withNewStatusLike(ScaleStatus item);
    public ScaleFluent.StatusNested<A> editStatus();
    public ScaleFluent.StatusNested<A> editOrNewStatus();
    public ScaleFluent.StatusNested<A> editOrNewStatusLike(ScaleStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ScaleFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleSpecFluent<ScaleFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleStatusFluent<ScaleFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
