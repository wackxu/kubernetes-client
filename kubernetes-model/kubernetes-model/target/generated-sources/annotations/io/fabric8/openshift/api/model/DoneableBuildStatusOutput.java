package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildStatusOutput extends BuildStatusOutputFluentImpl<DoneableBuildStatusOutput> implements Doneable<BuildStatusOutput>{

    private final BuildStatusOutputBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildStatusOutput,BuildStatusOutput> function;

    public DoneableBuildStatusOutput(io.fabric8.kubernetes.api.builder.Function<BuildStatusOutput,BuildStatusOutput> function){
            super();this.builder=new BuildStatusOutputBuilder(this);this.function=function;
    }
    public DoneableBuildStatusOutput(BuildStatusOutput item,io.fabric8.kubernetes.api.builder.Function<BuildStatusOutput,BuildStatusOutput> function){
            super(item);this.builder=new BuildStatusOutputBuilder(this, item);this.function=function;
    }
    public DoneableBuildStatusOutput(BuildStatusOutput item){
            super(item);this.builder=new BuildStatusOutputBuilder(this, item);this.function=new Function<BuildStatusOutput, BuildStatusOutput>() {
    public BuildStatusOutput apply(BuildStatusOutput item) {
        return item;
    }
}
;
    }

    public BuildStatusOutput done(){
             return function.apply(builder.build());
    }




}
