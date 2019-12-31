package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodAffinityTerm extends PodAffinityTermFluentImpl<DoneablePodAffinityTerm> implements Doneable<PodAffinityTerm>{

    private final PodAffinityTermBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodAffinityTerm,PodAffinityTerm> function;

    public DoneablePodAffinityTerm(io.fabric8.kubernetes.api.builder.Function<PodAffinityTerm,PodAffinityTerm> function){
            super();this.builder=new PodAffinityTermBuilder(this);this.function=function;
    }
    public DoneablePodAffinityTerm(PodAffinityTerm item,io.fabric8.kubernetes.api.builder.Function<PodAffinityTerm,PodAffinityTerm> function){
            super(item);this.builder=new PodAffinityTermBuilder(this, item);this.function=function;
    }
    public DoneablePodAffinityTerm(PodAffinityTerm item){
            super(item);this.builder=new PodAffinityTermBuilder(this, item);this.function=new Function<PodAffinityTerm, PodAffinityTerm>() {
    public PodAffinityTerm apply(PodAffinityTerm item) {
        return item;
    }
}
;
    }

    public PodAffinityTerm done(){
             return function.apply(builder.build());
    }




}
