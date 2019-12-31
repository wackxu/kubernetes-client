package io.fabric8.kubernetes.api.model.apps;

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
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluent;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.lang.Boolean;
import java.util.Map;

public interface DaemonSetSpecFluent<A extends DaemonSetSpecFluent<A>> extends Fluent<A>{


    public Integer getMinReadySeconds();
    public A withMinReadySeconds(Integer minReadySeconds);
    public Boolean hasMinReadySeconds();
    public Integer getRevisionHistoryLimit();
    public A withRevisionHistoryLimit(Integer revisionHistoryLimit);
    public Boolean hasRevisionHistoryLimit();
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public DaemonSetSpecFluent.SelectorNested<A> withNewSelector();
    public DaemonSetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public DaemonSetSpecFluent.SelectorNested<A> editSelector();
    public DaemonSetSpecFluent.SelectorNested<A> editOrNewSelector();
    public DaemonSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate();
    public PodTemplateSpec buildTemplate();
    public A withTemplate(PodTemplateSpec template);
    public Boolean hasTemplate();
    public DaemonSetSpecFluent.TemplateNested<A> withNewTemplate();
    public DaemonSetSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item);
    public DaemonSetSpecFluent.TemplateNested<A> editTemplate();
    public DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplate();
    public DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item);
    
/**
 * This method has been deprecated, please use method buildUpdateStrategy instead.
 * @return The buildable object.
 */
@Deprecated public DaemonSetUpdateStrategy getUpdateStrategy();
    public DaemonSetUpdateStrategy buildUpdateStrategy();
    public A withUpdateStrategy(DaemonSetUpdateStrategy updateStrategy);
    public Boolean hasUpdateStrategy();
    public DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy();
    public DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(DaemonSetUpdateStrategy item);
    public DaemonSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy();
    public DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy();
    public DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(DaemonSetUpdateStrategy item);

    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<DaemonSetSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<DaemonSetSpecFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}
    public interface UpdateStrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetUpdateStrategyFluent<DaemonSetSpecFluent.UpdateStrategyNested<N>>{

        
    public N and();    public N endUpdateStrategy();
}


}
