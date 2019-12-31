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

public interface GroupListFluent<A extends GroupListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Group item);
    public A setToItems(int index,Group item);
    public A addToItems(Group... items);
    public A addAllToItems(Collection<Group> items);
    public A removeFromItems(Group... items);
    public A removeAllFromItems(Collection<Group> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Group> getItems();
    public List<Group> buildItems();
    public Group buildItem(int index);
    public Group buildFirstItem();
    public Group buildLastItem();
    public Group buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<GroupBuilder> predicate);
    public A withItems(List<Group> items);
    public A withItems(Group... items);
    public Boolean hasItems();
    public GroupListFluent.ItemsNested<A> addNewItem();
    public GroupListFluent.ItemsNested<A> addNewItemLike(Group item);
    public GroupListFluent.ItemsNested<A> setNewItemLike(int index,Group item);
    public GroupListFluent.ItemsNested<A> editItem(int index);
    public GroupListFluent.ItemsNested<A> editFirstItem();
    public GroupListFluent.ItemsNested<A> editLastItem();
    public GroupListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<GroupBuilder> predicate);
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
    public GroupListFluent.MetadataNested<A> withNewMetadata();
    public GroupListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public GroupListFluent.MetadataNested<A> editMetadata();
    public GroupListFluent.MetadataNested<A> editOrNewMetadata();
    public GroupListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupFluent<GroupListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<GroupListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
