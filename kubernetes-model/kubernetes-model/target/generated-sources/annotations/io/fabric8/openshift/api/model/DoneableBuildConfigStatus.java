package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildConfigStatus extends BuildConfigStatusFluentImpl<DoneableBuildConfigStatus> implements Doneable<BuildConfigStatus>{

    private final BuildConfigStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildConfigStatus,BuildConfigStatus> function;

    public DoneableBuildConfigStatus(io.fabric8.kubernetes.api.builder.Function<BuildConfigStatus,BuildConfigStatus> function){
            super();this.builder=new BuildConfigStatusBuilder(this);this.function=function;
    }
    public DoneableBuildConfigStatus(BuildConfigStatus item,io.fabric8.kubernetes.api.builder.Function<BuildConfigStatus,BuildConfigStatus> function){
            super(item);this.builder=new BuildConfigStatusBuilder(this, item);this.function=function;
    }
    public DoneableBuildConfigStatus(BuildConfigStatus item){
            super(item);this.builder=new BuildConfigStatusBuilder(this, item);this.function=new Function<BuildConfigStatus, BuildConfigStatus>() {
    public BuildConfigStatus apply(BuildConfigStatus item) {
        return item;
    }
}
;
    }

    public BuildConfigStatus done(){
             return function.apply(builder.build());
    }




}
