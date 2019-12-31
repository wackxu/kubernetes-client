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

public interface RouteListFluent<A extends RouteListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Route item);
    public A setToItems(int index,Route item);
    public A addToItems(Route... items);
    public A addAllToItems(Collection<Route> items);
    public A removeFromItems(Route... items);
    public A removeAllFromItems(Collection<Route> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Route> getItems();
    public List<Route> buildItems();
    public Route buildItem(int index);
    public Route buildFirstItem();
    public Route buildLastItem();
    public Route buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<RouteBuilder> predicate);
    public A withItems(List<Route> items);
    public A withItems(Route... items);
    public Boolean hasItems();
    public RouteListFluent.ItemsNested<A> addNewItem();
    public RouteListFluent.ItemsNested<A> addNewItemLike(Route item);
    public RouteListFluent.ItemsNested<A> setNewItemLike(int index,Route item);
    public RouteListFluent.ItemsNested<A> editItem(int index);
    public RouteListFluent.ItemsNested<A> editFirstItem();
    public RouteListFluent.ItemsNested<A> editLastItem();
    public RouteListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<RouteBuilder> predicate);
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
    public RouteListFluent.MetadataNested<A> withNewMetadata();
    public RouteListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public RouteListFluent.MetadataNested<A> editMetadata();
    public RouteListFluent.MetadataNested<A> editOrNewMetadata();
    public RouteListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteFluent<RouteListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<RouteListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
