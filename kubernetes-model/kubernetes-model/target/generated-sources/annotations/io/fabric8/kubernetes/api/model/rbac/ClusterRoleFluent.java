package io.fabric8.kubernetes.api.model.rbac;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

public interface ClusterRoleFluent<A extends ClusterRoleFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildAggregationRule instead.
 * @return The buildable object.
 */
@Deprecated public AggregationRule getAggregationRule();
    public AggregationRule buildAggregationRule();
    public A withAggregationRule(AggregationRule aggregationRule);
    public Boolean hasAggregationRule();
    public ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRule();
    public ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRuleLike(AggregationRule item);
    public ClusterRoleFluent.AggregationRuleNested<A> editAggregationRule();
    public ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRule();
    public ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(AggregationRule item);
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
    public ClusterRoleFluent.MetadataNested<A> withNewMetadata();
    public ClusterRoleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ClusterRoleFluent.MetadataNested<A> editMetadata();
    public ClusterRoleFluent.MetadataNested<A> editOrNewMetadata();
    public ClusterRoleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToRules(int index,PolicyRule item);
    public A setToRules(int index,PolicyRule item);
    public A addToRules(PolicyRule... items);
    public A addAllToRules(Collection<PolicyRule> items);
    public A removeFromRules(PolicyRule... items);
    public A removeAllFromRules(Collection<PolicyRule> items);
    
/**
 * This method has been deprecated, please use method buildRules instead.
 * @return The buildable object.
 */
@Deprecated public List<PolicyRule> getRules();
    public List<PolicyRule> buildRules();
    public PolicyRule buildRule(int index);
    public PolicyRule buildFirstRule();
    public PolicyRule buildLastRule();
    public PolicyRule buildMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<PolicyRuleBuilder> predicate);
    public A withRules(List<PolicyRule> rules);
    public A withRules(PolicyRule... rules);
    public Boolean hasRules();
    public ClusterRoleFluent.RulesNested<A> addNewRule();
    public ClusterRoleFluent.RulesNested<A> addNewRuleLike(PolicyRule item);
    public ClusterRoleFluent.RulesNested<A> setNewRuleLike(int index,PolicyRule item);
    public ClusterRoleFluent.RulesNested<A> editRule(int index);
    public ClusterRoleFluent.RulesNested<A> editFirstRule();
    public ClusterRoleFluent.RulesNested<A> editLastRule();
    public ClusterRoleFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<PolicyRuleBuilder> predicate);

    public interface AggregationRuleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AggregationRuleFluent<ClusterRoleFluent.AggregationRuleNested<N>>{

        
    public N and();    public N endAggregationRule();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ClusterRoleFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RulesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PolicyRuleFluent<ClusterRoleFluent.RulesNested<N>>{

        
    public N and();    public N endRule();
}


}
