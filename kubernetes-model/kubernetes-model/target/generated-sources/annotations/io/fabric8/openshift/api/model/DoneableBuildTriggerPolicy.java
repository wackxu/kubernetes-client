package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildTriggerPolicy extends BuildTriggerPolicyFluentImpl<DoneableBuildTriggerPolicy> implements Doneable<BuildTriggerPolicy>{

    private final BuildTriggerPolicyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildTriggerPolicy,BuildTriggerPolicy> function;

    public DoneableBuildTriggerPolicy(io.fabric8.kubernetes.api.builder.Function<BuildTriggerPolicy,BuildTriggerPolicy> function){
            super();this.builder=new BuildTriggerPolicyBuilder(this);this.function=function;
    }
    public DoneableBuildTriggerPolicy(BuildTriggerPolicy item,io.fabric8.kubernetes.api.builder.Function<BuildTriggerPolicy,BuildTriggerPolicy> function){
            super(item);this.builder=new BuildTriggerPolicyBuilder(this, item);this.function=function;
    }
    public DoneableBuildTriggerPolicy(BuildTriggerPolicy item){
            super(item);this.builder=new BuildTriggerPolicyBuilder(this, item);this.function=new Function<BuildTriggerPolicy, BuildTriggerPolicy>() {
    public BuildTriggerPolicy apply(BuildTriggerPolicy item) {
        return item;
    }
}
;
    }

    public BuildTriggerPolicy done(){
             return function.apply(builder.build());
    }




}
