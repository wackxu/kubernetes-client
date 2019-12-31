package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthAccessTokenList extends OAuthAccessTokenListFluentImpl<DoneableOAuthAccessTokenList> implements Doneable<OAuthAccessTokenList>{

    private final OAuthAccessTokenListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthAccessTokenList,OAuthAccessTokenList> function;

    public DoneableOAuthAccessTokenList(io.fabric8.kubernetes.api.builder.Function<OAuthAccessTokenList,OAuthAccessTokenList> function){
            super();this.builder=new OAuthAccessTokenListBuilder(this);this.function=function;
    }
    public DoneableOAuthAccessTokenList(OAuthAccessTokenList item,io.fabric8.kubernetes.api.builder.Function<OAuthAccessTokenList,OAuthAccessTokenList> function){
            super(item);this.builder=new OAuthAccessTokenListBuilder(this, item);this.function=function;
    }
    public DoneableOAuthAccessTokenList(OAuthAccessTokenList item){
            super(item);this.builder=new OAuthAccessTokenListBuilder(this, item);this.function=new Function<OAuthAccessTokenList, OAuthAccessTokenList>() {
    public OAuthAccessTokenList apply(OAuthAccessTokenList item) {
        return item;
    }
}
;
    }

    public OAuthAccessTokenList done(){
             return function.apply(builder.build());
    }




}
