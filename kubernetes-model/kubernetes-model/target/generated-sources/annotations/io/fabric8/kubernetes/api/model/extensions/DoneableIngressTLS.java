package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIngressTLS extends IngressTLSFluentImpl<DoneableIngressTLS> implements Doneable<IngressTLS>{

    private final IngressTLSBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IngressTLS,IngressTLS> function;

    public DoneableIngressTLS(io.fabric8.kubernetes.api.builder.Function<IngressTLS,IngressTLS> function){
            super();this.builder=new IngressTLSBuilder(this);this.function=function;
    }
    public DoneableIngressTLS(IngressTLS item,io.fabric8.kubernetes.api.builder.Function<IngressTLS,IngressTLS> function){
            super(item);this.builder=new IngressTLSBuilder(this, item);this.function=function;
    }
    public DoneableIngressTLS(IngressTLS item){
            super(item);this.builder=new IngressTLSBuilder(this, item);this.function=new Function<IngressTLS, IngressTLS>() {
    public IngressTLS apply(IngressTLS item) {
        return item;
    }
}
;
    }

    public IngressTLS done(){
             return function.apply(builder.build());
    }




}
