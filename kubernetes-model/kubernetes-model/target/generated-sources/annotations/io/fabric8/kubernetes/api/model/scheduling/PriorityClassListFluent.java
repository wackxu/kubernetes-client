package io.fabric8.kubernetes.api.model.scheduling;

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

public interface PriorityClassListFluent<A extends PriorityClassListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,PriorityClass item);
    public A setToItems(int index,PriorityClass item);
    public A addToItems(PriorityClass... items);
    public A addAllToItems(Collection<PriorityClass> items);
    public A removeFromItems(PriorityClass... items);
    public A removeAllFromItems(Collection<PriorityClass> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<PriorityClass> getItems();
    public List<PriorityClass> buildItems();
    public PriorityClass buildItem(int index);
    public PriorityClass buildFirstItem();
    public PriorityClass buildLastItem();
    public PriorityClass buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PriorityClassBuilder> predicate);
    public A withItems(List<PriorityClass> items);
    public A withItems(PriorityClass... items);
    public Boolean hasItems();
    public PriorityClassListFluent.ItemsNested<A> addNewItem();
    public PriorityClassListFluent.ItemsNested<A> addNewItemLike(PriorityClass item);
    public PriorityClassListFluent.ItemsNested<A> setNewItemLike(int index,PriorityClass item);
    public PriorityClassListFluent.ItemsNested<A> editItem(int index);
    public PriorityClassListFluent.ItemsNested<A> editFirstItem();
    public PriorityClassListFluent.ItemsNested<A> editLastItem();
    public PriorityClassListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PriorityClassBuilder> predicate);
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
    public PriorityClassListFluent.MetadataNested<A> withNewMetadata();
    public PriorityClassListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PriorityClassListFluent.MetadataNested<A> editMetadata();
    public PriorityClassListFluent.MetadataNested<A> editOrNewMetadata();
    public PriorityClassListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PriorityClassFluent<PriorityClassListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PriorityClassListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
