package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableServiceStatus extends ServiceStatusFluentImpl<DoneableServiceStatus> implements Doneable<ServiceStatus>{

    private final ServiceStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceStatus,ServiceStatus> function;

    public DoneableServiceStatus(io.fabric8.kubernetes.api.builder.Function<ServiceStatus,ServiceStatus> function){
            super();this.builder=new ServiceStatusBuilder(this);this.function=function;
    }
    public DoneableServiceStatus(ServiceStatus item,io.fabric8.kubernetes.api.builder.Function<ServiceStatus,ServiceStatus> function){
            super(item);this.builder=new ServiceStatusBuilder(this, item);this.function=function;
    }
    public DoneableServiceStatus(ServiceStatus item){
            super(item);this.builder=new ServiceStatusBuilder(this, item);this.function=new Function<ServiceStatus, ServiceStatus>() {
    public ServiceStatus apply(ServiceStatus item) {
        return item;
    }
}
;
    }

    public ServiceStatus done(){
             return function.apply(builder.build());
    }




}
