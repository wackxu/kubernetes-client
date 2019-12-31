package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableServiceAccountTokenProjection extends ServiceAccountTokenProjectionFluentImpl<DoneableServiceAccountTokenProjection> implements Doneable<ServiceAccountTokenProjection>{

    private final ServiceAccountTokenProjectionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceAccountTokenProjection,ServiceAccountTokenProjection> function;

    public DoneableServiceAccountTokenProjection(io.fabric8.kubernetes.api.builder.Function<ServiceAccountTokenProjection,ServiceAccountTokenProjection> function){
            super();this.builder=new ServiceAccountTokenProjectionBuilder(this);this.function=function;
    }
    public DoneableServiceAccountTokenProjection(ServiceAccountTokenProjection item,io.fabric8.kubernetes.api.builder.Function<ServiceAccountTokenProjection,ServiceAccountTokenProjection> function){
            super(item);this.builder=new ServiceAccountTokenProjectionBuilder(this, item);this.function=function;
    }
    public DoneableServiceAccountTokenProjection(ServiceAccountTokenProjection item){
            super(item);this.builder=new ServiceAccountTokenProjectionBuilder(this, item);this.function=new Function<ServiceAccountTokenProjection, ServiceAccountTokenProjection>() {
    public ServiceAccountTokenProjection apply(ServiceAccountTokenProjection item) {
        return item;
    }
}
;
    }

    public ServiceAccountTokenProjection done(){
             return function.apply(builder.build());
    }




}
