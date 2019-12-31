package io.fabric8.openshift.api.model;

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

public interface OpenshiftRoleFluent<A extends OpenshiftRoleFluent<A>> extends Fluent<A>{


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
    public OpenshiftRoleFluent.MetadataNested<A> withNewMetadata();
    public OpenshiftRoleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public OpenshiftRoleFluent.MetadataNested<A> editMetadata();
    public OpenshiftRoleFluent.MetadataNested<A> editOrNewMetadata();
    public OpenshiftRoleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
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
    public OpenshiftRoleFluent.RulesNested<A> addNewRule();
    public OpenshiftRoleFluent.RulesNested<A> addNewRuleLike(io.fabric8.openshift.api.model.PolicyRule item);
    public OpenshiftRoleFluent.RulesNested<A> setNewRuleLike(int index,io.fabric8.openshift.api.model.PolicyRule item);
    public OpenshiftRoleFluent.RulesNested<A> editRule(int index);
    public OpenshiftRoleFluent.RulesNested<A> editFirstRule();
    public OpenshiftRoleFluent.RulesNested<A> editLastRule();
    public OpenshiftRoleFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.PolicyRuleBuilder> predicate);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<OpenshiftRoleFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RulesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.PolicyRuleFluent<OpenshiftRoleFluent.RulesNested<N>>{

        
    public N and();    public N endRule();
}


}
