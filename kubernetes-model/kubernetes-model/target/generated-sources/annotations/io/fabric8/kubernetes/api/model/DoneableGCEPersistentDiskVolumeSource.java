package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableGCEPersistentDiskVolumeSource extends GCEPersistentDiskVolumeSourceFluentImpl<DoneableGCEPersistentDiskVolumeSource> implements Doneable<GCEPersistentDiskVolumeSource>{

    private final GCEPersistentDiskVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GCEPersistentDiskVolumeSource,GCEPersistentDiskVolumeSource> function;

    public DoneableGCEPersistentDiskVolumeSource(io.fabric8.kubernetes.api.builder.Function<GCEPersistentDiskVolumeSource,GCEPersistentDiskVolumeSource> function){
            super();this.builder=new GCEPersistentDiskVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableGCEPersistentDiskVolumeSource(GCEPersistentDiskVolumeSource item,io.fabric8.kubernetes.api.builder.Function<GCEPersistentDiskVolumeSource,GCEPersistentDiskVolumeSource> function){
            super(item);this.builder=new GCEPersistentDiskVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableGCEPersistentDiskVolumeSource(GCEPersistentDiskVolumeSource item){
            super(item);this.builder=new GCEPersistentDiskVolumeSourceBuilder(this, item);this.function=new Function<GCEPersistentDiskVolumeSource, GCEPersistentDiskVolumeSource>() {
    public GCEPersistentDiskVolumeSource apply(GCEPersistentDiskVolumeSource item) {
        return item;
    }
}
;
    }

    public GCEPersistentDiskVolumeSource done(){
             return function.apply(builder.build());
    }




}
