package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentTriggerPolicy extends DeploymentTriggerPolicyFluentImpl<DoneableDeploymentTriggerPolicy> implements Doneable<DeploymentTriggerPolicy>{

    private final DeploymentTriggerPolicyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentTriggerPolicy,DeploymentTriggerPolicy> function;

    public DoneableDeploymentTriggerPolicy(io.fabric8.kubernetes.api.builder.Function<DeploymentTriggerPolicy,DeploymentTriggerPolicy> function){
            super();this.builder=new DeploymentTriggerPolicyBuilder(this);this.function=function;
    }
    public DoneableDeploymentTriggerPolicy(DeploymentTriggerPolicy item,io.fabric8.kubernetes.api.builder.Function<DeploymentTriggerPolicy,DeploymentTriggerPolicy> function){
            super(item);this.builder=new DeploymentTriggerPolicyBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentTriggerPolicy(DeploymentTriggerPolicy item){
            super(item);this.builder=new DeploymentTriggerPolicyBuilder(this, item);this.function=new Function<DeploymentTriggerPolicy, DeploymentTriggerPolicy>() {
    public DeploymentTriggerPolicy apply(DeploymentTriggerPolicy item) {
        return item;
    }
}
;
    }

    public DeploymentTriggerPolicy done(){
             return function.apply(builder.build());
    }




}
