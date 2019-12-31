package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthAccessToken extends OAuthAccessTokenFluentImpl<DoneableOAuthAccessToken> implements Doneable<OAuthAccessToken>{

    private final OAuthAccessTokenBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthAccessToken,OAuthAccessToken> function;

    public DoneableOAuthAccessToken(io.fabric8.kubernetes.api.builder.Function<OAuthAccessToken,OAuthAccessToken> function){
            super();this.builder=new OAuthAccessTokenBuilder(this);this.function=function;
    }
    public DoneableOAuthAccessToken(OAuthAccessToken item,io.fabric8.kubernetes.api.builder.Function<OAuthAccessToken,OAuthAccessToken> function){
            super(item);this.builder=new OAuthAccessTokenBuilder(this, item);this.function=function;
    }
    public DoneableOAuthAccessToken(OAuthAccessToken item){
            super(item);this.builder=new OAuthAccessTokenBuilder(this, item);this.function=new Function<OAuthAccessToken, OAuthAccessToken>() {
    public OAuthAccessToken apply(OAuthAccessToken item) {
        return item;
    }
}
;
    }

    public OAuthAccessToken done(){
             return function.apply(builder.build());
    }




}
