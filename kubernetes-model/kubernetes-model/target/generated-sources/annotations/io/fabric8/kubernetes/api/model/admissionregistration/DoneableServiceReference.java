package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableServiceReference extends ServiceReferenceFluentImpl<DoneableServiceReference> implements Doneable<ServiceReference>{

    private final ServiceReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceReference,ServiceReference> function;

    public DoneableServiceReference(io.fabric8.kubernetes.api.builder.Function<ServiceReference,ServiceReference> function){
            super();this.builder=new ServiceReferenceBuilder(this);this.function=function;
    }
    public DoneableServiceReference(ServiceReference item,io.fabric8.kubernetes.api.builder.Function<ServiceReference,ServiceReference> function){
            super(item);this.builder=new ServiceReferenceBuilder(this, item);this.function=function;
    }
    public DoneableServiceReference(ServiceReference item){
            super(item);this.builder=new ServiceReferenceBuilder(this, item);this.function=new Function<ServiceReference, ServiceReference>() {
    public ServiceReference apply(ServiceReference item) {
        return item;
    }
}
;
    }

    public ServiceReference done(){
             return function.apply(builder.build());
    }




}
