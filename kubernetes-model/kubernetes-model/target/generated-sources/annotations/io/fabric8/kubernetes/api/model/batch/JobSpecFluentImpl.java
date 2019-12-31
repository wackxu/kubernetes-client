package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluentImpl;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.String;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class JobSpecFluentImpl<A extends JobSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JobSpecFluent<A>{

    private Long activeDeadlineSeconds;
    private Integer backoffLimit;
    private Integer completions;
    private Boolean manualSelector;
    private Integer parallelism;
    private LabelSelectorBuilder selector;
    private PodTemplateSpecBuilder template;
    private Integer ttlSecondsAfterFinished;

    public JobSpecFluentImpl(){
    }
    public JobSpecFluentImpl(JobSpec instance){
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withBackoffLimit(instance.getBackoffLimit()); 
            this.withCompletions(instance.getCompletions()); 
            this.withManualSelector(instance.getManualSelector()); 
            this.withParallelism(instance.getParallelism()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished()); 
    }

    public Long getActiveDeadlineSeconds(){
            return this.activeDeadlineSeconds;
    }

    public A withActiveDeadlineSeconds(Long activeDeadlineSeconds){
            this.activeDeadlineSeconds=activeDeadlineSeconds; return (A) this;
    }

    public Boolean hasActiveDeadlineSeconds(){
            return this.activeDeadlineSeconds != null;
    }

    public A withNewActiveDeadlineSeconds(String arg1){
            return (A)withActiveDeadlineSeconds(new Long(arg1));
    }

    public A withNewActiveDeadlineSeconds(long arg1){
            return (A)withActiveDeadlineSeconds(new Long(arg1));
    }

    public Integer getBackoffLimit(){
            return this.backoffLimit;
    }

    public A withBackoffLimit(Integer backoffLimit){
            this.backoffLimit=backoffLimit; return (A) this;
    }

    public Boolean hasBackoffLimit(){
            return this.backoffLimit != null;
    }

    public Integer getCompletions(){
            return this.completions;
    }

    public A withCompletions(Integer completions){
            this.completions=completions; return (A) this;
    }

    public Boolean hasCompletions(){
            return this.completions != null;
    }

    public Boolean isManualSelector(){
            return this.manualSelector;
    }

    public A withManualSelector(Boolean manualSelector){
            this.manualSelector=manualSelector; return (A) this;
    }

    public Boolean hasManualSelector(){
            return this.manualSelector != null;
    }

    public A withNewManualSelector(String arg1){
            return (A)withManualSelector(new Boolean(arg1));
    }

    public A withNewManualSelector(boolean arg1){
            return (A)withManualSelector(new Boolean(arg1));
    }

    public Integer getParallelism(){
            return this.parallelism;
    }

    public A withParallelism(Integer parallelism){
            this.parallelism=parallelism; return (A) this;
    }

    public Boolean hasParallelism(){
            return this.parallelism != null;
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

    public JobSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public JobSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public JobSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public JobSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public JobSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
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

    public JobSpecFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public JobSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item){
            return new TemplateNestedImpl(item);
    }

    public JobSpecFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public JobSpecFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new PodTemplateSpecBuilder().build());
    }

    public JobSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public Integer getTtlSecondsAfterFinished(){
            return this.ttlSecondsAfterFinished;
    }

    public A withTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished){
            this.ttlSecondsAfterFinished=ttlSecondsAfterFinished; return (A) this;
    }

    public Boolean hasTtlSecondsAfterFinished(){
            return this.ttlSecondsAfterFinished != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobSpecFluentImpl that = (JobSpecFluentImpl) o;
            if (activeDeadlineSeconds != null ? !activeDeadlineSeconds.equals(that.activeDeadlineSeconds) :that.activeDeadlineSeconds != null) return false;
            if (backoffLimit != null ? !backoffLimit.equals(that.backoffLimit) :that.backoffLimit != null) return false;
            if (completions != null ? !completions.equals(that.completions) :that.completions != null) return false;
            if (manualSelector != null ? !manualSelector.equals(that.manualSelector) :that.manualSelector != null) return false;
            if (parallelism != null ? !parallelism.equals(that.parallelism) :that.parallelism != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            if (ttlSecondsAfterFinished != null ? !ttlSecondsAfterFinished.equals(that.ttlSecondsAfterFinished) :that.ttlSecondsAfterFinished != null) return false;
            return true;
    }


    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<JobSpecFluent.SelectorNested<N>> implements JobSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) JobSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class TemplateNestedImpl<N> extends PodTemplateSpecFluentImpl<JobSpecFluent.TemplateNested<N>> implements JobSpecFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            TemplateNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) JobSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}


}
