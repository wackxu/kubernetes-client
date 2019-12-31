package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePhotonPersistentDiskVolumeSource extends PhotonPersistentDiskVolumeSourceFluentImpl<DoneablePhotonPersistentDiskVolumeSource> implements Doneable<PhotonPersistentDiskVolumeSource>{

    private final PhotonPersistentDiskVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PhotonPersistentDiskVolumeSource,PhotonPersistentDiskVolumeSource> function;

    public DoneablePhotonPersistentDiskVolumeSource(io.fabric8.kubernetes.api.builder.Function<PhotonPersistentDiskVolumeSource,PhotonPersistentDiskVolumeSource> function){
            super();this.builder=new PhotonPersistentDiskVolumeSourceBuilder(this);this.function=function;
    }
    public DoneablePhotonPersistentDiskVolumeSource(PhotonPersistentDiskVolumeSource item,io.fabric8.kubernetes.api.builder.Function<PhotonPersistentDiskVolumeSource,PhotonPersistentDiskVolumeSource> function){
            super(item);this.builder=new PhotonPersistentDiskVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneablePhotonPersistentDiskVolumeSource(PhotonPersistentDiskVolumeSource item){
            super(item);this.builder=new PhotonPersistentDiskVolumeSourceBuilder(this, item);this.function=new Function<PhotonPersistentDiskVolumeSource, PhotonPersistentDiskVolumeSource>() {
    public PhotonPersistentDiskVolumeSource apply(PhotonPersistentDiskVolumeSource item) {
        return item;
    }
}
;
    }

    public PhotonPersistentDiskVolumeSource done(){
             return function.apply(builder.build());
    }




}
