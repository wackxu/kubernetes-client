package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableReplicaSetList extends ReplicaSetListFluentImpl<DoneableReplicaSetList> implements Doneable<ReplicaSetList>{

    private final ReplicaSetListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicaSetList,ReplicaSetList> function;

    public DoneableReplicaSetList(io.fabric8.kubernetes.api.builder.Function<ReplicaSetList,ReplicaSetList> function){
            super();this.builder=new ReplicaSetListBuilder(this);this.function=function;
    }
    public DoneableReplicaSetList(ReplicaSetList item,io.fabric8.kubernetes.api.builder.Function<ReplicaSetList,ReplicaSetList> function){
            super(item);this.builder=new ReplicaSetListBuilder(this, item);this.function=function;
    }
    public DoneableReplicaSetList(ReplicaSetList item){
            super(item);this.builder=new ReplicaSetListBuilder(this, item);this.function=new Function<ReplicaSetList, ReplicaSetList>() {
    public ReplicaSetList apply(ReplicaSetList item) {
        return item;
    }
}
;
    }

    public ReplicaSetList done(){
             return function.apply(builder.build());
    }




}
