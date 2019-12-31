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

public interface SecurityContextConstraintsListFluent<A extends SecurityContextConstraintsListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,SecurityContextConstraints item);
    public A setToItems(int index,SecurityContextConstraints item);
    public A addToItems(SecurityContextConstraints... items);
    public A addAllToItems(Collection<SecurityContextConstraints> items);
    public A removeFromItems(SecurityContextConstraints... items);
    public A removeAllFromItems(Collection<SecurityContextConstraints> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<SecurityContextConstraints> getItems();
    public List<SecurityContextConstraints> buildItems();
    public SecurityContextConstraints buildItem(int index);
    public SecurityContextConstraints buildFirstItem();
    public SecurityContextConstraints buildLastItem();
    public SecurityContextConstraints buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<SecurityContextConstraintsBuilder> predicate);
    public A withItems(List<SecurityContextConstraints> items);
    public A withItems(SecurityContextConstraints... items);
    public Boolean hasItems();
    public SecurityContextConstraintsListFluent.ItemsNested<A> addNewItem();
    public SecurityContextConstraintsListFluent.ItemsNested<A> addNewItemLike(SecurityContextConstraints item);
    public SecurityContextConstraintsListFluent.ItemsNested<A> setNewItemLike(int index,SecurityContextConstraints item);
    public SecurityContextConstraintsListFluent.ItemsNested<A> editItem(int index);
    public SecurityContextConstraintsListFluent.ItemsNested<A> editFirstItem();
    public SecurityContextConstraintsListFluent.ItemsNested<A> editLastItem();
    public SecurityContextConstraintsListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<SecurityContextConstraintsBuilder> predicate);
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
    public SecurityContextConstraintsListFluent.MetadataNested<A> withNewMetadata();
    public SecurityContextConstraintsListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public SecurityContextConstraintsListFluent.MetadataNested<A> editMetadata();
    public SecurityContextConstraintsListFluent.MetadataNested<A> editOrNewMetadata();
    public SecurityContextConstraintsListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecurityContextConstraintsFluent<SecurityContextConstraintsListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<SecurityContextConstraintsListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
