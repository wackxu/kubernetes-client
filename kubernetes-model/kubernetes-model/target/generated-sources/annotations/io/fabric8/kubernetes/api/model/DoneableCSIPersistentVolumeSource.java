package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCSIPersistentVolumeSource extends CSIPersistentVolumeSourceFluentImpl<DoneableCSIPersistentVolumeSource> implements Doneable<CSIPersistentVolumeSource>{

    private final CSIPersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CSIPersistentVolumeSource,CSIPersistentVolumeSource> function;

    public DoneableCSIPersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<CSIPersistentVolumeSource,CSIPersistentVolumeSource> function){
            super();this.builder=new CSIPersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableCSIPersistentVolumeSource(CSIPersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<CSIPersistentVolumeSource,CSIPersistentVolumeSource> function){
            super(item);this.builder=new CSIPersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableCSIPersistentVolumeSource(CSIPersistentVolumeSource item){
            super(item);this.builder=new CSIPersistentVolumeSourceBuilder(this, item);this.function=new Function<CSIPersistentVolumeSource, CSIPersistentVolumeSource>() {
    public CSIPersistentVolumeSource apply(CSIPersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public CSIPersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
