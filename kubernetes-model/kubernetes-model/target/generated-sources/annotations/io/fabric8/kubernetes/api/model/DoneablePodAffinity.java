package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodAffinity extends PodAffinityFluentImpl<DoneablePodAffinity> implements Doneable<PodAffinity>{

    private final PodAffinityBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodAffinity,PodAffinity> function;

    public DoneablePodAffinity(io.fabric8.kubernetes.api.builder.Function<PodAffinity,PodAffinity> function){
            super();this.builder=new PodAffinityBuilder(this);this.function=function;
    }
    public DoneablePodAffinity(PodAffinity item,io.fabric8.kubernetes.api.builder.Function<PodAffinity,PodAffinity> function){
            super(item);this.builder=new PodAffinityBuilder(this, item);this.function=function;
    }
    public DoneablePodAffinity(PodAffinity item){
            super(item);this.builder=new PodAffinityBuilder(this, item);this.function=new Function<PodAffinity, PodAffinity>() {
    public PodAffinity apply(PodAffinity item) {
        return item;
    }
}
;
    }

    public PodAffinity done(){
             return function.apply(builder.build());
    }




}
