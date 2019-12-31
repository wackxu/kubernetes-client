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

public interface NodeListFluent<A extends NodeListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Node item);
    public A setToItems(int index,Node item);
    public A addToItems(Node... items);
    public A addAllToItems(Collection<Node> items);
    public A removeFromItems(Node... items);
    public A removeAllFromItems(Collection<Node> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Node> getItems();
    public List<Node> buildItems();
    public Node buildItem(int index);
    public Node buildFirstItem();
    public Node buildLastItem();
    public Node buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<NodeBuilder> predicate);
    public A withItems(List<Node> items);
    public A withItems(Node... items);
    public Boolean hasItems();
    public NodeListFluent.ItemsNested<A> addNewItem();
    public NodeListFluent.ItemsNested<A> addNewItemLike(Node item);
    public NodeListFluent.ItemsNested<A> setNewItemLike(int index,Node item);
    public NodeListFluent.ItemsNested<A> editItem(int index);
    public NodeListFluent.ItemsNested<A> editFirstItem();
    public NodeListFluent.ItemsNested<A> editLastItem();
    public NodeListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<NodeBuilder> predicate);
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
    public NodeListFluent.MetadataNested<A> withNewMetadata();
    public NodeListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public NodeListFluent.MetadataNested<A> editMetadata();
    public NodeListFluent.MetadataNested<A> editOrNewMetadata();
    public NodeListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeFluent<NodeListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<NodeListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
