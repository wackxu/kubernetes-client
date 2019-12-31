package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeployment extends DeploymentFluentImpl<DoneableDeployment> implements Doneable<Deployment>{

    private final DeploymentBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Deployment,Deployment> function;

    public DoneableDeployment(io.fabric8.kubernetes.api.builder.Function<Deployment,Deployment> function){
            super();this.builder=new DeploymentBuilder(this);this.function=function;
    }
    public DoneableDeployment(Deployment item,io.fabric8.kubernetes.api.builder.Function<Deployment,Deployment> function){
            super(item);this.builder=new DeploymentBuilder(this, item);this.function=function;
    }
    public DoneableDeployment(Deployment item){
            super(item);this.builder=new DeploymentBuilder(this, item);this.function=new Function<Deployment, Deployment>() {
    public Deployment apply(Deployment item) {
        return item;
    }
}
;
    }

    public Deployment done(){
             return function.apply(builder.build());
    }




}
