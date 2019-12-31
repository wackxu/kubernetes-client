package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthClientAuthorizationList extends OAuthClientAuthorizationListFluentImpl<DoneableOAuthClientAuthorizationList> implements Doneable<OAuthClientAuthorizationList>{

    private final OAuthClientAuthorizationListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthClientAuthorizationList,OAuthClientAuthorizationList> function;

    public DoneableOAuthClientAuthorizationList(io.fabric8.kubernetes.api.builder.Function<OAuthClientAuthorizationList,OAuthClientAuthorizationList> function){
            super();this.builder=new OAuthClientAuthorizationListBuilder(this);this.function=function;
    }
    public DoneableOAuthClientAuthorizationList(OAuthClientAuthorizationList item,io.fabric8.kubernetes.api.builder.Function<OAuthClientAuthorizationList,OAuthClientAuthorizationList> function){
            super(item);this.builder=new OAuthClientAuthorizationListBuilder(this, item);this.function=function;
    }
    public DoneableOAuthClientAuthorizationList(OAuthClientAuthorizationList item){
            super(item);this.builder=new OAuthClientAuthorizationListBuilder(this, item);this.function=new Function<OAuthClientAuthorizationList, OAuthClientAuthorizationList>() {
    public OAuthClientAuthorizationList apply(OAuthClientAuthorizationList item) {
        return item;
    }
}
;
    }

    public OAuthClientAuthorizationList done(){
             return function.apply(builder.build());
    }




}
