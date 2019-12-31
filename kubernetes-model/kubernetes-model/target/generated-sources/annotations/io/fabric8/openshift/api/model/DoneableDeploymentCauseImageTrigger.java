package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentCauseImageTrigger extends DeploymentCauseImageTriggerFluentImpl<DoneableDeploymentCauseImageTrigger> implements Doneable<DeploymentCauseImageTrigger>{

    private final DeploymentCauseImageTriggerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentCauseImageTrigger,DeploymentCauseImageTrigger> function;

    public DoneableDeploymentCauseImageTrigger(io.fabric8.kubernetes.api.builder.Function<DeploymentCauseImageTrigger,DeploymentCauseImageTrigger> function){
            super();this.builder=new DeploymentCauseImageTriggerBuilder(this);this.function=function;
    }
    public DoneableDeploymentCauseImageTrigger(DeploymentCauseImageTrigger item,io.fabric8.kubernetes.api.builder.Function<DeploymentCauseImageTrigger,DeploymentCauseImageTrigger> function){
            super(item);this.builder=new DeploymentCauseImageTriggerBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentCauseImageTrigger(DeploymentCauseImageTrigger item){
            super(item);this.builder=new DeploymentCauseImageTriggerBuilder(this, item);this.function=new Function<DeploymentCauseImageTrigger, DeploymentCauseImageTrigger>() {
    public DeploymentCauseImageTrigger apply(DeploymentCauseImageTrigger item) {
        return item;
    }
}
;
    }

    public DeploymentCauseImageTrigger done(){
             return function.apply(builder.build());
    }




}
