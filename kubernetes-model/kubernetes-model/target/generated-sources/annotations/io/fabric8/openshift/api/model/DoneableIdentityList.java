package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIdentityList extends IdentityListFluentImpl<DoneableIdentityList> implements Doneable<IdentityList>{

    private final IdentityListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IdentityList,IdentityList> function;

    public DoneableIdentityList(io.fabric8.kubernetes.api.builder.Function<IdentityList,IdentityList> function){
            super();this.builder=new IdentityListBuilder(this);this.function=function;
    }
    public DoneableIdentityList(IdentityList item,io.fabric8.kubernetes.api.builder.Function<IdentityList,IdentityList> function){
            super(item);this.builder=new IdentityListBuilder(this, item);this.function=function;
    }
    public DoneableIdentityList(IdentityList item){
            super(item);this.builder=new IdentityListBuilder(this, item);this.function=new Function<IdentityList, IdentityList>() {
    public IdentityList apply(IdentityList item) {
        return item;
    }
}
;
    }

    public IdentityList done(){
             return function.apply(builder.build());
    }




}
