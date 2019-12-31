package io.fabric8.kubernetes.api.model.rbac;

import com.fasterxml.jackson.annotation.JsonProperty;
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

public class ClusterRoleFluentImpl<A extends ClusterRoleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ClusterRoleFluent<A>{

    private AggregationRuleBuilder aggregationRule;
    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<PolicyRuleBuilder> rules;

    public ClusterRoleFluentImpl(){
    }
    public ClusterRoleFluentImpl(ClusterRole instance){
            this.withAggregationRule(instance.getAggregationRule()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
    }

    
/**
 * This method has been deprecated, please use method buildAggregationRule instead.
 * @return The buildable object.
 */
@Deprecated public AggregationRule getAggregationRule(){
            return this.aggregationRule!=null?this.aggregationRule.build():null;
    }

    public AggregationRule buildAggregationRule(){
            return this.aggregationRule!=null?this.aggregationRule.build():null;
    }

    public A withAggregationRule(AggregationRule aggregationRule){
            _visitables.remove(this.aggregationRule);
            if (aggregationRule!=null){ this.aggregationRule= new AggregationRuleBuilder(aggregationRule); _visitables.add(this.aggregationRule);} return (A) this;
    }

    public Boolean hasAggregationRule(){
            return this.aggregationRule != null;
    }

    public ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRule(){
            return new AggregationRuleNestedImpl();
    }

    public ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRuleLike(AggregationRule item){
            return new AggregationRuleNestedImpl(item);
    }

    public ClusterRoleFluent.AggregationRuleNested<A> editAggregationRule(){
            return withNewAggregationRuleLike(getAggregationRule());
    }

    public ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRule(){
            return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): new AggregationRuleBuilder().build());
    }

    public ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(AggregationRule item){
            return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): item);
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

    public ClusterRoleFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ClusterRoleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ClusterRoleFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ClusterRoleFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ClusterRoleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToRules(int index,PolicyRule item){
            if (this.rules == null) {this.rules = new ArrayList<PolicyRuleBuilder>();}
            PolicyRuleBuilder builder = new PolicyRuleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
    }

    public A setToRules(int index,PolicyRule item){
            if (this.rules == null) {this.rules = new ArrayList<PolicyRuleBuilder>();}
            PolicyRuleBuilder builder = new PolicyRuleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
             return (A)this;
    }

    public A addToRules(PolicyRule... items){
            if (this.rules == null) {this.rules = new ArrayList<PolicyRuleBuilder>();}
            for (PolicyRule item : items) {PolicyRuleBuilder builder = new PolicyRuleBuilder(item);_visitables.add(builder);this.rules.add(builder);} return (A)this;
    }

    public A addAllToRules(Collection<PolicyRule> items){
            if (this.rules == null) {this.rules = new ArrayList<PolicyRuleBuilder>();}
            for (PolicyRule item : items) {PolicyRuleBuilder builder = new PolicyRuleBuilder(item);_visitables.add(builder);this.rules.add(builder);} return (A)this;
    }

    public A removeFromRules(PolicyRule... items){
            for (PolicyRule item : items) {PolicyRuleBuilder builder = new PolicyRuleBuilder(item);_visitables.remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeAllFromRules(Collection<PolicyRule> items){
            for (PolicyRule item : items) {PolicyRuleBuilder builder = new PolicyRuleBuilder(item);_visitables.remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildRules instead.
 * @return The buildable object.
 */
@Deprecated public List<PolicyRule> getRules(){
            return build(rules);
    }

    public List<PolicyRule> buildRules(){
            return build(rules);
    }

    public PolicyRule buildRule(int index){
            return this.rules.get(index).build();
    }

    public PolicyRule buildFirstRule(){
            return this.rules.get(0).build();
    }

    public PolicyRule buildLastRule(){
            return this.rules.get(rules.size() - 1).build();
    }

    public PolicyRule buildMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<PolicyRuleBuilder> predicate){
            for (PolicyRuleBuilder item: rules) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withRules(List<PolicyRule> rules){
            if (this.rules != null) { _visitables.removeAll(this.rules);}
            if (rules != null) {this.rules = new ArrayList<PolicyRuleBuilder>(); for (PolicyRule item : rules){this.addToRules(item);}} else { this.rules = new ArrayList<PolicyRuleBuilder>();} return (A) this;
    }

    public A withRules(PolicyRule... rules){
            if (this.rules != null) {this.rules.clear();}
            if (rules != null) {for (PolicyRule item :rules){ this.addToRules(item);}} return (A) this;
    }

    public Boolean hasRules(){
            return rules != null && !rules.isEmpty();
    }

    public ClusterRoleFluent.RulesNested<A> addNewRule(){
            return new RulesNestedImpl();
    }

    public ClusterRoleFluent.RulesNested<A> addNewRuleLike(PolicyRule item){
            return new RulesNestedImpl(-1, item);
    }

    public ClusterRoleFluent.RulesNested<A> setNewRuleLike(int index,PolicyRule item){
            return new RulesNestedImpl(index, item);
    }

    public ClusterRoleFluent.RulesNested<A> editRule(int index){
            if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
            return setNewRuleLike(index, buildRule(index));
    }

    public ClusterRoleFluent.RulesNested<A> editFirstRule(){
            if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
            return setNewRuleLike(0, buildRule(0));
    }

    public ClusterRoleFluent.RulesNested<A> editLastRule(){
            int index = rules.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
            return setNewRuleLike(index, buildRule(index));
    }

    public ClusterRoleFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<PolicyRuleBuilder> predicate){
            int index = -1;
            for (int i=0;i<rules.size();i++) { 
            if (predicate.apply(rules.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
            return setNewRuleLike(index, buildRule(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterRoleFluentImpl that = (ClusterRoleFluentImpl) o;
            if (aggregationRule != null ? !aggregationRule.equals(that.aggregationRule) :that.aggregationRule != null) return false;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
            return true;
    }


    public class AggregationRuleNestedImpl<N> extends AggregationRuleFluentImpl<ClusterRoleFluent.AggregationRuleNested<N>> implements ClusterRoleFluent.AggregationRuleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AggregationRuleBuilder builder;
    
            AggregationRuleNestedImpl(AggregationRule item){
                    this.builder = new AggregationRuleBuilder(this, item);
            }
            AggregationRuleNestedImpl(){
                    this.builder = new AggregationRuleBuilder(this);
            }
    
    public N and(){
            return (N) ClusterRoleFluentImpl.this.withAggregationRule(builder.build());
    }
    public N endAggregationRule(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ClusterRoleFluent.MetadataNested<N>> implements ClusterRoleFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ClusterRoleFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class RulesNestedImpl<N> extends PolicyRuleFluentImpl<ClusterRoleFluent.RulesNested<N>> implements ClusterRoleFluent.RulesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PolicyRuleBuilder builder;
        private final int index;
    
            RulesNestedImpl(int index,PolicyRule item){
                    this.index = index;
                    this.builder = new PolicyRuleBuilder(this, item);
            }
            RulesNestedImpl(){
                    this.index = -1;
                    this.builder = new PolicyRuleBuilder(this);
            }
    
    public N and(){
            return (N) ClusterRoleFluentImpl.this.setToRules(index, builder.build());
    }
    public N endRule(){
            return and();
    }

}


}
