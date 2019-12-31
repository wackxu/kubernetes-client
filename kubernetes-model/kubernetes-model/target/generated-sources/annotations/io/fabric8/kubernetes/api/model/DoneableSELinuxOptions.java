package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSELinuxOptions extends SELinuxOptionsFluentImpl<DoneableSELinuxOptions> implements Doneable<SELinuxOptions>{

    private final SELinuxOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SELinuxOptions,SELinuxOptions> function;

    public DoneableSELinuxOptions(io.fabric8.kubernetes.api.builder.Function<SELinuxOptions,SELinuxOptions> function){
            super();this.builder=new SELinuxOptionsBuilder(this);this.function=function;
    }
    public DoneableSELinuxOptions(SELinuxOptions item,io.fabric8.kubernetes.api.builder.Function<SELinuxOptions,SELinuxOptions> function){
            super(item);this.builder=new SELinuxOptionsBuilder(this, item);this.function=function;
    }
    public DoneableSELinuxOptions(SELinuxOptions item){
            super(item);this.builder=new SELinuxOptionsBuilder(this, item);this.function=new Function<SELinuxOptions, SELinuxOptions>() {
    public SELinuxOptions apply(SELinuxOptions item) {
        return item;
    }
}
;
    }

    public SELinuxOptions done(){
             return function.apply(builder.build());
    }




}
