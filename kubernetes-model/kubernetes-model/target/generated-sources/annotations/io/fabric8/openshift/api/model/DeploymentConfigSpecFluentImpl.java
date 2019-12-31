package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class DeploymentConfigSpecFluentImpl<A extends DeploymentConfigSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentConfigSpecFluent<A>{

    private Integer minReadySeconds;
    private Boolean paused;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private Map<String,String> selector;
    private io.fabric8.openshift.api.model.DeploymentStrategyBuilder strategy;
    private PodTemplateSpecBuilder template;
    private Boolean test;
    private List<DeploymentTriggerPolicyBuilder> triggers;

    public DeploymentConfigSpecFluentImpl(){
    }
    public DeploymentConfigSpecFluentImpl(DeploymentConfigSpec instance){
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withPaused(instance.getPaused()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTemplate(instance.getTemplate()); 
            this.withTest(instance.getTest()); 
            this.withTriggers(instance.getTriggers()); 
    }

    public Integer getMinReadySeconds(){
            return this.minReadySeconds;
    }

    public A withMinReadySeconds(Integer minReadySeconds){
            this.minReadySeconds=minReadySeconds; return (A) this;
    }

    public Boolean hasMinReadySeconds(){
            return this.minReadySeconds != null;
    }

    public Boolean isPaused(){
            return this.paused;
    }

    public A withPaused(Boolean paused){
            this.paused=paused; return (A) this;
    }

    public Boolean hasPaused(){
            return this.paused != null;
    }

    public A withNewPaused(String arg1){
            return (A)withPaused(new Boolean(arg1));
    }

    public A withNewPaused(boolean arg1){
            return (A)withPaused(new Boolean(arg1));
    }

    public Integer getReplicas(){
            return this.replicas;
    }

    public A withReplicas(Integer replicas){
            this.replicas=replicas; return (A) this;
    }

    public Boolean hasReplicas(){
            return this.replicas != null;
    }

    public Integer getRevisionHistoryLimit(){
            return this.revisionHistoryLimit;
    }

    public A withRevisionHistoryLimit(Integer revisionHistoryLimit){
            this.revisionHistoryLimit=revisionHistoryLimit; return (A) this;
    }

    public Boolean hasRevisionHistoryLimit(){
            return this.revisionHistoryLimit != null;
    }

    public A addToSelector(String key,String value){
            if(this.selector == null && key != null && value != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.selector.put(key, value);} return (A)this;
    }

    public A addToSelector(Map<String,String> map){
            if(this.selector == null && map != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(map != null) { this.selector.putAll(map);} return (A)this;
    }

    public A removeFromSelector(String key){
            if(this.selector == null) { return (A) this; }
            if(key != null && this.selector != null) {this.selector.remove(key);} return (A)this;
    }

    public A removeFromSelector(Map<String,String> map){
            if(this.selector == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.selector != null){this.selector.remove(key);}}} return (A)this;
    }

    public Map<String,String> getSelector(){
            return this.selector;
    }

    public A withSelector(Map<String,String> selector){
            if (selector == null) { this.selector =  new LinkedHashMap<String,String>();} else {this.selector = new LinkedHashMap<String,String>(selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    
/**
 * This method has been deprecated, please use method buildStrategy instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.DeploymentStrategy getStrategy(){
            return this.strategy!=null?this.strategy.build():null;
    }

    public io.fabric8.openshift.api.model.DeploymentStrategy buildStrategy(){
            return this.strategy!=null?this.strategy.build():null;
    }

    public A withStrategy(io.fabric8.openshift.api.model.DeploymentStrategy strategy){
            _visitables.remove(this.strategy);
            if (strategy!=null){ this.strategy= new io.fabric8.openshift.api.model.DeploymentStrategyBuilder(strategy); _visitables.add(this.strategy);} return (A) this;
    }

    public Boolean hasStrategy(){
            return this.strategy != null;
    }

    public DeploymentConfigSpecFluent.StrategyNested<A> withNewStrategy(){
            return new StrategyNestedImpl();
    }

    public DeploymentConfigSpecFluent.StrategyNested<A> withNewStrategyLike(io.fabric8.openshift.api.model.DeploymentStrategy item){
            return new StrategyNestedImpl(item);
    }

    public DeploymentConfigSpecFluent.StrategyNested<A> editStrategy(){
            return withNewStrategyLike(getStrategy());
    }

    public DeploymentConfigSpecFluent.StrategyNested<A> editOrNewStrategy(){
            return withNewStrategyLike(getStrategy() != null ? getStrategy(): new io.fabric8.openshift.api.model.DeploymentStrategyBuilder().build());
    }

    public DeploymentConfigSpecFluent.StrategyNested<A> editOrNewStrategyLike(io.fabric8.openshift.api.model.DeploymentStrategy item){
            return withNewStrategyLike(getStrategy() != null ? getStrategy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public PodTemplateSpec buildTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public A withTemplate(PodTemplateSpec template){
            _visitables.remove(this.template);
            if (template!=null){ this.template= new PodTemplateSpecBuilder(template); _visitables.add(this.template);} return (A) this;
    }

    public Boolean hasTemplate(){
            return this.template != null;
    }

    public DeploymentConfigSpecFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public DeploymentConfigSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item){
            return new TemplateNestedImpl(item);
    }

    public DeploymentConfigSpecFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public DeploymentConfigSpecFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new PodTemplateSpecBuilder().build());
    }

    public DeploymentConfigSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public Boolean isTest(){
            return this.test;
    }

    public A withTest(Boolean test){
            this.test=test; return (A) this;
    }

    public Boolean hasTest(){
            return this.test != null;
    }

    public A withNewTest(String arg1){
            return (A)withTest(new Boolean(arg1));
    }

    public A withNewTest(boolean arg1){
            return (A)withTest(new Boolean(arg1));
    }

    public A addToTriggers(int index,DeploymentTriggerPolicy item){
            if (this.triggers == null) {this.triggers = new ArrayList<DeploymentTriggerPolicyBuilder>();}
            DeploymentTriggerPolicyBuilder builder = new DeploymentTriggerPolicyBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.triggers.add(index >= 0 ? index : triggers.size(), builder); return (A)this;
    }

    public A setToTriggers(int index,DeploymentTriggerPolicy item){
            if (this.triggers == null) {this.triggers = new ArrayList<DeploymentTriggerPolicyBuilder>();}
            DeploymentTriggerPolicyBuilder builder = new DeploymentTriggerPolicyBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= triggers.size()) { triggers.add(builder); } else { triggers.set(index, builder);}
             return (A)this;
    }

    public A addToTriggers(DeploymentTriggerPolicy... items){
            if (this.triggers == null) {this.triggers = new ArrayList<DeploymentTriggerPolicyBuilder>();}
            for (DeploymentTriggerPolicy item : items) {DeploymentTriggerPolicyBuilder builder = new DeploymentTriggerPolicyBuilder(item);_visitables.add(builder);this.triggers.add(builder);} return (A)this;
    }

    public A addAllToTriggers(Collection<DeploymentTriggerPolicy> items){
            if (this.triggers == null) {this.triggers = new ArrayList<DeploymentTriggerPolicyBuilder>();}
            for (DeploymentTriggerPolicy item : items) {DeploymentTriggerPolicyBuilder builder = new DeploymentTriggerPolicyBuilder(item);_visitables.add(builder);this.triggers.add(builder);} return (A)this;
    }

    public A removeFromTriggers(DeploymentTriggerPolicy... items){
            for (DeploymentTriggerPolicy item : items) {DeploymentTriggerPolicyBuilder builder = new DeploymentTriggerPolicyBuilder(item);_visitables.remove(builder);if (this.triggers != null) {this.triggers.remove(builder);}} return (A)this;
    }

    public A removeAllFromTriggers(Collection<DeploymentTriggerPolicy> items){
            for (DeploymentTriggerPolicy item : items) {DeploymentTriggerPolicyBuilder builder = new DeploymentTriggerPolicyBuilder(item);_visitables.remove(builder);if (this.triggers != null) {this.triggers.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTriggers instead.
 * @return The buildable object.
 */
@Deprecated public List<DeploymentTriggerPolicy> getTriggers(){
            return build(triggers);
    }

    public List<DeploymentTriggerPolicy> buildTriggers(){
            return build(triggers);
    }

    public DeploymentTriggerPolicy buildTrigger(int index){
            return this.triggers.get(index).build();
    }

    public DeploymentTriggerPolicy buildFirstTrigger(){
            return this.triggers.get(0).build();
    }

    public DeploymentTriggerPolicy buildLastTrigger(){
            return this.triggers.get(triggers.size() - 1).build();
    }

    public DeploymentTriggerPolicy buildMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<DeploymentTriggerPolicyBuilder> predicate){
            for (DeploymentTriggerPolicyBuilder item: triggers) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTriggers(List<DeploymentTriggerPolicy> triggers){
            if (this.triggers != null) { _visitables.removeAll(this.triggers);}
            if (triggers != null) {this.triggers = new ArrayList<DeploymentTriggerPolicyBuilder>(); for (DeploymentTriggerPolicy item : triggers){this.addToTriggers(item);}} else { this.triggers = new ArrayList<DeploymentTriggerPolicyBuilder>();} return (A) this;
    }

    public A withTriggers(DeploymentTriggerPolicy... triggers){
            if (this.triggers != null) {this.triggers.clear();}
            if (triggers != null) {for (DeploymentTriggerPolicy item :triggers){ this.addToTriggers(item);}} return (A) this;
    }

    public Boolean hasTriggers(){
            return triggers != null && !triggers.isEmpty();
    }

    public DeploymentConfigSpecFluent.TriggersNested<A> addNewTrigger(){
            return new TriggersNestedImpl();
    }

    public DeploymentConfigSpecFluent.TriggersNested<A> addNewTriggerLike(DeploymentTriggerPolicy item){
            return new TriggersNestedImpl(-1, item);
    }

    public DeploymentConfigSpecFluent.TriggersNested<A> setNewTriggerLike(int index,DeploymentTriggerPolicy item){
            return new TriggersNestedImpl(index, item);
    }

    public DeploymentConfigSpecFluent.TriggersNested<A> editTrigger(int index){
            if (triggers.size() <= index) throw new RuntimeException("Can't edit triggers. Index exceeds size.");
            return setNewTriggerLike(index, buildTrigger(index));
    }

    public DeploymentConfigSpecFluent.TriggersNested<A> editFirstTrigger(){
            if (triggers.size() == 0) throw new RuntimeException("Can't edit first triggers. The list is empty.");
            return setNewTriggerLike(0, buildTrigger(0));
    }

    public DeploymentConfigSpecFluent.TriggersNested<A> editLastTrigger(){
            int index = triggers.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last triggers. The list is empty.");
            return setNewTriggerLike(index, buildTrigger(index));
    }

    public DeploymentConfigSpecFluent.TriggersNested<A> editMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<DeploymentTriggerPolicyBuilder> predicate){
            int index = -1;
            for (int i=0;i<triggers.size();i++) { 
            if (predicate.apply(triggers.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching triggers. No match found.");
            return setNewTriggerLike(index, buildTrigger(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentConfigSpecFluentImpl that = (DeploymentConfigSpecFluentImpl) o;
            if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
            if (paused != null ? !paused.equals(that.paused) :that.paused != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            if (test != null ? !test.equals(that.test) :that.test != null) return false;
            if (triggers != null ? !triggers.equals(that.triggers) :that.triggers != null) return false;
            return true;
    }


    public class StrategyNestedImpl<N> extends io.fabric8.openshift.api.model.DeploymentStrategyFluentImpl<DeploymentConfigSpecFluent.StrategyNested<N>> implements DeploymentConfigSpecFluent.StrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.DeploymentStrategyBuilder builder;
    
            StrategyNestedImpl(io.fabric8.openshift.api.model.DeploymentStrategy item){
                    this.builder = new io.fabric8.openshift.api.model.DeploymentStrategyBuilder(this, item);
            }
            StrategyNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.DeploymentStrategyBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentConfigSpecFluentImpl.this.withStrategy(builder.build());
    }
    public N endStrategy(){
            return and();
    }

}
    public class TemplateNestedImpl<N> extends PodTemplateSpecFluentImpl<DeploymentConfigSpecFluent.TemplateNested<N>> implements DeploymentConfigSpecFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            TemplateNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentConfigSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}
    public class TriggersNestedImpl<N> extends DeploymentTriggerPolicyFluentImpl<DeploymentConfigSpecFluent.TriggersNested<N>> implements DeploymentConfigSpecFluent.TriggersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentTriggerPolicyBuilder builder;
        private final int index;
    
            TriggersNestedImpl(int index,DeploymentTriggerPolicy item){
                    this.index = index;
                    this.builder = new DeploymentTriggerPolicyBuilder(this, item);
            }
            TriggersNestedImpl(){
                    this.index = -1;
                    this.builder = new DeploymentTriggerPolicyBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentConfigSpecFluentImpl.this.setToTriggers(index, builder.build());
    }
    public N endTrigger(){
            return and();
    }

}


}
