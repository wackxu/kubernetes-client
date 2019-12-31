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

public interface ValidatingWebhookConfigurationListFluent<A extends ValidatingWebhookConfigurationListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,ValidatingWebhookConfiguration item);
    public A setToItems(int index,ValidatingWebhookConfiguration item);
    public A addToItems(ValidatingWebhookConfiguration... items);
    public A addAllToItems(Collection<ValidatingWebhookConfiguration> items);
    public A removeFromItems(ValidatingWebhookConfiguration... items);
    public A removeAllFromItems(Collection<ValidatingWebhookConfiguration> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ValidatingWebhookConfiguration> getItems();
    public List<ValidatingWebhookConfiguration> buildItems();
    public ValidatingWebhookConfiguration buildItem(int index);
    public ValidatingWebhookConfiguration buildFirstItem();
    public ValidatingWebhookConfiguration buildLastItem();
    public ValidatingWebhookConfiguration buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ValidatingWebhookConfigurationBuilder> predicate);
    public A withItems(List<ValidatingWebhookConfiguration> items);
    public A withItems(ValidatingWebhookConfiguration... items);
    public Boolean hasItems();
    public ValidatingWebhookConfigurationListFluent.ItemsNested<A> addNewItem();
    public ValidatingWebhookConfigurationListFluent.ItemsNested<A> addNewItemLike(ValidatingWebhookConfiguration item);
    public ValidatingWebhookConfigurationListFluent.ItemsNested<A> setNewItemLike(int index,ValidatingWebhookConfiguration item);
    public ValidatingWebhookConfigurationListFluent.ItemsNested<A> editItem(int index);
    public ValidatingWebhookConfigurationListFluent.ItemsNested<A> editFirstItem();
    public ValidatingWebhookConfigurationListFluent.ItemsNested<A> editLastItem();
    public ValidatingWebhookConfigurationListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ValidatingWebhookConfigurationBuilder> predicate);
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
    public ValidatingWebhookConfigurationListFluent.MetadataNested<A> withNewMetadata();
    public ValidatingWebhookConfigurationListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ValidatingWebhookConfigurationListFluent.MetadataNested<A> editMetadata();
    public ValidatingWebhookConfigurationListFluent.MetadataNested<A> editOrNewMetadata();
    public ValidatingWebhookConfigurationListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ValidatingWebhookConfigurationFluent<ValidatingWebhookConfigurationListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ValidatingWebhookConfigurationListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
