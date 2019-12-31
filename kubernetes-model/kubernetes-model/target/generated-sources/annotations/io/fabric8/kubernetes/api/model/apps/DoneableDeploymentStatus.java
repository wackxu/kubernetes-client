package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentStatus extends DeploymentStatusFluentImpl<DoneableDeploymentStatus> implements Doneable<DeploymentStatus>{

    private final DeploymentStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentStatus,DeploymentStatus> function;

    public DoneableDeploymentStatus(io.fabric8.kubernetes.api.builder.Function<DeploymentStatus,DeploymentStatus> function){
            super();this.builder=new DeploymentStatusBuilder(this);this.function=function;
    }
    public DoneableDeploymentStatus(DeploymentStatus item,io.fabric8.kubernetes.api.builder.Function<DeploymentStatus,DeploymentStatus> function){
            super(item);this.builder=new DeploymentStatusBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentStatus(DeploymentStatus item){
            super(item);this.builder=new DeploymentStatusBuilder(this, item);this.function=new Function<DeploymentStatus, DeploymentStatus>() {
    public DeploymentStatus apply(DeploymentStatus item) {
        return item;
    }
}
;
    }

    public DeploymentStatus done(){
             return function.apply(builder.build());
    }




}
