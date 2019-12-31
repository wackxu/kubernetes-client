package io.fabric8.kubernetes.api.model.networking;

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

public interface NetworkPolicyListFluent<A extends NetworkPolicyListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,NetworkPolicy item);
    public A setToItems(int index,NetworkPolicy item);
    public A addToItems(NetworkPolicy... items);
    public A addAllToItems(Collection<NetworkPolicy> items);
    public A removeFromItems(NetworkPolicy... items);
    public A removeAllFromItems(Collection<NetworkPolicy> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicy> getItems();
    public List<NetworkPolicy> buildItems();
    public NetworkPolicy buildItem(int index);
    public NetworkPolicy buildFirstItem();
    public NetworkPolicy buildLastItem();
    public NetworkPolicy buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyBuilder> predicate);
    public A withItems(List<NetworkPolicy> items);
    public A withItems(NetworkPolicy... items);
    public Boolean hasItems();
    public NetworkPolicyListFluent.ItemsNested<A> addNewItem();
    public NetworkPolicyListFluent.ItemsNested<A> addNewItemLike(NetworkPolicy item);
    public NetworkPolicyListFluent.ItemsNested<A> setNewItemLike(int index,NetworkPolicy item);
    public NetworkPolicyListFluent.ItemsNested<A> editItem(int index);
    public NetworkPolicyListFluent.ItemsNested<A> editFirstItem();
    public NetworkPolicyListFluent.ItemsNested<A> editLastItem();
    public NetworkPolicyListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyBuilder> predicate);
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
    public NetworkPolicyListFluent.MetadataNested<A> withNewMetadata();
    public NetworkPolicyListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public NetworkPolicyListFluent.MetadataNested<A> editMetadata();
    public NetworkPolicyListFluent.MetadataNested<A> editOrNewMetadata();
    public NetworkPolicyListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NetworkPolicyFluent<NetworkPolicyListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<NetworkPolicyListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
