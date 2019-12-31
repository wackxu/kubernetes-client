package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfigMapProjection extends ConfigMapProjectionFluentImpl<DoneableConfigMapProjection> implements Doneable<ConfigMapProjection>{

    private final ConfigMapProjectionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMapProjection,ConfigMapProjection> function;

    public DoneableConfigMapProjection(io.fabric8.kubernetes.api.builder.Function<ConfigMapProjection,ConfigMapProjection> function){
            super();this.builder=new ConfigMapProjectionBuilder(this);this.function=function;
    }
    public DoneableConfigMapProjection(ConfigMapProjection item,io.fabric8.kubernetes.api.builder.Function<ConfigMapProjection,ConfigMapProjection> function){
            super(item);this.builder=new ConfigMapProjectionBuilder(this, item);this.function=function;
    }
    public DoneableConfigMapProjection(ConfigMapProjection item){
            super(item);this.builder=new ConfigMapProjectionBuilder(this, item);this.function=new Function<ConfigMapProjection, ConfigMapProjection>() {
    public ConfigMapProjection apply(ConfigMapProjection item) {
        return item;
    }
}
;
    }

    public ConfigMapProjection done(){
             return function.apply(builder.build());
    }




}
