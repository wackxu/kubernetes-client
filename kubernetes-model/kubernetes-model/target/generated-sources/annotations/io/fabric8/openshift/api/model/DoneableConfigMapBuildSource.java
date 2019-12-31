package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableConfigMapBuildSource extends ConfigMapBuildSourceFluentImpl<DoneableConfigMapBuildSource> implements Doneable<ConfigMapBuildSource>{

    private final ConfigMapBuildSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMapBuildSource,ConfigMapBuildSource> function;

    public DoneableConfigMapBuildSource(io.fabric8.kubernetes.api.builder.Function<ConfigMapBuildSource,ConfigMapBuildSource> function){
            super();this.builder=new ConfigMapBuildSourceBuilder(this);this.function=function;
    }
    public DoneableConfigMapBuildSource(ConfigMapBuildSource item,io.fabric8.kubernetes.api.builder.Function<ConfigMapBuildSource,ConfigMapBuildSource> function){
            super(item);this.builder=new ConfigMapBuildSourceBuilder(this, item);this.function=function;
    }
    public DoneableConfigMapBuildSource(ConfigMapBuildSource item){
            super(item);this.builder=new ConfigMapBuildSourceBuilder(this, item);this.function=new Function<ConfigMapBuildSource, ConfigMapBuildSource>() {
    public ConfigMapBuildSource apply(ConfigMapBuildSource item) {
        return item;
    }
}
;
    }

    public ConfigMapBuildSource done(){
             return function.apply(builder.build());
    }




}
