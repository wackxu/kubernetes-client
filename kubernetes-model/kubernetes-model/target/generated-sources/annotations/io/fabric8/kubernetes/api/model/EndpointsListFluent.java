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

public interface EndpointsListFluent<A extends EndpointsListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Endpoints item);
    public A setToItems(int index,Endpoints item);
    public A addToItems(Endpoints... items);
    public A addAllToItems(Collection<Endpoints> items);
    public A removeFromItems(Endpoints... items);
    public A removeAllFromItems(Collection<Endpoints> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Endpoints> getItems();
    public List<Endpoints> buildItems();
    public Endpoints buildItem(int index);
    public Endpoints buildFirstItem();
    public Endpoints buildLastItem();
    public Endpoints buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<EndpointsBuilder> predicate);
    public A withItems(List<Endpoints> items);
    public A withItems(Endpoints... items);
    public Boolean hasItems();
    public EndpointsListFluent.ItemsNested<A> addNewItem();
    public EndpointsListFluent.ItemsNested<A> addNewItemLike(Endpoints item);
    public EndpointsListFluent.ItemsNested<A> setNewItemLike(int index,Endpoints item);
    public EndpointsListFluent.ItemsNested<A> editItem(int index);
    public EndpointsListFluent.ItemsNested<A> editFirstItem();
    public EndpointsListFluent.ItemsNested<A> editLastItem();
    public EndpointsListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<EndpointsBuilder> predicate);
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
    public EndpointsListFluent.MetadataNested<A> withNewMetadata();
    public EndpointsListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public EndpointsListFluent.MetadataNested<A> editMetadata();
    public EndpointsListFluent.MetadataNested<A> editOrNewMetadata();
    public EndpointsListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EndpointsFluent<EndpointsListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<EndpointsListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
