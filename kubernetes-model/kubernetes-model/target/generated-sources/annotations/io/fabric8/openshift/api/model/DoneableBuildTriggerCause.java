package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildTriggerCause extends BuildTriggerCauseFluentImpl<DoneableBuildTriggerCause> implements Doneable<BuildTriggerCause>{

    private final BuildTriggerCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildTriggerCause,BuildTriggerCause> function;

    public DoneableBuildTriggerCause(io.fabric8.kubernetes.api.builder.Function<BuildTriggerCause,BuildTriggerCause> function){
            super();this.builder=new BuildTriggerCauseBuilder(this);this.function=function;
    }
    public DoneableBuildTriggerCause(BuildTriggerCause item,io.fabric8.kubernetes.api.builder.Function<BuildTriggerCause,BuildTriggerCause> function){
            super(item);this.builder=new BuildTriggerCauseBuilder(this, item);this.function=function;
    }
    public DoneableBuildTriggerCause(BuildTriggerCause item){
            super(item);this.builder=new BuildTriggerCauseBuilder(this, item);this.function=new Function<BuildTriggerCause, BuildTriggerCause>() {
    public BuildTriggerCause apply(BuildTriggerCause item) {
        return item;
    }
}
;
    }

    public BuildTriggerCause done(){
             return function.apply(builder.build());
    }




}
