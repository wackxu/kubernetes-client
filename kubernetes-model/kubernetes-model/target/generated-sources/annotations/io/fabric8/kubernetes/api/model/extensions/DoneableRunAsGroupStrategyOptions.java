package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRunAsGroupStrategyOptions extends RunAsGroupStrategyOptionsFluentImpl<DoneableRunAsGroupStrategyOptions> implements Doneable<RunAsGroupStrategyOptions>{

    private final RunAsGroupStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RunAsGroupStrategyOptions,RunAsGroupStrategyOptions> function;

    public DoneableRunAsGroupStrategyOptions(io.fabric8.kubernetes.api.builder.Function<RunAsGroupStrategyOptions,RunAsGroupStrategyOptions> function){
            super();this.builder=new RunAsGroupStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableRunAsGroupStrategyOptions(RunAsGroupStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<RunAsGroupStrategyOptions,RunAsGroupStrategyOptions> function){
            super(item);this.builder=new RunAsGroupStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableRunAsGroupStrategyOptions(RunAsGroupStrategyOptions item){
            super(item);this.builder=new RunAsGroupStrategyOptionsBuilder(this, item);this.function=new Function<RunAsGroupStrategyOptions, RunAsGroupStrategyOptions>() {
    public RunAsGroupStrategyOptions apply(RunAsGroupStrategyOptions item) {
        return item;
    }
}
;
    }

    public RunAsGroupStrategyOptions done(){
             return function.apply(builder.build());
    }




}
