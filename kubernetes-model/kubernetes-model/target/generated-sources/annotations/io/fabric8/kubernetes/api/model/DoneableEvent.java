package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEvent extends EventFluentImpl<DoneableEvent> implements Doneable<Event>{

    private final EventBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Event,Event> function;

    public DoneableEvent(io.fabric8.kubernetes.api.builder.Function<Event,Event> function){
            super();this.builder=new EventBuilder(this);this.function=function;
    }
    public DoneableEvent(Event item,io.fabric8.kubernetes.api.builder.Function<Event,Event> function){
            super(item);this.builder=new EventBuilder(this, item);this.function=function;
    }
    public DoneableEvent(Event item){
            super(item);this.builder=new EventBuilder(this, item);this.function=new Function<Event, Event>() {
    public Event apply(Event item) {
        return item;
    }
}
;
    }

    public Event done(){
             return function.apply(builder.build());
    }




}
