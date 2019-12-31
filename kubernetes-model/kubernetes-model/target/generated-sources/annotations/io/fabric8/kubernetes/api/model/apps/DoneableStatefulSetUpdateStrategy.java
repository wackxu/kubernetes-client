package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStatefulSetUpdateStrategy extends StatefulSetUpdateStrategyFluentImpl<DoneableStatefulSetUpdateStrategy> implements Doneable<StatefulSetUpdateStrategy>{

    private final StatefulSetUpdateStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatefulSetUpdateStrategy,StatefulSetUpdateStrategy> function;

    public DoneableStatefulSetUpdateStrategy(io.fabric8.kubernetes.api.builder.Function<StatefulSetUpdateStrategy,StatefulSetUpdateStrategy> function){
            super();this.builder=new StatefulSetUpdateStrategyBuilder(this);this.function=function;
    }
    public DoneableStatefulSetUpdateStrategy(StatefulSetUpdateStrategy item,io.fabric8.kubernetes.api.builder.Function<StatefulSetUpdateStrategy,StatefulSetUpdateStrategy> function){
            super(item);this.builder=new StatefulSetUpdateStrategyBuilder(this, item);this.function=function;
    }
    public DoneableStatefulSetUpdateStrategy(StatefulSetUpdateStrategy item){
            super(item);this.builder=new StatefulSetUpdateStrategyBuilder(this, item);this.function=new Function<StatefulSetUpdateStrategy, StatefulSetUpdateStrategy>() {
    public StatefulSetUpdateStrategy apply(StatefulSetUpdateStrategy item) {
        return item;
    }
}
;
    }

    public StatefulSetUpdateStrategy done(){
             return function.apply(builder.build());
    }




}
