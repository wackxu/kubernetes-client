package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodDNSConfigOption extends PodDNSConfigOptionFluentImpl<DoneablePodDNSConfigOption> implements Doneable<PodDNSConfigOption>{

    private final PodDNSConfigOptionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodDNSConfigOption,PodDNSConfigOption> function;

    public DoneablePodDNSConfigOption(io.fabric8.kubernetes.api.builder.Function<PodDNSConfigOption,PodDNSConfigOption> function){
            super();this.builder=new PodDNSConfigOptionBuilder(this);this.function=function;
    }
    public DoneablePodDNSConfigOption(PodDNSConfigOption item,io.fabric8.kubernetes.api.builder.Function<PodDNSConfigOption,PodDNSConfigOption> function){
            super(item);this.builder=new PodDNSConfigOptionBuilder(this, item);this.function=function;
    }
    public DoneablePodDNSConfigOption(PodDNSConfigOption item){
            super(item);this.builder=new PodDNSConfigOptionBuilder(this, item);this.function=new Function<PodDNSConfigOption, PodDNSConfigOption>() {
    public PodDNSConfigOption apply(PodDNSConfigOption item) {
        return item;
    }
}
;
    }

    public PodDNSConfigOption done(){
             return function.apply(builder.build());
    }




}
