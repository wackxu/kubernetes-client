package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableVolumeDevice extends VolumeDeviceFluentImpl<DoneableVolumeDevice> implements Doneable<VolumeDevice>{

    private final VolumeDeviceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<VolumeDevice,VolumeDevice> function;

    public DoneableVolumeDevice(io.fabric8.kubernetes.api.builder.Function<VolumeDevice,VolumeDevice> function){
            super();this.builder=new VolumeDeviceBuilder(this);this.function=function;
    }
    public DoneableVolumeDevice(VolumeDevice item,io.fabric8.kubernetes.api.builder.Function<VolumeDevice,VolumeDevice> function){
            super(item);this.builder=new VolumeDeviceBuilder(this, item);this.function=function;
    }
    public DoneableVolumeDevice(VolumeDevice item){
            super(item);this.builder=new VolumeDeviceBuilder(this, item);this.function=new Function<VolumeDevice, VolumeDevice>() {
    public VolumeDevice apply(VolumeDevice item) {
        return item;
    }
}
;
    }

    public VolumeDevice done(){
             return function.apply(builder.build());
    }




}
