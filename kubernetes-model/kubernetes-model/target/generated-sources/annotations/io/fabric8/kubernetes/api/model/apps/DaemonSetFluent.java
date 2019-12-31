package io.fabric8.kubernetes.api.model.apps;

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

public interface DaemonSetFluent<A extends DaemonSetFluent<A>> extends Fluent<A>{


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
    public DaemonSetFluent.MetadataNested<A> withNewMetadata();
    public DaemonSetFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public DaemonSetFluent.MetadataNested<A> editMetadata();
    public DaemonSetFluent.MetadataNested<A> editOrNewMetadata();
    public DaemonSetFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSetSpec getSpec();
    public DaemonSetSpec buildSpec();
    public A withSpec(DaemonSetSpec spec);
    public Boolean hasSpec();
    public DaemonSetFluent.SpecNested<A> withNewSpec();
    public DaemonSetFluent.SpecNested<A> withNewSpecLike(DaemonSetSpec item);
    public DaemonSetFluent.SpecNested<A> editSpec();
    public DaemonSetFluent.SpecNested<A> editOrNewSpec();
    public DaemonSetFluent.SpecNested<A> editOrNewSpecLike(DaemonSetSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSetStatus getStatus();
    public DaemonSetStatus buildStatus();
    public A withStatus(DaemonSetStatus status);
    public Boolean hasStatus();
    public DaemonSetFluent.StatusNested<A> withNewStatus();
    public DaemonSetFluent.StatusNested<A> withNewStatusLike(DaemonSetStatus item);
    public DaemonSetFluent.StatusNested<A> editStatus();
    public DaemonSetFluent.StatusNested<A> editOrNewStatus();
    public DaemonSetFluent.StatusNested<A> editOrNewStatusLike(DaemonSetStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<DaemonSetFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetSpecFluent<DaemonSetFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetStatusFluent<DaemonSetFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
