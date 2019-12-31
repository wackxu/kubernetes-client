package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableQuantity extends QuantityFluentImpl<DoneableQuantity> implements Doneable<Quantity>{

    private final QuantityBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Quantity,Quantity> function;

    public DoneableQuantity(io.fabric8.kubernetes.api.builder.Function<Quantity,Quantity> function){
            super();this.builder=new QuantityBuilder(this);this.function=function;
    }
    public DoneableQuantity(Quantity item,io.fabric8.kubernetes.api.builder.Function<Quantity,Quantity> function){
            super(item);this.builder=new QuantityBuilder(this, item);this.function=function;
    }
    public DoneableQuantity(Quantity item){
            super(item);this.builder=new QuantityBuilder(this, item);this.function=new Function<Quantity, Quantity>() {
    public Quantity apply(Quantity item) {
        return item;
    }
}
;
    }

    public Quantity done(){
             return function.apply(builder.build());
    }




}
