package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableFCVolumeSource extends FCVolumeSourceFluentImpl<DoneableFCVolumeSource> implements Doneable<FCVolumeSource>{

    private final FCVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<FCVolumeSource,FCVolumeSource> function;

    public DoneableFCVolumeSource(io.fabric8.kubernetes.api.builder.Function<FCVolumeSource,FCVolumeSource> function){
            super();this.builder=new FCVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableFCVolumeSource(FCVolumeSource item,io.fabric8.kubernetes.api.builder.Function<FCVolumeSource,FCVolumeSource> function){
            super(item);this.builder=new FCVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableFCVolumeSource(FCVolumeSource item){
            super(item);this.builder=new FCVolumeSourceBuilder(this, item);this.function=new Function<FCVolumeSource, FCVolumeSource>() {
    public FCVolumeSource apply(FCVolumeSource item) {
        return item;
    }
}
;
    }

    public FCVolumeSource done(){
             return function.apply(builder.build());
    }




}
