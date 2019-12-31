package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildOutput extends BuildOutputFluentImpl<DoneableBuildOutput> implements Doneable<BuildOutput>{

    private final BuildOutputBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildOutput,BuildOutput> function;

    public DoneableBuildOutput(io.fabric8.kubernetes.api.builder.Function<BuildOutput,BuildOutput> function){
            super();this.builder=new BuildOutputBuilder(this);this.function=function;
    }
    public DoneableBuildOutput(BuildOutput item,io.fabric8.kubernetes.api.builder.Function<BuildOutput,BuildOutput> function){
            super(item);this.builder=new BuildOutputBuilder(this, item);this.function=function;
    }
    public DoneableBuildOutput(BuildOutput item){
            super(item);this.builder=new BuildOutputBuilder(this, item);this.function=new Function<BuildOutput, BuildOutput>() {
    public BuildOutput apply(BuildOutput item) {
        return item;
    }
}
;
    }

    public BuildOutput done(){
             return function.apply(builder.build());
    }




}
