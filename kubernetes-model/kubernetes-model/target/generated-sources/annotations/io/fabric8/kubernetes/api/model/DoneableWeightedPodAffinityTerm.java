package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableWeightedPodAffinityTerm extends WeightedPodAffinityTermFluentImpl<DoneableWeightedPodAffinityTerm> implements Doneable<WeightedPodAffinityTerm>{

    private final WeightedPodAffinityTermBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<WeightedPodAffinityTerm,WeightedPodAffinityTerm> function;

    public DoneableWeightedPodAffinityTerm(io.fabric8.kubernetes.api.builder.Function<WeightedPodAffinityTerm,WeightedPodAffinityTerm> function){
            super();this.builder=new WeightedPodAffinityTermBuilder(this);this.function=function;
    }
    public DoneableWeightedPodAffinityTerm(WeightedPodAffinityTerm item,io.fabric8.kubernetes.api.builder.Function<WeightedPodAffinityTerm,WeightedPodAffinityTerm> function){
            super(item);this.builder=new WeightedPodAffinityTermBuilder(this, item);this.function=function;
    }
    public DoneableWeightedPodAffinityTerm(WeightedPodAffinityTerm item){
            super(item);this.builder=new WeightedPodAffinityTermBuilder(this, item);this.function=new Function<WeightedPodAffinityTerm, WeightedPodAffinityTerm>() {
    public WeightedPodAffinityTerm apply(WeightedPodAffinityTerm item) {
        return item;
    }
}
;
    }

    public WeightedPodAffinityTerm done(){
             return function.apply(builder.build());
    }




}
