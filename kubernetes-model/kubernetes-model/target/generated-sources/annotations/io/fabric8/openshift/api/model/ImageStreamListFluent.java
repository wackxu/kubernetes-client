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

public interface ImageStreamListFluent<A extends ImageStreamListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ImageStream item);
    public A setToItems(int index,ImageStream item);
    public A addToItems(ImageStream... items);
    public A addAllToItems(Collection<ImageStream> items);
    public A removeFromItems(ImageStream... items);
    public A removeAllFromItems(Collection<ImageStream> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageStream> getItems();
    public List<ImageStream> buildItems();
    public ImageStream buildItem(int index);
    public ImageStream buildFirstItem();
    public ImageStream buildLastItem();
    public ImageStream buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ImageStreamBuilder> predicate);
    public A withItems(List<ImageStream> items);
    public A withItems(ImageStream... items);
    public Boolean hasItems();
    public ImageStreamListFluent.ItemsNested<A> addNewItem();
    public ImageStreamListFluent.ItemsNested<A> addNewItemLike(ImageStream item);
    public ImageStreamListFluent.ItemsNested<A> setNewItemLike(int index,ImageStream item);
    public ImageStreamListFluent.ItemsNested<A> editItem(int index);
    public ImageStreamListFluent.ItemsNested<A> editFirstItem();
    public ImageStreamListFluent.ItemsNested<A> editLastItem();
    public ImageStreamListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ImageStreamBuilder> predicate);
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
    public ImageStreamListFluent.MetadataNested<A> withNewMetadata();
    public ImageStreamListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ImageStreamListFluent.MetadataNested<A> editMetadata();
    public ImageStreamListFluent.MetadataNested<A> editOrNewMetadata();
    public ImageStreamListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<ImageStreamListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ImageStreamListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
