package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.String;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import java.lang.Long;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluent;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.lang.Boolean;
import java.util.Map;

public interface JobSpecFluent<A extends JobSpecFluent<A>> extends Fluent<A>{


    public Long getActiveDeadlineSeconds();
    public A withActiveDeadlineSeconds(Long activeDeadlineSeconds);
    public Boolean hasActiveDeadlineSeconds();
    public A withNewActiveDeadlineSeconds(String arg1);
    public A withNewActiveDeadlineSeconds(long arg1);
    public Integer getBackoffLimit();
    public A withBackoffLimit(Integer backoffLimit);
    public Boolean hasBackoffLimit();
    public Integer getCompletions();
    public A withCompletions(Integer completions);
    public Boolean hasCompletions();
    public Boolean isManualSelector();
    public A withManualSelector(Boolean manualSelector);
    public Boolean hasManualSelector();
    public A withNewManualSelector(String arg1);
    public A withNewManualSelector(boolean arg1);
    public Integer getParallelism();
    public A withParallelism(Integer parallelism);
    public Boolean hasParallelism();
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public JobSpecFluent.SelectorNested<A> withNewSelector();
    public JobSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public JobSpecFluent.SelectorNested<A> editSelector();
    public JobSpecFluent.SelectorNested<A> editOrNewSelector();
    public JobSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate();
    public PodTemplateSpec buildTemplate();
    public A withTemplate(PodTemplateSpec template);
    public Boolean hasTemplate();
    public JobSpecFluent.TemplateNested<A> withNewTemplate();
    public JobSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item);
    public JobSpecFluent.TemplateNested<A> editTemplate();
    public JobSpecFluent.TemplateNested<A> editOrNewTemplate();
    public JobSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item);
    public Integer getTtlSecondsAfterFinished();
    public A withTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished);
    public Boolean hasTtlSecondsAfterFinished();

    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<JobSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<JobSpecFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}


}
