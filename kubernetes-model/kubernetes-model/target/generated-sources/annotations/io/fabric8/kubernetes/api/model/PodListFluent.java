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

public interface PodListFluent<A extends PodListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Pod item);
    public A setToItems(int index,Pod item);
    public A addToItems(Pod... items);
    public A addAllToItems(Collection<Pod> items);
    public A removeFromItems(Pod... items);
    public A removeAllFromItems(Collection<Pod> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Pod> getItems();
    public List<Pod> buildItems();
    public Pod buildItem(int index);
    public Pod buildFirstItem();
    public Pod buildLastItem();
    public Pod buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodBuilder> predicate);
    public A withItems(List<Pod> items);
    public A withItems(Pod... items);
    public Boolean hasItems();
    public PodListFluent.ItemsNested<A> addNewItem();
    public PodListFluent.ItemsNested<A> addNewItemLike(Pod item);
    public PodListFluent.ItemsNested<A> setNewItemLike(int index,Pod item);
    public PodListFluent.ItemsNested<A> editItem(int index);
    public PodListFluent.ItemsNested<A> editFirstItem();
    public PodListFluent.ItemsNested<A> editLastItem();
    public PodListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodBuilder> predicate);
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
    public PodListFluent.MetadataNested<A> withNewMetadata();
    public PodListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PodListFluent.MetadataNested<A> editMetadata();
    public PodListFluent.MetadataNested<A> editOrNewMetadata();
    public PodListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodFluent<PodListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PodListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
