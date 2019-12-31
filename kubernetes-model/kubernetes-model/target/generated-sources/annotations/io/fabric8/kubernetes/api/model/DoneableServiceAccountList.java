package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableServiceAccountList extends ServiceAccountListFluentImpl<DoneableServiceAccountList> implements Doneable<ServiceAccountList>{

    private final ServiceAccountListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceAccountList,ServiceAccountList> function;

    public DoneableServiceAccountList(io.fabric8.kubernetes.api.builder.Function<ServiceAccountList,ServiceAccountList> function){
            super();this.builder=new ServiceAccountListBuilder(this);this.function=function;
    }
    public DoneableServiceAccountList(ServiceAccountList item,io.fabric8.kubernetes.api.builder.Function<ServiceAccountList,ServiceAccountList> function){
            super(item);this.builder=new ServiceAccountListBuilder(this, item);this.function=function;
    }
    public DoneableServiceAccountList(ServiceAccountList item){
            super(item);this.builder=new ServiceAccountListBuilder(this, item);this.function=new Function<ServiceAccountList, ServiceAccountList>() {
    public ServiceAccountList apply(ServiceAccountList item) {
        return item;
    }
}
;
    }

    public ServiceAccountList done(){
             return function.apply(builder.build());
    }




}
