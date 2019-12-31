package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableStatusCause extends StatusCauseFluentImpl<DoneableStatusCause> implements Doneable<StatusCause>{

    private final StatusCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatusCause,StatusCause> function;

    public DoneableStatusCause(io.fabric8.kubernetes.api.builder.Function<StatusCause,StatusCause> function){
            super();this.builder=new StatusCauseBuilder(this);this.function=function;
    }
    public DoneableStatusCause(StatusCause item,io.fabric8.kubernetes.api.builder.Function<StatusCause,StatusCause> function){
            super(item);this.builder=new StatusCauseBuilder(this, item);this.function=function;
    }
    public DoneableStatusCause(StatusCause item){
            super(item);this.builder=new StatusCauseBuilder(this, item);this.function=new Function<StatusCause, StatusCause>() {
    public StatusCause apply(StatusCause item) {
        return item;
    }
}
;
    }

    public StatusCause done(){
             return function.apply(builder.build());
    }




}
