package io.fabric8.kubernetes.api.model.apps;

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

public interface ReplicaSetListFluent<A extends ReplicaSetListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ReplicaSet item);
    public A setToItems(int index,ReplicaSet item);
    public A addToItems(ReplicaSet... items);
    public A addAllToItems(Collection<ReplicaSet> items);
    public A removeFromItems(ReplicaSet... items);
    public A removeAllFromItems(Collection<ReplicaSet> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ReplicaSet> getItems();
    public List<ReplicaSet> buildItems();
    public ReplicaSet buildItem(int index);
    public ReplicaSet buildFirstItem();
    public ReplicaSet buildLastItem();
    public ReplicaSet buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ReplicaSetBuilder> predicate);
    public A withItems(List<ReplicaSet> items);
    public A withItems(ReplicaSet... items);
    public Boolean hasItems();
    public ReplicaSetListFluent.ItemsNested<A> addNewItem();
    public ReplicaSetListFluent.ItemsNested<A> addNewItemLike(ReplicaSet item);
    public ReplicaSetListFluent.ItemsNested<A> setNewItemLike(int index,ReplicaSet item);
    public ReplicaSetListFluent.ItemsNested<A> editItem(int index);
    public ReplicaSetListFluent.ItemsNested<A> editFirstItem();
    public ReplicaSetListFluent.ItemsNested<A> editLastItem();
    public ReplicaSetListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ReplicaSetBuilder> predicate);
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
    public ReplicaSetListFluent.MetadataNested<A> withNewMetadata();
    public ReplicaSetListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ReplicaSetListFluent.MetadataNested<A> editMetadata();
    public ReplicaSetListFluent.MetadataNested<A> editOrNewMetadata();
    public ReplicaSetListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetFluent<ReplicaSetListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ReplicaSetListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
