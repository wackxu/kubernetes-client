package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodAntiAffinity extends PodAntiAffinityFluentImpl<DoneablePodAntiAffinity> implements Doneable<PodAntiAffinity>{

    private final PodAntiAffinityBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodAntiAffinity,PodAntiAffinity> function;

    public DoneablePodAntiAffinity(io.fabric8.kubernetes.api.builder.Function<PodAntiAffinity,PodAntiAffinity> function){
            super();this.builder=new PodAntiAffinityBuilder(this);this.function=function;
    }
    public DoneablePodAntiAffinity(PodAntiAffinity item,io.fabric8.kubernetes.api.builder.Function<PodAntiAffinity,PodAntiAffinity> function){
            super(item);this.builder=new PodAntiAffinityBuilder(this, item);this.function=function;
    }
    public DoneablePodAntiAffinity(PodAntiAffinity item){
            super(item);this.builder=new PodAntiAffinityBuilder(this, item);this.function=new Function<PodAntiAffinity, PodAntiAffinity>() {
    public PodAntiAffinity apply(PodAntiAffinity item) {
        return item;
    }
}
;
    }

    public PodAntiAffinity done(){
             return function.apply(builder.build());
    }




}
