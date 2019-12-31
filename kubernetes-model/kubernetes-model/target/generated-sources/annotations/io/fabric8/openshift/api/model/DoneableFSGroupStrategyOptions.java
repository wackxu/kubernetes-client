package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableFSGroupStrategyOptions extends io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluentImpl<DoneableFSGroupStrategyOptions> implements Doneable<io.fabric8.openshift.api.model.FSGroupStrategyOptions>{

    private final io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.FSGroupStrategyOptions,io.fabric8.openshift.api.model.FSGroupStrategyOptions> function;

    public DoneableFSGroupStrategyOptions(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.FSGroupStrategyOptions,io.fabric8.openshift.api.model.FSGroupStrategyOptions> function){
            super();this.builder=new FSGroupStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableFSGroupStrategyOptions(io.fabric8.openshift.api.model.FSGroupStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.FSGroupStrategyOptions,io.fabric8.openshift.api.model.FSGroupStrategyOptions> function){
            super(item);this.builder=new FSGroupStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableFSGroupStrategyOptions(io.fabric8.openshift.api.model.FSGroupStrategyOptions item){
            super(item);this.builder=new FSGroupStrategyOptionsBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.FSGroupStrategyOptions, io.fabric8.openshift.api.model.FSGroupStrategyOptions>() {
    public io.fabric8.openshift.api.model.FSGroupStrategyOptions apply(io.fabric8.openshift.api.model.FSGroupStrategyOptions item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.FSGroupStrategyOptions done(){
             return function.apply(builder.build());
    }




}
