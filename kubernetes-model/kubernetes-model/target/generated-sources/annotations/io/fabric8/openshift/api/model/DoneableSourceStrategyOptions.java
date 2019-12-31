package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSourceStrategyOptions extends SourceStrategyOptionsFluentImpl<DoneableSourceStrategyOptions> implements Doneable<SourceStrategyOptions>{

    private final SourceStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SourceStrategyOptions,SourceStrategyOptions> function;

    public DoneableSourceStrategyOptions(io.fabric8.kubernetes.api.builder.Function<SourceStrategyOptions,SourceStrategyOptions> function){
            super();this.builder=new SourceStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableSourceStrategyOptions(SourceStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<SourceStrategyOptions,SourceStrategyOptions> function){
            super(item);this.builder=new SourceStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableSourceStrategyOptions(SourceStrategyOptions item){
            super(item);this.builder=new SourceStrategyOptionsBuilder(this, item);this.function=new Function<SourceStrategyOptions, SourceStrategyOptions>() {
    public SourceStrategyOptions apply(SourceStrategyOptions item) {
        return item;
    }
}
;
    }

    public SourceStrategyOptions done(){
             return function.apply(builder.build());
    }




}
