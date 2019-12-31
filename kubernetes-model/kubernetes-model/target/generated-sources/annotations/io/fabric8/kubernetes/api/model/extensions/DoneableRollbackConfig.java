package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRollbackConfig extends RollbackConfigFluentImpl<DoneableRollbackConfig> implements Doneable<RollbackConfig>{

    private final RollbackConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RollbackConfig,RollbackConfig> function;

    public DoneableRollbackConfig(io.fabric8.kubernetes.api.builder.Function<RollbackConfig,RollbackConfig> function){
            super();this.builder=new RollbackConfigBuilder(this);this.function=function;
    }
    public DoneableRollbackConfig(RollbackConfig item,io.fabric8.kubernetes.api.builder.Function<RollbackConfig,RollbackConfig> function){
            super(item);this.builder=new RollbackConfigBuilder(this, item);this.function=function;
    }
    public DoneableRollbackConfig(RollbackConfig item){
            super(item);this.builder=new RollbackConfigBuilder(this, item);this.function=new Function<RollbackConfig, RollbackConfig>() {
    public RollbackConfig apply(RollbackConfig item) {
        return item;
    }
}
;
    }

    public RollbackConfig done(){
             return function.apply(builder.build());
    }




}
