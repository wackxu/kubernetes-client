package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHostPathVolumeSource extends HostPathVolumeSourceFluentImpl<DoneableHostPathVolumeSource> implements Doneable<HostPathVolumeSource>{

    private final HostPathVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HostPathVolumeSource,HostPathVolumeSource> function;

    public DoneableHostPathVolumeSource(io.fabric8.kubernetes.api.builder.Function<HostPathVolumeSource,HostPathVolumeSource> function){
            super();this.builder=new HostPathVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableHostPathVolumeSource(HostPathVolumeSource item,io.fabric8.kubernetes.api.builder.Function<HostPathVolumeSource,HostPathVolumeSource> function){
            super(item);this.builder=new HostPathVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableHostPathVolumeSource(HostPathVolumeSource item){
            super(item);this.builder=new HostPathVolumeSourceBuilder(this, item);this.function=new Function<HostPathVolumeSource, HostPathVolumeSource>() {
    public HostPathVolumeSource apply(HostPathVolumeSource item) {
        return item;
    }
}
;
    }

    public HostPathVolumeSource done(){
             return function.apply(builder.build());
    }




}
