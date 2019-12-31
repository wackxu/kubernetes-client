package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface PersistentVolumeClaimSpecFluent<A extends PersistentVolumeClaimSpecFluent<A>> extends Fluent<A>{


    public A addToAccessModes(int index,String item);
    public A setToAccessModes(int index,String item);
    public A addToAccessModes(String... items);
    public A addAllToAccessModes(Collection<String> items);
    public A removeFromAccessModes(String... items);
    public A removeAllFromAccessModes(Collection<String> items);
    public List<String> getAccessModes();
    public String getAccessMode(int index);
    public String getFirstAccessMode();
    public String getLastAccessMode();
    public String getMatchingAccessMode(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAccessModes(List<String> accessModes);
    public A withAccessModes(String... accessModes);
    public Boolean hasAccessModes();
    
/**
 * This method has been deprecated, please use method buildDataSource instead.
 * @return The buildable object.
 */
@Deprecated public TypedLocalObjectReference getDataSource();
    public TypedLocalObjectReference buildDataSource();
    public A withDataSource(TypedLocalObjectReference dataSource);
    public Boolean hasDataSource();
    public A withNewDataSource(String apiGroup,String kind,String name);
    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSource();
    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> withNewDataSourceLike(TypedLocalObjectReference item);
    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> editDataSource();
    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSource();
    public PersistentVolumeClaimSpecFluent.DataSourceNested<A> editOrNewDataSourceLike(TypedLocalObjectReference item);
    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources();
    public ResourceRequirements buildResources();
    public A withResources(ResourceRequirements resources);
    public Boolean hasResources();
    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResources();
    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item);
    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> editResources();
    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResources();
    public PersistentVolumeClaimSpecFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item);
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelector();
    public PersistentVolumeClaimSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public PersistentVolumeClaimSpecFluent.SelectorNested<A> editSelector();
    public PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelector();
    public PersistentVolumeClaimSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    public String getStorageClassName();
    public A withStorageClassName(String storageClassName);
    public Boolean hasStorageClassName();
    public String getVolumeMode();
    public A withVolumeMode(String volumeMode);
    public Boolean hasVolumeMode();
    public String getVolumeName();
    public A withVolumeName(String volumeName);
    public Boolean hasVolumeName();

    public interface DataSourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TypedLocalObjectReferenceFluent<PersistentVolumeClaimSpecFluent.DataSourceNested<N>>{

        
    public N and();    public N endDataSource();
}
    public interface ResourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceRequirementsFluent<PersistentVolumeClaimSpecFluent.ResourcesNested<N>>{

        
    public N and();    public N endResources();
}
    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<PersistentVolumeClaimSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}


}
