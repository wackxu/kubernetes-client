package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableGlusterfsVolumeSource extends GlusterfsVolumeSourceFluentImpl<DoneableGlusterfsVolumeSource> implements Doneable<GlusterfsVolumeSource>{

    private final GlusterfsVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GlusterfsVolumeSource,GlusterfsVolumeSource> function;

    public DoneableGlusterfsVolumeSource(io.fabric8.kubernetes.api.builder.Function<GlusterfsVolumeSource,GlusterfsVolumeSource> function){
            super();this.builder=new GlusterfsVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableGlusterfsVolumeSource(GlusterfsVolumeSource item,io.fabric8.kubernetes.api.builder.Function<GlusterfsVolumeSource,GlusterfsVolumeSource> function){
            super(item);this.builder=new GlusterfsVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableGlusterfsVolumeSource(GlusterfsVolumeSource item){
            super(item);this.builder=new GlusterfsVolumeSourceBuilder(this, item);this.function=new Function<GlusterfsVolumeSource, GlusterfsVolumeSource>() {
    public GlusterfsVolumeSource apply(GlusterfsVolumeSource item) {
        return item;
    }
}
;
    }

    public GlusterfsVolumeSource done(){
             return function.apply(builder.build());
    }




}
