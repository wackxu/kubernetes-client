package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStatefulSet extends StatefulSetFluentImpl<DoneableStatefulSet> implements Doneable<StatefulSet>{

    private final StatefulSetBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatefulSet,StatefulSet> function;

    public DoneableStatefulSet(io.fabric8.kubernetes.api.builder.Function<StatefulSet,StatefulSet> function){
            super();this.builder=new StatefulSetBuilder(this);this.function=function;
    }
    public DoneableStatefulSet(StatefulSet item,io.fabric8.kubernetes.api.builder.Function<StatefulSet,StatefulSet> function){
            super(item);this.builder=new StatefulSetBuilder(this, item);this.function=function;
    }
    public DoneableStatefulSet(StatefulSet item){
            super(item);this.builder=new StatefulSetBuilder(this, item);this.function=new Function<StatefulSet, StatefulSet>() {
    public StatefulSet apply(StatefulSet item) {
        return item;
    }
}
;
    }

    public StatefulSet done(){
             return function.apply(builder.build());
    }




}
