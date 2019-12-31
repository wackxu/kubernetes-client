package io.fabric8.kubernetes.api.model.admissionregistration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LabelSelector;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.util.Map;

public interface WebhookFluent<A extends WebhookFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildClientConfig instead.
 * @return The buildable object.
 */
@Deprecated public WebhookClientConfig getClientConfig();
    public WebhookClientConfig buildClientConfig();
    public A withClientConfig(WebhookClientConfig clientConfig);
    public Boolean hasClientConfig();
    public WebhookFluent.ClientConfigNested<A> withNewClientConfig();
    public WebhookFluent.ClientConfigNested<A> withNewClientConfigLike(WebhookClientConfig item);
    public WebhookFluent.ClientConfigNested<A> editClientConfig();
    public WebhookFluent.ClientConfigNested<A> editOrNewClientConfig();
    public WebhookFluent.ClientConfigNested<A> editOrNewClientConfigLike(WebhookClientConfig item);
    public String getFailurePolicy();
    public A withFailurePolicy(String failurePolicy);
    public Boolean hasFailurePolicy();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    
/**
 * This method has been deprecated, please use method buildNamespaceSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getNamespaceSelector();
    public LabelSelector buildNamespaceSelector();
    public A withNamespaceSelector(LabelSelector namespaceSelector);
    public Boolean hasNamespaceSelector();
    public WebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
    public WebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(LabelSelector item);
    public WebhookFluent.NamespaceSelectorNested<A> editNamespaceSelector();
    public WebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
    public WebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(LabelSelector item);
    public A addToRules(int index,RuleWithOperations item);
    public A setToRules(int index,RuleWithOperations item);
    public A addToRules(RuleWithOperations... items);
    public A addAllToRules(Collection<RuleWithOperations> items);
    public A removeFromRules(RuleWithOperations... items);
    public A removeAllFromRules(Collection<RuleWithOperations> items);
    
/**
 * This method has been deprecated, please use method buildRules instead.
 * @return The buildable object.
 */
@Deprecated public List<RuleWithOperations> getRules();
    public List<RuleWithOperations> buildRules();
    public RuleWithOperations buildRule(int index);
    public RuleWithOperations buildFirstRule();
    public RuleWithOperations buildLastRule();
    public RuleWithOperations buildMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<RuleWithOperationsBuilder> predicate);
    public A withRules(List<RuleWithOperations> rules);
    public A withRules(RuleWithOperations... rules);
    public Boolean hasRules();
    public WebhookFluent.RulesNested<A> addNewRule();
    public WebhookFluent.RulesNested<A> addNewRuleLike(RuleWithOperations item);
    public WebhookFluent.RulesNested<A> setNewRuleLike(int index,RuleWithOperations item);
    public WebhookFluent.RulesNested<A> editRule(int index);
    public WebhookFluent.RulesNested<A> editFirstRule();
    public WebhookFluent.RulesNested<A> editLastRule();
    public WebhookFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<RuleWithOperationsBuilder> predicate);
    public String getSideEffects();
    public A withSideEffects(String sideEffects);
    public Boolean hasSideEffects();

    public interface ClientConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebhookClientConfigFluent<WebhookFluent.ClientConfigNested<N>>{

        
    public N and();    public N endClientConfig();
}
    public interface NamespaceSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<WebhookFluent.NamespaceSelectorNested<N>>{

        
    public N and();    public N endNamespaceSelector();
}
    public interface RulesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RuleWithOperationsFluent<WebhookFluent.RulesNested<N>>{

        
    public N and();    public N endRule();
}


}
