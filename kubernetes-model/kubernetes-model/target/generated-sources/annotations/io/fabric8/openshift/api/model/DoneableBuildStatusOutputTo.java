package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildStatusOutputTo extends BuildStatusOutputToFluentImpl<DoneableBuildStatusOutputTo> implements Doneable<BuildStatusOutputTo>{

    private final BuildStatusOutputToBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildStatusOutputTo,BuildStatusOutputTo> function;

    public DoneableBuildStatusOutputTo(io.fabric8.kubernetes.api.builder.Function<BuildStatusOutputTo,BuildStatusOutputTo> function){
            super();this.builder=new BuildStatusOutputToBuilder(this);this.function=function;
    }
    public DoneableBuildStatusOutputTo(BuildStatusOutputTo item,io.fabric8.kubernetes.api.builder.Function<BuildStatusOutputTo,BuildStatusOutputTo> function){
            super(item);this.builder=new BuildStatusOutputToBuilder(this, item);this.function=function;
    }
    public DoneableBuildStatusOutputTo(BuildStatusOutputTo item){
            super(item);this.builder=new BuildStatusOutputToBuilder(this, item);this.function=new Function<BuildStatusOutputTo, BuildStatusOutputTo>() {
    public BuildStatusOutputTo apply(BuildStatusOutputTo item) {
        return item;
    }
}
;
    }

    public BuildStatusOutputTo done(){
             return function.apply(builder.build());
    }




}
