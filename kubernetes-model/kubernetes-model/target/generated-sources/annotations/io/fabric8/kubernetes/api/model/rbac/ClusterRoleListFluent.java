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

public interface ClusterRoleListFluent<A extends ClusterRoleListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ClusterRole item);
    public A setToItems(int index,ClusterRole item);
    public A addToItems(ClusterRole... items);
    public A addAllToItems(Collection<ClusterRole> items);
    public A removeFromItems(ClusterRole... items);
    public A removeAllFromItems(Collection<ClusterRole> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ClusterRole> getItems();
    public List<ClusterRole> buildItems();
    public ClusterRole buildItem(int index);
    public ClusterRole buildFirstItem();
    public ClusterRole buildLastItem();
    public ClusterRole buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ClusterRoleBuilder> predicate);
    public A withItems(List<ClusterRole> items);
    public A withItems(ClusterRole... items);
    public Boolean hasItems();
    public ClusterRoleListFluent.ItemsNested<A> addNewItem();
    public ClusterRoleListFluent.ItemsNested<A> addNewItemLike(ClusterRole item);
    public ClusterRoleListFluent.ItemsNested<A> setNewItemLike(int index,ClusterRole item);
    public ClusterRoleListFluent.ItemsNested<A> editItem(int index);
    public ClusterRoleListFluent.ItemsNested<A> editFirstItem();
    public ClusterRoleListFluent.ItemsNested<A> editLastItem();
    public ClusterRoleListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ClusterRoleBuilder> predicate);
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
    public ClusterRoleListFluent.MetadataNested<A> withNewMetadata();
    public ClusterRoleListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ClusterRoleListFluent.MetadataNested<A> editMetadata();
    public ClusterRoleListFluent.MetadataNested<A> editOrNewMetadata();
    public ClusterRoleListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClusterRoleFluent<ClusterRoleListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ClusterRoleListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
