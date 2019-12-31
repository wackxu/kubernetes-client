package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthAuthorizeTokenList extends OAuthAuthorizeTokenListFluentImpl<DoneableOAuthAuthorizeTokenList> implements Doneable<OAuthAuthorizeTokenList>{

    private final OAuthAuthorizeTokenListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthAuthorizeTokenList,OAuthAuthorizeTokenList> function;

    public DoneableOAuthAuthorizeTokenList(io.fabric8.kubernetes.api.builder.Function<OAuthAuthorizeTokenList,OAuthAuthorizeTokenList> function){
            super();this.builder=new OAuthAuthorizeTokenListBuilder(this);this.function=function;
    }
    public DoneableOAuthAuthorizeTokenList(OAuthAuthorizeTokenList item,io.fabric8.kubernetes.api.builder.Function<OAuthAuthorizeTokenList,OAuthAuthorizeTokenList> function){
            super(item);this.builder=new OAuthAuthorizeTokenListBuilder(this, item);this.function=function;
    }
    public DoneableOAuthAuthorizeTokenList(OAuthAuthorizeTokenList item){
            super(item);this.builder=new OAuthAuthorizeTokenListBuilder(this, item);this.function=new Function<OAuthAuthorizeTokenList, OAuthAuthorizeTokenList>() {
    public OAuthAuthorizeTokenList apply(OAuthAuthorizeTokenList item) {
        return item;
    }
}
;
    }

    public OAuthAuthorizeTokenList done(){
             return function.apply(builder.build());
    }




}
