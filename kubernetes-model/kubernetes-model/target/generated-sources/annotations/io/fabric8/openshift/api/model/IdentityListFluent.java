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

public interface IdentityListFluent<A extends IdentityListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Identity item);
    public A setToItems(int index,Identity item);
    public A addToItems(Identity... items);
    public A addAllToItems(Collection<Identity> items);
    public A removeFromItems(Identity... items);
    public A removeAllFromItems(Collection<Identity> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Identity> getItems();
    public List<Identity> buildItems();
    public Identity buildItem(int index);
    public Identity buildFirstItem();
    public Identity buildLastItem();
    public Identity buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<IdentityBuilder> predicate);
    public A withItems(List<Identity> items);
    public A withItems(Identity... items);
    public Boolean hasItems();
    public IdentityListFluent.ItemsNested<A> addNewItem();
    public IdentityListFluent.ItemsNested<A> addNewItemLike(Identity item);
    public IdentityListFluent.ItemsNested<A> setNewItemLike(int index,Identity item);
    public IdentityListFluent.ItemsNested<A> editItem(int index);
    public IdentityListFluent.ItemsNested<A> editFirstItem();
    public IdentityListFluent.ItemsNested<A> editLastItem();
    public IdentityListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<IdentityBuilder> predicate);
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
    public IdentityListFluent.MetadataNested<A> withNewMetadata();
    public IdentityListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public IdentityListFluent.MetadataNested<A> editMetadata();
    public IdentityListFluent.MetadataNested<A> editOrNewMetadata();
    public IdentityListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IdentityFluent<IdentityListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<IdentityListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
