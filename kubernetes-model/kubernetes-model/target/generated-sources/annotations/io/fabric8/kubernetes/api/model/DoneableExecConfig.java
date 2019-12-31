package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableExecConfig extends ExecConfigFluentImpl<DoneableExecConfig> implements Doneable<ExecConfig>{

    private final ExecConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ExecConfig,ExecConfig> function;

    public DoneableExecConfig(io.fabric8.kubernetes.api.builder.Function<ExecConfig,ExecConfig> function){
            super();this.builder=new ExecConfigBuilder(this);this.function=function;
    }
    public DoneableExecConfig(ExecConfig item,io.fabric8.kubernetes.api.builder.Function<ExecConfig,ExecConfig> function){
            super(item);this.builder=new ExecConfigBuilder(this, item);this.function=function;
    }
    public DoneableExecConfig(ExecConfig item){
            super(item);this.builder=new ExecConfigBuilder(this, item);this.function=new Function<ExecConfig, ExecConfig>() {
    public ExecConfig apply(ExecConfig item) {
        return item;
    }
}
;
    }

    public ExecConfig done(){
             return function.apply(builder.build());
    }




}
