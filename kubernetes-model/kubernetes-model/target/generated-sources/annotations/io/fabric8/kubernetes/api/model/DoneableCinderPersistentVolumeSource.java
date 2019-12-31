package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCinderPersistentVolumeSource extends CinderPersistentVolumeSourceFluentImpl<DoneableCinderPersistentVolumeSource> implements Doneable<CinderPersistentVolumeSource>{

    private final CinderPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CinderPersistentVolumeSource,CinderPersistentVolumeSource> function;

    public DoneableCinderPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<CinderPersistentVolumeSource,CinderPersistentVolumeSource> function){
            super();this.builder=new CinderPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableCinderPersistentVolumeSource(CinderPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<CinderPersistentVolumeSource,CinderPersistentVolumeSource> function){
            super(item);this.builder=new CinderPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableCinderPersistentVolumeSource(CinderPersistentVolumeSource item){
            super(item);this.builder=new CinderPersistentVolumeSourceBuilder(this, item);this.function=new Function<CinderPersistentVolumeSource, CinderPersistentVolumeSource>() {
    public CinderPersistentVolumeSource apply(CinderPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public CinderPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
