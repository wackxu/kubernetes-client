package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIngressSpec extends IngressSpecFluentImpl<DoneableIngressSpec> implements Doneable<IngressSpec>{

    private final IngressSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IngressSpec,IngressSpec> function;

    public DoneableIngressSpec(io.fabric8.kubernetes.api.builder.Function<IngressSpec,IngressSpec> function){
            super();this.builder=new IngressSpecBuilder(this);this.function=function;
    }
    public DoneableIngressSpec(IngressSpec item,io.fabric8.kubernetes.api.builder.Function<IngressSpec,IngressSpec> function){
            super(item);this.builder=new IngressSpecBuilder(this, item);this.function=function;
    }
    public DoneableIngressSpec(IngressSpec item){
            super(item);this.builder=new IngressSpecBuilder(this, item);this.function=new Function<IngressSpec, IngressSpec>() {
    public IngressSpec apply(IngressSpec item) {
        return item;
    }
}
;
    }

    public IngressSpec done(){
             return function.apply(builder.build());
    }




}
