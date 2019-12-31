package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentCondition extends DeploymentConditionFluentImpl<DoneableDeploymentCondition> implements Doneable<DeploymentCondition>{

    private final DeploymentConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentCondition,DeploymentCondition> function;

    public DoneableDeploymentCondition(io.fabric8.kubernetes.api.builder.Function<DeploymentCondition,DeploymentCondition> function){
            super();this.builder=new DeploymentConditionBuilder(this);this.function=function;
    }
    public DoneableDeploymentCondition(DeploymentCondition item,io.fabric8.kubernetes.api.builder.Function<DeploymentCondition,DeploymentCondition> function){
            super(item);this.builder=new DeploymentConditionBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentCondition(DeploymentCondition item){
            super(item);this.builder=new DeploymentConditionBuilder(this, item);this.function=new Function<DeploymentCondition, DeploymentCondition>() {
    public DeploymentCondition apply(DeploymentCondition item) {
        return item;
    }
}
;
    }

    public DeploymentCondition done(){
             return function.apply(builder.build());
    }




}
