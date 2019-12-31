package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEnvFromSource extends EnvFromSourceFluentImpl<DoneableEnvFromSource> implements Doneable<EnvFromSource>{

    private final EnvFromSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EnvFromSource,EnvFromSource> function;

    public DoneableEnvFromSource(io.fabric8.kubernetes.api.builder.Function<EnvFromSource,EnvFromSource> function){
            super();this.builder=new EnvFromSourceBuilder(this);this.function=function;
    }
    public DoneableEnvFromSource(EnvFromSource item,io.fabric8.kubernetes.api.builder.Function<EnvFromSource,EnvFromSource> function){
            super(item);this.builder=new EnvFromSourceBuilder(this, item);this.function=function;
    }
    public DoneableEnvFromSource(EnvFromSource item){
            super(item);this.builder=new EnvFromSourceBuilder(this, item);this.function=new Function<EnvFromSource, EnvFromSource>() {
    public EnvFromSource apply(EnvFromSource item) {
        return item;
    }
}
;
    }

    public EnvFromSource done(){
             return function.apply(builder.build());
    }




}
