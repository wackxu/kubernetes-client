package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableStorageOSVolumeSource extends StorageOSVolumeSourceFluentImpl<DoneableStorageOSVolumeSource> implements Doneable<StorageOSVolumeSource>{

    private final StorageOSVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StorageOSVolumeSource,StorageOSVolumeSource> function;

    public DoneableStorageOSVolumeSource(io.fabric8.kubernetes.api.builder.Function<StorageOSVolumeSource,StorageOSVolumeSource> function){
            super();this.builder=new StorageOSVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableStorageOSVolumeSource(StorageOSVolumeSource item,io.fabric8.kubernetes.api.builder.Function<StorageOSVolumeSource,StorageOSVolumeSource> function){
            super(item);this.builder=new StorageOSVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableStorageOSVolumeSource(StorageOSVolumeSource item){
            super(item);this.builder=new StorageOSVolumeSourceBuilder(this, item);this.function=new Function<StorageOSVolumeSource, StorageOSVolumeSource>() {
    public StorageOSVolumeSource apply(StorageOSVolumeSource item) {
        return item;
    }
}
;
    }

    public StorageOSVolumeSource done(){
             return function.apply(builder.build());
    }




}
