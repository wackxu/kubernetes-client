package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfigMapVolumeSource extends ConfigMapVolumeSourceFluentImpl<DoneableConfigMapVolumeSource> implements Doneable<ConfigMapVolumeSource>{

    private final ConfigMapVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMapVolumeSource,ConfigMapVolumeSource> function;

    public DoneableConfigMapVolumeSource(io.fabric8.kubernetes.api.builder.Function<ConfigMapVolumeSource,ConfigMapVolumeSource> function){
            super();this.builder=new ConfigMapVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableConfigMapVolumeSource(ConfigMapVolumeSource item,io.fabric8.kubernetes.api.builder.Function<ConfigMapVolumeSource,ConfigMapVolumeSource> function){
            super(item);this.builder=new ConfigMapVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableConfigMapVolumeSource(ConfigMapVolumeSource item){
            super(item);this.builder=new ConfigMapVolumeSourceBuilder(this, item);this.function=new Function<ConfigMapVolumeSource, ConfigMapVolumeSource>() {
    public ConfigMapVolumeSource apply(ConfigMapVolumeSource item) {
        return item;
    }
}
;
    }

    public ConfigMapVolumeSource done(){
             return function.apply(builder.build());
    }




}
