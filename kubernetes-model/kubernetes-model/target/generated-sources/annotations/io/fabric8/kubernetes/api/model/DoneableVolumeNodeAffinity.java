package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableVolumeNodeAffinity extends VolumeNodeAffinityFluentImpl<DoneableVolumeNodeAffinity> implements Doneable<VolumeNodeAffinity>{

    private final VolumeNodeAffinityBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<VolumeNodeAffinity,VolumeNodeAffinity> function;

    public DoneableVolumeNodeAffinity(io.fabric8.kubernetes.api.builder.Function<VolumeNodeAffinity,VolumeNodeAffinity> function){
            super();this.builder=new VolumeNodeAffinityBuilder(this);this.function=function;
    }
    public DoneableVolumeNodeAffinity(VolumeNodeAffinity item,io.fabric8.kubernetes.api.builder.Function<VolumeNodeAffinity,VolumeNodeAffinity> function){
            super(item);this.builder=new VolumeNodeAffinityBuilder(this, item);this.function=function;
    }
    public DoneableVolumeNodeAffinity(VolumeNodeAffinity item){
            super(item);this.builder=new VolumeNodeAffinityBuilder(this, item);this.function=new Function<VolumeNodeAffinity, VolumeNodeAffinity>() {
    public VolumeNodeAffinity apply(VolumeNodeAffinity item) {
        return item;
    }
}
;
    }

    public VolumeNodeAffinity done(){
             return function.apply(builder.build());
    }




}
