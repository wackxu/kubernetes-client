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

public interface OAuthClientListFluent<A extends OAuthClientListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,OAuthClient item);
    public A setToItems(int index,OAuthClient item);
    public A addToItems(OAuthClient... items);
    public A addAllToItems(Collection<OAuthClient> items);
    public A removeFromItems(OAuthClient... items);
    public A removeAllFromItems(Collection<OAuthClient> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OAuthClient> getItems();
    public List<OAuthClient> buildItems();
    public OAuthClient buildItem(int index);
    public OAuthClient buildFirstItem();
    public OAuthClient buildLastItem();
    public OAuthClient buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthClientBuilder> predicate);
    public A withItems(List<OAuthClient> items);
    public A withItems(OAuthClient... items);
    public Boolean hasItems();
    public OAuthClientListFluent.ItemsNested<A> addNewItem();
    public OAuthClientListFluent.ItemsNested<A> addNewItemLike(OAuthClient item);
    public OAuthClientListFluent.ItemsNested<A> setNewItemLike(int index,OAuthClient item);
    public OAuthClientListFluent.ItemsNested<A> editItem(int index);
    public OAuthClientListFluent.ItemsNested<A> editFirstItem();
    public OAuthClientListFluent.ItemsNested<A> editLastItem();
    public OAuthClientListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthClientBuilder> predicate);
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
    public OAuthClientListFluent.MetadataNested<A> withNewMetadata();
    public OAuthClientListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public OAuthClientListFluent.MetadataNested<A> editMetadata();
    public OAuthClientListFluent.MetadataNested<A> editOrNewMetadata();
    public OAuthClientListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientFluent<OAuthClientListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<OAuthClientListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
