package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentTriggerImageChangeParams extends DeploymentTriggerImageChangeParamsFluentImpl<DoneableDeploymentTriggerImageChangeParams> implements Doneable<DeploymentTriggerImageChangeParams>{

    private final DeploymentTriggerImageChangeParamsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentTriggerImageChangeParams,DeploymentTriggerImageChangeParams> function;

    public DoneableDeploymentTriggerImageChangeParams(io.fabric8.kubernetes.api.builder.Function<DeploymentTriggerImageChangeParams,DeploymentTriggerImageChangeParams> function){
            super();this.builder=new DeploymentTriggerImageChangeParamsBuilder(this);this.function=function;
    }
    public DoneableDeploymentTriggerImageChangeParams(DeploymentTriggerImageChangeParams item,io.fabric8.kubernetes.api.builder.Function<DeploymentTriggerImageChangeParams,DeploymentTriggerImageChangeParams> function){
            super(item);this.builder=new DeploymentTriggerImageChangeParamsBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentTriggerImageChangeParams(DeploymentTriggerImageChangeParams item){
            super(item);this.builder=new DeploymentTriggerImageChangeParamsBuilder(this, item);this.function=new Function<DeploymentTriggerImageChangeParams, DeploymentTriggerImageChangeParams>() {
    public DeploymentTriggerImageChangeParams apply(DeploymentTriggerImageChangeParams item) {
        return item;
    }
}
;
    }

    public DeploymentTriggerImageChangeParams done(){
             return function.apply(builder.build());
    }




}
