package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface NodeAffinityFluent<A extends NodeAffinityFluent<A>> extends Fluent<A>{


    public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredSchedulingTerm item);
    public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredSchedulingTerm item);
    public A addToPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm... items);
    public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredSchedulingTerm> items);
    public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm... items);
    public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredSchedulingTerm> items);
    
/**
 * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution();
    public List<PreferredSchedulingTerm> buildPreferredDuringSchedulingIgnoredDuringExecution();
    public PreferredSchedulingTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public PreferredSchedulingTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public PreferredSchedulingTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution();
    public PreferredSchedulingTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PreferredSchedulingTermBuilder> predicate);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm... preferredDuringSchedulingIgnoredDuringExecution);
    public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(PreferredSchedulingTerm item);
    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,PreferredSchedulingTerm item);
    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PreferredSchedulingTermBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution();
    public NodeSelector buildRequiredDuringSchedulingIgnoredDuringExecution();
    public A withRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector requiredDuringSchedulingIgnoredDuringExecution);
    public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(NodeSelector item);
    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecution();
    public NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(NodeSelector item);

    public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PreferredSchedulingTermFluent<NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>>{

        
    public N and();    public N endPreferredDuringSchedulingIgnoredDuringExecution();
}
    public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorFluent<NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>>{

        
    public N and();    public N endRequiredDuringSchedulingIgnoredDuringExecution();
}


}
