package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIngress extends IngressFluentImpl<DoneableIngress> implements Doneable<Ingress>{

    private final IngressBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Ingress,Ingress> function;

    public DoneableIngress(io.fabric8.kubernetes.api.builder.Function<Ingress,Ingress> function){
            super();this.builder=new IngressBuilder(this);this.function=function;
    }
    public DoneableIngress(Ingress item,io.fabric8.kubernetes.api.builder.Function<Ingress,Ingress> function){
            super(item);this.builder=new IngressBuilder(this, item);this.function=function;
    }
    public DoneableIngress(Ingress item){
            super(item);this.builder=new IngressBuilder(this, item);this.function=new Function<Ingress, Ingress>() {
    public Ingress apply(Ingress item) {
        return item;
    }
}
;
    }

    public Ingress done(){
             return function.apply(builder.build());
    }




}
