package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableRBDPersistentVolumeSource extends RBDPersistentVolumeSourceFluentImpl<DoneableRBDPersistentVolumeSource> implements Doneable<RBDPersistentVolumeSource>{

    private final RBDPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RBDPersistentVolumeSource,RBDPersistentVolumeSource> function;

    public DoneableRBDPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<RBDPersistentVolumeSource,RBDPersistentVolumeSource> function){
            super();this.builder=new RBDPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableRBDPersistentVolumeSource(RBDPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<RBDPersistentVolumeSource,RBDPersistentVolumeSource> function){
            super(item);this.builder=new RBDPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableRBDPersistentVolumeSource(RBDPersistentVolumeSource item){
            super(item);this.builder=new RBDPersistentVolumeSourceBuilder(this, item);this.function=new Function<RBDPersistentVolumeSource, RBDPersistentVolumeSource>() {
    public RBDPersistentVolumeSource apply(RBDPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public RBDPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
