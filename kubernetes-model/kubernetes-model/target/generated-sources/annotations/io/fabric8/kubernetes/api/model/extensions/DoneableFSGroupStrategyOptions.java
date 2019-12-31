package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableFSGroupStrategyOptions extends FSGroupStrategyOptionsFluentImpl<DoneableFSGroupStrategyOptions> implements Doneable<FSGroupStrategyOptions>{

    private final FSGroupStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<FSGroupStrategyOptions,FSGroupStrategyOptions> function;

    public DoneableFSGroupStrategyOptions(io.fabric8.kubernetes.api.builder.Function<FSGroupStrategyOptions,FSGroupStrategyOptions> function){
            super();this.builder=new FSGroupStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableFSGroupStrategyOptions(FSGroupStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<FSGroupStrategyOptions,FSGroupStrategyOptions> function){
            super(item);this.builder=new FSGroupStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableFSGroupStrategyOptions(FSGroupStrategyOptions item){
            super(item);this.builder=new FSGroupStrategyOptionsBuilder(this, item);this.function=new Function<FSGroupStrategyOptions, FSGroupStrategyOptions>() {
    public FSGroupStrategyOptions apply(FSGroupStrategyOptions item) {
        return item;
    }
}
;
    }

    public FSGroupStrategyOptions done(){
             return function.apply(builder.build());
    }




}
