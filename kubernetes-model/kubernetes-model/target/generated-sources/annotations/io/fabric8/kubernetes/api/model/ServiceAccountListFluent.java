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

public interface ServiceAccountListFluent<A extends ServiceAccountListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ServiceAccount item);
    public A setToItems(int index,ServiceAccount item);
    public A addToItems(ServiceAccount... items);
    public A addAllToItems(Collection<ServiceAccount> items);
    public A removeFromItems(ServiceAccount... items);
    public A removeAllFromItems(Collection<ServiceAccount> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ServiceAccount> getItems();
    public List<ServiceAccount> buildItems();
    public ServiceAccount buildItem(int index);
    public ServiceAccount buildFirstItem();
    public ServiceAccount buildLastItem();
    public ServiceAccount buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ServiceAccountBuilder> predicate);
    public A withItems(List<ServiceAccount> items);
    public A withItems(ServiceAccount... items);
    public Boolean hasItems();
    public ServiceAccountListFluent.ItemsNested<A> addNewItem();
    public ServiceAccountListFluent.ItemsNested<A> addNewItemLike(ServiceAccount item);
    public ServiceAccountListFluent.ItemsNested<A> setNewItemLike(int index,ServiceAccount item);
    public ServiceAccountListFluent.ItemsNested<A> editItem(int index);
    public ServiceAccountListFluent.ItemsNested<A> editFirstItem();
    public ServiceAccountListFluent.ItemsNested<A> editLastItem();
    public ServiceAccountListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ServiceAccountBuilder> predicate);
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
    public ServiceAccountListFluent.MetadataNested<A> withNewMetadata();
    public ServiceAccountListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ServiceAccountListFluent.MetadataNested<A> editMetadata();
    public ServiceAccountListFluent.MetadataNested<A> editOrNewMetadata();
    public ServiceAccountListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountFluent<ServiceAccountListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ServiceAccountListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
