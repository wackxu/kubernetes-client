package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEventSeries extends EventSeriesFluentImpl<DoneableEventSeries> implements Doneable<EventSeries>{

    private final EventSeriesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EventSeries,EventSeries> function;

    public DoneableEventSeries(io.fabric8.kubernetes.api.builder.Function<EventSeries,EventSeries> function){
            super();this.builder=new EventSeriesBuilder(this);this.function=function;
    }
    public DoneableEventSeries(EventSeries item,io.fabric8.kubernetes.api.builder.Function<EventSeries,EventSeries> function){
            super(item);this.builder=new EventSeriesBuilder(this, item);this.function=function;
    }
    public DoneableEventSeries(EventSeries item){
            super(item);this.builder=new EventSeriesBuilder(this, item);this.function=new Function<EventSeries, EventSeries>() {
    public EventSeries apply(EventSeries item) {
        return item;
    }
}
;
    }

    public EventSeries done(){
             return function.apply(builder.build());
    }




}
