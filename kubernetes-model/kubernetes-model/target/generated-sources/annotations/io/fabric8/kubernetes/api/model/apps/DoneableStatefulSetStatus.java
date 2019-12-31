package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStatefulSetStatus extends StatefulSetStatusFluentImpl<DoneableStatefulSetStatus> implements Doneable<StatefulSetStatus>{

    private final StatefulSetStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatefulSetStatus,StatefulSetStatus> function;

    public DoneableStatefulSetStatus(io.fabric8.kubernetes.api.builder.Function<StatefulSetStatus,StatefulSetStatus> function){
            super();this.builder=new StatefulSetStatusBuilder(this);this.function=function;
    }
    public DoneableStatefulSetStatus(StatefulSetStatus item,io.fabric8.kubernetes.api.builder.Function<StatefulSetStatus,StatefulSetStatus> function){
            super(item);this.builder=new StatefulSetStatusBuilder(this, item);this.function=function;
    }
    public DoneableStatefulSetStatus(StatefulSetStatus item){
            super(item);this.builder=new StatefulSetStatusBuilder(this, item);this.function=new Function<StatefulSetStatus, StatefulSetStatus>() {
    public StatefulSetStatus apply(StatefulSetStatus item) {
        return item;
    }
}
;
    }

    public StatefulSetStatus done(){
             return function.apply(builder.build());
    }




}
