package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableReplicaSetSpec extends ReplicaSetSpecFluentImpl<DoneableReplicaSetSpec> implements Doneable<ReplicaSetSpec>{

    private final ReplicaSetSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ReplicaSetSpec,ReplicaSetSpec> function;

    public DoneableReplicaSetSpec(io.fabric8.kubernetes.api.builder.Function<ReplicaSetSpec,ReplicaSetSpec> function){
            super();this.builder=new ReplicaSetSpecBuilder(this);this.function=function;
    }
    public DoneableReplicaSetSpec(ReplicaSetSpec item,io.fabric8.kubernetes.api.builder.Function<ReplicaSetSpec,ReplicaSetSpec> function){
            super(item);this.builder=new ReplicaSetSpecBuilder(this, item);this.function=function;
    }
    public DoneableReplicaSetSpec(ReplicaSetSpec item){
            super(item);this.builder=new ReplicaSetSpecBuilder(this, item);this.function=new Function<ReplicaSetSpec, ReplicaSetSpec>() {
    public ReplicaSetSpec apply(ReplicaSetSpec item) {
        return item;
    }
}
;
    }

    public ReplicaSetSpec done(){
             return function.apply(builder.build());
    }




}
