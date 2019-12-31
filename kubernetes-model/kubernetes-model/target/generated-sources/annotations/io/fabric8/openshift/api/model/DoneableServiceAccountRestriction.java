package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableServiceAccountRestriction extends ServiceAccountRestrictionFluentImpl<DoneableServiceAccountRestriction> implements Doneable<ServiceAccountRestriction>{

    private final ServiceAccountRestrictionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceAccountRestriction,ServiceAccountRestriction> function;

    public DoneableServiceAccountRestriction(io.fabric8.kubernetes.api.builder.Function<ServiceAccountRestriction,ServiceAccountRestriction> function){
            super();this.builder=new ServiceAccountRestrictionBuilder(this);this.function=function;
    }
    public DoneableServiceAccountRestriction(ServiceAccountRestriction item,io.fabric8.kubernetes.api.builder.Function<ServiceAccountRestriction,ServiceAccountRestriction> function){
            super(item);this.builder=new ServiceAccountRestrictionBuilder(this, item);this.function=function;
    }
    public DoneableServiceAccountRestriction(ServiceAccountRestriction item){
            super(item);this.builder=new ServiceAccountRestrictionBuilder(this, item);this.function=new Function<ServiceAccountRestriction, ServiceAccountRestriction>() {
    public ServiceAccountRestriction apply(ServiceAccountRestriction item) {
        return item;
    }
}
;
    }

    public ServiceAccountRestriction done(){
             return function.apply(builder.build());
    }




}
