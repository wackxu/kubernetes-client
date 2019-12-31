package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentCondition extends io.fabric8.openshift.api.model.DeploymentConditionFluentImpl<DoneableDeploymentCondition> implements Doneable<io.fabric8.openshift.api.model.DeploymentCondition>{

    private final io.fabric8.openshift.api.model.DeploymentConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.DeploymentCondition,io.fabric8.openshift.api.model.DeploymentCondition> function;

    public DoneableDeploymentCondition(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.DeploymentCondition,io.fabric8.openshift.api.model.DeploymentCondition> function){
            super();this.builder=new DeploymentConditionBuilder(this);this.function=function;
    }
    public DoneableDeploymentCondition(io.fabric8.openshift.api.model.DeploymentCondition item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.DeploymentCondition,io.fabric8.openshift.api.model.DeploymentCondition> function){
            super(item);this.builder=new DeploymentConditionBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentCondition(io.fabric8.openshift.api.model.DeploymentCondition item){
            super(item);this.builder=new DeploymentConditionBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.DeploymentCondition, io.fabric8.openshift.api.model.DeploymentCondition>() {
    public io.fabric8.openshift.api.model.DeploymentCondition apply(io.fabric8.openshift.api.model.DeploymentCondition item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.DeploymentCondition done(){
             return function.apply(builder.build());
    }




}
