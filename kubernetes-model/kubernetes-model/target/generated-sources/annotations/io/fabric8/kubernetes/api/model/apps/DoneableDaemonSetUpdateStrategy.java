package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDaemonSetUpdateStrategy extends DaemonSetUpdateStrategyFluentImpl<DoneableDaemonSetUpdateStrategy> implements Doneable<DaemonSetUpdateStrategy>{

    private final DaemonSetUpdateStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DaemonSetUpdateStrategy,DaemonSetUpdateStrategy> function;

    public DoneableDaemonSetUpdateStrategy(io.fabric8.kubernetes.api.builder.Function<DaemonSetUpdateStrategy,DaemonSetUpdateStrategy> function){
            super();this.builder=new DaemonSetUpdateStrategyBuilder(this);this.function=function;
    }
    public DoneableDaemonSetUpdateStrategy(DaemonSetUpdateStrategy item,io.fabric8.kubernetes.api.builder.Function<DaemonSetUpdateStrategy,DaemonSetUpdateStrategy> function){
            super(item);this.builder=new DaemonSetUpdateStrategyBuilder(this, item);this.function=function;
    }
    public DoneableDaemonSetUpdateStrategy(DaemonSetUpdateStrategy item){
            super(item);this.builder=new DaemonSetUpdateStrategyBuilder(this, item);this.function=new Function<DaemonSetUpdateStrategy, DaemonSetUpdateStrategy>() {
    public DaemonSetUpdateStrategy apply(DaemonSetUpdateStrategy item) {
        return item;
    }
}
;
    }

    public DaemonSetUpdateStrategy done(){
             return function.apply(builder.build());
    }




}
