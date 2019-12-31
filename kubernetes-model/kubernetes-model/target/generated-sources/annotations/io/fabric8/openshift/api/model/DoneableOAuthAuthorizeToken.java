package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthAuthorizeToken extends OAuthAuthorizeTokenFluentImpl<DoneableOAuthAuthorizeToken> implements Doneable<OAuthAuthorizeToken>{

    private final OAuthAuthorizeTokenBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthAuthorizeToken,OAuthAuthorizeToken> function;

    public DoneableOAuthAuthorizeToken(io.fabric8.kubernetes.api.builder.Function<OAuthAuthorizeToken,OAuthAuthorizeToken> function){
            super();this.builder=new OAuthAuthorizeTokenBuilder(this);this.function=function;
    }
    public DoneableOAuthAuthorizeToken(OAuthAuthorizeToken item,io.fabric8.kubernetes.api.builder.Function<OAuthAuthorizeToken,OAuthAuthorizeToken> function){
            super(item);this.builder=new OAuthAuthorizeTokenBuilder(this, item);this.function=function;
    }
    public DoneableOAuthAuthorizeToken(OAuthAuthorizeToken item){
            super(item);this.builder=new OAuthAuthorizeTokenBuilder(this, item);this.function=new Function<OAuthAuthorizeToken, OAuthAuthorizeToken>() {
    public OAuthAuthorizeToken apply(OAuthAuthorizeToken item) {
        return item;
    }
}
;
    }

    public OAuthAuthorizeToken done(){
             return function.apply(builder.build());
    }




}
