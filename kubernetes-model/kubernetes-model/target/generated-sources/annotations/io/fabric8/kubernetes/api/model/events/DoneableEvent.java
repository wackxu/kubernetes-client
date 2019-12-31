package io.fabric8.kubernetes.api.model.events;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableEvent extends io.fabric8.kubernetes.api.model.events.EventFluentImpl<DoneableEvent> implements Doneable<io.fabric8.kubernetes.api.model.events.Event>{

    private final io.fabric8.kubernetes.api.model.events.EventBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.events.Event,io.fabric8.kubernetes.api.model.events.Event> function;

    public DoneableEvent(io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.events.Event,io.fabric8.kubernetes.api.model.events.Event> function){
            super();this.builder=new EventBuilder(this);this.function=function;
    }
    public DoneableEvent(io.fabric8.kubernetes.api.model.events.Event item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.events.Event,io.fabric8.kubernetes.api.model.events.Event> function){
            super(item);this.builder=new EventBuilder(this, item);this.function=function;
    }
    public DoneableEvent(io.fabric8.kubernetes.api.model.events.Event item){
            super(item);this.builder=new EventBuilder(this, item);this.function=new Function<io.fabric8.kubernetes.api.model.events.Event, io.fabric8.kubernetes.api.model.events.Event>() {
    public io.fabric8.kubernetes.api.model.events.Event apply(io.fabric8.kubernetes.api.model.events.Event item) {
        return item;
    }
}
;
    }

    public io.fabric8.kubernetes.api.model.events.Event done(){
             return function.apply(builder.build());
    }




}
