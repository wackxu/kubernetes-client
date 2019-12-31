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

public interface RoleListFluent<A extends RoleListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Role item);
    public A setToItems(int index,Role item);
    public A addToItems(Role... items);
    public A addAllToItems(Collection<Role> items);
    public A removeFromItems(Role... items);
    public A removeAllFromItems(Collection<Role> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Role> getItems();
    public List<Role> buildItems();
    public Role buildItem(int index);
    public Role buildFirstItem();
    public Role buildLastItem();
    public Role buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<RoleBuilder> predicate);
    public A withItems(List<Role> items);
    public A withItems(Role... items);
    public Boolean hasItems();
    public RoleListFluent.ItemsNested<A> addNewItem();
    public RoleListFluent.ItemsNested<A> addNewItemLike(Role item);
    public RoleListFluent.ItemsNested<A> setNewItemLike(int index,Role item);
    public RoleListFluent.ItemsNested<A> editItem(int index);
    public RoleListFluent.ItemsNested<A> editFirstItem();
    public RoleListFluent.ItemsNested<A> editLastItem();
    public RoleListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<RoleBuilder> predicate);
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
    public RoleListFluent.MetadataNested<A> withNewMetadata();
    public RoleListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public RoleListFluent.MetadataNested<A> editMetadata();
    public RoleListFluent.MetadataNested<A> editOrNewMetadata();
    public RoleListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RoleFluent<RoleListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<RoleListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
