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

public interface ConfigMapListFluent<A extends ConfigMapListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ConfigMap item);
    public A setToItems(int index,ConfigMap item);
    public A addToItems(ConfigMap... items);
    public A addAllToItems(Collection<ConfigMap> items);
    public A removeFromItems(ConfigMap... items);
    public A removeAllFromItems(Collection<ConfigMap> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ConfigMap> getItems();
    public List<ConfigMap> buildItems();
    public ConfigMap buildItem(int index);
    public ConfigMap buildFirstItem();
    public ConfigMap buildLastItem();
    public ConfigMap buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuilder> predicate);
    public A withItems(List<ConfigMap> items);
    public A withItems(ConfigMap... items);
    public Boolean hasItems();
    public ConfigMapListFluent.ItemsNested<A> addNewItem();
    public ConfigMapListFluent.ItemsNested<A> addNewItemLike(ConfigMap item);
    public ConfigMapListFluent.ItemsNested<A> setNewItemLike(int index,ConfigMap item);
    public ConfigMapListFluent.ItemsNested<A> editItem(int index);
    public ConfigMapListFluent.ItemsNested<A> editFirstItem();
    public ConfigMapListFluent.ItemsNested<A> editLastItem();
    public ConfigMapListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuilder> predicate);
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
    public ConfigMapListFluent.MetadataNested<A> withNewMetadata();
    public ConfigMapListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ConfigMapListFluent.MetadataNested<A> editMetadata();
    public ConfigMapListFluent.MetadataNested<A> editOrNewMetadata();
    public ConfigMapListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapFluent<ConfigMapListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ConfigMapListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
