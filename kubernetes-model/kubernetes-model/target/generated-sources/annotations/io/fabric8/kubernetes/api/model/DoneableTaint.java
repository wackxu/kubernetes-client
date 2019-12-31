package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableTaint extends TaintFluentImpl<DoneableTaint> implements Doneable<Taint>{

    private final TaintBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Taint,Taint> function;

    public DoneableTaint(io.fabric8.kubernetes.api.builder.Function<Taint,Taint> function){
            super();this.builder=new TaintBuilder(this);this.function=function;
    }
    public DoneableTaint(Taint item,io.fabric8.kubernetes.api.builder.Function<Taint,Taint> function){
            super(item);this.builder=new TaintBuilder(this, item);this.function=function;
    }
    public DoneableTaint(Taint item){
            super(item);this.builder=new TaintBuilder(this, item);this.function=new Function<Taint, Taint>() {
    public Taint apply(Taint item) {
        return item;
    }
}
;
    }

    public Taint done(){
             return function.apply(builder.build());
    }




}
