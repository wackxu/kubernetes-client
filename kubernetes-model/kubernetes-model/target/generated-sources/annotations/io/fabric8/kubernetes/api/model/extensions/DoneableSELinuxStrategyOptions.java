package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSELinuxStrategyOptions extends SELinuxStrategyOptionsFluentImpl<DoneableSELinuxStrategyOptions> implements Doneable<SELinuxStrategyOptions>{

    private final SELinuxStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SELinuxStrategyOptions,SELinuxStrategyOptions> function;

    public DoneableSELinuxStrategyOptions(io.fabric8.kubernetes.api.builder.Function<SELinuxStrategyOptions,SELinuxStrategyOptions> function){
            super();this.builder=new SELinuxStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableSELinuxStrategyOptions(SELinuxStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<SELinuxStrategyOptions,SELinuxStrategyOptions> function){
            super(item);this.builder=new SELinuxStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableSELinuxStrategyOptions(SELinuxStrategyOptions item){
            super(item);this.builder=new SELinuxStrategyOptionsBuilder(this, item);this.function=new Function<SELinuxStrategyOptions, SELinuxStrategyOptions>() {
    public SELinuxStrategyOptions apply(SELinuxStrategyOptions item) {
        return item;
    }
}
;
    }

    public SELinuxStrategyOptions done(){
             return function.apply(builder.build());
    }




}
