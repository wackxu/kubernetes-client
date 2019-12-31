package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface DeploymentConfigSpecFluent<A extends DeploymentConfigSpecFluent<A>> extends Fluent<A>{


    public Integer getMinReadySeconds();
    public A withMinReadySeconds(Integer minReadySeconds);
    public Boolean hasMinReadySeconds();
    public Boolean isPaused();
    public A withPaused(Boolean paused);
    public Boolean hasPaused();
    public A withNewPaused(String arg1);
    public A withNewPaused(boolean arg1);
    public Integer getReplicas();
    public A withReplicas(Integer replicas);
    public Boolean hasReplicas();
    public Integer getRevisionHistoryLimit();
    public A withRevisionHistoryLimit(Integer revisionHistoryLimit);
    public Boolean hasRevisionHistoryLimit();
    public A addToSelector(String key,String value);
    public A addToSelector(Map<String,String> map);
    public A removeFromSelector(String key);
    public A removeFromSelector(Map<String,String> map);
    public Map<String,String> getSelector();
    public A withSelector(Map<String,String> selector);
    public Boolean hasSelector();
    
/**
 * This method has been deprecated, please use method buildStrategy instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.DeploymentStrategy getStrategy();
    public io.fabric8.openshift.api.model.DeploymentStrategy buildStrategy();
    public A withStrategy(io.fabric8.openshift.api.model.DeploymentStrategy strategy);
    public Boolean hasStrategy();
    public DeploymentConfigSpecFluent.StrategyNested<A> withNewStrategy();
    public DeploymentConfigSpecFluent.StrategyNested<A> withNewStrategyLike(io.fabric8.openshift.api.model.DeploymentStrategy item);
    public DeploymentConfigSpecFluent.StrategyNested<A> editStrategy();
    public DeploymentConfigSpecFluent.StrategyNested<A> editOrNewStrategy();
    public DeploymentConfigSpecFluent.StrategyNested<A> editOrNewStrategyLike(io.fabric8.openshift.api.model.DeploymentStrategy item);
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate();
    public PodTemplateSpec buildTemplate();
    public A withTemplate(PodTemplateSpec template);
    public Boolean hasTemplate();
    public DeploymentConfigSpecFluent.TemplateNested<A> withNewTemplate();
    public DeploymentConfigSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item);
    public DeploymentConfigSpecFluent.TemplateNested<A> editTemplate();
    public DeploymentConfigSpecFluent.TemplateNested<A> editOrNewTemplate();
    public DeploymentConfigSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item);
    public Boolean isTest();
    public A withTest(Boolean test);
    public Boolean hasTest();
    public A withNewTest(String arg1);
    public A withNewTest(boolean arg1);
    public A addToTriggers(int index,DeploymentTriggerPolicy item);
    public A setToTriggers(int index,DeploymentTriggerPolicy item);
    public A addToTriggers(DeploymentTriggerPolicy... items);
    public A addAllToTriggers(Collection<DeploymentTriggerPolicy> items);
    public A removeFromTriggers(DeploymentTriggerPolicy... items);
    public A removeAllFromTriggers(Collection<DeploymentTriggerPolicy> items);
    
/**
 * This method has been deprecated, please use method buildTriggers instead.
 * @return The buildable object.
 */
@Deprecated public List<DeploymentTriggerPolicy> getTriggers();
    public List<DeploymentTriggerPolicy> buildTriggers();
    public DeploymentTriggerPolicy buildTrigger(int index);
    public DeploymentTriggerPolicy buildFirstTrigger();
    public DeploymentTriggerPolicy buildLastTrigger();
    public DeploymentTriggerPolicy buildMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<DeploymentTriggerPolicyBuilder> predicate);
    public A withTriggers(List<DeploymentTriggerPolicy> triggers);
    public A withTriggers(DeploymentTriggerPolicy... triggers);
    public Boolean hasTriggers();
    public DeploymentConfigSpecFluent.TriggersNested<A> addNewTrigger();
    public DeploymentConfigSpecFluent.TriggersNested<A> addNewTriggerLike(DeploymentTriggerPolicy item);
    public DeploymentConfigSpecFluent.TriggersNested<A> setNewTriggerLike(int index,DeploymentTriggerPolicy item);
    public DeploymentConfigSpecFluent.TriggersNested<A> editTrigger(int index);
    public DeploymentConfigSpecFluent.TriggersNested<A> editFirstTrigger();
    public DeploymentConfigSpecFluent.TriggersNested<A> editLastTrigger();
    public DeploymentConfigSpecFluent.TriggersNested<A> editMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<DeploymentTriggerPolicyBuilder> predicate);

    public interface StrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.DeploymentStrategyFluent<DeploymentConfigSpecFluent.StrategyNested<N>>{

        
    public N and();    public N endStrategy();
}
    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<DeploymentConfigSpecFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}
    public interface TriggersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentTriggerPolicyFluent<DeploymentConfigSpecFluent.TriggersNested<N>>{

        
    public N and();    public N endTrigger();
}


}
