package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOAuthClientList extends OAuthClientListFluentImpl<DoneableOAuthClientList> implements Doneable<OAuthClientList>{

    private final OAuthClientListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OAuthClientList,OAuthClientList> function;

    public DoneableOAuthClientList(io.fabric8.kubernetes.api.builder.Function<OAuthClientList,OAuthClientList> function){
            super();this.builder=new OAuthClientListBuilder(this);this.function=function;
    }
    public DoneableOAuthClientList(OAuthClientList item,io.fabric8.kubernetes.api.builder.Function<OAuthClientList,OAuthClientList> function){
            super(item);this.builder=new OAuthClientListBuilder(this, item);this.function=function;
    }
    public DoneableOAuthClientList(OAuthClientList item){
            super(item);this.builder=new OAuthClientListBuilder(this, item);this.function=new Function<OAuthClientList, OAuthClientList>() {
    public OAuthClientList apply(OAuthClientList item) {
        return item;
    }
}
;
    }

    public OAuthClientList done(){
             return function.apply(builder.build());
    }




}
