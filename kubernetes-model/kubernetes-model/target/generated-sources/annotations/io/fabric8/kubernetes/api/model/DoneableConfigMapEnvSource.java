package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfigMapEnvSource extends ConfigMapEnvSourceFluentImpl<DoneableConfigMapEnvSource> implements Doneable<ConfigMapEnvSource>{

    private final ConfigMapEnvSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMapEnvSource,ConfigMapEnvSource> function;

    public DoneableConfigMapEnvSource(io.fabric8.kubernetes.api.builder.Function<ConfigMapEnvSource,ConfigMapEnvSource> function){
            super();this.builder=new ConfigMapEnvSourceBuilder(this);this.function=function;
    }
    public DoneableConfigMapEnvSource(ConfigMapEnvSource item,io.fabric8.kubernetes.api.builder.Function<ConfigMapEnvSource,ConfigMapEnvSource> function){
            super(item);this.builder=new ConfigMapEnvSourceBuilder(this, item);this.function=function;
    }
    public DoneableConfigMapEnvSource(ConfigMapEnvSource item){
            super(item);this.builder=new ConfigMapEnvSourceBuilder(this, item);this.function=new Function<ConfigMapEnvSource, ConfigMapEnvSource>() {
    public ConfigMapEnvSource apply(ConfigMapEnvSource item) {
        return item;
    }
}
;
    }

    public ConfigMapEnvSource done(){
             return function.apply(builder.build());
    }




}
