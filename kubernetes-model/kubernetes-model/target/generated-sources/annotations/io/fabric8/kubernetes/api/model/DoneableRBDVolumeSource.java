package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableRBDVolumeSource extends RBDVolumeSourceFluentImpl<DoneableRBDVolumeSource> implements Doneable<RBDVolumeSource>{

    private final RBDVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RBDVolumeSource,RBDVolumeSource> function;

    public DoneableRBDVolumeSource(io.fabric8.kubernetes.api.builder.Function<RBDVolumeSource,RBDVolumeSource> function){
            super();this.builder=new RBDVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableRBDVolumeSource(RBDVolumeSource item,io.fabric8.kubernetes.api.builder.Function<RBDVolumeSource,RBDVolumeSource> function){
            super(item);this.builder=new RBDVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableRBDVolumeSource(RBDVolumeSource item){
            super(item);this.builder=new RBDVolumeSourceBuilder(this, item);this.function=new Function<RBDVolumeSource, RBDVolumeSource>() {
    public RBDVolumeSource apply(RBDVolumeSource item) {
        return item;
    }
}
;
    }

    public RBDVolumeSource done(){
             return function.apply(builder.build());
    }




}
