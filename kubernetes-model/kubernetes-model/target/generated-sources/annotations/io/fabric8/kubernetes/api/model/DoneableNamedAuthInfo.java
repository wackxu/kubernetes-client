package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamedAuthInfo extends NamedAuthInfoFluentImpl<DoneableNamedAuthInfo> implements Doneable<NamedAuthInfo>{

    private final NamedAuthInfoBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamedAuthInfo,NamedAuthInfo> function;

    public DoneableNamedAuthInfo(io.fabric8.kubernetes.api.builder.Function<NamedAuthInfo,NamedAuthInfo> function){
            super();this.builder=new NamedAuthInfoBuilder(this);this.function=function;
    }
    public DoneableNamedAuthInfo(NamedAuthInfo item,io.fabric8.kubernetes.api.builder.Function<NamedAuthInfo,NamedAuthInfo> function){
            super(item);this.builder=new NamedAuthInfoBuilder(this, item);this.function=function;
    }
    public DoneableNamedAuthInfo(NamedAuthInfo item){
            super(item);this.builder=new NamedAuthInfoBuilder(this, item);this.function=new Function<NamedAuthInfo, NamedAuthInfo>() {
    public NamedAuthInfo apply(NamedAuthInfo item) {
        return item;
    }
}
;
    }

    public NamedAuthInfo done(){
             return function.apply(builder.build());
    }




}
