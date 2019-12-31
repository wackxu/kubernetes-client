package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIdentity extends IdentityFluentImpl<DoneableIdentity> implements Doneable<Identity>{

    private final IdentityBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Identity,Identity> function;

    public DoneableIdentity(io.fabric8.kubernetes.api.builder.Function<Identity,Identity> function){
            super();this.builder=new IdentityBuilder(this);this.function=function;
    }
    public DoneableIdentity(Identity item,io.fabric8.kubernetes.api.builder.Function<Identity,Identity> function){
            super(item);this.builder=new IdentityBuilder(this, item);this.function=function;
    }
    public DoneableIdentity(Identity item){
            super(item);this.builder=new IdentityBuilder(this, item);this.function=new Function<Identity, Identity>() {
    public Identity apply(Identity item) {
        return item;
    }
}
;
    }

    public Identity done(){
             return function.apply(builder.build());
    }




}
