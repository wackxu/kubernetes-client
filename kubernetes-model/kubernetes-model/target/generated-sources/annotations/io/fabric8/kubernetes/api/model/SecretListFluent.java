package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface SecretListFluent<A extends SecretListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Secret item);
    public A setToItems(int index,Secret item);
    public A addToItems(Secret... items);
    public A addAllToItems(Collection<Secret> items);
    public A removeFromItems(Secret... items);
    public A removeAllFromItems(Collection<Secret> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Secret> getItems();
    public List<Secret> buildItems();
    public Secret buildItem(int index);
    public Secret buildFirstItem();
    public Secret buildLastItem();
    public Secret buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<SecretBuilder> predicate);
    public A withItems(List<Secret> items);
    public A withItems(Secret... items);
    public Boolean hasItems();
    public SecretListFluent.ItemsNested<A> addNewItem();
    public SecretListFluent.ItemsNested<A> addNewItemLike(Secret item);
    public SecretListFluent.ItemsNested<A> setNewItemLike(int index,Secret item);
    public SecretListFluent.ItemsNested<A> editItem(int index);
    public SecretListFluent.ItemsNested<A> editFirstItem();
    public SecretListFluent.ItemsNested<A> editLastItem();
    public SecretListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<SecretBuilder> predicate);
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
    public SecretListFluent.MetadataNested<A> withNewMetadata();
    public SecretListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public SecretListFluent.MetadataNested<A> editMetadata();
    public SecretListFluent.MetadataNested<A> editOrNewMetadata();
    public SecretListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretFluent<SecretListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<SecretListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
