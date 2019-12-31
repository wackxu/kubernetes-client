package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSourceBuildStrategy extends SourceBuildStrategyFluentImpl<DoneableSourceBuildStrategy> implements Doneable<SourceBuildStrategy>{

    private final SourceBuildStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SourceBuildStrategy,SourceBuildStrategy> function;

    public DoneableSourceBuildStrategy(io.fabric8.kubernetes.api.builder.Function<SourceBuildStrategy,SourceBuildStrategy> function){
            super();this.builder=new SourceBuildStrategyBuilder(this);this.function=function;
    }
    public DoneableSourceBuildStrategy(SourceBuildStrategy item,io.fabric8.kubernetes.api.builder.Function<SourceBuildStrategy,SourceBuildStrategy> function){
            super(item);this.builder=new SourceBuildStrategyBuilder(this, item);this.function=function;
    }
    public DoneableSourceBuildStrategy(SourceBuildStrategy item){
            super(item);this.builder=new SourceBuildStrategyBuilder(this, item);this.function=new Function<SourceBuildStrategy, SourceBuildStrategy>() {
    public SourceBuildStrategy apply(SourceBuildStrategy item) {
        return item;
    }
}
;
    }

    public SourceBuildStrategy done(){
             return function.apply(builder.build());
    }




}
