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

public interface PodAffinityFluent<A extends PodAffinityFluent<A>> extends Fluent<A>{


    public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,WeightedPodAffinityTerm item);
    public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,WeightedPodAffinityTerm item);
    public A addToPreferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm... items);
    public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<WeightedPodAffinityTerm> items);
    public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm... items);
    public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<WeightedPodAffinityTerm> items);
    
/**
 * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution();
    public List<WeightedPodAffinityTerm> buildPreferredDuringSchedulingIgnoredDuringExecution();
    public WeightedPodAffinityTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public WeightedPodAffinityTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public WeightedPodAffinityTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution();
    public WeightedPodAffinityTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<WeightedPodAffinityTermBuilder> predicate);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution);
    public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(WeightedPodAffinityTerm item);
    public PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,WeightedPodAffinityTerm item);
    public PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<WeightedPodAffinityTermBuilder> predicate);
    public A addToRequiredDuringSchedulingIgnoredDuringExecution(int index,PodAffinityTerm item);
    public A setToRequiredDuringSchedulingIgnoredDuringExecution(int index,PodAffinityTerm item);
    public A addToRequiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm... items);
    public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(Collection<PodAffinityTerm> items);
    public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm... items);
    public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(Collection<PodAffinityTerm> items);
    
/**
 * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
 * @return The buildable object.
 */
@Deprecated public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution();
    public List<PodAffinityTerm> buildRequiredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityTerm buildRequiredDuringSchedulingIgnoredDuringExecution(int index);
    public PodAffinityTerm buildFirstRequiredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityTerm buildLastRequiredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityTerm buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PodAffinityTermBuilder> predicate);
    public A withRequiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution);
    public A withRequiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution);
    public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(PodAffinityTerm item);
    public PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(int index,PodAffinityTerm item);
    public PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(int index);
    public PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution();
    public PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(io.fabric8.kubernetes.api.builder.Predicate<PodAffinityTermBuilder> predicate);

    public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WeightedPodAffinityTermFluent<PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>>{

        
    public N and();    public N endPreferredDuringSchedulingIgnoredDuringExecution();
}
    public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodAffinityTermFluent<PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>>{

        
    public N and();    public N endRequiredDuringSchedulingIgnoredDuringExecution();
}


}
