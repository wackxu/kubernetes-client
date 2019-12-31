package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSELinuxContextStrategyOptions extends SELinuxContextStrategyOptionsFluentImpl<DoneableSELinuxContextStrategyOptions> implements Doneable<SELinuxContextStrategyOptions>{

    private final SELinuxContextStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SELinuxContextStrategyOptions,SELinuxContextStrategyOptions> function;

    public DoneableSELinuxContextStrategyOptions(io.fabric8.kubernetes.api.builder.Function<SELinuxContextStrategyOptions,SELinuxContextStrategyOptions> function){
            super();this.builder=new SELinuxContextStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableSELinuxContextStrategyOptions(SELinuxContextStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<SELinuxContextStrategyOptions,SELinuxContextStrategyOptions> function){
            super(item);this.builder=new SELinuxContextStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableSELinuxContextStrategyOptions(SELinuxContextStrategyOptions item){
            super(item);this.builder=new SELinuxContextStrategyOptionsBuilder(this, item);this.function=new Function<SELinuxContextStrategyOptions, SELinuxContextStrategyOptions>() {
    public SELinuxContextStrategyOptions apply(SELinuxContextStrategyOptions item) {
        return item;
    }
}
;
    }

    public SELinuxContextStrategyOptions done(){
             return function.apply(builder.build());
    }




}
