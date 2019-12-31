package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildStrategy extends BuildStrategyFluentImpl<DoneableBuildStrategy> implements Doneable<BuildStrategy>{

    private final BuildStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildStrategy,BuildStrategy> function;

    public DoneableBuildStrategy(io.fabric8.kubernetes.api.builder.Function<BuildStrategy,BuildStrategy> function){
            super();this.builder=new BuildStrategyBuilder(this);this.function=function;
    }
    public DoneableBuildStrategy(BuildStrategy item,io.fabric8.kubernetes.api.builder.Function<BuildStrategy,BuildStrategy> function){
            super(item);this.builder=new BuildStrategyBuilder(this, item);this.function=function;
    }
    public DoneableBuildStrategy(BuildStrategy item){
            super(item);this.builder=new BuildStrategyBuilder(this, item);this.function=new Function<BuildStrategy, BuildStrategy>() {
    public BuildStrategy apply(BuildStrategy item) {
        return item;
    }
}
;
    }

    public BuildStrategy done(){
             return function.apply(builder.build());
    }




}
