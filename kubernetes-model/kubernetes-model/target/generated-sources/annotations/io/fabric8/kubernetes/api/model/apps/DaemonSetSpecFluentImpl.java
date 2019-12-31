package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluentImpl;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
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

public class DaemonSetSpecFluentImpl<A extends DaemonSetSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DaemonSetSpecFluent<A>{

    private Integer minReadySeconds;
    private Integer revisionHistoryLimit;
    private LabelSelectorBuilder selector;
    private PodTemplateSpecBuilder template;
    private DaemonSetUpdateStrategyBuilder updateStrategy;

    public DaemonSetSpecFluentImpl(){
    }
    public DaemonSetSpecFluentImpl(DaemonSetSpec instance){
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.withUpdateStrategy(instance.getUpdateStrategy()); 
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

    public DaemonSetSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public DaemonSetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public DaemonSetSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public DaemonSetSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public DaemonSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
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

    public DaemonSetSpecFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public DaemonSetSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item){
            return new TemplateNestedImpl(item);
    }

    public DaemonSetSpecFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new PodTemplateSpecBuilder().build());
    }

    public DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    
/**
 * This method has been deprecated, please use method buildUpdateStrategy instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSetUpdateStrategy getUpdateStrategy(){
            return this.updateStrategy!=null?this.updateStrategy.build():null;
    }

    public DaemonSetUpdateStrategy buildUpdateStrategy(){
            return this.updateStrategy!=null?this.updateStrategy.build():null;
    }

    public A withUpdateStrategy(DaemonSetUpdateStrategy updateStrategy){
            _visitables.remove(this.updateStrategy);
            if (updateStrategy!=null){ this.updateStrategy= new DaemonSetUpdateStrategyBuilder(updateStrategy); _visitables.add(this.updateStrategy);} return (A) this;
    }

    public Boolean hasUpdateStrategy(){
            return this.updateStrategy != null;
    }

    public DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy(){
            return new UpdateStrategyNestedImpl();
    }

    public DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(DaemonSetUpdateStrategy item){
            return new UpdateStrategyNestedImpl(item);
    }

    public DaemonSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy(){
            return withNewUpdateStrategyLike(getUpdateStrategy());
    }

    public DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy(){
            return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): new DaemonSetUpdateStrategyBuilder().build());
    }

    public DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(DaemonSetUpdateStrategy item){
            return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetSpecFluentImpl that = (DaemonSetSpecFluentImpl) o;
            if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
            if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            if (updateStrategy != null ? !updateStrategy.equals(that.updateStrategy) :that.updateStrategy != null) return false;
            return true;
    }


    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<DaemonSetSpecFluent.SelectorNested<N>> implements DaemonSetSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) DaemonSetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class TemplateNestedImpl<N> extends PodTemplateSpecFluentImpl<DaemonSetSpecFluent.TemplateNested<N>> implements DaemonSetSpecFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            TemplateNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) DaemonSetSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}
    public class UpdateStrategyNestedImpl<N> extends DaemonSetUpdateStrategyFluentImpl<DaemonSetSpecFluent.UpdateStrategyNested<N>> implements DaemonSetSpecFluent.UpdateStrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetUpdateStrategyBuilder builder;
    
            UpdateStrategyNestedImpl(DaemonSetUpdateStrategy item){
                    this.builder = new DaemonSetUpdateStrategyBuilder(this, item);
            }
            UpdateStrategyNestedImpl(){
                    this.builder = new DaemonSetUpdateStrategyBuilder(this);
            }
    
    public N and(){
            return (N) DaemonSetSpecFluentImpl.this.withUpdateStrategy(builder.build());
    }
    public N endUpdateStrategy(){
            return and();
    }

}


}
