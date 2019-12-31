package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeClaimStatus extends PersistentVolumeClaimStatusFluentImpl<DoneablePersistentVolumeClaimStatus> implements Doneable<PersistentVolumeClaimStatus>{

    private final PersistentVolumeClaimStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimStatus,PersistentVolumeClaimStatus> function;

    public DoneablePersistentVolumeClaimStatus(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimStatus,PersistentVolumeClaimStatus> function){
            super();this.builder=new PersistentVolumeClaimStatusBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeClaimStatus(PersistentVolumeClaimStatus item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimStatus,PersistentVolumeClaimStatus> function){
            super(item);this.builder=new PersistentVolumeClaimStatusBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeClaimStatus(PersistentVolumeClaimStatus item){
            super(item);this.builder=new PersistentVolumeClaimStatusBuilder(this, item);this.function=new Function<PersistentVolumeClaimStatus, PersistentVolumeClaimStatus>() {
    public PersistentVolumeClaimStatus apply(PersistentVolumeClaimStatus item) {
        return item;
    }
}
;
    }

    public PersistentVolumeClaimStatus done(){
             return function.apply(builder.build());
    }




}
