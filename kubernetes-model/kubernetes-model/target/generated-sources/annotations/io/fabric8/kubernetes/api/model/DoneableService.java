package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableService extends ServiceFluentImpl<DoneableService> implements Doneable<Service>{

    private final ServiceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Service,Service> function;

    public DoneableService(io.fabric8.kubernetes.api.builder.Function<Service,Service> function){
            super();this.builder=new ServiceBuilder(this);this.function=function;
    }
    public DoneableService(Service item,io.fabric8.kubernetes.api.builder.Function<Service,Service> function){
            super(item);this.builder=new ServiceBuilder(this, item);this.function=function;
    }
    public DoneableService(Service item){
            super(item);this.builder=new ServiceBuilder(this, item);this.function=new Function<Service, Service>() {
    public Service apply(Service item) {
        return item;
    }
}
;
    }

    public Service done(){
             return function.apply(builder.build());
    }




}
