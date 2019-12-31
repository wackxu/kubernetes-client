package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeStatus extends PersistentVolumeStatusFluentImpl<DoneablePersistentVolumeStatus> implements Doneable<PersistentVolumeStatus>{

    private final PersistentVolumeStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeStatus,PersistentVolumeStatus> function;

    public DoneablePersistentVolumeStatus(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeStatus,PersistentVolumeStatus> function){
            super();this.builder=new PersistentVolumeStatusBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeStatus(PersistentVolumeStatus item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeStatus,PersistentVolumeStatus> function){
            super(item);this.builder=new PersistentVolumeStatusBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeStatus(PersistentVolumeStatus item){
            super(item);this.builder=new PersistentVolumeStatusBuilder(this, item);this.function=new Function<PersistentVolumeStatus, PersistentVolumeStatus>() {
    public PersistentVolumeStatus apply(PersistentVolumeStatus item) {
        return item;
    }
}
;
    }

    public PersistentVolumeStatus done(){
             return function.apply(builder.build());
    }




}
