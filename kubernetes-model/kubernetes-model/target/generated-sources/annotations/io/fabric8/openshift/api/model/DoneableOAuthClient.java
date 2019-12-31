package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthClient extends OAuthClientFluentImpl<DoneableOAuthClient> implements Doneable<OAuthClient>{

    private final OAuthClientBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthClient,OAuthClient> function;

    public DoneableOAuthClient(io.fabric8.kubernetes.api.builder.Function<OAuthClient,OAuthClient> function){
            super();this.builder=new OAuthClientBuilder(this);this.function=function;
    }
    public DoneableOAuthClient(OAuthClient item,io.fabric8.kubernetes.api.builder.Function<OAuthClient,OAuthClient> function){
            super(item);this.builder=new OAuthClientBuilder(this, item);this.function=function;
    }
    public DoneableOAuthClient(OAuthClient item){
            super(item);this.builder=new OAuthClientBuilder(this, item);this.function=new Function<OAuthClient, OAuthClient>() {
    public OAuthClient apply(OAuthClient item) {
        return item;
    }
}
;
    }

    public OAuthClient done(){
             return function.apply(builder.build());
    }




}
