package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableStorageOSPersistentVolumeSource extends StorageOSPersistentVolumeSourceFluentImpl<DoneableStorageOSPersistentVolumeSource> implements Doneable<StorageOSPersistentVolumeSource>{

    private final StorageOSPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StorageOSPersistentVolumeSource,StorageOSPersistentVolumeSource> function;

    public DoneableStorageOSPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<StorageOSPersistentVolumeSource,StorageOSPersistentVolumeSource> function){
            super();this.builder=new StorageOSPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableStorageOSPersistentVolumeSource(StorageOSPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<StorageOSPersistentVolumeSource,StorageOSPersistentVolumeSource> function){
            super(item);this.builder=new StorageOSPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableStorageOSPersistentVolumeSource(StorageOSPersistentVolumeSource item){
            super(item);this.builder=new StorageOSPersistentVolumeSourceBuilder(this, item);this.function=new Function<StorageOSPersistentVolumeSource, StorageOSPersistentVolumeSource>() {
    public StorageOSPersistentVolumeSource apply(StorageOSPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public StorageOSPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
