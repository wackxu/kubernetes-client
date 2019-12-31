package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableScaleIOPersistentVolumeSource extends ScaleIOPersistentVolumeSourceFluentImpl<DoneableScaleIOPersistentVolumeSource> implements Doneable<ScaleIOPersistentVolumeSource>{

    private final ScaleIOPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ScaleIOPersistentVolumeSource,ScaleIOPersistentVolumeSource> function;

    public DoneableScaleIOPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<ScaleIOPersistentVolumeSource,ScaleIOPersistentVolumeSource> function){
            super();this.builder=new ScaleIOPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableScaleIOPersistentVolumeSource(ScaleIOPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<ScaleIOPersistentVolumeSource,ScaleIOPersistentVolumeSource> function){
            super(item);this.builder=new ScaleIOPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableScaleIOPersistentVolumeSource(ScaleIOPersistentVolumeSource item){
            super(item);this.builder=new ScaleIOPersistentVolumeSourceBuilder(this, item);this.function=new Function<ScaleIOPersistentVolumeSource, ScaleIOPersistentVolumeSource>() {
    public ScaleIOPersistentVolumeSource apply(ScaleIOPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public ScaleIOPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
