package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableGlusterfsPersistentVolumeSource extends GlusterfsPersistentVolumeSourceFluentImpl<DoneableGlusterfsPersistentVolumeSource> implements Doneable<GlusterfsPersistentVolumeSource>{

    private final GlusterfsPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GlusterfsPersistentVolumeSource,GlusterfsPersistentVolumeSource> function;

    public DoneableGlusterfsPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<GlusterfsPersistentVolumeSource,GlusterfsPersistentVolumeSource> function){
            super();this.builder=new GlusterfsPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableGlusterfsPersistentVolumeSource(GlusterfsPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<GlusterfsPersistentVolumeSource,GlusterfsPersistentVolumeSource> function){
            super(item);this.builder=new GlusterfsPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableGlusterfsPersistentVolumeSource(GlusterfsPersistentVolumeSource item){
            super(item);this.builder=new GlusterfsPersistentVolumeSourceBuilder(this, item);this.function=new Function<GlusterfsPersistentVolumeSource, GlusterfsPersistentVolumeSource>() {
    public GlusterfsPersistentVolumeSource apply(GlusterfsPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public GlusterfsPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
