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

public interface ServiceFluent<A extends ServiceFluent<A>> extends Fluent<A>{


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
    public ServiceFluent.MetadataNested<A> withNewMetadata();
    public ServiceFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ServiceFluent.MetadataNested<A> editMetadata();
    public ServiceFluent.MetadataNested<A> editOrNewMetadata();
    public ServiceFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ServiceSpec getSpec();
    public ServiceSpec buildSpec();
    public A withSpec(ServiceSpec spec);
    public Boolean hasSpec();
    public ServiceFluent.SpecNested<A> withNewSpec();
    public ServiceFluent.SpecNested<A> withNewSpecLike(ServiceSpec item);
    public ServiceFluent.SpecNested<A> editSpec();
    public ServiceFluent.SpecNested<A> editOrNewSpec();
    public ServiceFluent.SpecNested<A> editOrNewSpecLike(ServiceSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ServiceStatus getStatus();
    public ServiceStatus buildStatus();
    public A withStatus(ServiceStatus status);
    public Boolean hasStatus();
    public ServiceFluent.StatusNested<A> withNewStatus();
    public ServiceFluent.StatusNested<A> withNewStatusLike(ServiceStatus item);
    public ServiceFluent.StatusNested<A> editStatus();
    public ServiceFluent.StatusNested<A> editOrNewStatus();
    public ServiceFluent.StatusNested<A> editOrNewStatusLike(ServiceStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ServiceFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceSpecFluent<ServiceFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceStatusFluent<ServiceFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
