package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableReplicaSetCondition extends ReplicaSetConditionFluentImpl<DoneableReplicaSetCondition> implements Doneable<ReplicaSetCondition>{

    private final ReplicaSetConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicaSetCondition,ReplicaSetCondition> function;

    public DoneableReplicaSetCondition(io.fabric8.kubernetes.api.builder.Function<ReplicaSetCondition,ReplicaSetCondition> function){
            super();this.builder=new ReplicaSetConditionBuilder(this);this.function=function;
    }
    public DoneableReplicaSetCondition(ReplicaSetCondition item,io.fabric8.kubernetes.api.builder.Function<ReplicaSetCondition,ReplicaSetCondition> function){
            super(item);this.builder=new ReplicaSetConditionBuilder(this, item);this.function=function;
    }
    public DoneableReplicaSetCondition(ReplicaSetCondition item){
            super(item);this.builder=new ReplicaSetConditionBuilder(this, item);this.function=new Function<ReplicaSetCondition, ReplicaSetCondition>() {
    public ReplicaSetCondition apply(ReplicaSetCondition item) {
        return item;
    }
}
;
    }

    public ReplicaSetCondition done(){
             return function.apply(builder.build());
    }




}
