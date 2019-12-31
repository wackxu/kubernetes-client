package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRunAsUserStrategyOptions extends RunAsUserStrategyOptionsFluentImpl<DoneableRunAsUserStrategyOptions> implements Doneable<RunAsUserStrategyOptions>{

    private final RunAsUserStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RunAsUserStrategyOptions,RunAsUserStrategyOptions> function;

    public DoneableRunAsUserStrategyOptions(io.fabric8.kubernetes.api.builder.Function<RunAsUserStrategyOptions,RunAsUserStrategyOptions> function){
            super();this.builder=new RunAsUserStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableRunAsUserStrategyOptions(RunAsUserStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<RunAsUserStrategyOptions,RunAsUserStrategyOptions> function){
            super(item);this.builder=new RunAsUserStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableRunAsUserStrategyOptions(RunAsUserStrategyOptions item){
            super(item);this.builder=new RunAsUserStrategyOptionsBuilder(this, item);this.function=new Function<RunAsUserStrategyOptions, RunAsUserStrategyOptions>() {
    public RunAsUserStrategyOptions apply(RunAsUserStrategyOptions item) {
        return item;
    }
}
;
    }

    public RunAsUserStrategyOptions done(){
             return function.apply(builder.build());
    }




}
