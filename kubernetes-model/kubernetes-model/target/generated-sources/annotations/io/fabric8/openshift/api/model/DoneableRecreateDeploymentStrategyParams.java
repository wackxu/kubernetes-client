package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRecreateDeploymentStrategyParams extends RecreateDeploymentStrategyParamsFluentImpl<DoneableRecreateDeploymentStrategyParams> implements Doneable<RecreateDeploymentStrategyParams>{

    private final RecreateDeploymentStrategyParamsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RecreateDeploymentStrategyParams,RecreateDeploymentStrategyParams> function;

    public DoneableRecreateDeploymentStrategyParams(io.fabric8.kubernetes.api.builder.Function<RecreateDeploymentStrategyParams,RecreateDeploymentStrategyParams> function){
            super();this.builder=new RecreateDeploymentStrategyParamsBuilder(this);this.function=function;
    }
    public DoneableRecreateDeploymentStrategyParams(RecreateDeploymentStrategyParams item,io.fabric8.kubernetes.api.builder.Function<RecreateDeploymentStrategyParams,RecreateDeploymentStrategyParams> function){
            super(item);this.builder=new RecreateDeploymentStrategyParamsBuilder(this, item);this.function=function;
    }
    public DoneableRecreateDeploymentStrategyParams(RecreateDeploymentStrategyParams item){
            super(item);this.builder=new RecreateDeploymentStrategyParamsBuilder(this, item);this.function=new Function<RecreateDeploymentStrategyParams, RecreateDeploymentStrategyParams>() {
    public RecreateDeploymentStrategyParams apply(RecreateDeploymentStrategyParams item) {
        return item;
    }
}
;
    }

    public RecreateDeploymentStrategyParams done(){
             return function.apply(builder.build());
    }




}
