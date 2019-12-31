package io.fabric8.kubernetes.api.model.admissionregistration;

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

public interface MutatingWebhookConfigurationListFluent<A extends MutatingWebhookConfigurationListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,MutatingWebhookConfiguration item);
    public A setToItems(int index,MutatingWebhookConfiguration item);
    public A addToItems(MutatingWebhookConfiguration... items);
    public A addAllToItems(Collection<MutatingWebhookConfiguration> items);
    public A removeFromItems(MutatingWebhookConfiguration... items);
    public A removeAllFromItems(Collection<MutatingWebhookConfiguration> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<MutatingWebhookConfiguration> getItems();
    public List<MutatingWebhookConfiguration> buildItems();
    public MutatingWebhookConfiguration buildItem(int index);
    public MutatingWebhookConfiguration buildFirstItem();
    public MutatingWebhookConfiguration buildLastItem();
    public MutatingWebhookConfiguration buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<MutatingWebhookConfigurationBuilder> predicate);
    public A withItems(List<MutatingWebhookConfiguration> items);
    public A withItems(MutatingWebhookConfiguration... items);
    public Boolean hasItems();
    public MutatingWebhookConfigurationListFluent.ItemsNested<A> addNewItem();
    public MutatingWebhookConfigurationListFluent.ItemsNested<A> addNewItemLike(MutatingWebhookConfiguration item);
    public MutatingWebhookConfigurationListFluent.ItemsNested<A> setNewItemLike(int index,MutatingWebhookConfiguration item);
    public MutatingWebhookConfigurationListFluent.ItemsNested<A> editItem(int index);
    public MutatingWebhookConfigurationListFluent.ItemsNested<A> editFirstItem();
    public MutatingWebhookConfigurationListFluent.ItemsNested<A> editLastItem();
    public MutatingWebhookConfigurationListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<MutatingWebhookConfigurationBuilder> predicate);
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
    public MutatingWebhookConfigurationListFluent.MetadataNested<A> withNewMetadata();
    public MutatingWebhookConfigurationListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public MutatingWebhookConfigurationListFluent.MetadataNested<A> editMetadata();
    public MutatingWebhookConfigurationListFluent.MetadataNested<A> editOrNewMetadata();
    public MutatingWebhookConfigurationListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MutatingWebhookConfigurationFluent<MutatingWebhookConfigurationListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<MutatingWebhookConfigurationListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
