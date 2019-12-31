package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableFlexPersistentVolumeSource extends FlexPersistentVolumeSourceFluentImpl<DoneableFlexPersistentVolumeSource> implements Doneable<FlexPersistentVolumeSource>{

    private final FlexPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<FlexPersistentVolumeSource,FlexPersistentVolumeSource> function;

    public DoneableFlexPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<FlexPersistentVolumeSource,FlexPersistentVolumeSource> function){
            super();this.builder=new FlexPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableFlexPersistentVolumeSource(FlexPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<FlexPersistentVolumeSource,FlexPersistentVolumeSource> function){
            super(item);this.builder=new FlexPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableFlexPersistentVolumeSource(FlexPersistentVolumeSource item){
            super(item);this.builder=new FlexPersistentVolumeSourceBuilder(this, item);this.function=new Function<FlexPersistentVolumeSource, FlexPersistentVolumeSource>() {
    public FlexPersistentVolumeSource apply(FlexPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public FlexPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
