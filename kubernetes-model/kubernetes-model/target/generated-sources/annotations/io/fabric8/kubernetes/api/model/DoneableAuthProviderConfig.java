package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAuthProviderConfig extends AuthProviderConfigFluentImpl<DoneableAuthProviderConfig> implements Doneable<AuthProviderConfig>{

    private final AuthProviderConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AuthProviderConfig,AuthProviderConfig> function;

    public DoneableAuthProviderConfig(io.fabric8.kubernetes.api.builder.Function<AuthProviderConfig,AuthProviderConfig> function){
            super();this.builder=new AuthProviderConfigBuilder(this);this.function=function;
    }
    public DoneableAuthProviderConfig(AuthProviderConfig item,io.fabric8.kubernetes.api.builder.Function<AuthProviderConfig,AuthProviderConfig> function){
            super(item);this.builder=new AuthProviderConfigBuilder(this, item);this.function=function;
    }
    public DoneableAuthProviderConfig(AuthProviderConfig item){
            super(item);this.builder=new AuthProviderConfigBuilder(this, item);this.function=new Function<AuthProviderConfig, AuthProviderConfig>() {
    public AuthProviderConfig apply(AuthProviderConfig item) {
        return item;
    }
}
;
    }

    public AuthProviderConfig done(){
             return function.apply(builder.build());
    }




}
