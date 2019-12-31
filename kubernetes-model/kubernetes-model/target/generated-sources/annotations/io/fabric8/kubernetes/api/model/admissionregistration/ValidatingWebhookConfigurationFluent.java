package io.fabric8.kubernetes.api.model.admissionregistration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ValidatingWebhookConfigurationFluent<A extends ValidatingWebhookConfigurationFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public ValidatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata();
    public ValidatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ValidatingWebhookConfigurationFluent.MetadataNested<A> editMetadata();
    public ValidatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadata();
    public ValidatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToWebhooks(int index,Webhook item);
    public A setToWebhooks(int index,Webhook item);
    public A addToWebhooks(Webhook... items);
    public A addAllToWebhooks(Collection<Webhook> items);
    public A removeFromWebhooks(Webhook... items);
    public A removeAllFromWebhooks(Collection<Webhook> items);
    
/**
 * This method has been deprecated, please use method buildWebhooks instead.
 * @return The buildable object.
 */
@Deprecated public List<Webhook> getWebhooks();
    public List<Webhook> buildWebhooks();
    public Webhook buildWebhook(int index);
    public Webhook buildFirstWebhook();
    public Webhook buildLastWebhook();
    public Webhook buildMatchingWebhook(io.fabric8.kubernetes.api.builder.Predicate<WebhookBuilder> predicate);
    public A withWebhooks(List<Webhook> webhooks);
    public A withWebhooks(Webhook... webhooks);
    public Boolean hasWebhooks();
    public ValidatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook();
    public ValidatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhookLike(Webhook item);
    public ValidatingWebhookConfigurationFluent.WebhooksNested<A> setNewWebhookLike(int index,Webhook item);
    public ValidatingWebhookConfigurationFluent.WebhooksNested<A> editWebhook(int index);
    public ValidatingWebhookConfigurationFluent.WebhooksNested<A> editFirstWebhook();
    public ValidatingWebhookConfigurationFluent.WebhooksNested<A> editLastWebhook();
    public ValidatingWebhookConfigurationFluent.WebhooksNested<A> editMatchingWebhook(io.fabric8.kubernetes.api.builder.Predicate<WebhookBuilder> predicate);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ValidatingWebhookConfigurationFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface WebhooksNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebhookFluent<ValidatingWebhookConfigurationFluent.WebhooksNested<N>>{

        
    public N and();    public N endWebhook();
}


}
