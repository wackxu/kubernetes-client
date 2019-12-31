package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSupplementalGroupsStrategyOptions extends io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluentImpl<DoneableSupplementalGroupsStrategyOptions> implements Doneable<io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions>{

    private final io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions> function;

    public DoneableSupplementalGroupsStrategyOptions(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions> function){
            super();this.builder=new SupplementalGroupsStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableSupplementalGroupsStrategyOptions(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions,io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions> function){
            super(item);this.builder=new SupplementalGroupsStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableSupplementalGroupsStrategyOptions(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item){
            super(item);this.builder=new SupplementalGroupsStrategyOptionsBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions, io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions>() {
    public io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions apply(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions done(){
             return function.apply(builder.build());
    }




}
