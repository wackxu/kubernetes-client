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

public interface OAuthAccessTokenListFluent<A extends OAuthAccessTokenListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,OAuthAccessToken item);
    public A setToItems(int index,OAuthAccessToken item);
    public A addToItems(OAuthAccessToken... items);
    public A addAllToItems(Collection<OAuthAccessToken> items);
    public A removeFromItems(OAuthAccessToken... items);
    public A removeAllFromItems(Collection<OAuthAccessToken> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OAuthAccessToken> getItems();
    public List<OAuthAccessToken> buildItems();
    public OAuthAccessToken buildItem(int index);
    public OAuthAccessToken buildFirstItem();
    public OAuthAccessToken buildLastItem();
    public OAuthAccessToken buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthAccessTokenBuilder> predicate);
    public A withItems(List<OAuthAccessToken> items);
    public A withItems(OAuthAccessToken... items);
    public Boolean hasItems();
    public OAuthAccessTokenListFluent.ItemsNested<A> addNewItem();
    public OAuthAccessTokenListFluent.ItemsNested<A> addNewItemLike(OAuthAccessToken item);
    public OAuthAccessTokenListFluent.ItemsNested<A> setNewItemLike(int index,OAuthAccessToken item);
    public OAuthAccessTokenListFluent.ItemsNested<A> editItem(int index);
    public OAuthAccessTokenListFluent.ItemsNested<A> editFirstItem();
    public OAuthAccessTokenListFluent.ItemsNested<A> editLastItem();
    public OAuthAccessTokenListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthAccessTokenBuilder> predicate);
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
    public OAuthAccessTokenListFluent.MetadataNested<A> withNewMetadata();
    public OAuthAccessTokenListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public OAuthAccessTokenListFluent.MetadataNested<A> editMetadata();
    public OAuthAccessTokenListFluent.MetadataNested<A> editOrNewMetadata();
    public OAuthAccessTokenListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAccessTokenFluent<OAuthAccessTokenListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<OAuthAccessTokenListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
