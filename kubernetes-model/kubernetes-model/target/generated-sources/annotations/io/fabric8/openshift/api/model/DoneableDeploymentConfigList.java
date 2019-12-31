package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentConfigList extends DeploymentConfigListFluentImpl<DoneableDeploymentConfigList> implements Doneable<DeploymentConfigList>{

    private final DeploymentConfigListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentConfigList,DeploymentConfigList> function;

    public DoneableDeploymentConfigList(io.fabric8.kubernetes.api.builder.Function<DeploymentConfigList,DeploymentConfigList> function){
            super();this.builder=new DeploymentConfigListBuilder(this);this.function=function;
    }
    public DoneableDeploymentConfigList(DeploymentConfigList item,io.fabric8.kubernetes.api.builder.Function<DeploymentConfigList,DeploymentConfigList> function){
            super(item);this.builder=new DeploymentConfigListBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentConfigList(DeploymentConfigList item){
            super(item);this.builder=new DeploymentConfigListBuilder(this, item);this.function=new Function<DeploymentConfigList, DeploymentConfigList>() {
    public DeploymentConfigList apply(DeploymentConfigList item) {
        return item;
    }
}
;
    }

    public DeploymentConfigList done(){
             return function.apply(builder.build());
    }




}
