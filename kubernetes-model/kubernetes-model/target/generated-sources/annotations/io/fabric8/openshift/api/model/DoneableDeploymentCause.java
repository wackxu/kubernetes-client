package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentCause extends DeploymentCauseFluentImpl<DoneableDeploymentCause> implements Doneable<DeploymentCause>{

    private final DeploymentCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentCause,DeploymentCause> function;

    public DoneableDeploymentCause(io.fabric8.kubernetes.api.builder.Function<DeploymentCause,DeploymentCause> function){
            super();this.builder=new DeploymentCauseBuilder(this);this.function=function;
    }
    public DoneableDeploymentCause(DeploymentCause item,io.fabric8.kubernetes.api.builder.Function<DeploymentCause,DeploymentCause> function){
            super(item);this.builder=new DeploymentCauseBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentCause(DeploymentCause item){
            super(item);this.builder=new DeploymentCauseBuilder(this, item);this.function=new Function<DeploymentCause, DeploymentCause>() {
    public DeploymentCause apply(DeploymentCause item) {
        return item;
    }
}
;
    }

    public DeploymentCause done(){
             return function.apply(builder.build());
    }




}
