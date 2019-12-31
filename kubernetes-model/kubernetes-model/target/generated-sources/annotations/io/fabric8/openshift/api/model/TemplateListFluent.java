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

public interface TemplateListFluent<A extends TemplateListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Template item);
    public A setToItems(int index,Template item);
    public A addToItems(Template... items);
    public A addAllToItems(Collection<Template> items);
    public A removeFromItems(Template... items);
    public A removeAllFromItems(Collection<Template> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Template> getItems();
    public List<Template> buildItems();
    public Template buildItem(int index);
    public Template buildFirstItem();
    public Template buildLastItem();
    public Template buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<TemplateBuilder> predicate);
    public A withItems(List<Template> items);
    public A withItems(Template... items);
    public Boolean hasItems();
    public TemplateListFluent.ItemsNested<A> addNewItem();
    public TemplateListFluent.ItemsNested<A> addNewItemLike(Template item);
    public TemplateListFluent.ItemsNested<A> setNewItemLike(int index,Template item);
    public TemplateListFluent.ItemsNested<A> editItem(int index);
    public TemplateListFluent.ItemsNested<A> editFirstItem();
    public TemplateListFluent.ItemsNested<A> editLastItem();
    public TemplateListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<TemplateBuilder> predicate);
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
    public TemplateListFluent.MetadataNested<A> withNewMetadata();
    public TemplateListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public TemplateListFluent.MetadataNested<A> editMetadata();
    public TemplateListFluent.MetadataNested<A> editOrNewMetadata();
    public TemplateListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TemplateFluent<TemplateListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<TemplateListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
