package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIngressBackend extends IngressBackendFluentImpl<DoneableIngressBackend> implements Doneable<IngressBackend>{

    private final IngressBackendBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IngressBackend,IngressBackend> function;

    public DoneableIngressBackend(io.fabric8.kubernetes.api.builder.Function<IngressBackend,IngressBackend> function){
            super();this.builder=new IngressBackendBuilder(this);this.function=function;
    }
    public DoneableIngressBackend(IngressBackend item,io.fabric8.kubernetes.api.builder.Function<IngressBackend,IngressBackend> function){
            super(item);this.builder=new IngressBackendBuilder(this, item);this.function=function;
    }
    public DoneableIngressBackend(IngressBackend item){
            super(item);this.builder=new IngressBackendBuilder(this, item);this.function=new Function<IngressBackend, IngressBackend>() {
    public IngressBackend apply(IngressBackend item) {
        return item;
    }
}
;
    }

    public IngressBackend done(){
             return function.apply(builder.build());
    }




}
