package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface EndpointsFluent<A extends EndpointsFluent<A>> extends Fluent<A>{


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
    public EndpointsFluent.MetadataNested<A> withNewMetadata();
    public EndpointsFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public EndpointsFluent.MetadataNested<A> editMetadata();
    public EndpointsFluent.MetadataNested<A> editOrNewMetadata();
    public EndpointsFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToSubsets(int index,EndpointSubset item);
    public A setToSubsets(int index,EndpointSubset item);
    public A addToSubsets(EndpointSubset... items);
    public A addAllToSubsets(Collection<EndpointSubset> items);
    public A removeFromSubsets(EndpointSubset... items);
    public A removeAllFromSubsets(Collection<EndpointSubset> items);
    
/**
 * This method has been deprecated, please use method buildSubsets instead.
 * @return The buildable object.
 */
@Deprecated public List<EndpointSubset> getSubsets();
    public List<EndpointSubset> buildSubsets();
    public EndpointSubset buildSubset(int index);
    public EndpointSubset buildFirstSubset();
    public EndpointSubset buildLastSubset();
    public EndpointSubset buildMatchingSubset(io.fabric8.kubernetes.api.builder.Predicate<EndpointSubsetBuilder> predicate);
    public A withSubsets(List<EndpointSubset> subsets);
    public A withSubsets(EndpointSubset... subsets);
    public Boolean hasSubsets();
    public EndpointsFluent.SubsetsNested<A> addNewSubset();
    public EndpointsFluent.SubsetsNested<A> addNewSubsetLike(EndpointSubset item);
    public EndpointsFluent.SubsetsNested<A> setNewSubsetLike(int index,EndpointSubset item);
    public EndpointsFluent.SubsetsNested<A> editSubset(int index);
    public EndpointsFluent.SubsetsNested<A> editFirstSubset();
    public EndpointsFluent.SubsetsNested<A> editLastSubset();
    public EndpointsFluent.SubsetsNested<A> editMatchingSubset(io.fabric8.kubernetes.api.builder.Predicate<EndpointSubsetBuilder> predicate);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<EndpointsFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SubsetsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointSubsetFluent<EndpointsFluent.SubsetsNested<N>>{

        
    public N and();    public N endSubset();
}


}
