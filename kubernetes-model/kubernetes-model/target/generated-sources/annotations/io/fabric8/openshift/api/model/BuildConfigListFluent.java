package io.fabric8.openshift.api.model;

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

public interface BuildConfigListFluent<A extends BuildConfigListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,BuildConfig item);
    public A setToItems(int index,BuildConfig item);
    public A addToItems(BuildConfig... items);
    public A addAllToItems(Collection<BuildConfig> items);
    public A removeFromItems(BuildConfig... items);
    public A removeAllFromItems(Collection<BuildConfig> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<BuildConfig> getItems();
    public List<BuildConfig> buildItems();
    public BuildConfig buildItem(int index);
    public BuildConfig buildFirstItem();
    public BuildConfig buildLastItem();
    public BuildConfig buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<BuildConfigBuilder> predicate);
    public A withItems(List<BuildConfig> items);
    public A withItems(BuildConfig... items);
    public Boolean hasItems();
    public BuildConfigListFluent.ItemsNested<A> addNewItem();
    public BuildConfigListFluent.ItemsNested<A> addNewItemLike(BuildConfig item);
    public BuildConfigListFluent.ItemsNested<A> setNewItemLike(int index,BuildConfig item);
    public BuildConfigListFluent.ItemsNested<A> editItem(int index);
    public BuildConfigListFluent.ItemsNested<A> editFirstItem();
    public BuildConfigListFluent.ItemsNested<A> editLastItem();
    public BuildConfigListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<BuildConfigBuilder> predicate);
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
    public BuildConfigListFluent.MetadataNested<A> withNewMetadata();
    public BuildConfigListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public BuildConfigListFluent.MetadataNested<A> editMetadata();
    public BuildConfigListFluent.MetadataNested<A> editOrNewMetadata();
    public BuildConfigListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildConfigFluent<BuildConfigListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<BuildConfigListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
