package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePreferredSchedulingTerm extends PreferredSchedulingTermFluentImpl<DoneablePreferredSchedulingTerm> implements Doneable<PreferredSchedulingTerm>{

    private final PreferredSchedulingTermBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PreferredSchedulingTerm,PreferredSchedulingTerm> function;

    public DoneablePreferredSchedulingTerm(io.fabric8.kubernetes.api.builder.Function<PreferredSchedulingTerm,PreferredSchedulingTerm> function){
            super();this.builder=new PreferredSchedulingTermBuilder(this);this.function=function;
    }
    public DoneablePreferredSchedulingTerm(PreferredSchedulingTerm item,io.fabric8.kubernetes.api.builder.Function<PreferredSchedulingTerm,PreferredSchedulingTerm> function){
            super(item);this.builder=new PreferredSchedulingTermBuilder(this, item);this.function=function;
    }
    public DoneablePreferredSchedulingTerm(PreferredSchedulingTerm item){
            super(item);this.builder=new PreferredSchedulingTermBuilder(this, item);this.function=new Function<PreferredSchedulingTerm, PreferredSchedulingTerm>() {
    public PreferredSchedulingTerm apply(PreferredSchedulingTerm item) {
        return item;
    }
}
;
    }

    public PreferredSchedulingTerm done(){
             return function.apply(builder.build());
    }




}
