package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableAllowedFlexVolume extends io.fabric8.openshift.api.model.AllowedFlexVolumeFluentImpl<DoneableAllowedFlexVolume> implements Doneable<io.fabric8.openshift.api.model.AllowedFlexVolume>{

    private final io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.AllowedFlexVolume,io.fabric8.openshift.api.model.AllowedFlexVolume> function;

    public DoneableAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.AllowedFlexVolume,io.fabric8.openshift.api.model.AllowedFlexVolume> function){
            super();this.builder=new AllowedFlexVolumeBuilder(this);this.function=function;
    }
    public DoneableAllowedFlexVolume(io.fabric8.openshift.api.model.AllowedFlexVolume item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.AllowedFlexVolume,io.fabric8.openshift.api.model.AllowedFlexVolume> function){
            super(item);this.builder=new AllowedFlexVolumeBuilder(this, item);this.function=function;
    }
    public DoneableAllowedFlexVolume(io.fabric8.openshift.api.model.AllowedFlexVolume item){
            super(item);this.builder=new AllowedFlexVolumeBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.AllowedFlexVolume, io.fabric8.openshift.api.model.AllowedFlexVolume>() {
    public io.fabric8.openshift.api.model.AllowedFlexVolume apply(io.fabric8.openshift.api.model.AllowedFlexVolume item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.AllowedFlexVolume done(){
             return function.apply(builder.build());
    }




}
