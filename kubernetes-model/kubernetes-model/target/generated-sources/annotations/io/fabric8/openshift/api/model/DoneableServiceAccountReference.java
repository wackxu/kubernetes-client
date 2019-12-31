package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableServiceAccountReference extends ServiceAccountReferenceFluentImpl<DoneableServiceAccountReference> implements Doneable<ServiceAccountReference>{

    private final ServiceAccountReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceAccountReference,ServiceAccountReference> function;

    public DoneableServiceAccountReference(io.fabric8.kubernetes.api.builder.Function<ServiceAccountReference,ServiceAccountReference> function){
            super();this.builder=new ServiceAccountReferenceBuilder(this);this.function=function;
    }
    public DoneableServiceAccountReference(ServiceAccountReference item,io.fabric8.kubernetes.api.builder.Function<ServiceAccountReference,ServiceAccountReference> function){
            super(item);this.builder=new ServiceAccountReferenceBuilder(this, item);this.function=function;
    }
    public DoneableServiceAccountReference(ServiceAccountReference item){
            super(item);this.builder=new ServiceAccountReferenceBuilder(this, item);this.function=new Function<ServiceAccountReference, ServiceAccountReference>() {
    public ServiceAccountReference apply(ServiceAccountReference item) {
        return item;
    }
}
;
    }

    public ServiceAccountReference done(){
             return function.apply(builder.build());
    }




}
