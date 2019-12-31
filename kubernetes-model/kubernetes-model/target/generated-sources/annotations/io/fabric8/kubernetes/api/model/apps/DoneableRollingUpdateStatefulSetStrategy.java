package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRollingUpdateStatefulSetStrategy extends RollingUpdateStatefulSetStrategyFluentImpl<DoneableRollingUpdateStatefulSetStrategy> implements Doneable<RollingUpdateStatefulSetStrategy>{

    private final RollingUpdateStatefulSetStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RollingUpdateStatefulSetStrategy,RollingUpdateStatefulSetStrategy> function;

    public DoneableRollingUpdateStatefulSetStrategy(io.fabric8.kubernetes.api.builder.Function<RollingUpdateStatefulSetStrategy,RollingUpdateStatefulSetStrategy> function){
            super();this.builder=new RollingUpdateStatefulSetStrategyBuilder(this);this.function=function;
    }
    public DoneableRollingUpdateStatefulSetStrategy(RollingUpdateStatefulSetStrategy item,io.fabric8.kubernetes.api.builder.Function<RollingUpdateStatefulSetStrategy,RollingUpdateStatefulSetStrategy> function){
            super(item);this.builder=new RollingUpdateStatefulSetStrategyBuilder(this, item);this.function=function;
    }
    public DoneableRollingUpdateStatefulSetStrategy(RollingUpdateStatefulSetStrategy item){
            super(item);this.builder=new RollingUpdateStatefulSetStrategyBuilder(this, item);this.function=new Function<RollingUpdateStatefulSetStrategy, RollingUpdateStatefulSetStrategy>() {
    public RollingUpdateStatefulSetStrategy apply(RollingUpdateStatefulSetStrategy item) {
        return item;
    }
}
;
    }

    public RollingUpdateStatefulSetStrategy done(){
             return function.apply(builder.build());
    }




}
