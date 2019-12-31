package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableReplicationController extends ReplicationControllerFluentImpl<DoneableReplicationController> implements Doneable<ReplicationController>{

    private final ReplicationControllerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicationController,ReplicationController> function;

    public DoneableReplicationController(io.fabric8.kubernetes.api.builder.Function<ReplicationController,ReplicationController> function){
            super();this.builder=new ReplicationControllerBuilder(this);this.function=function;
    }
    public DoneableReplicationController(ReplicationController item,io.fabric8.kubernetes.api.builder.Function<ReplicationController,ReplicationController> function){
            super(item);this.builder=new ReplicationControllerBuilder(this, item);this.function=function;
    }
    public DoneableReplicationController(ReplicationController item){
            super(item);this.builder=new ReplicationControllerBuilder(this, item);this.function=new Function<ReplicationController, ReplicationController>() {
    public ReplicationController apply(ReplicationController item) {
        return item;
    }
}
;
    }

    public ReplicationController done(){
             return function.apply(builder.build());
    }




}
