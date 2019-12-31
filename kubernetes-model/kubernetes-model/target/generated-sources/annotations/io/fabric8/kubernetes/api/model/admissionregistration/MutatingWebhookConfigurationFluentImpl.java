package io.fabric8.kubernetes.api.model.admissionregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class MutatingWebhookConfigurationFluentImpl<A extends MutatingWebhookConfigurationFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements MutatingWebhookConfigurationFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<WebhookBuilder> webhooks;

    public MutatingWebhookConfigurationFluentImpl(){
    }
    public MutatingWebhookConfigurationFluentImpl(MutatingWebhookConfiguration instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withWebhooks(instance.getWebhooks()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public MutatingWebhookConfigurationFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToWebhooks(int index,Webhook item){
            if (this.webhooks == null) {this.webhooks = new ArrayList<WebhookBuilder>();}
            WebhookBuilder builder = new WebhookBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.webhooks.add(index >= 0 ? index : webhooks.size(), builder); return (A)this;
    }

    public A setToWebhooks(int index,Webhook item){
            if (this.webhooks == null) {this.webhooks = new ArrayList<WebhookBuilder>();}
            WebhookBuilder builder = new WebhookBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= webhooks.size()) { webhooks.add(builder); } else { webhooks.set(index, builder);}
             return (A)this;
    }

    public A addToWebhooks(Webhook... items){
            if (this.webhooks == null) {this.webhooks = new ArrayList<WebhookBuilder>();}
            for (Webhook item : items) {WebhookBuilder builder = new WebhookBuilder(item);_visitables.add(builder);this.webhooks.add(builder);} return (A)this;
    }

    public A addAllToWebhooks(Collection<Webhook> items){
            if (this.webhooks == null) {this.webhooks = new ArrayList<WebhookBuilder>();}
            for (Webhook item : items) {WebhookBuilder builder = new WebhookBuilder(item);_visitables.add(builder);this.webhooks.add(builder);} return (A)this;
    }

    public A removeFromWebhooks(Webhook... items){
            for (Webhook item : items) {WebhookBuilder builder = new WebhookBuilder(item);_visitables.remove(builder);if (this.webhooks != null) {this.webhooks.remove(builder);}} return (A)this;
    }

    public A removeAllFromWebhooks(Collection<Webhook> items){
            for (Webhook item : items) {WebhookBuilder builder = new WebhookBuilder(item);_visitables.remove(builder);if (this.webhooks != null) {this.webhooks.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildWebhooks instead.
 * @return The buildable object.
 */
@Deprecated public List<Webhook> getWebhooks(){
            return build(webhooks);
    }

    public List<Webhook> buildWebhooks(){
            return build(webhooks);
    }

    public Webhook buildWebhook(int index){
            return this.webhooks.get(index).build();
    }

    public Webhook buildFirstWebhook(){
            return this.webhooks.get(0).build();
    }

    public Webhook buildLastWebhook(){
            return this.webhooks.get(webhooks.size() - 1).build();
    }

    public Webhook buildMatchingWebhook(io.fabric8.kubernetes.api.builder.Predicate<WebhookBuilder> predicate){
            for (WebhookBuilder item: webhooks) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withWebhooks(List<Webhook> webhooks){
            if (this.webhooks != null) { _visitables.removeAll(this.webhooks);}
            if (webhooks != null) {this.webhooks = new ArrayList<WebhookBuilder>(); for (Webhook item : webhooks){this.addToWebhooks(item);}} else { this.webhooks = new ArrayList<WebhookBuilder>();} return (A) this;
    }

    public A withWebhooks(Webhook... webhooks){
            if (this.webhooks != null) {this.webhooks.clear();}
            if (webhooks != null) {for (Webhook item :webhooks){ this.addToWebhooks(item);}} return (A) this;
    }

    public Boolean hasWebhooks(){
            return webhooks != null && !webhooks.isEmpty();
    }

    public MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook(){
            return new WebhooksNestedImpl();
    }

    public MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhookLike(Webhook item){
            return new WebhooksNestedImpl(-1, item);
    }

    public MutatingWebhookConfigurationFluent.WebhooksNested<A> setNewWebhookLike(int index,Webhook item){
            return new WebhooksNestedImpl(index, item);
    }

    public MutatingWebhookConfigurationFluent.WebhooksNested<A> editWebhook(int index){
            if (webhooks.size() <= index) throw new RuntimeException("Can't edit webhooks. Index exceeds size.");
            return setNewWebhookLike(index, buildWebhook(index));
    }

    public MutatingWebhookConfigurationFluent.WebhooksNested<A> editFirstWebhook(){
            if (webhooks.size() == 0) throw new RuntimeException("Can't edit first webhooks. The list is empty.");
            return setNewWebhookLike(0, buildWebhook(0));
    }

    public MutatingWebhookConfigurationFluent.WebhooksNested<A> editLastWebhook(){
            int index = webhooks.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last webhooks. The list is empty.");
            return setNewWebhookLike(index, buildWebhook(index));
    }

    public MutatingWebhookConfigurationFluent.WebhooksNested<A> editMatchingWebhook(io.fabric8.kubernetes.api.builder.Predicate<WebhookBuilder> predicate){
            int index = -1;
            for (int i=0;i<webhooks.size();i++) { 
            if (predicate.apply(webhooks.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching webhooks. No match found.");
            return setNewWebhookLike(index, buildWebhook(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MutatingWebhookConfigurationFluentImpl that = (MutatingWebhookConfigurationFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (webhooks != null ? !webhooks.equals(that.webhooks) :that.webhooks != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<MutatingWebhookConfigurationFluent.MetadataNested<N>> implements MutatingWebhookConfigurationFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) MutatingWebhookConfigurationFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class WebhooksNestedImpl<N> extends WebhookFluentImpl<MutatingWebhookConfigurationFluent.WebhooksNested<N>> implements MutatingWebhookConfigurationFluent.WebhooksNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebhookBuilder builder;
        private final int index;
    
            WebhooksNestedImpl(int index,Webhook item){
                    this.index = index;
                    this.builder = new WebhookBuilder(this, item);
            }
            WebhooksNestedImpl(){
                    this.index = -1;
                    this.builder = new WebhookBuilder(this);
            }
    
    public N and(){
            return (N) MutatingWebhookConfigurationFluentImpl.this.setToWebhooks(index, builder.build());
    }
    public N endWebhook(){
            return and();
    }

}


}
