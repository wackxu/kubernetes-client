package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIngressStatus extends IngressStatusFluentImpl<DoneableIngressStatus> implements Doneable<IngressStatus>{

    private final IngressStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IngressStatus,IngressStatus> function;

    public DoneableIngressStatus(io.fabric8.kubernetes.api.builder.Function<IngressStatus,IngressStatus> function){
            super();this.builder=new IngressStatusBuilder(this);this.function=function;
    }
    public DoneableIngressStatus(IngressStatus item,io.fabric8.kubernetes.api.builder.Function<IngressStatus,IngressStatus> function){
            super(item);this.builder=new IngressStatusBuilder(this, item);this.function=function;
    }
    public DoneableIngressStatus(IngressStatus item){
            super(item);this.builder=new IngressStatusBuilder(this, item);this.function=new Function<IngressStatus, IngressStatus>() {
    public IngressStatus apply(IngressStatus item) {
        return item;
    }
}
;
    }

    public IngressStatus done(){
             return function.apply(builder.build());
    }




}
