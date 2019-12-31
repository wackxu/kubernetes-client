package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfigMapList extends ConfigMapListFluentImpl<DoneableConfigMapList> implements Doneable<ConfigMapList>{

    private final ConfigMapListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ConfigMapList,ConfigMapList> function;

    public DoneableConfigMapList(io.fabric8.kubernetes.api.builder.Function<ConfigMapList,ConfigMapList> function){
            super();this.builder=new ConfigMapListBuilder(this);this.function=function;
    }
    public DoneableConfigMapList(ConfigMapList item,io.fabric8.kubernetes.api.builder.Function<ConfigMapList,ConfigMapList> function){
            super(item);this.builder=new ConfigMapListBuilder(this, item);this.function=function;
    }
    public DoneableConfigMapList(ConfigMapList item){
            super(item);this.builder=new ConfigMapListBuilder(this, item);this.function=new Function<ConfigMapList, ConfigMapList>() {
    public ConfigMapList apply(ConfigMapList item) {
        return item;
    }
}
;
    }

    public ConfigMapList done(){
             return function.apply(builder.build());
    }




}
