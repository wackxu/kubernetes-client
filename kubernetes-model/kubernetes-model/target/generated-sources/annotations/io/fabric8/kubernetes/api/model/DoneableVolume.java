package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableVolume extends VolumeFluentImpl<DoneableVolume> implements Doneable<Volume>{

    private final VolumeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Volume,Volume> function;

    public DoneableVolume(io.fabric8.kubernetes.api.builder.Function<Volume,Volume> function){
            super();this.builder=new VolumeBuilder(this);this.function=function;
    }
    public DoneableVolume(Volume item,io.fabric8.kubernetes.api.builder.Function<Volume,Volume> function){
            super(item);this.builder=new VolumeBuilder(this, item);this.function=function;
    }
    public DoneableVolume(Volume item){
            super(item);this.builder=new VolumeBuilder(this, item);this.function=new Function<Volume, Volume>() {
    public Volume apply(Volume item) {
        return item;
    }
}
;
    }

    public Volume done(){
             return function.apply(builder.build());
    }




}
