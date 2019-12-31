package io.fabric8.kubernetes.api.model.storage;

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

public interface StorageClassListFluent<A extends StorageClassListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,StorageClass item);
    public A setToItems(int index,StorageClass item);
    public A addToItems(StorageClass... items);
    public A addAllToItems(Collection<StorageClass> items);
    public A removeFromItems(StorageClass... items);
    public A removeAllFromItems(Collection<StorageClass> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<StorageClass> getItems();
    public List<StorageClass> buildItems();
    public StorageClass buildItem(int index);
    public StorageClass buildFirstItem();
    public StorageClass buildLastItem();
    public StorageClass buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<StorageClassBuilder> predicate);
    public A withItems(List<StorageClass> items);
    public A withItems(StorageClass... items);
    public Boolean hasItems();
    public StorageClassListFluent.ItemsNested<A> addNewItem();
    public StorageClassListFluent.ItemsNested<A> addNewItemLike(StorageClass item);
    public StorageClassListFluent.ItemsNested<A> setNewItemLike(int index,StorageClass item);
    public StorageClassListFluent.ItemsNested<A> editItem(int index);
    public StorageClassListFluent.ItemsNested<A> editFirstItem();
    public StorageClassListFluent.ItemsNested<A> editLastItem();
    public StorageClassListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<StorageClassBuilder> predicate);
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
    public StorageClassListFluent.MetadataNested<A> withNewMetadata();
    public StorageClassListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public StorageClassListFluent.MetadataNested<A> editMetadata();
    public StorageClassListFluent.MetadataNested<A> editOrNewMetadata();
    public StorageClassListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageClassFluent<StorageClassListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<StorageClassListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
