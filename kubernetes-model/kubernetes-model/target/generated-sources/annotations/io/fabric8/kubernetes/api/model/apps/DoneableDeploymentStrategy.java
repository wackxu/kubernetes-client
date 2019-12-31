package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentStrategy extends DeploymentStrategyFluentImpl<DoneableDeploymentStrategy> implements Doneable<DeploymentStrategy>{

    private final DeploymentStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentStrategy,DeploymentStrategy> function;

    public DoneableDeploymentStrategy(io.fabric8.kubernetes.api.builder.Function<DeploymentStrategy,DeploymentStrategy> function){
            super();this.builder=new DeploymentStrategyBuilder(this);this.function=function;
    }
    public DoneableDeploymentStrategy(DeploymentStrategy item,io.fabric8.kubernetes.api.builder.Function<DeploymentStrategy,DeploymentStrategy> function){
            super(item);this.builder=new DeploymentStrategyBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentStrategy(DeploymentStrategy item){
            super(item);this.builder=new DeploymentStrategyBuilder(this, item);this.function=new Function<DeploymentStrategy, DeploymentStrategy>() {
    public DeploymentStrategy apply(DeploymentStrategy item) {
        return item;
    }
}
;
    }

    public DeploymentStrategy done(){
             return function.apply(builder.build());
    }




}
