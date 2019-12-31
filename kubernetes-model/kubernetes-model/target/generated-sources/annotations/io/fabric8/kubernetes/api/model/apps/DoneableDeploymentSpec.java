package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentSpec extends DeploymentSpecFluentImpl<DoneableDeploymentSpec> implements Doneable<DeploymentSpec>{

    private final DeploymentSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentSpec,DeploymentSpec> function;

    public DoneableDeploymentSpec(io.fabric8.kubernetes.api.builder.Function<DeploymentSpec,DeploymentSpec> function){
            super();this.builder=new DeploymentSpecBuilder(this);this.function=function;
    }
    public DoneableDeploymentSpec(DeploymentSpec item,io.fabric8.kubernetes.api.builder.Function<DeploymentSpec,DeploymentSpec> function){
            super(item);this.builder=new DeploymentSpecBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentSpec(DeploymentSpec item){
            super(item);this.builder=new DeploymentSpecBuilder(this, item);this.function=new Function<DeploymentSpec, DeploymentSpec>() {
    public DeploymentSpec apply(DeploymentSpec item) {
        return item;
    }
}
;
    }

    public DeploymentSpec done(){
             return function.apply(builder.build());
    }




}
