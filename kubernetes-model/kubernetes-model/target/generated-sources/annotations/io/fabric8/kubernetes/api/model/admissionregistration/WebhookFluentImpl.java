package io.fabric8.kubernetes.api.model.admissionregistration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.LabelSelector;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class WebhookFluentImpl<A extends WebhookFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements WebhookFluent<A>{

    private WebhookClientConfigBuilder clientConfig;
    private String failurePolicy;
    private String name;
    private LabelSelectorBuilder namespaceSelector;
    private List<RuleWithOperationsBuilder> rules;
    private String sideEffects;

    public WebhookFluentImpl(){
    }
    public WebhookFluentImpl(Webhook instance){
            this.withClientConfig(instance.getClientConfig()); 
            this.withFailurePolicy(instance.getFailurePolicy()); 
            this.withName(instance.getName()); 
            this.withNamespaceSelector(instance.getNamespaceSelector()); 
            this.withRules(instance.getRules()); 
            this.withSideEffects(instance.getSideEffects()); 
    }

    
/**
 * This method has been deprecated, please use method buildClientConfig instead.
 * @return The buildable object.
 */
@Deprecated public WebhookClientConfig getClientConfig(){
            return this.clientConfig!=null?this.clientConfig.build():null;
    }

    public WebhookClientConfig buildClientConfig(){
            return this.clientConfig!=null?this.clientConfig.build():null;
    }

    public A withClientConfig(WebhookClientConfig clientConfig){
            _visitables.remove(this.clientConfig);
            if (clientConfig!=null){ this.clientConfig= new WebhookClientConfigBuilder(clientConfig); _visitables.add(this.clientConfig);} return (A) this;
    }

    public Boolean hasClientConfig(){
            return this.clientConfig != null;
    }

    public WebhookFluent.ClientConfigNested<A> withNewClientConfig(){
            return new ClientConfigNestedImpl();
    }

    public WebhookFluent.ClientConfigNested<A> withNewClientConfigLike(WebhookClientConfig item){
            return new ClientConfigNestedImpl(item);
    }

    public WebhookFluent.ClientConfigNested<A> editClientConfig(){
            return withNewClientConfigLike(getClientConfig());
    }

    public WebhookFluent.ClientConfigNested<A> editOrNewClientConfig(){
            return withNewClientConfigLike(getClientConfig() != null ? getClientConfig(): new WebhookClientConfigBuilder().build());
    }

    public WebhookFluent.ClientConfigNested<A> editOrNewClientConfigLike(WebhookClientConfig item){
            return withNewClientConfigLike(getClientConfig() != null ? getClientConfig(): item);
    }

    public String getFailurePolicy(){
            return this.failurePolicy;
    }

    public A withFailurePolicy(String failurePolicy){
            this.failurePolicy=failurePolicy; return (A) this;
    }

    public Boolean hasFailurePolicy(){
            return this.failurePolicy != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    
/**
 * This method has been deprecated, please use method buildNamespaceSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getNamespaceSelector(){
            return this.namespaceSelector!=null?this.namespaceSelector.build():null;
    }

    public LabelSelector buildNamespaceSelector(){
            return this.namespaceSelector!=null?this.namespaceSelector.build():null;
    }

    public A withNamespaceSelector(LabelSelector namespaceSelector){
            _visitables.remove(this.namespaceSelector);
            if (namespaceSelector!=null){ this.namespaceSelector= new LabelSelectorBuilder(namespaceSelector); _visitables.add(this.namespaceSelector);} return (A) this;
    }

    public Boolean hasNamespaceSelector(){
            return this.namespaceSelector != null;
    }

    public WebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector(){
            return new NamespaceSelectorNestedImpl();
    }

    public WebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(LabelSelector item){
            return new NamespaceSelectorNestedImpl(item);
    }

    public WebhookFluent.NamespaceSelectorNested<A> editNamespaceSelector(){
            return withNewNamespaceSelectorLike(getNamespaceSelector());
    }

    public WebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector(){
            return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): new LabelSelectorBuilder().build());
    }

    public WebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(LabelSelector item){
            return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): item);
    }

    public A addToRules(int index,RuleWithOperations item){
            if (this.rules == null) {this.rules = new ArrayList<RuleWithOperationsBuilder>();}
            RuleWithOperationsBuilder builder = new RuleWithOperationsBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
    }

    public A setToRules(int index,RuleWithOperations item){
            if (this.rules == null) {this.rules = new ArrayList<RuleWithOperationsBuilder>();}
            RuleWithOperationsBuilder builder = new RuleWithOperationsBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
             return (A)this;
    }

    public A addToRules(RuleWithOperations... items){
            if (this.rules == null) {this.rules = new ArrayList<RuleWithOperationsBuilder>();}
            for (RuleWithOperations item : items) {RuleWithOperationsBuilder builder = new RuleWithOperationsBuilder(item);_visitables.add(builder);this.rules.add(builder);} return (A)this;
    }

    public A addAllToRules(Collection<RuleWithOperations> items){
            if (this.rules == null) {this.rules = new ArrayList<RuleWithOperationsBuilder>();}
            for (RuleWithOperations item : items) {RuleWithOperationsBuilder builder = new RuleWithOperationsBuilder(item);_visitables.add(builder);this.rules.add(builder);} return (A)this;
    }

    public A removeFromRules(RuleWithOperations... items){
            for (RuleWithOperations item : items) {RuleWithOperationsBuilder builder = new RuleWithOperationsBuilder(item);_visitables.remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeAllFromRules(Collection<RuleWithOperations> items){
            for (RuleWithOperations item : items) {RuleWithOperationsBuilder builder = new RuleWithOperationsBuilder(item);_visitables.remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildRules instead.
 * @return The buildable object.
 */
@Deprecated public List<RuleWithOperations> getRules(){
            return build(rules);
    }

    public List<RuleWithOperations> buildRules(){
            return build(rules);
    }

    public RuleWithOperations buildRule(int index){
            return this.rules.get(index).build();
    }

    public RuleWithOperations buildFirstRule(){
            return this.rules.get(0).build();
    }

    public RuleWithOperations buildLastRule(){
            return this.rules.get(rules.size() - 1).build();
    }

    public RuleWithOperations buildMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<RuleWithOperationsBuilder> predicate){
            for (RuleWithOperationsBuilder item: rules) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withRules(List<RuleWithOperations> rules){
            if (this.rules != null) { _visitables.removeAll(this.rules);}
            if (rules != null) {this.rules = new ArrayList<RuleWithOperationsBuilder>(); for (RuleWithOperations item : rules){this.addToRules(item);}} else { this.rules = new ArrayList<RuleWithOperationsBuilder>();} return (A) this;
    }

    public A withRules(RuleWithOperations... rules){
            if (this.rules != null) {this.rules.clear();}
            if (rules != null) {for (RuleWithOperations item :rules){ this.addToRules(item);}} return (A) this;
    }

    public Boolean hasRules(){
            return rules != null && !rules.isEmpty();
    }

    public WebhookFluent.RulesNested<A> addNewRule(){
            return new RulesNestedImpl();
    }

    public WebhookFluent.RulesNested<A> addNewRuleLike(RuleWithOperations item){
            return new RulesNestedImpl(-1, item);
    }

    public WebhookFluent.RulesNested<A> setNewRuleLike(int index,RuleWithOperations item){
            return new RulesNestedImpl(index, item);
    }

    public WebhookFluent.RulesNested<A> editRule(int index){
            if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
            return setNewRuleLike(index, buildRule(index));
    }

    public WebhookFluent.RulesNested<A> editFirstRule(){
            if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
            return setNewRuleLike(0, buildRule(0));
    }

    public WebhookFluent.RulesNested<A> editLastRule(){
            int index = rules.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
            return setNewRuleLike(index, buildRule(index));
    }

    public WebhookFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<RuleWithOperationsBuilder> predicate){
            int index = -1;
            for (int i=0;i<rules.size();i++) { 
            if (predicate.apply(rules.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
            return setNewRuleLike(index, buildRule(index));
    }

    public String getSideEffects(){
            return this.sideEffects;
    }

    public A withSideEffects(String sideEffects){
            this.sideEffects=sideEffects; return (A) this;
    }

    public Boolean hasSideEffects(){
            return this.sideEffects != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WebhookFluentImpl that = (WebhookFluentImpl) o;
            if (clientConfig != null ? !clientConfig.equals(that.clientConfig) :that.clientConfig != null) return false;
            if (failurePolicy != null ? !failurePolicy.equals(that.failurePolicy) :that.failurePolicy != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (namespaceSelector != null ? !namespaceSelector.equals(that.namespaceSelector) :that.namespaceSelector != null) return false;
            if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
            if (sideEffects != null ? !sideEffects.equals(that.sideEffects) :that.sideEffects != null) return false;
            return true;
    }


    public class ClientConfigNestedImpl<N> extends WebhookClientConfigFluentImpl<WebhookFluent.ClientConfigNested<N>> implements WebhookFluent.ClientConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebhookClientConfigBuilder builder;
    
            ClientConfigNestedImpl(WebhookClientConfig item){
                    this.builder = new WebhookClientConfigBuilder(this, item);
            }
            ClientConfigNestedImpl(){
                    this.builder = new WebhookClientConfigBuilder(this);
            }
    
    public N and(){
            return (N) WebhookFluentImpl.this.withClientConfig(builder.build());
    }
    public N endClientConfig(){
            return and();
    }

}
    public class NamespaceSelectorNestedImpl<N> extends LabelSelectorFluentImpl<WebhookFluent.NamespaceSelectorNested<N>> implements WebhookFluent.NamespaceSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            NamespaceSelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            NamespaceSelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) WebhookFluentImpl.this.withNamespaceSelector(builder.build());
    }
    public N endNamespaceSelector(){
            return and();
    }

}
    public class RulesNestedImpl<N> extends RuleWithOperationsFluentImpl<WebhookFluent.RulesNested<N>> implements WebhookFluent.RulesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RuleWithOperationsBuilder builder;
        private final int index;
    
            RulesNestedImpl(int index,RuleWithOperations item){
                    this.index = index;
                    this.builder = new RuleWithOperationsBuilder(this, item);
            }
            RulesNestedImpl(){
                    this.index = -1;
                    this.builder = new RuleWithOperationsBuilder(this);
            }
    
    public N and(){
            return (N) WebhookFluentImpl.this.setToRules(index, builder.build());
    }
    public N endRule(){
            return and();
    }

}


}
