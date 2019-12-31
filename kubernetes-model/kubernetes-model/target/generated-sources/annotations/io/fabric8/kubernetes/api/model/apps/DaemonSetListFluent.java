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

public interface DaemonSetListFluent<A extends DaemonSetListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,DaemonSet item);
    public A setToItems(int index,DaemonSet item);
    public A addToItems(DaemonSet... items);
    public A addAllToItems(Collection<DaemonSet> items);
    public A removeFromItems(DaemonSet... items);
    public A removeAllFromItems(Collection<DaemonSet> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<DaemonSet> getItems();
    public List<DaemonSet> buildItems();
    public DaemonSet buildItem(int index);
    public DaemonSet buildFirstItem();
    public DaemonSet buildLastItem();
    public DaemonSet buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DaemonSetBuilder> predicate);
    public A withItems(List<DaemonSet> items);
    public A withItems(DaemonSet... items);
    public Boolean hasItems();
    public DaemonSetListFluent.ItemsNested<A> addNewItem();
    public DaemonSetListFluent.ItemsNested<A> addNewItemLike(DaemonSet item);
    public DaemonSetListFluent.ItemsNested<A> setNewItemLike(int index,DaemonSet item);
    public DaemonSetListFluent.ItemsNested<A> editItem(int index);
    public DaemonSetListFluent.ItemsNested<A> editFirstItem();
    public DaemonSetListFluent.ItemsNested<A> editLastItem();
    public DaemonSetListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DaemonSetBuilder> predicate);
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
    public DaemonSetListFluent.MetadataNested<A> withNewMetadata();
    public DaemonSetListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public DaemonSetListFluent.MetadataNested<A> editMetadata();
    public DaemonSetListFluent.MetadataNested<A> editOrNewMetadata();
    public DaemonSetListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetFluent<DaemonSetListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<DaemonSetListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
