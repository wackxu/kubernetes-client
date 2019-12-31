package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableReplicationControllerCondition extends ReplicationControllerConditionFluentImpl<DoneableReplicationControllerCondition> implements Doneable<ReplicationControllerCondition>{

    private final ReplicationControllerConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicationControllerCondition,ReplicationControllerCondition> function;

    public DoneableReplicationControllerCondition(io.fabric8.kubernetes.api.builder.Function<ReplicationControllerCondition,ReplicationControllerCondition> function){
            super();this.builder=new ReplicationControllerConditionBuilder(this);this.function=function;
    }
    public DoneableReplicationControllerCondition(ReplicationControllerCondition item,io.fabric8.kubernetes.api.builder.Function<ReplicationControllerCondition,ReplicationControllerCondition> function){
            super(item);this.builder=new ReplicationControllerConditionBuilder(this, item);this.function=function;
    }
    public DoneableReplicationControllerCondition(ReplicationControllerCondition item){
            super(item);this.builder=new ReplicationControllerConditionBuilder(this, item);this.function=new Function<ReplicationControllerCondition, ReplicationControllerCondition>() {
    public ReplicationControllerCondition apply(ReplicationControllerCondition item) {
        return item;
    }
}
;
    }

    public ReplicationControllerCondition done(){
             return function.apply(builder.build());
    }




}
