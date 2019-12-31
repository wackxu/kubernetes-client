package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableVsphereVirtualDiskVolumeSource extends VsphereVirtualDiskVolumeSourceFluentImpl<DoneableVsphereVirtualDiskVolumeSource> implements Doneable<VsphereVirtualDiskVolumeSource>{

    private final VsphereVirtualDiskVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<VsphereVirtualDiskVolumeSource,VsphereVirtualDiskVolumeSource> function;

    public DoneableVsphereVirtualDiskVolumeSource(io.fabric8.kubernetes.api.builder.Function<VsphereVirtualDiskVolumeSource,VsphereVirtualDiskVolumeSource> function){
            super();this.builder=new VsphereVirtualDiskVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableVsphereVirtualDiskVolumeSource(VsphereVirtualDiskVolumeSource item,io.fabric8.kubernetes.api.builder.Function<VsphereVirtualDiskVolumeSource,VsphereVirtualDiskVolumeSource> function){
            super(item);this.builder=new VsphereVirtualDiskVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableVsphereVirtualDiskVolumeSource(VsphereVirtualDiskVolumeSource item){
            super(item);this.builder=new VsphereVirtualDiskVolumeSourceBuilder(this, item);this.function=new Function<VsphereVirtualDiskVolumeSource, VsphereVirtualDiskVolumeSource>() {
    public VsphereVirtualDiskVolumeSource apply(VsphereVirtualDiskVolumeSource item) {
        return item;
    }
}
;
    }

    public VsphereVirtualDiskVolumeSource done(){
             return function.apply(builder.build());
    }




}
