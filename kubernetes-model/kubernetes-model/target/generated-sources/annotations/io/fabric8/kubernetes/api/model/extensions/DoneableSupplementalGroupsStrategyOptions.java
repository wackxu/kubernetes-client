package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSupplementalGroupsStrategyOptions extends SupplementalGroupsStrategyOptionsFluentImpl<DoneableSupplementalGroupsStrategyOptions> implements Doneable<SupplementalGroupsStrategyOptions>{

    private final SupplementalGroupsStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SupplementalGroupsStrategyOptions,SupplementalGroupsStrategyOptions> function;

    public DoneableSupplementalGroupsStrategyOptions(io.fabric8.kubernetes.api.builder.Function<SupplementalGroupsStrategyOptions,SupplementalGroupsStrategyOptions> function){
            super();this.builder=new SupplementalGroupsStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableSupplementalGroupsStrategyOptions(SupplementalGroupsStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<SupplementalGroupsStrategyOptions,SupplementalGroupsStrategyOptions> function){
            super(item);this.builder=new SupplementalGroupsStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableSupplementalGroupsStrategyOptions(SupplementalGroupsStrategyOptions item){
            super(item);this.builder=new SupplementalGroupsStrategyOptionsBuilder(this, item);this.function=new Function<SupplementalGroupsStrategyOptions, SupplementalGroupsStrategyOptions>() {
    public SupplementalGroupsStrategyOptions apply(SupplementalGroupsStrategyOptions item) {
        return item;
    }
}
;
    }

    public SupplementalGroupsStrategyOptions done(){
             return function.apply(builder.build());
    }




}
