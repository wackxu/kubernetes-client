package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolume extends PersistentVolumeFluentImpl<DoneablePersistentVolume> implements Doneable<PersistentVolume>{

    private final PersistentVolumeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolume,PersistentVolume> function;

    public DoneablePersistentVolume(io.fabric8.kubernetes.api.builder.Function<PersistentVolume,PersistentVolume> function){
            super();this.builder=new PersistentVolumeBuilder(this);this.function=function;
    }
    public DoneablePersistentVolume(PersistentVolume item,io.fabric8.kubernetes.api.builder.Function<PersistentVolume,PersistentVolume> function){
            super(item);this.builder=new PersistentVolumeBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolume(PersistentVolume item){
            super(item);this.builder=new PersistentVolumeBuilder(this, item);this.function=new Function<PersistentVolume, PersistentVolume>() {
    public PersistentVolume apply(PersistentVolume item) {
        return item;
    }
}
;
    }

    public PersistentVolume done(){
             return function.apply(builder.build());
    }




}
