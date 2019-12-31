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

public interface OAuthClientAuthorizationListFluent<A extends OAuthClientAuthorizationListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,OAuthClientAuthorization item);
    public A setToItems(int index,OAuthClientAuthorization item);
    public A addToItems(OAuthClientAuthorization... items);
    public A addAllToItems(Collection<OAuthClientAuthorization> items);
    public A removeFromItems(OAuthClientAuthorization... items);
    public A removeAllFromItems(Collection<OAuthClientAuthorization> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OAuthClientAuthorization> getItems();
    public List<OAuthClientAuthorization> buildItems();
    public OAuthClientAuthorization buildItem(int index);
    public OAuthClientAuthorization buildFirstItem();
    public OAuthClientAuthorization buildLastItem();
    public OAuthClientAuthorization buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthClientAuthorizationBuilder> predicate);
    public A withItems(List<OAuthClientAuthorization> items);
    public A withItems(OAuthClientAuthorization... items);
    public Boolean hasItems();
    public OAuthClientAuthorizationListFluent.ItemsNested<A> addNewItem();
    public OAuthClientAuthorizationListFluent.ItemsNested<A> addNewItemLike(OAuthClientAuthorization item);
    public OAuthClientAuthorizationListFluent.ItemsNested<A> setNewItemLike(int index,OAuthClientAuthorization item);
    public OAuthClientAuthorizationListFluent.ItemsNested<A> editItem(int index);
    public OAuthClientAuthorizationListFluent.ItemsNested<A> editFirstItem();
    public OAuthClientAuthorizationListFluent.ItemsNested<A> editLastItem();
    public OAuthClientAuthorizationListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthClientAuthorizationBuilder> predicate);
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
    public OAuthClientAuthorizationListFluent.MetadataNested<A> withNewMetadata();
    public OAuthClientAuthorizationListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public OAuthClientAuthorizationListFluent.MetadataNested<A> editMetadata();
    public OAuthClientAuthorizationListFluent.MetadataNested<A> editOrNewMetadata();
    public OAuthClientAuthorizationListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthClientAuthorizationFluent<OAuthClientAuthorizationListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<OAuthClientAuthorizationListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
