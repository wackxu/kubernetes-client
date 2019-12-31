package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentConfig extends DeploymentConfigFluentImpl<DoneableDeploymentConfig> implements Doneable<DeploymentConfig>{

    private final DeploymentConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentConfig,DeploymentConfig> function;

    public DoneableDeploymentConfig(io.fabric8.kubernetes.api.builder.Function<DeploymentConfig,DeploymentConfig> function){
            super();this.builder=new DeploymentConfigBuilder(this);this.function=function;
    }
    public DoneableDeploymentConfig(DeploymentConfig item,io.fabric8.kubernetes.api.builder.Function<DeploymentConfig,DeploymentConfig> function){
            super(item);this.builder=new DeploymentConfigBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentConfig(DeploymentConfig item){
            super(item);this.builder=new DeploymentConfigBuilder(this, item);this.function=new Function<DeploymentConfig, DeploymentConfig>() {
    public DeploymentConfig apply(DeploymentConfig item) {
        return item;
    }
}
;
    }

    public DeploymentConfig done(){
             return function.apply(builder.build());
    }




}
