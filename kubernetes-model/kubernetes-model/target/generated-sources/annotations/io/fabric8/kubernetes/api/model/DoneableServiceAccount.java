package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableServiceAccount extends ServiceAccountFluentImpl<DoneableServiceAccount> implements Doneable<ServiceAccount>{

    private final ServiceAccountBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceAccount,ServiceAccount> function;

    public DoneableServiceAccount(io.fabric8.kubernetes.api.builder.Function<ServiceAccount,ServiceAccount> function){
            super();this.builder=new ServiceAccountBuilder(this);this.function=function;
    }
    public DoneableServiceAccount(ServiceAccount item,io.fabric8.kubernetes.api.builder.Function<ServiceAccount,ServiceAccount> function){
            super(item);this.builder=new ServiceAccountBuilder(this, item);this.function=function;
    }
    public DoneableServiceAccount(ServiceAccount item){
            super(item);this.builder=new ServiceAccountBuilder(this, item);this.function=new Function<ServiceAccount, ServiceAccount>() {
    public ServiceAccount apply(ServiceAccount item) {
        return item;
    }
}
;
    }

    public ServiceAccount done(){
             return function.apply(builder.build());
    }




}
