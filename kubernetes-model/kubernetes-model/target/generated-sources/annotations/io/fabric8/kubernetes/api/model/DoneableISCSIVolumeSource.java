package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableISCSIVolumeSource extends ISCSIVolumeSourceFluentImpl<DoneableISCSIVolumeSource> implements Doneable<ISCSIVolumeSource>{

    private final ISCSIVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ISCSIVolumeSource,ISCSIVolumeSource> function;

    public DoneableISCSIVolumeSource(io.fabric8.kubernetes.api.builder.Function<ISCSIVolumeSource,ISCSIVolumeSource> function){
            super();this.builder=new ISCSIVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableISCSIVolumeSource(ISCSIVolumeSource item,io.fabric8.kubernetes.api.builder.Function<ISCSIVolumeSource,ISCSIVolumeSource> function){
            super(item);this.builder=new ISCSIVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableISCSIVolumeSource(ISCSIVolumeSource item){
            super(item);this.builder=new ISCSIVolumeSourceBuilder(this, item);this.function=new Function<ISCSIVolumeSource, ISCSIVolumeSource>() {
    public ISCSIVolumeSource apply(ISCSIVolumeSource item) {
        return item;
    }
}
;
    }

    public ISCSIVolumeSource done(){
             return function.apply(builder.build());
    }




}
