package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEnvVarSource extends EnvVarSourceFluentImpl<DoneableEnvVarSource> implements Doneable<EnvVarSource>{

    private final EnvVarSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EnvVarSource,EnvVarSource> function;

    public DoneableEnvVarSource(io.fabric8.kubernetes.api.builder.Function<EnvVarSource,EnvVarSource> function){
            super();this.builder=new EnvVarSourceBuilder(this);this.function=function;
    }
    public DoneableEnvVarSource(EnvVarSource item,io.fabric8.kubernetes.api.builder.Function<EnvVarSource,EnvVarSource> function){
            super(item);this.builder=new EnvVarSourceBuilder(this, item);this.function=function;
    }
    public DoneableEnvVarSource(EnvVarSource item){
            super(item);this.builder=new EnvVarSourceBuilder(this, item);this.function=new Function<EnvVarSource, EnvVarSource>() {
    public EnvVarSource apply(EnvVarSource item) {
        return item;
    }
}
;
    }

    public EnvVarSource done(){
             return function.apply(builder.build());
    }




}
