package io.fabric8.kubernetes.api.model.settings;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ListMetaFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.ListMetaBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface PodPresetListFluent<A extends PodPresetListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,PodPreset item);
    public A setToItems(int index,PodPreset item);
    public A addToItems(PodPreset... items);
    public A addAllToItems(Collection<PodPreset> items);
    public A removeFromItems(PodPreset... items);
    public A removeAllFromItems(Collection<PodPreset> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<PodPreset> getItems();
    public List<PodPreset> buildItems();
    public PodPreset buildItem(int index);
    public PodPreset buildFirstItem();
    public PodPreset buildLastItem();
    public PodPreset buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodPresetBuilder> predicate);
    public A withItems(List<PodPreset> items);
    public A withItems(PodPreset... items);
    public Boolean hasItems();
    public PodPresetListFluent.ItemsNested<A> addNewItem();
    public PodPresetListFluent.ItemsNested<A> addNewItemLike(PodPreset item);
    public PodPresetListFluent.ItemsNested<A> setNewItemLike(int index,PodPreset item);
    public PodPresetListFluent.ItemsNested<A> editItem(int index);
    public PodPresetListFluent.ItemsNested<A> editFirstItem();
    public PodPresetListFluent.ItemsNested<A> editLastItem();
    public PodPresetListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodPresetBuilder> predicate);
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
    public PodPresetListFluent.MetadataNested<A> withNewMetadata();
    public PodPresetListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PodPresetListFluent.MetadataNested<A> editMetadata();
    public PodPresetListFluent.MetadataNested<A> editOrNewMetadata();
    public PodPresetListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodPresetFluent<PodPresetListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PodPresetListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
