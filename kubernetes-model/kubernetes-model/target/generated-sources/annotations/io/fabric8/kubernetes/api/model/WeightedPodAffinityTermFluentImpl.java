package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class WeightedPodAffinityTermFluentImpl<A extends WeightedPodAffinityTermFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements WeightedPodAffinityTermFluent<A>{

    private PodAffinityTermBuilder podAffinityTerm;
    private Integer weight;

    public WeightedPodAffinityTermFluentImpl(){
    }
    public WeightedPodAffinityTermFluentImpl(WeightedPodAffinityTerm instance){
            this.withPodAffinityTerm(instance.getPodAffinityTerm()); 
            this.withWeight(instance.getWeight()); 
    }

    
/**
 * This method has been deprecated, please use method buildPodAffinityTerm instead.
 * @return The buildable object.
 */
@Deprecated public PodAffinityTerm getPodAffinityTerm(){
            return this.podAffinityTerm!=null?this.podAffinityTerm.build():null;
    }

    public PodAffinityTerm buildPodAffinityTerm(){
            return this.podAffinityTerm!=null?this.podAffinityTerm.build():null;
    }

    public A withPodAffinityTerm(PodAffinityTerm podAffinityTerm){
            _visitables.remove(this.podAffinityTerm);
            if (podAffinityTerm!=null){ this.podAffinityTerm= new PodAffinityTermBuilder(podAffinityTerm); _visitables.add(this.podAffinityTerm);} return (A) this;
    }

    public Boolean hasPodAffinityTerm(){
            return this.podAffinityTerm != null;
    }

    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTerm(){
            return new PodAffinityTermNestedImpl();
    }

    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTermLike(PodAffinityTerm item){
            return new PodAffinityTermNestedImpl(item);
    }

    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editPodAffinityTerm(){
            return withNewPodAffinityTermLike(getPodAffinityTerm());
    }

    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTerm(){
            return withNewPodAffinityTermLike(getPodAffinityTerm() != null ? getPodAffinityTerm(): new PodAffinityTermBuilder().build());
    }

    public WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTermLike(PodAffinityTerm item){
            return withNewPodAffinityTermLike(getPodAffinityTerm() != null ? getPodAffinityTerm(): item);
    }

    public Integer getWeight(){
            return this.weight;
    }

    public A withWeight(Integer weight){
            this.weight=weight; return (A) this;
    }

    public Boolean hasWeight(){
            return this.weight != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WeightedPodAffinityTermFluentImpl that = (WeightedPodAffinityTermFluentImpl) o;
            if (podAffinityTerm != null ? !podAffinityTerm.equals(that.podAffinityTerm) :that.podAffinityTerm != null) return false;
            if (weight != null ? !weight.equals(that.weight) :that.weight != null) return false;
            return true;
    }


    public class PodAffinityTermNestedImpl<N> extends PodAffinityTermFluentImpl<WeightedPodAffinityTermFluent.PodAffinityTermNested<N>> implements WeightedPodAffinityTermFluent.PodAffinityTermNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodAffinityTermBuilder builder;
    
            PodAffinityTermNestedImpl(PodAffinityTerm item){
                    this.builder = new PodAffinityTermBuilder(this, item);
            }
            PodAffinityTermNestedImpl(){
                    this.builder = new PodAffinityTermBuilder(this);
            }
    
    public N and(){
            return (N) WeightedPodAffinityTermFluentImpl.this.withPodAffinityTerm(builder.build());
    }
    public N endPodAffinityTerm(){
            return and();
    }

}


}
