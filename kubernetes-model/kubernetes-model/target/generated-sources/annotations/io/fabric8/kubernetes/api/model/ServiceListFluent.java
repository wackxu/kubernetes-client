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

public interface ServiceListFluent<A extends ServiceListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Service item);
    public A setToItems(int index,Service item);
    public A addToItems(Service... items);
    public A addAllToItems(Collection<Service> items);
    public A removeFromItems(Service... items);
    public A removeAllFromItems(Collection<Service> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Service> getItems();
    public List<Service> buildItems();
    public Service buildItem(int index);
    public Service buildFirstItem();
    public Service buildLastItem();
    public Service buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ServiceBuilder> predicate);
    public A withItems(List<Service> items);
    public A withItems(Service... items);
    public Boolean hasItems();
    public ServiceListFluent.ItemsNested<A> addNewItem();
    public ServiceListFluent.ItemsNested<A> addNewItemLike(Service item);
    public ServiceListFluent.ItemsNested<A> setNewItemLike(int index,Service item);
    public ServiceListFluent.ItemsNested<A> editItem(int index);
    public ServiceListFluent.ItemsNested<A> editFirstItem();
    public ServiceListFluent.ItemsNested<A> editLastItem();
    public ServiceListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ServiceBuilder> predicate);
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
    public ServiceListFluent.MetadataNested<A> withNewMetadata();
    public ServiceListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ServiceListFluent.MetadataNested<A> editMetadata();
    public ServiceListFluent.MetadataNested<A> editOrNewMetadata();
    public ServiceListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceFluent<ServiceListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ServiceListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
