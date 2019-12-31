package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentRollback extends DeploymentRollbackFluentImpl<DoneableDeploymentRollback> implements Doneable<DeploymentRollback>{

    private final DeploymentRollbackBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentRollback,DeploymentRollback> function;

    public DoneableDeploymentRollback(io.fabric8.kubernetes.api.builder.Function<DeploymentRollback,DeploymentRollback> function){
            super();this.builder=new DeploymentRollbackBuilder(this);this.function=function;
    }
    public DoneableDeploymentRollback(DeploymentRollback item,io.fabric8.kubernetes.api.builder.Function<DeploymentRollback,DeploymentRollback> function){
            super(item);this.builder=new DeploymentRollbackBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentRollback(DeploymentRollback item){
            super(item);this.builder=new DeploymentRollbackBuilder(this, item);this.function=new Function<DeploymentRollback, DeploymentRollback>() {
    public DeploymentRollback apply(DeploymentRollback item) {
        return item;
    }
}
;
    }

    public DeploymentRollback done(){
             return function.apply(builder.build());
    }




}
