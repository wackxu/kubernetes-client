package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRollingUpdateDeployment extends RollingUpdateDeploymentFluentImpl<DoneableRollingUpdateDeployment> implements Doneable<RollingUpdateDeployment>{

    private final RollingUpdateDeploymentBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RollingUpdateDeployment,RollingUpdateDeployment> function;

    public DoneableRollingUpdateDeployment(io.fabric8.kubernetes.api.builder.Function<RollingUpdateDeployment,RollingUpdateDeployment> function){
            super();this.builder=new RollingUpdateDeploymentBuilder(this);this.function=function;
    }
    public DoneableRollingUpdateDeployment(RollingUpdateDeployment item,io.fabric8.kubernetes.api.builder.Function<RollingUpdateDeployment,RollingUpdateDeployment> function){
            super(item);this.builder=new RollingUpdateDeploymentBuilder(this, item);this.function=function;
    }
    public DoneableRollingUpdateDeployment(RollingUpdateDeployment item){
            super(item);this.builder=new RollingUpdateDeploymentBuilder(this, item);this.function=new Function<RollingUpdateDeployment, RollingUpdateDeployment>() {
    public RollingUpdateDeployment apply(RollingUpdateDeployment item) {
        return item;
    }
}
;
    }

    public RollingUpdateDeployment done(){
             return function.apply(builder.build());
    }




}
