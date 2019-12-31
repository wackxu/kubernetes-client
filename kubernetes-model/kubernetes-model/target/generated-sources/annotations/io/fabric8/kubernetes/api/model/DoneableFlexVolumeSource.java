package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableFlexVolumeSource extends FlexVolumeSourceFluentImpl<DoneableFlexVolumeSource> implements Doneable<FlexVolumeSource>{

    private final FlexVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<FlexVolumeSource,FlexVolumeSource> function;

    public DoneableFlexVolumeSource(io.fabric8.kubernetes.api.builder.Function<FlexVolumeSource,FlexVolumeSource> function){
            super();this.builder=new FlexVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableFlexVolumeSource(FlexVolumeSource item,io.fabric8.kubernetes.api.builder.Function<FlexVolumeSource,FlexVolumeSource> function){
            super(item);this.builder=new FlexVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableFlexVolumeSource(FlexVolumeSource item){
            super(item);this.builder=new FlexVolumeSourceBuilder(this, item);this.function=new Function<FlexVolumeSource, FlexVolumeSource>() {
    public FlexVolumeSource apply(FlexVolumeSource item) {
        return item;
    }
}
;
    }

    public FlexVolumeSource done(){
             return function.apply(builder.build());
    }




}
