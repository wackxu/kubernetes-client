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

public interface PodTemplateListFluent<A extends PodTemplateListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,PodTemplate item);
    public A setToItems(int index,PodTemplate item);
    public A addToItems(PodTemplate... items);
    public A addAllToItems(Collection<PodTemplate> items);
    public A removeFromItems(PodTemplate... items);
    public A removeAllFromItems(Collection<PodTemplate> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<PodTemplate> getItems();
    public List<PodTemplate> buildItems();
    public PodTemplate buildItem(int index);
    public PodTemplate buildFirstItem();
    public PodTemplate buildLastItem();
    public PodTemplate buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodTemplateBuilder> predicate);
    public A withItems(List<PodTemplate> items);
    public A withItems(PodTemplate... items);
    public Boolean hasItems();
    public PodTemplateListFluent.ItemsNested<A> addNewItem();
    public PodTemplateListFluent.ItemsNested<A> addNewItemLike(PodTemplate item);
    public PodTemplateListFluent.ItemsNested<A> setNewItemLike(int index,PodTemplate item);
    public PodTemplateListFluent.ItemsNested<A> editItem(int index);
    public PodTemplateListFluent.ItemsNested<A> editFirstItem();
    public PodTemplateListFluent.ItemsNested<A> editLastItem();
    public PodTemplateListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodTemplateBuilder> predicate);
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
    public PodTemplateListFluent.MetadataNested<A> withNewMetadata();
    public PodTemplateListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PodTemplateListFluent.MetadataNested<A> editMetadata();
    public PodTemplateListFluent.MetadataNested<A> editOrNewMetadata();
    public PodTemplateListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateFluent<PodTemplateListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PodTemplateListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
