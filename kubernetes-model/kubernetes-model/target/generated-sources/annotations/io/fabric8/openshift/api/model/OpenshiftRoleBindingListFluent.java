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

public interface OpenshiftRoleBindingListFluent<A extends OpenshiftRoleBindingListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,OpenshiftRoleBinding item);
    public A setToItems(int index,OpenshiftRoleBinding item);
    public A addToItems(OpenshiftRoleBinding... items);
    public A addAllToItems(Collection<OpenshiftRoleBinding> items);
    public A removeFromItems(OpenshiftRoleBinding... items);
    public A removeAllFromItems(Collection<OpenshiftRoleBinding> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OpenshiftRoleBinding> getItems();
    public List<OpenshiftRoleBinding> buildItems();
    public OpenshiftRoleBinding buildItem(int index);
    public OpenshiftRoleBinding buildFirstItem();
    public OpenshiftRoleBinding buildLastItem();
    public OpenshiftRoleBinding buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftRoleBindingBuilder> predicate);
    public A withItems(List<OpenshiftRoleBinding> items);
    public A withItems(OpenshiftRoleBinding... items);
    public Boolean hasItems();
    public OpenshiftRoleBindingListFluent.ItemsNested<A> addNewItem();
    public OpenshiftRoleBindingListFluent.ItemsNested<A> addNewItemLike(OpenshiftRoleBinding item);
    public OpenshiftRoleBindingListFluent.ItemsNested<A> setNewItemLike(int index,OpenshiftRoleBinding item);
    public OpenshiftRoleBindingListFluent.ItemsNested<A> editItem(int index);
    public OpenshiftRoleBindingListFluent.ItemsNested<A> editFirstItem();
    public OpenshiftRoleBindingListFluent.ItemsNested<A> editLastItem();
    public OpenshiftRoleBindingListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftRoleBindingBuilder> predicate);
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
    public OpenshiftRoleBindingListFluent.MetadataNested<A> withNewMetadata();
    public OpenshiftRoleBindingListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public OpenshiftRoleBindingListFluent.MetadataNested<A> editMetadata();
    public OpenshiftRoleBindingListFluent.MetadataNested<A> editOrNewMetadata();
    public OpenshiftRoleBindingListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleBindingFluent<OpenshiftRoleBindingListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<OpenshiftRoleBindingListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
