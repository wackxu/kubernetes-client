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

public interface ImageListFluent<A extends ImageListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Image item);
    public A setToItems(int index,Image item);
    public A addToItems(Image... items);
    public A addAllToItems(Collection<Image> items);
    public A removeFromItems(Image... items);
    public A removeAllFromItems(Collection<Image> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Image> getItems();
    public List<Image> buildItems();
    public Image buildItem(int index);
    public Image buildFirstItem();
    public Image buildLastItem();
    public Image buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ImageBuilder> predicate);
    public A withItems(List<Image> items);
    public A withItems(Image... items);
    public Boolean hasItems();
    public ImageListFluent.ItemsNested<A> addNewItem();
    public ImageListFluent.ItemsNested<A> addNewItemLike(Image item);
    public ImageListFluent.ItemsNested<A> setNewItemLike(int index,Image item);
    public ImageListFluent.ItemsNested<A> editItem(int index);
    public ImageListFluent.ItemsNested<A> editFirstItem();
    public ImageListFluent.ItemsNested<A> editLastItem();
    public ImageListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ImageBuilder> predicate);
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
    public ImageListFluent.MetadataNested<A> withNewMetadata();
    public ImageListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ImageListFluent.MetadataNested<A> editMetadata();
    public ImageListFluent.MetadataNested<A> editOrNewMetadata();
    public ImageListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<ImageListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ImageListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
