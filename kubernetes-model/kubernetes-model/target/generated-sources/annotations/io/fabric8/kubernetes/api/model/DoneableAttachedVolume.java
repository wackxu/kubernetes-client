package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAttachedVolume extends AttachedVolumeFluentImpl<DoneableAttachedVolume> implements Doneable<AttachedVolume>{

    private final AttachedVolumeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AttachedVolume,AttachedVolume> function;

    public DoneableAttachedVolume(io.fabric8.kubernetes.api.builder.Function<AttachedVolume,AttachedVolume> function){
            super();this.builder=new AttachedVolumeBuilder(this);this.function=function;
    }
    public DoneableAttachedVolume(AttachedVolume item,io.fabric8.kubernetes.api.builder.Function<AttachedVolume,AttachedVolume> function){
            super(item);this.builder=new AttachedVolumeBuilder(this, item);this.function=function;
    }
    public DoneableAttachedVolume(AttachedVolume item){
            super(item);this.builder=new AttachedVolumeBuilder(this, item);this.function=new Function<AttachedVolume, AttachedVolume>() {
    public AttachedVolume apply(AttachedVolume item) {
        return item;
    }
}
;
    }

    public AttachedVolume done(){
             return function.apply(builder.build());
    }




}
