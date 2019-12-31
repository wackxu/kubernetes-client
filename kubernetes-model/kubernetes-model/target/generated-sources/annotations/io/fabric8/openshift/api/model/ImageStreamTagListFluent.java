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

public interface ImageStreamTagListFluent<A extends ImageStreamTagListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ImageStreamTag item);
    public A setToItems(int index,ImageStreamTag item);
    public A addToItems(ImageStreamTag... items);
    public A addAllToItems(Collection<ImageStreamTag> items);
    public A removeFromItems(ImageStreamTag... items);
    public A removeAllFromItems(Collection<ImageStreamTag> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageStreamTag> getItems();
    public List<ImageStreamTag> buildItems();
    public ImageStreamTag buildItem(int index);
    public ImageStreamTag buildFirstItem();
    public ImageStreamTag buildLastItem();
    public ImageStreamTag buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ImageStreamTagBuilder> predicate);
    public A withItems(List<ImageStreamTag> items);
    public A withItems(ImageStreamTag... items);
    public Boolean hasItems();
    public ImageStreamTagListFluent.ItemsNested<A> addNewItem();
    public ImageStreamTagListFluent.ItemsNested<A> addNewItemLike(ImageStreamTag item);
    public ImageStreamTagListFluent.ItemsNested<A> setNewItemLike(int index,ImageStreamTag item);
    public ImageStreamTagListFluent.ItemsNested<A> editItem(int index);
    public ImageStreamTagListFluent.ItemsNested<A> editFirstItem();
    public ImageStreamTagListFluent.ItemsNested<A> editLastItem();
    public ImageStreamTagListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ImageStreamTagBuilder> predicate);
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
    public ImageStreamTagListFluent.MetadataNested<A> withNewMetadata();
    public ImageStreamTagListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ImageStreamTagListFluent.MetadataNested<A> editMetadata();
    public ImageStreamTagListFluent.MetadataNested<A> editOrNewMetadata();
    public ImageStreamTagListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamTagFluent<ImageStreamTagListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ImageStreamTagListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
