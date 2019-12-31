package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableConfig extends ConfigFluentImpl<DoneableConfig> implements Doneable<Config>{

    private final ConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Config,Config> function;

    public DoneableConfig(io.fabric8.kubernetes.api.builder.Function<Config,Config> function){
            super();this.builder=new ConfigBuilder(this);this.function=function;
    }
    public DoneableConfig(Config item,io.fabric8.kubernetes.api.builder.Function<Config,Config> function){
            super(item);this.builder=new ConfigBuilder(this, item);this.function=function;
    }
    public DoneableConfig(Config item){
            super(item);this.builder=new ConfigBuilder(this, item);this.function=new Function<Config, Config>() {
    public Config apply(Config item) {
        return item;
    }
}
;
    }

    public Config done(){
             return function.apply(builder.build());
    }




}
