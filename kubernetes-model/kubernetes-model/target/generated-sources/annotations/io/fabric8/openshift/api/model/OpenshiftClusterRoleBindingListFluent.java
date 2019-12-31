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

public interface OpenshiftClusterRoleBindingListFluent<A extends OpenshiftClusterRoleBindingListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,OpenshiftClusterRoleBinding item);
    public A setToItems(int index,OpenshiftClusterRoleBinding item);
    public A addToItems(OpenshiftClusterRoleBinding... items);
    public A addAllToItems(Collection<OpenshiftClusterRoleBinding> items);
    public A removeFromItems(OpenshiftClusterRoleBinding... items);
    public A removeAllFromItems(Collection<OpenshiftClusterRoleBinding> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OpenshiftClusterRoleBinding> getItems();
    public List<OpenshiftClusterRoleBinding> buildItems();
    public OpenshiftClusterRoleBinding buildItem(int index);
    public OpenshiftClusterRoleBinding buildFirstItem();
    public OpenshiftClusterRoleBinding buildLastItem();
    public OpenshiftClusterRoleBinding buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftClusterRoleBindingBuilder> predicate);
    public A withItems(List<OpenshiftClusterRoleBinding> items);
    public A withItems(OpenshiftClusterRoleBinding... items);
    public Boolean hasItems();
    public OpenshiftClusterRoleBindingListFluent.ItemsNested<A> addNewItem();
    public OpenshiftClusterRoleBindingListFluent.ItemsNested<A> addNewItemLike(OpenshiftClusterRoleBinding item);
    public OpenshiftClusterRoleBindingListFluent.ItemsNested<A> setNewItemLike(int index,OpenshiftClusterRoleBinding item);
    public OpenshiftClusterRoleBindingListFluent.ItemsNested<A> editItem(int index);
    public OpenshiftClusterRoleBindingListFluent.ItemsNested<A> editFirstItem();
    public OpenshiftClusterRoleBindingListFluent.ItemsNested<A> editLastItem();
    public OpenshiftClusterRoleBindingListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftClusterRoleBindingBuilder> predicate);
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
    public OpenshiftClusterRoleBindingListFluent.MetadataNested<A> withNewMetadata();
    public OpenshiftClusterRoleBindingListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public OpenshiftClusterRoleBindingListFluent.MetadataNested<A> editMetadata();
    public OpenshiftClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadata();
    public OpenshiftClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleBindingFluent<OpenshiftClusterRoleBindingListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<OpenshiftClusterRoleBindingListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
