package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableToleration extends TolerationFluentImpl<DoneableToleration> implements Doneable<Toleration>{

    private final TolerationBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Toleration,Toleration> function;

    public DoneableToleration(io.fabric8.kubernetes.api.builder.Function<Toleration,Toleration> function){
            super();this.builder=new TolerationBuilder(this);this.function=function;
    }
    public DoneableToleration(Toleration item,io.fabric8.kubernetes.api.builder.Function<Toleration,Toleration> function){
            super(item);this.builder=new TolerationBuilder(this, item);this.function=function;
    }
    public DoneableToleration(Toleration item){
            super(item);this.builder=new TolerationBuilder(this, item);this.function=new Function<Toleration, Toleration>() {
    public Toleration apply(Toleration item) {
        return item;
    }
}
;
    }

    public Toleration done(){
             return function.apply(builder.build());
    }




}
