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

public interface OpenshiftRoleListFluent<A extends OpenshiftRoleListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,OpenshiftRole item);
    public A setToItems(int index,OpenshiftRole item);
    public A addToItems(OpenshiftRole... items);
    public A addAllToItems(Collection<OpenshiftRole> items);
    public A removeFromItems(OpenshiftRole... items);
    public A removeAllFromItems(Collection<OpenshiftRole> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OpenshiftRole> getItems();
    public List<OpenshiftRole> buildItems();
    public OpenshiftRole buildItem(int index);
    public OpenshiftRole buildFirstItem();
    public OpenshiftRole buildLastItem();
    public OpenshiftRole buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftRoleBuilder> predicate);
    public A withItems(List<OpenshiftRole> items);
    public A withItems(OpenshiftRole... items);
    public Boolean hasItems();
    public OpenshiftRoleListFluent.ItemsNested<A> addNewItem();
    public OpenshiftRoleListFluent.ItemsNested<A> addNewItemLike(OpenshiftRole item);
    public OpenshiftRoleListFluent.ItemsNested<A> setNewItemLike(int index,OpenshiftRole item);
    public OpenshiftRoleListFluent.ItemsNested<A> editItem(int index);
    public OpenshiftRoleListFluent.ItemsNested<A> editFirstItem();
    public OpenshiftRoleListFluent.ItemsNested<A> editLastItem();
    public OpenshiftRoleListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftRoleBuilder> predicate);
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
    public OpenshiftRoleListFluent.MetadataNested<A> withNewMetadata();
    public OpenshiftRoleListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public OpenshiftRoleListFluent.MetadataNested<A> editMetadata();
    public OpenshiftRoleListFluent.MetadataNested<A> editOrNewMetadata();
    public OpenshiftRoleListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftRoleFluent<OpenshiftRoleListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<OpenshiftRoleListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
