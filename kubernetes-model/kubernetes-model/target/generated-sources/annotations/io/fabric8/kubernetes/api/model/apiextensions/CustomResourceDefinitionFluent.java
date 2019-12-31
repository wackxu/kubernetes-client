package io.fabric8.kubernetes.api.model.apiextensions;

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

public interface CustomResourceDefinitionFluent<A extends CustomResourceDefinitionFluent<A>> extends Fluent<A>{


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
    public CustomResourceDefinitionFluent.MetadataNested<A> withNewMetadata();
    public CustomResourceDefinitionFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public CustomResourceDefinitionFluent.MetadataNested<A> editMetadata();
    public CustomResourceDefinitionFluent.MetadataNested<A> editOrNewMetadata();
    public CustomResourceDefinitionFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionSpec getSpec();
    public CustomResourceDefinitionSpec buildSpec();
    public A withSpec(CustomResourceDefinitionSpec spec);
    public Boolean hasSpec();
    public CustomResourceDefinitionFluent.SpecNested<A> withNewSpec();
    public CustomResourceDefinitionFluent.SpecNested<A> withNewSpecLike(CustomResourceDefinitionSpec item);
    public CustomResourceDefinitionFluent.SpecNested<A> editSpec();
    public CustomResourceDefinitionFluent.SpecNested<A> editOrNewSpec();
    public CustomResourceDefinitionFluent.SpecNested<A> editOrNewSpecLike(CustomResourceDefinitionSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionStatus getStatus();
    public CustomResourceDefinitionStatus buildStatus();
    public A withStatus(CustomResourceDefinitionStatus status);
    public Boolean hasStatus();
    public CustomResourceDefinitionFluent.StatusNested<A> withNewStatus();
    public CustomResourceDefinitionFluent.StatusNested<A> withNewStatusLike(CustomResourceDefinitionStatus item);
    public CustomResourceDefinitionFluent.StatusNested<A> editStatus();
    public CustomResourceDefinitionFluent.StatusNested<A> editOrNewStatus();
    public CustomResourceDefinitionFluent.StatusNested<A> editOrNewStatusLike(CustomResourceDefinitionStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<CustomResourceDefinitionFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionSpecFluent<CustomResourceDefinitionFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionStatusFluent<CustomResourceDefinitionFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
