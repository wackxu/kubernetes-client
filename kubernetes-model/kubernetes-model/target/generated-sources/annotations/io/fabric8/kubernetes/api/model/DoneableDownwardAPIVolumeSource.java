package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableDownwardAPIVolumeSource extends DownwardAPIVolumeSourceFluentImpl<DoneableDownwardAPIVolumeSource> implements Doneable<DownwardAPIVolumeSource>{

    private final DownwardAPIVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DownwardAPIVolumeSource,DownwardAPIVolumeSource> function;

    public DoneableDownwardAPIVolumeSource(io.fabric8.kubernetes.api.builder.Function<DownwardAPIVolumeSource,DownwardAPIVolumeSource> function){
            super();this.builder=new DownwardAPIVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableDownwardAPIVolumeSource(DownwardAPIVolumeSource item,io.fabric8.kubernetes.api.builder.Function<DownwardAPIVolumeSource,DownwardAPIVolumeSource> function){
            super(item);this.builder=new DownwardAPIVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableDownwardAPIVolumeSource(DownwardAPIVolumeSource item){
            super(item);this.builder=new DownwardAPIVolumeSourceBuilder(this, item);this.function=new Function<DownwardAPIVolumeSource, DownwardAPIVolumeSource>() {
    public DownwardAPIVolumeSource apply(DownwardAPIVolumeSource item) {
        return item;
    }
}
;
    }

    public DownwardAPIVolumeSource done(){
             return function.apply(builder.build());
    }




}
