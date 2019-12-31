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

public interface ResourceQuotaListFluent<A extends ResourceQuotaListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ResourceQuota item);
    public A setToItems(int index,ResourceQuota item);
    public A addToItems(ResourceQuota... items);
    public A addAllToItems(Collection<ResourceQuota> items);
    public A removeFromItems(ResourceQuota... items);
    public A removeAllFromItems(Collection<ResourceQuota> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ResourceQuota> getItems();
    public List<ResourceQuota> buildItems();
    public ResourceQuota buildItem(int index);
    public ResourceQuota buildFirstItem();
    public ResourceQuota buildLastItem();
    public ResourceQuota buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ResourceQuotaBuilder> predicate);
    public A withItems(List<ResourceQuota> items);
    public A withItems(ResourceQuota... items);
    public Boolean hasItems();
    public ResourceQuotaListFluent.ItemsNested<A> addNewItem();
    public ResourceQuotaListFluent.ItemsNested<A> addNewItemLike(ResourceQuota item);
    public ResourceQuotaListFluent.ItemsNested<A> setNewItemLike(int index,ResourceQuota item);
    public ResourceQuotaListFluent.ItemsNested<A> editItem(int index);
    public ResourceQuotaListFluent.ItemsNested<A> editFirstItem();
    public ResourceQuotaListFluent.ItemsNested<A> editLastItem();
    public ResourceQuotaListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ResourceQuotaBuilder> predicate);
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
    public ResourceQuotaListFluent.MetadataNested<A> withNewMetadata();
    public ResourceQuotaListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ResourceQuotaListFluent.MetadataNested<A> editMetadata();
    public ResourceQuotaListFluent.MetadataNested<A> editOrNewMetadata();
    public ResourceQuotaListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceQuotaFluent<ResourceQuotaListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ResourceQuotaListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
