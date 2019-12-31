package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEmptyDirVolumeSource extends EmptyDirVolumeSourceFluentImpl<DoneableEmptyDirVolumeSource> implements Doneable<EmptyDirVolumeSource>{

    private final EmptyDirVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EmptyDirVolumeSource,EmptyDirVolumeSource> function;

    public DoneableEmptyDirVolumeSource(io.fabric8.kubernetes.api.builder.Function<EmptyDirVolumeSource,EmptyDirVolumeSource> function){
            super();this.builder=new EmptyDirVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableEmptyDirVolumeSource(EmptyDirVolumeSource item,io.fabric8.kubernetes.api.builder.Function<EmptyDirVolumeSource,EmptyDirVolumeSource> function){
            super(item);this.builder=new EmptyDirVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableEmptyDirVolumeSource(EmptyDirVolumeSource item){
            super(item);this.builder=new EmptyDirVolumeSourceBuilder(this, item);this.function=new Function<EmptyDirVolumeSource, EmptyDirVolumeSource>() {
    public EmptyDirVolumeSource apply(EmptyDirVolumeSource item) {
        return item;
    }
}
;
    }

    public EmptyDirVolumeSource done(){
             return function.apply(builder.build());
    }




}
