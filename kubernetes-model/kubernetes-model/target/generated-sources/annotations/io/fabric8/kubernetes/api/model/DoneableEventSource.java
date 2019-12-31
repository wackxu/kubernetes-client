package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEventSource extends EventSourceFluentImpl<DoneableEventSource> implements Doneable<EventSource>{

    private final EventSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EventSource,EventSource> function;

    public DoneableEventSource(io.fabric8.kubernetes.api.builder.Function<EventSource,EventSource> function){
            super();this.builder=new EventSourceBuilder(this);this.function=function;
    }
    public DoneableEventSource(EventSource item,io.fabric8.kubernetes.api.builder.Function<EventSource,EventSource> function){
            super(item);this.builder=new EventSourceBuilder(this, item);this.function=function;
    }
    public DoneableEventSource(EventSource item){
            super(item);this.builder=new EventSourceBuilder(this, item);this.function=new Function<EventSource, EventSource>() {
    public EventSource apply(EventSource item) {
        return item;
    }
}
;
    }

    public EventSource done(){
             return function.apply(builder.build());
    }




}
