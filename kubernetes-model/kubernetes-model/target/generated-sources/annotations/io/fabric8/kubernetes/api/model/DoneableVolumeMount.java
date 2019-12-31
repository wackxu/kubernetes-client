package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableVolumeMount extends VolumeMountFluentImpl<DoneableVolumeMount> implements Doneable<VolumeMount>{

    private final VolumeMountBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<VolumeMount,VolumeMount> function;

    public DoneableVolumeMount(io.fabric8.kubernetes.api.builder.Function<VolumeMount,VolumeMount> function){
            super();this.builder=new VolumeMountBuilder(this);this.function=function;
    }
    public DoneableVolumeMount(VolumeMount item,io.fabric8.kubernetes.api.builder.Function<VolumeMount,VolumeMount> function){
            super(item);this.builder=new VolumeMountBuilder(this, item);this.function=function;
    }
    public DoneableVolumeMount(VolumeMount item){
            super(item);this.builder=new VolumeMountBuilder(this, item);this.function=new Function<VolumeMount, VolumeMount>() {
    public VolumeMount apply(VolumeMount item) {
        return item;
    }
}
;
    }

    public VolumeMount done(){
             return function.apply(builder.build());
    }




}
