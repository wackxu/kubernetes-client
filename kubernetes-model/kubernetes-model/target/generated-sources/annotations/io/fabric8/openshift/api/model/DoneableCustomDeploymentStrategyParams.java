package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomDeploymentStrategyParams extends CustomDeploymentStrategyParamsFluentImpl<DoneableCustomDeploymentStrategyParams> implements Doneable<CustomDeploymentStrategyParams>{

    private final CustomDeploymentStrategyParamsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomDeploymentStrategyParams,CustomDeploymentStrategyParams> function;

    public DoneableCustomDeploymentStrategyParams(io.fabric8.kubernetes.api.builder.Function<CustomDeploymentStrategyParams,CustomDeploymentStrategyParams> function){
            super();this.builder=new CustomDeploymentStrategyParamsBuilder(this);this.function=function;
    }
    public DoneableCustomDeploymentStrategyParams(CustomDeploymentStrategyParams item,io.fabric8.kubernetes.api.builder.Function<CustomDeploymentStrategyParams,CustomDeploymentStrategyParams> function){
            super(item);this.builder=new CustomDeploymentStrategyParamsBuilder(this, item);this.function=function;
    }
    public DoneableCustomDeploymentStrategyParams(CustomDeploymentStrategyParams item){
            super(item);this.builder=new CustomDeploymentStrategyParamsBuilder(this, item);this.function=new Function<CustomDeploymentStrategyParams, CustomDeploymentStrategyParams>() {
    public CustomDeploymentStrategyParams apply(CustomDeploymentStrategyParams item) {
        return item;
    }
}
;
    }

    public CustomDeploymentStrategyParams done(){
             return function.apply(builder.build());
    }




}
