package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHandler extends HandlerFluentImpl<DoneableHandler> implements Doneable<Handler>{

    private final HandlerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Handler,Handler> function;

    public DoneableHandler(io.fabric8.kubernetes.api.builder.Function<Handler,Handler> function){
            super();this.builder=new HandlerBuilder(this);this.function=function;
    }
    public DoneableHandler(Handler item,io.fabric8.kubernetes.api.builder.Function<Handler,Handler> function){
            super(item);this.builder=new HandlerBuilder(this, item);this.function=function;
    }
    public DoneableHandler(Handler item){
            super(item);this.builder=new HandlerBuilder(this, item);this.function=new Function<Handler, Handler>() {
    public Handler apply(Handler item) {
        return item;
    }
}
;
    }

    public Handler done(){
             return function.apply(builder.build());
    }




}
