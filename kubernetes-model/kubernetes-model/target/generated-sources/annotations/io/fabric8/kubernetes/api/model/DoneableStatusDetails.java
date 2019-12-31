package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableStatusDetails extends StatusDetailsFluentImpl<DoneableStatusDetails> implements Doneable<StatusDetails>{

    private final StatusDetailsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatusDetails,StatusDetails> function;

    public DoneableStatusDetails(io.fabric8.kubernetes.api.builder.Function<StatusDetails,StatusDetails> function){
            super();this.builder=new StatusDetailsBuilder(this);this.function=function;
    }
    public DoneableStatusDetails(StatusDetails item,io.fabric8.kubernetes.api.builder.Function<StatusDetails,StatusDetails> function){
            super(item);this.builder=new StatusDetailsBuilder(this, item);this.function=function;
    }
    public DoneableStatusDetails(StatusDetails item){
            super(item);this.builder=new StatusDetailsBuilder(this, item);this.function=new Function<StatusDetails, StatusDetails>() {
    public StatusDetails apply(StatusDetails item) {
        return item;
    }
}
;
    }

    public StatusDetails done(){
             return function.apply(builder.build());
    }




}
