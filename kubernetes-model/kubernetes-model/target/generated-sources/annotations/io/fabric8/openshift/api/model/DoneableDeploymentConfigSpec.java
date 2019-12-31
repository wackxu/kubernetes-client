package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentConfigSpec extends DeploymentConfigSpecFluentImpl<DoneableDeploymentConfigSpec> implements Doneable<DeploymentConfigSpec>{

    private final DeploymentConfigSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentConfigSpec,DeploymentConfigSpec> function;

    public DoneableDeploymentConfigSpec(io.fabric8.kubernetes.api.builder.Function<DeploymentConfigSpec,DeploymentConfigSpec> function){
            super();this.builder=new DeploymentConfigSpecBuilder(this);this.function=function;
    }
    public DoneableDeploymentConfigSpec(DeploymentConfigSpec item,io.fabric8.kubernetes.api.builder.Function<DeploymentConfigSpec,DeploymentConfigSpec> function){
            super(item);this.builder=new DeploymentConfigSpecBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentConfigSpec(DeploymentConfigSpec item){
            super(item);this.builder=new DeploymentConfigSpecBuilder(this, item);this.function=new Function<DeploymentConfigSpec, DeploymentConfigSpec>() {
    public DeploymentConfigSpec apply(DeploymentConfigSpec item) {
        return item;
    }
}
;
    }

    public DeploymentConfigSpec done(){
             return function.apply(builder.build());
    }




}
