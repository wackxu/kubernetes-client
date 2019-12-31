package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCephFSPersistentVolumeSource extends CephFSPersistentVolumeSourceFluentImpl<DoneableCephFSPersistentVolumeSource> implements Doneable<CephFSPersistentVolumeSource>{

    private final CephFSPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CephFSPersistentVolumeSource,CephFSPersistentVolumeSource> function;

    public DoneableCephFSPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<CephFSPersistentVolumeSource,CephFSPersistentVolumeSource> function){
            super();this.builder=new CephFSPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableCephFSPersistentVolumeSource(CephFSPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<CephFSPersistentVolumeSource,CephFSPersistentVolumeSource> function){
            super(item);this.builder=new CephFSPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableCephFSPersistentVolumeSource(CephFSPersistentVolumeSource item){
            super(item);this.builder=new CephFSPersistentVolumeSourceBuilder(this, item);this.function=new Function<CephFSPersistentVolumeSource, CephFSPersistentVolumeSource>() {
    public CephFSPersistentVolumeSource apply(CephFSPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public CephFSPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
