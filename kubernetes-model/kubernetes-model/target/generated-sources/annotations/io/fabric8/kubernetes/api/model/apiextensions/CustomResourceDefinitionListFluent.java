package io.fabric8.kubernetes.api.model.apiextensions;

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

public interface CustomResourceDefinitionListFluent<A extends CustomResourceDefinitionListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,CustomResourceDefinition item);
    public A setToItems(int index,CustomResourceDefinition item);
    public A addToItems(CustomResourceDefinition... items);
    public A addAllToItems(Collection<CustomResourceDefinition> items);
    public A removeFromItems(CustomResourceDefinition... items);
    public A removeAllFromItems(Collection<CustomResourceDefinition> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceDefinition> getItems();
    public List<CustomResourceDefinition> buildItems();
    public CustomResourceDefinition buildItem(int index);
    public CustomResourceDefinition buildFirstItem();
    public CustomResourceDefinition buildLastItem();
    public CustomResourceDefinition buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionBuilder> predicate);
    public A withItems(List<CustomResourceDefinition> items);
    public A withItems(CustomResourceDefinition... items);
    public Boolean hasItems();
    public CustomResourceDefinitionListFluent.ItemsNested<A> addNewItem();
    public CustomResourceDefinitionListFluent.ItemsNested<A> addNewItemLike(CustomResourceDefinition item);
    public CustomResourceDefinitionListFluent.ItemsNested<A> setNewItemLike(int index,CustomResourceDefinition item);
    public CustomResourceDefinitionListFluent.ItemsNested<A> editItem(int index);
    public CustomResourceDefinitionListFluent.ItemsNested<A> editFirstItem();
    public CustomResourceDefinitionListFluent.ItemsNested<A> editLastItem();
    public CustomResourceDefinitionListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionBuilder> predicate);
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
    public CustomResourceDefinitionListFluent.MetadataNested<A> withNewMetadata();
    public CustomResourceDefinitionListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public CustomResourceDefinitionListFluent.MetadataNested<A> editMetadata();
    public CustomResourceDefinitionListFluent.MetadataNested<A> editOrNewMetadata();
    public CustomResourceDefinitionListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionFluent<CustomResourceDefinitionListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<CustomResourceDefinitionListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
