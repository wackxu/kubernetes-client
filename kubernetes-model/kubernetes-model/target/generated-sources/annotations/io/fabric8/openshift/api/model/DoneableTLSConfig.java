package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTLSConfig extends TLSConfigFluentImpl<DoneableTLSConfig> implements Doneable<TLSConfig>{

    private final TLSConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TLSConfig,TLSConfig> function;

    public DoneableTLSConfig(io.fabric8.kubernetes.api.builder.Function<TLSConfig,TLSConfig> function){
            super();this.builder=new TLSConfigBuilder(this);this.function=function;
    }
    public DoneableTLSConfig(TLSConfig item,io.fabric8.kubernetes.api.builder.Function<TLSConfig,TLSConfig> function){
            super(item);this.builder=new TLSConfigBuilder(this, item);this.function=function;
    }
    public DoneableTLSConfig(TLSConfig item){
            super(item);this.builder=new TLSConfigBuilder(this, item);this.function=new Function<TLSConfig, TLSConfig>() {
    public TLSConfig apply(TLSConfig item) {
        return item;
    }
}
;
    }

    public TLSConfig done(){
             return function.apply(builder.build());
    }




}
