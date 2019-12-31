package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableServiceReference extends io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceFluentImpl<DoneableServiceReference> implements Doneable<io.fabric8.kubernetes.api.model.apiextensions.ServiceReference>{

    private final io.fabric8.kubernetes.api.model.apiextensions.ServiceReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.apiextensions.ServiceReference,io.fabric8.kubernetes.api.model.apiextensions.ServiceReference> function;

    public DoneableServiceReference(io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.apiextensions.ServiceReference,io.fabric8.kubernetes.api.model.apiextensions.ServiceReference> function){
            super();this.builder=new ServiceReferenceBuilder(this);this.function=function;
    }
    public DoneableServiceReference(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.apiextensions.ServiceReference,io.fabric8.kubernetes.api.model.apiextensions.ServiceReference> function){
            super(item);this.builder=new ServiceReferenceBuilder(this, item);this.function=function;
    }
    public DoneableServiceReference(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item){
            super(item);this.builder=new ServiceReferenceBuilder(this, item);this.function=new Function<io.fabric8.kubernetes.api.model.apiextensions.ServiceReference, io.fabric8.kubernetes.api.model.apiextensions.ServiceReference>() {
    public io.fabric8.kubernetes.api.model.apiextensions.ServiceReference apply(io.fabric8.kubernetes.api.model.apiextensions.ServiceReference item) {
        return item;
    }
}
;
    }

    public io.fabric8.kubernetes.api.model.apiextensions.ServiceReference done(){
             return function.apply(builder.build());
    }




}
