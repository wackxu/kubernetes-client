package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeClaimVolumeSource extends PersistentVolumeClaimVolumeSourceFluentImpl<DoneablePersistentVolumeClaimVolumeSource> implements Doneable<PersistentVolumeClaimVolumeSource>{

    private final PersistentVolumeClaimVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimVolumeSource,PersistentVolumeClaimVolumeSource> function;

    public DoneablePersistentVolumeClaimVolumeSource(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimVolumeSource,PersistentVolumeClaimVolumeSource> function){
            super();this.builder=new PersistentVolumeClaimVolumeSourceBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeClaimVolumeSource(PersistentVolumeClaimVolumeSource item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimVolumeSource,PersistentVolumeClaimVolumeSource> function){
            super(item);this.builder=new PersistentVolumeClaimVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeClaimVolumeSource(PersistentVolumeClaimVolumeSource item){
            super(item);this.builder=new PersistentVolumeClaimVolumeSourceBuilder(this, item);this.function=new Function<PersistentVolumeClaimVolumeSource, PersistentVolumeClaimVolumeSource>() {
    public PersistentVolumeClaimVolumeSource apply(PersistentVolumeClaimVolumeSource item) {
        return item;
    }
}
;
    }

    public PersistentVolumeClaimVolumeSource done(){
             return function.apply(builder.build());
    }




}
