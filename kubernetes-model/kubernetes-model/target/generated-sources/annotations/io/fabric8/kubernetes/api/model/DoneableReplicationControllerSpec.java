package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableReplicationControllerSpec extends ReplicationControllerSpecFluentImpl<DoneableReplicationControllerSpec> implements Doneable<ReplicationControllerSpec>{

    private final ReplicationControllerSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicationControllerSpec,ReplicationControllerSpec> function;

    public DoneableReplicationControllerSpec(io.fabric8.kubernetes.api.builder.Function<ReplicationControllerSpec,ReplicationControllerSpec> function){
            super();this.builder=new ReplicationControllerSpecBuilder(this);this.function=function;
    }
    public DoneableReplicationControllerSpec(ReplicationControllerSpec item,io.fabric8.kubernetes.api.builder.Function<ReplicationControllerSpec,ReplicationControllerSpec> function){
            super(item);this.builder=new ReplicationControllerSpecBuilder(this, item);this.function=function;
    }
    public DoneableReplicationControllerSpec(ReplicationControllerSpec item){
            super(item);this.builder=new ReplicationControllerSpecBuilder(this, item);this.function=new Function<ReplicationControllerSpec, ReplicationControllerSpec>() {
    public ReplicationControllerSpec apply(ReplicationControllerSpec item) {
        return item;
    }
}
;
    }

    public ReplicationControllerSpec done(){
             return function.apply(builder.build());
    }




}
