package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableScaleIOVolumeSource extends ScaleIOVolumeSourceFluentImpl<DoneableScaleIOVolumeSource> implements Doneable<ScaleIOVolumeSource>{

    private final ScaleIOVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ScaleIOVolumeSource,ScaleIOVolumeSource> function;

    public DoneableScaleIOVolumeSource(io.fabric8.kubernetes.api.builder.Function<ScaleIOVolumeSource,ScaleIOVolumeSource> function){
            super();this.builder=new ScaleIOVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableScaleIOVolumeSource(ScaleIOVolumeSource item,io.fabric8.kubernetes.api.builder.Function<ScaleIOVolumeSource,ScaleIOVolumeSource> function){
            super(item);this.builder=new ScaleIOVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableScaleIOVolumeSource(ScaleIOVolumeSource item){
            super(item);this.builder=new ScaleIOVolumeSourceBuilder(this, item);this.function=new Function<ScaleIOVolumeSource, ScaleIOVolumeSource>() {
    public ScaleIOVolumeSource apply(ScaleIOVolumeSource item) {
        return item;
    }
}
;
    }

    public ScaleIOVolumeSource done(){
             return function.apply(builder.build());
    }




}
