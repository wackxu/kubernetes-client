package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomBuildStrategy extends CustomBuildStrategyFluentImpl<DoneableCustomBuildStrategy> implements Doneable<CustomBuildStrategy>{

    private final CustomBuildStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomBuildStrategy,CustomBuildStrategy> function;

    public DoneableCustomBuildStrategy(io.fabric8.kubernetes.api.builder.Function<CustomBuildStrategy,CustomBuildStrategy> function){
            super();this.builder=new CustomBuildStrategyBuilder(this);this.function=function;
    }
    public DoneableCustomBuildStrategy(CustomBuildStrategy item,io.fabric8.kubernetes.api.builder.Function<CustomBuildStrategy,CustomBuildStrategy> function){
            super(item);this.builder=new CustomBuildStrategyBuilder(this, item);this.function=function;
    }
    public DoneableCustomBuildStrategy(CustomBuildStrategy item){
            super(item);this.builder=new CustomBuildStrategyBuilder(this, item);this.function=new Function<CustomBuildStrategy, CustomBuildStrategy>() {
    public CustomBuildStrategy apply(CustomBuildStrategy item) {
        return item;
    }
}
;
    }

    public CustomBuildStrategy done(){
             return function.apply(builder.build());
    }




}
