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

public interface ComponentStatusListFluent<A extends ComponentStatusListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ComponentStatus item);
    public A setToItems(int index,ComponentStatus item);
    public A addToItems(ComponentStatus... items);
    public A addAllToItems(Collection<ComponentStatus> items);
    public A removeFromItems(ComponentStatus... items);
    public A removeAllFromItems(Collection<ComponentStatus> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ComponentStatus> getItems();
    public List<ComponentStatus> buildItems();
    public ComponentStatus buildItem(int index);
    public ComponentStatus buildFirstItem();
    public ComponentStatus buildLastItem();
    public ComponentStatus buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ComponentStatusBuilder> predicate);
    public A withItems(List<ComponentStatus> items);
    public A withItems(ComponentStatus... items);
    public Boolean hasItems();
    public ComponentStatusListFluent.ItemsNested<A> addNewItem();
    public ComponentStatusListFluent.ItemsNested<A> addNewItemLike(ComponentStatus item);
    public ComponentStatusListFluent.ItemsNested<A> setNewItemLike(int index,ComponentStatus item);
    public ComponentStatusListFluent.ItemsNested<A> editItem(int index);
    public ComponentStatusListFluent.ItemsNested<A> editFirstItem();
    public ComponentStatusListFluent.ItemsNested<A> editLastItem();
    public ComponentStatusListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ComponentStatusBuilder> predicate);
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
    public ComponentStatusListFluent.MetadataNested<A> withNewMetadata();
    public ComponentStatusListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ComponentStatusListFluent.MetadataNested<A> editMetadata();
    public ComponentStatusListFluent.MetadataNested<A> editOrNewMetadata();
    public ComponentStatusListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentStatusFluent<ComponentStatusListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ComponentStatusListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
