package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCephFSVolumeSource extends CephFSVolumeSourceFluentImpl<DoneableCephFSVolumeSource> implements Doneable<CephFSVolumeSource>{

    private final CephFSVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CephFSVolumeSource,CephFSVolumeSource> function;

    public DoneableCephFSVolumeSource(io.fabric8.kubernetes.api.builder.Function<CephFSVolumeSource,CephFSVolumeSource> function){
            super();this.builder=new CephFSVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableCephFSVolumeSource(CephFSVolumeSource item,io.fabric8.kubernetes.api.builder.Function<CephFSVolumeSource,CephFSVolumeSource> function){
            super(item);this.builder=new CephFSVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableCephFSVolumeSource(CephFSVolumeSource item){
            super(item);this.builder=new CephFSVolumeSourceBuilder(this, item);this.function=new Function<CephFSVolumeSource, CephFSVolumeSource>() {
    public CephFSVolumeSource apply(CephFSVolumeSource item) {
        return item;
    }
}
;
    }

    public CephFSVolumeSource done(){
             return function.apply(builder.build());
    }




}
