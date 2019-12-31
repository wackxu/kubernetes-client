package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfigMap extends ConfigMapFluentImpl<DoneableConfigMap> implements Doneable<ConfigMap>{

    private final ConfigMapBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMap,ConfigMap> function;

    public DoneableConfigMap(io.fabric8.kubernetes.api.builder.Function<ConfigMap,ConfigMap> function){
            super();this.builder=new ConfigMapBuilder(this);this.function=function;
    }
    public DoneableConfigMap(ConfigMap item,io.fabric8.kubernetes.api.builder.Function<ConfigMap,ConfigMap> function){
            super(item);this.builder=new ConfigMapBuilder(this, item);this.function=function;
    }
    public DoneableConfigMap(ConfigMap item){
            super(item);this.builder=new ConfigMapBuilder(this, item);this.function=new Function<ConfigMap, ConfigMap>() {
    public ConfigMap apply(ConfigMap item) {
        return item;
    }
}
;
    }

    public ConfigMap done(){
             return function.apply(builder.build());
    }




}
