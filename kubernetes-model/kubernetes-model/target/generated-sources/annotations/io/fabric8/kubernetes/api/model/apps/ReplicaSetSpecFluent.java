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

public interface ReplicaSetSpecFluent<A extends ReplicaSetSpecFluent<A>> extends Fluent<A>{


    public Integer getMinReadySeconds();
    public A withMinReadySeconds(Integer minReadySeconds);
    public Boolean hasMinReadySeconds();
    public Integer getReplicas();
    public A withReplicas(Integer replicas);
    public Boolean hasReplicas();
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public ReplicaSetSpecFluent.SelectorNested<A> withNewSelector();
    public ReplicaSetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public ReplicaSetSpecFluent.SelectorNested<A> editSelector();
    public ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelector();
    public ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate();
    public PodTemplateSpec buildTemplate();
    public A withTemplate(PodTemplateSpec template);
    public Boolean hasTemplate();
    public ReplicaSetSpecFluent.TemplateNested<A> withNewTemplate();
    public ReplicaSetSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item);
    public ReplicaSetSpecFluent.TemplateNested<A> editTemplate();
    public ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplate();
    public ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item);

    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<ReplicaSetSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<ReplicaSetSpecFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}


}
