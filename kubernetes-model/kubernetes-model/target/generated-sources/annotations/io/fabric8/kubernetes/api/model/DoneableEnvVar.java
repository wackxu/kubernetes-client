package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEnvVar extends EnvVarFluentImpl<DoneableEnvVar> implements Doneable<EnvVar>{

    private final EnvVarBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EnvVar,EnvVar> function;

    public DoneableEnvVar(io.fabric8.kubernetes.api.builder.Function<EnvVar,EnvVar> function){
            super();this.builder=new EnvVarBuilder(this);this.function=function;
    }
    public DoneableEnvVar(EnvVar item,io.fabric8.kubernetes.api.builder.Function<EnvVar,EnvVar> function){
            super(item);this.builder=new EnvVarBuilder(this, item);this.function=function;
    }
    public DoneableEnvVar(EnvVar item){
            super(item);this.builder=new EnvVarBuilder(this, item);this.function=new Function<EnvVar, EnvVar>() {
    public EnvVar apply(EnvVar item) {
        return item;
    }
}
;
    }

    public EnvVar done(){
             return function.apply(builder.build());
    }




}
