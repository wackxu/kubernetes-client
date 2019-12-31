package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableServiceList extends ServiceListFluentImpl<DoneableServiceList> implements Doneable<ServiceList>{

    private final ServiceListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceList,ServiceList> function;

    public DoneableServiceList(io.fabric8.kubernetes.api.builder.Function<ServiceList,ServiceList> function){
            super();this.builder=new ServiceListBuilder(this);this.function=function;
    }
    public DoneableServiceList(ServiceList item,io.fabric8.kubernetes.api.builder.Function<ServiceList,ServiceList> function){
            super(item);this.builder=new ServiceListBuilder(this, item);this.function=function;
    }
    public DoneableServiceList(ServiceList item){
            super(item);this.builder=new ServiceListBuilder(this, item);this.function=new Function<ServiceList, ServiceList>() {
    public ServiceList apply(ServiceList item) {
        return item;
    }
}
;
    }

    public ServiceList done(){
             return function.apply(builder.build());
    }




}
