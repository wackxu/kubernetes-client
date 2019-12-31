package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.rbac.AggregationRule;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleFluent;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.rbac.AggregationRuleBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface OpenshiftClusterRoleFluent<A extends OpenshiftClusterRoleFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildAggregationRule instead.
 * @return The buildable object.
 */
@Deprecated public AggregationRule getAggregationRule();
    public AggregationRule buildAggregationRule();
    public A withAggregationRule(AggregationRule aggregationRule);
    public Boolean hasAggregationRule();
    public OpenshiftClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRule();
    public OpenshiftClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRuleLike(AggregationRule item);
    public OpenshiftClusterRoleFluent.AggregationRuleNested<A> editAggregationRule();
    public OpenshiftClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRule();
    public OpenshiftClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(AggregationRule item);
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
    public OpenshiftClusterRoleFluent.MetadataNested<A> withNewMetadata();
    public OpenshiftClusterRoleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public OpenshiftClusterRoleFluent.MetadataNested<A> editMetadata();
    public OpenshiftClusterRoleFluent.MetadataNested<A> editOrNewMetadata();
    public OpenshiftClusterRoleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToRules(int index,io.fabric8.openshift.api.model.PolicyRule item);
    public A setToRules(int index,io.fabric8.openshift.api.model.PolicyRule item);
    public A addToRules(io.fabric8.openshift.api.model.PolicyRule... items);
    public A addAllToRules(Collection<io.fabric8.openshift.api.model.PolicyRule> items);
    public A removeFromRules(io.fabric8.openshift.api.model.PolicyRule... items);
    public A removeAllFromRules(Collection<io.fabric8.openshift.api.model.PolicyRule> items);
    
/**
 * This method has been deprecated, please use method buildRules instead.
 * @return The buildable object.
 */
@Deprecated public List<io.fabric8.openshift.api.model.PolicyRule> getRules();
    public List<io.fabric8.openshift.api.model.PolicyRule> buildRules();
    public io.fabric8.openshift.api.model.PolicyRule buildRule(int index);
    public io.fabric8.openshift.api.model.PolicyRule buildFirstRule();
    public io.fabric8.openshift.api.model.PolicyRule buildLastRule();
    public io.fabric8.openshift.api.model.PolicyRule buildMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.PolicyRuleBuilder> predicate);
    public A withRules(List<io.fabric8.openshift.api.model.PolicyRule> rules);
    public A withRules(io.fabric8.openshift.api.model.PolicyRule... rules);
    public Boolean hasRules();
    public OpenshiftClusterRoleFluent.RulesNested<A> addNewRule();
    public OpenshiftClusterRoleFluent.RulesNested<A> addNewRuleLike(io.fabric8.openshift.api.model.PolicyRule item);
    public OpenshiftClusterRoleFluent.RulesNested<A> setNewRuleLike(int index,io.fabric8.openshift.api.model.PolicyRule item);
    public OpenshiftClusterRoleFluent.RulesNested<A> editRule(int index);
    public OpenshiftClusterRoleFluent.RulesNested<A> editFirstRule();
    public OpenshiftClusterRoleFluent.RulesNested<A> editLastRule();
    public OpenshiftClusterRoleFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.PolicyRuleBuilder> predicate);

    public interface AggregationRuleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AggregationRuleFluent<OpenshiftClusterRoleFluent.AggregationRuleNested<N>>{

        
    public N and();    public N endAggregationRule();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<OpenshiftClusterRoleFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RulesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.PolicyRuleFluent<OpenshiftClusterRoleFluent.RulesNested<N>>{

        
    public N and();    public N endRule();
}


}
