package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableDeleteOptions extends DeleteOptionsFluentImpl<DoneableDeleteOptions> implements Doneable<DeleteOptions>{

    private final DeleteOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeleteOptions,DeleteOptions> function;

    public DoneableDeleteOptions(io.fabric8.kubernetes.api.builder.Function<DeleteOptions,DeleteOptions> function){
            super();this.builder=new DeleteOptionsBuilder(this);this.function=function;
    }
    public DoneableDeleteOptions(DeleteOptions item,io.fabric8.kubernetes.api.builder.Function<DeleteOptions,DeleteOptions> function){
            super(item);this.builder=new DeleteOptionsBuilder(this, item);this.function=function;
    }
    public DoneableDeleteOptions(DeleteOptions item){
            super(item);this.builder=new DeleteOptionsBuilder(this, item);this.function=new Function<DeleteOptions, DeleteOptions>() {
    public DeleteOptions apply(DeleteOptions item) {
        return item;
    }
}
;
    }

    public DeleteOptions done(){
             return function.apply(builder.build());
    }




}
