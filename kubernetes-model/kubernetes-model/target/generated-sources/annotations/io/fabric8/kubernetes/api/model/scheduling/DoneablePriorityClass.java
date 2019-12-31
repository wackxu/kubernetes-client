package io.fabric8.kubernetes.api.model.scheduling;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePriorityClass extends PriorityClassFluentImpl<DoneablePriorityClass> implements Doneable<PriorityClass>{

    private final PriorityClassBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PriorityClass,PriorityClass> function;

    public DoneablePriorityClass(io.fabric8.kubernetes.api.builder.Function<PriorityClass,PriorityClass> function){
            super();this.builder=new PriorityClassBuilder(this);this.function=function;
    }
    public DoneablePriorityClass(PriorityClass item,io.fabric8.kubernetes.api.builder.Function<PriorityClass,PriorityClass> function){
            super(item);this.builder=new PriorityClassBuilder(this, item);this.function=function;
    }
    public DoneablePriorityClass(PriorityClass item){
            super(item);this.builder=new PriorityClassBuilder(this, item);this.function=new Function<PriorityClass, PriorityClass>() {
    public PriorityClass apply(PriorityClass item) {
        return item;
    }
}
;
    }

    public PriorityClass done(){
             return function.apply(builder.build());
    }




}
