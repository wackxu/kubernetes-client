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

public interface EventListFluent<A extends EventListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Event item);
    public A setToItems(int index,Event item);
    public A addToItems(Event... items);
    public A addAllToItems(Collection<Event> items);
    public A removeFromItems(Event... items);
    public A removeAllFromItems(Collection<Event> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Event> getItems();
    public List<Event> buildItems();
    public Event buildItem(int index);
    public Event buildFirstItem();
    public Event buildLastItem();
    public Event buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<EventBuilder> predicate);
    public A withItems(List<Event> items);
    public A withItems(Event... items);
    public Boolean hasItems();
    public EventListFluent.ItemsNested<A> addNewItem();
    public EventListFluent.ItemsNested<A> addNewItemLike(Event item);
    public EventListFluent.ItemsNested<A> setNewItemLike(int index,Event item);
    public EventListFluent.ItemsNested<A> editItem(int index);
    public EventListFluent.ItemsNested<A> editFirstItem();
    public EventListFluent.ItemsNested<A> editLastItem();
    public EventListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<EventBuilder> predicate);
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
    public EventListFluent.MetadataNested<A> withNewMetadata();
    public EventListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public EventListFluent.MetadataNested<A> editMetadata();
    public EventListFluent.MetadataNested<A> editOrNewMetadata();
    public EventListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EventFluent<EventListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<EventListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
