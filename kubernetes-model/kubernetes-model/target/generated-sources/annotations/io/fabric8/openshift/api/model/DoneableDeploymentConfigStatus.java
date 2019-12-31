package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentConfigStatus extends DeploymentConfigStatusFluentImpl<DoneableDeploymentConfigStatus> implements Doneable<DeploymentConfigStatus>{

    private final DeploymentConfigStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentConfigStatus,DeploymentConfigStatus> function;

    public DoneableDeploymentConfigStatus(io.fabric8.kubernetes.api.builder.Function<DeploymentConfigStatus,DeploymentConfigStatus> function){
            super();this.builder=new DeploymentConfigStatusBuilder(this);this.function=function;
    }
    public DoneableDeploymentConfigStatus(DeploymentConfigStatus item,io.fabric8.kubernetes.api.builder.Function<DeploymentConfigStatus,DeploymentConfigStatus> function){
            super(item);this.builder=new DeploymentConfigStatusBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentConfigStatus(DeploymentConfigStatus item){
            super(item);this.builder=new DeploymentConfigStatusBuilder(this, item);this.function=new Function<DeploymentConfigStatus, DeploymentConfigStatus>() {
    public DeploymentConfigStatus apply(DeploymentConfigStatus item) {
        return item;
    }
}
;
    }

    public DeploymentConfigStatus done(){
             return function.apply(builder.build());
    }




}
