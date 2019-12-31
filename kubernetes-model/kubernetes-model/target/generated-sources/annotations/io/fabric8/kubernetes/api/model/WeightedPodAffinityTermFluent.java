package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface WeightedPodAffinityTermFluent<A extends WeightedPodAffinityTermFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildPodAffinityTerm instead.
 * @return The buildable object.
 */
@Deprecated public PodAffinityTerm getPodAffinityTerm();
    public PodAffinityTerm buildPodAffinityTerm();
    public A withPodAffinityTerm(PodAffinityTerm podAffinityTerm);
    public Boolean hasPodAffinityTerm();
    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTerm();
    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTermLike(PodAffinityTerm item);
    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editPodAffinityTerm();
    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTerm();
    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTermLike(PodAffinityTerm item);
    public Integer getWeight();
    public A withWeight(Integer weight);
    public Boolean hasWeight();

    public interface PodAffinityTermNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodAffinityTermFluent<WeightedPodAffinityTermFluent.PodAffinityTermNested<N>>{

        
    public N and();    public N endPodAffinityTerm();
}


}
