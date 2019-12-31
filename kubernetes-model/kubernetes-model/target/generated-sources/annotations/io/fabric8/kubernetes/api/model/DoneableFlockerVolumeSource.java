package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableFlockerVolumeSource extends FlockerVolumeSourceFluentImpl<DoneableFlockerVolumeSource> implements Doneable<FlockerVolumeSource>{

    private final FlockerVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<FlockerVolumeSource,FlockerVolumeSource> function;

    public DoneableFlockerVolumeSource(io.fabric8.kubernetes.api.builder.Function<FlockerVolumeSource,FlockerVolumeSource> function){
            super();this.builder=new FlockerVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableFlockerVolumeSource(FlockerVolumeSource item,io.fabric8.kubernetes.api.builder.Function<FlockerVolumeSource,FlockerVolumeSource> function){
            super(item);this.builder=new FlockerVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableFlockerVolumeSource(FlockerVolumeSource item){
            super(item);this.builder=new FlockerVolumeSourceBuilder(this, item);this.function=new Function<FlockerVolumeSource, FlockerVolumeSource>() {
    public FlockerVolumeSource apply(FlockerVolumeSource item) {
        return item;
    }
}
;
    }

    public FlockerVolumeSource done(){
             return function.apply(builder.build());
    }




}
