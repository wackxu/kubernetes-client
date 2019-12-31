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

public interface PersistentVolumeListFluent<A extends PersistentVolumeListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,PersistentVolume item);
    public A setToItems(int index,PersistentVolume item);
    public A addToItems(PersistentVolume... items);
    public A addAllToItems(Collection<PersistentVolume> items);
    public A removeFromItems(PersistentVolume... items);
    public A removeAllFromItems(Collection<PersistentVolume> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<PersistentVolume> getItems();
    public List<PersistentVolume> buildItems();
    public PersistentVolume buildItem(int index);
    public PersistentVolume buildFirstItem();
    public PersistentVolume buildLastItem();
    public PersistentVolume buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeBuilder> predicate);
    public A withItems(List<PersistentVolume> items);
    public A withItems(PersistentVolume... items);
    public Boolean hasItems();
    public PersistentVolumeListFluent.ItemsNested<A> addNewItem();
    public PersistentVolumeListFluent.ItemsNested<A> addNewItemLike(PersistentVolume item);
    public PersistentVolumeListFluent.ItemsNested<A> setNewItemLike(int index,PersistentVolume item);
    public PersistentVolumeListFluent.ItemsNested<A> editItem(int index);
    public PersistentVolumeListFluent.ItemsNested<A> editFirstItem();
    public PersistentVolumeListFluent.ItemsNested<A> editLastItem();
    public PersistentVolumeListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeBuilder> predicate);
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
    public PersistentVolumeListFluent.MetadataNested<A> withNewMetadata();
    public PersistentVolumeListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PersistentVolumeListFluent.MetadataNested<A> editMetadata();
    public PersistentVolumeListFluent.MetadataNested<A> editOrNewMetadata();
    public PersistentVolumeListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeFluent<PersistentVolumeListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PersistentVolumeListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
