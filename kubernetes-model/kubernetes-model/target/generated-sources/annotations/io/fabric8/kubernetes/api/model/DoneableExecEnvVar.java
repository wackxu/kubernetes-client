package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableExecEnvVar extends ExecEnvVarFluentImpl<DoneableExecEnvVar> implements Doneable<ExecEnvVar>{

    private final ExecEnvVarBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ExecEnvVar,ExecEnvVar> function;

    public DoneableExecEnvVar(io.fabric8.kubernetes.api.builder.Function<ExecEnvVar,ExecEnvVar> function){
            super();this.builder=new ExecEnvVarBuilder(this);this.function=function;
    }
    public DoneableExecEnvVar(ExecEnvVar item,io.fabric8.kubernetes.api.builder.Function<ExecEnvVar,ExecEnvVar> function){
            super(item);this.builder=new ExecEnvVarBuilder(this, item);this.function=function;
    }
    public DoneableExecEnvVar(ExecEnvVar item){
            super(item);this.builder=new ExecEnvVarBuilder(this, item);this.function=new Function<ExecEnvVar, ExecEnvVar>() {
    public ExecEnvVar apply(ExecEnvVar item) {
        return item;
    }
}
;
    }

    public ExecEnvVar done(){
             return function.apply(builder.build());
    }




}
