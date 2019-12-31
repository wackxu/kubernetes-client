package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableServicePort extends ServicePortFluentImpl<DoneableServicePort> implements Doneable<ServicePort>{

    private final ServicePortBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServicePort,ServicePort> function;

    public DoneableServicePort(io.fabric8.kubernetes.api.builder.Function<ServicePort,ServicePort> function){
            super();this.builder=new ServicePortBuilder(this);this.function=function;
    }
    public DoneableServicePort(ServicePort item,io.fabric8.kubernetes.api.builder.Function<ServicePort,ServicePort> function){
            super(item);this.builder=new ServicePortBuilder(this, item);this.function=function;
    }
    public DoneableServicePort(ServicePort item){
            super(item);this.builder=new ServicePortBuilder(this, item);this.function=new Function<ServicePort, ServicePort>() {
    public ServicePort apply(ServicePort item) {
        return item;
    }
}
;
    }

    public ServicePort done(){
             return function.apply(builder.build());
    }




}
