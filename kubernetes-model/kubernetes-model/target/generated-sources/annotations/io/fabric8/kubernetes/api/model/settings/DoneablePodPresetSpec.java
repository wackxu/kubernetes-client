package io.fabric8.kubernetes.api.model.settings;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodPresetSpec extends PodPresetSpecFluentImpl<DoneablePodPresetSpec> implements Doneable<PodPresetSpec>{

    private final PodPresetSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodPresetSpec,PodPresetSpec> function;

    public DoneablePodPresetSpec(io.fabric8.kubernetes.api.builder.Function<PodPresetSpec,PodPresetSpec> function){
            super();this.builder=new PodPresetSpecBuilder(this);this.function=function;
    }
    public DoneablePodPresetSpec(PodPresetSpec item,io.fabric8.kubernetes.api.builder.Function<PodPresetSpec,PodPresetSpec> function){
            super(item);this.builder=new PodPresetSpecBuilder(this, item);this.function=function;
    }
    public DoneablePodPresetSpec(PodPresetSpec item){
            super(item);this.builder=new PodPresetSpecBuilder(this, item);this.function=new Function<PodPresetSpec, PodPresetSpec>() {
    public PodPresetSpec apply(PodPresetSpec item) {
        return item;
    }
}
;
    }

    public PodPresetSpec done(){
             return function.apply(builder.build());
    }




}
