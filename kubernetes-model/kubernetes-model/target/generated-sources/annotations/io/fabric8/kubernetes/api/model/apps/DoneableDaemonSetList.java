package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDaemonSetList extends DaemonSetListFluentImpl<DoneableDaemonSetList> implements Doneable<DaemonSetList>{

    private final DaemonSetListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DaemonSetList,DaemonSetList> function;

    public DoneableDaemonSetList(io.fabric8.kubernetes.api.builder.Function<DaemonSetList,DaemonSetList> function){
            super();this.builder=new DaemonSetListBuilder(this);this.function=function;
    }
    public DoneableDaemonSetList(DaemonSetList item,io.fabric8.kubernetes.api.builder.Function<DaemonSetList,DaemonSetList> function){
            super(item);this.builder=new DaemonSetListBuilder(this, item);this.function=function;
    }
    public DoneableDaemonSetList(DaemonSetList item){
            super(item);this.builder=new DaemonSetListBuilder(this, item);this.function=new Function<DaemonSetList, DaemonSetList>() {
    public DaemonSetList apply(DaemonSetList item) {
        return item;
    }
}
;
    }

    public DaemonSetList done(){
             return function.apply(builder.build());
    }




}
