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

public interface ResourceQuotaFluent<A extends ResourceQuotaFluent<A>> extends Fluent<A>{


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
    public ResourceQuotaFluent.MetadataNested<A> withNewMetadata();
    public ResourceQuotaFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ResourceQuotaFluent.MetadataNested<A> editMetadata();
    public ResourceQuotaFluent.MetadataNested<A> editOrNewMetadata();
    public ResourceQuotaFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuotaSpec getSpec();
    public ResourceQuotaSpec buildSpec();
    public A withSpec(ResourceQuotaSpec spec);
    public Boolean hasSpec();
    public ResourceQuotaFluent.SpecNested<A> withNewSpec();
    public ResourceQuotaFluent.SpecNested<A> withNewSpecLike(ResourceQuotaSpec item);
    public ResourceQuotaFluent.SpecNested<A> editSpec();
    public ResourceQuotaFluent.SpecNested<A> editOrNewSpec();
    public ResourceQuotaFluent.SpecNested<A> editOrNewSpecLike(ResourceQuotaSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuotaStatus getStatus();
    public ResourceQuotaStatus buildStatus();
    public A withStatus(ResourceQuotaStatus status);
    public Boolean hasStatus();
    public ResourceQuotaFluent.StatusNested<A> withNewStatus();
    public ResourceQuotaFluent.StatusNested<A> withNewStatusLike(ResourceQuotaStatus item);
    public ResourceQuotaFluent.StatusNested<A> editStatus();
    public ResourceQuotaFluent.StatusNested<A> editOrNewStatus();
    public ResourceQuotaFluent.StatusNested<A> editOrNewStatusLike(ResourceQuotaStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ResourceQuotaFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaSpecFluent<ResourceQuotaFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaStatusFluent<ResourceQuotaFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
