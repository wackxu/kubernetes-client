package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableVolumeProjection extends VolumeProjectionFluentImpl<DoneableVolumeProjection> implements Doneable<VolumeProjection>{

    private final VolumeProjectionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<VolumeProjection,VolumeProjection> function;

    public DoneableVolumeProjection(io.fabric8.kubernetes.api.builder.Function<VolumeProjection,VolumeProjection> function){
            super();this.builder=new VolumeProjectionBuilder(this);this.function=function;
    }
    public DoneableVolumeProjection(VolumeProjection item,io.fabric8.kubernetes.api.builder.Function<VolumeProjection,VolumeProjection> function){
            super(item);this.builder=new VolumeProjectionBuilder(this, item);this.function=function;
    }
    public DoneableVolumeProjection(VolumeProjection item){
            super(item);this.builder=new VolumeProjectionBuilder(this, item);this.function=new Function<VolumeProjection, VolumeProjection>() {
    public VolumeProjection apply(VolumeProjection item) {
        return item;
    }
}
;
    }

    public VolumeProjection done(){
             return function.apply(builder.build());
    }




}
