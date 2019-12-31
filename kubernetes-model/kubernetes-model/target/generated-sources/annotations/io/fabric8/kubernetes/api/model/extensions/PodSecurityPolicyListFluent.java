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

public interface PodSecurityPolicyListFluent<A extends PodSecurityPolicyListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,PodSecurityPolicy item);
    public A setToItems(int index,PodSecurityPolicy item);
    public A addToItems(PodSecurityPolicy... items);
    public A addAllToItems(Collection<PodSecurityPolicy> items);
    public A removeFromItems(PodSecurityPolicy... items);
    public A removeAllFromItems(Collection<PodSecurityPolicy> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<PodSecurityPolicy> getItems();
    public List<PodSecurityPolicy> buildItems();
    public PodSecurityPolicy buildItem(int index);
    public PodSecurityPolicy buildFirstItem();
    public PodSecurityPolicy buildLastItem();
    public PodSecurityPolicy buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodSecurityPolicyBuilder> predicate);
    public A withItems(List<PodSecurityPolicy> items);
    public A withItems(PodSecurityPolicy... items);
    public Boolean hasItems();
    public PodSecurityPolicyListFluent.ItemsNested<A> addNewItem();
    public PodSecurityPolicyListFluent.ItemsNested<A> addNewItemLike(PodSecurityPolicy item);
    public PodSecurityPolicyListFluent.ItemsNested<A> setNewItemLike(int index,PodSecurityPolicy item);
    public PodSecurityPolicyListFluent.ItemsNested<A> editItem(int index);
    public PodSecurityPolicyListFluent.ItemsNested<A> editFirstItem();
    public PodSecurityPolicyListFluent.ItemsNested<A> editLastItem();
    public PodSecurityPolicyListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<PodSecurityPolicyBuilder> predicate);
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
    public PodSecurityPolicyListFluent.MetadataNested<A> withNewMetadata();
    public PodSecurityPolicyListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public PodSecurityPolicyListFluent.MetadataNested<A> editMetadata();
    public PodSecurityPolicyListFluent.MetadataNested<A> editOrNewMetadata();
    public PodSecurityPolicyListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodSecurityPolicyFluent<PodSecurityPolicyListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<PodSecurityPolicyListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
