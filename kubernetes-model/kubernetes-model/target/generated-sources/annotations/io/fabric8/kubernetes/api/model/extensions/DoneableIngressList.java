package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIngressList extends IngressListFluentImpl<DoneableIngressList> implements Doneable<IngressList>{

    private final IngressListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IngressList,IngressList> function;

    public DoneableIngressList(io.fabric8.kubernetes.api.builder.Function<IngressList,IngressList> function){
            super();this.builder=new IngressListBuilder(this);this.function=function;
    }
    public DoneableIngressList(IngressList item,io.fabric8.kubernetes.api.builder.Function<IngressList,IngressList> function){
            super(item);this.builder=new IngressListBuilder(this, item);this.function=function;
    }
    public DoneableIngressList(IngressList item){
            super(item);this.builder=new IngressListBuilder(this, item);this.function=new Function<IngressList, IngressList>() {
    public IngressList apply(IngressList item) {
        return item;
    }
}
;
    }

    public IngressList done(){
             return function.apply(builder.build());
    }




}
