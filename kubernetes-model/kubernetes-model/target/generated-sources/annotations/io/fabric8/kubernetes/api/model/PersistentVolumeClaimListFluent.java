package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface PersistentVolumeClaimListFluent<A extends PersistentVolumeClaimListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,PersistentVolumeClaim item);
    public A setToItems(int index,PersistentVolumeClaim item);
    public A addToItems(PersistentVolumeClaim... items);
    public A addAllToItems(Collection<PersistentVolumeClaim> items);
    public A removeFromItems(PersistentVolumeClaim... items);
    public A removeAllFromItems(Collection<PersistentVolumeClaim> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<PersistentVolumeClaim> getItems();
    public List<PersistentVolumeClaim> buildItems();
    public PersistentVolumeClaim buildItem(int index);
    public PersistentVolumeClaim buildFirstItem();
    public PersistentVolumeClaim buildLastItem();
    public PersistentVolumeClaim buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimBuilder> predicate);
    public A withItems(List<PersistentVolumeClaim> items);
    public A withItems(PersistentVolumeClaim... items);
    public Boolean hasItems();
    public PersistentVolumeClaimListFluent.ItemsNested<A> addNewItem();
    public PersistentVolumeClaimListFluent.ItemsNested<A> addNewItemLike(PersistentVolumeClaim item);
    public PersistentVolumeClaimListFluent.ItemsNested<A> setNewItemLike(int index,PersistentVolumeClaim item);
    public PersistentVolumeClaimListFluent.ItemsNested<A> editItem(int index);
    public PersistentVolumeClaimListFluent.ItemsNested<A> editFirstItem();
    public PersistentVolumeClaimListFluent.ItemsNested<A> editLastItem();
    public PersistentVolumeClaimListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimBuilder> predicate);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata();
    public ListMeta buildMetadata();
    public A withMetadata(ListMeta metadata);
    public Boolean hasMetadata();
    public A withNewMetadata(String _continue,String resourceVersion,String selfLink);
    public PersistentVolumeClaimListFluent.MetadataNested<A> withNewMetadata();
    public PersistentVolumeClaimListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PersistentVolumeClaimListFluent.MetadataNested<A> editMetadata();
    public PersistentVolumeClaimListFluent.MetadataNested<A> editOrNewMetadata();
    public PersistentVolumeClaimListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<PersistentVolumeClaimListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PersistentVolumeClaimListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
