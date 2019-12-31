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

public interface ReplicationControllerListFluent<A extends ReplicationControllerListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ReplicationController item);
    public A setToItems(int index,ReplicationController item);
    public A addToItems(ReplicationController... items);
    public A addAllToItems(Collection<ReplicationController> items);
    public A removeFromItems(ReplicationController... items);
    public A removeAllFromItems(Collection<ReplicationController> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ReplicationController> getItems();
    public List<ReplicationController> buildItems();
    public ReplicationController buildItem(int index);
    public ReplicationController buildFirstItem();
    public ReplicationController buildLastItem();
    public ReplicationController buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ReplicationControllerBuilder> predicate);
    public A withItems(List<ReplicationController> items);
    public A withItems(ReplicationController... items);
    public Boolean hasItems();
    public ReplicationControllerListFluent.ItemsNested<A> addNewItem();
    public ReplicationControllerListFluent.ItemsNested<A> addNewItemLike(ReplicationController item);
    public ReplicationControllerListFluent.ItemsNested<A> setNewItemLike(int index,ReplicationController item);
    public ReplicationControllerListFluent.ItemsNested<A> editItem(int index);
    public ReplicationControllerListFluent.ItemsNested<A> editFirstItem();
    public ReplicationControllerListFluent.ItemsNested<A> editLastItem();
    public ReplicationControllerListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ReplicationControllerBuilder> predicate);
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
    public ReplicationControllerListFluent.MetadataNested<A> withNewMetadata();
    public ReplicationControllerListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ReplicationControllerListFluent.MetadataNested<A> editMetadata();
    public ReplicationControllerListFluent.MetadataNested<A> editOrNewMetadata();
    public ReplicationControllerListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerFluent<ReplicationControllerListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ReplicationControllerListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
