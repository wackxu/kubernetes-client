package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableAllowedFlexVolume extends AllowedFlexVolumeFluentImpl<DoneableAllowedFlexVolume> implements Doneable<AllowedFlexVolume>{

    private final AllowedFlexVolumeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AllowedFlexVolume,AllowedFlexVolume> function;

    public DoneableAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Function<AllowedFlexVolume,AllowedFlexVolume> function){
            super();this.builder=new AllowedFlexVolumeBuilder(this);this.function=function;
    }
    public DoneableAllowedFlexVolume(AllowedFlexVolume item,io.fabric8.kubernetes.api.builder.Function<AllowedFlexVolume,AllowedFlexVolume> function){
            super(item);this.builder=new AllowedFlexVolumeBuilder(this, item);this.function=function;
    }
    public DoneableAllowedFlexVolume(AllowedFlexVolume item){
            super(item);this.builder=new AllowedFlexVolumeBuilder(this, item);this.function=new Function<AllowedFlexVolume, AllowedFlexVolume>() {
    public AllowedFlexVolume apply(AllowedFlexVolume item) {
        return item;
    }
}
;
    }

    public AllowedFlexVolume done(){
             return function.apply(builder.build());
    }




}
