package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class IngressSpecFluentImpl<A extends IngressSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IngressSpecFluent<A>{

    private IngressBackendBuilder backend;
    private List<IngressRuleBuilder> rules;
    private List<IngressTLSBuilder> tls;

    public IngressSpecFluentImpl(){
    }
    public IngressSpecFluentImpl(IngressSpec instance){
            this.withBackend(instance.getBackend()); 
            this.withRules(instance.getRules()); 
            this.withTls(instance.getTls()); 
    }

    
/**
 * This method has been deprecated, please use method buildBackend instead.
 * @return The buildable object.
 */
@Deprecated public IngressBackend getBackend(){
            return this.backend!=null?this.backend.build():null;
    }

    public IngressBackend buildBackend(){
            return this.backend!=null?this.backend.build():null;
    }

    public A withBackend(IngressBackend backend){
            _visitables.remove(this.backend);
            if (backend!=null){ this.backend= new IngressBackendBuilder(backend); _visitables.add(this.backend);} return (A) this;
    }

    public Boolean hasBackend(){
            return this.backend != null;
    }

    public IngressSpecFluent.BackendNested<A> withNewBackend(){
            return new BackendNestedImpl();
    }

    public IngressSpecFluent.BackendNested<A> withNewBackendLike(IngressBackend item){
            return new BackendNestedImpl(item);
    }

    public IngressSpecFluent.BackendNested<A> editBackend(){
            return withNewBackendLike(getBackend());
    }

    public IngressSpecFluent.BackendNested<A> editOrNewBackend(){
            return withNewBackendLike(getBackend() != null ? getBackend(): new IngressBackendBuilder().build());
    }

    public IngressSpecFluent.BackendNested<A> editOrNewBackendLike(IngressBackend item){
            return withNewBackendLike(getBackend() != null ? getBackend(): item);
    }

    public A addToRules(int index,IngressRule item){
            if (this.rules == null) {this.rules = new ArrayList<IngressRuleBuilder>();}
            IngressRuleBuilder builder = new IngressRuleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
    }

    public A setToRules(int index,IngressRule item){
            if (this.rules == null) {this.rules = new ArrayList<IngressRuleBuilder>();}
            IngressRuleBuilder builder = new IngressRuleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
             return (A)this;
    }

    public A addToRules(IngressRule... items){
            if (this.rules == null) {this.rules = new ArrayList<IngressRuleBuilder>();}
            for (IngressRule item : items) {IngressRuleBuilder builder = new IngressRuleBuilder(item);_visitables.add(builder);this.rules.add(builder);} return (A)this;
    }

    public A addAllToRules(Collection<IngressRule> items){
            if (this.rules == null) {this.rules = new ArrayList<IngressRuleBuilder>();}
            for (IngressRule item : items) {IngressRuleBuilder builder = new IngressRuleBuilder(item);_visitables.add(builder);this.rules.add(builder);} return (A)this;
    }

    public A removeFromRules(IngressRule... items){
            for (IngressRule item : items) {IngressRuleBuilder builder = new IngressRuleBuilder(item);_visitables.remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeAllFromRules(Collection<IngressRule> items){
            for (IngressRule item : items) {IngressRuleBuilder builder = new IngressRuleBuilder(item);_visitables.remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildRules instead.
 * @return The buildable object.
 */
@Deprecated public List<IngressRule> getRules(){
            return build(rules);
    }

    public List<IngressRule> buildRules(){
            return build(rules);
    }

    public IngressRule buildRule(int index){
            return this.rules.get(index).build();
    }

    public IngressRule buildFirstRule(){
            return this.rules.get(0).build();
    }

    public IngressRule buildLastRule(){
            return this.rules.get(rules.size() - 1).build();
    }

    public IngressRule buildMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<IngressRuleBuilder> predicate){
            for (IngressRuleBuilder item: rules) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withRules(List<IngressRule> rules){
            if (this.rules != null) { _visitables.removeAll(this.rules);}
            if (rules != null) {this.rules = new ArrayList<IngressRuleBuilder>(); for (IngressRule item : rules){this.addToRules(item);}} else { this.rules = new ArrayList<IngressRuleBuilder>();} return (A) this;
    }

    public A withRules(IngressRule... rules){
            if (this.rules != null) {this.rules.clear();}
            if (rules != null) {for (IngressRule item :rules){ this.addToRules(item);}} return (A) this;
    }

    public Boolean hasRules(){
            return rules != null && !rules.isEmpty();
    }

    public IngressSpecFluent.RulesNested<A> addNewRule(){
            return new RulesNestedImpl();
    }

    public IngressSpecFluent.RulesNested<A> addNewRuleLike(IngressRule item){
            return new RulesNestedImpl(-1, item);
    }

    public IngressSpecFluent.RulesNested<A> setNewRuleLike(int index,IngressRule item){
            return new RulesNestedImpl(index, item);
    }

    public IngressSpecFluent.RulesNested<A> editRule(int index){
            if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
            return setNewRuleLike(index, buildRule(index));
    }

    public IngressSpecFluent.RulesNested<A> editFirstRule(){
            if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
            return setNewRuleLike(0, buildRule(0));
    }

    public IngressSpecFluent.RulesNested<A> editLastRule(){
            int index = rules.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
            return setNewRuleLike(index, buildRule(index));
    }

    public IngressSpecFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<IngressRuleBuilder> predicate){
            int index = -1;
            for (int i=0;i<rules.size();i++) { 
            if (predicate.apply(rules.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
            return setNewRuleLike(index, buildRule(index));
    }

    public A addToTls(int index,IngressTLS item){
            if (this.tls == null) {this.tls = new ArrayList<IngressTLSBuilder>();}
            IngressTLSBuilder builder = new IngressTLSBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.tls.add(index >= 0 ? index : tls.size(), builder); return (A)this;
    }

    public A setToTls(int index,IngressTLS item){
            if (this.tls == null) {this.tls = new ArrayList<IngressTLSBuilder>();}
            IngressTLSBuilder builder = new IngressTLSBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= tls.size()) { tls.add(builder); } else { tls.set(index, builder);}
             return (A)this;
    }

    public A addToTls(IngressTLS... items){
            if (this.tls == null) {this.tls = new ArrayList<IngressTLSBuilder>();}
            for (IngressTLS item : items) {IngressTLSBuilder builder = new IngressTLSBuilder(item);_visitables.add(builder);this.tls.add(builder);} return (A)this;
    }

    public A addAllToTls(Collection<IngressTLS> items){
            if (this.tls == null) {this.tls = new ArrayList<IngressTLSBuilder>();}
            for (IngressTLS item : items) {IngressTLSBuilder builder = new IngressTLSBuilder(item);_visitables.add(builder);this.tls.add(builder);} return (A)this;
    }

    public A removeFromTls(IngressTLS... items){
            for (IngressTLS item : items) {IngressTLSBuilder builder = new IngressTLSBuilder(item);_visitables.remove(builder);if (this.tls != null) {this.tls.remove(builder);}} return (A)this;
    }

    public A removeAllFromTls(Collection<IngressTLS> items){
            for (IngressTLS item : items) {IngressTLSBuilder builder = new IngressTLSBuilder(item);_visitables.remove(builder);if (this.tls != null) {this.tls.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTls instead.
 * @return The buildable object.
 */
@Deprecated public List<IngressTLS> getTls(){
            return build(tls);
    }

    public List<IngressTLS> buildTls(){
            return build(tls);
    }

    public IngressTLS buildTl(int index){
            return this.tls.get(index).build();
    }

    public IngressTLS buildFirstTl(){
            return this.tls.get(0).build();
    }

    public IngressTLS buildLastTl(){
            return this.tls.get(tls.size() - 1).build();
    }

    public IngressTLS buildMatchingTl(io.fabric8.kubernetes.api.builder.Predicate<IngressTLSBuilder> predicate){
            for (IngressTLSBuilder item: tls) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTls(List<IngressTLS> tls){
            if (this.tls != null) { _visitables.removeAll(this.tls);}
            if (tls != null) {this.tls = new ArrayList<IngressTLSBuilder>(); for (IngressTLS item : tls){this.addToTls(item);}} else { this.tls = new ArrayList<IngressTLSBuilder>();} return (A) this;
    }

    public A withTls(IngressTLS... tls){
            if (this.tls != null) {this.tls.clear();}
            if (tls != null) {for (IngressTLS item :tls){ this.addToTls(item);}} return (A) this;
    }

    public Boolean hasTls(){
            return tls != null && !tls.isEmpty();
    }

    public IngressSpecFluent.TlsNested<A> addNewTl(){
            return new TlsNestedImpl();
    }

    public IngressSpecFluent.TlsNested<A> addNewTlLike(IngressTLS item){
            return new TlsNestedImpl(-1, item);
    }

    public IngressSpecFluent.TlsNested<A> setNewTlLike(int index,IngressTLS item){
            return new TlsNestedImpl(index, item);
    }

    public IngressSpecFluent.TlsNested<A> editTl(int index){
            if (tls.size() <= index) throw new RuntimeException("Can't edit tls. Index exceeds size.");
            return setNewTlLike(index, buildTl(index));
    }

    public IngressSpecFluent.TlsNested<A> editFirstTl(){
            if (tls.size() == 0) throw new RuntimeException("Can't edit first tls. The list is empty.");
            return setNewTlLike(0, buildTl(0));
    }

    public IngressSpecFluent.TlsNested<A> editLastTl(){
            int index = tls.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last tls. The list is empty.");
            return setNewTlLike(index, buildTl(index));
    }

    public IngressSpecFluent.TlsNested<A> editMatchingTl(io.fabric8.kubernetes.api.builder.Predicate<IngressTLSBuilder> predicate){
            int index = -1;
            for (int i=0;i<tls.size();i++) { 
            if (predicate.apply(tls.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching tls. No match found.");
            return setNewTlLike(index, buildTl(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressSpecFluentImpl that = (IngressSpecFluentImpl) o;
            if (backend != null ? !backend.equals(that.backend) :that.backend != null) return false;
            if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
            if (tls != null ? !tls.equals(that.tls) :that.tls != null) return false;
            return true;
    }


    public class BackendNestedImpl<N> extends IngressBackendFluentImpl<IngressSpecFluent.BackendNested<N>> implements IngressSpecFluent.BackendNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBackendBuilder builder;
    
            BackendNestedImpl(IngressBackend item){
                    this.builder = new IngressBackendBuilder(this, item);
            }
            BackendNestedImpl(){
                    this.builder = new IngressBackendBuilder(this);
            }
    
    public N and(){
            return (N) IngressSpecFluentImpl.this.withBackend(builder.build());
    }
    public N endBackend(){
            return and();
    }

}
    public class RulesNestedImpl<N> extends IngressRuleFluentImpl<IngressSpecFluent.RulesNested<N>> implements IngressSpecFluent.RulesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressRuleBuilder builder;
        private final int index;
    
            RulesNestedImpl(int index,IngressRule item){
                    this.index = index;
                    this.builder = new IngressRuleBuilder(this, item);
            }
            RulesNestedImpl(){
                    this.index = -1;
                    this.builder = new IngressRuleBuilder(this);
            }
    
    public N and(){
            return (N) IngressSpecFluentImpl.this.setToRules(index, builder.build());
    }
    public N endRule(){
            return and();
    }

}
    public class TlsNestedImpl<N> extends IngressTLSFluentImpl<IngressSpecFluent.TlsNested<N>> implements IngressSpecFluent.TlsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressTLSBuilder builder;
        private final int index;
    
            TlsNestedImpl(int index,IngressTLS item){
                    this.index = index;
                    this.builder = new IngressTLSBuilder(this, item);
            }
            TlsNestedImpl(){
                    this.index = -1;
                    this.builder = new IngressTLSBuilder(this);
            }
    
    public N and(){
            return (N) IngressSpecFluentImpl.this.setToTls(index, builder.build());
    }
    public N endTl(){
            return and();
    }

}


}
