package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluentImpl;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.Integer;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import java.lang.Object;

public class DeploymentSpecFluentImpl<A extends DeploymentSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentSpecFluent<A>{

    private Integer minReadySeconds;
    private Boolean paused;
    private Integer progressDeadlineSeconds;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private LabelSelectorBuilder selector;
    private DeploymentStrategyBuilder strategy;
    private PodTemplateSpecBuilder template;

    public DeploymentSpecFluentImpl(){
    }
    public DeploymentSpecFluentImpl(DeploymentSpec instance){
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withPaused(instance.getPaused()); 
            this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTemplate(instance.getTemplate()); 
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

    public Integer getProgressDeadlineSeconds(){
            return this.progressDeadlineSeconds;
    }

    public A withProgressDeadlineSeconds(Integer progressDeadlineSeconds){
            this.progressDeadlineSeconds=progressDeadlineSeconds; return (A) this;
    }

    public Boolean hasProgressDeadlineSeconds(){
            return this.progressDeadlineSeconds != null;
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

    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public LabelSelector buildSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public A withSelector(LabelSelector selector){
            _visitables.remove(this.selector);
            if (selector!=null){ this.selector= new LabelSelectorBuilder(selector); _visitables.add(this.selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    public DeploymentSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public DeploymentSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public DeploymentSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public DeploymentSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public DeploymentSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStrategy instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentStrategy getStrategy(){
            return this.strategy!=null?this.strategy.build():null;
    }

    public DeploymentStrategy buildStrategy(){
            return this.strategy!=null?this.strategy.build():null;
    }

    public A withStrategy(DeploymentStrategy strategy){
            _visitables.remove(this.strategy);
            if (strategy!=null){ this.strategy= new DeploymentStrategyBuilder(strategy); _visitables.add(this.strategy);} return (A) this;
    }

    public Boolean hasStrategy(){
            return this.strategy != null;
    }

    public DeploymentSpecFluent.StrategyNested<A> withNewStrategy(){
            return new StrategyNestedImpl();
    }

    public DeploymentSpecFluent.StrategyNested<A> withNewStrategyLike(DeploymentStrategy item){
            return new StrategyNestedImpl(item);
    }

    public DeploymentSpecFluent.StrategyNested<A> editStrategy(){
            return withNewStrategyLike(getStrategy());
    }

    public DeploymentSpecFluent.StrategyNested<A> editOrNewStrategy(){
            return withNewStrategyLike(getStrategy() != null ? getStrategy(): new DeploymentStrategyBuilder().build());
    }

    public DeploymentSpecFluent.StrategyNested<A> editOrNewStrategyLike(DeploymentStrategy item){
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

    public DeploymentSpecFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public DeploymentSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item){
            return new TemplateNestedImpl(item);
    }

    public DeploymentSpecFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public DeploymentSpecFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new PodTemplateSpecBuilder().build());
    }

    public DeploymentSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentSpecFluentImpl that = (DeploymentSpecFluentImpl) o;
            if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
            if (paused != null ? !paused.equals(that.paused) :that.paused != null) return false;
            if (progressDeadlineSeconds != null ? !progressDeadlineSeconds.equals(that.progressDeadlineSeconds) :that.progressDeadlineSeconds != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            return true;
    }


    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<DeploymentSpecFluent.SelectorNested<N>> implements DeploymentSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class StrategyNestedImpl<N> extends DeploymentStrategyFluentImpl<DeploymentSpecFluent.StrategyNested<N>> implements DeploymentSpecFluent.StrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentStrategyBuilder builder;
    
            StrategyNestedImpl(DeploymentStrategy item){
                    this.builder = new DeploymentStrategyBuilder(this, item);
            }
            StrategyNestedImpl(){
                    this.builder = new DeploymentStrategyBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentSpecFluentImpl.this.withStrategy(builder.build());
    }
    public N endStrategy(){
            return and();
    }

}
    public class TemplateNestedImpl<N> extends PodTemplateSpecFluentImpl<DeploymentSpecFluent.TemplateNested<N>> implements DeploymentSpecFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            TemplateNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}


}
