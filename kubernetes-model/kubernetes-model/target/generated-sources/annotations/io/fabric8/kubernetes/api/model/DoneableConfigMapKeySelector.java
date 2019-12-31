package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfigMapKeySelector extends ConfigMapKeySelectorFluentImpl<DoneableConfigMapKeySelector> implements Doneable<ConfigMapKeySelector>{

    private final ConfigMapKeySelectorBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMapKeySelector,ConfigMapKeySelector> function;

    public DoneableConfigMapKeySelector(io.fabric8.kubernetes.api.builder.Function<ConfigMapKeySelector,ConfigMapKeySelector> function){
            super();this.builder=new ConfigMapKeySelectorBuilder(this);this.function=function;
    }
    public DoneableConfigMapKeySelector(ConfigMapKeySelector item,io.fabric8.kubernetes.api.builder.Function<ConfigMapKeySelector,ConfigMapKeySelector> function){
            super(item);this.builder=new ConfigMapKeySelectorBuilder(this, item);this.function=function;
    }
    public DoneableConfigMapKeySelector(ConfigMapKeySelector item){
            super(item);this.builder=new ConfigMapKeySelectorBuilder(this, item);this.function=new Function<ConfigMapKeySelector, ConfigMapKeySelector>() {
    public ConfigMapKeySelector apply(ConfigMapKeySelector item) {
        return item;
    }
}
;
    }

    public ConfigMapKeySelector done(){
             return function.apply(builder.build());
    }




}
