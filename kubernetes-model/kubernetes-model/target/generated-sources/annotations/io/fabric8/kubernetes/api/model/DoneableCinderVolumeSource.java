package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCinderVolumeSource extends CinderVolumeSourceFluentImpl<DoneableCinderVolumeSource> implements Doneable<CinderVolumeSource>{

    private final CinderVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CinderVolumeSource,CinderVolumeSource> function;

    public DoneableCinderVolumeSource(io.fabric8.kubernetes.api.builder.Function<CinderVolumeSource,CinderVolumeSource> function){
            super();this.builder=new CinderVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableCinderVolumeSource(CinderVolumeSource item,io.fabric8.kubernetes.api.builder.Function<CinderVolumeSource,CinderVolumeSource> function){
            super(item);this.builder=new CinderVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableCinderVolumeSource(CinderVolumeSource item){
            super(item);this.builder=new CinderVolumeSourceBuilder(this, item);this.function=new Function<CinderVolumeSource, CinderVolumeSource>() {
    public CinderVolumeSource apply(CinderVolumeSource item) {
        return item;
    }
}
;
    }

    public CinderVolumeSource done(){
             return function.apply(builder.build());
    }




}
