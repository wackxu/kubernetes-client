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

public interface NamespaceListFluent<A extends NamespaceListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Namespace item);
    public A setToItems(int index,Namespace item);
    public A addToItems(Namespace... items);
    public A addAllToItems(Collection<Namespace> items);
    public A removeFromItems(Namespace... items);
    public A removeAllFromItems(Collection<Namespace> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Namespace> getItems();
    public List<Namespace> buildItems();
    public Namespace buildItem(int index);
    public Namespace buildFirstItem();
    public Namespace buildLastItem();
    public Namespace buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<NamespaceBuilder> predicate);
    public A withItems(List<Namespace> items);
    public A withItems(Namespace... items);
    public Boolean hasItems();
    public NamespaceListFluent.ItemsNested<A> addNewItem();
    public NamespaceListFluent.ItemsNested<A> addNewItemLike(Namespace item);
    public NamespaceListFluent.ItemsNested<A> setNewItemLike(int index,Namespace item);
    public NamespaceListFluent.ItemsNested<A> editItem(int index);
    public NamespaceListFluent.ItemsNested<A> editFirstItem();
    public NamespaceListFluent.ItemsNested<A> editLastItem();
    public NamespaceListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<NamespaceBuilder> predicate);
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
    public NamespaceListFluent.MetadataNested<A> withNewMetadata();
    public NamespaceListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public NamespaceListFluent.MetadataNested<A> editMetadata();
    public NamespaceListFluent.MetadataNested<A> editOrNewMetadata();
    public NamespaceListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamespaceFluent<NamespaceListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<NamespaceListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
