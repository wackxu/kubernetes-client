package io.fabric8.kubernetes.api.model.policy;

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

public interface PodDisruptionBudgetListFluent<A extends PodDisruptionBudgetListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,PodDisruptionBudget item);
    public A setToItems(int index,PodDisruptionBudget item);
    public A addToItems(PodDisruptionBudget... items);
    public A addAllToItems(Collection<PodDisruptionBudget> items);
    public A removeFromItems(PodDisruptionBudget... items);
    public A removeAllFromItems(Collection<PodDisruptionBudget> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<PodDisruptionBudget> getItems();
    public List<PodDisruptionBudget> buildItems();
    public PodDisruptionBudget buildItem(int index);
    public PodDisruptionBudget buildFirstItem();
    public PodDisruptionBudget buildLastItem();
    public PodDisruptionBudget buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodDisruptionBudgetBuilder> predicate);
    public A withItems(List<PodDisruptionBudget> items);
    public A withItems(PodDisruptionBudget... items);
    public Boolean hasItems();
    public PodDisruptionBudgetListFluent.ItemsNested<A> addNewItem();
    public PodDisruptionBudgetListFluent.ItemsNested<A> addNewItemLike(PodDisruptionBudget item);
    public PodDisruptionBudgetListFluent.ItemsNested<A> setNewItemLike(int index,PodDisruptionBudget item);
    public PodDisruptionBudgetListFluent.ItemsNested<A> editItem(int index);
    public PodDisruptionBudgetListFluent.ItemsNested<A> editFirstItem();
    public PodDisruptionBudgetListFluent.ItemsNested<A> editLastItem();
    public PodDisruptionBudgetListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodDisruptionBudgetBuilder> predicate);
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
    public PodDisruptionBudgetListFluent.MetadataNested<A> withNewMetadata();
    public PodDisruptionBudgetListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PodDisruptionBudgetListFluent.MetadataNested<A> editMetadata();
    public PodDisruptionBudgetListFluent.MetadataNested<A> editOrNewMetadata();
    public PodDisruptionBudgetListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDisruptionBudgetFluent<PodDisruptionBudgetListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PodDisruptionBudgetListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
