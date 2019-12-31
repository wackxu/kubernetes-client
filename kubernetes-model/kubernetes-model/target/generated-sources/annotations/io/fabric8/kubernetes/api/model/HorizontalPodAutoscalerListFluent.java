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

public interface HorizontalPodAutoscalerListFluent<A extends HorizontalPodAutoscalerListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,HorizontalPodAutoscaler item);
    public A setToItems(int index,HorizontalPodAutoscaler item);
    public A addToItems(HorizontalPodAutoscaler... items);
    public A addAllToItems(Collection<HorizontalPodAutoscaler> items);
    public A removeFromItems(HorizontalPodAutoscaler... items);
    public A removeAllFromItems(Collection<HorizontalPodAutoscaler> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<HorizontalPodAutoscaler> getItems();
    public List<HorizontalPodAutoscaler> buildItems();
    public HorizontalPodAutoscaler buildItem(int index);
    public HorizontalPodAutoscaler buildFirstItem();
    public HorizontalPodAutoscaler buildLastItem();
    public HorizontalPodAutoscaler buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<HorizontalPodAutoscalerBuilder> predicate);
    public A withItems(List<HorizontalPodAutoscaler> items);
    public A withItems(HorizontalPodAutoscaler... items);
    public Boolean hasItems();
    public HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItem();
    public HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItemLike(HorizontalPodAutoscaler item);
    public HorizontalPodAutoscalerListFluent.ItemsNested<A> setNewItemLike(int index,HorizontalPodAutoscaler item);
    public HorizontalPodAutoscalerListFluent.ItemsNested<A> editItem(int index);
    public HorizontalPodAutoscalerListFluent.ItemsNested<A> editFirstItem();
    public HorizontalPodAutoscalerListFluent.ItemsNested<A> editLastItem();
    public HorizontalPodAutoscalerListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<HorizontalPodAutoscalerBuilder> predicate);
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
    public HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadata();
    public HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public HorizontalPodAutoscalerListFluent.MetadataNested<A> editMetadata();
    public HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadata();
    public HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerFluent<HorizontalPodAutoscalerListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<HorizontalPodAutoscalerListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
