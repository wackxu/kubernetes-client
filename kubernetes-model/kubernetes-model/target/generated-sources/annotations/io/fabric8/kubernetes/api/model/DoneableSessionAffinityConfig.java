package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSessionAffinityConfig extends SessionAffinityConfigFluentImpl<DoneableSessionAffinityConfig> implements Doneable<SessionAffinityConfig>{

    private final SessionAffinityConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SessionAffinityConfig,SessionAffinityConfig> function;

    public DoneableSessionAffinityConfig(io.fabric8.kubernetes.api.builder.Function<SessionAffinityConfig,SessionAffinityConfig> function){
            super();this.builder=new SessionAffinityConfigBuilder(this);this.function=function;
    }
    public DoneableSessionAffinityConfig(SessionAffinityConfig item,io.fabric8.kubernetes.api.builder.Function<SessionAffinityConfig,SessionAffinityConfig> function){
            super(item);this.builder=new SessionAffinityConfigBuilder(this, item);this.function=function;
    }
    public DoneableSessionAffinityConfig(SessionAffinityConfig item){
            super(item);this.builder=new SessionAffinityConfigBuilder(this, item);this.function=new Function<SessionAffinityConfig, SessionAffinityConfig>() {
    public SessionAffinityConfig apply(SessionAffinityConfig item) {
        return item;
    }
}
;
    }

    public SessionAffinityConfig done(){
             return function.apply(builder.build());
    }




}
