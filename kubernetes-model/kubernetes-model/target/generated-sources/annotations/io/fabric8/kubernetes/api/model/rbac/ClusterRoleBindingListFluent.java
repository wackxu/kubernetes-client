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

public interface ClusterRoleBindingListFluent<A extends ClusterRoleBindingListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ClusterRoleBinding item);
    public A setToItems(int index,ClusterRoleBinding item);
    public A addToItems(ClusterRoleBinding... items);
    public A addAllToItems(Collection<ClusterRoleBinding> items);
    public A removeFromItems(ClusterRoleBinding... items);
    public A removeAllFromItems(Collection<ClusterRoleBinding> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ClusterRoleBinding> getItems();
    public List<ClusterRoleBinding> buildItems();
    public ClusterRoleBinding buildItem(int index);
    public ClusterRoleBinding buildFirstItem();
    public ClusterRoleBinding buildLastItem();
    public ClusterRoleBinding buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ClusterRoleBindingBuilder> predicate);
    public A withItems(List<ClusterRoleBinding> items);
    public A withItems(ClusterRoleBinding... items);
    public Boolean hasItems();
    public ClusterRoleBindingListFluent.ItemsNested<A> addNewItem();
    public ClusterRoleBindingListFluent.ItemsNested<A> addNewItemLike(ClusterRoleBinding item);
    public ClusterRoleBindingListFluent.ItemsNested<A> setNewItemLike(int index,ClusterRoleBinding item);
    public ClusterRoleBindingListFluent.ItemsNested<A> editItem(int index);
    public ClusterRoleBindingListFluent.ItemsNested<A> editFirstItem();
    public ClusterRoleBindingListFluent.ItemsNested<A> editLastItem();
    public ClusterRoleBindingListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ClusterRoleBindingBuilder> predicate);
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
    public ClusterRoleBindingListFluent.MetadataNested<A> withNewMetadata();
    public ClusterRoleBindingListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ClusterRoleBindingListFluent.MetadataNested<A> editMetadata();
    public ClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadata();
    public ClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleBindingFluent<ClusterRoleBindingListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ClusterRoleBindingListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
