package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthClientAuthorization extends OAuthClientAuthorizationFluentImpl<DoneableOAuthClientAuthorization> implements Doneable<OAuthClientAuthorization>{

    private final OAuthClientAuthorizationBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthClientAuthorization,OAuthClientAuthorization> function;

    public DoneableOAuthClientAuthorization(io.fabric8.kubernetes.api.builder.Function<OAuthClientAuthorization,OAuthClientAuthorization> function){
            super();this.builder=new OAuthClientAuthorizationBuilder(this);this.function=function;
    }
    public DoneableOAuthClientAuthorization(OAuthClientAuthorization item,io.fabric8.kubernetes.api.builder.Function<OAuthClientAuthorization,OAuthClientAuthorization> function){
            super(item);this.builder=new OAuthClientAuthorizationBuilder(this, item);this.function=function;
    }
    public DoneableOAuthClientAuthorization(OAuthClientAuthorization item){
            super(item);this.builder=new OAuthClientAuthorizationBuilder(this, item);this.function=new Function<OAuthClientAuthorization, OAuthClientAuthorization>() {
    public OAuthClientAuthorization apply(OAuthClientAuthorization item) {
        return item;
    }
}
;
    }

    public OAuthClientAuthorization done(){
             return function.apply(builder.build());
    }




}
