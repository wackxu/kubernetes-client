package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePatch extends PatchFluentImpl<DoneablePatch> implements Doneable<Patch>{

    private final PatchBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Patch,Patch> function;

    public DoneablePatch(io.fabric8.kubernetes.api.builder.Function<Patch,Patch> function){
            super();this.builder=new PatchBuilder(this);this.function=function;
    }
    public DoneablePatch(Patch item,io.fabric8.kubernetes.api.builder.Function<Patch,Patch> function){
            super(item);this.builder=new PatchBuilder(this, item);this.function=function;
    }
    public DoneablePatch(Patch item){
            super(item);this.builder=new PatchBuilder(this, item);this.function=new Function<Patch, Patch>() {
    public Patch apply(Patch item) {
        return item;
    }
}
;
    }

    public Patch done(){
             return function.apply(builder.build());
    }




}
