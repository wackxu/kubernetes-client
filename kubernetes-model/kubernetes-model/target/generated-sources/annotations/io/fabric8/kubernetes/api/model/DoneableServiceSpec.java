package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableServiceSpec extends ServiceSpecFluentImpl<DoneableServiceSpec> implements Doneable<ServiceSpec>{

    private final ServiceSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceSpec,ServiceSpec> function;

    public DoneableServiceSpec(io.fabric8.kubernetes.api.builder.Function<ServiceSpec,ServiceSpec> function){
            super();this.builder=new ServiceSpecBuilder(this);this.function=function;
    }
    public DoneableServiceSpec(ServiceSpec item,io.fabric8.kubernetes.api.builder.Function<ServiceSpec,ServiceSpec> function){
            super(item);this.builder=new ServiceSpecBuilder(this, item);this.function=function;
    }
    public DoneableServiceSpec(ServiceSpec item){
            super(item);this.builder=new ServiceSpecBuilder(this, item);this.function=new Function<ServiceSpec, ServiceSpec>() {
    public ServiceSpec apply(ServiceSpec item) {
        return item;
    }
}
;
    }

    public ServiceSpec done(){
             return function.apply(builder.build());
    }




}
