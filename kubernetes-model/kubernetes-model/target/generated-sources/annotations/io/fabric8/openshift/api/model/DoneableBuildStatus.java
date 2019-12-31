package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildStatus extends BuildStatusFluentImpl<DoneableBuildStatus> implements Doneable<BuildStatus>{

    private final BuildStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildStatus,BuildStatus> function;

    public DoneableBuildStatus(io.fabric8.kubernetes.api.builder.Function<BuildStatus,BuildStatus> function){
            super();this.builder=new BuildStatusBuilder(this);this.function=function;
    }
    public DoneableBuildStatus(BuildStatus item,io.fabric8.kubernetes.api.builder.Function<BuildStatus,BuildStatus> function){
            super(item);this.builder=new BuildStatusBuilder(this, item);this.function=function;
    }
    public DoneableBuildStatus(BuildStatus item){
            super(item);this.builder=new BuildStatusBuilder(this, item);this.function=new Function<BuildStatus, BuildStatus>() {
    public BuildStatus apply(BuildStatus item) {
        return item;
    }
}
;
    }

    public BuildStatus done(){
             return function.apply(builder.build());
    }




}
