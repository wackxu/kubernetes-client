package io.fabric8.kubernetes.api.model.events;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableEventSeries extends io.fabric8.kubernetes.api.model.events.EventSeriesFluentImpl<DoneableEventSeries> implements Doneable<io.fabric8.kubernetes.api.model.events.EventSeries>{

    private final io.fabric8.kubernetes.api.model.events.EventSeriesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.events.EventSeries,io.fabric8.kubernetes.api.model.events.EventSeries> function;

    public DoneableEventSeries(io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.events.EventSeries,io.fabric8.kubernetes.api.model.events.EventSeries> function){
            super();this.builder=new EventSeriesBuilder(this);this.function=function;
    }
    public DoneableEventSeries(io.fabric8.kubernetes.api.model.events.EventSeries item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.events.EventSeries,io.fabric8.kubernetes.api.model.events.EventSeries> function){
            super(item);this.builder=new EventSeriesBuilder(this, item);this.function=function;
    }
    public DoneableEventSeries(io.fabric8.kubernetes.api.model.events.EventSeries item){
            super(item);this.builder=new EventSeriesBuilder(this, item);this.function=new Function<io.fabric8.kubernetes.api.model.events.EventSeries, io.fabric8.kubernetes.api.model.events.EventSeries>() {
    public io.fabric8.kubernetes.api.model.events.EventSeries apply(io.fabric8.kubernetes.api.model.events.EventSeries item) {
        return item;
    }
}
;
    }

    public io.fabric8.kubernetes.api.model.events.EventSeries done(){
             return function.apply(builder.build());
    }




}
