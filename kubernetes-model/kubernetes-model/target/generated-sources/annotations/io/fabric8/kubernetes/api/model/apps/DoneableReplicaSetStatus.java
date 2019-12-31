package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableReplicaSetStatus extends ReplicaSetStatusFluentImpl<DoneableReplicaSetStatus> implements Doneable<ReplicaSetStatus>{

    private final ReplicaSetStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicaSetStatus,ReplicaSetStatus> function;

    public DoneableReplicaSetStatus(io.fabric8.kubernetes.api.builder.Function<ReplicaSetStatus,ReplicaSetStatus> function){
            super();this.builder=new ReplicaSetStatusBuilder(this);this.function=function;
    }
    public DoneableReplicaSetStatus(ReplicaSetStatus item,io.fabric8.kubernetes.api.builder.Function<ReplicaSetStatus,ReplicaSetStatus> function){
            super(item);this.builder=new ReplicaSetStatusBuilder(this, item);this.function=function;
    }
    public DoneableReplicaSetStatus(ReplicaSetStatus item){
            super(item);this.builder=new ReplicaSetStatusBuilder(this, item);this.function=new Function<ReplicaSetStatus, ReplicaSetStatus>() {
    public ReplicaSetStatus apply(ReplicaSetStatus item) {
        return item;
    }
}
;
    }

    public ReplicaSetStatus done(){
             return function.apply(builder.build());
    }




}
