package io.fabric8.kubernetes.api.model.storage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.TopologySelectorTerm;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import io.fabric8.kubernetes.api.model.TopologySelectorTermFluent;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.TopologySelectorTermBuilder;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface StorageClassFluent<A extends StorageClassFluent<A>> extends Fluent<A>{


    public Boolean isAllowVolumeExpansion();
    public A withAllowVolumeExpansion(Boolean allowVolumeExpansion);
    public Boolean hasAllowVolumeExpansion();
    public A withNewAllowVolumeExpansion(String arg1);
    public A withNewAllowVolumeExpansion(boolean arg1);
    public A addToAllowedTopologies(int index,TopologySelectorTerm item);
    public A setToAllowedTopologies(int index,TopologySelectorTerm item);
    public A addToAllowedTopologies(TopologySelectorTerm... items);
    public A addAllToAllowedTopologies(Collection<TopologySelectorTerm> items);
    public A removeFromAllowedTopologies(TopologySelectorTerm... items);
    public A removeAllFromAllowedTopologies(Collection<TopologySelectorTerm> items);
    
/**
 * This method has been deprecated, please use method buildAllowedTopologies instead.
 * @return The buildable object.
 */
@Deprecated public List<TopologySelectorTerm> getAllowedTopologies();
    public List<TopologySelectorTerm> buildAllowedTopologies();
    public TopologySelectorTerm buildAllowedTopology(int index);
    public TopologySelectorTerm buildFirstAllowedTopology();
    public TopologySelectorTerm buildLastAllowedTopology();
    public TopologySelectorTerm buildMatchingAllowedTopology(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorTermBuilder> predicate);
    public A withAllowedTopologies(List<TopologySelectorTerm> allowedTopologies);
    public A withAllowedTopologies(TopologySelectorTerm... allowedTopologies);
    public Boolean hasAllowedTopologies();
    public StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopology();
    public StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopologyLike(TopologySelectorTerm item);
    public StorageClassFluent.AllowedTopologiesNested<A> setNewAllowedTopologyLike(int index,TopologySelectorTerm item);
    public StorageClassFluent.AllowedTopologiesNested<A> editAllowedTopology(int index);
    public StorageClassFluent.AllowedTopologiesNested<A> editFirstAllowedTopology();
    public StorageClassFluent.AllowedTopologiesNested<A> editLastAllowedTopology();
    public StorageClassFluent.AllowedTopologiesNested<A> editMatchingAllowedTopology(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorTermBuilder> predicate);
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
    public StorageClassFluent.MetadataNested<A> withNewMetadata();
    public StorageClassFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public StorageClassFluent.MetadataNested<A> editMetadata();
    public StorageClassFluent.MetadataNested<A> editOrNewMetadata();
    public StorageClassFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToMountOptions(int index,String item);
    public A setToMountOptions(int index,String item);
    public A addToMountOptions(String... items);
    public A addAllToMountOptions(Collection<String> items);
    public A removeFromMountOptions(String... items);
    public A removeAllFromMountOptions(Collection<String> items);
    public List<String> getMountOptions();
    public String getMountOption(int index);
    public String getFirstMountOption();
    public String getLastMountOption();
    public String getMatchingMountOption(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withMountOptions(List<String> mountOptions);
    public A withMountOptions(String... mountOptions);
    public Boolean hasMountOptions();
    public A addToParameters(String key,String value);
    public A addToParameters(Map<String,String> map);
    public A removeFromParameters(String key);
    public A removeFromParameters(Map<String,String> map);
    public Map<String,String> getParameters();
    public A withParameters(Map<String,String> parameters);
    public Boolean hasParameters();
    public String getProvisioner();
    public A withProvisioner(String provisioner);
    public Boolean hasProvisioner();
    public String getReclaimPolicy();
    public A withReclaimPolicy(String reclaimPolicy);
    public Boolean hasReclaimPolicy();
    public String getVolumeBindingMode();
    public A withVolumeBindingMode(String volumeBindingMode);
    public Boolean hasVolumeBindingMode();

    public interface AllowedTopologiesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TopologySelectorTermFluent<StorageClassFluent.AllowedTopologiesNested<N>>{

        
    public N and();    public N endAllowedTopology();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<StorageClassFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
