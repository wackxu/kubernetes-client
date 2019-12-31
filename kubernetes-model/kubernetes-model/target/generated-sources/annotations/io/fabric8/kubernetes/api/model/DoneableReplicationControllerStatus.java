package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableReplicationControllerStatus extends ReplicationControllerStatusFluentImpl<DoneableReplicationControllerStatus> implements Doneable<ReplicationControllerStatus>{

    private final ReplicationControllerStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicationControllerStatus,ReplicationControllerStatus> function;

    public DoneableReplicationControllerStatus(io.fabric8.kubernetes.api.builder.Function<ReplicationControllerStatus,ReplicationControllerStatus> function){
            super();this.builder=new ReplicationControllerStatusBuilder(this);this.function=function;
    }
    public DoneableReplicationControllerStatus(ReplicationControllerStatus item,io.fabric8.kubernetes.api.builder.Function<ReplicationControllerStatus,ReplicationControllerStatus> function){
            super(item);this.builder=new ReplicationControllerStatusBuilder(this, item);this.function=function;
    }
    public DoneableReplicationControllerStatus(ReplicationControllerStatus item){
            super(item);this.builder=new ReplicationControllerStatusBuilder(this, item);this.function=new Function<ReplicationControllerStatus, ReplicationControllerStatus>() {
    public ReplicationControllerStatus apply(ReplicationControllerStatus item) {
        return item;
    }
}
;
    }

    public ReplicationControllerStatus done(){
             return function.apply(builder.build());
    }




}
