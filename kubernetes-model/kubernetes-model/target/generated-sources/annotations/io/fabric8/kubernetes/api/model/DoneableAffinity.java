package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAffinity extends AffinityFluentImpl<DoneableAffinity> implements Doneable<Affinity>{

    private final AffinityBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Affinity,Affinity> function;

    public DoneableAffinity(io.fabric8.kubernetes.api.builder.Function<Affinity,Affinity> function){
            super();this.builder=new AffinityBuilder(this);this.function=function;
    }
    public DoneableAffinity(Affinity item,io.fabric8.kubernetes.api.builder.Function<Affinity,Affinity> function){
            super(item);this.builder=new AffinityBuilder(this, item);this.function=function;
    }
    public DoneableAffinity(Affinity item){
            super(item);this.builder=new AffinityBuilder(this, item);this.function=new Function<Affinity, Affinity>() {
    public Affinity apply(Affinity item) {
        return item;
    }
}
;
    }

    public Affinity done(){
             return function.apply(builder.build());
    }




}
