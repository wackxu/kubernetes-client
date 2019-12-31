package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEventList extends EventListFluentImpl<DoneableEventList> implements Doneable<EventList>{

    private final EventListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EventList,EventList> function;

    public DoneableEventList(io.fabric8.kubernetes.api.builder.Function<EventList,EventList> function){
            super();this.builder=new EventListBuilder(this);this.function=function;
    }
    public DoneableEventList(EventList item,io.fabric8.kubernetes.api.builder.Function<EventList,EventList> function){
            super(item);this.builder=new EventListBuilder(this, item);this.function=function;
    }
    public DoneableEventList(EventList item){
            super(item);this.builder=new EventListBuilder(this, item);this.function=new Function<EventList, EventList>() {
    public EventList apply(EventList item) {
        return item;
    }
}
;
    }

    public EventList done(){
             return function.apply(builder.build());
    }




}
