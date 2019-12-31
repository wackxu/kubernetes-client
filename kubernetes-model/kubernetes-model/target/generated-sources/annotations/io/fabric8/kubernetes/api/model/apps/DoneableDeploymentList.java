package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentList extends DeploymentListFluentImpl<DoneableDeploymentList> implements Doneable<DeploymentList>{

    private final DeploymentListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentList,DeploymentList> function;

    public DoneableDeploymentList(io.fabric8.kubernetes.api.builder.Function<DeploymentList,DeploymentList> function){
            super();this.builder=new DeploymentListBuilder(this);this.function=function;
    }
    public DoneableDeploymentList(DeploymentList item,io.fabric8.kubernetes.api.builder.Function<DeploymentList,DeploymentList> function){
            super(item);this.builder=new DeploymentListBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentList(DeploymentList item){
            super(item);this.builder=new DeploymentListBuilder(this, item);this.function=new Function<DeploymentList, DeploymentList>() {
    public DeploymentList apply(DeploymentList item) {
        return item;
    }
}
;
    }

    public DeploymentList done(){
             return function.apply(builder.build());
    }




}
