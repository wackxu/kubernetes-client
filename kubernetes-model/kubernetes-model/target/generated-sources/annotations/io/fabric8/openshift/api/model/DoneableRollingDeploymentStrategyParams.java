package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRollingDeploymentStrategyParams extends RollingDeploymentStrategyParamsFluentImpl<DoneableRollingDeploymentStrategyParams> implements Doneable<RollingDeploymentStrategyParams>{

    private final RollingDeploymentStrategyParamsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RollingDeploymentStrategyParams,RollingDeploymentStrategyParams> function;

    public DoneableRollingDeploymentStrategyParams(io.fabric8.kubernetes.api.builder.Function<RollingDeploymentStrategyParams,RollingDeploymentStrategyParams> function){
            super();this.builder=new RollingDeploymentStrategyParamsBuilder(this);this.function=function;
    }
    public DoneableRollingDeploymentStrategyParams(RollingDeploymentStrategyParams item,io.fabric8.kubernetes.api.builder.Function<RollingDeploymentStrategyParams,RollingDeploymentStrategyParams> function){
            super(item);this.builder=new RollingDeploymentStrategyParamsBuilder(this, item);this.function=function;
    }
    public DoneableRollingDeploymentStrategyParams(RollingDeploymentStrategyParams item){
            super(item);this.builder=new RollingDeploymentStrategyParamsBuilder(this, item);this.function=new Function<RollingDeploymentStrategyParams, RollingDeploymentStrategyParams>() {
    public RollingDeploymentStrategyParams apply(RollingDeploymentStrategyParams item) {
        return item;
    }
}
;
    }

    public RollingDeploymentStrategyParams done(){
             return function.apply(builder.build());
    }




}
