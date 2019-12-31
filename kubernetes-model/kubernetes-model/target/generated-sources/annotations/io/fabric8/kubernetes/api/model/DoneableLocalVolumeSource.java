package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLocalVolumeSource extends LocalVolumeSourceFluentImpl<DoneableLocalVolumeSource> implements Doneable<LocalVolumeSource>{

    private final LocalVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LocalVolumeSource,LocalVolumeSource> function;

    public DoneableLocalVolumeSource(io.fabric8.kubernetes.api.builder.Function<LocalVolumeSource,LocalVolumeSource> function){
            super();this.builder=new LocalVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableLocalVolumeSource(LocalVolumeSource item,io.fabric8.kubernetes.api.builder.Function<LocalVolumeSource,LocalVolumeSource> function){
            super(item);this.builder=new LocalVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableLocalVolumeSource(LocalVolumeSource item){
            super(item);this.builder=new LocalVolumeSourceBuilder(this, item);this.function=new Function<LocalVolumeSource, LocalVolumeSource>() {
    public LocalVolumeSource apply(LocalVolumeSource item) {
        return item;
    }
}
;
    }

    public LocalVolumeSource done(){
             return function.apply(builder.build());
    }




}
