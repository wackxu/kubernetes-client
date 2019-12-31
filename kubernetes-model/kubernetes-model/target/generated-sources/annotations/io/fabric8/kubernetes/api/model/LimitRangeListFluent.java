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

public interface LimitRangeListFluent<A extends LimitRangeListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,LimitRange item);
    public A setToItems(int index,LimitRange item);
    public A addToItems(LimitRange... items);
    public A addAllToItems(Collection<LimitRange> items);
    public A removeFromItems(LimitRange... items);
    public A removeAllFromItems(Collection<LimitRange> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<LimitRange> getItems();
    public List<LimitRange> buildItems();
    public LimitRange buildItem(int index);
    public LimitRange buildFirstItem();
    public LimitRange buildLastItem();
    public LimitRange buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<LimitRangeBuilder> predicate);
    public A withItems(List<LimitRange> items);
    public A withItems(LimitRange... items);
    public Boolean hasItems();
    public LimitRangeListFluent.ItemsNested<A> addNewItem();
    public LimitRangeListFluent.ItemsNested<A> addNewItemLike(LimitRange item);
    public LimitRangeListFluent.ItemsNested<A> setNewItemLike(int index,LimitRange item);
    public LimitRangeListFluent.ItemsNested<A> editItem(int index);
    public LimitRangeListFluent.ItemsNested<A> editFirstItem();
    public LimitRangeListFluent.ItemsNested<A> editLastItem();
    public LimitRangeListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<LimitRangeBuilder> predicate);
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
    public LimitRangeListFluent.MetadataNested<A> withNewMetadata();
    public LimitRangeListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public LimitRangeListFluent.MetadataNested<A> editMetadata();
    public LimitRangeListFluent.MetadataNested<A> editOrNewMetadata();
    public LimitRangeListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LimitRangeFluent<LimitRangeListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<LimitRangeListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
