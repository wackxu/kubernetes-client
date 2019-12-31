package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStatefulSetList extends StatefulSetListFluentImpl<DoneableStatefulSetList> implements Doneable<StatefulSetList>{

    private final StatefulSetListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatefulSetList,StatefulSetList> function;

    public DoneableStatefulSetList(io.fabric8.kubernetes.api.builder.Function<StatefulSetList,StatefulSetList> function){
            super();this.builder=new StatefulSetListBuilder(this);this.function=function;
    }
    public DoneableStatefulSetList(StatefulSetList item,io.fabric8.kubernetes.api.builder.Function<StatefulSetList,StatefulSetList> function){
            super(item);this.builder=new StatefulSetListBuilder(this, item);this.function=function;
    }
    public DoneableStatefulSetList(StatefulSetList item){
            super(item);this.builder=new StatefulSetListBuilder(this, item);this.function=new Function<StatefulSetList, StatefulSetList>() {
    public StatefulSetList apply(StatefulSetList item) {
        return item;
    }
}
;
    }

    public StatefulSetList done(){
             return function.apply(builder.build());
    }




}
