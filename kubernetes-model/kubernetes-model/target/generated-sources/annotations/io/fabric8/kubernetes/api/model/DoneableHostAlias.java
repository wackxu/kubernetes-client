package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHostAlias extends HostAliasFluentImpl<DoneableHostAlias> implements Doneable<HostAlias>{

    private final HostAliasBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HostAlias,HostAlias> function;

    public DoneableHostAlias(io.fabric8.kubernetes.api.builder.Function<HostAlias,HostAlias> function){
            super();this.builder=new HostAliasBuilder(this);this.function=function;
    }
    public DoneableHostAlias(HostAlias item,io.fabric8.kubernetes.api.builder.Function<HostAlias,HostAlias> function){
            super(item);this.builder=new HostAliasBuilder(this, item);this.function=function;
    }
    public DoneableHostAlias(HostAlias item){
            super(item);this.builder=new HostAliasBuilder(this, item);this.function=new Function<HostAlias, HostAlias>() {
    public HostAlias apply(HostAlias item) {
        return item;
    }
}
;
    }

    public HostAlias done(){
             return function.apply(builder.build());
    }




}
