package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableReplicaSet extends ReplicaSetFluentImpl<DoneableReplicaSet> implements Doneable<ReplicaSet>{

    private final ReplicaSetBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicaSet,ReplicaSet> function;

    public DoneableReplicaSet(io.fabric8.kubernetes.api.builder.Function<ReplicaSet,ReplicaSet> function){
            super();this.builder=new ReplicaSetBuilder(this);this.function=function;
    }
    public DoneableReplicaSet(ReplicaSet item,io.fabric8.kubernetes.api.builder.Function<ReplicaSet,ReplicaSet> function){
            super(item);this.builder=new ReplicaSetBuilder(this, item);this.function=function;
    }
    public DoneableReplicaSet(ReplicaSet item){
            super(item);this.builder=new ReplicaSetBuilder(this, item);this.function=new Function<ReplicaSet, ReplicaSet>() {
    public ReplicaSet apply(ReplicaSet item) {
        return item;
    }
}
;
    }

    public ReplicaSet done(){
             return function.apply(builder.build());
    }




}
