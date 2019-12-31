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

public interface UserListFluent<A extends UserListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,User item);
    public A setToItems(int index,User item);
    public A addToItems(User... items);
    public A addAllToItems(Collection<User> items);
    public A removeFromItems(User... items);
    public A removeAllFromItems(Collection<User> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<User> getItems();
    public List<User> buildItems();
    public User buildItem(int index);
    public User buildFirstItem();
    public User buildLastItem();
    public User buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<UserBuilder> predicate);
    public A withItems(List<User> items);
    public A withItems(User... items);
    public Boolean hasItems();
    public UserListFluent.ItemsNested<A> addNewItem();
    public UserListFluent.ItemsNested<A> addNewItemLike(User item);
    public UserListFluent.ItemsNested<A> setNewItemLike(int index,User item);
    public UserListFluent.ItemsNested<A> editItem(int index);
    public UserListFluent.ItemsNested<A> editFirstItem();
    public UserListFluent.ItemsNested<A> editLastItem();
    public UserListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<UserBuilder> predicate);
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
    public UserListFluent.MetadataNested<A> withNewMetadata();
    public UserListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public UserListFluent.MetadataNested<A> editMetadata();
    public UserListFluent.MetadataNested<A> editOrNewMetadata();
    public UserListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserFluent<UserListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<UserListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
