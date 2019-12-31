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

public interface RouteFluent<A extends RouteFluent<A>> extends Fluent<A>{


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
    public RouteFluent.MetadataNested<A> withNewMetadata();
    public RouteFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public RouteFluent.MetadataNested<A> editMetadata();
    public RouteFluent.MetadataNested<A> editOrNewMetadata();
    public RouteFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public RouteSpec getSpec();
    public RouteSpec buildSpec();
    public A withSpec(RouteSpec spec);
    public Boolean hasSpec();
    public RouteFluent.SpecNested<A> withNewSpec();
    public RouteFluent.SpecNested<A> withNewSpecLike(RouteSpec item);
    public RouteFluent.SpecNested<A> editSpec();
    public RouteFluent.SpecNested<A> editOrNewSpec();
    public RouteFluent.SpecNested<A> editOrNewSpecLike(RouteSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public RouteStatus getStatus();
    public RouteStatus buildStatus();
    public A withStatus(RouteStatus status);
    public Boolean hasStatus();
    public RouteFluent.StatusNested<A> withNewStatus();
    public RouteFluent.StatusNested<A> withNewStatusLike(RouteStatus item);
    public RouteFluent.StatusNested<A> editStatus();
    public RouteFluent.StatusNested<A> editOrNewStatus();
    public RouteFluent.StatusNested<A> editOrNewStatusLike(RouteStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<RouteFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteSpecFluent<RouteFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteStatusFluent<RouteFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
