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

public interface OAuthAuthorizeTokenListFluent<A extends OAuthAuthorizeTokenListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,OAuthAuthorizeToken item);
    public A setToItems(int index,OAuthAuthorizeToken item);
    public A addToItems(OAuthAuthorizeToken... items);
    public A addAllToItems(Collection<OAuthAuthorizeToken> items);
    public A removeFromItems(OAuthAuthorizeToken... items);
    public A removeAllFromItems(Collection<OAuthAuthorizeToken> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OAuthAuthorizeToken> getItems();
    public List<OAuthAuthorizeToken> buildItems();
    public OAuthAuthorizeToken buildItem(int index);
    public OAuthAuthorizeToken buildFirstItem();
    public OAuthAuthorizeToken buildLastItem();
    public OAuthAuthorizeToken buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthAuthorizeTokenBuilder> predicate);
    public A withItems(List<OAuthAuthorizeToken> items);
    public A withItems(OAuthAuthorizeToken... items);
    public Boolean hasItems();
    public OAuthAuthorizeTokenListFluent.ItemsNested<A> addNewItem();
    public OAuthAuthorizeTokenListFluent.ItemsNested<A> addNewItemLike(OAuthAuthorizeToken item);
    public OAuthAuthorizeTokenListFluent.ItemsNested<A> setNewItemLike(int index,OAuthAuthorizeToken item);
    public OAuthAuthorizeTokenListFluent.ItemsNested<A> editItem(int index);
    public OAuthAuthorizeTokenListFluent.ItemsNested<A> editFirstItem();
    public OAuthAuthorizeTokenListFluent.ItemsNested<A> editLastItem();
    public OAuthAuthorizeTokenListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OAuthAuthorizeTokenBuilder> predicate);
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
    public OAuthAuthorizeTokenListFluent.MetadataNested<A> withNewMetadata();
    public OAuthAuthorizeTokenListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public OAuthAuthorizeTokenListFluent.MetadataNested<A> editMetadata();
    public OAuthAuthorizeTokenListFluent.MetadataNested<A> editOrNewMetadata();
    public OAuthAuthorizeTokenListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OAuthAuthorizeTokenFluent<OAuthAuthorizeTokenListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<OAuthAuthorizeTokenListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
