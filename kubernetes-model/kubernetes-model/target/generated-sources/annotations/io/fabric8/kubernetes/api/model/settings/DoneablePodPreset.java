package io.fabric8.kubernetes.api.model.settings;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodPreset extends PodPresetFluentImpl<DoneablePodPreset> implements Doneable<PodPreset>{

    private final PodPresetBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodPreset,PodPreset> function;

    public DoneablePodPreset(io.fabric8.kubernetes.api.builder.Function<PodPreset,PodPreset> function){
            super();this.builder=new PodPresetBuilder(this);this.function=function;
    }
    public DoneablePodPreset(PodPreset item,io.fabric8.kubernetes.api.builder.Function<PodPreset,PodPreset> function){
            super(item);this.builder=new PodPresetBuilder(this, item);this.function=function;
    }
    public DoneablePodPreset(PodPreset item){
            super(item);this.builder=new PodPresetBuilder(this, item);this.function=new Function<PodPreset, PodPreset>() {
    public PodPreset apply(PodPreset item) {
        return item;
    }
}
;
    }

    public PodPreset done(){
             return function.apply(builder.build());
    }




}
