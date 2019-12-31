package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildSource extends BuildSourceFluentImpl<DoneableBuildSource> implements Doneable<BuildSource>{

    private final BuildSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildSource,BuildSource> function;

    public DoneableBuildSource(io.fabric8.kubernetes.api.builder.Function<BuildSource,BuildSource> function){
            super();this.builder=new BuildSourceBuilder(this);this.function=function;
    }
    public DoneableBuildSource(BuildSource item,io.fabric8.kubernetes.api.builder.Function<BuildSource,BuildSource> function){
            super(item);this.builder=new BuildSourceBuilder(this, item);this.function=function;
    }
    public DoneableBuildSource(BuildSource item){
            super(item);this.builder=new BuildSourceBuilder(this, item);this.function=new Function<BuildSource, BuildSource>() {
    public BuildSource apply(BuildSource item) {
        return item;
    }
}
;
    }

    public BuildSource done(){
             return function.apply(builder.build());
    }




}
