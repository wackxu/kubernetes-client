package io.fabric8.kubernetes.api.model.rbac;

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

public interface RoleBindingListFluent<A extends RoleBindingListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,RoleBinding item);
    public A setToItems(int index,RoleBinding item);
    public A addToItems(RoleBinding... items);
    public A addAllToItems(Collection<RoleBinding> items);
    public A removeFromItems(RoleBinding... items);
    public A removeAllFromItems(Collection<RoleBinding> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<RoleBinding> getItems();
    public List<RoleBinding> buildItems();
    public RoleBinding buildItem(int index);
    public RoleBinding buildFirstItem();
    public RoleBinding buildLastItem();
    public RoleBinding buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<RoleBindingBuilder> predicate);
    public A withItems(List<RoleBinding> items);
    public A withItems(RoleBinding... items);
    public Boolean hasItems();
    public RoleBindingListFluent.ItemsNested<A> addNewItem();
    public RoleBindingListFluent.ItemsNested<A> addNewItemLike(RoleBinding item);
    public RoleBindingListFluent.ItemsNested<A> setNewItemLike(int index,RoleBinding item);
    public RoleBindingListFluent.ItemsNested<A> editItem(int index);
    public RoleBindingListFluent.ItemsNested<A> editFirstItem();
    public RoleBindingListFluent.ItemsNested<A> editLastItem();
    public RoleBindingListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<RoleBindingBuilder> predicate);
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
    public RoleBindingListFluent.MetadataNested<A> withNewMetadata();
    public RoleBindingListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public RoleBindingListFluent.MetadataNested<A> editMetadata();
    public RoleBindingListFluent.MetadataNested<A> editOrNewMetadata();
    public RoleBindingListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleBindingFluent<RoleBindingListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<RoleBindingListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
