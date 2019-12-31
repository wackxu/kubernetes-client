package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentStrategy extends io.fabric8.openshift.api.model.DeploymentStrategyFluentImpl<DoneableDeploymentStrategy> implements Doneable<io.fabric8.openshift.api.model.DeploymentStrategy>{

    private final io.fabric8.openshift.api.model.DeploymentStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.DeploymentStrategy,io.fabric8.openshift.api.model.DeploymentStrategy> function;

    public DoneableDeploymentStrategy(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.DeploymentStrategy,io.fabric8.openshift.api.model.DeploymentStrategy> function){
            super();this.builder=new DeploymentStrategyBuilder(this);this.function=function;
    }
    public DoneableDeploymentStrategy(io.fabric8.openshift.api.model.DeploymentStrategy item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.DeploymentStrategy,io.fabric8.openshift.api.model.DeploymentStrategy> function){
            super(item);this.builder=new DeploymentStrategyBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentStrategy(io.fabric8.openshift.api.model.DeploymentStrategy item){
            super(item);this.builder=new DeploymentStrategyBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.DeploymentStrategy, io.fabric8.openshift.api.model.DeploymentStrategy>() {
    public io.fabric8.openshift.api.model.DeploymentStrategy apply(io.fabric8.openshift.api.model.DeploymentStrategy item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.DeploymentStrategy done(){
             return function.apply(builder.build());
    }




}
