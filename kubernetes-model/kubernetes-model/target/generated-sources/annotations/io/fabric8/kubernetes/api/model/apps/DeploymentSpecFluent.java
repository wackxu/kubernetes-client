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

public interface DeploymentSpecFluent<A extends DeploymentSpecFluent<A>> extends Fluent<A>{


    public Integer getMinReadySeconds();
    public A withMinReadySeconds(Integer minReadySeconds);
    public Boolean hasMinReadySeconds();
    public Boolean isPaused();
    public A withPaused(Boolean paused);
    public Boolean hasPaused();
    public A withNewPaused(String arg1);
    public A withNewPaused(boolean arg1);
    public Integer getProgressDeadlineSeconds();
    public A withProgressDeadlineSeconds(Integer progressDeadlineSeconds);
    public Boolean hasProgressDeadlineSeconds();
    public Integer getReplicas();
    public A withReplicas(Integer replicas);
    public Boolean hasReplicas();
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
    public DeploymentSpecFluent.SelectorNested<A> withNewSelector();
    public DeploymentSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public DeploymentSpecFluent.SelectorNested<A> editSelector();
    public DeploymentSpecFluent.SelectorNested<A> editOrNewSelector();
    public DeploymentSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildStrategy instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentStrategy getStrategy();
    public DeploymentStrategy buildStrategy();
    public A withStrategy(DeploymentStrategy strategy);
    public Boolean hasStrategy();
    public DeploymentSpecFluent.StrategyNested<A> withNewStrategy();
    public DeploymentSpecFluent.StrategyNested<A> withNewStrategyLike(DeploymentStrategy item);
    public DeploymentSpecFluent.StrategyNested<A> editStrategy();
    public DeploymentSpecFluent.StrategyNested<A> editOrNewStrategy();
    public DeploymentSpecFluent.StrategyNested<A> editOrNewStrategyLike(DeploymentStrategy item);
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate();
    public PodTemplateSpec buildTemplate();
    public A withTemplate(PodTemplateSpec template);
    public Boolean hasTemplate();
    public DeploymentSpecFluent.TemplateNested<A> withNewTemplate();
    public DeploymentSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item);
    public DeploymentSpecFluent.TemplateNested<A> editTemplate();
    public DeploymentSpecFluent.TemplateNested<A> editOrNewTemplate();
    public DeploymentSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item);

    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<DeploymentSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface StrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentStrategyFluent<DeploymentSpecFluent.StrategyNested<N>>{

        
    public N and();    public N endStrategy();
}
    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<DeploymentSpecFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}


}
