package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAuthInfo extends AuthInfoFluentImpl<DoneableAuthInfo> implements Doneable<AuthInfo>{

    private final AuthInfoBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AuthInfo,AuthInfo> function;

    public DoneableAuthInfo(io.fabric8.kubernetes.api.builder.Function<AuthInfo,AuthInfo> function){
            super();this.builder=new AuthInfoBuilder(this);this.function=function;
    }
    public DoneableAuthInfo(AuthInfo item,io.fabric8.kubernetes.api.builder.Function<AuthInfo,AuthInfo> function){
            super(item);this.builder=new AuthInfoBuilder(this, item);this.function=function;
    }
    public DoneableAuthInfo(AuthInfo item){
            super(item);this.builder=new AuthInfoBuilder(this, item);this.function=new Function<AuthInfo, AuthInfo>() {
    public AuthInfo apply(AuthInfo item) {
        return item;
    }
}
;
    }

    public AuthInfo done(){
             return function.apply(builder.build());
    }




}
