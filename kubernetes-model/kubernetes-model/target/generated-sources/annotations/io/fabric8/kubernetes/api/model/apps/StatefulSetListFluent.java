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

public interface StatefulSetListFluent<A extends StatefulSetListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,StatefulSet item);
    public A setToItems(int index,StatefulSet item);
    public A addToItems(StatefulSet... items);
    public A addAllToItems(Collection<StatefulSet> items);
    public A removeFromItems(StatefulSet... items);
    public A removeAllFromItems(Collection<StatefulSet> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<StatefulSet> getItems();
    public List<StatefulSet> buildItems();
    public StatefulSet buildItem(int index);
    public StatefulSet buildFirstItem();
    public StatefulSet buildLastItem();
    public StatefulSet buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<StatefulSetBuilder> predicate);
    public A withItems(List<StatefulSet> items);
    public A withItems(StatefulSet... items);
    public Boolean hasItems();
    public StatefulSetListFluent.ItemsNested<A> addNewItem();
    public StatefulSetListFluent.ItemsNested<A> addNewItemLike(StatefulSet item);
    public StatefulSetListFluent.ItemsNested<A> setNewItemLike(int index,StatefulSet item);
    public StatefulSetListFluent.ItemsNested<A> editItem(int index);
    public StatefulSetListFluent.ItemsNested<A> editFirstItem();
    public StatefulSetListFluent.ItemsNested<A> editLastItem();
    public StatefulSetListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<StatefulSetBuilder> predicate);
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
    public StatefulSetListFluent.MetadataNested<A> withNewMetadata();
    public StatefulSetListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public StatefulSetListFluent.MetadataNested<A> editMetadata();
    public StatefulSetListFluent.MetadataNested<A> editOrNewMetadata();
    public StatefulSetListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetFluent<StatefulSetListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<StatefulSetListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
