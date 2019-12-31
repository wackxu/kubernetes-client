package io.fabric8.openshift.api.model;

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

public interface BuildListFluent<A extends BuildListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Build item);
    public A setToItems(int index,Build item);
    public A addToItems(Build... items);
    public A addAllToItems(Collection<Build> items);
    public A removeFromItems(Build... items);
    public A removeAllFromItems(Collection<Build> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Build> getItems();
    public List<Build> buildItems();
    public Build buildItem(int index);
    public Build buildFirstItem();
    public Build buildLastItem();
    public Build buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<BuildBuilder> predicate);
    public A withItems(List<Build> items);
    public A withItems(Build... items);
    public Boolean hasItems();
    public BuildListFluent.ItemsNested<A> addNewItem();
    public BuildListFluent.ItemsNested<A> addNewItemLike(Build item);
    public BuildListFluent.ItemsNested<A> setNewItemLike(int index,Build item);
    public BuildListFluent.ItemsNested<A> editItem(int index);
    public BuildListFluent.ItemsNested<A> editFirstItem();
    public BuildListFluent.ItemsNested<A> editLastItem();
    public BuildListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<BuildBuilder> predicate);
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
    public BuildListFluent.MetadataNested<A> withNewMetadata();
    public BuildListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public BuildListFluent.MetadataNested<A> editMetadata();
    public BuildListFluent.MetadataNested<A> editOrNewMetadata();
    public BuildListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildFluent<BuildListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<BuildListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
