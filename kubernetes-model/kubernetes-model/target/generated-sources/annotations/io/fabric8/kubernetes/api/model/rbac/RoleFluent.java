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

public interface RoleFluent<A extends RoleFluent<A>> extends Fluent<A>{


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
    public RoleFluent.MetadataNested<A> withNewMetadata();
    public RoleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public RoleFluent.MetadataNested<A> editMetadata();
    public RoleFluent.MetadataNested<A> editOrNewMetadata();
    public RoleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
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
    public RoleFluent.RulesNested<A> addNewRule();
    public RoleFluent.RulesNested<A> addNewRuleLike(PolicyRule item);
    public RoleFluent.RulesNested<A> setNewRuleLike(int index,PolicyRule item);
    public RoleFluent.RulesNested<A> editRule(int index);
    public RoleFluent.RulesNested<A> editFirstRule();
    public RoleFluent.RulesNested<A> editLastRule();
    public RoleFluent.RulesNested<A> editMatchingRule(io.fabric8.kubernetes.api.builder.Predicate<PolicyRuleBuilder> predicate);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<RoleFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RulesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PolicyRuleFluent<RoleFluent.RulesNested<N>>{

        
    public N and();    public N endRule();
}


}
