package io.fabric8.kubernetes.api.model.extensions;

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
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface IngressSpecFluent<A extends IngressSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildBackend instead.
 * @return The buildable object.
 */
@Deprecated public IngressBackend getBackend();
    public IngressBackend buildBackend();
    public A withBackend(IngressBackend backend);
    public Boolean hasBackend();
    public IngressSpecFluent.BackendNested<A> withNewBackend();
    public IngressSpecFluent.BackendNested<A> withNewBackendLike(IngressBackend item);
    public IngressSpecFluent.BackendNested<A> editBackend();
    public IngressSpecFluent.BackendNested<A> editOrNewBackend();
    public IngressSpecFluent.BackendNested<A> editOrNewBackendLike(IngressBackend item);
    public A addToRules(int index,IngressRule item);
    public A setToRules(int index,IngressRule item);
    public A addToRules(IngressRule... items);
    public A addAllToRules(Collection<IngressRule> items);
    public A removeFromRules(IngressRule... items);
    public A removeAllFromRules(Collection<IngressRule> items);
    
/**
 * This method has been deprecated, please use method buildRules instead.
 * @return The buildable object.
 */
@Deprecated public List<IngressRule> getRules();
    public List<IngressRule> buildRules();
    public IngressRule buildRule(int index);
    public IngressRule buildFirstRule();
    public IngressRule buildLastRule();
    public IngressRule buildMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<IngressRuleBuilder> predicate);
    public A withRules(List<IngressRule> rules);
    public A withRules(IngressRule... rules);
    public Boolean hasRules();
    public IngressSpecFluent.RulesNested<A> addNewRule();
    public IngressSpecFluent.RulesNested<A> addNewRuleLike(IngressRule item);
    public IngressSpecFluent.RulesNested<A> setNewRuleLike(int index,IngressRule item);
    public IngressSpecFluent.RulesNested<A> editRule(int index);
    public IngressSpecFluent.RulesNested<A> editFirstRule();
    public IngressSpecFluent.RulesNested<A> editLastRule();
    public IngressSpecFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<IngressRuleBuilder> predicate);
    public A addToTls(int index,IngressTLS item);
    public A setToTls(int index,IngressTLS item);
    public A addToTls(IngressTLS... items);
    public A addAllToTls(Collection<IngressTLS> items);
    public A removeFromTls(IngressTLS... items);
    public A removeAllFromTls(Collection<IngressTLS> items);
    
/**
 * This method has been deprecated, please use method buildTls instead.
 * @return The buildable object.
 */
@Deprecated public List<IngressTLS> getTls();
    public List<IngressTLS> buildTls();
    public IngressTLS buildTl(int index);
    public IngressTLS buildFirstTl();
    public IngressTLS buildLastTl();
    public IngressTLS buildMatchingTl(io.fabric8.kubernetes.api.builder.Predicate<IngressTLSBuilder> predicate);
    public A withTls(List<IngressTLS> tls);
    public A withTls(IngressTLS... tls);
    public Boolean hasTls();
    public IngressSpecFluent.TlsNested<A> addNewTl();
    public IngressSpecFluent.TlsNested<A> addNewTlLike(IngressTLS item);
    public IngressSpecFluent.TlsNested<A> setNewTlLike(int index,IngressTLS item);
    public IngressSpecFluent.TlsNested<A> editTl(int index);
    public IngressSpecFluent.TlsNested<A> editFirstTl();
    public IngressSpecFluent.TlsNested<A> editLastTl();
    public IngressSpecFluent.TlsNested<A> editMatchingTl(io.fabric8.kubernetes.api.builder.Predicate<IngressTLSBuilder> predicate);

    public interface BackendNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressBackendFluent<IngressSpecFluent.BackendNested<N>>{

        
    public N and();    public N endBackend();
}
    public interface RulesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressRuleFluent<IngressSpecFluent.RulesNested<N>>{

        
    public N and();    public N endRule();
}
    public interface TlsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressTLSFluent<IngressSpecFluent.TlsNested<N>>{

        
    public N and();    public N endTl();
}


}
