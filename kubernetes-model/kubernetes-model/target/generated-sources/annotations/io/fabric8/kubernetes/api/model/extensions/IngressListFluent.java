package io.fabric8.kubernetes.api.model.extensions;

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

public interface IngressListFluent<A extends IngressListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Ingress item);
    public A setToItems(int index,Ingress item);
    public A addToItems(Ingress... items);
    public A addAllToItems(Collection<Ingress> items);
    public A removeFromItems(Ingress... items);
    public A removeAllFromItems(Collection<Ingress> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Ingress> getItems();
    public List<Ingress> buildItems();
    public Ingress buildItem(int index);
    public Ingress buildFirstItem();
    public Ingress buildLastItem();
    public Ingress buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<IngressBuilder> predicate);
    public A withItems(List<Ingress> items);
    public A withItems(Ingress... items);
    public Boolean hasItems();
    public IngressListFluent.ItemsNested<A> addNewItem();
    public IngressListFluent.ItemsNested<A> addNewItemLike(Ingress item);
    public IngressListFluent.ItemsNested<A> setNewItemLike(int index,Ingress item);
    public IngressListFluent.ItemsNested<A> editItem(int index);
    public IngressListFluent.ItemsNested<A> editFirstItem();
    public IngressListFluent.ItemsNested<A> editLastItem();
    public IngressListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<IngressBuilder> predicate);
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
    public IngressListFluent.MetadataNested<A> withNewMetadata();
    public IngressListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public IngressListFluent.MetadataNested<A> editMetadata();
    public IngressListFluent.MetadataNested<A> editOrNewMetadata();
    public IngressListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressFluent<IngressListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<IngressListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
