package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodDNSConfig extends PodDNSConfigFluentImpl<DoneablePodDNSConfig> implements Doneable<PodDNSConfig>{

    private final PodDNSConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodDNSConfig,PodDNSConfig> function;

    public DoneablePodDNSConfig(io.fabric8.kubernetes.api.builder.Function<PodDNSConfig,PodDNSConfig> function){
            super();this.builder=new PodDNSConfigBuilder(this);this.function=function;
    }
    public DoneablePodDNSConfig(PodDNSConfig item,io.fabric8.kubernetes.api.builder.Function<PodDNSConfig,PodDNSConfig> function){
            super(item);this.builder=new PodDNSConfigBuilder(this, item);this.function=function;
    }
    public DoneablePodDNSConfig(PodDNSConfig item){
            super(item);this.builder=new PodDNSConfigBuilder(this, item);this.function=new Function<PodDNSConfig, PodDNSConfig>() {
    public PodDNSConfig apply(PodDNSConfig item) {
        return item;
    }
}
;
    }

    public PodDNSConfig done(){
             return function.apply(builder.build());
    }




}
