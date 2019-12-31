package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableReplicationControllerList extends ReplicationControllerListFluentImpl<DoneableReplicationControllerList> implements Doneable<ReplicationControllerList>{

    private final ReplicationControllerListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicationControllerList,ReplicationControllerList> function;

    public DoneableReplicationControllerList(io.fabric8.kubernetes.api.builder.Function<ReplicationControllerList,ReplicationControllerList> function){
            super();this.builder=new ReplicationControllerListBuilder(this);this.function=function;
    }
    public DoneableReplicationControllerList(ReplicationControllerList item,io.fabric8.kubernetes.api.builder.Function<ReplicationControllerList,ReplicationControllerList> function){
            super(item);this.builder=new ReplicationControllerListBuilder(this, item);this.function=function;
    }
    public DoneableReplicationControllerList(ReplicationControllerList item){
            super(item);this.builder=new ReplicationControllerListBuilder(this, item);this.function=new Function<ReplicationControllerList, ReplicationControllerList>() {
    public ReplicationControllerList apply(ReplicationControllerList item) {
        return item;
    }
}
;
    }

    public ReplicationControllerList done(){
             return function.apply(builder.build());
    }




}
