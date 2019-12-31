package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableISCSIPersistentVolumeSource extends ISCSIPersistentVolumeSourceFluentImpl<DoneableISCSIPersistentVolumeSource> implements Doneable<ISCSIPersistentVolumeSource>{

    private final ISCSIPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ISCSIPersistentVolumeSource,ISCSIPersistentVolumeSource> function;

    public DoneableISCSIPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<ISCSIPersistentVolumeSource,ISCSIPersistentVolumeSource> function){
            super();this.builder=new ISCSIPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableISCSIPersistentVolumeSource(ISCSIPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<ISCSIPersistentVolumeSource,ISCSIPersistentVolumeSource> function){
            super(item);this.builder=new ISCSIPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableISCSIPersistentVolumeSource(ISCSIPersistentVolumeSource item){
            super(item);this.builder=new ISCSIPersistentVolumeSourceBuilder(this, item);this.function=new Function<ISCSIPersistentVolumeSource, ISCSIPersistentVolumeSource>() {
    public ISCSIPersistentVolumeSource apply(ISCSIPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public ISCSIPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
