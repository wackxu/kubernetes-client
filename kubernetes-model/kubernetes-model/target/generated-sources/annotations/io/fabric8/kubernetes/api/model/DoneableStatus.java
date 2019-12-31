package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableStatus extends StatusFluentImpl<DoneableStatus> implements Doneable<Status>{

    private final StatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Status,Status> function;

    public DoneableStatus(io.fabric8.kubernetes.api.builder.Function<Status,Status> function){
            super();this.builder=new StatusBuilder(this);this.function=function;
    }
    public DoneableStatus(Status item,io.fabric8.kubernetes.api.builder.Function<Status,Status> function){
            super(item);this.builder=new StatusBuilder(this, item);this.function=function;
    }
    public DoneableStatus(Status item){
            super(item);this.builder=new StatusBuilder(this, item);this.function=new Function<Status, Status>() {
    public Status apply(Status item) {
        return item;
    }
}
;
    }

    public Status done(){
             return function.apply(builder.build());
    }




}
