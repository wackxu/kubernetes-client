package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfigMapNodeConfigSource extends ConfigMapNodeConfigSourceFluentImpl<DoneableConfigMapNodeConfigSource> implements Doneable<ConfigMapNodeConfigSource>{

    private final ConfigMapNodeConfigSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMapNodeConfigSource,ConfigMapNodeConfigSource> function;

    public DoneableConfigMapNodeConfigSource(io.fabric8.kubernetes.api.builder.Function<ConfigMapNodeConfigSource,ConfigMapNodeConfigSource> function){
            super();this.builder=new ConfigMapNodeConfigSourceBuilder(this);this.function=function;
    }
    public DoneableConfigMapNodeConfigSource(ConfigMapNodeConfigSource item,io.fabric8.kubernetes.api.builder.Function<ConfigMapNodeConfigSource,ConfigMapNodeConfigSource> function){
            super(item);this.builder=new ConfigMapNodeConfigSourceBuilder(this, item);this.function=function;
    }
    public DoneableConfigMapNodeConfigSource(ConfigMapNodeConfigSource item){
            super(item);this.builder=new ConfigMapNodeConfigSourceBuilder(this, item);this.function=new Function<ConfigMapNodeConfigSource, ConfigMapNodeConfigSource>() {
    public ConfigMapNodeConfigSource apply(ConfigMapNodeConfigSource item) {
        return item;
    }
}
;
    }

    public ConfigMapNodeConfigSource done(){
             return function.apply(builder.build());
    }




}
